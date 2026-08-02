package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i13 extends yh1 {
    public final String a;
    public final m13 b;
    public final xl0 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i13(String str, m13 m13Var, xl0 xl0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = m13Var;
        this.c = xl0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i13)) {
            return false;
        }
        i13 i13Var = (i13) obj;
        return t11.l(this.a, i13Var.a) && t11.l(this.b, i13Var.b) && t11.l(this.c, i13Var.c) && this.d == i13Var.d && this.e == i13Var.e && this.f == i13Var.f && this.g == i13Var.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        l13 l13Var = new l13();
        l13Var.v = this.a;
        l13Var.w = this.b;
        l13Var.x = this.c;
        l13Var.y = this.d;
        l13Var.z = this.e;
        l13Var.A = this.f;
        l13Var.B = this.g;
        return l13Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(th1 th1Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        xl0 xl0Var;
        xl0 xl0Var2;
        int i5;
        int i6;
        l13 l13Var = (l13) th1Var;
        l13Var.getClass();
        m13 m13Var = l13Var.w;
        boolean z4 = false;
        boolean z5 = true;
        m13 m13Var2 = this.b;
        if (m13Var2 != m13Var) {
            if (!m13Var2.a.b(m13Var.a)) {
                z = true;
            }
            str = l13Var.v;
            str2 = this.a;
            if (!t11.l(str, str2)) {
                l13Var.v = str2;
                l13Var.F = null;
                z4 = true;
            }
            boolean z6 = !l13Var.w.c(m13Var2);
            l13Var.w = m13Var2;
            i = l13Var.B;
            i2 = this.g;
            if (i != i2) {
                l13Var.B = i2;
                z6 = true;
            }
            i3 = l13Var.A;
            i4 = this.f;
            if (i3 != i4) {
                l13Var.A = i4;
                z6 = true;
            }
            z2 = l13Var.z;
            z3 = this.e;
            if (z2 != z3) {
                l13Var.z = z3;
                z6 = true;
            }
            xl0Var = l13Var.x;
            xl0Var2 = this.c;
            if (!t11.l(xl0Var, xl0Var2)) {
                l13Var.x = xl0Var2;
                z6 = true;
            }
            i5 = l13Var.y;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                l13Var.y = i6;
            }
            if (!z4 || z5) {
                uw1 uw1VarM0 = l13Var.M0();
                String str3 = l13Var.v;
                m13 m13Var3 = l13Var.w;
                xl0 xl0Var3 = l13Var.x;
                int i7 = l13Var.y;
                boolean z7 = l13Var.z;
                int i8 = l13Var.A;
                int i9 = l13Var.B;
                uw1VarM0.a = str3;
                uw1VarM0.b = m13Var3;
                uw1VarM0.c = xl0Var3;
                uw1VarM0.d = i7;
                uw1VarM0.e = z7;
                uw1VarM0.f = i8;
                uw1VarM0.g = i9;
                uw1VarM0.s = (uw1VarM0.s << 2) | 2;
                uw1VarM0.c();
            }
            if (l13Var.u) {
                return;
            }
            if (z4 || (z && l13Var.E != null)) {
                qp0.E(l13Var);
            }
            if (z4 || z5) {
                gf1.A(l13Var);
                ci0.M(l13Var);
            }
            if (z) {
                ci0.M(l13Var);
                return;
            }
            return;
        }
        m13Var2.getClass();
        z = false;
        str = l13Var.v;
        str2 = this.a;
        if (!t11.l(str, str2)) {
        }
        boolean z62 = !l13Var.w.c(m13Var2);
        l13Var.w = m13Var2;
        i = l13Var.B;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = l13Var.A;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = l13Var.z;
        z3 = this.e;
        if (z2 != z3) {
        }
        xl0Var = l13Var.x;
        xl0Var2 = this.c;
        if (!t11.l(xl0Var, xl0Var2)) {
        }
        i5 = l13Var.y;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z4) {
            uw1 uw1VarM02 = l13Var.M0();
            String str32 = l13Var.v;
            m13 m13Var32 = l13Var.w;
            xl0 xl0Var32 = l13Var.x;
            int i72 = l13Var.y;
            boolean z72 = l13Var.z;
            int i82 = l13Var.A;
            int i92 = l13Var.B;
            uw1VarM02.a = str32;
            uw1VarM02.b = m13Var32;
            uw1VarM02.c = xl0Var32;
            uw1VarM02.d = i72;
            uw1VarM02.e = z72;
            uw1VarM02.f = i82;
            uw1VarM02.g = i92;
            uw1VarM02.s = (uw1VarM02.s << 2) | 2;
            uw1VarM02.c();
        }
        if (l13Var.u) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((hk1.d(vi0.d(this.d, (this.c.hashCode() + hk1.e(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
