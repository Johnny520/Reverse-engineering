package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: loaded from: classes.dex */
public class C0585p6 {

    /* JADX INFO: renamed from: d */
    public InterfaceC0548o6 f3603d;

    /* JADX INFO: renamed from: a */
    public h40 f3600a = null;

    /* JADX INFO: renamed from: b */
    public float f3601b = 0.0f;

    /* JADX INFO: renamed from: c */
    public ArrayList f3602c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f3604e = false;

    public C0585p6(C0402k8 c0402k8) {
        this.f3603d = new C0437l6(this, c0402k8);
    }

    /* JADX INFO: renamed from: a */
    public final void m2066a(C0197er c0197er, int i) {
        this.f3603d.mo1451i(c0197er.m1009i(i), 1.0f);
        this.f3603d.mo1451i(c0197er.m1009i(i), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m2067b(h40 h40Var, h40 h40Var2, h40 h40Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3601b = i;
        }
        if (z) {
            this.f3603d.mo1451i(h40Var, 1.0f);
            this.f3603d.mo1451i(h40Var2, -1.0f);
            this.f3603d.mo1451i(h40Var3, -1.0f);
        } else {
            this.f3603d.mo1451i(h40Var, -1.0f);
            this.f3603d.mo1451i(h40Var2, 1.0f);
            this.f3603d.mo1451i(h40Var3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2068c(h40 h40Var, h40 h40Var2, h40 h40Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3601b = i;
        }
        if (z) {
            this.f3603d.mo1451i(h40Var, 1.0f);
            this.f3603d.mo1451i(h40Var2, -1.0f);
            this.f3603d.mo1451i(h40Var3, 1.0f);
        } else {
            this.f3603d.mo1451i(h40Var, -1.0f);
            this.f3603d.mo1451i(h40Var2, 1.0f);
            this.f3603d.mo1451i(h40Var3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public h40 mo1543d(boolean[] zArr) {
        return m2069e(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public final h40 m2069e(boolean[] zArr, h40 h40Var) {
        int i;
        int iMo1453k = this.f3603d.mo1453k();
        h40 h40Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iMo1453k; i2++) {
            float fMo1443a = this.f3603d.mo1443a(i2);
            if (fMo1443a < 0.0f) {
                h40 h40VarMo1447e = this.f3603d.mo1447e(i2);
                if ((zArr == null || !zArr[h40VarMo1447e.f2101b]) && h40VarMo1447e != h40Var && (((i = h40VarMo1447e.f2111l) == 3 || i == 4) && fMo1443a < f)) {
                    f = fMo1443a;
                    h40Var2 = h40VarMo1447e;
                }
            }
        }
        return h40Var2;
    }

    /* JADX INFO: renamed from: f */
    public final void m2070f(h40 h40Var) {
        h40 h40Var2 = this.f3600a;
        if (h40Var2 != null) {
            this.f3603d.mo1451i(h40Var2, -1.0f);
            this.f3600a = null;
        }
        float fMo1446d = this.f3603d.mo1446d(h40Var, true) * (-1.0f);
        this.f3600a = h40Var;
        if (fMo1446d == 1.0f) {
            return;
        }
        this.f3601b /= fMo1446d;
        this.f3603d.mo1450h(fMo1446d);
    }

    /* JADX INFO: renamed from: g */
    public final void m2071g(h40 h40Var, boolean z) {
        if (h40Var.f2105f) {
            float fMo1444b = this.f3603d.mo1444b(h40Var);
            this.f3601b = (h40Var.f2104e * fMo1444b) + this.f3601b;
            this.f3603d.mo1446d(h40Var, z);
            if (z) {
                h40Var.m1352b(this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo1544h(C0585p6 c0585p6, boolean z) {
        float fMo1449g = this.f3603d.mo1449g(c0585p6, z);
        this.f3601b = (c0585p6.f3601b * fMo1449g) + this.f3601b;
        if (z) {
            c0585p6.f3600a.m1352b(this);
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
            h40 r0 = r10.f3600a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            h40 r1 = r10.f3600a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = p000.g40.m1146i(r0, r1)
            float r1 = r10.f3601b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f3601b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            o6 r5 = r10.f3603d
            int r5 = r5.mo1453k()
        L40:
            if (r3 >= r5) goto La0
            o6 r6 = r10.f3603d
            h40 r6 = r6.mo1447e(r3)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            o6 r7 = r10.f3603d
            float r7 = r7.mo1443a(r3)
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
            java.lang.String r0 = p000.g40.m1146i(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = p000.g40.m1146i(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = p000.g40.m1146i(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = p000.g40.m1146i(r0, r6)
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
            java.lang.String r0 = p000.g40.m1146i(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0585p6.toString():java.lang.String");
    }
}
