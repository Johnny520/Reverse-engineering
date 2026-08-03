package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ReturnControl implements ParserConstants {
    public int kind;
    public String label;
    public Node returnPoint;
    public Object value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ReturnControl(int i9, String str, Node node) {
        this.label = null;
        this.value = Primitive.VOID;
        this.kind = i9;
        this.label = str;
        this.returnPoint = node;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ReturnControl: ");
        int i9 = this.kind;
        if (i9 == 13) {
            str = "BREAK ";
        } else if (i9 == 47) {
            str = "RETURN ";
        } else if (i9 == 20) {
            str = "CONTINUE ";
        } else {
            str = "DUNNO?? " + this.kind;
        }
        sb2.append(str);
        sb2.append(this.label);
        sb2.append(": from: ");
        sb2.append(this.returnPoint);
        return sb2.toString();
    }

    public ReturnControl(int i9, Object obj, Node node) {
        this.label = null;
        Primitive primitive = Primitive.TRUE;
        this.kind = i9;
        this.value = obj;
        this.returnPoint = node;
    }
}
