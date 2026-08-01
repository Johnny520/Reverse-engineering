package p319w2;

import p104h3.C2859l;
import p121i3.EnumC3191u;
import p215oc.C5729x;

/* JADX INFO: renamed from: w2.w3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9152w3 {

    /* JADX INFO: renamed from: w2.w3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31247a;

        static {
            int[] iArr = new int[EnumC3191u.values().length];
            try {
                iArr[EnumC3191u.f8484q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3191u.f8485r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31247a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C9074h0 m35599b(C9069g0 c9069g0, C9064f0 c9064f0) {
        if (c9069g0 == null && c9064f0 == null) {
            return null;
        }
        return AbstractC9053d.m35140a(c9069g0, c9064f0);
    }

    /* JADX INFO: renamed from: c */
    public static final C9147v3 m35600c(C9147v3 c9147v3, C9147v3 c9147v32, float f10) {
        return new C9147v3(AbstractC9077h3.m35277c(c9147v3.m35552O(), c9147v32.m35552O(), f10), AbstractC9049c0.m35136b(c9147v3.m35551N(), c9147v32.m35551N(), f10));
    }

    /* JADX INFO: renamed from: d */
    public static final C9147v3 m35601d(C9147v3 c9147v3, EnumC3191u enumC3191u) {
        return new C9147v3(AbstractC9077h3.m35282h(c9147v3.m35575y()), AbstractC9049c0.m35139e(c9147v3.m35572v(), enumC3191u), c9147v3.m35573w());
    }

    /* JADX INFO: renamed from: e */
    public static final int m35602e(EnumC3191u enumC3191u, int i10) {
        C2859l.a aVar = C2859l.f7485b;
        if (C2859l.m10250j(i10, aVar.m10254a())) {
            int i11 = a.f31247a[enumC3191u.ordinal()];
            if (i11 == 1) {
                return aVar.m10255b();
            }
            if (i11 == 2) {
                return aVar.m10256c();
            }
            C5729x.m23182a();
            return 0;
        }
        if (!C2859l.m10250j(i10, aVar.m10259f())) {
            return i10;
        }
        int i12 = a.f31247a[enumC3191u.ordinal()];
        if (i12 == 1) {
            return aVar.m10257d();
        }
        if (i12 == 2) {
            return aVar.m10258e();
        }
        C5729x.m23182a();
        return 0;
    }
}
