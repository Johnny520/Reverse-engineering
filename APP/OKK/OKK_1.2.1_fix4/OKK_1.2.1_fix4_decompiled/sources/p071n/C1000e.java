package p071n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p018J0.C0234d;
import p043Y.C0463v;
import p069m.C0983c;
import p069m.C0985e;
import p069m.C0987g;
import p069m.C0989i;
import p073o.AbstractC1024m;
import p073o.C1013b;
import p073o.C1014c;
import p073o.C1016e;
import p073o.C1021j;
import p073o.C1023l;
import p075p.C1040f;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1000e extends C0999d {

    /* JADX INFO: renamed from: d0 */
    public ArrayList f3639d0 = new ArrayList();

    /* JADX INFO: renamed from: e0 */
    public final C0234d f3640e0 = new C0234d(this);

    /* JADX INFO: renamed from: f0 */
    public final C1016e f3641f0;

    /* JADX INFO: renamed from: g0 */
    public C1040f f3642g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f3643h0;

    /* JADX INFO: renamed from: i0 */
    public final C0985e f3644i0;

    /* JADX INFO: renamed from: j0 */
    public int f3645j0;

    /* JADX INFO: renamed from: k0 */
    public int f3646k0;

    /* JADX INFO: renamed from: l0 */
    public int f3647l0;

    /* JADX INFO: renamed from: m0 */
    public int f3648m0;

    /* JADX INFO: renamed from: n0 */
    public C0997b[] f3649n0;

    /* JADX INFO: renamed from: o0 */
    public C0997b[] f3650o0;

    /* JADX INFO: renamed from: p0 */
    public int f3651p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f3652q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f3653r0;

    public C1000e() {
        C1016e c1016e = new C1016e();
        c1016e.f3737b = true;
        c1016e.f3738c = true;
        c1016e.f3740e = new ArrayList();
        new ArrayList();
        c1016e.f3741f = null;
        c1016e.f3742g = new C1013b();
        c1016e.f3743h = new ArrayList();
        c1016e.f3736a = this;
        c1016e.f3739d = this;
        this.f3641f0 = c1016e;
        this.f3642g0 = null;
        this.f3643h0 = false;
        this.f3644i0 = new C0985e();
        this.f3647l0 = 0;
        this.f3648m0 = 0;
        this.f3649n0 = new C0997b[4];
        this.f3650o0 = new C0997b[4];
        this.f3651p0 = 263;
        this.f3652q0 = false;
        this.f3653r0 = false;
    }

    /* JADX INFO: renamed from: B */
    public final void m2422B(C0999d c0999d, int i2) {
        if (i2 == 0) {
            int i3 = this.f3647l0 + 1;
            C0997b[] c0997bArr = this.f3650o0;
            if (i3 >= c0997bArr.length) {
                this.f3650o0 = (C0997b[]) Arrays.copyOf(c0997bArr, c0997bArr.length * 2);
            }
            C0997b[] c0997bArr2 = this.f3650o0;
            int i4 = this.f3647l0;
            c0997bArr2[i4] = new C0997b(c0999d, 0, this.f3643h0);
            this.f3647l0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f3648m0 + 1;
            C0997b[] c0997bArr3 = this.f3649n0;
            if (i5 >= c0997bArr3.length) {
                this.f3649n0 = (C0997b[]) Arrays.copyOf(c0997bArr3, c0997bArr3.length * 2);
            }
            C0997b[] c0997bArr4 = this.f3649n0;
            int i6 = this.f3648m0;
            c0997bArr4[i6] = new C0997b(c0999d, 1, this.f3643h0);
            this.f3648m0 = i6 + 1;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2423C(C0985e c0985e) {
        mo2386a(c0985e);
        int size = this.f3639d0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0999d c0999d = (C0999d) this.f3639d0.get(i2);
            boolean[] zArr = c0999d.f3591H;
            zArr[0] = false;
            zArr[1] = false;
            if (c0999d instanceof C0996a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C0999d c0999d2 = (C0999d) this.f3639d0.get(i3);
                if (c0999d2 instanceof C0996a) {
                    C0996a c0996a = (C0996a) c0999d2;
                    for (int i4 = 0; i4 < c0996a.f3714e0; i4++) {
                        C0999d c0999d3 = c0996a.f3713d0[i4];
                        int i5 = c0996a.f3557f0;
                        if (i5 == 0 || i5 == 1) {
                            c0999d3.f3591H[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            c0999d3.f3591H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C0999d c0999d4 = (C0999d) this.f3639d0.get(i6);
            c0999d4.getClass();
            if ((c0999d4 instanceof C1002g) || (c0999d4 instanceof C1003h)) {
                c0999d4.mo2386a(c0985e);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            C0999d c0999d5 = (C0999d) this.f3639d0.get(i7);
            if (c0999d5 instanceof C1000e) {
                int[] iArr = c0999d5.f3615c0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                if (i8 == 2) {
                    c0999d5.m2418w(1);
                }
                if (i9 == 2) {
                    c0999d5.m2419x(1);
                }
                c0999d5.mo2386a(c0985e);
                if (i8 == 2) {
                    c0999d5.m2418w(i8);
                }
                if (i9 == 2) {
                    c0999d5.m2419x(i9);
                }
            } else {
                c0999d5.f3620h = -1;
                c0999d5.f3621i = -1;
                int[] iArr2 = this.f3615c0;
                int i10 = iArr2[0];
                int[] iArr3 = c0999d5.f3615c0;
                if (i10 != 2 && iArr3[0] == 4) {
                    C0998c c0998c = c0999d5.f3636x;
                    int i11 = c0998c.f3581e;
                    int iM2407l = m2407l();
                    C0998c c0998c2 = c0999d5.f3638z;
                    int i12 = iM2407l - c0998c2.f3581e;
                    c0998c.f3583g = c0985e.m2362j(c0998c);
                    c0998c2.f3583g = c0985e.m2362j(c0998c2);
                    c0985e.m2356d(c0998c.f3583g, i11);
                    c0985e.m2356d(c0998c2.f3583g, i12);
                    c0999d5.f3620h = 2;
                    c0999d5.f3597N = i11;
                    int i13 = i12 - i11;
                    c0999d5.f3593J = i13;
                    int i14 = c0999d5.f3600Q;
                    if (i13 < i14) {
                        c0999d5.f3593J = i14;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C0998c c0998c3 = c0999d5.f3637y;
                    int i15 = c0998c3.f3581e;
                    int iM2404i = m2404i();
                    C0998c c0998c4 = c0999d5.f3584A;
                    int i16 = iM2404i - c0998c4.f3581e;
                    c0998c3.f3583g = c0985e.m2362j(c0998c3);
                    c0998c4.f3583g = c0985e.m2362j(c0998c4);
                    c0985e.m2356d(c0998c3.f3583g, i15);
                    c0985e.m2356d(c0998c4.f3583g, i16);
                    if (c0999d5.f3599P > 0 || c0999d5.f3605V == 8) {
                        C0998c c0998c5 = c0999d5.f3585B;
                        C0989i c0989iM2362j = c0985e.m2362j(c0998c5);
                        c0998c5.f3583g = c0989iM2362j;
                        c0985e.m2356d(c0989iM2362j, c0999d5.f3599P + i15);
                    }
                    c0999d5.f3621i = 2;
                    c0999d5.f3598O = i15;
                    int i17 = i16 - i15;
                    c0999d5.f3594K = i17;
                    int i18 = c0999d5.f3601R;
                    if (i17 < i18) {
                        c0999d5.f3594K = i18;
                    }
                }
                if (!(c0999d5 instanceof C1002g) && !(c0999d5 instanceof C1003h)) {
                    c0999d5.mo2386a(c0985e);
                }
            }
        }
        if (this.f3647l0 > 0) {
            AbstractC1005j.m2437a(this, c0985e, 0);
        }
        if (this.f3648m0 > 0) {
            AbstractC1005j.m2437a(this, c0985e, 1);
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2424D(int i2, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C1016e c1016e = this.f3641f0;
        C1000e c1000e = c1016e.f3736a;
        int iM2403h = c1000e.m2403h(0);
        int iM2403h2 = c1000e.m2403h(1);
        int iM2408m = c1000e.m2408m();
        int iM2409n = c1000e.m2409n();
        ArrayList<AbstractC1024m> arrayList = c1016e.f3740e;
        C1023l c1023l = c1000e.f3617e;
        C1021j c1021j = c1000e.f3616d;
        if (z2 && (iM2403h == 2 || iM2403h2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = z2;
                    break;
                }
                AbstractC1024m abstractC1024m = (AbstractC1024m) it.next();
                if (abstractC1024m.f3767f == i2 && !abstractC1024m.mo2450k()) {
                    z6 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z6 && iM2403h == 2) {
                    c1000e.m2418w(1);
                    c1000e.m2420y(c1016e.m2456d(c1000e, 0));
                    c1021j.f3766e.mo2462d(c1000e.m2407l());
                }
            } else if (z6 && iM2403h2 == 2) {
                c1000e.m2419x(1);
                c1000e.m2417v(c1016e.m2456d(c1000e, 1));
                c1023l.f3766e.mo2462d(c1000e.m2404i());
            }
        }
        int[] iArr = c1000e.f3615c0;
        if (i2 == 0) {
            z3 = false;
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iM2407l = c1000e.m2407l() + iM2408m;
                c1021j.f3770i.mo2462d(iM2407l);
                c1021j.f3766e.mo2462d(iM2407l - iM2408m);
                z4 = true;
            }
            z4 = z3;
        } else {
            z3 = false;
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iM2404i = c1000e.m2404i() + iM2409n;
                c1023l.f3770i.mo2462d(iM2404i);
                c1023l.f3766e.mo2462d(iM2404i - iM2409n);
                z4 = true;
            }
            z4 = z3;
        }
        c1016e.m2459g();
        for (AbstractC1024m abstractC1024m2 : arrayList) {
            if (abstractC1024m2.f3767f == i2 && (abstractC1024m2.f3763b != c1000e || abstractC1024m2.f3768g)) {
                abstractC1024m2.mo2447e();
            }
        }
        for (AbstractC1024m abstractC1024m3 : arrayList) {
            if (abstractC1024m3.f3767f == i2 && (z4 || abstractC1024m3.f3763b != c1000e)) {
                if (!abstractC1024m3.f3769h.f3753j || !abstractC1024m3.f3770i.f3753j || (!(abstractC1024m3 instanceof C1014c) && !abstractC1024m3.f3766e.f3753j)) {
                    z5 = z3;
                    break;
                }
            }
        }
        z5 = true;
        c1000e.m2418w(iM2403h);
        c1000e.m2419x(iM2403h2);
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX INFO: renamed from: E */
    public final void m2425E() {
        boolean z2;
        int i2;
        boolean z3;
        ?? r2;
        ?? r16;
        boolean z4;
        ?? r02;
        char c;
        ?? r03;
        ?? r15;
        int i3 = 0;
        this.f3597N = 0;
        this.f3598O = 0;
        int iMax = Math.max(0, m2407l());
        int iMax2 = Math.max(0, m2404i());
        this.f3652q0 = false;
        this.f3653r0 = false;
        int i4 = this.f3651p0;
        boolean z5 = ((i4 & 64) == 64) || (i4 & 128) == 128;
        C0985e c0985e = this.f3644i0;
        c0985e.getClass();
        c0985e.f3491f = false;
        if (this.f3651p0 != 0 && z5) {
            c0985e.f3491f = true;
        }
        ?? r7 = this.f3615c0;
        ?? r8 = r7[1];
        ?? r9 = r7[0];
        ArrayList arrayList = this.f3639d0;
        boolean z6 = r9 == 2 || r8 == 2;
        this.f3647l0 = 0;
        this.f3648m0 = 0;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0999d c0999d = (C0999d) this.f3639d0.get(i5);
            if (c0999d instanceof C1000e) {
                ((C1000e) c0999d).m2425E();
            }
        }
        int i6 = 0;
        ?? r152 = 0;
        boolean z7 = true;
        while (z7) {
            int i7 = i6 + 1;
            try {
                c0985e.m2369r();
                this.f3647l0 = i3;
                this.f3648m0 = i3;
                m2401f(c0985e);
                for (int i8 = i3; i8 < size; i8++) {
                    ((C0999d) this.f3639d0.get(i8)).m2401f(c0985e);
                }
                m2423C(c0985e);
                try {
                    C0987g c0987g = c0985e.f3487b;
                    if (c0985e.f3491f) {
                        int i9 = i3;
                        while (true) {
                            if (i9 >= c0985e.f3494i) {
                                for (int i10 = i3; i10 < c0985e.f3494i; i10++) {
                                    C0983c c0983c = c0985e.f3490e[i10];
                                    c0983c.f3479a.f3510e = c0983c.f3480b;
                                }
                            } else {
                                if (!c0985e.f3490e[i9].f3483e) {
                                    c0985e.m2366o(c0987g);
                                    break;
                                }
                                i9++;
                            }
                        }
                    } else {
                        c0985e.m2366o(c0987g);
                    }
                    z2 = true;
                } catch (Exception e2) {
                    e = e2;
                    z7 = true;
                    e.printStackTrace();
                    z2 = z7;
                    System.out.println("EXCEPTION : " + e);
                }
            } catch (Exception e3) {
                e = e3;
            }
            boolean[] zArr = AbstractC1005j.f3715a;
            if (z2) {
                zArr[2] = false;
                mo2397A(c0985e);
                int size2 = this.f3639d0.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((C0999d) this.f3639d0.get(i11)).mo2397A(c0985e);
                }
            } else {
                mo2397A(c0985e);
                for (int i12 = 0; i12 < size; i12++) {
                    ((C0999d) this.f3639d0.get(i12)).mo2397A(c0985e);
                }
            }
            if (z6 && i7 < 8 && zArr[2]) {
                int i13 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i13 < size) {
                    C0999d c0999d2 = (C0999d) this.f3639d0.get(i13);
                    iMax3 = Math.max(iMax3, c0999d2.m2407l() + c0999d2.f3597N);
                    iMax4 = Math.max(iMax4, c0999d2.m2404i() + c0999d2.f3598O);
                    i13++;
                    i7 = i7;
                }
                i2 = i7;
                int iMax5 = Math.max(this.f3600Q, iMax3);
                int iMax6 = Math.max(this.f3601R, iMax4);
                if (r9 != 2 || m2407l() >= iMax5) {
                    z3 = false;
                    r152 = r152;
                } else {
                    m2420y(iMax5);
                    r7[0] = 2;
                    z3 = true;
                    r152 = 1;
                }
                if (r8 == 2 && m2404i() < iMax6) {
                    m2417v(iMax6);
                    r7[1] = 2;
                    z3 = true;
                    r152 = 1;
                }
            } else {
                i2 = i7;
                z3 = false;
            }
            int iMax7 = Math.max(this.f3600Q, m2407l());
            if (iMax7 > m2407l()) {
                m2420y(iMax7);
                r2 = 1;
                r7[0] = 1;
                z3 = true;
                r16 = 1;
            } else {
                r2 = 1;
                r16 = r152;
            }
            int iMax8 = Math.max(this.f3601R, m2404i());
            if (iMax8 > m2404i()) {
                m2417v(iMax8);
                r7[r2] = r2;
                ?? r04 = r2;
                z4 = r04 == true ? 1 : 0;
                r02 = r04;
            } else {
                z4 = z3;
                r02 = r16;
            }
            if (r02 == 0) {
                ?? r05 = r02;
                r05 = r02;
                if (r7[0] == 2 && iMax > 0) {
                    r05 = r02;
                    if (m2407l() > iMax) {
                        this.f3652q0 = r2;
                        r7[0] = r2;
                        m2420y(iMax);
                        ?? r06 = r2;
                        z4 = r06 == true ? 1 : 0;
                        r05 = r06;
                    }
                }
                c = 2;
                r03 = r05;
                r03 = r05;
                if (r7[r2] == 2 && iMax2 > 0) {
                    r03 = r05;
                    if (m2404i() > iMax2) {
                        this.f3653r0 = r2;
                        r7[r2] = r2;
                        m2417v(iMax2);
                        z4 = true;
                        r15 = 1;
                    }
                }
                i6 = i2;
                i3 = 0;
                z7 = z4;
                r152 = r15;
            } else {
                c = 2;
                r03 = r02;
            }
            r15 = r03;
            i6 = i2;
            i3 = 0;
            z7 = z4;
            r152 = r15;
        }
        this.f3639d0 = arrayList;
        if (r152 != 0) {
            r7[0] = r9;
            r7[1] = r8;
        }
        mo2416u(c0985e.f3496k);
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: s */
    public final void mo2414s() {
        this.f3644i0.m2369r();
        this.f3645j0 = 0;
        this.f3646k0 = 0;
        this.f3639d0.clear();
        super.mo2414s();
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: u */
    public final void mo2416u(C0463v c0463v) {
        super.mo2416u(c0463v);
        int size = this.f3639d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0999d) this.f3639d0.get(i2)).mo2416u(c0463v);
        }
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: z */
    public final void mo2421z(boolean z2, boolean z3) {
        super.mo2421z(z2, z3);
        int size = this.f3639d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0999d) this.f3639d0.get(i2)).mo2421z(z2, z3);
        }
    }
}
