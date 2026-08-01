package p177m0;

import p024b9.AbstractC1043k;
import p104h3.AbstractC2869v;
import p135j2.InterfaceC3578w;
import p215oc.C5725t;
import p265s1.InterfaceC7144t2;
import p319w2.C9122q3;

/* JADX INFO: renamed from: m0.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C4777o {

    /* JADX INFO: renamed from: c */
    public static final a f14199c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f14200d = 8;

    /* JADX INFO: renamed from: e */
    public static final C4777o f14201e = new C4777o(null, null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC3578w f14202a;

    /* JADX INFO: renamed from: b */
    public final C9122q3 f14203b;

    public C4777o(InterfaceC3578w interfaceC3578w, C9122q3 c9122q3) {
        this.f14202a = interfaceC3578w;
        this.f14203b = c9122q3;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C4777o m19137c(C4777o c4777o, InterfaceC3578w interfaceC3578w, C9122q3 c9122q3, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i10 & 1) != 0) {
            interfaceC3578w = c4777o.f14202a;
        }
        if ((i10 & 2) != 0) {
            c9122q3 = c4777o.f14203b;
        }
        return c4777o.m19138b(interfaceC3578w, c9122q3);
    }

    /* JADX INFO: renamed from: b */
    public final C4777o m19138b(InterfaceC3578w interfaceC3578w, C9122q3 c9122q3) {
        return new C4777o(interfaceC3578w, c9122q3);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC3578w m19139d() {
        return this.f14202a;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC7144t2 m19140e(int i10, int i11) {
        C9122q3 c9122q3 = this.f14203b;
        if (c9122q3 != null) {
            return c9122q3.m35406z(i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m19141f() {
        C9122q3 c9122q3 = this.f14203b;
        return (c9122q3 == null || AbstractC2869v.m10303g(c9122q3.m35393l().m35366f(), AbstractC2869v.f7516a.m10310e()) || !c9122q3.m35390i()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final C9122q3 m19142g() {
        return this.f14203b;
    }

    /* JADX INFO: renamed from: m0.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4777o m19143a() {
            return C4777o.f14201e;
        }

        public a() {
        }
    }
}
