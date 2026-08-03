package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ElementListUnionLabel extends org.simpleframework.xml.core.TemplateLabel {
    private org.simpleframework.xml.core.Contact contact;
    private org.simpleframework.xml.core.GroupExtractor extractor;
    private org.simpleframework.xml.core.Label label;
    private org.simpleframework.xml.core.Expression path;

    public ElementListUnionLabel(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.ElementListUnion r3, org.simpleframework.xml.ElementList r4, org.simpleframework.xml.stream.Format r5) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ElementListLabel r0 = new org.simpleframework.xml.core.ElementListLabel
            r0.<init>(r2, r4, r5)
            r1.label = r0
            org.simpleframework.xml.core.GroupExtractor r4 = new org.simpleframework.xml.core.GroupExtractor
            r4.<init>(r2, r3, r5)
            r1.extractor = r4
            r1.contact = r2
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.annotation.Annotation r0 = r0.getAnnotation()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Contact getContact() {
            r1 = this;
            org.simpleframework.xml.core.Contact r0 = r1.contact
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r5) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.core.Expression r0 = r4.getExpression()
            org.simpleframework.xml.core.Contact r1 = r4.getContact()
            if (r1 == 0) goto L12
            org.simpleframework.xml.core.CompositeListUnion r2 = new org.simpleframework.xml.core.CompositeListUnion
            org.simpleframework.xml.core.GroupExtractor r3 = r4.extractor
            r2.<init>(r5, r3, r0, r1)
            return r2
        L12:
            org.simpleframework.xml.core.UnionException r5 = new org.simpleframework.xml.core.UnionException
            org.simpleframework.xml.core.Label r0 = r4.label
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Union %s was not declared on a field or method"
            r5.<init>(r1, r0)
            throw r5
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.core.Decorator r0 = r0.getDecorator()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.strategy.Type r0 = r0.getDependent()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.Object r2 = r0.getEmpty(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String getEntry() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.String r0 = r0.getEntry()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.path
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            r1.path = r0
        Lc:
            org.simpleframework.xml.core.Expression r0 = r1.path
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r1) {
            r0 = this;
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String[] getNames() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor r0 = r1.extractor
            java.lang.String[] r0 = r0.getNames()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.String r0 = r0.getOverride()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String[] getPaths() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor r0 = r1.extractor
            java.lang.String[] r0 = r0.getPaths()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Contact r1 = r0.getContact()
            return r1
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            boolean r0 = r0.isCollection()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            boolean r0 = r0.isData()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isInline() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            boolean r0 = r0.isRequired()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isTextList() {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor r0 = r1.extractor
            boolean r0 = r0.isTextList()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isUnion() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String toString() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.String r0 = r0.toString()
            return r0
    }
}
