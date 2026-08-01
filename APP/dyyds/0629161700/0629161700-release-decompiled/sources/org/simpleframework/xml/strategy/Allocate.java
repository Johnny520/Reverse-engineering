package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Allocate implements org.simpleframework.xml.strategy.Value {
    private java.lang.String key;
    private java.util.Map map;
    private org.simpleframework.xml.strategy.Value value;

    public Allocate(org.simpleframework.xml.strategy.Value r1, java.util.Map r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.map = r2
            r0.key = r3
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
            org.simpleframework.xml.strategy.Value r0 = r0.value
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public java.lang.Object getValue() {
            r1 = this;
            java.util.Map r0 = r1.map
            java.lang.String r1 = r1.key
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = r2.key
            if (r0 == 0) goto L9
            java.util.Map r1 = r2.map
            r1.put(r0, r3)
        L9:
            org.simpleframework.xml.strategy.Value r2 = r2.value
            r2.setValue(r3)
            return
    }
}
