package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class TextListLabel extends org.simpleframework.xml.core.TemplateLabel {
    private final java.lang.String empty;
    private final org.simpleframework.xml.core.Label label;
    private final org.simpleframework.xml.Text text;

    public TextListLabel(org.simpleframework.xml.core.Label r2, org.simpleframework.xml.Text r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r3.empty()
            r1.empty = r0
            r1.label = r2
            r1.text = r3
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
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Contact r0 = r0.getContact()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r3) {
            r2 = this;
            org.simpleframework.xml.core.Contact r0 = r2.getContact()
            org.simpleframework.xml.core.Label r1 = r2.label
            boolean r1 = r1.isCollection()
            if (r1 == 0) goto L14
            org.simpleframework.xml.core.TextList r1 = new org.simpleframework.xml.core.TextList
            org.simpleframework.xml.core.Label r2 = r2.label
            r1.<init>(r3, r0, r2)
            return r1
        L14:
            org.simpleframework.xml.core.TextException r3 = new org.simpleframework.xml.core.TextException
            org.simpleframework.xml.core.Label r2 = r2.label
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "Cannot use %s to represent %s"
            r3.<init>(r0, r2)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            r0 = 0
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
    public /* bridge */ /* synthetic */ java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            java.lang.String r0 = r0.getEmpty(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getEmpty(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            java.lang.String r0 = r0.empty
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
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public java.lang.Object getKey() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.Object r0 = r0.getKey()
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
            org.simpleframework.xml.core.Label r0 = r0.label
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
            org.simpleframework.xml.core.Label r0 = r0.label
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
    public boolean isCollection() {
            r0 = this;
            r0 = 1
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
    public boolean isTextList() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String toString() {
            r1 = this;
            org.simpleframework.xml.Text r0 = r1.text
            org.simpleframework.xml.core.Label r1 = r1.label
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "%s %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }
}
