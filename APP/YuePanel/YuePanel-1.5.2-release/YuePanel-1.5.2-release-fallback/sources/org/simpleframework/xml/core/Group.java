package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Group {
    org.simpleframework.xml.core.LabelMap getElements() throws java.lang.Exception;

    org.simpleframework.xml.core.Label getLabel(java.lang.Class r1);

    org.simpleframework.xml.core.Label getText() throws java.lang.Exception;

    boolean isInline();

    boolean isTextList();

    java.lang.String toString();
}
