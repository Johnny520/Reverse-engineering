package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f23800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f23801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f23804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8566 f23805;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f23806;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f23807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f23808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f23809;

    public C8548(C8566 c8566, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f23805 = c8566;
        this.f23804 = i;
        this.f23803 = i2;
        this.f23802 = i3;
        this.f23801 = i4;
        this.f23800 = i5;
        this.f23807 = i6;
        this.f23806 = i7;
        this.f23808 = i8;
        this.f23809 = i9;
    }

    public final String toString() {
        int i = this.f23803;
        int i2 = this.f23801;
        C8566 c8566 = this.f23805;
        if (c8566 == null) {
            return i + " " + i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) c8566.f23894.get(i));
        if (i2 != -1) {
            sb.append(" extends ");
            sb.append((String) c8566.f23894.get(i2));
        }
        return sb.toString();
    }
}
