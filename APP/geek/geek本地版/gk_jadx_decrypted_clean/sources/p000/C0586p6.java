package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: loaded from: classes.dex */
public class C0586p6 {

    /* JADX INFO: renamed from: d */
    public InterfaceC0548o6 f3673d;

    /* JADX INFO: renamed from: a */
    public a40 f3670a = null;

    /* JADX INFO: renamed from: b */
    public float f3671b = 0.0f;

    /* JADX INFO: renamed from: c */
    public ArrayList f3672c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f3674e = false;

    public C0586p6(C0009a8 c0009a8) {
        this.f3673d = new C0437l6(this, c0009a8);
    }

    /* JADX INFO: renamed from: a */
    public final void m2037a(C0041ar c0041ar, int i) {
        this.f3673d.mo506i(c0041ar.m461i(i), 1.0f);
        this.f3673d.mo506i(c0041ar.m461i(i), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m2038b(a40 a40Var, a40 a40Var2, a40 a40Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3671b = i;
        }
        if (z) {
            this.f3673d.mo506i(a40Var, 1.0f);
            this.f3673d.mo506i(a40Var2, -1.0f);
            this.f3673d.mo506i(a40Var3, -1.0f);
        } else {
            this.f3673d.mo506i(a40Var, -1.0f);
            this.f3673d.mo506i(a40Var2, 1.0f);
            this.f3673d.mo506i(a40Var3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2039c(a40 a40Var, a40 a40Var2, a40 a40Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3671b = i;
        }
        if (z) {
            this.f3673d.mo506i(a40Var, 1.0f);
            this.f3673d.mo506i(a40Var2, -1.0f);
            this.f3673d.mo506i(a40Var3, 1.0f);
        } else {
            this.f3673d.mo506i(a40Var, -1.0f);
            this.f3673d.mo506i(a40Var2, 1.0f);
            this.f3673d.mo506i(a40Var3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public a40 mo2040d(boolean[] zArr) {
        return m2041e(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public final a40 m2041e(boolean[] zArr, a40 a40Var) {
        int i;
        int iMo508k = this.f3673d.mo508k();
        a40 a40Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iMo508k; i2++) {
            float fMo498a = this.f3673d.mo498a(i2);
            if (fMo498a < 0.0f) {
                a40 a40VarMo502e = this.f3673d.mo502e(i2);
                if ((zArr == null || !zArr[a40VarMo502e.f29b]) && a40VarMo502e != a40Var && (((i = a40VarMo502e.f39l) == 3 || i == 4) && fMo498a < f)) {
                    f = fMo498a;
                    a40Var2 = a40VarMo502e;
                }
            }
        }
        return a40Var2;
    }

    /* JADX INFO: renamed from: f */
    public final void m2042f(a40 a40Var) {
        a40 a40Var2 = this.f3670a;
        if (a40Var2 != null) {
            this.f3673d.mo506i(a40Var2, -1.0f);
            this.f3670a = null;
        }
        float fMo501d = this.f3673d.mo501d(a40Var, true) * (-1.0f);
        this.f3670a = a40Var;
        if (fMo501d == 1.0f) {
            return;
        }
        this.f3671b /= fMo501d;
        this.f3673d.mo505h(fMo501d);
    }

    /* JADX INFO: renamed from: g */
    public final void m2043g(a40 a40Var, boolean z) {
        if (a40Var.f33f) {
            float fMo499b = this.f3673d.mo499b(a40Var);
            this.f3671b = (a40Var.f32e * fMo499b) + this.f3671b;
            this.f3673d.mo501d(a40Var, z);
            if (z) {
                a40Var.m12b(this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo2044h(C0586p6 c0586p6, boolean z) {
        float fMo504g = this.f3673d.mo504g(c0586p6, z);
        this.f3671b = (c0586p6.f3671b * fMo504g) + this.f3671b;
        if (z) {
            c0586p6.f3670a.m12b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            a40 r0 = r10.f3670a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            a40 r1 = r10.f3670a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = p000.z30.m2764i(r0, r1)
            float r1 = r10.f3671b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f3671b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            o6 r5 = r10.f3673d
            int r5 = r5.mo508k()
        L40:
            if (r3 >= r5) goto La0
            o6 r6 = r10.f3673d
            a40 r6 = r6.mo502e(r3)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            o6 r7 = r10.f3673d
            float r7 = r7.mo498a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = p000.z30.m2764i(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = p000.z30.m2764i(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = p000.z30.m2764i(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = p000.z30.m2764i(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r4
        L9d:
            int r3 = r3 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p000.z30.m2764i(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0586p6.toString():java.lang.String");
    }
}
