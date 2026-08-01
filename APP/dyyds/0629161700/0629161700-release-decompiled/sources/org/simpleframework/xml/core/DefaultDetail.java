package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class DefaultDetail implements org.simpleframework.xml.core.Detail {
    private final org.simpleframework.xml.DefaultType access;
    private final org.simpleframework.xml.core.Detail detail;

    public DefaultDetail(org.simpleframework.xml.core.Detail r1, org.simpleframework.xml.DefaultType r2) {
            r0 = this;
            r0.<init>()
            r0.detail = r1
            r0.access = r2
            return
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.DefaultType getAccess() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            org.simpleframework.xml.DefaultType r0 = r0.getAccess()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.annotation.Annotation[] getAnnotations() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.reflect.Constructor[] getConstructors() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.util.List<org.simpleframework.xml.core.FieldDetail> getFields() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.util.List r0 = r0.getFields()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.util.List<org.simpleframework.xml.core.MethodDetail> getMethods() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.util.List r0 = r0.getMethods()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.String getName() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.Namespace getNamespace() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            org.simpleframework.xml.Namespace r0 = r0.getNamespace()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.NamespaceList getNamespaceList() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            org.simpleframework.xml.NamespaceList r0 = r0.getNamespaceList()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.Order getOrder() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            org.simpleframework.xml.Order r0 = r0.getOrder()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.DefaultType getOverride() {
            r0 = this;
            org.simpleframework.xml.DefaultType r0 = r0.access
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.Root getRoot() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            org.simpleframework.xml.Root r0 = r0.getRoot()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.Class getSuper() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.Class r0 = r0.getSuper()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.Class getType() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isInstantiable() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            boolean r0 = r0.isInstantiable()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isPrimitive() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            boolean r0 = r0.isPrimitive()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isRequired() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            boolean r0 = r0.isRequired()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isStrict() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            boolean r0 = r0.isStrict()
            return r0
    }

    public java.lang.String toString() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.String r0 = r0.toString()
            return r0
    }
}
