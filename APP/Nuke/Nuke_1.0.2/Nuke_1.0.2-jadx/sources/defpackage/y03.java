package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y03 {
    public final x03 a;
    public final lj1 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y03(x03 x03Var, lj1 lj1Var, long j) {
        this.a = x03Var;
        this.b = lj1Var;
        this.c = j;
        ArrayList arrayList = lj1Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((rw1) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            rw1 rw1Var = (rw1) du.v0(arrayList);
            fD = rw1Var.a.d.d(r4.g - 1) + rw1Var.f;
        }
        this.e = fD;
        this.f = lj1Var.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c92 a(int i) {
        lj1 lj1Var = this.b;
        lj1Var.k(i);
        int length = ((sd) lj1Var.a.a).i.length();
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? eu.L(arrayList) : eu.G(i, arrayList));
        return rw1Var.a.d.f.isRtlCharAt(rw1Var.d(i)) ? c92.i : c92.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 b(int i) {
        float fJ;
        float fJ2;
        float fI;
        float fI2;
        lj1 lj1Var = this.b;
        lj1Var.j(i);
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.G(i, arrayList));
        t9 t9Var = rw1Var.a;
        int iD = rw1Var.d(i);
        CharSequence charSequence = t9Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbN = vi0.n(iD, "offset(", ") is out of bounds [0,");
            sbN.append(charSequence.length());
            sbN.append(')');
            lz0.a(sbN.toString());
        }
        w03 w03Var = t9Var.d;
        int iG = w03Var.g(iD);
        float fH = w03Var.h(iG);
        float fE = w03Var.e(iG);
        Layout layout = w03Var.f;
        boolean z = layout.getParagraphDirection(iG) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fI = w03Var.j(iD, false);
                fI2 = w03Var.j(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fI = w03Var.i(iD, false);
                fI2 = w03Var.i(iD + 1, true);
            } else {
                fJ = w03Var.j(iD, false);
                fJ2 = w03Var.j(iD + 1, true);
            }
            float f = fI;
            fJ = fI2;
            fJ2 = f;
        } else {
            fJ = w03Var.i(iD, false);
            fJ2 = w03Var.i(iD + 1, true);
        }
        RectF rectF = new RectF(fJ, fH, fJ2, fE);
        return rw1Var.a(new o62(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 c(int i) {
        lj1 lj1Var = this.b;
        lj1Var.k(i);
        int length = ((sd) lj1Var.a.a).i.length();
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? eu.L(arrayList) : eu.G(i, arrayList));
        t9 t9Var = rw1Var.a;
        int iD = rw1Var.d(i);
        CharSequence charSequence = t9Var.e;
        w03 w03Var = t9Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbN = vi0.n(iD, "offset(", ") is out of bounds [0,");
            sbN.append(charSequence.length());
            sbN.append(']');
            lz0.a(sbN.toString());
        }
        float fI = w03Var.i(iD, false);
        int iG = w03Var.g(iD);
        return rw1Var.a(new o62(fI, w03Var.h(iG), fI, w03Var.e(iG)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(int i) {
        lj1 lj1Var = this.b;
        lj1Var.l(i);
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.H(i, arrayList));
        t9 t9Var = rw1Var.a;
        int i2 = i - rw1Var.d;
        w03 w03Var = t9Var.d;
        return w03Var.f.getLineLeft(i2) + (i2 == w03Var.g + (-1) ? w03Var.j : 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e(int i) {
        lj1 lj1Var = this.b;
        lj1Var.l(i);
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.H(i, arrayList));
        t9 t9Var = rw1Var.a;
        int i2 = i - rw1Var.d;
        w03 w03Var = t9Var.d;
        return w03Var.f.getLineRight(i2) + (i2 == w03Var.g + (-1) ? w03Var.k : 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y03) {
            y03 y03Var = (y03) obj;
            if (t11.l(this.a, y03Var.a) && this.b == y03Var.b && h11.a(this.c, y03Var.c) && this.d == y03Var.d && this.e == y03Var.e && t11.l(this.f, y03Var.f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int i) {
        lj1 lj1Var = this.b;
        lj1Var.l(i);
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.H(i, arrayList));
        t9 t9Var = rw1Var.a;
        return t9Var.d.f.getLineStart(i - rw1Var.d) + rw1Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c92 g(int i) {
        lj1 lj1Var = this.b;
        lj1Var.k(i);
        int length = ((sd) lj1Var.a.a).i.length();
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? eu.L(arrayList) : eu.G(i, arrayList));
        t9 t9Var = rw1Var.a;
        int iD = rw1Var.d(i);
        w03 w03Var = t9Var.d;
        return w03Var.f.getParagraphDirection(w03Var.g(iD)) == 1 ? c92.h : c92.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final y9 h(int i, int i2) {
        lj1 lj1Var = this.b;
        sd sdVar = (sd) lj1Var.a.a;
        if (i < 0 || i > i2 || i2 > sdVar.i.length()) {
            StringBuilder sbK = hk1.k("Start(", i, i2, ") or End(", ") is out of range [0..");
            sbK.append(sdVar.i.length());
            sbK.append("), or start > end!");
            lz0.a(sbK.toString());
        }
        if (i == i2) {
            return aa.a();
        }
        y9 y9VarA = aa.a();
        eu.J(lj1Var.h, fg1.i(i, i2), new e01(i, i2, 2, y9VarA));
        return y9VarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f.hashCode() + vi0.c(this.e, vi0.c(this.d, hk1.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long i(int i) {
        int iJ;
        int i2;
        int i3;
        lj1 lj1Var = this.b;
        lj1Var.k(i);
        int length = ((sd) lj1Var.a.a).i.length();
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? eu.L(arrayList) : eu.G(i, arrayList));
        t9 t9Var = rw1Var.a;
        int iD = rw1Var.d(i);
        sx1 sx1VarK = t9Var.d.k();
        if (sx1VarK.h(sx1VarK.j(iD))) {
            sx1VarK.a(iD);
            iJ = iD;
            while (iJ != -1 && (!sx1VarK.h(iJ) || sx1VarK.d(iJ))) {
                iJ = sx1VarK.j(iJ);
            }
        } else {
            sx1VarK.a(iD);
            iJ = sx1VarK.g(iD) ? (!sx1VarK.e(iD) || sx1VarK.c(iD)) ? sx1VarK.j(iD) : iD : sx1VarK.c(iD) ? sx1VarK.j(iD) : -1;
        }
        if (iJ == -1) {
            iJ = iD;
        }
        if (sx1VarK.d(sx1VarK.i(iD))) {
            sx1VarK.a(iD);
            i2 = iD;
            while (i2 != -1 && (sx1VarK.h(i2) || !sx1VarK.d(i2))) {
                i2 = sx1VarK.i(i2);
            }
        } else {
            sx1VarK.a(iD);
            if (sx1VarK.c(iD)) {
                if (!sx1VarK.e(iD) || sx1VarK.g(iD)) {
                    i3 = sx1VarK.i(iD);
                    i2 = i3;
                } else {
                    i2 = iD;
                }
            } else if (sx1VarK.g(iD)) {
                i3 = sx1VarK.i(iD);
                i2 = i3;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            iD = i2;
        }
        return rw1Var.b(fg1.i(iJ, iD), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) h11.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
