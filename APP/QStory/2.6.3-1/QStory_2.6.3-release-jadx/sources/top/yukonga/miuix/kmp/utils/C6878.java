package top.yukonga.miuix.kmp.utils;

import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6878 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public double f16875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public double f16876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public double f16877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public double f16878;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double f16879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6887 f16880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m11969(float f) {
        C6887 c6887 = this.f16880;
        if (c6887 == null) {
            return false;
        }
        float fM5631 = AbstractC3400.m5631(f, 0.001f, 0.016f);
        double d = this.f16879;
        double d2 = this.f16878;
        double d3 = this.f16877;
        double d4 = fM5631;
        double d5 = (d * (1.0d - (c6887.f16901 * d4))) + ((d3 - d2) * c6887.f16900 * d4);
        this.f16879 = d5;
        double d6 = (d4 * d5) + d2;
        this.f16878 = d6;
        double d7 = this.f16876;
        if ((d7 >= d3 || d6 <= d3) && ((d7 <= d3 || d6 >= d3) && ((d7 != d3 || Math.signum(this.f16875) == Math.signum(this.f16878)) && Math.abs(this.f16878 - this.f16877) >= 1.0d))) {
            return false;
        }
        this.f16878 = this.f16877;
        this.f16879 = 0.0d;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11970(float f, float f2) {
        double d = f;
        this.f16878 = d;
        this.f16876 = d;
        this.f16877 = 0.0d;
        double d2 = f2;
        this.f16879 = d2;
        this.f16875 = d2;
        this.f16880 = new C6887(((double) Math.abs(f2)) > 5000.0d ? 0.55f : 0.4f);
    }
}
