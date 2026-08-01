package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Context {
    java.lang.Object getAttribute(java.lang.Object r1);

    org.simpleframework.xml.core.Caller getCaller(java.lang.Class r1);

    org.simpleframework.xml.core.Decorator getDecorator(java.lang.Class r1);

    org.simpleframework.xml.core.Instance getInstance(java.lang.Class r1);

    org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r1);

    java.lang.String getName(java.lang.Class r1);

    org.simpleframework.xml.strategy.Value getOverride(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.InputNode r2);

    java.lang.String getProperty(java.lang.String r1);

    org.simpleframework.xml.core.Schema getSchema(java.lang.Class r1);

    org.simpleframework.xml.core.Session getSession();

    org.simpleframework.xml.stream.Style getStyle();

    org.simpleframework.xml.core.Support getSupport();

    java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2);

    org.simpleframework.xml.Version getVersion(java.lang.Class r1);

    boolean isFloat(java.lang.Class r1);

    boolean isFloat(org.simpleframework.xml.strategy.Type r1);

    boolean isPrimitive(java.lang.Class r1);

    boolean isPrimitive(org.simpleframework.xml.strategy.Type r1);

    boolean isStrict();

    boolean setOverride(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2, org.simpleframework.xml.stream.OutputNode r3);
}
