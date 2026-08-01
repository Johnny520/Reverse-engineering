package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
