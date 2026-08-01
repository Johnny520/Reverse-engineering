package p163l;

import p024b9.C1047m;

/* JADX INFO: renamed from: l.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4332n {
    /* JADX INFO: renamed from: a */
    public static final C4327m m16992a(float f10, float f11, long j10, long j11, boolean z10) {
        return new C4327m(AbstractC4336n3.m17025t(C1047m.f3206a), Float.valueOf(f10), AbstractC4362t.m17115a(f11), j10, j11, z10);
    }

    /* JADX INFO: renamed from: b */
    public static final C4327m m16993b(InterfaceC4365t2 interfaceC4365t2, Object obj, Object obj2, long j10, long j11, boolean z10) {
        return new C4327m(interfaceC4365t2, obj, (AbstractC4357s) interfaceC4365t2.mo17122a().mo27m(obj2), j10, j11, z10);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C4327m m16994c(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return m16992a(f10, f11, j10, j11, z10);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C4327m m16995d(InterfaceC4365t2 interfaceC4365t2, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return m16993b(interfaceC4365t2, obj, obj2, j10, j11, z10);
    }

    /* JADX INFO: renamed from: e */
    public static final C4327m m16996e(C4327m c4327m, float f10, float f11, long j10, long j11, boolean z10) {
        return new C4327m(c4327m.m16983k(), Float.valueOf(f10), AbstractC4362t.m17115a(f11), j10, j11, z10);
    }

    /* JADX INFO: renamed from: f */
    public static final C4327m m16997f(C4327m c4327m, Object obj, AbstractC4357s abstractC4357s, long j10, long j11, boolean z10) {
        return new C4327m(c4327m.m16983k(), obj, abstractC4357s, j10, j11, z10);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C4327m m16998g(C4327m c4327m, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) c4327m.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((C4337o) c4327m.m16985m()).m17037f();
        }
        if ((i10 & 4) != 0) {
            j10 = c4327m.m16982e();
        }
        if ((i10 & 8) != 0) {
            j11 = c4327m.m16981d();
        }
        if ((i10 & 16) != 0) {
            z10 = c4327m.m16986o();
        }
        boolean z11 = z10;
        long j12 = j11;
        return m16996e(c4327m, f10, f11, j10, j12, z11);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C4327m m16999h(C4327m c4327m, Object obj, AbstractC4357s abstractC4357s, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c4327m.getValue();
        }
        if ((i10 & 2) != 0) {
            abstractC4357s = AbstractC4362t.m17119e(c4327m.m16985m());
        }
        if ((i10 & 4) != 0) {
            j10 = c4327m.m16982e();
        }
        if ((i10 & 8) != 0) {
            j11 = c4327m.m16981d();
        }
        if ((i10 & 16) != 0) {
            z10 = c4327m.m16986o();
        }
        boolean z11 = z10;
        long j12 = j11;
        return m16997f(c4327m, obj, abstractC4357s, j10, j12, z11);
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC4357s m17000i(InterfaceC4365t2 interfaceC4365t2, Object obj) {
        AbstractC4357s abstractC4357s = (AbstractC4357s) interfaceC4365t2.mo17122a().mo27m(obj);
        abstractC4357s.mo17035d();
        return abstractC4357s;
    }
}
