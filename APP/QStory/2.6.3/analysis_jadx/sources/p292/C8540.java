package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8540 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f23791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f23792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23793;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f23795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8558 f23796;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f23797;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f23798;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f23799;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f23800;

    public C8540(C8558 c8558, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f23796 = c8558;
        this.f23795 = i;
        this.f23794 = i2;
        this.f23793 = i3;
        this.f23792 = i4;
        this.f23791 = i5;
        this.f23798 = i6;
        this.f23797 = i7;
        this.f23799 = i8;
        this.f23800 = i9;
    }

    public final String toString() {
        int i = this.f23794;
        int i2 = this.f23792;
        C8558 c8558 = this.f23796;
        if (c8558 == null) {
            return i + " " + i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) c8558.f23885.get(i));
        if (i2 != -1) {
            sb.append(" extends ");
            sb.append((String) c8558.f23885.get(i2));
        }
        return sb.toString();
    }
}
