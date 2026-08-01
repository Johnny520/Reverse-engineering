package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1153 implements InterfaceC1156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f1388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1181 f1390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f1391;

    public C1153(int i, int i2, InterfaceC1181 interfaceC1181) {
        this.f1391 = i;
        this.f1390 = interfaceC1181;
        this.f1389 = ((long) i) * 1000000;
        this.f1388 = ((long) i2) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC1156
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo1494(long j, float f, float f2, float f3) {
        long j2 = j - this.f1388;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f1389;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo1411 = this.f1390.mo1411(this.f1391 == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo1411) + ((1.0f - fMo1411) * f);
    }

    @Override // androidx.compose.animation.core.InterfaceC1156
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long mo1495(float f, float f2, float f3) {
        return this.f1388 + this.f1389;
    }

    @Override // androidx.compose.animation.core.InterfaceC1156
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float mo1496(long j, float f, float f2, float f3) {
        long j2 = j - this.f1388;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f1389;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo1494(j4, f, f2, f3) - mo1494(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }
}
