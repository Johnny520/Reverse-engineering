package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
abstract class TemplateLabel implements org.simpleframework.xml.core.Label {
    private final org.simpleframework.xml.core.KeyBuilder builder;

    public TemplateLabel() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.KeyBuilder r0 = new org.simpleframework.xml.core.KeyBuilder
            r0.<init>(r1)
            r1.builder = r0
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() throws java.lang.Exception {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getEntry() throws java.lang.Exception {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getKey() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.KeyBuilder r0 = r1.builder
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getNames() throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = r2.getPath()
            java.lang.String r1 = r2.getName()
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getPaths() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.getPath()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.core.Contact r1 = r0.getContact()
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isAttribute() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isInline() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isText() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isTextList() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isUnion() {
            r1 = this;
            r0 = 0
            return r0
    }
}
