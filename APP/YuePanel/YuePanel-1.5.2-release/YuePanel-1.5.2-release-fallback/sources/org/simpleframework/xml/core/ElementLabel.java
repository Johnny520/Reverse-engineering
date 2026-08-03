package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ElementLabel extends org.simpleframework.xml.core.TemplateLabel {
    private org.simpleframework.xml.core.Expression cache;
    private boolean data;
    private org.simpleframework.xml.core.Decorator decorator;
    private org.simpleframework.xml.core.Introspector detail;
    private java.lang.Class expect;
    private org.simpleframework.xml.stream.Format format;
    private org.simpleframework.xml.Element label;
    private java.lang.String name;
    private java.lang.String override;
    private java.lang.String path;
    private boolean required;
    private java.lang.Class type;

    public ElementLabel(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.Element r3, org.simpleframework.xml.stream.Format r4) {
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
            java.lang.String r2 = r3.name()
            r1.override = r2
            java.lang.Class r2 = r3.type()
            r1.expect = r2
            boolean r2 = r3.data()
            r1.data = r2
            r1.format = r4
            r1.label = r3
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            org.simpleframework.xml.Element r0 = r1.label
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
            org.simpleframework.xml.core.Contact r0 = r3.getContact()
            boolean r1 = r4.isPrimitive(r0)
            if (r1 == 0) goto L10
            org.simpleframework.xml.core.Primitive r1 = new org.simpleframework.xml.core.Primitive
            r1.<init>(r4, r0)
            return r1
        L10:
            java.lang.Class r1 = r3.expect
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto L1c
            org.simpleframework.xml.core.Composite r1 = new org.simpleframework.xml.core.Composite
            r1.<init>(r4, r0)
            return r1
        L1c:
            org.simpleframework.xml.core.Composite r2 = new org.simpleframework.xml.core.Composite
            r2.<init>(r4, r0, r1)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Decorator r0 = r1.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.cache
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Introspector r0 = r1.detail
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            r1.cache = r0
        Lc:
            org.simpleframework.xml.core.Expression r0 = r1.cache
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = r2.name
            if (r0 != 0) goto L16
            org.simpleframework.xml.stream.Format r0 = r2.format
            org.simpleframework.xml.stream.Style r0 = r0.getStyle()
            org.simpleframework.xml.core.Introspector r1 = r2.detail
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getElement(r1)
            r2.name = r0
        L16:
            java.lang.String r0 = r2.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r1 = this;
            java.lang.String r0 = r1.override
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = r2.path
            if (r0 != 0) goto L12
            org.simpleframework.xml.core.Expression r0 = r2.getExpression()
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = r0.getElement(r1)
            r2.path = r0
        L12:
            java.lang.String r0 = r2.path
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r2 = this;
            java.lang.Class r0 = r2.expect
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L8
            java.lang.Class r0 = r2.type
        L8:
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r3) {
            r2 = this;
            org.simpleframework.xml.core.Contact r3 = r2.getContact()
            java.lang.Class r0 = r2.expect
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto Lb
            return r3
        Lb:
            org.simpleframework.xml.core.OverrideType r1 = new org.simpleframework.xml.core.OverrideType
            r1.<init>(r3, r0)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r1 = this;
            boolean r0 = r1.data
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
