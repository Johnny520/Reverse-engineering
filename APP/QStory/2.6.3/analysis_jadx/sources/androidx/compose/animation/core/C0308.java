package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0308 implements InterfaceC0310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0296 f1047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1048;

    public C0308(float f, float f2, float f3) {
        this.f1048 = f3;
        C0296 c0296 = new C0296();
        c0296.f1027 = 1.0f;
        c0296.f1026 = Math.sqrt(50.0d);
        c0296.f1025 = 1.0f;
        if (f < 0.0f) {
            AbstractC0300.m929("Damping ratio must be non-negative");
        }
        c0296.f1025 = f;
        double d = c0296.f1026;
        if (((float) (d * d)) <= 0.0f) {
            AbstractC0300.m929("Spring stiffness constant must be positive.");
        }
        c0296.f1026 = Math.sqrt(f2);
        this.f1047 = c0296;
    }

    @Override // androidx.compose.animation.core.InterfaceC0310
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo934(long j, float f, float f2, float f3) {
        C0296 c0296 = this.f1047;
        c0296.f1027 = f2;
        return Float.intBitsToFloat((int) (c0296.m926(f, f3, j / 1000000) >> 32));
    }

    @Override // androidx.compose.animation.core.InterfaceC0310
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float mo937(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    @Override // androidx.compose.animation.core.InterfaceC0310
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo935(float r34, float r35, float r36) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.C0308.mo935(float, float, float):long");
    }

    @Override // androidx.compose.animation.core.InterfaceC0310
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo936(long j, float f, float f2, float f3) {
        C0296 c0296 = this.f1047;
        c0296.f1027 = f2;
        return Float.intBitsToFloat((int) (c0296.m926(f, f3, j / 1000000) & 4294967295L));
    }
}
