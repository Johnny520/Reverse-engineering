package Yue;

import android.util.Log;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7598 extends AbstractInterpolatorC6272 {

    /* JADX INFO: renamed from: ۥ */
    public float f2961;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f2962;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f23000;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f23001;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f23002;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f23003;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float f23004;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float f23005;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float f23006;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f23007;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String f23008;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f23009 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float f23010;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public float f23011;

    @Override // Yue.AbstractInterpolatorC6272, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float fM3758 = m3758(f);
        this.f23011 = f;
        return this.f23009 ? this.f23010 - fM3758 : this.f23010 + fM3758;
    }

    @Override // Yue.AbstractInterpolatorC6272
    /* JADX INFO: renamed from: ۥ */
    public float mo2742() {
        return this.f23009 ? -m23796(this.f23011) : m23796(this.f23011);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final float m3758(float f) {
        float f2 = this.f23001;
        if (f <= f2) {
            float f3 = this.f2961;
            return (f3 * f) + ((((this.f2962 - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f23007;
        if (i == 1) {
            return this.f23004;
        }
        float f4 = f - f2;
        float f5 = this.f23002;
        if (f4 < f5) {
            float f6 = this.f23004;
            float f7 = this.f2962;
            return f6 + (f7 * f4) + ((((this.f23000 - f7) * f4) * f4) / (f5 * 2.0f));
        }
        if (i == 2) {
            return this.f23005;
        }
        float f8 = f4 - f5;
        float f9 = this.f23003;
        if (f8 >= f9) {
            return this.f23006;
        }
        float f10 = this.f23005;
        float f11 = this.f23000;
        return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m23794(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f23010 = f;
        boolean z = f > f2;
        this.f23009 = z;
        if (z) {
            m23797(-f3, f - f2, f5, f6, f4);
        } else {
            m23797(f3, f2 - f, f5, f6, f4);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m23795(String str, String str2, float f) {
        Log.v(str, str2 + " ===== " + this.f23008);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(this.f23009 ? "backwards" : "forward ");
        sb.append(" time = ");
        sb.append(f);
        sb.append("  stages ");
        sb.append(this.f23007);
        Log.v(str, sb.toString());
        Log.v(str, str2 + " dur " + this.f23001 + " vel " + this.f2961 + " pos " + this.f23004);
        if (this.f23007 > 1) {
            Log.v(str, str2 + " dur " + this.f23002 + " vel " + this.f2962 + " pos " + this.f23005);
        }
        if (this.f23007 > 2) {
            Log.v(str, str2 + " dur " + this.f23003 + " vel " + this.f23000 + " pos " + this.f23006);
        }
        float f2 = this.f23001;
        if (f <= f2) {
            Log.v(str, str2 + "stage 0");
            return;
        }
        int i = this.f23007;
        if (i == 1) {
            Log.v(str, str2 + "end stage 0");
            return;
        }
        float f3 = f - f2;
        float f4 = this.f23002;
        if (f3 < f4) {
            Log.v(str, str2 + " stage 1");
            return;
        }
        if (i == 2) {
            Log.v(str, str2 + "end stage 1");
            return;
        }
        if (f3 - f4 < this.f23003) {
            Log.v(str, str2 + " stage 2");
            return;
        }
        Log.v(str, str2 + " end stage 2");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m23796(float f) {
        float f2 = this.f23001;
        if (f <= f2) {
            float f3 = this.f2961;
            return f3 + (((this.f2962 - f3) * f) / f2);
        }
        int i = this.f23007;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f23002;
        if (f4 < f5) {
            float f6 = this.f2962;
            return f6 + (((this.f23000 - f6) * f4) / f5);
        }
        if (i == 2) {
            return this.f23005;
        }
        float f7 = f4 - f5;
        float f8 = this.f23003;
        if (f7 >= f8) {
            return this.f23006;
        }
        float f9 = this.f23000;
        return f9 - ((f7 * f9) / f8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m23797(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f2961 = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f23008 = "backward accelerate, decelerate";
                this.f23007 = 2;
                this.f2961 = f;
                this.f2962 = fSqrt;
                this.f23000 = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f23001 = f8;
                this.f23002 = fSqrt / f3;
                this.f23004 = ((f + fSqrt) * f8) / 2.0f;
                this.f23005 = f2;
                this.f23006 = f2;
                return;
            }
            this.f23008 = "backward accelerate cruse decelerate";
            this.f23007 = 3;
            this.f2961 = f;
            this.f2962 = f4;
            this.f23000 = f4;
            float f9 = (f4 - f) / f3;
            this.f23001 = f9;
            float f10 = f4 / f3;
            this.f23003 = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f23002 = ((f2 - f11) - f12) / f4;
            this.f23004 = f11;
            this.f23005 = f2 - f12;
            this.f23006 = f2;
            return;
        }
        if (f7 >= f2) {
            this.f23008 = "hard stop";
            this.f23007 = 1;
            this.f2961 = f;
            this.f2962 = 0.0f;
            this.f23004 = f2;
            this.f23001 = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f23008 = "cruse decelerate";
            this.f23007 = 2;
            this.f2961 = f;
            this.f2962 = f;
            this.f23000 = 0.0f;
            this.f23004 = f13;
            this.f23005 = f2;
            this.f23001 = f14;
            this.f23002 = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
        float f15 = (fSqrt2 - f) / f3;
        this.f23001 = f15;
        float f16 = fSqrt2 / f3;
        this.f23002 = f16;
        if (fSqrt2 < f4) {
            this.f23008 = "accelerate decelerate";
            this.f23007 = 2;
            this.f2961 = f;
            this.f2962 = fSqrt2;
            this.f23000 = 0.0f;
            this.f23001 = f15;
            this.f23002 = f16;
            this.f23004 = ((f + fSqrt2) * f15) / 2.0f;
            this.f23005 = f2;
            return;
        }
        this.f23008 = "accelerate cruse decelerate";
        this.f23007 = 3;
        this.f2961 = f;
        this.f2962 = f4;
        this.f23000 = f4;
        float f17 = (f4 - f) / f3;
        this.f23001 = f17;
        float f18 = f4 / f3;
        this.f23003 = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f23002 = ((f2 - f19) - f20) / f4;
        this.f23004 = f19;
        this.f23005 = f2 - f20;
        this.f23006 = f2;
    }
}
