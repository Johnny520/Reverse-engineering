package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0343j5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0968ym f2721a;

    /* JADX INFO: renamed from: b */
    public long f2722b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final C0182er f2723c;

    /* JADX INFO: renamed from: d */
    public final gp0 f2724d;

    /* JADX INFO: renamed from: e */
    public final boolean f2725e;

    /* JADX INFO: renamed from: f */
    public boolean f2726f;

    /* JADX INFO: renamed from: g */
    public long f2727g;

    /* JADX INFO: renamed from: h */
    public long f2728h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0731sm f2729i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0343j5(Context context, InterfaceC0968ym interfaceC0968ym, long j, jn0 jn0Var) {
        this.f2721a = interfaceC0968ym;
        C0182er c0182er = new C0182er(context, p30.m2987W(j));
        this.f2723c = c0182er;
        this.f2724d = new gp0(na1.f4229a, C0496n2.f4133M);
        this.f2725e = true;
        this.f2727g = 0L;
        this.f2728h = -1L;
        C0308i5 c0308i5 = new C0308i5(0, this);
        ir0 ir0Var = o51.f4465a;
        s51 s51Var = new s51(null, null, c0308i5);
        this.f2729i = Build.VERSION.SDK_INT >= 31 ? new C0782tx(s51Var, this, c0182er) : new C0782tx(s51Var, this, c0182er, jn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1640a() {
        boolean z;
        C0182er c0182er = this.f2723c;
        EdgeEffect edgeEffect = c0182er.f1513d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c0182er.f1514e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c0182er.f1515f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c0182er.f1516g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m1643d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1641b(long j, kz0 kz0Var, AbstractC0358jk abstractC0358jk) {
        C0234g5 c0234g5;
        long jM3438d;
        if (abstractC0358jk instanceof C0234g5) {
            c0234g5 = (C0234g5) abstractC0358jk;
            int i = c0234g5.f1858j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0234g5.f1858j = i - Integer.MIN_VALUE;
            } else {
                c0234g5 = new C0234g5(this, abstractC0358jk);
            }
        }
        Object objMo16m = c0234g5.f1856h;
        int i2 = c0234g5.f1858j;
        na1 na1Var = na1.f4229a;
        C0182er c0182er = this.f2723c;
        if (i2 == 0) {
            w60.m4891M(objMo16m);
            boolean zM3187c = q11.m3187c(this.f2727g);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (zM3187c) {
                c0234g5.f1858j = 1;
                kz0Var.getClass();
                kz0 kz0Var2 = new kz0(kz0Var.f3292k, c0234g5);
                kz0Var2.f3291j = j;
                if (kz0Var2.mo16m(na1Var) != enumC1007zk) {
                    return na1Var;
                }
            } else {
                boolean zM960g = C0182er.m960g(c0182er.f1515f);
                InterfaceC0968ym interfaceC0968ym = this.f2721a;
                long jM1203b = g60.m1203b((!zM960g || rb1.m3436b(j) >= 0.0f) ? (!C0182er.m960g(c0182er.f1516g) || rb1.m3436b(j) <= 0.0f) ? 0.0f : -rd0.m3477f(c0182er.m964d(), -rb1.m3436b(j), Float.intBitsToFloat((int) (this.f2727g >> 32)), interfaceC0968ym) : rd0.m3477f(c0182er.m963c(), rb1.m3436b(j), Float.intBitsToFloat((int) (this.f2727g >> 32)), interfaceC0968ym), (!C0182er.m960g(c0182er.f1513d) || rb1.m3437c(j) >= 0.0f) ? (!C0182er.m960g(c0182er.f1514e) || rb1.m3437c(j) <= 0.0f) ? 0.0f : -rd0.m3477f(c0182er.m962b(), -rb1.m3437c(j), Float.intBitsToFloat((int) (this.f2727g & 4294967295L)), interfaceC0968ym) : rd0.m3477f(c0182er.m965e(), rb1.m3437c(j), Float.intBitsToFloat((int) (this.f2727g & 4294967295L)), interfaceC0968ym));
                if (jM1203b != 0) {
                    m1643d();
                }
                jM3438d = rb1.m3438d(j, jM1203b);
                c0234g5.f1855g = jM3438d;
                c0234g5.f1858j = 2;
                kz0Var.getClass();
                kz0 kz0Var3 = new kz0(kz0Var.f3292k, c0234g5);
                kz0Var3.f3291j = jM3438d;
                objMo16m = kz0Var3.mo16m(na1Var);
            }
            return enumC1007zk;
        }
        if (i2 == 1) {
            w60.m4891M(objMo16m);
            return na1Var;
        }
        if (i2 != 2) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jM3438d = c0234g5.f1855g;
        w60.m4891M(objMo16m);
        long jM3438d2 = rb1.m3438d(jM3438d, ((rb1) objMo16m).f5348a);
        this.f2726f = false;
        if (rb1.m3436b(jM3438d2) > 0.0f) {
            EdgeEffect edgeEffectM963c = c0182er.m963c();
            int iM3458Q = rd0.m3458Q(rb1.m3436b(jM3438d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM963c.isFinished()) {
                edgeEffectM963c.onAbsorb(iM3458Q);
            }
        } else if (rb1.m3436b(jM3438d2) < 0.0f) {
            EdgeEffect edgeEffectM964d = c0182er.m964d();
            int i3 = -rd0.m3458Q(rb1.m3436b(jM3438d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM964d.isFinished()) {
                edgeEffectM964d.onAbsorb(i3);
            }
        }
        if (rb1.m3437c(jM3438d2) > 0.0f) {
            EdgeEffect edgeEffectM965e = c0182er.m965e();
            int iM3458Q2 = rd0.m3458Q(rb1.m3437c(jM3438d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM965e.isFinished()) {
                edgeEffectM965e.onAbsorb(iM3458Q2);
            }
        } else if (rb1.m3437c(jM3438d2) < 0.0f) {
            EdgeEffect edgeEffectM962b = c0182er.m962b();
            int i4 = -rd0.m3458Q(rb1.m3437c(jM3438d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM962b.isFinished()) {
                edgeEffectM962b.onAbsorb(i4);
            }
        }
        m1640a();
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m1642c() {
        long jM3415q = this.f2722b;
        if ((9223372034707292159L & jM3415q) == 9205357640488583168L) {
            jM3415q = r60.m3415q(this.f2727g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3415q >> 32)) / Float.intBitsToFloat((int) (this.f2727g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM3415q & 4294967295L)) / Float.intBitsToFloat((int) (this.f2727g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1643d() {
        if (this.f2725e) {
            this.f2724d.setValue(na1.f4229a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final float m1644e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1642c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f2727g & 4294967295L));
        EdgeEffect edgeEffectM962b = this.f2723c.m962b();
        float fM2447d = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM2447d = AbstractC0463m8.m2447d(edgeEffectM962b, fM2447d, f);
        } else {
            edgeEffectM962b.onPull(fM2447d, f);
        }
        return (i2 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM962b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f2727g)) * (-fM2447d) : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final float m1645f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1642c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f2727g >> 32));
        EdgeEffect edgeEffectM963c = this.f2723c.m963c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0463m8.m2447d(edgeEffectM963c, fIntBitsToFloat2, f);
        } else {
            edgeEffectM963c.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM963c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f2727g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final float m1646g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1642c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f2727g >> 32));
        EdgeEffect edgeEffectM964d = this.f2723c.m964d();
        float fM2447d = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM2447d = AbstractC0463m8.m2447d(edgeEffectM964d, fM2447d, fIntBitsToFloat);
        } else {
            edgeEffectM964d.onPull(fM2447d, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM964d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f2727g >> 32)) * (-fM2447d) : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final float m1647h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1642c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f2727g & 4294967295L));
        EdgeEffect edgeEffectM965e = this.f2723c.m965e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0463m8.m2447d(edgeEffectM965e, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM965e.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM965e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f2727g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1648i(long j) {
        boolean zM3185a = q11.m3185a(this.f2727g, 0L);
        boolean zM3185a2 = q11.m3185a(j, this.f2727g);
        this.f2727g = j;
        if (!zM3185a2) {
            int iM3458Q = rd0.m3458Q(Float.intBitsToFloat((int) (j >> 32)));
            long jM3458Q = (((long) rd0.m3458Q(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM3458Q) << 32);
            C0182er c0182er = this.f2723c;
            c0182er.f1512c = jM3458Q;
            EdgeEffect edgeEffect = c0182er.f1513d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM3458Q >> 32), (int) (jM3458Q & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c0182er.f1514e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM3458Q >> 32), (int) (jM3458Q & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c0182er.f1515f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM3458Q & 4294967295L), (int) (jM3458Q >> 32));
            }
            EdgeEffect edgeEffect4 = c0182er.f1516g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM3458Q & 4294967295L), (int) (jM3458Q >> 32));
            }
            EdgeEffect edgeEffect5 = c0182er.f1517h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM3458Q >> 32), (int) (jM3458Q & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c0182er.f1518i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM3458Q >> 32), (int) (jM3458Q & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c0182er.f1519j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM3458Q & 4294967295L), (int) (jM3458Q >> 32));
            }
            EdgeEffect edgeEffect8 = c0182er.f1520k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM3458Q), (int) (jM3458Q >> 32));
            }
        }
        if (zM3185a || zM3185a2) {
            return;
        }
        m1640a();
    }
}
