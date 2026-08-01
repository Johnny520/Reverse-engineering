package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC1155;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1232 implements InterfaceC1155 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f1642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f1643;

    public C1232(int i) {
        switch (i) {
            case 2:
                break;
            default:
                this.f1643 = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f1642 = Math.max(1.0E-4f, 2.0f) * (-4.2f);
                break;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public float mo996(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f1642));
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo999() {
        return this.f1643;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double m1638(float f) {
        float[] fArr = AbstractC1249.f1690;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f1643 * this.f1642)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1229 m1639(float f) {
        double dM1638 = m1638(f);
        double d = AbstractC1231.f1641;
        double d2 = d - 1.0d;
        return new C1229(f, (float) (Math.exp((d / d2) * dM1638) * ((double) (this.f1643 * this.f1642))), (long) (Math.exp(dM1638 / d2) * 1000.0d));
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public float mo1010(float f, float f2, long j) {
        float f3 = this.f1642;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public long mo1011(float f) {
        return ((long) ((((float) Math.log(this.f1643 / Math.abs(f))) * 1000.0f) / this.f1642)) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public float mo1012(float f, float f2) {
        if (Math.abs(f2) <= this.f1643) {
            return f;
        }
        double dLog = Math.log(Math.abs(r1 / f2));
        float f3 = this.f1642;
        return ((f2 / f3) * ((float) Math.exp((((double) f3) * ((dLog / ((double) f3)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }
}
