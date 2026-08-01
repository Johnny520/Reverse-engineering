package bsh;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3501 implements InterfaceC3448 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC3452 f8348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f8349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f8350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f8351;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ReturnControl: ");
        int i = this.f8351;
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
        sb.append(this.f8349);
        sb.append(": from: ");
        sb.append(this.f8348);
        return sb.toString();
    }
}
