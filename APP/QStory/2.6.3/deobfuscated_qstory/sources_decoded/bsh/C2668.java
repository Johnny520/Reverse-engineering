package bsh;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2668 implements InterfaceC2615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC2619 f8003;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f8004;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f8005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f8006;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ReturnControl: ");
        int i = this.f8006;
        if (i == 13) {
            str = "BREAK ";
        } else if (i == 47) {
            str = "RETURN ";
        } else if (i == 20) {
            str = "CONTINUE ";
        } else {
            str = "DUNNO?? " + i;
        }
        sb.append(str);
        sb.append(this.f8004);
        sb.append(": from: ");
        sb.append(this.f8003);
        return sb.toString();
    }
}
