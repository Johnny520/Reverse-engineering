package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0309;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0386 implements InterfaceC0309 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f1297;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f1298;

    public C0386(int i) {
        switch (i) {
            case 2:
                break;
            default:
                this.f1298 = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f1297 = Math.max(1.0E-4f, 2.0f) * (-4.2f);
                break;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public float mo435(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f1297));
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo438() {
        return this.f1298;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double m1077(float f) {
        float[] fArr = AbstractC0403.f1345;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f1298 * this.f1297)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0383 m1078(float f) {
        double dM1077 = m1077(f);
        double d = AbstractC0385.f1296;
        double d2 = d - 1.0d;
        return new C0383(f, (float) (Math.exp((d / d2) * dM1077) * ((double) (this.f1298 * this.f1297))), (long) (Math.exp(dM1077 / d2) * 1000.0d));
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public float mo445(float f, float f2) {
        if (Math.abs(f2) <= this.f1298) {
            return f;
        }
        double dLog = Math.log(Math.abs(r1 / f2));
        float f3 = this.f1297;
        return ((f2 / f3) * ((float) Math.exp((((double) f3) * ((dLog / ((double) f3)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public float mo449(float f, float f2, long j) {
        float f3 = this.f1297;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public long mo450(float f) {
        return ((long) ((((float) Math.log(this.f1298 / Math.abs(f))) * 1000.0f) / this.f1297)) * 1000000;
    }
}
