package p000;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class im2 {

    /* JADX INFO: renamed from: a */
    public bm2 f4687a;

    /* JADX INFO: renamed from: b */
    public C0685s8 f4688b;

    /* JADX INFO: renamed from: c */
    public n50 f4689c;

    /* JADX INFO: renamed from: d */
    public qv1 f4690d;

    /* JADX INFO: renamed from: e */
    public boolean f4691e;

    /* JADX INFO: renamed from: f */
    public tm1 f4692f;

    /* JADX INFO: renamed from: g */
    public final am2 f4693g;

    /* JADX INFO: renamed from: h */
    public final wl2 f4694h;

    /* JADX INFO: renamed from: i */
    public boolean f4695i;

    /* JADX INFO: renamed from: j */
    public int f4696j = 1;

    /* JADX INFO: renamed from: k */
    public kl2 f4697k = ul2.f11355b;

    /* JADX INFO: renamed from: l */
    public final gm2 f4698l = new gm2(this);

    /* JADX INFO: renamed from: m */
    public final C0792v f4699m = new C0792v(28, this);

    public im2(bm2 bm2Var, C0685s8 c0685s8, n50 n50Var, qv1 qv1Var, boolean z, tm1 tm1Var, am2 am2Var, wl2 wl2Var) {
        this.f4687a = bm2Var;
        this.f4688b = c0685s8;
        this.f4689c = n50Var;
        this.f4690d = qv1Var;
        this.f4691e = z;
        this.f4692f = tm1Var;
        this.f4693g = am2Var;
        this.f4694h = wl2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2364a(long j, u00 u00Var) {
        dm2 dm2Var;
        im2 im2Var;
        Throwable th;
        b72 b72Var;
        if (u00Var instanceof dm2) {
            dm2Var = (dm2) u00Var;
            int i = dm2Var.f2119n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dm2Var.f2119n = i - Integer.MIN_VALUE;
            } else {
                dm2Var = new dm2(this, u00Var);
            }
        }
        Object obj = dm2Var.f2117l;
        int i2 = dm2Var.f2119n;
        if (i2 != 0) {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b72Var = dm2Var.f2116k;
            try {
                fg1.m1627T(obj);
                im2Var = this;
                im2Var.f4695i = false;
                return new da3(b72Var.f722h);
            } catch (Throwable th2) {
                th = th2;
                im2Var = this;
                im2Var.f4695i = false;
                throw th;
            }
        }
        fg1.m1627T(obj);
        b72 b72Var2 = new b72();
        b72Var2.f722h = j;
        this.f4695i = true;
        try {
            bl1 bl1Var = bl1.f932h;
            im2Var = this;
            try {
                fm2 fm2Var = new fm2(im2Var, b72Var2, j, null);
                dm2Var.f2116k = b72Var2;
                dm2Var.f2119n = 1;
                Object objM2369f = im2Var.m2369f(bl1Var, fm2Var, dm2Var);
                k20 k20Var = k20.f5323h;
                if (objM2369f == k20Var) {
                    return k20Var;
                }
                b72Var = b72Var2;
                im2Var.f4695i = false;
                return new da3(b72Var.f722h);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                im2Var.f4695i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            im2Var = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2365b(long j, boolean z, tw2 tw2Var) {
        a83 a83Var = a83.f116a;
        if (z) {
            n50 n50Var = this.f4689c;
            ml2 ml2Var = ul2.f11354a;
            if (!(n50Var instanceof n50)) {
                long jM984a = da3.m984a(j, 0.0f, 0.0f, this.f4690d == qv1.f9206i ? 1 : 2);
                hm2 hm2Var = new hm2(this, null);
                C0685s8 c0685s8 = this.f4688b;
                k20 k20Var = k20.f5323h;
                if (c0685s8 == null || !(this.f4687a.mo569c() || this.f4687a.mo567a())) {
                    hm2 hm2Var2 = new hm2(this, tw2Var);
                    hm2Var2.f4082n = jM984a;
                    Object objMo7r = hm2Var2.mo7r(a83Var);
                    if (objMo7r == k20Var) {
                        return objMo7r;
                    }
                } else {
                    Object objM4752b = c0685s8.m4752b(jM984a, hm2Var, tw2Var);
                    if (objM4752b == k20Var) {
                        return objM4752b;
                    }
                }
            }
        }
        return a83Var;
    }

    /* JADX INFO: renamed from: c */
    public final long m2366c(kl2 kl2Var, long j, int i) {
        xm1 xm1Var = this.f4692f.f10845a;
        xm1 xm1VarM6160N0 = xm1Var != null ? xm1Var.m6160N0() : null;
        long jMo4197l = xm1VarM6160N0 != null ? xm1VarM6160N0.mo4197l(j, i) : 0L;
        long jM4611d = rs1.m4611d(j, jMo4197l);
        long jM2368e = m2368e(m2371h(kl2Var.mo963a(m2370g(m2368e(this.f4690d == qv1.f9206i ? rs1.m4608a(0.0f, 1, jM4611d) : rs1.m4608a(0.0f, 2, jM4611d))))));
        am2 am2Var = this.f4693g;
        if (am2Var.f10770u) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(am2Var)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC0045b7.f625Z0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC0045b7.f625Z0 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC0045b7.f625Z0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jM4611d2 = rs1.m4611d(jM4611d, jM2368e);
        xm1 xm1Var2 = this.f4692f.f10845a;
        xm1 xm1VarM6160N02 = xm1Var2 != null ? xm1Var2.m6160N0() : null;
        return rs1.m4612e(rs1.m4612e(jMo4197l, jM2368e), xm1VarM6160N02 != null ? xm1VarM6160N02.mo3646N(i, jM2368e, jM4611d2) : 0L);
    }

    /* JADX INFO: renamed from: d */
    public final float m2367d(float f) {
        return this.f4691e ? f * (-1.0f) : f;
    }

    /* JADX INFO: renamed from: e */
    public final long m2368e(long j) {
        return this.f4691e ? rs1.m4613f(-1.0f, j) : j;
    }

    /* JADX INFO: renamed from: f */
    public final Object m2369f(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        Object objMo570d = this.f4687a.mo570d(bl1Var, new C0040b2(this, mn0Var, (t00) null, 18), u00Var);
        return objMo570d == k20.f5323h ? objMo570d : a83.f116a;
    }

    /* JADX INFO: renamed from: g */
    public final float m2370g(long j) {
        return Float.intBitsToFloat((int) (this.f4690d == qv1.f9206i ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public final long m2371h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f4690d == qv1.f9206i) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: i */
    public final float m2372i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        qv1 qv1Var = this.f4690d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (qv1Var == qv1.f9205h) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (qv1Var == qv1.f9206i) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
