package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = this;
            org.simpleframework.xml.strategy.Value r0 = r0.value
            int r0 = r0.getLength()
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public java.lang.Object getValue() {
            r0 = this;
            org.simpleframework.xml.strategy.Value r0 = r0.value
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
            r0 = this;
            org.simpleframework.xml.strategy.Value r0 = r0.value
            boolean r0 = r0.isReference()
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.strategy.Value r0 = r0.value
            r0.setValue(r1)
            return
    }
}
