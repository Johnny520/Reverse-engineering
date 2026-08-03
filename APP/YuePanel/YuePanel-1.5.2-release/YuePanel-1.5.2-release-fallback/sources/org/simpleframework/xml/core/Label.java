package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Label {
    java.lang.annotation.Annotation getAnnotation();

    org.simpleframework.xml.core.Contact getContact();

    org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Decorator getDecorator() throws java.lang.Exception;

    org.simpleframework.xml.strategy.Type getDependent() throws java.lang.Exception;

    java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1) throws java.lang.Exception;

    java.lang.String getEntry() throws java.lang.Exception;

    org.simpleframework.xml.core.Expression getExpression() throws java.lang.Exception;

    java.lang.Object getKey() throws java.lang.Exception;

    org.simpleframework.xml.core.Label getLabel(java.lang.Class r1) throws java.lang.Exception;

    java.lang.String getName() throws java.lang.Exception;

    java.lang.String[] getNames() throws java.lang.Exception;

    java.lang.String getOverride();

    java.lang.String getPath() throws java.lang.Exception;

    java.lang.String[] getPaths() throws java.lang.Exception;

    java.lang.Class getType();

    org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) throws java.lang.Exception;

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
