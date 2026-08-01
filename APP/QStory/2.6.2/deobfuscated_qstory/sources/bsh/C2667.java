package bsh;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2667 implements InterfaceC2614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC2618 f8001;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f8002;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f8003;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f8004;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ReturnControl: ");
        int i = this.f8004;
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
        sb.append(this.f8002);
        sb.append(": from: ");
        sb.append(this.f8001);
        return sb.toString();
    }
}
