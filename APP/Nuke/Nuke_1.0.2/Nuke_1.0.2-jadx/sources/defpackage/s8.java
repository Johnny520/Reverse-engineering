package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s8 {
    public final e70 a;
    public long b = 9205357640488583168L;
    public final jd0 c;
    public final nx1 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final u60 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s8(Context context, e70 e70Var, long j, jw1 jw1Var) {
        this.a = e70Var;
        jd0 jd0Var = new jd0(context, sp0.j0(j));
        this.c = jd0Var;
        this.d = new nx1(a83.a, gd3.C);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        r8 r8Var = new r8(0, this);
        h12 h12Var = vw2.a;
        zw2 zw2Var = new zw2(null, null, r8Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new kq0(zw2Var, this, jd0Var) : new kq0(zw2Var, this, jd0Var, jw1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        boolean z;
        jd0 jd0Var = this.c;
        EdgeEffect edgeEffect = jd0Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = jd0Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = jd0Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = jd0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, hm2 hm2Var, u00 u00Var) {
        p8 p8Var;
        long jD;
        if (u00Var instanceof p8) {
            p8Var = (p8) u00Var;
            int i = p8Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                p8Var.n = i - Integer.MIN_VALUE;
            } else {
                p8Var = new p8(this, u00Var);
            }
        }
        Object objR = p8Var.l;
        int i2 = p8Var.n;
        a83 a83Var = a83.a;
        jd0 jd0Var = this.c;
        if (i2 == 0) {
            fg1.T(objR);
            boolean zC = gr2.c(this.g);
            k20 k20Var = k20.h;
            if (zC) {
                p8Var.n = 1;
                hm2Var.getClass();
                hm2 hm2Var2 = new hm2(hm2Var.o, p8Var);
                hm2Var2.n = j;
                if (hm2Var2.r(a83Var) != k20Var) {
                    return a83Var;
                }
            } else {
                boolean zG = jd0.g(jd0Var.f);
                e70 e70Var = this.a;
                long jA = ea3.a((!zG || da3.b(j) >= 0.0f) ? (!jd0.g(jd0Var.g) || da3.b(j) <= 0.0f) ? 0.0f : -eu.s(jd0Var.d(), -da3.b(j), Float.intBitsToFloat((int) (this.g >> 32)), e70Var) : eu.s(jd0Var.c(), da3.b(j), Float.intBitsToFloat((int) (this.g >> 32)), e70Var), (!jd0.g(jd0Var.d) || da3.c(j) >= 0.0f) ? (!jd0.g(jd0Var.e) || da3.c(j) <= 0.0f) ? 0.0f : -eu.s(jd0Var.b(), -da3.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), e70Var) : eu.s(jd0Var.e(), da3.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), e70Var));
                if (jA != 0) {
                    d();
                }
                jD = da3.d(j, jA);
                p8Var.k = jD;
                p8Var.n = 2;
                hm2Var.getClass();
                hm2 hm2Var3 = new hm2(hm2Var.o, p8Var);
                hm2Var3.n = jD;
                objR = hm2Var3.r(a83Var);
            }
            return k20Var;
        }
        if (i2 == 1) {
            fg1.T(objR);
            return a83Var;
        }
        if (i2 != 2) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jD = p8Var.k;
        fg1.T(objR);
        long jD2 = da3.d(jD, ((da3) objR).a);
        this.f = false;
        if (da3.b(jD2) > 0.0f) {
            EdgeEffect edgeEffectC = jd0Var.c();
            int iQ = gf1.Q(da3.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                edgeEffectC.onAbsorb(iQ);
            }
        } else if (da3.b(jD2) < 0.0f) {
            EdgeEffect edgeEffectD = jd0Var.d();
            int i3 = -gf1.Q(da3.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                edgeEffectD.onAbsorb(i3);
            }
        }
        if (da3.c(jD2) > 0.0f) {
            EdgeEffect edgeEffectE = jd0Var.e();
            int iQ2 = gf1.Q(da3.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                edgeEffectE.onAbsorb(iQ2);
            }
        } else if (da3.c(jD2) < 0.0f) {
            EdgeEffect edgeEffectB = jd0Var.b();
            int i4 = -gf1.Q(da3.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                edgeEffectB.onAbsorb(i4);
            }
        }
        a();
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c() {
        long jT = this.b;
        if ((9223372034707292159L & jT) == 9205357640488583168L) {
            jT = p7.t(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jT >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jT & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.e) {
            this.d.setValue(a83.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fD = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = ne.d(edgeEffectB, fD, f);
        } else {
            edgeEffectB.onPull(fD, f);
        }
        return (i2 >= 31 ? ne.c(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fD) : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = ne.d(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? ne.c(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fD = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = ne.d(edgeEffectD, fD, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fD, fIntBitsToFloat);
        }
        return (i2 >= 31 ? ne.c(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fD) : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = ne.d(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? ne.c(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(long j) {
        boolean zA = gr2.a(this.g, 0L);
        boolean zA2 = gr2.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iQ = gf1.Q(Float.intBitsToFloat((int) (j >> 32)));
            long jQ = (((long) gf1.Q(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iQ) << 32);
            jd0 jd0Var = this.c;
            jd0Var.c = jQ;
            EdgeEffect edgeEffect = jd0Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect2 = jd0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect3 = jd0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect4 = jd0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect5 = jd0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect6 = jd0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect7 = jd0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect8 = jd0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jQ), (int) (jQ >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
