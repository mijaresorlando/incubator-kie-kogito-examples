package org.acme.travels.P2D;


import static org.acme.travels.Rulesc4bed30f1ac248db818f7eedc06301c5.*;
import org.acme.travels.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate2DDA0DC3095364303F9BD810998B5FED implements org.drools.model.functions.Predicate1<org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A14534181BDAB950D84BDF78ACC34B55";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.Person _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAge(), 18);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("age > 18");
        info.addRuleNames("Is adult", "/Users/oacuna/workspace/IBM/incubator-kie-kogito-examples/kogito-quarkus-examples/process-business-rules-quarkus/src/main/resources/org/acme/travels/PersonValidationService.drl");
        return info;
    }
}
