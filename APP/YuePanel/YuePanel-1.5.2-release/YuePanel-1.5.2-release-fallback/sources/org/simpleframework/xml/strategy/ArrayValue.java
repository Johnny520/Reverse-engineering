package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
class ArrayValue implements org.simpleframework.xml.strategy.Value {
    private int size;
    private java.lang.Class type;
    private java.lang.Object value;

    public ArrayValue(java.lang.Class r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.size = r2
            return
    }

    @Override // org.simpleframework.xml.strategy.Value
    public int getLength() {
            r1 = this;
            int r0 = r1.size
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
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(java.lang.Object r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
