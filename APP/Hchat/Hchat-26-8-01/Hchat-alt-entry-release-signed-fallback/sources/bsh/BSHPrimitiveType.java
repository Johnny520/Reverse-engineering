package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimitiveType extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    public java.lang.Class<?> type;

    public BSHPrimitiveType(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            return r0
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.Class<?> r1 = r2.type
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
