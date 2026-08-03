package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
class Reference implements org.simpleframework.xml.strategy.Value {
    private java.lang.Class type;
    private java.lang.Object value;

    public Reference(java.lang.Object r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    @Override // org.simpleframework.xml.strategy.Value
    public int getLength() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(java.lang.Object r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
