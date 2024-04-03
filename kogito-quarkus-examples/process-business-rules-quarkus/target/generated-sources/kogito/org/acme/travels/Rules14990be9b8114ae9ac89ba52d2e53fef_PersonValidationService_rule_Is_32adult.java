package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules14990be9b8114ae9ac89ba52d2e53fef.*;
import static org.acme.travels.Rules14990be9b8114ae9ac89ba52d2e53fef_PersonValidationService.*;

public class Rules14990be9b8114ae9ac89ba52d2e53fef_PersonValidationService_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata14990be9b8114ae9ac89ba52d2e53fef.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata14990be9b8114ae9ac89ba52d2e53fef.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PC5.LambdaPredicateC522D228BA59D594B956775C20EDA63A.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata14990be9b8114ae9ac89ba52d2e53fef.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PE1.LambdaExtractorE1E5E2AF4DB1EBB3F035B715B6B7BB26.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P32.LambdaConsequence32C5DD84AF7348C525DB6E73590DF62F.INSTANCE));
        return rule;
    }
}
