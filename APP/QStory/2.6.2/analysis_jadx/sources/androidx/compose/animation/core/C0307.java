package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0307 implements InterfaceC0310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f1043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0335 f1045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f1046;

    public C0307(int i, int i2, InterfaceC0335 interfaceC0335) {
        this.f1046 = i;
        this.f1045 = interfaceC0335;
        this.f1044 = ((long) i) * 1000000;
        this.f1043 = ((long) i2) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC0310
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo933(long j, float f, float f2, float f3) {
        long j2 = j - this.f1043;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f1044;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo850 = this.f1045.mo850(this.f1046 == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo850) + ((1.0f - fMo850) * f);
    }

    @Override // androidx.compose.animation.core.InterfaceC0310
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long mo934(float f, float f2, float f3) {
        return this.f1043 + this.f1044;
    }

    @Override // androidx.compose.animation.core.InterfaceC0310
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float mo935(long j, float f, float f2, float f3) {
        long j2 = j - this.f1043;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f1044;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo933(j4, f, f2, f3) - mo933(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }
}
