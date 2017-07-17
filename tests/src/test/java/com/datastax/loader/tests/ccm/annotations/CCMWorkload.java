/*
 * Copyright (C) 2017 DataStax Inc.
 *
 * This software can be used solely with DataStax Enterprise. Please consult the license at
 * http://www.datastax.com/terms/datastax-dse-driver-license-terms
 */
package com.datastax.loader.tests.ccm.annotations;

import com.datastax.loader.tests.ccm.CCMCluster;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/** A set of workloads to assign to a specific node. */
@Retention(RUNTIME)
@Target(ANNOTATION_TYPE)
public @interface CCMWorkload {

  /**
   * The workloads to assign to a specific node.
   *
   * @return The workloads to assign to a specifc node.
   */
  CCMCluster.Workload[] value() default {};
}
