package defpackage;

import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 extends io1 {
    public final n4 f;
    public final jn g;
    public zt2 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public si1(im2 im2Var, n4 n4Var, jw jwVar, e70 e70Var) {
        super(im2Var, jwVar, e70Var);
        this.f = n4Var;
        this.g = fg1.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(si1 si1Var, im2 im2Var, oi1 oi1Var, float f, float f2, u00 u00Var) {
        pi1 pi1Var;
        a83 a83Var;
        o72 o72Var;
        Object obj;
        z62 z62Var;
        float f3;
        im2 im2Var2;
        si1Var.getClass();
        sz0 sz0Var = si1Var.e;
        if (u00Var instanceof pi1) {
            pi1Var = (pi1) u00Var;
            int i = pi1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                pi1Var.p = i - Integer.MIN_VALUE;
            } else {
                pi1Var = new pi1(si1Var, u00Var);
            }
        }
        pi1 pi1Var2 = pi1Var;
        Object obj2 = pi1Var2.n;
        int i2 = pi1Var2.p;
        a83 a83Var2 = a83.a;
        Object obj3 = k20.h;
        if (i2 == 0) {
            fg1.T(obj2);
            o72 o72Var2 = new o72();
            o72Var2.i = oi1Var;
            a83Var = a83Var2;
            long j = oi1Var.b;
            long j2 = oi1Var.a;
            ((bb2) sz0Var.i).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((bb2) sz0Var.j).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            oi1 oi1VarG = g(si1Var.g);
            if (oi1VarG != null) {
                long j3 = oi1VarG.b;
                long j4 = oi1VarG.a;
                ((bb2) sz0Var.i).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((bb2) sz0Var.j).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                o72Var = o72Var2;
                o72Var.i = ((oi1) o72Var.i).a(oi1VarG);
            } else {
                o72Var = o72Var2;
            }
            z62 z62Var2 = new z62();
            float fG = im2Var.g(im2Var.e(((oi1) o72Var.i).a));
            z62Var2.h = fG;
            if (!rp0.S(fG)) {
                o72 o72Var3 = new o72();
                o72Var3.i = s11.a(0.0f, 30);
                obj = obj3;
                mn0 qi1Var = new qi1(z62Var2, o72Var3, o72Var, f, si1Var, f2, im2Var, null);
                pi1Var2.k = im2Var;
                pi1Var2.l = z62Var2;
                pi1Var2.m = f2;
                pi1Var2.p = 1;
                if (si1Var.b(qi1Var, pi1Var2) != obj) {
                    z62Var = z62Var2;
                    f3 = f2;
                    im2Var2 = im2Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(obj2);
                return a83Var2;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = pi1Var2.m;
        z62Var = pi1Var2.l;
        im2Var2 = pi1Var2.k;
        fg1.T(obj2);
        obj = obj3;
        a83Var = a83Var2;
        long jA = ea3.a(((bb2) sz0Var.i).b(Float.MAX_VALUE), ((bb2) sz0Var.j).b(Float.MAX_VALUE));
        if (jA == 0) {
            float fD = im2Var2.d(Math.signum(z62Var.h)) * Math.min(Math.abs(z62Var.h) / 100.0f, f3) * 1000.0f;
            if (fD == 0.0f) {
                jA = 0;
            } else {
                jA = im2Var2.d == qv1.i ? ea3.a(fD, 0.0f) : ea3.a(0.0f, fD);
            }
        }
        mn0 mn0Var = si1Var.b;
        da3 da3Var = new da3(jA);
        pi1Var2.k = null;
        pi1Var2.l = null;
        pi1Var2.p = 2;
        return mn0Var.g(da3Var, pi1Var2) == obj ? obj : a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(si1 si1Var, o72 o72Var, z62 z62Var, im2 im2Var, o72 o72Var2, long j, u00 u00Var) {
        ri1 ri1Var;
        z62 z62Var2;
        im2 im2Var2;
        o72 o72Var3;
        boolean z;
        if (u00Var instanceof ri1) {
            ri1Var = (ri1) u00Var;
            int i = ri1Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ri1Var.q = i - Integer.MIN_VALUE;
            } else {
                ri1Var = new ri1(u00Var);
            }
        }
        Object objF = ri1Var.p;
        int i2 = ri1Var.q;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.T(objF);
            if (j < 0) {
                return Boolean.FALSE;
            }
            h50 h50Var = new h50(si1Var, t00Var, 5);
            ri1Var.k = si1Var;
            ri1Var.l = o72Var;
            ri1Var.m = z62Var;
            ri1Var.n = im2Var;
            ri1Var.o = o72Var2;
            ri1Var.q = 1;
            objF = ga3.f(j, h50Var, ri1Var);
            k20 k20Var = k20.h;
            if (objF == k20Var) {
                return k20Var;
            }
            z62Var2 = z62Var;
            im2Var2 = im2Var;
            o72Var3 = o72Var2;
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o72 o72Var4 = ri1Var.o;
            im2 im2Var3 = ri1Var.n;
            z62Var2 = ri1Var.m;
            o72 o72Var5 = ri1Var.l;
            si1 si1Var2 = ri1Var.k;
            fg1.T(objF);
            o72Var3 = o72Var4;
            im2Var2 = im2Var3;
            o72Var = o72Var5;
            si1Var = si1Var2;
        }
        oi1 oi1Var = (oi1) objF;
        if (oi1Var != null) {
            boolean z2 = ((oi1) o72Var.i).c;
            long j2 = oi1Var.a;
            o72Var.i = new oi1(j2, oi1Var.b, z2);
            z62Var2.h = im2Var2.i(im2Var2.e(j2));
            o72Var3.i = s11.a(0.0f, 30);
            sz0 sz0Var = si1Var.e;
            long j3 = oi1Var.b;
            long j4 = oi1Var.a;
            ((bb2) sz0Var.i).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((bb2) sz0Var.j).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !rp0.S(z62Var2.h);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static oi1 g(jn jnVar) {
        oi1 oi1Var = null;
        vo2 vo2VarB = tp0.B(new lm0(new ni1(jnVar, 0), null, 2));
        while (vo2VarB.hasNext()) {
            oi1 oi1VarA = (oi1) vo2VarB.next();
            if (oi1Var != null) {
                oi1VarA = oi1Var.a(oi1VarA);
            }
            oi1Var = oi1VarA;
        }
        return oi1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e(gm2 gm2Var, float f) {
        im2 im2Var = this.a;
        long jH = im2Var.h(im2Var.d(f));
        im2 im2Var2 = gm2Var.a;
        return im2Var.g(im2Var.e(im2Var2.c(im2Var2.k, jH, 1)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(h12 h12Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.i;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = h12Var.a;
        rs1 rs1Var = new rs1(0L);
        int size = list.size();
        boolean zC = false;
        int i = 0;
        while (true) {
            j = rs1Var.a;
            if (i >= size) {
                break;
            }
            rs1Var = new rs1(rs1.e(j, ((o12) list.get(i)).j));
            i++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        im2 im2Var = this.a;
        float fI = im2Var.i(im2Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            bm2 bm2Var = im2Var.a;
            zC = fI > 0.0f ? bm2Var.c() : bm2Var.a();
        }
        if (zC) {
            return !(this.g.s(new oi1(jFloatToRawIntBits, ((o12) du.o0(h12Var.a)).b, false)) instanceof oq);
        }
        return this.d;
    }
}
