package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Model extends java.lang.Iterable<java.lang.String> {
    org.simpleframework.xml.core.LabelMap getAttributes() throws java.lang.Exception;

    org.simpleframework.xml.core.LabelMap getElements() throws java.lang.Exception;

    org.simpleframework.xml.core.Expression getExpression();

    int getIndex();

    org.simpleframework.xml.core.ModelMap getModels() throws java.lang.Exception;

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

    org.simpleframework.xml.core.Model register(java.lang.String r1, java.lang.String r2, int r3) throws java.lang.Exception;

    void register(org.simpleframework.xml.core.Label r1) throws java.lang.Exception;

    void registerAttribute(java.lang.String r1) throws java.lang.Exception;

    void registerAttribute(org.simpleframework.xml.core.Label r1) throws java.lang.Exception;

    void registerElement(java.lang.String r1) throws java.lang.Exception;

    void registerElement(org.simpleframework.xml.core.Label r1) throws java.lang.Exception;

    void registerText(org.simpleframework.xml.core.Label r1) throws java.lang.Exception;

    void validate(java.lang.Class r1) throws java.lang.Exception;
}
