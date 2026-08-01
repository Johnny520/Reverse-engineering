package p215oc;

import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p185m8.AbstractC5102r;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: oc.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5721p {

    /* JADX INFO: renamed from: h */
    public static final a f18051h = new a(null);

    /* JADX INFO: renamed from: a */
    public final byte[] f18052a;

    /* JADX INFO: renamed from: b */
    public int f18053b;

    /* JADX INFO: renamed from: c */
    public int f18054c;

    /* JADX INFO: renamed from: d */
    public AbstractC5722q f18055d;

    /* JADX INFO: renamed from: e */
    public boolean f18056e;

    /* JADX INFO: renamed from: f */
    public C5721p f18057f;

    /* JADX INFO: renamed from: g */
    public C5721p f18058g;

    public C5721p() {
        this.f18052a = new byte[8192];
        this.f18056e = true;
        this.f18055d = null;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m23137A(byte[] bArr, int i10) {
        bArr.getClass();
    }

    /* JADX INFO: renamed from: B */
    public final void m23138B(byte b10) {
        byte[] bArr = this.f18052a;
        int i10 = this.f18054c;
        this.f18054c = i10 + 1;
        bArr[i10] = b10;
    }

    /* JADX INFO: renamed from: C */
    public final void m23139C(short s10) {
        byte[] bArr = this.f18052a;
        int i10 = this.f18054c;
        bArr[i10] = (byte) ((s10 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s10 & 255);
        this.f18054c = i10 + 2;
    }

    /* JADX INFO: renamed from: D */
    public final void m23140D(C5721p c5721p, int i10) {
        c5721p.getClass();
        if (!c5721p.f18056e) {
            C10010p0.m38820a("only owner can write");
            return;
        }
        if (c5721p.f18054c + i10 > 8192) {
            if (c5721p.m23149i()) {
                throw new IllegalArgumentException();
            }
            int i11 = c5721p.f18054c;
            int i12 = c5721p.f18053b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c5721p.f18052a;
            AbstractC5102r.m20661m(bArr, bArr, 0, i12, i11, 2, null);
            c5721p.f18054c -= c5721p.f18053b;
            c5721p.f18053b = 0;
        }
        byte[] bArr2 = this.f18052a;
        byte[] bArr3 = c5721p.f18052a;
        int i13 = c5721p.f18054c;
        int i14 = this.f18053b;
        AbstractC5102r.m20655g(bArr2, bArr3, i13, i14, i14 + i10);
        c5721p.f18054c += i10;
        this.f18053b += i10;
    }

    /* JADX INFO: renamed from: a */
    public final C5721p m23141a() {
        int i10;
        C5721p c5721p = this.f18058g;
        if (c5721p == null) {
            C10010p0.m38820a("cannot compact");
            return null;
        }
        c5721p.getClass();
        if (c5721p.f18056e) {
            int i11 = this.f18054c - this.f18053b;
            C5721p c5721p2 = this.f18058g;
            c5721p2.getClass();
            int i12 = 8192 - c5721p2.f18054c;
            C5721p c5721p3 = this.f18058g;
            c5721p3.getClass();
            if (c5721p3.m23149i()) {
                i10 = 0;
            } else {
                C5721p c5721p4 = this.f18058g;
                c5721p4.getClass();
                i10 = c5721p4.f18053b;
            }
            if (i11 <= i12 + i10) {
                C5721p c5721p5 = this.f18058g;
                c5721p5.getClass();
                m23140D(c5721p5, i11);
                if (m23152l() == null) {
                    C5724s.m23171d(this);
                    return c5721p5;
                }
                C10010p0.m38820a("Check failed.");
                return null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte[] m23142b(boolean z10) {
        return this.f18052a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5722q m23143c() {
        return this.f18055d;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int m23144d() {
        return this.f18054c;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5721p m23145e() {
        return this.f18057f;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int m23146f() {
        return this.f18053b;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5721p m23147g() {
        return this.f18058g;
    }

    /* JADX INFO: renamed from: h */
    public final int m23148h() {
        return this.f18052a.length - this.f18054c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m23149i() {
        AbstractC5722q abstractC5722q = this.f18055d;
        if (abstractC5722q != null) {
            return abstractC5722q.mo23135b();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final int m23150j() {
        return this.f18054c - this.f18053b;
    }

    /* JADX INFO: renamed from: k */
    public final byte m23151k(int i10) {
        return this.f18052a[this.f18053b + i10];
    }

    /* JADX INFO: renamed from: l */
    public final C5721p m23152l() {
        C5721p c5721p = this.f18057f;
        C5721p c5721p2 = this.f18058g;
        if (c5721p2 != null) {
            c5721p2.getClass();
            c5721p2.f18057f = this.f18057f;
        }
        C5721p c5721p3 = this.f18057f;
        if (c5721p3 != null) {
            c5721p3.getClass();
            c5721p3.f18058g = this.f18058g;
        }
        this.f18057f = null;
        this.f18058g = null;
        return c5721p;
    }

    /* JADX INFO: renamed from: m */
    public final C5721p m23153m(C5721p c5721p) {
        c5721p.getClass();
        c5721p.f18058g = this;
        c5721p.f18057f = this.f18057f;
        C5721p c5721p2 = this.f18057f;
        if (c5721p2 != null) {
            c5721p2.getClass();
            c5721p2.f18058g = c5721p;
        }
        this.f18057f = c5721p;
        return c5721p;
    }

    /* JADX INFO: renamed from: n */
    public final byte m23154n() {
        byte[] bArr = this.f18052a;
        int i10 = this.f18053b;
        this.f18053b = i10 + 1;
        return bArr[i10];
    }

    /* JADX INFO: renamed from: o */
    public final void m23155o(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        int i12 = i11 - i10;
        byte[] bArr2 = this.f18052a;
        int i13 = this.f18053b;
        AbstractC5102r.m20655g(bArr2, bArr, i10, i13, i13 + i12);
        this.f18053b += i12;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m23156p(int i10) {
        this.f18054c = i10;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m23157q(C5721p c5721p) {
        this.f18057f = c5721p;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m23158r(int i10) {
        this.f18053b = i10;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m23159s(C5721p c5721p) {
        this.f18058g = c5721p;
    }

    /* JADX INFO: renamed from: t */
    public final void m23160t(int i10, byte b10) {
        this.f18052a[this.f18054c + i10] = b10;
    }

    /* JADX INFO: renamed from: u */
    public final void m23161u(int i10, byte b10, byte b11) {
        byte[] bArr = this.f18052a;
        int i11 = this.f18054c + i10;
        bArr[i11] = b10;
        bArr[i11 + 1] = b11;
    }

    /* JADX INFO: renamed from: v */
    public final void m23162v(int i10, byte b10, byte b11, byte b12) {
        byte[] bArr = this.f18052a;
        int i11 = this.f18054c + i10;
        bArr[i11] = b10;
        bArr[i11 + 1] = b11;
        bArr[i11 + 2] = b12;
    }

    /* JADX INFO: renamed from: w */
    public final void m23163w(int i10, byte b10, byte b11, byte b12, byte b13) {
        byte[] bArr = this.f18052a;
        int i11 = this.f18054c + i10;
        bArr[i11] = b10;
        bArr[i11 + 1] = b11;
        bArr[i11 + 2] = b12;
        bArr[i11 + 3] = b13;
    }

    /* JADX INFO: renamed from: x */
    public final C5721p m23164x() {
        AbstractC5722q abstractC5722qM23175h = this.f18055d;
        if (abstractC5722qM23175h == null) {
            abstractC5722qM23175h = C5724s.m23175h();
            this.f18055d = abstractC5722qM23175h;
        }
        AbstractC5722q abstractC5722q = abstractC5722qM23175h;
        byte[] bArr = this.f18052a;
        int i10 = this.f18053b;
        int i11 = this.f18054c;
        abstractC5722q.mo23134a();
        C4700i0 c4700i0 = C4700i0.f13910a;
        return new C5721p(bArr, i10, i11, abstractC5722q, false);
    }

    /* JADX INFO: renamed from: y */
    public final C5721p m23165y(int i10) {
        C5721p c5721pM23173f;
        if (i10 <= 0 || i10 > this.f18054c - this.f18053b) {
            C9987e.m38645a("byteCount out of range");
            return null;
        }
        if (i10 >= 1024) {
            c5721pM23173f = m23164x();
        } else {
            c5721pM23173f = C5724s.m23173f();
            byte[] bArr = this.f18052a;
            byte[] bArr2 = c5721pM23173f.f18052a;
            int i11 = this.f18053b;
            AbstractC5102r.m20661m(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        c5721pM23173f.f18054c = c5721pM23173f.f18053b + i10;
        this.f18053b += i10;
        C5721p c5721p = this.f18058g;
        if (c5721p != null) {
            c5721p.getClass();
            c5721p.m23153m(c5721pM23173f);
            return c5721pM23173f;
        }
        c5721pM23173f.f18057f = this;
        this.f18058g = c5721pM23173f;
        return c5721pM23173f;
    }

    /* JADX INFO: renamed from: z */
    public final void m23166z(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC5102r.m20655g(bArr, this.f18052a, this.f18054c, i10, i11);
        this.f18054c += i11 - i10;
    }

    /* JADX INFO: renamed from: oc.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5721p m23167a() {
            return new C5721p(null);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C5721p m23168b(byte[] bArr, int i10, int i11, AbstractC5722q abstractC5722q, boolean z10) {
            bArr.getClass();
            return new C5721p(bArr, i10, i11, abstractC5722q, z10, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C5721p(byte[] bArr, int i10, int i11, AbstractC5722q abstractC5722q, boolean z10, AbstractC1043k abstractC1043k) {
        this(bArr, i10, i11, abstractC5722q, z10);
    }

    public /* synthetic */ C5721p(AbstractC1043k abstractC1043k) {
        this();
    }

    public C5721p(byte[] bArr, int i10, int i11, AbstractC5722q abstractC5722q, boolean z10) {
        this.f18052a = bArr;
        this.f18053b = i10;
        this.f18054c = i11;
        this.f18055d = abstractC5722q;
        this.f18056e = z10;
    }
}
