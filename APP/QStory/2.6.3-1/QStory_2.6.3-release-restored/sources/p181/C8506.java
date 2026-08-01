package p181;

import androidx.compose.animation.C1232;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8506 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public double f21184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public double f21185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public double f21186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f21187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double f21188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public double f21189;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public double f21190;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public double f21191;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public double f21192;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1232 f21193;

    public C8506() {
        this.f21189 = Math.sqrt(1500.0d);
        this.f21188 = 0.5d;
        this.f21187 = false;
        this.f21192 = Double.MAX_VALUE;
        this.f21193 = new C1232();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1232 m13542(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f21187) {
            if (this.f21192 == Double.MAX_VALUE) {
                C6755.m11870("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.f21188;
            if (d3 > 1.0d) {
                double d4 = this.f21189;
                this.f21184 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f21188;
                double d6 = this.f21189;
                this.f21191 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f21190 = Math.sqrt(1.0d - (d3 * d3)) * this.f21189;
            }
            this.f21187 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f21192;
        double d9 = this.f21188;
        if (d9 > 1.0d) {
            double d10 = this.f21191;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f21184);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f21184 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f21191;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f21184;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f21189;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f21189) * d7) * d17;
            double d18 = -this.f21189;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f21190;
            double d20 = this.f21189;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f21190 * d7) * d21) + (Math.cos(this.f21190 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f21189;
            double d23 = this.f21188;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f21190;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f21190;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f21192);
        C1232 c1232 = this.f21193;
        c1232.f1643 = f;
        c1232.f1642 = (float) dCos;
        return c1232;
    }

    public C8506(float f) {
        this.f21189 = Math.sqrt(1500.0d);
        this.f21188 = 0.5d;
        this.f21187 = false;
        this.f21193 = new C1232();
        this.f21192 = f;
    }
}
