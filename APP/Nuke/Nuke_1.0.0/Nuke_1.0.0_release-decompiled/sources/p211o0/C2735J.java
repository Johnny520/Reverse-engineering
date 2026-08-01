package p211o0;

import p117X2.AbstractC1665j;
import p128a.AbstractC1785a;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: o0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C2735J implements InterfaceC2007c {

    /* JADX INFO: renamed from: d */
    public int f8680d;

    /* JADX INFO: renamed from: e */
    public float f8681e = 1.0f;

    /* JADX INFO: renamed from: f */
    public float f8682f = 1.0f;

    /* JADX INFO: renamed from: g */
    public float f8683g = 1.0f;

    /* JADX INFO: renamed from: h */
    public float f8684h;

    /* JADX INFO: renamed from: i */
    public float f8685i;

    /* JADX INFO: renamed from: j */
    public long f8686j;

    /* JADX INFO: renamed from: k */
    public long f8687k;

    /* JADX INFO: renamed from: l */
    public float f8688l;

    /* JADX INFO: renamed from: m */
    public float f8689m;

    /* JADX INFO: renamed from: n */
    public float f8690n;

    /* JADX INFO: renamed from: o */
    public float f8691o;

    /* JADX INFO: renamed from: p */
    public long f8692p;

    /* JADX INFO: renamed from: q */
    public InterfaceC2738M f8693q;

    /* JADX INFO: renamed from: r */
    public boolean f8694r;

    /* JADX INFO: renamed from: s */
    public long f8695s;

    /* JADX INFO: renamed from: t */
    public InterfaceC2007c f8696t;

    /* JADX INFO: renamed from: u */
    public EnumC2017m f8697u;

    /* JADX INFO: renamed from: v */
    public C2757p f8698v;

    /* JADX INFO: renamed from: w */
    public int f8699w;

    /* JADX INFO: renamed from: x */
    public AbstractC2767z f8700x;

    public C2735J() {
        long j5 = AbstractC2726A.f8670a;
        this.f8686j = j5;
        this.f8687k = j5;
        this.f8691o = 8.0f;
        this.f8692p = C2741P.f8720b;
        this.f8693q = AbstractC2767z.f8776b;
        this.f8695s = 9205357640488583168L;
        this.f8696t = AbstractC1785a.m3241a();
        this.f8697u = EnumC2017m.f6742d;
        this.f8699w = 3;
    }

    /* JADX INFO: renamed from: B */
    public final void m4789B(long j5) {
        if (C2741P.m4806a(this.f8692p, j5)) {
            return;
        }
        this.f8680d |= 4096;
        this.f8692p = j5;
    }

    /* JADX INFO: renamed from: D */
    public final void m4790D(float f2) {
        if (this.f8684h == f2) {
            return;
        }
        this.f8680d |= 16;
        this.f8684h = f2;
    }

    /* JADX INFO: renamed from: a */
    public final void m4791a() {
        m4800s(1.0f);
        m4801v(1.0f);
        m4792d(1.0f);
        m4790D(0.0f);
        m4802w(0.0f);
        long j5 = AbstractC2726A.f8670a;
        m4793e(j5);
        m4804y(j5);
        m4797k(0.0f);
        m4798l(0.0f);
        m4799n(0.0f);
        m4794f(8.0f);
        m4789B(C2741P.f8720b);
        m4803x(AbstractC2767z.f8776b);
        m4795i(false);
        m4796j(null);
        if (this.f8699w != 3) {
            this.f8680d |= 524288;
            this.f8699w = 3;
        }
        this.f8695s = 9205357640488583168L;
        this.f8700x = null;
        this.f8680d = 0;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f8696t.mo272b();
    }

    /* JADX INFO: renamed from: d */
    public final void m4792d(float f2) {
        if (this.f8683g == f2) {
            return;
        }
        this.f8680d |= 4;
        this.f8683g = f2;
    }

    /* JADX INFO: renamed from: e */
    public final void m4793e(long j5) {
        if (C2762u.m4921c(this.f8686j, j5)) {
            return;
        }
        this.f8680d |= 64;
        this.f8686j = j5;
    }

    /* JADX INFO: renamed from: f */
    public final void m4794f(float f2) {
        if (this.f8691o == f2) {
            return;
        }
        this.f8680d |= 2048;
        this.f8691o = f2;
    }

    /* JADX INFO: renamed from: i */
    public final void m4795i(boolean z5) {
        if (this.f8694r != z5) {
            this.f8680d |= 16384;
            this.f8694r = z5;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4796j(C2757p c2757p) {
        if (AbstractC1665j.m2981a(this.f8698v, c2757p)) {
            return;
        }
        this.f8680d |= 131072;
        this.f8698v = c2757p;
    }

    /* JADX INFO: renamed from: k */
    public final void m4797k(float f2) {
        if (this.f8688l == f2) {
            return;
        }
        this.f8680d |= 256;
        this.f8688l = f2;
    }

    /* JADX INFO: renamed from: l */
    public final void m4798l(float f2) {
        if (this.f8689m == f2) {
            return;
        }
        this.f8680d |= 512;
        this.f8689m = f2;
    }

    /* JADX INFO: renamed from: n */
    public final void m4799n(float f2) {
        if (this.f8690n == f2) {
            return;
        }
        this.f8680d |= 1024;
        this.f8690n = f2;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f8696t.mo282p();
    }

    /* JADX INFO: renamed from: s */
    public final void m4800s(float f2) {
        if (this.f8681e == f2) {
            return;
        }
        this.f8680d |= 1;
        this.f8681e = f2;
    }

    /* JADX INFO: renamed from: v */
    public final void m4801v(float f2) {
        if (this.f8682f == f2) {
            return;
        }
        this.f8680d |= 2;
        this.f8682f = f2;
    }

    /* JADX INFO: renamed from: w */
    public final void m4802w(float f2) {
        if (this.f8685i == f2) {
            return;
        }
        this.f8680d |= 32;
        this.f8685i = f2;
    }

    /* JADX INFO: renamed from: x */
    public final void m4803x(InterfaceC2738M interfaceC2738M) {
        if (AbstractC1665j.m2981a(this.f8693q, interfaceC2738M)) {
            return;
        }
        this.f8680d |= 8192;
        this.f8693q = interfaceC2738M;
    }

    /* JADX INFO: renamed from: y */
    public final void m4804y(long j5) {
        if (C2762u.m4921c(this.f8687k, j5)) {
            return;
        }
        this.f8680d |= 128;
        this.f8687k = j5;
    }
}
