package org.acme.travels;

import org.drools.core.SessionConfiguration;
import org.drools.core.common.ReteEvaluator;
import org.drools.core.impl.InternalRuleBase;
import org.drools.modelcompiler.KieBaseBuilder;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.api.RuleUnits;
import org.drools.ruleunits.impl.factory.AbstractRuleUnit;
import org.drools.ruleunits.impl.factory.AbstractRuleUnits;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;
import org.drools.ruleunits.impl.sessions.RuleUnitExecutorImpl;

@javax.enterprise.context.ApplicationScoped
public class PersonValidationServiceRuleUnit extends AbstractRuleUnit<org.acme.travels.PersonValidationService> {

    private static final InternalRuleBase ruleBase = KieBaseBuilder.createKieBaseFromModel(new org.acme.travels.Rulesc4bed30f1ac248db818f7eedc06301c5_PersonValidationService(),
                                                                                           new org.kie.api.conf.KieBaseOption[] { org.kie.api.conf.EventProcessingOption.CLOUD });

    private static final SessionConfiguration sessionConfiguration = ruleBase.getSessionConfiguration().as(SessionConfiguration.KEY);

    static {
        sessionConfiguration.setOption(org.kie.api.runtime.conf.ClockTypeOption.REALTIME);
    }

    public PersonValidationServiceRuleUnit() {
        this((RuleUnits) null);
    }

    @javax.inject.Inject
    public PersonValidationServiceRuleUnit(javax.enterprise.inject.Instance<RuleUnits> ruleUnits) {
        this(ruleUnits == null || ruleUnits.isUnsatisfied() ? AbstractRuleUnits.DummyRuleUnits.INSTANCE : ruleUnits.get());
    }

    public PersonValidationServiceRuleUnit(RuleUnits ruleUnits) {
        super(org.acme.travels.PersonValidationService.class,
              ruleUnits);
        this.ruleUnits.register(this);
    }

    @Override
    public PersonValidationServiceRuleUnitInstance internalCreateInstance(org.acme.travels.PersonValidationService data, RuleConfig ruleConfig) {
        ReteEvaluator reteEvaluator = evaluatorConfigurator.apply(new RuleUnitExecutorImpl(ruleBase,
                                                                                           sessionConfiguration));
        return new PersonValidationServiceRuleUnitInstance(this,
                                                           data,
                                                           reteEvaluator,
                                                           ruleConfig);
    }
}
