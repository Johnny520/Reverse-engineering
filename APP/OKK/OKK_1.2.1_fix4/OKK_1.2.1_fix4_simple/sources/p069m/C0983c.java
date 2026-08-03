package p069m;

import java.util.ArrayList;
import p034S.AbstractC0324d;
import p043Y.C0463v;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: loaded from: classes.dex */
public class C0983c {

    /* JADX INFO: renamed from: a */
    public C0989i f3479a;

    /* JADX INFO: renamed from: b */
    public float f3480b;

    /* JADX INFO: renamed from: c */
    public ArrayList f3481c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0982b f3482d;

    /* JADX INFO: renamed from: e */
    public boolean f3483e;

    public C0983c(C0463v r2) {
        this.f3479a = null;
        this.f3480b = 0.0f;
        this.f3481c = new ArrayList();
        this.f3483e = false;
        this.f3482d = new C0981a(this, r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2344a(C0985e r4, int r5) {
        this.f3482d.mo2335c(r4.m2361i(r5), 1.0f);
        this.f3482d.mo2335c(r4.m2361i(r5), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m2345b(C0989i r3, C0989i r4, C0989i r5, int r6) {
        boolean r02 = false;
        if (r6 == 0) goto L8;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r02 = true;
    L6:
        this.f3480b = r6;
    L8:
        if (r02 == true) goto L10;
        this.f3482d.mo2335c(r3, -1.0f);
        this.f3482d.mo2335c(r4, 1.0f);
        this.f3482d.mo2335c(r5, 1.0f);
        return;
    L10:
        this.f3482d.mo2335c(r3, 1.0f);
        this.f3482d.mo2335c(r4, -1.0f);
        this.f3482d.mo2335c(r5, -1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m2346c(C0989i r3, C0989i r4, C0989i r5, int r6) {
        boolean r02 = false;
        if (r6 == 0) goto L8;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r02 = true;
    L6:
        this.f3480b = r6;
    L8:
        if (r02 == true) goto L10;
        this.f3482d.mo2335c(r3, -1.0f);
        this.f3482d.mo2335c(r4, 1.0f);
        this.f3482d.mo2335c(r5, -1.0f);
        return;
    L10:
        this.f3482d.mo2335c(r3, 1.0f);
        this.f3482d.mo2335c(r4, -1.0f);
        this.f3482d.mo2335c(r5, 1.0f);
    }

    /* JADX INFO: renamed from: d */
    public C0989i mo2347d(boolean[] r2) {
        return m2348e(r2, null);
    }

    /* JADX INFO: renamed from: e */
    public final C0989i m2348e(boolean[] r10, C0989i r11) {
        int r02 = this.f3482d.mo2343k();
        C0989i r2 = null;
        int r3 = 0;
        float r4 = 0.0f;
    L3:
        if (r3 >= r02) goto L19;
        float r5 = this.f3482d.mo2333a(r3);
        if (r5 >= 0.0f) goto L18;
        C0989i r6 = this.f3482d.mo2336d(r3);
        if (r10 != null) goto L9;
    L10:
        if (r6 == r11) goto L18;
        int r7 = r6.f3517l;
        if (r7 == 3) goto L16;
        if (r7 != 4) goto L18;
    L16:
        if (r5 >= r4) goto L18;
        r4 = r5;
        r2 = r6;
        goto L18
    L9:
        if (r10[r6.f3507b] == false) goto L10;
    L18:
        r3 = r3 + 1;
        goto L3
    L19:
        return r2;
    }

    /* JADX INFO: renamed from: f */
    public final void m2349f(C0989i r4) {
        C0989i r02 = this.f3479a;
        if (r02 == null) goto L5;
        this.f3482d.mo2335c(r02, -1.0f);
        this.f3479a = null;
    L5:
        float r03 = this.f3482d.mo2341i(r4, true) * (-1.0f);
        this.f3479a = r4;
        if (r03 != 1.0f) goto L8;
        return;
    L8:
        this.f3480b /= r03;
        this.f3482d.mo2337e(r03);
    }

    /* JADX INFO: renamed from: g */
    public final void m2350g(C0989i r4, boolean r5) {
        if (r4.f3511f == true) goto L5;
        return;
    L5:
        float r02 = this.f3482d.mo2339g(r4);
        float r1 = this.f3480b;
        this.f3480b = (r4.f3510e * r02) + r1;
        this.f3482d.mo2341i(r4, r5);
        if (r5 == false) goto L9;
        r4.m2374b(this);
        return;
    }

    /* JADX INFO: renamed from: h */
    public void mo2351h(C0983c r4, boolean r5) {
        float r02 = this.f3482d.mo2340h(r4, r5);
        float r1 = this.f3480b;
        this.f3480b = (r4.f3480b * r02) + r1;
        if (r5 == false) goto L6;
        r4.f3479a.m2374b(this);
        return;
    }

    public String toString() {
        if (this.f3479a != null) goto L5;
        String r02 = "0";
    L6:
        String r03 = AbstractC0324d.m722e(r02, " = ");
        int r4 = 0;
        if (this.f3480b == 0.0f) goto L9;
        r03 = r03 + this.f3480b;
        boolean r1 = true;
    L10:
        int r5 = this.f3482d.mo2343k();
    L11:
        if (r4 >= r5) goto L33;
        C0989i r6 = this.f3482d.mo2336d(r4);
        if (r6 == null) goto L32;
        float r7 = this.f3482d.mo2333a(r4);
        if (r7 == 0.0f) goto L32;
        String r62 = r6.toString();
        if (r1 == false) goto L21;
        if (r7 <= 0.0f) goto L26;
        r03 = AbstractC0324d.m722e(r03, " + ");
    L28:
        if (r7 != 1.0f) goto L30;
        r03 = AbstractC0324d.m722e(r03, r62);
    L31:
        r1 = true;
        goto L32
    L30:
        r03 = r03 + r7 + " " + r62;
        goto L31
    L26:
        r03 = AbstractC0324d.m722e(r03, " - ");
    L23:
        r7 = r7 * (-1.0f);
        goto L28
    L21:
        if (r7 >= 0.0f) goto L28;
        r03 = AbstractC0324d.m722e(r03, "- ");
    L32:
        r4 = r4 + 1;
        goto L11
    L33:
        if (r1 == false) goto L35;
        return r03;
    L35:
        return AbstractC0324d.m722e(r03, "0.0");
    L9:
        r1 = false;
        goto L10
    L5:
        r02 = "" + this.f3479a;
        goto L6
    }
}
