package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Section extends java.lang.Iterable<java.lang.String> {
    java.lang.String getAttribute(java.lang.String r1);

    org.simpleframework.xml.core.LabelMap getAttributes();

    org.simpleframework.xml.core.Label getElement(java.lang.String r1);

    org.simpleframework.xml.core.LabelMap getElements();

    java.lang.String getName();

    java.lang.String getPath(java.lang.String r1);

    java.lang.String getPrefix();

    org.simpleframework.xml.core.Section getSection(java.lang.String r1);

    org.simpleframework.xml.core.Label getText();

    boolean isSection(java.lang.String r1);
}
