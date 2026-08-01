package p165;

import androidx.compose.animation.C0386;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7677 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public double f20839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public double f20840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public double f20841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double f20843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public double f20844;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public double f20845;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public double f20846;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public double f20847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0386 f20848;

    public C7677() {
        this.f20844 = Math.sqrt(1500.0d);
        this.f20843 = 0.5d;
        this.f20842 = false;
        this.f20847 = Double.MAX_VALUE;
        this.f20848 = new C0386();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0386 m12983(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f20842) {
            if (this.f20847 == Double.MAX_VALUE) {
                C5925.m11311("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.f20843;
            if (d3 > 1.0d) {
                double d4 = this.f20844;
                this.f20839 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f20843;
                double d6 = this.f20844;
                this.f20846 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f20845 = Math.sqrt(1.0d - (d3 * d3)) * this.f20844;
            }
            this.f20842 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f20847;
        double d9 = this.f20843;
        if (d9 > 1.0d) {
            double d10 = this.f20846;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f20839);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f20839 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f20846;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f20839;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f20844;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f20844) * d7) * d17;
            double d18 = -this.f20844;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f20845;
            double d20 = this.f20844;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f20845 * d7) * d21) + (Math.cos(this.f20845 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f20844;
            double d23 = this.f20843;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f20845;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f20845;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f20847);
        C0386 c0386 = this.f20848;
        c0386.f1298 = f;
        c0386.f1297 = (float) dCos;
        return c0386;
    }

    public C7677(float f) {
        this.f20844 = Math.sqrt(1500.0d);
        this.f20843 = 0.5d;
        this.f20842 = false;
        this.f20848 = new C0386();
        this.f20847 = f;
    }
}
