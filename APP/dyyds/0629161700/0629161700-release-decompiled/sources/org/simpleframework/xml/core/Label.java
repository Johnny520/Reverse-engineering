package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Label {
    java.lang.annotation.Annotation getAnnotation();

    org.simpleframework.xml.core.Contact getContact();

    org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r1);

    org.simpleframework.xml.core.Decorator getDecorator();

    org.simpleframework.xml.strategy.Type getDependent();

    java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1);

    java.lang.String getEntry();

    org.simpleframework.xml.core.Expression getExpression();

    java.lang.Object getKey();

    org.simpleframework.xml.core.Label getLabel(java.lang.Class r1);

    java.lang.String getName();

    java.lang.String[] getNames();

    java.lang.String getOverride();

    java.lang.String getPath();

    java.lang.String[] getPaths();

    java.lang.Class getType();

    org.simpleframework.xml.strategy.Type getType(java.lang.Class r1);

    boolean isAttribute();

    boolean isCollection();

    boolean isData();

    boolean isInline();

    boolean isRequired();

    boolean isText();

    boolean isTextList();

    boolean isUnion();

    java.lang.String toString();
}
