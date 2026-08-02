package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0685s8 {

    /* JADX INFO: renamed from: a */
    public final e70 f9962a;

    /* JADX INFO: renamed from: b */
    public long f9963b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final jd0 f9964c;

    /* JADX INFO: renamed from: d */
    public final nx1 f9965d;

    /* JADX INFO: renamed from: e */
    public final boolean f9966e;

    /* JADX INFO: renamed from: f */
    public boolean f9967f;

    /* JADX INFO: renamed from: g */
    public long f9968g;

    /* JADX INFO: renamed from: h */
    public long f9969h;

    /* JADX INFO: renamed from: i */
    public final u60 f9970i;

    public C0685s8(Context context, e70 e70Var, long j, jw1 jw1Var) {
        this.f9962a = e70Var;
        jd0 jd0Var = new jd0(context, sp0.m4947j0(j));
        this.f9964c = jd0Var;
        this.f9965d = new nx1(a83.f116a, gd3.f3416C);
        this.f9966e = true;
        this.f9968g = 0L;
        this.f9969h = -1L;
        C0647r8 c0647r8 = new C0647r8(0, this);
        h12 h12Var = vw2.f12207a;
        zw2 zw2Var = new zw2(null, null, c0647r8);
        this.f9970i = Build.VERSION.SDK_INT >= 31 ? new kq0(zw2Var, this, jd0Var) : new kq0(zw2Var, this, jd0Var, jw1Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m4751a() {
        boolean z;
        jd0 jd0Var = this.f9964c;
        EdgeEffect edgeEffect = jd0Var.f4972d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = jd0Var.f4973e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = jd0Var.f4974f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = jd0Var.f4975g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m4754d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4752b(long j, hm2 hm2Var, u00 u00Var) {
        C0571p8 c0571p8;
        long jM987d;
        if (u00Var instanceof C0571p8) {
            c0571p8 = (C0571p8) u00Var;
            int i = c0571p8.f8021n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0571p8.f8021n = i - Integer.MIN_VALUE;
            } else {
                c0571p8 = new C0571p8(this, u00Var);
            }
        }
        Object objMo7r = c0571p8.f8019l;
        int i2 = c0571p8.f8021n;
        a83 a83Var = a83.f116a;
        jd0 jd0Var = this.f9964c;
        if (i2 == 0) {
            fg1.m1627T(objMo7r);
            boolean zM2021c = gr2.m2021c(this.f9968g);
            k20 k20Var = k20.f5323h;
            if (zM2021c) {
                c0571p8.f8021n = 1;
                hm2Var.getClass();
                hm2 hm2Var2 = new hm2(hm2Var.f4083o, c0571p8);
                hm2Var2.f4082n = j;
                if (hm2Var2.mo7r(a83Var) != k20Var) {
                    return a83Var;
                }
            } else {
                boolean zM2483g = jd0.m2483g(jd0Var.f4974f);
                e70 e70Var = this.f9962a;
                long jM1314a = ea3.m1314a((!zM2483g || da3.m985b(j) >= 0.0f) ? (!jd0.m2483g(jd0Var.f4975g) || da3.m985b(j) <= 0.0f) ? 0.0f : -AbstractC0179eu.m1469s(jd0Var.m2487d(), -da3.m985b(j), Float.intBitsToFloat((int) (this.f9968g >> 32)), e70Var) : AbstractC0179eu.m1469s(jd0Var.m2486c(), da3.m985b(j), Float.intBitsToFloat((int) (this.f9968g >> 32)), e70Var), (!jd0.m2483g(jd0Var.f4972d) || da3.m986c(j) >= 0.0f) ? (!jd0.m2483g(jd0Var.f4973e) || da3.m986c(j) <= 0.0f) ? 0.0f : -AbstractC0179eu.m1469s(jd0Var.m2485b(), -da3.m986c(j), Float.intBitsToFloat((int) (this.f9968g & 4294967295L)), e70Var) : AbstractC0179eu.m1469s(jd0Var.m2488e(), da3.m986c(j), Float.intBitsToFloat((int) (this.f9968g & 4294967295L)), e70Var));
                if (jM1314a != 0) {
                    m4754d();
                }
                jM987d = da3.m987d(j, jM1314a);
                c0571p8.f8018k = jM987d;
                c0571p8.f8021n = 2;
                hm2Var.getClass();
                hm2 hm2Var3 = new hm2(hm2Var.f4083o, c0571p8);
                hm2Var3.f4082n = jM987d;
                objMo7r = hm2Var3.mo7r(a83Var);
            }
            return k20Var;
        }
        if (i2 == 1) {
            fg1.m1627T(objMo7r);
            return a83Var;
        }
        if (i2 != 2) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jM987d = c0571p8.f8018k;
        fg1.m1627T(objMo7r);
        long jM987d2 = da3.m987d(jM987d, ((da3) objMo7r).f1950a);
        this.f9967f = false;
        if (da3.m985b(jM987d2) > 0.0f) {
            EdgeEffect edgeEffectM2486c = jd0Var.m2486c();
            int iM1869Q = gf1.m1869Q(da3.m985b(jM987d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2486c.isFinished()) {
                edgeEffectM2486c.onAbsorb(iM1869Q);
            }
        } else if (da3.m985b(jM987d2) < 0.0f) {
            EdgeEffect edgeEffectM2487d = jd0Var.m2487d();
            int i3 = -gf1.m1869Q(da3.m985b(jM987d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2487d.isFinished()) {
                edgeEffectM2487d.onAbsorb(i3);
            }
        }
        if (da3.m986c(jM987d2) > 0.0f) {
            EdgeEffect edgeEffectM2488e = jd0Var.m2488e();
            int iM1869Q2 = gf1.m1869Q(da3.m986c(jM987d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2488e.isFinished()) {
                edgeEffectM2488e.onAbsorb(iM1869Q2);
            }
        } else if (da3.m986c(jM987d2) < 0.0f) {
            EdgeEffect edgeEffectM2485b = jd0Var.m2485b();
            int i4 = -gf1.m1869Q(da3.m986c(jM987d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2485b.isFinished()) {
                edgeEffectM2485b.onAbsorb(i4);
            }
        }
        m4751a();
        return a83Var;
    }

    /* JADX INFO: renamed from: c */
    public final long m4753c() {
        long jM3784t = this.f9963b;
        if ((9223372034707292159L & jM3784t) == 9205357640488583168L) {
            jM3784t = AbstractC0570p7.m3784t(this.f9968g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3784t >> 32)) / Float.intBitsToFloat((int) (this.f9968g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM3784t & 4294967295L)) / Float.intBitsToFloat((int) (this.f9968g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final void m4754d() {
        if (this.f9966e) {
            this.f9965d.setValue(a83.f116a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m4755e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4753c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9968g & 4294967295L));
        EdgeEffect edgeEffectM2485b = this.f9964c.m2485b();
        float fM3289d = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM3289d = AbstractC0495ne.m3289d(edgeEffectM2485b, fM3289d, f);
        } else {
            edgeEffectM2485b.onPull(fM3289d, f);
        }
        return (i2 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2485b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f9968g)) * (-fM3289d) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: f */
    public final float m4756f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4753c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9968g >> 32));
        EdgeEffect edgeEffectM2486c = this.f9964c.m2486c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0495ne.m3289d(edgeEffectM2486c, fIntBitsToFloat2, f);
        } else {
            edgeEffectM2486c.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2486c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9968g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: g */
    public final float m4757g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4753c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9968g >> 32));
        EdgeEffect edgeEffectM2487d = this.f9964c.m2487d();
        float fM3289d = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM3289d = AbstractC0495ne.m3289d(edgeEffectM2487d, fM3289d, fIntBitsToFloat);
        } else {
            edgeEffectM2487d.onPull(fM3289d, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2487d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9968g >> 32)) * (-fM3289d) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: h */
    public final float m4758h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4753c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9968g & 4294967295L));
        EdgeEffect edgeEffectM2488e = this.f9964c.m2488e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0495ne.m3289d(edgeEffectM2488e, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM2488e.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2488e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9968g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m4759i(long j) {
        boolean zM2019a = gr2.m2019a(this.f9968g, 0L);
        boolean zM2019a2 = gr2.m2019a(j, this.f9968g);
        this.f9968g = j;
        if (!zM2019a2) {
            int iM1869Q = gf1.m1869Q(Float.intBitsToFloat((int) (j >> 32)));
            long jM1869Q = (((long) gf1.m1869Q(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM1869Q) << 32);
            jd0 jd0Var = this.f9964c;
            jd0Var.f4971c = jM1869Q;
            EdgeEffect edgeEffect = jd0Var.f4972d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM1869Q >> 32), (int) (jM1869Q & 4294967295L));
            }
            EdgeEffect edgeEffect2 = jd0Var.f4973e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM1869Q >> 32), (int) (jM1869Q & 4294967295L));
            }
            EdgeEffect edgeEffect3 = jd0Var.f4974f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM1869Q & 4294967295L), (int) (jM1869Q >> 32));
            }
            EdgeEffect edgeEffect4 = jd0Var.f4975g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM1869Q & 4294967295L), (int) (jM1869Q >> 32));
            }
            EdgeEffect edgeEffect5 = jd0Var.f4976h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM1869Q >> 32), (int) (jM1869Q & 4294967295L));
            }
            EdgeEffect edgeEffect6 = jd0Var.f4977i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM1869Q >> 32), (int) (jM1869Q & 4294967295L));
            }
            EdgeEffect edgeEffect7 = jd0Var.f4978j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM1869Q & 4294967295L), (int) (jM1869Q >> 32));
            }
            EdgeEffect edgeEffect8 = jd0Var.f4979k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM1869Q), (int) (jM1869Q >> 32));
            }
        }
        if (zM2019a || zM2019a2) {
            return;
        }
        m4751a();
    }
}
