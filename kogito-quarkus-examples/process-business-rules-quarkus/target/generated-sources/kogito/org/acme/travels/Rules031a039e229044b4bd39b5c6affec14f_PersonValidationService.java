package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules031a039e229044b4bd39b5c6affec14f.*;

public class Rules031a039e229044b4bd39b5c6affec14f_PersonValidationService extends Rules031a039e229044b4bd39b5c6affec14f {

    @Override
    public String getName() {
        return super.getName() + ".PersonValidationService";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.model.codegen.execmodel.generator.DRLIdGenerator@579b1386
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules031a039e229044b4bd39b5c6affec14f_PersonValidationService_rule_Is_32adult.rule_Is_32adult());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("persons"));
    }

    public static final org.drools.model.Global<org.drools.ruleunits.api.DataStore<org.acme.travels.Person>> var_persons = D.globalOf(new org.drools.model.TypeReference<org.drools.ruleunits.api.DataStore<org.acme.travels.Person>>(org.drools.ruleunits.api.DataStore.class),
                                                                                                                                      "org.acme.travels",
                                                                                                                                      "persons");

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }

    {
        globals.add(var_persons);
    }
}
