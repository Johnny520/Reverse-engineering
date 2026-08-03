package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
class Reference implements org.simpleframework.xml.strategy.Value {
    private java.lang.Class actual;
    private java.lang.Object data;
    private org.simpleframework.xml.strategy.Value value;

    public Reference(org.simpleframework.xml.strategy.Value r1, java.lang.Object r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>()
            r0.actual = r3
            r0.value = r1
            r0.data = r2
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
            java.lang.Object r0 = r1.data
            if (r0 == 0) goto L9
            java.lang.Class r0 = r0.getClass()
            return r0
        L9:
            java.lang.Class r0 = r1.actual
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.data
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            if (r0 == 0) goto L7
            r0.setValue(r2)
        L7:
            r1.data = r2
            return
    }
}
