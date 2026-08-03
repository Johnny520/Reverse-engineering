package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ElementListLabel extends org.simpleframework.xml.core.TemplateLabel {
    private org.simpleframework.xml.core.Expression cache;
    private boolean data;
    private org.simpleframework.xml.core.Decorator decorator;
    private org.simpleframework.xml.core.Introspector detail;
    private java.lang.String entry;
    private org.simpleframework.xml.stream.Format format;
    private boolean inline;
    private java.lang.Class item;
    private org.simpleframework.xml.ElementList label;
    private java.lang.String name;
    private java.lang.String override;
    private java.lang.String path;
    private boolean required;
    private java.lang.Class type;

    public ElementListLabel(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.ElementList r3, org.simpleframework.xml.stream.Format r4) {
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
            boolean r2 = r3.inline()
            r1.inline = r2
            java.lang.String r2 = r3.entry()
            r1.entry = r2
            boolean r2 = r3.data()
            r1.data = r2
            java.lang.Class r2 = r3.type()
            r1.item = r2
            r1.format = r4
            r1.label = r3
            return
    }

    private org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r4, java.lang.String r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.strategy.Type r0 = r3.getDependent()
            org.simpleframework.xml.core.Contact r1 = r3.getContact()
            boolean r2 = r4.isPrimitive(r0)
            if (r2 != 0) goto L14
            org.simpleframework.xml.core.CompositeList r2 = new org.simpleframework.xml.core.CompositeList
            r2.<init>(r4, r1, r0, r5)
            return r2
        L14:
            org.simpleframework.xml.core.PrimitiveList r2 = new org.simpleframework.xml.core.PrimitiveList
            r2.<init>(r4, r1, r0, r5)
            return r2
    }

    private org.simpleframework.xml.core.Converter getInlineConverter(org.simpleframework.xml.core.Context r4, java.lang.String r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.strategy.Type r0 = r3.getDependent()
            org.simpleframework.xml.core.Contact r1 = r3.getContact()
            boolean r2 = r4.isPrimitive(r0)
            if (r2 != 0) goto L14
            org.simpleframework.xml.core.CompositeInlineList r2 = new org.simpleframework.xml.core.CompositeInlineList
            r2.<init>(r4, r1, r0, r5)
            return r2
        L14:
            org.simpleframework.xml.core.PrimitiveInlineList r2 = new org.simpleframework.xml.core.PrimitiveInlineList
            r2.<init>(r4, r1, r0, r5)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            org.simpleframework.xml.ElementList r0 = r1.label
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
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r3) throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = r2.getEntry()
            org.simpleframework.xml.ElementList r1 = r2.label
            boolean r1 = r1.inline()
            if (r1 != 0) goto L11
            org.simpleframework.xml.core.Converter r3 = r2.getConverter(r3, r0)
            return r3
        L11:
            org.simpleframework.xml.core.Converter r3 = r2.getInlineConverter(r3, r0)
            return r3
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Decorator r0 = r1.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Contact r0 = r3.getContact()
            java.lang.Class r1 = r3.item
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto L10
            java.lang.Class r1 = r0.getDependent()
            r3.item = r1
        L10:
            java.lang.Class r1 = r3.item
            if (r1 == 0) goto L1a
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            r0.<init>(r1)
            return r0
        L1a:
            org.simpleframework.xml.core.ElementException r1 = new org.simpleframework.xml.core.ElementException
            java.lang.String r2 = "Unable to determine generic type for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            java.lang.Class r1 = r2.type
            r0.<init>(r1)
            org.simpleframework.xml.core.CollectionFactory r1 = new org.simpleframework.xml.core.CollectionFactory
            r1.<init>(r3, r0)
            org.simpleframework.xml.ElementList r3 = r2.label
            boolean r3 = r3.empty()
            if (r3 != 0) goto L19
            java.lang.Object r3 = r1.getInstance()
            return r3
        L19:
            r3 = 0
            return r3
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String getEntry() throws java.lang.Exception {
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
            java.lang.String r1 = r3.entry
            java.lang.String r0 = r0.getElement(r1)
            return r0
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
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r1 = this;
            boolean r0 = r1.data
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isInline() {
            r1 = this;
            boolean r0 = r1.inline
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
