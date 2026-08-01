package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Group {
    org.simpleframework.xml.core.LabelMap getElements();

    org.simpleframework.xml.core.Label getLabel(java.lang.Class r1);

    org.simpleframework.xml.core.Label getText();

    boolean isInline();

    boolean isTextList();

    java.lang.String toString();
}
