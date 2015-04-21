/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hp.hpl.jena.ontology.impl;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
    Collected test suite for the .ontology.impl package.
*/
@RunWith(Suite.class)
@SuiteClasses({
    TestOntGraph.class,
    TestResource.class,
    TestAxioms.class,
    TestClassExpression.class,
    TestOntDocumentManager.class,
    TestOntology.class,
    TestProperty.class,
    TestListSyntaxCategories.class,
    TestCreate.class,
    TestIndividual.class,
    TestAllDifferent.class,
    TestOntModelSpec.class,
    TestOntReasoning.class,
    TestOntModel.class,
    TestOntClass.class,
    TestFrameView.class,
    TestOntTools.class
})
public class TestPackage  {

}
