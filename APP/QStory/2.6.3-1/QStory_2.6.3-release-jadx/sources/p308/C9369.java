package p308;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f24136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9387 f24141;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f24142;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f24143;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f24144;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f24145;

    public C9369(C9387 c9387, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f24141 = c9387;
        this.f24140 = i;
        this.f24139 = i2;
        this.f24138 = i3;
        this.f24137 = i4;
        this.f24136 = i5;
        this.f24143 = i6;
        this.f24142 = i7;
        this.f24144 = i8;
        this.f24145 = i9;
    }

    public final String toString() {
        int i = this.f24139;
        int i2 = this.f24137;
        C9387 c9387 = this.f24141;
        if (c9387 == null) {
            return i + " " + i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) c9387.f24230.get(i));
        if (i2 != -1) {
            sb.append(" extends ");
            sb.append((String) c9387.f24230.get(i2));
        }
        return sb.toString();
    }
}
