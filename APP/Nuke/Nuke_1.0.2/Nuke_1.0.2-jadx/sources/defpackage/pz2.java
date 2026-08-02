package defpackage;

import java.text.BreakIterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pz2 {
    public final sd a;
    public final long b;
    public final y03 c;
    public final us1 d;
    public final e13 e;
    public long f;
    public final sd g;
    public final k03 h;
    public final z03 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pz2(k03 k03Var, us1 us1Var, z03 z03Var, e13 e13Var) {
        sd sdVar = k03Var.a;
        long j = k03Var.b;
        y03 y03Var = z03Var != null ? z03Var.a : null;
        this.a = sdVar;
        this.b = j;
        this.c = y03Var;
        this.d = us1Var;
        this.e = e13Var;
        this.f = j;
        this.g = sdVar;
        this.h = k03Var;
        this.i = z03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List a(in0 in0Var) {
        if (!f13.c(this.f)) {
            return eu.P(new ev("", 0), new mp2(f13.f(this.f), f13.f(this.f)));
        }
        rd0 rd0Var = (rd0) in0Var.j(this);
        if (rd0Var != null) {
            return eu.O(rd0Var);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer b() {
        y03 y03Var = this.c;
        if (y03Var == null) {
            return null;
        }
        lj1 lj1Var = y03Var.b;
        int iE = f13.e(this.f);
        us1 us1Var = this.d;
        return Integer.valueOf(us1Var.n(lj1Var.c(lj1Var.d(us1Var.p(iE)), true)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer c() {
        y03 y03Var = this.c;
        if (y03Var == null) {
            return null;
        }
        int iF = f13.f(this.f);
        us1 us1Var = this.d;
        return Integer.valueOf(us1Var.n(y03Var.f(y03Var.b.d(us1Var.p(iF)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer d() {
        int length;
        y03 y03Var = this.c;
        if (y03Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            sd sdVar = this.a;
            if (iR < sdVar.i.length()) {
                int length2 = this.g.i.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jI = y03Var.i(length2);
                int i = f13.c;
                int i2 = (int) (jI & 4294967295L);
                if (i2 > iR) {
                    length = this.d.n(i2);
                    break;
                }
                iR++;
            } else {
                length = sdVar.i.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer e() {
        int iN;
        y03 y03Var = this.c;
        if (y03Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                iN = 0;
                break;
            }
            int length = this.g.i.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jI = y03Var.i(length);
            int i = f13.c;
            int i2 = (int) (jI >> 32);
            if (i2 < iR) {
                iN = this.d.n(i2);
                break;
            }
            iR--;
        }
        return Integer.valueOf(iN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        y03 y03Var = this.c;
        return (y03Var != null ? y03Var.g(r()) : null) != c92.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(y03 y03Var, int i) {
        int iR = r();
        e13 e13Var = this.e;
        if (e13Var.a == null) {
            e13Var.a = Float.valueOf(y03Var.c(iR).a);
        }
        lj1 lj1Var = y03Var.b;
        int iD = lj1Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= lj1Var.f) {
            return this.g.i.length();
        }
        float fB = lj1Var.b(iD) - 1.0f;
        Float f = e13Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= y03Var.e(iD)) || (!f() && fFloatValue <= y03Var.d(iD))) {
            return lj1Var.c(iD, true);
        }
        return this.d.n(lj1Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(z03 z03Var, int i) {
        o62 o62VarJ;
        c61 c61Var = z03Var.b;
        y03 y03Var = z03Var.a;
        if (c61Var == null) {
            o62VarJ = o62.e;
        } else {
            c61 c61Var2 = z03Var.c;
            o62VarJ = c61Var2 != null ? c61Var2.J(c61Var, true) : null;
            if (o62VarJ == null) {
            }
        }
        long j = this.h.b;
        int i2 = f13.c;
        us1 us1Var = this.d;
        o62 o62VarC = y03Var.c(us1Var.p((int) (j & 4294967295L)));
        float f = o62VarC.a;
        return us1Var.n(y03Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (o62VarJ.c() & 4294967295L)) * i) + o62VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        e13 e13Var = this.e;
        e13Var.a = null;
        sd sdVar = this.g;
        if (sdVar.i.length() > 0) {
            if (f()) {
                k();
                return;
            }
            e13Var.a = null;
            if (sdVar.i.length() > 0) {
                String str = sdVar.i;
                long j = this.f;
                int i = f13.c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        this.e.a = null;
        sd sdVar = this.g;
        String str = sdVar.i;
        String str2 = sdVar.i;
        if (str.length() > 0) {
            int iU = fg1.u(str2, f13.e(this.f));
            if (iU == f13.e(this.f) && iU != str2.length()) {
                iU = fg1.u(str2, iU + 1);
            }
            q(iU, iU);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        this.e.a = null;
        sd sdVar = this.g;
        if (sdVar.i.length() > 0) {
            String str = sdVar.i;
            long j = this.f;
            int i = f13.c;
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iPreceding = characterInstance.preceding((int) (j & 4294967295L));
            if (iPreceding != -1) {
                q(iPreceding, iPreceding);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        this.e.a = null;
        sd sdVar = this.g;
        String str = sdVar.i;
        String str2 = sdVar.i;
        if (str.length() > 0) {
            int iV = fg1.v(str2, f13.f(this.f));
            if (iV == f13.f(this.f) && iV != 0) {
                iV = fg1.v(str2, iV - 1);
            }
            q(iV, iV);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        e13 e13Var = this.e;
        e13Var.a = null;
        sd sdVar = this.g;
        if (sdVar.i.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            e13Var.a = null;
            if (sdVar.i.length() > 0) {
                String str = sdVar.i;
                long j = this.f;
                int i = f13.c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.i.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.i.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        if (this.g.i.length() > 0) {
            int i = f13.c;
            this.f = fg1.i((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(int i, int i2) {
        this.f = fg1.i(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int r() {
        long j = this.f;
        int i = f13.c;
        return this.d.p((int) (j & 4294967295L));
    }
}
