package edu.citytech.financial.service;


import edu.citytech.financial.functions.TaxRule;
import edu.citytech.financial.model.MarginalTaxRule;
import static edu.citytech.financial.utility.EnvironmentVariableUtility.*;
import edu.citytech.financial.utility.ReadFileUtility;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;


@Service
public class MarginalTaxCalculator {

    public static float calculate(final String code, float salary, Consumer<Object> consumer) {

        String fileName =  getVariable("MARGINAL_TAX_RULE");
        List<MarginalTaxRule> list = ReadFileUtility
                .process(fileName
                        , TaxRule::getTaxRule);

        List<MarginalTaxRule>filiterList = list.stream()
                .filter(e -> e.range1() < salary )
                .filter(e -> e.code().equals(code))
                .map(e-> e.range2() > salary
                        ? new MarginalTaxRule(e.rule(),e.taxRate(),e.code(),e.range1(),salary, e.year()) : e)
                .peek(consumer)
                .toList();

        double taxPaid = filiterList.stream().mapToDouble(MarginalTaxRule::calculateTaxPaid).sum();
        return (float)taxPaid;

    }
    public static float calculate(String code, float salary) {

        return calculate(code, salary, e ->{} );
    }
}



