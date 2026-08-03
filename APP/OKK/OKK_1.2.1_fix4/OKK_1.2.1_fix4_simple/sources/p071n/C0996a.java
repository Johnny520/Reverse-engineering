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
    public final void mo2386a(C0985e r17) {
        C0998c[] r2 = this.f3589F;
        C0998c r3 = this.f3636x;
        r2[0] = r3;
        C0998c r5 = this.f3637y;
        int r6 = 2;
        r2[2] = r5;
        C0998c r7 = this.f3638z;
        r2[1] = r7;
        C0998c r9 = this.f3584A;
        r2[3] = r9;
        int r11 = 0;
    L4:
        if (r11 >= r2.length) goto L6;
        C0998c r12 = r2[r11];
        r12.f3583g = r17.m2362j(r12);
        r11 = r11 + 1;
        goto L4
    L6:
        int r112 = this.f3557f0;
        if (r112 >= 0) goto L9;
        return;
    L9:
        if (r112 >= 4) goto L112;
        C0998c r22 = r2[r112];
        int r113 = 0;
    L12:
        if (r113 >= this.f3714e0) goto L38;
        C0999d r13 = this.f3713d0[r113];
        if (this.f3558g0 == false) goto L16;
    L18:
        int r14 = this.f3557f0;
        if (r14 == 0) goto L22;
        if (r14 == 1) goto L22;
    L28:
        if (r14 == 2) goto L31;
        if (r14 == 3) goto L31;
    L37:
        r113 = r113 + 1;
    L31:
        if (r13.f3615c0[1] != 3) goto L37;
        if (r13.f3637y.f3580d == null) goto L37;
        if (r13.f3584A.f3580d == null) goto L37;
    L27:
        boolean r114 = true;
    L40:
        if (r3.m2392e() == false) goto L42;
    L45:
        boolean r132 = true;
    L47:
        if (r5.m2392e() == false) goto L49;
    L52:
        boolean r142 = true;
    L53:
        if (r114 == true) goto L64;
        int r115 = this.f3557f0;
        if (r115 != 0) goto L57;
        if (r132 == false) goto L57;
    L63:
        int r116 = 5;
    L65:
        int r133 = 0;
    L67:
        if (r133 >= this.f3714e0) goto L86;
        C0999d r143 = this.f3713d0[r133];
        if (this.f3558g0 == false) goto L71;
    L73:
        C0989i r10 = r17.m2362j(r143.f3589F[this.f3557f0]);
        int r15 = this.f3557f0;
        C0998c r144 = r143.f3589F[r15];
        r144.f3583g = r10;
        C0998c r8 = r144.f3580d;
        if (r8 != null) goto L76;
    L78:
        int r82 = 0;
    L79:
        if (r15 == 0) goto L83;
        if (r15 == r6) goto L83;
        C0989i r145 = r22.f3583g;
        int r152 = this.f3559h0 + r82;
        C0983c r62 = r17.m2363k();
        C0989i r122 = r17.m2364l();
        r122.f3509d = 0;
        r62.m2345b(r145, r10, r122, r152);
        r17.m2355c(r62);
    L84:
        r17.m2357e(r22.f3583g, r10, this.f3559h0 + r82, r116);
    L85:
        r133 = r133 + 1;
        r6 = 2;
    L83:
        C0989i r63 = r22.f3583g;
        int r123 = this.f3559h0 - r82;
        C0983c r146 = r17.m2363k();
        C0989i r153 = r17.m2364l();
        r153.f3509d = 0;
        r146.m2346c(r63, r10, r153, r123);
        r17.m2355c(r146);
        goto L84
    L76:
        if (r8.f3578b != this) goto L78;
        r82 = r144.f3581e;
        goto L79
    L71:
        if (r143.mo2387b() == true) goto L73;
    L86:
        int r23 = this.f3557f0;
        if (r23 != 0) goto L90;
        r17.m2357e(r7.f3583g, r3.f3583g, 0, 8);
        r17.m2357e(r3.f3583g, this.f3592I.f3638z.f3583g, 0, 4);
        r17.m2357e(r3.f3583g, this.f3592I.f3636x.f3583g, 0, 0);
        return;
    L90:
        if (r23 != 1) goto L93;
        r17.m2357e(r3.f3583g, r7.f3583g, 0, 8);
        r17.m2357e(r3.f3583g, this.f3592I.f3636x.f3583g, 0, 4);
        r17.m2357e(r3.f3583g, this.f3592I.f3638z.f3583g, 0, 0);
        return;
    L93:
        if (r23 != 2) goto L96;
        r17.m2357e(r9.f3583g, r5.f3583g, 0, 8);
        r17.m2357e(r5.f3583g, this.f3592I.f3584A.f3583g, 0, 4);
        r17.m2357e(r5.f3583g, this.f3592I.f3637y.f3583g, 0, 0);
        return;
    L96:
        if (r23 != 3) goto L116;
        r17.m2357e(r5.f3583g, r9.f3583g, 0, 8);
        r17.m2357e(r5.f3583g, this.f3592I.f3637y.f3583g, 0, 4);
        r17.m2357e(r5.f3583g, this.f3592I.f3584A.f3583g, 0, 0);
        return;
    L116:
        return;
    L57:
        if (r115 != 2) goto L59;
        if (r142 == true) goto L63;
    L59:
        if (r115 != 1) goto L61;
        if (r132 == true) goto L63;
    L61:
        if (r115 != 3) goto L64;
        if (r142 == true) goto L63;
    L64:
        r116 = 4;
        goto L65
    L49:
        if (r9.m2392e() == true) goto L52;
        r142 = false;
        goto L53
    L42:
        if (r7.m2392e() == true) goto L45;
        r132 = false;
    L22:
        if (r13.f3615c0[0] != 3) goto L28;
        if (r13.f3636x.f3580d == null) goto L28;
        if (r13.f3638z.f3580d == null) goto L28;
    L16:
        if (r13.mo2387b() == true) goto L18;
    L38:
        r114 = false;
        goto L40
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: b */
    public final boolean mo2387b() {
        return true;
    }

    @Override // p071n.C0999d
    public final String toString() {
        String r02 = "[Barrier] " + this.f3606W + " {";
        int r1 = 0;
    L4:
        if (r1 >= this.f3714e0) goto L10;
        C0999d r2 = this.f3713d0[r1];
        if (r1 <= 0) goto L8;
        r02 = AbstractC0324d.m722e(r02, ", ");
    L8:
        r02 = r02 + r2.f3606W;
        r1 = r1 + 1;
        goto L4
    L10:
        return AbstractC0324d.m722e(r02, "}");
    }
}
