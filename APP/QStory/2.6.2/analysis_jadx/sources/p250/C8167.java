package p250;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f22504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f22505;

    public C8167(boolean z, boolean z2, boolean z3) {
        this.f22505 = z;
        this.f22504 = z2;
        this.f22503 = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigRenderOptions(");
        if (this.f22505) {
            sb.append("originComments,");
        }
        if (this.f22504) {
            sb.append("comments,");
        }
        if (this.f22503) {
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
