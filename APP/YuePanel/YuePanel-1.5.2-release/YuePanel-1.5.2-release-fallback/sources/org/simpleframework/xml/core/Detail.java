package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Detail {
    org.simpleframework.xml.DefaultType getAccess();

    java.lang.annotation.Annotation[] getAnnotations();

    java.lang.reflect.Constructor[] getConstructors();

    java.util.List<org.simpleframework.xml.core.FieldDetail> getFields();

    java.util.List<org.simpleframework.xml.core.MethodDetail> getMethods();

    java.lang.String getName();

    org.simpleframework.xml.Namespace getNamespace();

    org.simpleframework.xml.NamespaceList getNamespaceList();

    org.simpleframework.xml.Order getOrder();

    org.simpleframework.xml.DefaultType getOverride();

    org.simpleframework.xml.Root getRoot();

    java.lang.Class getSuper();

    java.lang.Class getType();

    boolean isInstantiable();

    boolean isPrimitive();

    boolean isRequired();

    boolean isStrict();
}
