package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rb1 implements yo2 {
    public final yo2 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rb1(yo2 yo2Var) {
        this.a = yo2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final int a(String str) {
        str.getClass();
        Integer numE0 = wv2.e0(str);
        if (numE0 != null) {
            return numE0.intValue();
        }
        s.j(str.concat(" is not a valid list index"));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final s11 c() {
        return yv2.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final int d() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final String e(int i) {
        return String.valueOf(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb1)) {
            return false;
        }
        rb1 rb1Var = (rb1) obj;
        return t11.l(this.a, rb1Var.a) && t11.l(b(), rb1Var.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return b().hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final List i(int i) {
        if (i >= 0) {
            return be0.h;
        }
        c80.r(vi0.n(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final yo2 j(int i) {
        if (i >= 0) {
            return this.a;
        }
        c80.r(vi0.n(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        c80.r(vi0.n(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return b() + '(' + this.a + ')';
    }
}
