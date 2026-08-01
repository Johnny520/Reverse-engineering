package top.yukonga.miuix.kmp.utils;

import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public double f16530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public double f16531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public double f16532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public double f16533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double f16534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6058 f16535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m11410(float f) {
        C6058 c6058 = this.f16535;
        if (c6058 == null) {
            return false;
        }
        float fM5071 = AbstractC2567.m5071(f, 0.001f, 0.016f);
        double d = this.f16534;
        double d2 = this.f16533;
        double d3 = this.f16532;
        double d4 = fM5071;
        double d5 = (d * (1.0d - (c6058.f16556 * d4))) + ((d3 - d2) * c6058.f16555 * d4);
        this.f16534 = d5;
        double d6 = (d4 * d5) + d2;
        this.f16533 = d6;
        double d7 = this.f16531;
        if ((d7 >= d3 || d6 <= d3) && ((d7 <= d3 || d6 >= d3) && ((d7 != d3 || Math.signum(this.f16530) == Math.signum(this.f16533)) && Math.abs(this.f16533 - this.f16532) >= 1.0d))) {
            return false;
        }
        this.f16533 = this.f16532;
        this.f16534 = 0.0d;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11411(float f, float f2) {
        double d = f;
        this.f16533 = d;
        this.f16531 = d;
        this.f16532 = 0.0d;
        double d2 = f2;
        this.f16534 = d2;
        this.f16530 = d2;
        this.f16535 = new C6058(((double) Math.abs(f2)) > 5000.0d ? 0.55f : 0.4f);
    }
}
