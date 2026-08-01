package p166l2;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p172l8.C4700i0;

/* JADX INFO: renamed from: l2.m1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4567m1 implements InterfaceC4583r1 {

    /* JADX INFO: renamed from: r */
    public static final b f13421r = new b(null);

    /* JADX INFO: renamed from: s */
    public static final int f13422s = 8;

    /* JADX INFO: renamed from: t */
    public static final InterfaceC0184l f13423t = a.f13425r;

    /* JADX INFO: renamed from: q */
    public final InterfaceC4559k1 f13424q;

    /* JADX INFO: renamed from: l2.m1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f13425r = new a();

        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18059a(C4567m1 c4567m1) {
            if (c4567m1.mo17556g0()) {
                c4567m1.m18058b().mo18018s1();
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18059a((C4567m1) obj);
            return C4700i0.f13910a;
        }
    }

    public C4567m1(InterfaceC4559k1 interfaceC4559k1) {
        this.f13424q = interfaceC4559k1;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4559k1 m18058b() {
        return this.f13424q;
    }

    @Override // p166l2.InterfaceC4583r1
    /* JADX INFO: renamed from: g0 */
    public boolean mo17556g0() {
        return this.f13424q.mo17471z().m17461m2();
    }

    /* JADX INFO: renamed from: l2.m1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC0184l m18060a() {
            return C4567m1.f13423t;
        }

        public b() {
        }
    }
}
