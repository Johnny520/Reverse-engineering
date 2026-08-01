package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ElementArrayLabel extends org.simpleframework.xml.core.TemplateLabel {
    private boolean data;
    private org.simpleframework.xml.core.Decorator decorator;
    private org.simpleframework.xml.core.Introspector detail;
    private java.lang.String entry;
    private org.simpleframework.xml.stream.Format format;
    private org.simpleframework.xml.ElementArray label;
    private java.lang.String name;
    private org.simpleframework.xml.core.Expression path;
    private boolean required;
    private java.lang.Class type;

    public ElementArrayLabel(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.ElementArray r3, org.simpleframework.xml.stream.Format r4) {
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
            java.lang.String r2 = r3.entry()
            r1.entry = r2
            boolean r2 = r3.data()
            r1.data = r2
            java.lang.String r2 = r3.name()
            r1.name = r2
            r1.format = r4
            r1.label = r3
            return
    }

    private org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getDependent()
            org.simpleframework.xml.core.Contact r2 = r2.getContact()
            boolean r1 = r3.isPrimitive(r0)
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.CompositeArray r1 = new org.simpleframework.xml.core.CompositeArray
            r1.<init>(r3, r2, r0, r4)
            return r1
        L14:
            org.simpleframework.xml.core.PrimitiveArray r1 = new org.simpleframework.xml.core.PrimitiveArray
            r1.<init>(r3, r2, r0, r4)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            org.simpleframework.xml.ElementArray r0 = r0.label
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
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r4) {
            r3 = this;
            org.simpleframework.xml.core.Contact r0 = r3.getContact()
            java.lang.String r1 = r3.getEntry()
            java.lang.Class r2 = r3.type
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L15
            org.simpleframework.xml.core.Converter r3 = r3.getConverter(r4, r1)
            return r3
        L15:
            org.simpleframework.xml.core.InstantiationException r4 = new org.simpleframework.xml.core.InstantiationException
            java.lang.Class r3 = r3.type
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Type is not an array %s for %s"
            r4.<init>(r0, r3)
            throw r4
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Decorator r0 = r0.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() {
            r1 = this;
            java.lang.Class r0 = r1.type
            java.lang.Class r0 = r0.getComponentType()
            if (r0 != 0) goto L10
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            java.lang.Class r1 = r1.type
            r0.<init>(r1)
            return r0
        L10:
            org.simpleframework.xml.core.ClassType r1 = new org.simpleframework.xml.core.ClassType
            r1.<init>(r0)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r3) {
            r2 = this;
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            java.lang.Class r1 = r2.type
            r0.<init>(r1)
            org.simpleframework.xml.core.ArrayFactory r1 = new org.simpleframework.xml.core.ArrayFactory
            r1.<init>(r3, r0)
            org.simpleframework.xml.ElementArray r2 = r2.label
            boolean r2 = r2.empty()
            if (r2 != 0) goto L19
            java.lang.Object r2 = r1.getInstance()
            return r2
        L19:
            r2 = 0
            return r2
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String getEntry() {
            r3 = this;
            org.simpleframework.xml.stream.Format r0 = r3.format
            org.simpleframework.xml.stream.Style r0 = r0.getStyle()
            org.simpleframework.xml.core.Introspector r1 = r3.detail
            java.lang.String r2 = r3.entry
            boolean r1 = r1.isEmpty(r2)
            if (r1 == 0) goto L18
            org.simpleframework.xml.core.Introspector r1 = r3.detail
            java.lang.String r1 = r1.getEntry()
            r3.entry = r1
        L18:
            java.lang.String r3 = r3.entry
            java.lang.String r3 = r0.getElement(r3)
            return r3
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
            java.lang.String r1 = r0.getElement(r1)
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
            java.lang.String r1 = r0.getElement(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r0 = this;
            boolean r0 = r0.data
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
