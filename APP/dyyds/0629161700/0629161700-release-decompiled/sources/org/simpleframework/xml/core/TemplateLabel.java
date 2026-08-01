package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
    public org.simpleframework.xml.strategy.Type getDependent() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getEntry() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getKey() {
            r0 = this;
            org.simpleframework.xml.core.KeyBuilder r0 = r0.builder
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r1) {
            r0 = this;
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getNames() {
            r1 = this;
            java.lang.String r0 = r1.getPath()
            java.lang.String r1 = r1.getName()
            java.lang.String[] r1 = new java.lang.String[]{r0, r1}
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getPaths() {
            r0 = this;
            java.lang.String r0 = r0.getPath()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Contact r0 = r0.getContact()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isAttribute() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isInline() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isText() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isTextList() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isUnion() {
            r0 = this;
            r0 = 0
            return r0
    }
}
