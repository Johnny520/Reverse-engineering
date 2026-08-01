package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.String toString() {
            r0 = this;
            java.lang.Class r0 = r0.type
            java.lang.String r0 = r0.toString()
            return r0
    }
}
