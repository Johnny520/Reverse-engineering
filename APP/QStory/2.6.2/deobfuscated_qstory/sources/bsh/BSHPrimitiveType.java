package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimitiveType extends SimpleNode {
    public Class<?> type;

    public BSHPrimitiveType(int i) {
        super(i);
    }

    public Class<?> getType() {
        return this.type;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.type;
    }
}
