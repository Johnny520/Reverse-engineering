package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BeanContext {
    private final java.lang.Class beanClass;
    private final long features;
    private final java.lang.reflect.Field field;
    private final java.lang.Class fieldClass;
    private final java.lang.reflect.Type fieldType;
    private final java.lang.String format;
    private final java.lang.String label;
    private final java.lang.reflect.Method method;
    private final java.lang.String name;

    public BeanContext(java.lang.Class r1, java.lang.reflect.Method r2, java.lang.reflect.Field r3, java.lang.String r4, java.lang.String r5, java.lang.Class r6, java.lang.reflect.Type r7, long r8, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.beanClass = r1
            r0.method = r2
            r0.field = r3
            r0.name = r4
            r0.label = r5
            r0.fieldClass = r6
            r0.fieldType = r7
            r0.features = r8
            r0.format = r10
            return
    }

    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method
            if (r0 == 0) goto L9
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r3)
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L15
            java.lang.reflect.Field r1 = r2.field
            if (r1 == 0) goto L15
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            return r3
        L15:
            return r0
    }

    public java.lang.Class<?> getBeanClass() {
            r1 = this;
            java.lang.Class r0 = r1.beanClass
            return r0
    }

    public long getFeatures() {
            r2 = this;
            long r0 = r2.features
            return r0
    }

    public java.lang.reflect.Field getField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            return r0
    }

    public java.lang.Class<?> getFieldClass() {
            r1 = this;
            java.lang.Class r0 = r1.fieldClass
            return r0
    }

    public java.lang.reflect.Type getFieldType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.fieldType
            return r0
    }

    public java.lang.String getFormat() {
            r1 = this;
            java.lang.String r0 = r1.format
            return r0
    }

    public java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public java.lang.reflect.Method getMethod() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public boolean isJsonDirect() {
            r4 = this;
            long r0 = r4.features
            r2 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
