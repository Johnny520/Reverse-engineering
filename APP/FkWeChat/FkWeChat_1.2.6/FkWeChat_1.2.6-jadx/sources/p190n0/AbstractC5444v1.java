package p190n0;

import p010a9.InterfaceC0184l;
import p024b9.C1042j0;
import p172l8.C4700i0;
import p190n0.C5419r0;
import p215oc.C5729x;
import p319w2.C9122q3;
import p319w2.C9137t3;

/* JADX INFO: renamed from: n0.v1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5444v1 {

    /* JADX INFO: renamed from: n0.v1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16770a;

        static {
            int[] iArr = new int[EnumC5394n.values().length];
            try {
                iArr[EnumC5394n.f16595q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5394n.f16596r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5394n.f16597s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16770a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m22177a(C1042j0 c1042j0, C5407p0 c5407p0) {
        if (c5407p0.m21991c().length() > 0) {
            c1042j0.f3202q = false;
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5426s1 m22178b(C9122q3 c9122q3, int i10, int i11, int i12, long j10, boolean z10, boolean z11) {
        return new C5422r3(z11, 1, 1, z10 ? null : new C5419r0(new C5419r0.a(AbstractC5420r1.m22122a(c9122q3, C9137t3.m35523n(j10)), C9137t3.m35523n(j10), 1L), new C5419r0.a(AbstractC5420r1.m22122a(c9122q3, C9137t3.m35518i(j10)), C9137t3.m35518i(j10), 1L), C9137t3.m35522m(j10)), new C5407p0(1L, 1, i10, i11, i12, c9122q3));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m22179c(C5419r0 c5419r0, InterfaceC5426s1 interfaceC5426s1) {
        if (c5419r0 == null || interfaceC5426s1 == null) {
            return true;
        }
        if (c5419r0.m22115e().m22121e() == c5419r0.m22113c().m22121e()) {
            return c5419r0.m22115e().m22120d() == c5419r0.m22113c().m22120d();
        }
        if ((c5419r0.m22114d() ? c5419r0.m22115e() : c5419r0.m22113c()).m22120d() != 0) {
            return false;
        }
        if (interfaceC5426s1.mo22137e().m22000l() != (c5419r0.m22114d() ? c5419r0.m22113c() : c5419r0.m22115e()).m22120d()) {
            return false;
        }
        final C1042j0 c1042j0 = new C1042j0();
        c1042j0.f3202q = true;
        interfaceC5426s1.mo22138f(new InterfaceC0184l() { // from class: n0.u1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC5444v1.m22177a(c1042j0, (C5407p0) obj);
            }
        });
        return c1042j0.f3202q;
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC5394n m22180d(EnumC5394n enumC5394n, EnumC5394n enumC5394n2) {
        int[] iArr = a.f16770a;
        int i10 = iArr[enumC5394n2.ordinal()];
        if (i10 == 1) {
            return EnumC5394n.f16595q;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return EnumC5394n.f16597s;
            }
            C5729x.m23182a();
            return null;
        }
        int i11 = iArr[enumC5394n.ordinal()];
        if (i11 == 1) {
            return EnumC5394n.f16595q;
        }
        if (i11 == 2) {
            return EnumC5394n.f16596r;
        }
        if (i11 == 3) {
            return EnumC5394n.f16597s;
        }
        C5729x.m23182a();
        return null;
    }
}
