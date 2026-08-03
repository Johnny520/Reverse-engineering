package p069m;

import java.util.ArrayList;
import p034S.AbstractC0324d;
import p043Y.C0463v;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: loaded from: classes.dex */
public class C0983c {

    /* JADX INFO: renamed from: d */
    public InterfaceC0982b f3482d;

    /* JADX INFO: renamed from: a */
    public C0989i f3479a = null;

    /* JADX INFO: renamed from: b */
    public float f3480b = 0.0f;

    /* JADX INFO: renamed from: c */
    public ArrayList f3481c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f3483e = false;

    public C0983c(C0463v c0463v) {
        this.f3482d = new C0981a(this, c0463v);
    }

    /* JADX INFO: renamed from: a */
    public final void m2344a(C0985e c0985e, int i2) {
        this.f3482d.mo2335c(c0985e.m2361i(i2), 1.0f);
        this.f3482d.mo2335c(c0985e.m2361i(i2), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m2345b(C0989i c0989i, C0989i c0989i2, C0989i c0989i3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3480b = i2;
        }
        if (z2) {
            this.f3482d.mo2335c(c0989i, 1.0f);
            this.f3482d.mo2335c(c0989i2, -1.0f);
            this.f3482d.mo2335c(c0989i3, -1.0f);
        } else {
            this.f3482d.mo2335c(c0989i, -1.0f);
            this.f3482d.mo2335c(c0989i2, 1.0f);
            this.f3482d.mo2335c(c0989i3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2346c(C0989i c0989i, C0989i c0989i2, C0989i c0989i3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3480b = i2;
        }
        if (z2) {
            this.f3482d.mo2335c(c0989i, 1.0f);
            this.f3482d.mo2335c(c0989i2, -1.0f);
            this.f3482d.mo2335c(c0989i3, 1.0f);
        } else {
            this.f3482d.mo2335c(c0989i, -1.0f);
            this.f3482d.mo2335c(c0989i2, 1.0f);
            this.f3482d.mo2335c(c0989i3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public C0989i mo2347d(boolean[] zArr) {
        return m2348e(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public final C0989i m2348e(boolean[] zArr, C0989i c0989i) {
        int i2;
        int iMo2343k = this.f3482d.mo2343k();
        C0989i c0989i2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < iMo2343k; i3++) {
            float fMo2333a = this.f3482d.mo2333a(i3);
            if (fMo2333a < 0.0f) {
                C0989i c0989iMo2336d = this.f3482d.mo2336d(i3);
                if ((zArr == null || !zArr[c0989iMo2336d.f3507b]) && c0989iMo2336d != c0989i && (((i2 = c0989iMo2336d.f3517l) == 3 || i2 == 4) && fMo2333a < f2)) {
                    f2 = fMo2333a;
                    c0989i2 = c0989iMo2336d;
                }
            }
        }
        return c0989i2;
    }

    /* JADX INFO: renamed from: f */
    public final void m2349f(C0989i c0989i) {
        C0989i c0989i2 = this.f3479a;
        if (c0989i2 != null) {
            this.f3482d.mo2335c(c0989i2, -1.0f);
            this.f3479a = null;
        }
        float fMo2341i = this.f3482d.mo2341i(c0989i, true) * (-1.0f);
        this.f3479a = c0989i;
        if (fMo2341i == 1.0f) {
            return;
        }
        this.f3480b /= fMo2341i;
        this.f3482d.mo2337e(fMo2341i);
    }

    /* JADX INFO: renamed from: g */
    public final void m2350g(C0989i c0989i, boolean z2) {
        if (c0989i.f3511f) {
            float fMo2339g = this.f3482d.mo2339g(c0989i);
            this.f3480b = (c0989i.f3510e * fMo2339g) + this.f3480b;
            this.f3482d.mo2341i(c0989i, z2);
            if (z2) {
                c0989i.m2374b(this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo2351h(C0983c c0983c, boolean z2) {
        float fMo2340h = this.f3482d.mo2340h(c0983c, z2);
        this.f3480b = (c0983c.f3480b * fMo2340h) + this.f3480b;
        if (z2) {
            c0983c.f3479a.m2374b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String strM722e = AbstractC0324d.m722e(this.f3479a == null ? "0" : "" + this.f3479a, " = ");
        if (this.f3480b != 0.0f) {
            strM722e = strM722e + this.f3480b;
            z2 = true;
        } else {
            z2 = false;
        }
        int iMo2343k = this.f3482d.mo2343k();
        for (int i2 = 0; i2 < iMo2343k; i2++) {
            C0989i c0989iMo2336d = this.f3482d.mo2336d(i2);
            if (c0989iMo2336d != null) {
                float fMo2333a = this.f3482d.mo2333a(i2);
                if (fMo2333a != 0.0f) {
                    String string = c0989iMo2336d.toString();
                    if (!z2) {
                        if (fMo2333a < 0.0f) {
                            strM722e = AbstractC0324d.m722e(strM722e, "- ");
                            fMo2333a *= -1.0f;
                        }
                        strM722e = fMo2333a == 1.0f ? AbstractC0324d.m722e(strM722e, string) : strM722e + fMo2333a + " " + string;
                        z2 = true;
                    } else if (fMo2333a > 0.0f) {
                        strM722e = AbstractC0324d.m722e(strM722e, " + ");
                        if (fMo2333a == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        strM722e = AbstractC0324d.m722e(strM722e, " - ");
                        fMo2333a *= -1.0f;
                        if (fMo2333a == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0324d.m722e(strM722e, "0.0") : strM722e;
    }
}
