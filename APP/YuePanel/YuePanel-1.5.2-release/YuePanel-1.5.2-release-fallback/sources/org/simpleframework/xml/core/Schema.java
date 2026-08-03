package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Schema {
    org.simpleframework.xml.core.Caller getCaller();

    org.simpleframework.xml.core.Decorator getDecorator();

    org.simpleframework.xml.core.Instantiator getInstantiator();

    org.simpleframework.xml.Version getRevision();

    org.simpleframework.xml.core.Section getSection();

    org.simpleframework.xml.core.Label getText();

    org.simpleframework.xml.core.Label getVersion();

    boolean isPrimitive();
}
