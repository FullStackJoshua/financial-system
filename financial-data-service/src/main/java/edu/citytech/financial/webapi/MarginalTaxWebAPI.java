package edu.citytech.financial.webapi;

import static edu.citytech.financial.service.MarginalTaxCalculator.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/marginalTax")
public class MarginalTaxWebAPI {

    Date date = new Date();
    @GetMapping("/taxPaid")
    public Map<String, Object> get(@RequestParam(value = "code", defaultValue = "S") String code,
                                  @RequestParam(value = "salary", defaultValue = "150000") float salary,
                                   @RequestParam(value = "year", defaultValue = "2023") int year1
    ) {


         List<Object> ruleList = new ArrayList<>();


        float taxPaid = calculate(code, salary,ruleList::add);
        Map<String, Object> map = new HashMap<>();
        map.put( "Date",date);
        map.put( "effectiveTaxRate:",taxPaid/salary);
        map.put("taxPaid", taxPaid);
        map.put( "taxRules",ruleList);
        map.put("year", year1);
        map.put("Developer", "Lim, Joshua");

        return map;
    }
}

//marginalTax/taxPaid?code=S&salary=15000