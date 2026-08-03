package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class AttributeLabel extends org.simpleframework.xml.core.TemplateLabel {
    private org.simpleframework.xml.core.Decorator decorator;
    private org.simpleframework.xml.core.Introspector detail;
    private java.lang.String empty;
    private org.simpleframework.xml.stream.Format format;
    private org.simpleframework.xml.Attribute label;
    private java.lang.String name;
    private org.simpleframework.xml.core.Expression path;
    private boolean required;
    private java.lang.Class type;

    public AttributeLabel(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.Attribute r3, org.simpleframework.xml.stream.Format r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Introspector r0 = new org.simpleframework.xml.core.Introspector
            r0.<init>(r2, r1, r4)
            r1.detail = r0
            org.simpleframework.xml.core.Qualifier r0 = new org.simpleframework.xml.core.Qualifier
            r0.<init>(r2)
            r1.decorator = r0
            boolean r0 = r3.required()
            r1.required = r0
            java.lang.Class r2 = r2.getType()
            r1.type = r2
            java.lang.String r2 = r3.empty()
            r1.empty = r2
            java.lang.String r2 = r3.name()
            r1.name = r2
            r1.format = r4
            r1.label = r3
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            org.simpleframework.xml.Attribute r0 = r1.label
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Contact getContact() {
            r1 = this;
            org.simpleframework.xml.core.Introspector r0 = r1.detail
            org.simpleframework.xml.core.Contact r0 = r0.getContact()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r4) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r3.getEmpty(r4)
            org.simpleframework.xml.core.Contact r1 = r3.getContact()
            org.simpleframework.xml.core.Primitive r2 = new org.simpleframework.xml.core.Primitive
            r2.<init>(r4, r1, r0)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Decorator r0 = r1.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public /* bridge */ /* synthetic */ java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r0.getEmpty(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getEmpty(org.simpleframework.xml.core.Context r2) {
            r1 = this;
            org.simpleframework.xml.core.Introspector r2 = r1.detail
            java.lang.String r0 = r1.empty
            boolean r2 = r2.isEmpty(r0)
            if (r2 == 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.String r2 = r1.empty
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.path
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Introspector r0 = r1.detail
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            r1.path = r0
        Lc:
            org.simpleframework.xml.core.Expression r0 = r1.path
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.Format r0 = r2.format
            org.simpleframework.xml.stream.Style r0 = r0.getStyle()
            org.simpleframework.xml.core.Introspector r1 = r2.detail
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getAttribute(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Expression r0 = r2.getExpression()
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = r0.getAttribute(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isAttribute() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r1 = this;
            boolean r0 = r1.required
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String toString() {
            r1 = this;
            org.simpleframework.xml.core.Introspector r0 = r1.detail
            java.lang.String r0 = r0.toString()
            return r0
    }
}
