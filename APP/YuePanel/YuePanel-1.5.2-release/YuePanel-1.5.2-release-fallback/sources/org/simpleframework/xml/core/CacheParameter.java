package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class CacheParameter implements org.simpleframework.xml.core.Parameter {
    private final java.lang.annotation.Annotation annotation;
    private final boolean attribute;
    private final org.simpleframework.xml.core.Expression expression;
    private final int index;
    private final java.lang.Object key;
    private final java.lang.String name;
    private final java.lang.String path;
    private final boolean primitive;
    private final boolean required;
    private final java.lang.String string;
    private final boolean text;
    private final java.lang.Class type;

    public CacheParameter(org.simpleframework.xml.core.Parameter r2, org.simpleframework.xml.core.Label r3) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            java.lang.annotation.Annotation r0 = r2.getAnnotation()
            r1.annotation = r0
            org.simpleframework.xml.core.Expression r0 = r2.getExpression()
            r1.expression = r0
            boolean r0 = r2.isAttribute()
            r1.attribute = r0
            boolean r0 = r2.isPrimitive()
            r1.primitive = r0
            boolean r0 = r3.isRequired()
            r1.required = r0
            java.lang.String r0 = r2.toString()
            r1.string = r0
            boolean r0 = r2.isText()
            r1.text = r0
            int r0 = r2.getIndex()
            r1.index = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            java.lang.String r0 = r2.getPath()
            r1.path = r0
            java.lang.Class r2 = r2.getType()
            r1.type = r2
            java.lang.Object r2 = r3.getKey()
            r1.key = r2
            return
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.annotation
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
    public boolean isAttribute() {
            r1 = this;
            boolean r0 = r1.attribute
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isPrimitive() {
            r1 = this;
            boolean r0 = r1.primitive
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isRequired() {
            r1 = this;
            boolean r0 = r1.required
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isText() {
            r1 = this;
            boolean r0 = r1.text
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.string
            return r0
    }
}
