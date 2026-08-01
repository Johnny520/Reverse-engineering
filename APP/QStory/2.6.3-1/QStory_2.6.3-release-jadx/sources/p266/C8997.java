package p266;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8997 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f22847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f22848;

    public C8997(boolean z, boolean z2, boolean z3) {
        this.f22848 = z;
        this.f22847 = z2;
        this.f22846 = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigRenderOptions(");
        if (this.f22848) {
            sb.append("originComments,");
        }
        if (this.f22847) {
            sb.append("comments,");
        }
        if (this.f22846) {
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
