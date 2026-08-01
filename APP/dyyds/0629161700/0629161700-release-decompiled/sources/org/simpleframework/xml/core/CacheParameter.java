package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    public CacheParameter(org.simpleframework.xml.core.Parameter r2, org.simpleframework.xml.core.Label r3) {
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
            r0 = this;
            java.lang.annotation.Annotation r0 = r0.annotation
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

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String getPath() {
            r0 = this;
            java.lang.String r0 = r0.path
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isAttribute() {
            r0 = this;
            boolean r0 = r0.attribute
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isPrimitive() {
            r0 = this;
            boolean r0 = r0.primitive
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isRequired() {
            r0 = this;
            boolean r0 = r0.required
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isText() {
            r0 = this;
            boolean r0 = r0.text
            return r0
    }

    @Override // org.simpleframework.xml.core.Parameter
    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.string
            return r0
    }
}
