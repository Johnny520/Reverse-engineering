package p228;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8773 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f22333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f22334 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8780 f22335;

    public C8773(C8780 c8780) {
        this.f22335 = c8780;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m13988(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2 = 1;
        C8780 c8780 = this.f22335;
        if (z) {
            int iM13991 = AbstractC8777.m13991(c8780.f22346, i, z);
            z4 = i == c8780.f22346.getLineStart(iM13991) || i == c8780.m13998(iM13991);
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f22334 == i4) {
            return this.f22333;
        }
        float fM14004 = z3 ? c8780.m14004(i, z) : c8780.m14006(i, z);
        if (z2) {
            this.f22334 = i4;
            this.f22333 = fM14004;
        }
        return fM14004;
    }
}
