package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
