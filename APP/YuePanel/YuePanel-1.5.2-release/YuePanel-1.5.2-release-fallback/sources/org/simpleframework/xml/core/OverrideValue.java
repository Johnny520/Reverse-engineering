package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class OverrideValue implements org.simpleframework.xml.strategy.Value {
    private final java.lang.Class type;
    private final org.simpleframework.xml.strategy.Value value;

    public OverrideValue(org.simpleframework.xml.strategy.Value r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    @Override // org.simpleframework.xml.strategy.Value
    public int getLength() {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            int r0 = r0.getLength()
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
            org.simpleframework.xml.strategy.Value r0 = r1.value
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            boolean r0 = r0.isReference()
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            r0.setValue(r2)
            return
    }
}
