package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: N4 */
/* JADX INFO: loaded from: classes.dex */
public class C0564N4 {

    /* JADX INFO: renamed from: d */
    public final C0177E4 f1845d;

    /* JADX INFO: renamed from: a */
    public C0256Fy f1842a = null;

    /* JADX INFO: renamed from: b */
    public float f1843b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1844c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f1846e = false;

    public C0564N4(C2656w4 c2656w4) {
        this.f1845d = new C0177E4(this, c2656w4);
    }

    /* JADX INFO: renamed from: a */
    public final void m1103a(C2244mo c2244mo, int i) {
        this.f1845d.m367g(c2244mo.m4571j(i), 1.0f);
        this.f1845d.m367g(c2244mo.m4571j(i), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m1104b(C0256Fy c0256Fy, C0256Fy c0256Fy2, C0256Fy c0256Fy3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1843b = i;
        }
        if (z) {
            this.f1845d.m367g(c0256Fy, 1.0f);
            this.f1845d.m367g(c0256Fy2, -1.0f);
            this.f1845d.m367g(c0256Fy3, -1.0f);
        } else {
            this.f1845d.m367g(c0256Fy, -1.0f);
            this.f1845d.m367g(c0256Fy2, 1.0f);
            this.f1845d.m367g(c0256Fy3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1105c(C0256Fy c0256Fy, C0256Fy c0256Fy2, C0256Fy c0256Fy3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1843b = i;
        }
        if (z) {
            this.f1845d.m367g(c0256Fy, 1.0f);
            this.f1845d.m367g(c0256Fy2, -1.0f);
            this.f1845d.m367g(c0256Fy3, 1.0f);
        } else {
            this.f1845d.m367g(c0256Fy, -1.0f);
            this.f1845d.m367g(c0256Fy2, 1.0f);
            this.f1845d.m367g(c0256Fy3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public C0256Fy mo1106d(boolean[] zArr) {
        return m1108f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1107e() {
        return this.f1842a == null && this.f1843b == 0.0f && this.f1845d.m364d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C0256Fy m1108f(boolean[] zArr, C0256Fy c0256Fy) {
        int i;
        int iM364d = this.f1845d.m364d();
        C0256Fy c0256Fy2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM364d; i2++) {
            float fM366f = this.f1845d.m366f(i2);
            if (fM366f < 0.0f) {
                C0256Fy c0256FyM365e = this.f1845d.m365e(i2);
                if ((zArr == null || !zArr[c0256FyM365e.f830b]) && c0256FyM365e != c0256Fy && (((i = c0256FyM365e.f840l) == 3 || i == 4) && fM366f < f)) {
                    f = fM366f;
                    c0256Fy2 = c0256FyM365e;
                }
            }
        }
        return c0256Fy2;
    }

    /* JADX INFO: renamed from: g */
    public final void m1109g(C0256Fy c0256Fy) {
        C0256Fy c0256Fy2 = this.f1842a;
        if (c0256Fy2 != null) {
            this.f1845d.m367g(c0256Fy2, -1.0f);
            this.f1842a.f831c = -1;
            this.f1842a = null;
        }
        float fM368h = this.f1845d.m368h(c0256Fy, true) * (-1.0f);
        this.f1842a = c0256Fy;
        if (fM368h == 1.0f) {
            return;
        }
        this.f1843b /= fM368h;
        C0177E4 c0177e4 = this.f1845d;
        int i = c0177e4.f517h;
        for (int i2 = 0; i != -1 && i2 < c0177e4.f510a; i2++) {
            float[] fArr = c0177e4.f516g;
            fArr[i] = fArr[i] / fM368h;
            i = c0177e4.f515f[i];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1110h(C2244mo c2244mo, C0256Fy c0256Fy, boolean z) {
        if (c0256Fy.f834f) {
            float fM363c = this.f1845d.m363c(c0256Fy);
            this.f1843b = (c0256Fy.f833e * fM363c) + this.f1843b;
            this.f1845d.m368h(c0256Fy, z);
            if (z) {
                c0256Fy.m534b(this);
            }
            if (this.f1845d.m364d() == 0) {
                this.f1846e = true;
                c2244mo.f7927b = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo1111i(C2244mo c2244mo, C0564N4 c0564n4, boolean z) {
        C0177E4 c0177e4 = this.f1845d;
        c0177e4.getClass();
        float fM363c = c0177e4.m363c(c0564n4.f1842a);
        c0177e4.m368h(c0564n4.f1842a, z);
        C0177E4 c0177e42 = c0564n4.f1845d;
        int iM364d = c0177e42.m364d();
        for (int i = 0; i < iM364d; i++) {
            C0256Fy c0256FyM365e = c0177e42.m365e(i);
            c0177e4.m361a(c0256FyM365e, c0177e42.m363c(c0256FyM365e) * fM363c, z);
        }
        this.f1843b = (c0564n4.f1843b * fM363c) + this.f1843b;
        if (z) {
            c0564n4.f1842a.m534b(this);
        }
        if (this.f1842a == null || this.f1845d.m364d() != 0) {
            return;
        }
        this.f1846e = true;
        c2244mo.f7927b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String strM407e = AbstractC0213Ey.m407e(this.f1842a == null ? "0" : "" + this.f1842a, " = ");
        if (this.f1843b != 0.0f) {
            strM407e = strM407e + this.f1843b;
            z = true;
        } else {
            z = false;
        }
        int iM364d = this.f1845d.m364d();
        for (int i = 0; i < iM364d; i++) {
            C0256Fy c0256FyM365e = this.f1845d.m365e(i);
            if (c0256FyM365e != null) {
                float fM366f = this.f1845d.m366f(i);
                if (fM366f != 0.0f) {
                    String string = c0256FyM365e.toString();
                    if (!z) {
                        if (fM366f < 0.0f) {
                            strM407e = AbstractC0213Ey.m407e(strM407e, "- ");
                            fM366f *= -1.0f;
                        }
                        strM407e = fM366f == 1.0f ? AbstractC0213Ey.m407e(strM407e, string) : strM407e + fM366f + " " + string;
                        z = true;
                    } else if (fM366f > 0.0f) {
                        strM407e = AbstractC0213Ey.m407e(strM407e, " + ");
                        if (fM366f == 1.0f) {
                        }
                        z = true;
                    } else {
                        strM407e = AbstractC0213Ey.m407e(strM407e, " - ");
                        fM366f *= -1.0f;
                        if (fM366f == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? AbstractC0213Ey.m407e(strM407e, "0.0") : strM407e;
    }
}
