package p004e;

import p000a.AbstractC0001b;
import p003d.C0016a;
import p007h.C0117b;
import p009j.AbstractC0156g;
import p009j.C0150a;
import p009j.C0152c;
import p009j.C0157h;
import p009j.C0162m;
import p009j.C0164o;
import p013n.C0205g;

/* JADX INFO: renamed from: e.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0020D {

    /* JADX INFO: renamed from: a */
    private final C0117b f73a;

    /* JADX INFO: renamed from: c */
    private final C0024a f75c;

    /* JADX INFO: renamed from: d */
    private final C0046w f76d;

    /* JADX INFO: renamed from: e */
    private final C0019C f77e;

    /* JADX INFO: renamed from: f */
    private final int f78f;

    /* JADX INFO: renamed from: h */
    private final int f80h;

    /* JADX INFO: renamed from: i */
    private final boolean f81i;

    /* JADX INFO: renamed from: b */
    private final int f74b = 1;

    /* JADX INFO: renamed from: g */
    private int[] f79g = null;

    private C0020D(C0117b c0117b, int i2, C0016a c0016a) {
        this.f73a = c0117b;
        this.f75c = new C0024a(c0117b);
        this.f80h = i2;
        boolean[] zArr = {true};
        int iM358J = c0117b.m341a().m358J();
        C0152c c0152cM341a = c0117b.m341a();
        C0018B c0018b = new C0018B(zArr, iM358J, i2);
        int iM504B = c0152cM341a.m504B();
        for (int i3 = 0; i3 < iM504B; i3++) {
            C0157h c0157hM349b = c0152cM341a.m511n(i3).m349b();
            int iM504B2 = c0157hM349b.m504B();
            for (int i4 = 0; i4 < iM504B2; i4++) {
                c0157hM349b.m512o(i4).mo363b(c0018b);
            }
        }
        boolean z = zArr[0];
        this.f81i = z;
        C0152c c0152cM341a2 = c0117b.m341a();
        int iM504B3 = c0152cM341a2.m504B() * 3;
        int iM357I = c0152cM341a2.m357I() + iM504B3;
        int iM358J2 = c0152cM341a2.m358J() + (z ? 0 : i2);
        this.f78f = iM358J2;
        C0046w c0046w = new C0046w(c0016a, iM357I, iM504B3, iM358J2, i2);
        this.f76d = c0046w;
        this.f77e = new C0019C(this, c0046w);
    }

    /* JADX INFO: renamed from: f */
    static C0164o m80f(AbstractC0156g abstractC0156g) {
        return m82h(abstractC0156g, abstractC0156g.m368j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static C0164o m82h(AbstractC0156g abstractC0156g, C0162m c0162m) {
        C0164o c0164oM369k = abstractC0156g.m369k();
        if (abstractC0156g.m366h().m416f() && c0164oM369k.m504B() == 2 && c0162m.m384i() == c0164oM369k.m513p(1).m384i()) {
            c0164oM369k = C0164o.m397I(c0164oM369k.m513p(1), c0164oM369k.m513p(0));
        }
        return c0162m == null ? c0164oM369k : c0164oM369k.m401M(c0162m);
    }

    /* JADX INFO: renamed from: i */
    public static C0032i m83i(C0117b c0117b, int i2, C0016a c0016a) {
        int i3;
        int i4;
        C0150a c0150aM359K;
        int iM526l;
        int iM526l2;
        C0020D c0020d = new C0020D(c0117b, i2, c0016a);
        C0152c c0152cM341a = c0117b.m341a();
        int iM504B = c0152cM341a.m504B();
        int iM531F = (c0152cM341a.m531F() + 31) >> 5;
        int[] iArr = new int[iM531F];
        int[] iArr2 = new int[iM531F];
        for (int i5 = 0; i5 < iM504B; i5++) {
            int iM350c = c0152cM341a.m511n(i5).m350c();
            int i6 = iM350c >> 5;
            iArr[i6] = (1 << (iM350c & 31)) | iArr[i6];
        }
        int[] iArr3 = new int[iM504B];
        int iM342b = c0117b.m342b();
        int i7 = 0;
        while (iM342b != -1) {
            while (true) {
                C0205g c0205gM345e = c0117b.m345e(iM342b);
                int iM529o = c0205gM345e.m529o();
                for (int i8 = 0; i8 < iM529o; i8++) {
                    iM526l2 = c0205gM345e.m526l(i8);
                    if (AbstractC0001b.m2g(iArr2, iM526l2)) {
                        break;
                    }
                    if (AbstractC0001b.m2g(iArr, iM526l2) && c0152cM341a.m359K(iM526l2).m352e() == iM342b) {
                        break;
                    }
                }
                int i9 = iM526l2 >> 5;
                iArr2[i9] = (1 << (iM526l2 & 31)) | iArr2[i9];
                iM342b = iM526l2;
            }
            int i10 = -1;
            while (true) {
                if (iM342b == i10) {
                    i3 = i10;
                    i4 = 0;
                    break;
                }
                int i11 = iM342b >> 5;
                int i12 = iArr[i11];
                int i13 = ~(1 << (iM342b & 31));
                iArr[i11] = i12 & i13;
                iArr2[i11] = i13 & iArr2[i11];
                iArr3[i7] = iM342b;
                i7++;
                C0150a c0150aM359K2 = c0152cM341a.m359K(iM342b);
                int iM352e = c0150aM359K2.m352e();
                C0205g c0205gM354g = c0150aM359K2.m354g();
                int iM529o2 = c0205gM354g.m529o();
                if (iM529o2 != 0) {
                    if (iM529o2 != 1) {
                        i3 = -1;
                        if (iM352e != -1) {
                            iM526l = iM352e;
                            i4 = 0;
                        }
                        c0150aM359K = c0152cM341a.m359K(iM526l);
                    } else {
                        i3 = -1;
                    }
                    i4 = 0;
                    iM526l = c0205gM354g.m526l(0);
                    c0150aM359K = c0152cM341a.m359K(iM526l);
                } else {
                    i4 = 0;
                    i3 = -1;
                    c0150aM359K = null;
                }
                if (c0150aM359K == null) {
                    break;
                }
                int iM350c2 = c0150aM359K.m350c();
                int iM352e2 = c0150aM359K2.m352e();
                if (AbstractC0001b.m2g(iArr, iM350c2)) {
                    iM342b = iM350c2;
                    i10 = i3;
                } else if (iM352e2 == iM350c2 || iM352e2 < 0 || !AbstractC0001b.m2g(iArr, iM352e2)) {
                    C0205g c0205gM354g2 = c0150aM359K2.m354g();
                    int iM529o3 = c0205gM354g2.m529o();
                    int i14 = i4;
                    while (true) {
                        if (i14 >= iM529o3) {
                            i10 = i3;
                            iM342b = i10;
                            break;
                        }
                        int iM526l3 = c0205gM354g2.m526l(i14);
                        if (AbstractC0001b.m2g(iArr, iM526l3)) {
                            i10 = i3;
                            iM342b = iM526l3;
                            break;
                        }
                        i14++;
                    }
                } else {
                    i10 = i3;
                    iM342b = iM352e2;
                }
            }
            int i15 = i4;
            while (true) {
                if (i15 >= iM531F) {
                    iM342b = i3;
                    break;
                }
                int i16 = iArr[i15];
                if (i16 != 0) {
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i16 & (-1));
                    if (iNumberOfTrailingZeros == 32) {
                        iNumberOfTrailingZeros = i3;
                    }
                    if (iNumberOfTrailingZeros >= 0) {
                        iM342b = (i15 << 5) + iNumberOfTrailingZeros;
                        break;
                    }
                }
                i15++;
            }
        }
        int i17 = 0;
        if (i7 != iM504B) {
            throw new RuntimeException("shouldn't happen");
        }
        c0020d.f79g = iArr3;
        C0152c c0152cM341a2 = c0117b.m341a();
        int[] iArr4 = c0020d.f79g;
        int length = iArr4.length;
        int i18 = 0;
        while (true) {
            C0046w c0046w = c0020d.f76d;
            C0024a c0024a = c0020d.f75c;
            if (i18 >= length) {
                return new C0032i(c0020d.f74b, c0046w.m197c(), new C0024a(c0117b, c0020d.f79g, c0024a));
            }
            int i19 = i18 + 1;
            int i20 = i19 == iArr4.length ? -1 : iArr4[i19];
            C0150a c0150aM359K3 = c0152cM341a2.m359K(iArr4[i18]);
            c0046w.m195a(c0024a.m99f(c0150aM359K3));
            C0029f c0029fM97d = c0024a.m97d(c0150aM359K3);
            C0019C c0019c = c0020d.f77e;
            c0019c.m74g(c0150aM359K3, c0029fM97d);
            C0157h c0157hM349b = c0150aM359K3.m349b();
            int iM504B2 = c0157hM349b.m504B();
            for (int i21 = i17; i21 < iM504B2; i21++) {
                c0157hM349b.m512o(i21).mo363b(c0019c);
            }
            c0046w.m195a(c0024a.m96c(c0150aM359K3));
            int iM352e3 = c0150aM359K3.m352e();
            AbstractC0156g abstractC0156gM351d = c0150aM359K3.m351d();
            if (iM352e3 >= 0 && iM352e3 != i20) {
                if (abstractC0156gM351d.m366h().m412b() == 4 && c0150aM359K3.m353f() == i20) {
                    c0046w.m198d(c0024a.m98e(iM352e3));
                } else {
                    c0046w.m195a(new C0022F(AbstractC0036m.f137I, abstractC0156gM351d.m367i(), C0164o.f512c, c0024a.m98e(iM352e3)));
                }
            }
            i18 = i19;
            i17 = 0;
        }
    }
}
