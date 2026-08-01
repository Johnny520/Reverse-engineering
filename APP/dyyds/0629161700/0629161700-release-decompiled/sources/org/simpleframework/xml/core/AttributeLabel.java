package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = this;
            org.simpleframework.xml.Attribute r0 = r0.label
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Contact getContact() {
            r0 = this;
            org.simpleframework.xml.core.Introspector r0 = r0.detail
            org.simpleframework.xml.core.Contact r0 = r0.getContact()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r3) {
            r2 = this;
            java.lang.String r0 = r2.getEmpty(r3)
            org.simpleframework.xml.core.Contact r2 = r2.getContact()
            org.simpleframework.xml.core.Primitive r1 = new org.simpleframework.xml.core.Primitive
            r1.<init>(r3, r2, r0)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Decorator r0 = r0.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public /* bridge */ /* synthetic */ java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            java.lang.String r0 = r0.getEmpty(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getEmpty(org.simpleframework.xml.core.Context r2) {
            r1 = this;
            org.simpleframework.xml.core.Introspector r2 = r1.detail
            java.lang.String r0 = r1.empty
            boolean r2 = r2.isEmpty(r0)
            if (r2 == 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.String r1 = r1.empty
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.path
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Introspector r0 = r1.detail
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            r1.path = r0
        Lc:
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() {
            r1 = this;
            org.simpleframework.xml.stream.Format r0 = r1.format
            org.simpleframework.xml.stream.Style r0 = r0.getStyle()
            org.simpleframework.xml.core.Introspector r1 = r1.detail
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = r0.getAttribute(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.getExpression()
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = r0.getAttribute(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isAttribute() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r0 = this;
            boolean r0 = r0.required
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String toString() {
            r0 = this;
            org.simpleframework.xml.core.Introspector r0 = r0.detail
            java.lang.String r0 = r0.toString()
            return r0
    }
}
