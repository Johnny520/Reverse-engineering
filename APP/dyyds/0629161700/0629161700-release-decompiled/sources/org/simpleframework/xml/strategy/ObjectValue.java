package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ObjectValue implements org.simpleframework.xml.strategy.Value {
    private java.lang.Class type;
    private java.lang.Object value;

    public ObjectValue(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    @Override // org.simpleframework.xml.strategy.Value
    public int getLength() {
            r0 = this;
            r0 = 0
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
            java.lang.Object r0 = r0.value
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
            r0 = this;
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
