package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Instantiator {
    java.util.List<org.simpleframework.xml.core.Creator> getCreators();

    java.lang.Object getInstance();

    java.lang.Object getInstance(org.simpleframework.xml.core.Criteria r1);

    org.simpleframework.xml.core.Parameter getParameter(java.lang.String r1);

    java.util.List<org.simpleframework.xml.core.Parameter> getParameters();

    boolean isDefault();
}
