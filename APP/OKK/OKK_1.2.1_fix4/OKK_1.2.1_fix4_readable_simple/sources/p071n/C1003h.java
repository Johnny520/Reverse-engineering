package p071n;

import java.util.ArrayList;
import p034S.AbstractC0324d;
import p069m.AbstractC0988h;
import p069m.C0983c;
import p069m.C0985e;
import p069m.C0989i;

/* JADX INFO: renamed from: n.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1003h extends C0999d {

    /* JADX INFO: renamed from: d0 */
    public float f3708d0;

    /* JADX INFO: renamed from: e0 */
    public int f3709e0;

    /* JADX INFO: renamed from: f0 */
    public int f3710f0;

    /* JADX INFO: renamed from: g0 */
    public C0998c f3711g0;

    /* JADX INFO: renamed from: h0 */
    public int f3712h0;

    public C1003h() {
        this.f3708d0 = -1.0f;
        this.f3709e0 = -1;
        this.f3710f0 = -1;
        this.f3711g0 = this.f3637y;
        int r02 = 0;
        this.f3712h0 = 0;
        this.f3590G.clear();
        this.f3590G.add(this.f3711g0);
        int r1 = this.f3589F.length;
    L3:
        if (r02 >= r1) goto L5;
        this.f3589F[r02] = this.f3711g0;
        r02 = r02 + 1;
        goto L3
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: A */
    public final void mo2397A(C0985e r4) {
        if (this.f3592I != null) goto L5;
        return;
    L5:
        C0998c r02 = this.f3711g0;
        r4.getClass();
        int r42 = C0985e.m2352m(r02);
        if (this.f3712h0 != 1) goto L8;
        this.f3597N = r42;
        this.f3598O = 0;
        m2417v(this.f3592I.m2404i());
        m2420y(0);
        return;
    L8:
        this.f3597N = 0;
        this.f3598O = r42;
        m2420y(this.f3592I.m2407l());
        m2417v(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m2436B(int r4) {
        if (this.f3712h0 != r4) goto L5;
        return;
    L5:
        this.f3712h0 = r4;
        ArrayList r42 = this.f3590G;
        r42.clear();
        if (this.f3712h0 != 1) goto L8;
        this.f3711g0 = this.f3636x;
    L9:
        r42.add(this.f3711g0);
        C0998c[] r43 = this.f3589F;
        int r02 = r43.length;
        int r1 = 0;
    L10:
        if (r1 >= r02) goto L12;
        r43[r1] = this.f3711g0;
        r1 = r1 + 1;
        goto L10
    L12:
        return;
    L8:
        this.f3711g0 = this.f3637y;
        goto L9
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: a */
    public final void mo2386a(C0985e r10) {
        C1000e r02 = (C1000e) this.f3592I;
        if (r02 != null) goto L5;
        return;
    L5:
        C0998c r2 = r02.mo2402g(2);
        C0998c r3 = r02.mo2402g(4);
        C0999d r4 = this.f3592I;
        boolean r5 = true;
        if (r4 != null) goto L8;
    L10:
        boolean r42 = false;
    L12:
        if (this.f3712h0 != 0) goto L21;
        r2 = r02.mo2402g(3);
        r3 = r02.mo2402g(5);
        C0999d r03 = this.f3592I;
        if (r03 != null) goto L16;
    L18:
        r5 = false;
    L19:
        r42 = r5;
        goto L21
    L16:
        if (r03.f3615c0[1] != 2) goto L18;
    L21:
        if (this.f3709e0 == (-1)) goto L26;
        C0989i r04 = r10.m2362j(this.f3711g0);
        r10.m2357e(r04, r10.m2362j(r2), this.f3709e0, 8);
        if (r42 == false) goto L34;
        r10.m2358f(r10.m2362j(r3), r04, 0, 5);
        return;
    L34:
        return;
    L26:
        if (this.f3710f0 == (-1)) goto L31;
        C0989i r05 = r10.m2362j(this.f3711g0);
        C0989i r32 = r10.m2362j(r3);
        r10.m2357e(r05, r32, -this.f3710f0, 8);
        if (r42 == false) goto L36;
        r10.m2358f(r05, r10.m2362j(r2), 0, 5);
        r10.m2358f(r32, r05, 0, 5);
        return;
    L36:
        return;
    L31:
        if (this.f3708d0 == (-1.0f)) goto L38;
        C0989i r06 = r10.m2362j(this.f3711g0);
        C0989i r22 = r10.m2362j(r3);
        float r33 = this.f3708d0;
        C0983c r43 = r10.m2363k();
        r43.f3482d.mo2335c(r06, -1.0f);
        r43.f3482d.mo2335c(r22, r33);
        r10.m2355c(r43);
        return;
    L38:
        return;
    L8:
        if (r4.f3615c0[0] != 2) goto L10;
        r42 = true;
        goto L12
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: b */
    public final boolean mo2387b() {
        return true;
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: g */
    public final C0998c mo2402g(int r3) {
        switch(AbstractC0988h.m2372a(r3)) {
            case 0: goto L15;
            case 1: goto L10;
            case 2: goto L6;
            case 3: goto L10;
            case 4: goto L6;
            case 5: goto L15;
            case 6: goto L15;
            case 7: goto L15;
            case 8: goto L15;
            default: goto L14;
        };
    L15:
        return null;
    L6:
        if (this.f3712h0 != 0) goto L14;
        return this.f3711g0;
    L10:
        if (this.f3712h0 != 1) goto L14;
        return this.f3711g0;
    L14:
        throw new AssertionError(AbstractC0324d.m727j(r3));
    }
}
