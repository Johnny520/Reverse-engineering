package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Scanner extends org.simpleframework.xml.core.Policy {
    org.simpleframework.xml.core.Caller getCaller(org.simpleframework.xml.core.Context r1);

    org.simpleframework.xml.core.Function getCommit();

    org.simpleframework.xml.core.Function getComplete();

    org.simpleframework.xml.core.Decorator getDecorator();

    org.simpleframework.xml.core.Instantiator getInstantiator();

    java.lang.String getName();

    org.simpleframework.xml.Order getOrder();

    org.simpleframework.xml.core.ParameterMap getParameters();

    org.simpleframework.xml.core.Function getPersist();

    org.simpleframework.xml.core.Function getReplace();

    org.simpleframework.xml.core.Function getResolve();

    org.simpleframework.xml.Version getRevision();

    org.simpleframework.xml.core.Section getSection();

    org.simpleframework.xml.core.Signature getSignature();

    java.util.List<org.simpleframework.xml.core.Signature> getSignatures();

    org.simpleframework.xml.core.Label getText();

    java.lang.Class getType();

    org.simpleframework.xml.core.Function getValidate();

    org.simpleframework.xml.core.Label getVersion();

    boolean isEmpty();

    boolean isPrimitive();

    @Override // org.simpleframework.xml.core.Policy
    boolean isStrict();
}
