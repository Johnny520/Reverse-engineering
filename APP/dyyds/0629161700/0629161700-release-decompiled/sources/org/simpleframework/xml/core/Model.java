package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Model extends java.lang.Iterable<java.lang.String> {
    org.simpleframework.xml.core.LabelMap getAttributes();

    org.simpleframework.xml.core.LabelMap getElements();

    org.simpleframework.xml.core.Expression getExpression();

    int getIndex();

    org.simpleframework.xml.core.ModelMap getModels();

    java.lang.String getName();

    java.lang.String getPrefix();

    org.simpleframework.xml.core.Label getText();

    boolean isAttribute(java.lang.String r1);

    boolean isComposite();

    boolean isElement(java.lang.String r1);

    boolean isEmpty();

    boolean isModel(java.lang.String r1);

    org.simpleframework.xml.core.Model lookup(java.lang.String r1, int r2);

    org.simpleframework.xml.core.Model lookup(org.simpleframework.xml.core.Expression r1);

    org.simpleframework.xml.core.Model register(java.lang.String r1, java.lang.String r2, int r3);

    void register(org.simpleframework.xml.core.Label r1);

    void registerAttribute(java.lang.String r1);

    void registerAttribute(org.simpleframework.xml.core.Label r1);

    void registerElement(java.lang.String r1);

    void registerElement(org.simpleframework.xml.core.Label r1);

    void registerText(org.simpleframework.xml.core.Label r1);

    void validate(java.lang.Class r1);
}
