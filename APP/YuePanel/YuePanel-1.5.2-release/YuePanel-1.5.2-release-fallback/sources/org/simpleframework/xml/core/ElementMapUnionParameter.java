package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ElementMapUnionParameter extends org.simpleframework.xml.core.TemplateParameter {
    private final org.simpleframework.xml.core.ElementMapUnionParameter.Contact contact;
    private final org.simpleframework.xml.core.Expression expression;
    private final int index;
    private final java.lang.Object key;
    private final org.simpleframework.xml.core.Label label;
    private final java.lang.String name;
    private final java.lang.String path;
    private final java.lang.Class type;

    public static class Contact extends org.simpleframework.xml.core.ParameterContact<org.simpleframework.xml.ElementMap> {
        public Contact(org.simpleframework.xml.ElementMap r1, java.lang.reflect.Constructor r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.simpleframework.xml.core.ParameterContact, org.simpleframework.xml.core.Contact
        public java.lang.String getName() {
                r1 = this;
                T extends java.lang.annotation.Annotation r0 = r1.label
                org.simpleframework.xml.ElementMap r0 = (org.simpleframework.xml.ElementMap) r0
                java.lang.String r0 = r0.name()
                return r0
        }
    }

    public ElementMapUnionParameter(java.lang.reflect.Constructor r2, org.simpleframework.xml.ElementMapUnion r3, org.simpleframework.xml.ElementMap r4, org.simpleframework.xml.stream.Format r5, int r6) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ElementMapUnionParameter$Contact r0 = new org.simpleframework.xml.core.ElementMapUnionParameter$Contact
            r0.<init>(r4, r2, r6)
            r1.contact = r0
            org.simpleframework.xml.core.ElementMapUnionLabel r2 = new org.simpleframework.xml.core.ElementMapUnionLabel
            r2.<init>(r0, r3, r4, r5)
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
            r1.index = r6
            return
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            org.simpleframework.xml.core.ElementMapUnionParameter$Contact r0 = r1.contact
            java.lang.annotation.Annotation r0 = r0.getAnnotation()
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public org.simpleframework.xml.core.Expression getExpression() {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.expression
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.key
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isPrimitive() {
            r1 = this;
            java.lang.Class r0 = r1.type
            boolean r0 = r0.isPrimitive()
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isRequired() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            boolean r0 = r0.isRequired()
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String toString() {
            r1 = this;
            org.simpleframework.xml.core.ElementMapUnionParameter$Contact r0 = r1.contact
            java.lang.String r0 = r0.toString()
            return r0
    }
}
