package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s61 {
    public final w5 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public w5 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s61(w5 w5Var, int i) {
        this.h = i;
        this.a = w5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(s61 s61Var, du0 du0Var, int i, zn1 zn1Var) {
        HashMap map = s61Var.g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jD = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (s61Var.h) {
                    case 0:
                        yv1 yv1Var = zn1Var.S;
                        if (yv1Var != null) {
                            sq0 sq0Var = (sq0) yv1Var;
                            float[] fArrB = sq0Var.b();
                            if (!sq0Var.z) {
                                jD = hf1.b(jD, fArrB);
                            }
                        }
                        jD = tp0.D(jD, zn1Var.G);
                        break;
                    default:
                        md1 md1VarQ0 = zn1Var.Q0();
                        md1VarQ0.getClass();
                        long j = md1VarQ0.w;
                        jD = rs1.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jD);
                        break;
                }
                zn1Var = zn1Var.x;
                zn1Var.getClass();
                if (zn1Var.equals(s61Var.a.n())) {
                    int iRound = Math.round(du0Var instanceof du0 ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (jD >> 32)));
                    if (map.containsKey(du0Var)) {
                        int iIntValue = ((Number) we1.p0(du0Var, map)).intValue();
                        du0 du0Var2 = u5.a;
                        iRound = ((Number) du0Var.a.g(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(du0Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!s61Var.b(zn1Var).containsKey(du0Var));
            float fC = s61Var.c(zn1Var, du0Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map b(zn1 zn1Var) {
        switch (this.h) {
            case 0:
                return zn1Var.A0().a();
            default:
                md1 md1VarQ0 = zn1Var.Q0();
                md1VarQ0.getClass();
                return md1VarQ0.A0().a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(zn1 zn1Var, du0 du0Var) {
        switch (this.h) {
            case 0:
                return zn1Var.q0(du0Var);
            default:
                md1 md1VarQ0 = zn1Var.Q0();
                md1VarQ0.getClass();
                return md1VarQ0.q0(du0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        return this.c || this.d || this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        this.b = true;
        w5 w5Var = this.a;
        w5 w5VarP = w5Var.p();
        if (w5VarP == null) {
            return;
        }
        if (this.c) {
            w5VarP.requestLayout();
        }
        if (this.d) {
            w5Var.U();
        }
        if (this.e) {
            w5Var.requestLayout();
        }
        w5VarP.a().f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        HashMap map = this.g;
        map.clear();
        v5 v5Var = new v5(0, this);
        w5 w5Var = this.a;
        w5Var.k(v5Var);
        map.putAll(b(w5Var.n()));
        this.b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        s61 s61VarA;
        s61 s61VarA2;
        boolean zD = d();
        w5 w5Var = this.a;
        if (!zD) {
            w5 w5VarP = w5Var.p();
            if (w5VarP == null) {
                return;
            }
            w5Var = w5VarP.a().f;
            if (w5Var == null || !w5Var.a().d()) {
                w5 w5Var2 = this.f;
                if (w5Var2 == null || w5Var2.a().d()) {
                    return;
                }
                w5 w5VarP2 = w5Var2.p();
                if (w5VarP2 != null && (s61VarA2 = w5VarP2.a()) != null) {
                    s61VarA2.h();
                }
                w5 w5VarP3 = w5Var2.p();
                w5Var = (w5VarP3 == null || (s61VarA = w5VarP3.a()) == null) ? null : s61VarA.f;
            }
        }
        this.f = w5Var;
    }
}
