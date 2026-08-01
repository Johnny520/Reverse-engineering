package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class TextParameter extends org.simpleframework.xml.core.TemplateParameter {
    private final org.simpleframework.xml.core.TextParameter.Contact contact;
    private final org.simpleframework.xml.core.Expression expression;
    private final int index;
    private final java.lang.Object key;
    private final org.simpleframework.xml.core.Label label;
    private final java.lang.String name;
    private final java.lang.String path;
    private final java.lang.Class type;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Contact extends org.simpleframework.xml.core.ParameterContact<org.simpleframework.xml.Text> {
        public Contact(org.simpleframework.xml.Text r1, java.lang.reflect.Constructor r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.simpleframework.xml.core.ParameterContact, org.simpleframework.xml.core.Contact
        public java.lang.String getName() {
                r0 = this;
                java.lang.String r0 = ""
                return r0
        }
    }

    public TextParameter(java.lang.reflect.Constructor r2, org.simpleframework.xml.Text r3, org.simpleframework.xml.stream.Format r4, int r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.TextParameter$Contact r0 = new org.simpleframework.xml.core.TextParameter$Contact
            r0.<init>(r3, r2, r5)
            r1.contact = r0
            org.simpleframework.xml.core.TextLabel r2 = new org.simpleframework.xml.core.TextLabel
            r2.<init>(r0, r3, r4)
            r1.label = r2
            org.simpleframework.xml.core.Expression r3 = r2.getExpression()
            r1.expression = r3
            java.lang.String r3 = r2.getPath()
            r1.path = r3
            java.lang.Class r3 = r2.getType()
            r1.type = r3
            java.lang.String r3 = r2.getName()
            r1.name = r3
            java.lang.Object r2 = r2.getKey()
            r1.key = r2
            r1.index = r5
            return
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            org.simpleframework.xml.core.TextParameter$Contact r0 = r0.contact
            java.lang.annotation.Annotation r0 = r0.getAnnotation()
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public org.simpleframework.xml.core.Expression getExpression() {
            r0 = this;
            org.simpleframework.xml.core.Expression r0 = r0.expression
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public int getIndex() {
            r0 = this;
            int r0 = r0.index
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.key
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public java.lang.String getName(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String getPath() {
            r0 = this;
            java.lang.String r0 = r0.path
            return r0
    }

    public java.lang.String getPath(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isPrimitive() {
            r0 = this;
            java.lang.Class r0 = r0.type
            boolean r0 = r0.isPrimitive()
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isRequired() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isRequired()
            return r0
    }

    @Override // org.simpleframework.xml.core.TemplateParameter, org.simpleframework.xml.core.Parameter
    public boolean isText() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String toString() {
            r0 = this;
            org.simpleframework.xml.core.TextParameter$Contact r0 = r0.contact
            java.lang.String r0 = r0.toString()
            return r0
    }
}
