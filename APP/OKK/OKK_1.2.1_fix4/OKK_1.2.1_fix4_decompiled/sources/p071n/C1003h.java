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
    public float f3708d0 = -1.0f;

    /* JADX INFO: renamed from: e0 */
    public int f3709e0 = -1;

    /* JADX INFO: renamed from: f0 */
    public int f3710f0 = -1;

    /* JADX INFO: renamed from: g0 */
    public C0998c f3711g0 = this.f3637y;

    /* JADX INFO: renamed from: h0 */
    public int f3712h0 = 0;

    public C1003h() {
        this.f3590G.clear();
        this.f3590G.add(this.f3711g0);
        int length = this.f3589F.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f3589F[i2] = this.f3711g0;
        }
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: A */
    public final void mo2397A(C0985e c0985e) {
        if (this.f3592I == null) {
            return;
        }
        C0998c c0998c = this.f3711g0;
        c0985e.getClass();
        int iM2352m = C0985e.m2352m(c0998c);
        if (this.f3712h0 == 1) {
            this.f3597N = iM2352m;
            this.f3598O = 0;
            m2417v(this.f3592I.m2404i());
            m2420y(0);
            return;
        }
        this.f3597N = 0;
        this.f3598O = iM2352m;
        m2420y(this.f3592I.m2407l());
        m2417v(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m2436B(int i2) {
        if (this.f3712h0 == i2) {
            return;
        }
        this.f3712h0 = i2;
        ArrayList arrayList = this.f3590G;
        arrayList.clear();
        if (this.f3712h0 == 1) {
            this.f3711g0 = this.f3636x;
        } else {
            this.f3711g0 = this.f3637y;
        }
        arrayList.add(this.f3711g0);
        C0998c[] c0998cArr = this.f3589F;
        int length = c0998cArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            c0998cArr[i3] = this.f3711g0;
        }
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: a */
    public final void mo2386a(C0985e c0985e) {
        C1000e c1000e = (C1000e) this.f3592I;
        if (c1000e == null) {
            return;
        }
        C0998c c0998cMo2402g = c1000e.mo2402g(2);
        C0998c c0998cMo2402g2 = c1000e.mo2402g(4);
        C0999d c0999d = this.f3592I;
        boolean z2 = c0999d != null && c0999d.f3615c0[0] == 2;
        if (this.f3712h0 == 0) {
            c0998cMo2402g = c1000e.mo2402g(3);
            c0998cMo2402g2 = c1000e.mo2402g(5);
            C0999d c0999d2 = this.f3592I;
            z2 = c0999d2 != null && c0999d2.f3615c0[1] == 2;
        }
        if (this.f3709e0 != -1) {
            C0989i c0989iM2362j = c0985e.m2362j(this.f3711g0);
            c0985e.m2357e(c0989iM2362j, c0985e.m2362j(c0998cMo2402g), this.f3709e0, 8);
            if (z2) {
                c0985e.m2358f(c0985e.m2362j(c0998cMo2402g2), c0989iM2362j, 0, 5);
                return;
            }
            return;
        }
        if (this.f3710f0 != -1) {
            C0989i c0989iM2362j2 = c0985e.m2362j(this.f3711g0);
            C0989i c0989iM2362j3 = c0985e.m2362j(c0998cMo2402g2);
            c0985e.m2357e(c0989iM2362j2, c0989iM2362j3, -this.f3710f0, 8);
            if (z2) {
                c0985e.m2358f(c0989iM2362j2, c0985e.m2362j(c0998cMo2402g), 0, 5);
                c0985e.m2358f(c0989iM2362j3, c0989iM2362j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f3708d0 != -1.0f) {
            C0989i c0989iM2362j4 = c0985e.m2362j(this.f3711g0);
            C0989i c0989iM2362j5 = c0985e.m2362j(c0998cMo2402g2);
            float f2 = this.f3708d0;
            C0983c c0983cM2363k = c0985e.m2363k();
            c0983cM2363k.f3482d.mo2335c(c0989iM2362j4, -1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989iM2362j5, f2);
            c0985e.m2355c(c0983cM2363k);
        }
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: b */
    public final boolean mo2387b() {
        return true;
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: g */
    public final C0998c mo2402g(int i2) {
        switch (AbstractC0988h.m2372a(i2)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f3712h0 == 1) {
                    return this.f3711g0;
                }
                break;
            case 2:
            case 4:
                if (this.f3712h0 == 0) {
                    return this.f3711g0;
                }
                break;
        }
        throw new AssertionError(AbstractC0324d.m727j(i2));
    }
}
