package p071n;

import java.util.HashSet;
import java.util.Iterator;
import p034S.AbstractC0324d;
import p069m.AbstractC0988h;
import p069m.C0989i;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0998c {

    /* JADX INFO: renamed from: a */
    public HashSet f3577a;

    /* JADX INFO: renamed from: b */
    public final C0999d f3578b;

    /* JADX INFO: renamed from: c */
    public final int f3579c;

    /* JADX INFO: renamed from: d */
    public C0998c f3580d;

    /* JADX INFO: renamed from: e */
    public int f3581e;

    /* JADX INFO: renamed from: f */
    public int f3582f;

    /* JADX INFO: renamed from: g */
    public C0989i f3583g;

    public C0998c(C0999d r2, int r3) {
        this.f3577a = null;
        this.f3581e = 0;
        this.f3582f = -1;
        this.f3578b = r2;
        this.f3579c = r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2388a(C0998c r3, int r4) {
        m2389b(r3, r4, -1, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2389b(C0998c r3, int r4, int r5, boolean r6) {
        if (r3 != null) goto L7;
        m2395h();
        return true;
    L7:
        if (r6 == false) goto L9;
    L11:
        this.f3580d = r3;
        if (r3.f3577a != null) goto L14;
        r3.f3577a = new HashSet();
    L14:
        this.f3580d.f3577a.add(this);
        if (r4 <= 0) goto L17;
        this.f3581e = r4;
    L18:
        this.f3582f = r5;
        return true;
    L17:
        this.f3581e = 0;
        goto L18
    L9:
        if (m2394g(r3) == true) goto L11;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m2390c() {
        if (this.f3578b.f3605V != 8) goto L6;
        return 0;
    L6:
        int r02 = this.f3582f;
        if (r02 <= (-1)) goto L14;
        C0998c r2 = this.f3580d;
        if (r2 == null) goto L14;
        if (r2.f3578b.f3605V != 8) goto L14;
        return r02;
    L14:
        return this.f3581e;
    }

    /* JADX INFO: renamed from: d */
    public final C0998c m2391d() {
        int r02 = this.f3579c;
        int r1 = AbstractC0988h.m2372a(r02);
        C0999d r2 = this.f3578b;
        switch(r1) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L14;
            case 6: goto L14;
            case 7: goto L14;
            case 8: goto L14;
            default: goto L5;
        };
    L14:
        return null;
    L5:
        throw new AssertionError(AbstractC0324d.m727j(r02));
    L7:
        return r2.f3637y;
    L9:
        return r2.f3636x;
    L11:
        return r2.f3584A;
    L13:
        return r2.f3638z;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2392e() {
        HashSet r02 = this.f3577a;
        if (r02 != null) goto L5;
        return false;
    L5:
        Iterator r03 = r02.iterator();
    L7:
        if (r03.hasNext() == false) goto L12;
        if (((C0998c) r03.next()).m2391d().m2393f() == false) goto L7;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2393f() {
        if (this.f3580d == null) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2394g(C0998c r9) {
        boolean r02 = false;
        if (r9 != null) goto L5;
        return false;
    L5:
        int r2 = this.f3579c;
        C0999d r4 = r9.f3578b;
        int r92 = r9.f3579c;
        if (r92 != r2) goto L15;
        if (r2 == 6) goto L9;
    L13:
        return true;
    L9:
        if (r4.f3635w == true) goto L11;
    L12:
        return false;
    L11:
        if (this.f3578b.f3635w == true) goto L13;
    L15:
        switch(AbstractC0988h.m2372a(r2)) {
            case 0: goto L51;
            case 1: goto L38;
            case 2: goto L24;
            case 3: goto L38;
            case 4: goto L24;
            case 5: goto L51;
            case 6: goto L18;
            case 7: goto L51;
            case 8: goto L51;
            default: goto L17;
        };
    L18:
        if (r92 == 6) goto L52;
        if (r92 == 8) goto L53;
        if (r92 != 9) goto L22;
        return false;
    L22:
        return true;
    L53:
        return false;
    L52:
        return false;
    L51:
        return false;
    L17:
        throw new AssertionError(AbstractC0324d.m727j(r2));
    L24:
        if (r92 != 3) goto L26;
    L29:
        boolean r1 = true;
    L31:
        if ((r4 instanceof C1003h) == false) goto L55;
        if (r1 == true) goto L34;
        if (r92 == 9) goto L34;
    L36:
        return r02;
    L34:
        r02 = true;
        goto L36
    L55:
        return r1;
    L26:
        if (r92 == 5) goto L29;
        r1 = false;
        goto L31
    L38:
        if (r92 != 2) goto L40;
    L43:
        boolean r12 = true;
    L45:
        if ((r4 instanceof C1003h) == false) goto L56;
        if (r12 == true) goto L48;
        if (r92 == 8) goto L48;
    L50:
        return r02;
    L48:
        r02 = true;
        goto L50
    L56:
        return r12;
    L40:
        if (r92 == 4) goto L43;
        r12 = false;
        goto L45
    }

    /* JADX INFO: renamed from: h */
    public final void m2395h() {
        C0998c r02 = this.f3580d;
        if (r02 == null) goto L7;
        HashSet r03 = r02.f3577a;
        if (r03 == null) goto L7;
        r03.remove(this);
    L7:
        this.f3580d = null;
        this.f3581e = 0;
        this.f3582f = -1;
    }

    /* JADX INFO: renamed from: i */
    public final void m2396i() {
        C0989i r02 = this.f3583g;
        if (r02 != null) goto L5;
        this.f3583g = new C0989i(1);
        return;
    L5:
        r02.m2375c();
    }

    public final String toString() {
        return this.f3578b.f3606W + ":" + AbstractC0324d.m727j(this.f3579c);
    }
}
