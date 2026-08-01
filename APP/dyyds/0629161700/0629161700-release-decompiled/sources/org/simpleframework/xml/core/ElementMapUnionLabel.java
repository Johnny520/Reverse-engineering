package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ElementMapUnionLabel extends org.simpleframework.xml.core.TemplateLabel {
    private org.simpleframework.xml.core.Contact contact;
    private org.simpleframework.xml.core.GroupExtractor extractor;
    private org.simpleframework.xml.core.Label label;
    private org.simpleframework.xml.core.Expression path;

    public ElementMapUnionLabel(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.ElementMapUnion r3, org.simpleframework.xml.ElementMap r4, org.simpleframework.xml.stream.Format r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.GroupExtractor r0 = new org.simpleframework.xml.core.GroupExtractor
            r0.<init>(r2, r3, r5)
            r1.extractor = r0
            org.simpleframework.xml.core.ElementMapLabel r3 = new org.simpleframework.xml.core.ElementMapLabel
            r3.<init>(r2, r4, r5)
            r1.label = r3
            r1.contact = r2
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.annotation.Annotation r0 = r0.getAnnotation()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Contact getContact() {
            r0 = this;
            org.simpleframework.xml.core.Contact r0 = r0.contact
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r4) {
            r3 = this;
            org.simpleframework.xml.core.Expression r0 = r3.getExpression()
            org.simpleframework.xml.core.Contact r1 = r3.getContact()
            if (r1 == 0) goto L12
            org.simpleframework.xml.core.CompositeMapUnion r2 = new org.simpleframework.xml.core.CompositeMapUnion
            org.simpleframework.xml.core.GroupExtractor r3 = r3.extractor
            r2.<init>(r4, r3, r0, r1)
            return r2
        L12:
            org.simpleframework.xml.core.UnionException r4 = new org.simpleframework.xml.core.UnionException
            org.simpleframework.xml.core.Label r3 = r3.label
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Union %s was not declared on a field or method"
            r4.<init>(r0, r3)
            throw r4
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Decorator r0 = r0.getDecorator()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.strategy.Type r0 = r0.getDependent()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.Object r0 = r0.getEmpty(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String getEntry() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getEntry()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.path
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            r1.path = r0
        Lc:
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r1) {
            r0 = this;
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String[] getNames() {
            r0 = this;
            org.simpleframework.xml.core.GroupExtractor r0 = r0.extractor
            java.lang.String[] r0 = r0.getNames()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getOverride()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.String[] getPaths() {
            r0 = this;
            org.simpleframework.xml.core.GroupExtractor r0 = r0.extractor
            java.lang.String[] r0 = r0.getPaths()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Contact r0 = r0.getContact()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isCollection()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isData()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isInline() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isRequired()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isUnion() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String toString() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.toString()
            return r0
    }
}
