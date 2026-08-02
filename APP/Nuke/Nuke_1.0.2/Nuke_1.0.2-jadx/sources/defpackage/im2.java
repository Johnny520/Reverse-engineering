package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class im2 {
    public bm2 a;
    public s8 b;
    public n50 c;
    public qv1 d;
    public boolean e;
    public tm1 f;
    public final am2 g;
    public final wl2 h;
    public boolean i;
    public int j = 1;
    public kl2 k = ul2.b;
    public final gm2 l = new gm2(this);
    public final v m = new v(28, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public im2(bm2 bm2Var, s8 s8Var, n50 n50Var, qv1 qv1Var, boolean z, tm1 tm1Var, am2 am2Var, wl2 wl2Var) {
        this.a = bm2Var;
        this.b = s8Var;
        this.c = n50Var;
        this.d = qv1Var;
        this.e = z;
        this.f = tm1Var;
        this.g = am2Var;
        this.h = wl2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, u00 u00Var) {
        dm2 dm2Var;
        im2 im2Var;
        Throwable th;
        b72 b72Var;
        if (u00Var instanceof dm2) {
            dm2Var = (dm2) u00Var;
            int i = dm2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dm2Var.n = i - Integer.MIN_VALUE;
            } else {
                dm2Var = new dm2(this, u00Var);
            }
        }
        Object obj = dm2Var.l;
        int i2 = dm2Var.n;
        if (i2 != 0) {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b72Var = dm2Var.k;
            try {
                fg1.T(obj);
                im2Var = this;
                im2Var.i = false;
                return new da3(b72Var.h);
            } catch (Throwable th2) {
                th = th2;
                im2Var = this;
                im2Var.i = false;
                throw th;
            }
        }
        fg1.T(obj);
        b72 b72Var2 = new b72();
        b72Var2.h = j;
        this.i = true;
        try {
            bl1 bl1Var = bl1.h;
            im2Var = this;
            try {
                fm2 fm2Var = new fm2(im2Var, b72Var2, j, null);
                dm2Var.k = b72Var2;
                dm2Var.n = 1;
                Object objF = im2Var.f(bl1Var, fm2Var, dm2Var);
                k20 k20Var = k20.h;
                if (objF == k20Var) {
                    return k20Var;
                }
                b72Var = b72Var2;
                im2Var.i = false;
                return new da3(b72Var.h);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                im2Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            im2Var = this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, boolean z, tw2 tw2Var) {
        a83 a83Var = a83.a;
        if (z) {
            n50 n50Var = this.c;
            ml2 ml2Var = ul2.a;
            if (!(n50Var instanceof n50)) {
                long jA = da3.a(j, 0.0f, 0.0f, this.d == qv1.i ? 1 : 2);
                hm2 hm2Var = new hm2(this, null);
                s8 s8Var = this.b;
                k20 k20Var = k20.h;
                if (s8Var == null || !(this.a.c() || this.a.a())) {
                    hm2 hm2Var2 = new hm2(this, tw2Var);
                    hm2Var2.n = jA;
                    Object objR = hm2Var2.r(a83Var);
                    if (objR == k20Var) {
                        return objR;
                    }
                } else {
                    Object objB = s8Var.b(jA, hm2Var, tw2Var);
                    if (objB == k20Var) {
                        return objB;
                    }
                }
            }
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c(kl2 kl2Var, long j, int i) {
        xm1 xm1Var = this.f.a;
        xm1 xm1VarN0 = xm1Var != null ? xm1Var.N0() : null;
        long jL = xm1VarN0 != null ? xm1VarN0.l(j, i) : 0L;
        long jD = rs1.d(j, jL);
        long jE = e(h(kl2Var.a(g(e(this.d == qv1.i ? rs1.a(0.0f, 1, jD) : rs1.a(0.0f, 2, jD))))));
        am2 am2Var = this.g;
        if (am2Var.u) {
            ViewTreeObserver viewTreeObserver = ((b7) sp0.f0(am2Var)).getViewTreeObserver();
            try {
                if (b7.Z0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    b7.Z0 = declaredMethod;
                }
                Method method = b7.Z0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jD2 = rs1.d(jD, jE);
        xm1 xm1Var2 = this.f.a;
        xm1 xm1VarN02 = xm1Var2 != null ? xm1Var2.N0() : null;
        return rs1.e(rs1.e(jL, jE), xm1VarN02 != null ? xm1VarN02.N(i, jE, jD2) : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long e(long j) {
        return this.e ? rs1.f(-1.0f, j) : j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object f(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        Object objD = this.a.d(bl1Var, new b2(this, mn0Var, (t00) null, 18), u00Var);
        return objD == k20.h ? objD : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == qv1.i ? j >> 32 : j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == qv1.i) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        qv1 qv1Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (qv1Var == qv1.h) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (qv1Var == qv1.i) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
