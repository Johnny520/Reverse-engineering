package p071n;

import p034S.AbstractC0324d;
import p069m.C0983c;
import p069m.C0985e;
import p069m.C0989i;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0996a extends AbstractC1004i {

    /* JADX INFO: renamed from: f0 */
    public int f3557f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f3558g0;

    /* JADX INFO: renamed from: h0 */
    public int f3559h0;

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: a */
    public final void mo2386a(C0985e c0985e) {
        boolean z2;
        int i2;
        int i3;
        C0998c[] c0998cArr = this.f3589F;
        C0998c c0998c = this.f3636x;
        c0998cArr[0] = c0998c;
        C0998c c0998c2 = this.f3637y;
        int i4 = 2;
        c0998cArr[2] = c0998c2;
        C0998c c0998c3 = this.f3638z;
        c0998cArr[1] = c0998c3;
        C0998c c0998c4 = this.f3584A;
        c0998cArr[3] = c0998c4;
        for (C0998c c0998c5 : c0998cArr) {
            c0998c5.f3583g = c0985e.m2362j(c0998c5);
        }
        int i5 = this.f3557f0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C0998c c0998c6 = c0998cArr[i5];
        for (int i6 = 0; i6 < this.f3714e0; i6++) {
            C0999d c0999d = this.f3713d0[i6];
            if ((this.f3558g0 || c0999d.mo2387b()) && ((((i3 = this.f3557f0) == 0 || i3 == 1) && c0999d.f3615c0[0] == 3 && c0999d.f3636x.f3580d != null && c0999d.f3638z.f3580d != null) || ((i3 == 2 || i3 == 3) && c0999d.f3615c0[1] == 3 && c0999d.f3637y.f3580d != null && c0999d.f3584A.f3580d != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c0998c.m2392e() || c0998c3.m2392e();
        boolean z4 = c0998c2.m2392e() || c0998c4.m2392e();
        int i7 = (z2 || !(((i2 = this.f3557f0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3714e0) {
            C0999d c0999d2 = this.f3713d0[i8];
            if (this.f3558g0 || c0999d2.mo2387b()) {
                C0989i c0989iM2362j = c0985e.m2362j(c0999d2.f3589F[this.f3557f0]);
                int i9 = this.f3557f0;
                C0998c c0998c7 = c0999d2.f3589F[i9];
                c0998c7.f3583g = c0989iM2362j;
                C0998c c0998c8 = c0998c7.f3580d;
                int i10 = (c0998c8 == null || c0998c8.f3578b != this) ? 0 : c0998c7.f3581e;
                if (i9 == 0 || i9 == i4) {
                    C0989i c0989i = c0998c6.f3583g;
                    int i11 = this.f3559h0 - i10;
                    C0983c c0983cM2363k = c0985e.m2363k();
                    C0989i c0989iM2364l = c0985e.m2364l();
                    c0989iM2364l.f3509d = 0;
                    c0983cM2363k.m2346c(c0989i, c0989iM2362j, c0989iM2364l, i11);
                    c0985e.m2355c(c0983cM2363k);
                } else {
                    C0989i c0989i2 = c0998c6.f3583g;
                    int i12 = this.f3559h0 + i10;
                    C0983c c0983cM2363k2 = c0985e.m2363k();
                    C0989i c0989iM2364l2 = c0985e.m2364l();
                    c0989iM2364l2.f3509d = 0;
                    c0983cM2363k2.m2345b(c0989i2, c0989iM2362j, c0989iM2364l2, i12);
                    c0985e.m2355c(c0983cM2363k2);
                }
                c0985e.m2357e(c0998c6.f3583g, c0989iM2362j, this.f3559h0 + i10, i7);
            }
            i8++;
            i4 = 2;
        }
        int i13 = this.f3557f0;
        if (i13 == 0) {
            c0985e.m2357e(c0998c3.f3583g, c0998c.f3583g, 0, 8);
            c0985e.m2357e(c0998c.f3583g, this.f3592I.f3638z.f3583g, 0, 4);
            c0985e.m2357e(c0998c.f3583g, this.f3592I.f3636x.f3583g, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0985e.m2357e(c0998c.f3583g, c0998c3.f3583g, 0, 8);
            c0985e.m2357e(c0998c.f3583g, this.f3592I.f3636x.f3583g, 0, 4);
            c0985e.m2357e(c0998c.f3583g, this.f3592I.f3638z.f3583g, 0, 0);
        } else if (i13 == 2) {
            c0985e.m2357e(c0998c4.f3583g, c0998c2.f3583g, 0, 8);
            c0985e.m2357e(c0998c2.f3583g, this.f3592I.f3584A.f3583g, 0, 4);
            c0985e.m2357e(c0998c2.f3583g, this.f3592I.f3637y.f3583g, 0, 0);
        } else if (i13 == 3) {
            c0985e.m2357e(c0998c2.f3583g, c0998c4.f3583g, 0, 8);
            c0985e.m2357e(c0998c2.f3583g, this.f3592I.f3637y.f3583g, 0, 4);
            c0985e.m2357e(c0998c2.f3583g, this.f3592I.f3584A.f3583g, 0, 0);
        }
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: b */
    public final boolean mo2387b() {
        return true;
    }

    @Override // p071n.C0999d
    public final String toString() {
        String strM722e = "[Barrier] " + this.f3606W + " {";
        for (int i2 = 0; i2 < this.f3714e0; i2++) {
            C0999d c0999d = this.f3713d0[i2];
            if (i2 > 0) {
                strM722e = AbstractC0324d.m722e(strM722e, ", ");
            }
            strM722e = strM722e + c0999d.f3606W;
        }
        return AbstractC0324d.m722e(strM722e, "}");
    }
}
