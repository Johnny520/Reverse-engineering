package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Instantiator {
    java.util.List<org.simpleframework.xml.core.Creator> getCreators();

    java.lang.Object getInstance() throws java.lang.Exception;

    java.lang.Object getInstance(org.simpleframework.xml.core.Criteria r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Parameter getParameter(java.lang.String r1);

    java.util.List<org.simpleframework.xml.core.Parameter> getParameters();

    boolean isDefault();
}
