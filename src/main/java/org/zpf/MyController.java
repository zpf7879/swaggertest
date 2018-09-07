package org.zpf;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Api(tags = "Rule")
@RestController("myController")
@RequestMapping(value = "/api", produces = "application/json")
public class MyController {

    @ApiOperation(nickname = "listRuleTypes", value = "List all rule types")
    @RequestMapping(value = "/ruleTypes", method = GET)
    public Collection<String> listRuleTypes() {
        Set<String> ruleTypes = new HashSet<>();
        return ruleTypes;
    }
}
