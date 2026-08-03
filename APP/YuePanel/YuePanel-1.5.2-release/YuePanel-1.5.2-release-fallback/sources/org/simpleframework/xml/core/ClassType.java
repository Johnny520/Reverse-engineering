package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ClassType implements org.simpleframework.xml.strategy.Type {
    private final java.lang.Class type;

    public ClassType(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.type
            java.lang.String r0 = r0.toString()
            return r0
    }
}
