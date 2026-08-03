package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: N4 */
/* JADX INFO: loaded from: classes.dex */
public class C0564N4 {

    /* JADX INFO: renamed from: a */
    public C0256Fy f1842a;

    /* JADX INFO: renamed from: b */
    public float f1843b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1844c;

    /* JADX INFO: renamed from: d */
    public final C0177E4 f1845d;

    /* JADX INFO: renamed from: e */
    public boolean f1846e;

    public C0564N4(C2656w4 r2) {
        this.f1842a = null;
        this.f1843b = 0.0f;
        this.f1844c = new ArrayList();
        this.f1846e = false;
        this.f1845d = new C0177E4(this, r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1103a(C2244mo r4, int r5) {
        C0256Fy r0 = r4.m4571j(r5);
        this.f1845d.m367g(r0, 1.0f);
        C0256Fy r42 = r4.m4571j(r5);
        this.f1845d.m367g(r42, -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m1104b(C0256Fy r3, C0256Fy r4, C0256Fy r5, int r6) {
        boolean r0 = false;
        if (r6 == 0) goto L8;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r0 = true;
    L6:
        this.f1843b = r6;
    L8:
        if (r0 == true) goto L11;
        this.f1845d.m367g(r3, -1.0f);
        this.f1845d.m367g(r4, 1.0f);
        this.f1845d.m367g(r5, 1.0f);
        return;
    L11:
        this.f1845d.m367g(r3, 1.0f);
        this.f1845d.m367g(r4, -1.0f);
        this.f1845d.m367g(r5, -1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m1105c(C0256Fy r3, C0256Fy r4, C0256Fy r5, int r6) {
        boolean r0 = false;
        if (r6 == 0) goto L8;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r0 = true;
    L6:
        this.f1843b = r6;
    L8:
        if (r0 == true) goto L11;
        this.f1845d.m367g(r3, -1.0f);
        this.f1845d.m367g(r4, 1.0f);
        this.f1845d.m367g(r5, -1.0f);
        return;
    L11:
        this.f1845d.m367g(r3, 1.0f);
        this.f1845d.m367g(r4, -1.0f);
        this.f1845d.m367g(r5, 1.0f);
    }

    /* JADX INFO: renamed from: d */
    public C0256Fy mo1106d(boolean[] r2) {
        return m1108f(r2, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1107e() {
        if (this.f1842a == null) goto L5;
        return false;
    L5:
        if (this.f1843b == 0.0f) goto L7;
        return false;
    L7:
        if (this.f1845d.m364d() != 0) goto L13;
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C0256Fy m1108f(boolean[] r10, C0256Fy r11) {
        int r0 = this.f1845d.m364d();
        C0256Fy r2 = null;
        int r3 = 0;
        float r4 = 0.0f;
    L3:
        if (r3 >= r0) goto L19;
        float r5 = this.f1845d.m366f(r3);
        if (r5 >= 0.0f) goto L18;
        C0256Fy r6 = this.f1845d.m365e(r3);
        if (r10 != null) goto L9;
    L10:
        if (r6 == r11) goto L18;
        int r7 = r6.f840l;
        if (r7 == 3) goto L16;
        if (r7 != 4) goto L18;
    L16:
        if (r5 >= r4) goto L18;
        r4 = r5;
        r2 = r6;
        goto L18
    L9:
        if (r10[r6.f830b] == false) goto L10;
    L18:
        r3 = r3 + 1;
        goto L3
    L19:
        return r2;
    }

    /* JADX INFO: renamed from: g */
    public final void m1109g(C0256Fy r6) {
        C0256Fy r0 = this.f1842a;
        if (r0 == null) goto L5;
        this.f1845d.m367g(r0, -1.0f);
        this.f1842a.f831c = -1;
        this.f1842a = null;
    L5:
        float r02 = this.f1845d.m368h(r6, true) * (-1.0f);
        this.f1842a = r6;
        if (r02 != 1.0f) goto L8;
        return;
    L8:
        this.f1843b /= r02;
        C0177E4 r62 = this.f1845d;
        int r1 = r62.f517h;
        int r2 = 0;
    L10:
        if (r1 == (-1)) goto L14;
        if (r2 >= r62.f510a) goto L17;
        float[] r3 = r62.f516g;
        r3[r1] = r3[r1] / r02;
        r1 = r62.f515f[r1];
        r2 = r2 + 1;
        goto L10
    L17:
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m1110h(C2244mo r4, C0256Fy r5, boolean r6) {
        if (r5.f834f == false) goto L13;
        float r0 = this.f1845d.m363c(r5);
        float r1 = this.f1843b;
        this.f1843b = (r5.f833e * r0) + r1;
        this.f1845d.m368h(r5, r6);
        if (r6 == false) goto L9;
        r5.m534b(this);
    L9:
        if (this.f1845d.m364d() != 0) goto L12;
        this.f1846e = true;
        r4.f7927b = true;
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: i */
    public void mo1111i(C2244mo r8, C0564N4 r9, boolean r10) {
        C0177E4 r0 = this.f1845d;
        r0.getClass();
        float r1 = r0.m363c(r9.f1842a);
        r0.m368h(r9.f1842a, r10);
        C0177E4 r2 = r9.f1845d;
        int r3 = r2.m364d();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        C0256Fy r5 = r2.m365e(r4);
        r0.m361a(r5, r2.m363c(r5) * r1, r10);
        r4 = r4 + 1;
        goto L3
    L5:
        float r02 = this.f1843b;
        this.f1843b = (r9.f1843b * r1) + r02;
        if (r10 == false) goto L9;
        r9.f1842a.m534b(this);
    L9:
        if (this.f1842a != null) goto L11;
        return;
    L11:
        if (this.f1845d.m364d() != 0) goto L16;
        this.f1846e = true;
        r8.f7927b = true;
        return;
    }

    public String toString() {
        if (this.f1842a != null) goto L5;
        String r0 = "0";
    L6:
        String r02 = AbstractC0213Ey.m407e(r0, " = ");
        int r3 = 0;
        if (this.f1843b == 0.0f) goto L9;
        r02 = r02 + this.f1843b;
        boolean r1 = true;
    L10:
        int r5 = this.f1845d.m364d();
    L11:
        if (r3 >= r5) goto L33;
        C0256Fy r6 = this.f1845d.m365e(r3);
        if (r6 == null) goto L32;
        float r7 = this.f1845d.m366f(r3);
        if (r7 == 0.0f) goto L32;
        String r62 = r6.toString();
        if (r1 == false) goto L21;
        if (r7 <= 0.0f) goto L26;
        r02 = AbstractC0213Ey.m407e(r02, " + ");
    L28:
        if (r7 != 1.0f) goto L30;
        r02 = AbstractC0213Ey.m407e(r02, r62);
    L31:
        r1 = true;
        goto L32
    L30:
        r02 = r02 + r7 + " " + r62;
        goto L31
    L26:
        r02 = AbstractC0213Ey.m407e(r02, " - ");
    L23:
        r7 = r7 * (-1.0f);
        goto L28
    L21:
        if (r7 >= 0.0f) goto L28;
        r02 = AbstractC0213Ey.m407e(r02, "- ");
    L32:
        r3 = r3 + 1;
        goto L11
    L33:
        if (r1 == false) goto L35;
        return r02;
    L35:
        return AbstractC0213Ey.m407e(r02, "0.0");
    L9:
        r1 = false;
        goto L10
    L5:
        r0 = "" + this.f1842a;
        goto L6
    }
}
