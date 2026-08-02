package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i13 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final String f4220a;

    /* JADX INFO: renamed from: b */
    public final m13 f4221b;

    /* JADX INFO: renamed from: c */
    public final xl0 f4222c;

    /* JADX INFO: renamed from: d */
    public final int f4223d;

    /* JADX INFO: renamed from: e */
    public final boolean f4224e;

    /* JADX INFO: renamed from: f */
    public final int f4225f;

    /* JADX INFO: renamed from: g */
    public final int f4226g;

    public i13(String str, m13 m13Var, xl0 xl0Var, int i, boolean z, int i2, int i3) {
        this.f4220a = str;
        this.f4221b = m13Var;
        this.f4222c = xl0Var;
        this.f4223d = i;
        this.f4224e = z;
        this.f4225f = i2;
        this.f4226g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i13)) {
            return false;
        }
        i13 i13Var = (i13) obj;
        return t11.m5086l(this.f4220a, i13Var.f4220a) && t11.m5086l(this.f4221b, i13Var.f4221b) && t11.m5086l(this.f4222c, i13Var.f4222c) && this.f4223d == i13Var.f4223d && this.f4224e == i13Var.f4224e && this.f4225f == i13Var.f4225f && this.f4226g == i13Var.f4226g;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        l13 l13Var = new l13();
        l13Var.f5887v = this.f4220a;
        l13Var.f5888w = this.f4221b;
        l13Var.f5889x = this.f4222c;
        l13Var.f5890y = this.f4223d;
        l13Var.f5891z = this.f4224e;
        l13Var.f5881A = this.f4225f;
        l13Var.f5882B = this.f4226g;
        return l13Var;
    }

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
    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo200g(th1 th1Var) {
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
        m13 m13Var = l13Var.f5888w;
        boolean z4 = false;
        boolean z5 = true;
        m13 m13Var2 = this.f4221b;
        if (m13Var2 != m13Var) {
            if (!m13Var2.f6435a.m2972b(m13Var.f6435a)) {
                z = true;
            }
            str = l13Var.f5887v;
            str2 = this.f4220a;
            if (!t11.m5086l(str, str2)) {
                l13Var.f5887v = str2;
                l13Var.f5886F = null;
                z4 = true;
            }
            boolean z6 = !l13Var.f5888w.m3026c(m13Var2);
            l13Var.f5888w = m13Var2;
            i = l13Var.f5882B;
            i2 = this.f4226g;
            if (i != i2) {
                l13Var.f5882B = i2;
                z6 = true;
            }
            i3 = l13Var.f5881A;
            i4 = this.f4225f;
            if (i3 != i4) {
                l13Var.f5881A = i4;
                z6 = true;
            }
            z2 = l13Var.f5891z;
            z3 = this.f4224e;
            if (z2 != z3) {
                l13Var.f5891z = z3;
                z6 = true;
            }
            xl0Var = l13Var.f5889x;
            xl0Var2 = this.f4222c;
            if (!t11.m5086l(xl0Var, xl0Var2)) {
                l13Var.f5889x = xl0Var2;
                z6 = true;
            }
            i5 = l13Var.f5890y;
            i6 = this.f4223d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                l13Var.f5890y = i6;
            }
            if (!z4 || z5) {
                uw1 uw1VarM2783M0 = l13Var.m2783M0();
                String str3 = l13Var.f5887v;
                m13 m13Var3 = l13Var.f5888w;
                xl0 xl0Var3 = l13Var.f5889x;
                int i7 = l13Var.f5890y;
                boolean z7 = l13Var.f5891z;
                int i8 = l13Var.f5881A;
                int i9 = l13Var.f5882B;
                uw1VarM2783M0.f11518a = str3;
                uw1VarM2783M0.f11519b = m13Var3;
                uw1VarM2783M0.f11520c = xl0Var3;
                uw1VarM2783M0.f11521d = i7;
                uw1VarM2783M0.f11522e = z7;
                uw1VarM2783M0.f11523f = i8;
                uw1VarM2783M0.f11524g = i9;
                uw1VarM2783M0.f11536s = (uw1VarM2783M0.f11536s << 2) | 2;
                uw1VarM2783M0.m5591c();
            }
            if (l13Var.f10770u) {
                return;
            }
            if (z4 || (z && l13Var.f5885E != null)) {
                qp0.m4223E(l13Var);
            }
            if (z4 || z5) {
                gf1.m1853A(l13Var);
                ci0.m788M(l13Var);
            }
            if (z) {
                ci0.m788M(l13Var);
                return;
            }
            return;
        }
        m13Var2.getClass();
        z = false;
        str = l13Var.f5887v;
        str2 = this.f4220a;
        if (!t11.m5086l(str, str2)) {
        }
        boolean z62 = !l13Var.f5888w.m3026c(m13Var2);
        l13Var.f5888w = m13Var2;
        i = l13Var.f5882B;
        i2 = this.f4226g;
        if (i != i2) {
        }
        i3 = l13Var.f5881A;
        i4 = this.f4225f;
        if (i3 != i4) {
        }
        z2 = l13Var.f5891z;
        z3 = this.f4224e;
        if (z2 != z3) {
        }
        xl0Var = l13Var.f5889x;
        xl0Var2 = this.f4222c;
        if (!t11.m5086l(xl0Var, xl0Var2)) {
        }
        i5 = l13Var.f5890y;
        i6 = this.f4223d;
        if (i5 != i6) {
        }
        if (!z4) {
            uw1 uw1VarM2783M02 = l13Var.m2783M0();
            String str32 = l13Var.f5887v;
            m13 m13Var32 = l13Var.f5888w;
            xl0 xl0Var32 = l13Var.f5889x;
            int i72 = l13Var.f5890y;
            boolean z72 = l13Var.f5891z;
            int i82 = l13Var.f5881A;
            int i92 = l13Var.f5882B;
            uw1VarM2783M02.f11518a = str32;
            uw1VarM2783M02.f11519b = m13Var32;
            uw1VarM2783M02.f11520c = xl0Var32;
            uw1VarM2783M02.f11521d = i72;
            uw1VarM2783M02.f11522e = z72;
            uw1VarM2783M02.f11523f = i82;
            uw1VarM2783M02.f11524g = i92;
            uw1VarM2783M02.f11536s = (uw1VarM2783M02.f11536s << 2) | 2;
            uw1VarM2783M02.m5591c();
        }
        if (l13Var.f10770u) {
        }
    }

    public final int hashCode() {
        return (((hk1.m2205d(vi0.m5685d(this.f4223d, (this.f4222c.hashCode() + hk1.m2206e(this.f4221b, this.f4220a.hashCode() * 31, 31)) * 31, 31), 31, this.f4224e) + this.f4225f) * 31) + this.f4226g) * 31;
    }
}
