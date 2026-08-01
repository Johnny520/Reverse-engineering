package top.yukonga.miuix.kmp.utils;

import p000.AbstractC6087;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6043 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public double f16521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public double f16522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public double f16523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public double f16524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double f16525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6052 f16526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m11350(float f) {
        C6052 c6052 = this.f16526;
        if (c6052 == null) {
            return false;
        }
        float fM11419 = AbstractC6087.m11419(f, 0.001f, 0.016f);
        double d = this.f16525;
        double d2 = this.f16524;
        double d3 = this.f16523;
        double d4 = fM11419;
        double d5 = (d * (1.0d - (c6052.f16547 * d4))) + ((d3 - d2) * c6052.f16546 * d4);
        this.f16525 = d5;
        double d6 = (d4 * d5) + d2;
        this.f16524 = d6;
        double d7 = this.f16522;
        if ((d7 >= d3 || d6 <= d3) && ((d7 <= d3 || d6 >= d3) && ((d7 != d3 || Math.signum(this.f16521) == Math.signum(this.f16524)) && Math.abs(this.f16524 - this.f16523) >= 1.0d))) {
            return false;
        }
        this.f16524 = this.f16523;
        this.f16525 = 0.0d;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11351(float f, float f2) {
        double d = f;
        this.f16524 = d;
        this.f16522 = d;
        this.f16523 = 0.0d;
        double d2 = f2;
        this.f16525 = d2;
        this.f16521 = d2;
        this.f16526 = new C6052(((double) Math.abs(f2)) > 5000.0d ? 0.55f : 0.4f);
    }
}
