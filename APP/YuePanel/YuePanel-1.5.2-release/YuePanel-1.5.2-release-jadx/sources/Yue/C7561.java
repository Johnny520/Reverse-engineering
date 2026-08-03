package Yue;

import Yue.AbstractC4565;
import Yue.InterfaceC7144;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7561 implements InterfaceC5061 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final float f22840 = 10000.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final float f22841 = 1500.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final float f22842 = 200.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final float f22843 = 50.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final float f22844 = 0.2f;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final float f22845 = 0.5f;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final float f22846 = 0.75f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float f22847 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final double f22848 = 62.5d;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final double f22849 = Double.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ */
    public double f2944;

    /* JADX INFO: renamed from: ۥ۟ */
    public double f2945;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f22850;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public double f22851;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double f22852;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public double f22853;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public double f22854;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public double f22855;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public double f22856;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final AbstractC4565.C4579 f22857;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7561() {
        this.f2944 = Math.sqrt(1500.0d);
        this.f2945 = 0.5d;
        this.f22850 = false;
        this.f22856 = Double.MAX_VALUE;
        this.f22857 = new AbstractC4565.C4579();
    }

    @Override // Yue.InterfaceC5061
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1790(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f22852 && ((double) Math.abs(f - m23666())) < this.f22851;
    }

    @Override // Yue.InterfaceC5061
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo1791(float f, float f2) {
        float fM23666 = f - m23666();
        double d = this.f2944;
        return (float) (((-(d * d)) * ((double) fM23666)) - (((d * 2.0d) * this.f2945) * ((double) f2)));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m23665() {
        return (float) this.f2945;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m23666() {
        return (float) this.f22856;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m23667() {
        double d = this.f2944;
        return (float) (d * d);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m23668() {
        if (this.f22850) {
            return;
        }
        if (this.f22856 == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.f2945;
        if (d > 1.0d) {
            double d2 = this.f2944;
            this.f22853 = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f2945;
            double d4 = this.f2944;
            this.f22854 = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.f22855 = this.f2944 * Math.sqrt(1.0d - (d * d));
        }
        this.f22850 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C7561 m23669(@InterfaceC4885(from = 0.0d) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f2945 = f;
        this.f22850 = false;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C7561 m23670(float f) {
        this.f22856 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C7561 m23671(@InterfaceC4885(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f2944 = Math.sqrt(f);
        this.f22850 = false;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m23672(double d) {
        double dAbs = Math.abs(d);
        this.f22851 = dAbs;
        this.f22852 = dAbs * 62.5d;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public AbstractC4565.C4579 m23673(double d, double d2, long j) {
        double dCos;
        double dPow;
        m23668();
        double d3 = j / 1000.0d;
        double d4 = d - this.f22856;
        double d5 = this.f2945;
        if (d5 > 1.0d) {
            double d6 = this.f22854;
            double d7 = this.f22853;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f22853 * d3) * d9);
            double d10 = this.f22854;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f22853;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f2944;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f2944) * d3);
            double d15 = this.f2944;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.f22855;
            double d17 = this.f2944;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            double dPow4 = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.f22855 * d3) * d4) + (Math.sin(this.f22855 * d3) * d18));
            double d19 = this.f2944;
            double d20 = this.f2945;
            double d21 = (-d19) * dPow4 * d20;
            double dPow5 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d22 = this.f22855;
            double dSin = (-d22) * d4 * Math.sin(d22 * d3);
            double d23 = this.f22855;
            dCos = d21 + (dPow5 * (dSin + (d18 * d23 * Math.cos(d23 * d3))));
            dPow = dPow4;
        }
        AbstractC4565.C4579 c4579 = this.f22857;
        c4579.f979 = (float) (dPow + this.f22856);
        c4579.f980 = (float) dCos;
        return c4579;
    }

    public C7561(float f) {
        this.f2944 = Math.sqrt(1500.0d);
        this.f2945 = 0.5d;
        this.f22850 = false;
        this.f22856 = Double.MAX_VALUE;
        this.f22857 = new AbstractC4565.C4579();
        this.f22856 = f;
    }
}
