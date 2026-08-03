package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimitiveType extends SimpleNode {
    private static final long serialVersionUID = 1;
    public Class<?> type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHPrimitiveType(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.type;
    }
}
