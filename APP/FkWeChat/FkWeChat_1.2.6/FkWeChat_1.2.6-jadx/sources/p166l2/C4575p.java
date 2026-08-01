package p166l2;

import p215oc.C5729x;

/* JADX INFO: renamed from: l2.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4575p {

    /* JADX INFO: renamed from: a */
    public final C4569n f13453a;

    /* JADX INFO: renamed from: b */
    public final C4569n f13454b;

    /* JADX INFO: renamed from: c */
    public final C4569n f13455c;

    /* JADX INFO: renamed from: l2.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13456a;

        static {
            int[] iArr = new int[EnumC4522b0.values().length];
            try {
                iArr[EnumC4522b0.f13184q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4522b0.f13185r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4522b0.f13186s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4522b0.f13187t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13456a = iArr;
        }
    }

    public C4575p(boolean z10) {
        this.f13453a = new C4569n(z10);
        this.f13454b = new C4569n(z10);
        this.f13455c = new C4569n(z10);
    }

    /* JADX INFO: renamed from: d */
    public final void m18134d(C4554j0 c4554j0, EnumC4522b0 enumC4522b0) {
        int i10 = a.f13456a[enumC4522b0.ordinal()];
        if (i10 == 1) {
            this.f13453a.m18061a(c4554j0);
            this.f13455c.m18061a(c4554j0);
            return;
        }
        if (i10 == 2) {
            this.f13454b.m18061a(c4554j0);
            this.f13455c.m18061a(c4554j0);
            return;
        }
        if (i10 == 3) {
            if (c4554j0.m17946m0() != null) {
                this.f13455c.m18061a(c4554j0);
                return;
            } else {
                this.f13453a.m18061a(c4554j0);
                return;
            }
        }
        if (i10 != 4) {
            C5729x.m23182a();
        } else if (c4554j0.m17946m0() != null) {
            this.f13455c.m18061a(c4554j0);
        } else {
            this.f13454b.m18061a(c4554j0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18135e(C4554j0 c4554j0) {
        return this.f13453a.m18062b(c4554j0) || this.f13454b.m18062b(c4554j0) || this.f13455c.m18062b(c4554j0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18136f(C4554j0 c4554j0, boolean z10) {
        boolean z11 = c4554j0.m17946m0() == null;
        boolean z12 = this.f13453a.m18062b(c4554j0) || this.f13454b.m18062b(c4554j0);
        return z10 ? !z11 && z12 : (z11 && z12) || this.f13455c.m18062b(c4554j0);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m18137g() {
        return (this.f13455c.m18063c() || this.f13453a.m18063c()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18138h() {
        return this.f13453a.m18063c() && this.f13455c.m18063c() && this.f13454b.m18063c();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18139i() {
        return !m18138h();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18140j(C4554j0 c4554j0) {
        return this.f13455c.m18065e(c4554j0) || this.f13453a.m18065e(c4554j0) || this.f13454b.m18065e(c4554j0);
    }
}
