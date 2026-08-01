package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
