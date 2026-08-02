package p000;

import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 extends io1 {

    /* JADX INFO: renamed from: f */
    public final C0485n4 f10149f;

    /* JADX INFO: renamed from: g */
    public final C0356jn f10150g;

    /* JADX INFO: renamed from: h */
    public zt2 f10151h;

    public si1(im2 im2Var, C0485n4 c0485n4, C0365jw c0365jw, e70 e70Var) {
        super(im2Var, c0365jw, e70Var);
        this.f10149f = c0485n4;
        this.f10150g = fg1.m1630a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4867c(si1 si1Var, im2 im2Var, oi1 oi1Var, float f, float f2, u00 u00Var) {
        pi1 pi1Var;
        a83 a83Var;
        o72 o72Var;
        Object obj;
        z62 z62Var;
        float f3;
        im2 im2Var2;
        si1Var.getClass();
        sz0 sz0Var = si1Var.f4715e;
        if (u00Var instanceof pi1) {
            pi1Var = (pi1) u00Var;
            int i = pi1Var.f8363p;
            if ((i & Integer.MIN_VALUE) != 0) {
                pi1Var.f8363p = i - Integer.MIN_VALUE;
            } else {
                pi1Var = new pi1(si1Var, u00Var);
            }
        }
        pi1 pi1Var2 = pi1Var;
        Object obj2 = pi1Var2.f8361n;
        int i2 = pi1Var2.f8363p;
        a83 a83Var2 = a83.f116a;
        Object obj3 = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj2);
            o72 o72Var2 = new o72();
            o72Var2.f7574i = oi1Var;
            a83Var = a83Var2;
            long j = oi1Var.f7687b;
            long j2 = oi1Var.f7686a;
            ((bb2) sz0Var.f10436i).m509a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((bb2) sz0Var.f10437j).m509a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            oi1 oi1VarM4869g = m4869g(si1Var.f10150g);
            if (oi1VarM4869g != null) {
                long j3 = oi1VarM4869g.f7687b;
                long j4 = oi1VarM4869g.f7686a;
                ((bb2) sz0Var.f10436i).m509a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((bb2) sz0Var.f10437j).m509a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                o72Var = o72Var2;
                o72Var.f7574i = ((oi1) o72Var.f7574i).m3563a(oi1VarM4869g);
            } else {
                o72Var = o72Var2;
            }
            z62 z62Var2 = new z62();
            float fM2370g = im2Var.m2370g(im2Var.m2368e(((oi1) o72Var.f7574i).f7686a));
            z62Var2.f13745h = fM2370g;
            if (!rp0.m4533S(fM2370g)) {
                o72 o72Var3 = new o72();
                o72Var3.f7574i = s11.m4682a(0.0f, 30);
                obj = obj3;
                mn0 qi1Var = new qi1(z62Var2, o72Var3, o72Var, f, si1Var, f2, im2Var, null);
                pi1Var2.f8358k = im2Var;
                pi1Var2.f8359l = z62Var2;
                pi1Var2.f8360m = f2;
                pi1Var2.f8363p = 1;
                if (si1Var.m2382b(qi1Var, pi1Var2) != obj) {
                    z62Var = z62Var2;
                    f3 = f2;
                    im2Var2 = im2Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(obj2);
                return a83Var2;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = pi1Var2.f8360m;
        z62Var = pi1Var2.f8359l;
        im2Var2 = pi1Var2.f8358k;
        fg1.m1627T(obj2);
        obj = obj3;
        a83Var = a83Var2;
        long jM1314a = ea3.m1314a(((bb2) sz0Var.f10436i).m510b(Float.MAX_VALUE), ((bb2) sz0Var.f10437j).m510b(Float.MAX_VALUE));
        if (jM1314a == 0) {
            float fM2367d = im2Var2.m2367d(Math.signum(z62Var.f13745h)) * Math.min(Math.abs(z62Var.f13745h) / 100.0f, f3) * 1000.0f;
            if (fM2367d == 0.0f) {
                jM1314a = 0;
            } else {
                jM1314a = im2Var2.f4690d == qv1.f9206i ? ea3.m1314a(fM2367d, 0.0f) : ea3.m1314a(0.0f, fM2367d);
            }
        }
        mn0 mn0Var = si1Var.f4712b;
        da3 da3Var = new da3(jM1314a);
        pi1Var2.f8358k = null;
        pi1Var2.f8359l = null;
        pi1Var2.f8363p = 2;
        return mn0Var.mo12g(da3Var, pi1Var2) == obj ? obj : a83Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4868d(si1 si1Var, o72 o72Var, z62 z62Var, im2 im2Var, o72 o72Var2, long j, u00 u00Var) {
        ri1 ri1Var;
        z62 z62Var2;
        im2 im2Var2;
        o72 o72Var3;
        boolean z;
        if (u00Var instanceof ri1) {
            ri1Var = (ri1) u00Var;
            int i = ri1Var.f9600q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ri1Var.f9600q = i - Integer.MIN_VALUE;
            } else {
                ri1Var = new ri1(u00Var);
            }
        }
        Object objM1821f = ri1Var.f9599p;
        int i2 = ri1Var.f9600q;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.m1627T(objM1821f);
            if (j < 0) {
                return Boolean.FALSE;
            }
            h50 h50Var = new h50(si1Var, t00Var, 5);
            ri1Var.f9594k = si1Var;
            ri1Var.f9595l = o72Var;
            ri1Var.f9596m = z62Var;
            ri1Var.f9597n = im2Var;
            ri1Var.f9598o = o72Var2;
            ri1Var.f9600q = 1;
            objM1821f = ga3.m1821f(j, h50Var, ri1Var);
            k20 k20Var = k20.f5323h;
            if (objM1821f == k20Var) {
                return k20Var;
            }
            z62Var2 = z62Var;
            im2Var2 = im2Var;
            o72Var3 = o72Var2;
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o72 o72Var4 = ri1Var.f9598o;
            im2 im2Var3 = ri1Var.f9597n;
            z62Var2 = ri1Var.f9596m;
            o72 o72Var5 = ri1Var.f9595l;
            si1 si1Var2 = ri1Var.f9594k;
            fg1.m1627T(objM1821f);
            o72Var3 = o72Var4;
            im2Var2 = im2Var3;
            o72Var = o72Var5;
            si1Var = si1Var2;
        }
        oi1 oi1Var = (oi1) objM1821f;
        if (oi1Var != null) {
            boolean z2 = ((oi1) o72Var.f7574i).f7688c;
            long j2 = oi1Var.f7686a;
            o72Var.f7574i = new oi1(j2, oi1Var.f7687b, z2);
            z62Var2.f13745h = im2Var2.m2372i(im2Var2.m2368e(j2));
            o72Var3.f7574i = s11.m4682a(0.0f, 30);
            sz0 sz0Var = si1Var.f4715e;
            long j3 = oi1Var.f7687b;
            long j4 = oi1Var.f7686a;
            ((bb2) sz0Var.f10436i).m509a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((bb2) sz0Var.f10437j).m509a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !rp0.m4533S(z62Var2.f13745h);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g */
    public static oi1 m4869g(C0356jn c0356jn) {
        oi1 oi1Var = null;
        vo2 vo2VarM5340B = tp0.m5340B(new lm0(new ni1(c0356jn, 0), null, 2));
        while (vo2VarM5340B.hasNext()) {
            oi1 oi1VarM3563a = (oi1) vo2VarM5340B.next();
            if (oi1Var != null) {
                oi1VarM3563a = oi1Var.m3563a(oi1VarM3563a);
            }
            oi1Var = oi1VarM3563a;
        }
        return oi1Var;
    }

    /* JADX INFO: renamed from: e */
    public final float m4870e(gm2 gm2Var, float f) {
        im2 im2Var = this.f4711a;
        long jM2371h = im2Var.m2371h(im2Var.m2367d(f));
        im2 im2Var2 = gm2Var.f3582a;
        return im2Var.m2370g(im2Var.m2368e(im2Var2.m2366c(im2Var2.f4697k, jM2371h, 1)));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4871f(h12 h12Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f10149f.f6983i;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = h12Var.f3776a;
        rs1 rs1Var = new rs1(0L);
        int size = list.size();
        boolean zMo569c = false;
        int i = 0;
        while (true) {
            j = rs1Var.f9744a;
            if (i >= size) {
                break;
            }
            rs1Var = new rs1(rs1.m4612e(j, ((o12) list.get(i)).f7429j));
            i++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        im2 im2Var = this.f4711a;
        float fM2372i = im2Var.m2372i(im2Var.m2368e(jFloatToRawIntBits));
        if (fM2372i != 0.0f) {
            bm2 bm2Var = im2Var.f4687a;
            zMo569c = fM2372i > 0.0f ? bm2Var.mo569c() : bm2Var.mo567a();
        }
        if (zMo569c) {
            return !(this.f10150g.mo2225s(new oi1(jFloatToRawIntBits, ((o12) AbstractC0142du.m1159o0(h12Var.f3776a)).f7421b, false)) instanceof C0552oq);
        }
        return this.f4714d;
    }
}
