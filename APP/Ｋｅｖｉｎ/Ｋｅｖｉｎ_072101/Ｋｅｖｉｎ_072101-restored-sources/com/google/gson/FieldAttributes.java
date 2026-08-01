package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldAttributes {
    private final java.lang.reflect.Field field;

    public FieldAttributes(java.lang.reflect.Field r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r1.field = r0
            return
    }

    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r2)
            return r0
    }

    public java.util.Collection<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public java.lang.Class<?> getDeclaredClass() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public java.lang.reflect.Type getDeclaredType() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.reflect.Type r0 = r0.getGenericType()
            return r0
    }

    public java.lang.Class<?> getDeclaringClass() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.String r0 = r0.getName()
            return r0
    }

    public boolean hasModifier(int r2) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            int r0 = r0.getModifiers()
            r0 = r0 & r2
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.String r0 = r0.toString()
            return r0
    }
}
