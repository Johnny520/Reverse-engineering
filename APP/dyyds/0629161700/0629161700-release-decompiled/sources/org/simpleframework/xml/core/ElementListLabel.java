package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getDependent()
            org.simpleframework.xml.core.Contact r2 = r2.getContact()
            boolean r1 = r3.isPrimitive(r0)
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.CompositeList r1 = new org.simpleframework.xml.core.CompositeList
            r1.<init>(r3, r2, r0, r4)
            return r1
        L14:
            org.simpleframework.xml.core.PrimitiveList r1 = new org.simpleframework.xml.core.PrimitiveList
            r1.<init>(r3, r2, r0, r4)
            return r1
    }

    private org.simpleframework.xml.core.Converter getInlineConverter(org.simpleframework.xml.core.Context r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getDependent()
            org.simpleframework.xml.core.Contact r2 = r2.getContact()
            boolean r1 = r3.isPrimitive(r0)
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.CompositeInlineList r1 = new org.simpleframework.xml.core.CompositeInlineList
            r1.<init>(r3, r2, r0, r4)
            return r1
        L14:
            org.simpleframework.xml.core.PrimitiveInlineList r1 = new org.simpleframework.xml.core.PrimitiveInlineList
            r1.<init>(r3, r2, r0, r4)
            return r1
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            org.simpleframework.xml.ElementList r0 = r0.label
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
            java.lang.String r0 = r2.getEntry()
            org.simpleframework.xml.ElementList r1 = r2.label
            boolean r1 = r1.inline()
            if (r1 != 0) goto L11
            org.simpleframework.xml.core.Converter r2 = r2.getConverter(r3, r0)
            return r2
        L11:
            org.simpleframework.xml.core.Converter r2 = r2.getInlineConverter(r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Decorator r0 = r0.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() {
            r3 = this;
            org.simpleframework.xml.core.Contact r0 = r3.getContact()
            java.lang.Class r1 = r3.item
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto L10
            java.lang.Class r1 = r0.getDependent()
            r3.item = r1
        L10:
            if (r1 == 0) goto L18
            org.simpleframework.xml.core.ClassType r3 = new org.simpleframework.xml.core.ClassType
            r3.<init>(r1)
            return r3
        L18:
            org.simpleframework.xml.core.ElementException r3 = new org.simpleframework.xml.core.ElementException
            java.lang.String r1 = "Unable to determine generic type for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r3.<init>(r1, r0)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r3) {
            r2 = this;
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            java.lang.Class r1 = r2.type
            r0.<init>(r1)
            org.simpleframework.xml.core.CollectionFactory r1 = new org.simpleframework.xml.core.CollectionFactory
            r1.<init>(r3, r0)
            org.simpleframework.xml.ElementList r2 = r2.label
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
            org.simpleframework.xml.core.Expression r0 = r1.cache
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Introspector r0 = r1.detail
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            r1.cache = r0
        Lc:
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() {
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
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r0 = this;
            java.lang.String r0 = r0.override
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() {
            r2 = this;
            java.lang.String r0 = r2.path
            if (r0 != 0) goto L12
            org.simpleframework.xml.core.Expression r0 = r2.getExpression()
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = r0.getElement(r1)
            r2.path = r0
        L12:
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r0 = this;
            boolean r0 = r0.data
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isInline() {
            r0 = this;
            boolean r0 = r0.inline
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
