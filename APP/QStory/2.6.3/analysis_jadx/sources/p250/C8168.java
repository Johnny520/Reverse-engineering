package p250;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8168 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f22502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f22503;

    public C8168(boolean z, boolean z2, boolean z3) {
        this.f22503 = z;
        this.f22502 = z2;
        this.f22501 = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigRenderOptions(");
        if (this.f22503) {
            sb.append("originComments,");
        }
        if (this.f22502) {
            sb.append("comments,");
        }
        if (this.f22501) {
            sb.append("formatted,");
        }
        sb.append("json,");
        sb.append("showEnvVariableValues,");
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setLength(sb.length() - 1);
        }
        sb.append(")");
        return sb.toString();
    }
}
