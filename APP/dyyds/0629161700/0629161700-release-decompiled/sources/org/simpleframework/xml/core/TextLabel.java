package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class TextLabel extends org.simpleframework.xml.core.TemplateLabel {
    private org.simpleframework.xml.core.Contact contact;
    private boolean data;
    private org.simpleframework.xml.core.Introspector detail;
    private java.lang.String empty;
    private org.simpleframework.xml.Text label;
    private org.simpleframework.xml.core.Expression path;
    private boolean required;
    private java.lang.Class type;

    public TextLabel(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.Text r3, org.simpleframework.xml.stream.Format r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Introspector r0 = new org.simpleframework.xml.core.Introspector
            r0.<init>(r2, r1, r4)
            r1.detail = r0
            boolean r4 = r3.required()
            r1.required = r4
            java.lang.Class r4 = r2.getType()
            r1.type = r4
            java.lang.String r4 = r3.empty()
            r1.empty = r4
            boolean r4 = r3.data()
            r1.data = r4
            r1.contact = r2
            r1.label = r3
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            org.simpleframework.xml.Text r0 = r0.label
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
            java.lang.String r0 = r3.getEmpty(r4)
            org.simpleframework.xml.core.Contact r1 = r3.getContact()
            boolean r2 = r4.isPrimitive(r1)
            if (r2 == 0) goto L14
            org.simpleframework.xml.core.Primitive r3 = new org.simpleframework.xml.core.Primitive
            r3.<init>(r4, r1, r0)
            return r3
        L14:
            org.simpleframework.xml.core.TextException r4 = new org.simpleframework.xml.core.TextException
            org.simpleframework.xml.Text r3 = r3.label
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r0 = "Cannot use %s to represent %s"
            r4.<init>(r0, r3)
            throw r4
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            r0 = 0
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
            r0 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r0 = this;
            org.simpleframework.xml.core.Contact r0 = r0.contact
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() {
            r0 = this;
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            java.lang.String r0 = r0.getPath()
            return r0
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

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isInline() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r0 = this;
            boolean r0 = r0.required
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isText() {
            r0 = this;
            r0 = 1
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
