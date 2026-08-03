package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Section extends java.lang.Iterable<java.lang.String> {
    java.lang.String getAttribute(java.lang.String r1) throws java.lang.Exception;

    org.simpleframework.xml.core.LabelMap getAttributes() throws java.lang.Exception;

    org.simpleframework.xml.core.Label getElement(java.lang.String r1) throws java.lang.Exception;

    org.simpleframework.xml.core.LabelMap getElements() throws java.lang.Exception;

    java.lang.String getName();

    java.lang.String getPath(java.lang.String r1) throws java.lang.Exception;

    java.lang.String getPrefix();

    org.simpleframework.xml.core.Section getSection(java.lang.String r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Label getText() throws java.lang.Exception;

    boolean isSection(java.lang.String r1) throws java.lang.Exception;
}
