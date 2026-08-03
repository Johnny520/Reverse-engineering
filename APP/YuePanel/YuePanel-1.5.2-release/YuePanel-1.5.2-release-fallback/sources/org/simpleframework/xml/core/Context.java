package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Context {
    java.lang.Object getAttribute(java.lang.Object r1);

    org.simpleframework.xml.core.Caller getCaller(java.lang.Class r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Decorator getDecorator(java.lang.Class r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Instance getInstance(java.lang.Class r1);

    org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r1);

    java.lang.String getName(java.lang.Class r1) throws java.lang.Exception;

    org.simpleframework.xml.strategy.Value getOverride(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception;

    java.lang.String getProperty(java.lang.String r1);

    org.simpleframework.xml.core.Schema getSchema(java.lang.Class r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Session getSession();

    org.simpleframework.xml.stream.Style getStyle();

    org.simpleframework.xml.core.Support getSupport();

    java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2);

    org.simpleframework.xml.Version getVersion(java.lang.Class r1) throws java.lang.Exception;

    boolean isFloat(java.lang.Class r1) throws java.lang.Exception;

    boolean isFloat(org.simpleframework.xml.strategy.Type r1) throws java.lang.Exception;

    boolean isPrimitive(java.lang.Class r1) throws java.lang.Exception;

    boolean isPrimitive(org.simpleframework.xml.strategy.Type r1) throws java.lang.Exception;

    boolean isStrict();

    boolean setOverride(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2, org.simpleframework.xml.stream.OutputNode r3) throws java.lang.Exception;
}
