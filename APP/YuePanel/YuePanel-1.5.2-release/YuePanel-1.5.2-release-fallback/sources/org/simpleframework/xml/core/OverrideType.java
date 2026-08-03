package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class OverrideType implements org.simpleframework.xml.strategy.Type {
    private final java.lang.Class override;
    private final org.simpleframework.xml.strategy.Type type;

    public OverrideType(org.simpleframework.xml.strategy.Type r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.override = r2
            r0.type = r1
            return
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Type r0 = r1.type
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.override
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.String toString() {
            r1 = this;
            org.simpleframework.xml.strategy.Type r0 = r1.type
            java.lang.String r0 = r0.toString()
            return r0
    }
}
