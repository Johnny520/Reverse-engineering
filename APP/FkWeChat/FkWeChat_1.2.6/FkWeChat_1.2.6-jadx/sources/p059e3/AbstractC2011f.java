package p059e3;

import java.util.List;
import java.util.Locale;
import p004a3.AbstractC0042h;
import p043d3.C1869e;
import p104h3.C2859l;
import p121i3.InterfaceC3175e;
import p307v3.AbstractC8809a;
import p319w2.C9064f0;
import p319w2.C9074h0;
import p319w2.C9078i;
import p319w2.C9147v3;
import p319w2.InterfaceC9158y;
import p376zd.C10010p0;

/* JADX INFO: renamed from: e3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2011f {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC9158y m7266a(String str, C9147v3 c9147v3, List list, List list2, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar) {
        return new C2010e(str, c9147v3, list, list2, bVar, interfaceC3175e);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7268c(C9147v3 c9147v3) {
        C9064f0 c9064f0M35273a;
        C9074h0 c9074h0M35573w = c9147v3.m35573w();
        return !(((c9074h0M35573w == null || (c9064f0M35273a = c9074h0M35573w.m35273a()) == null) ? null : C9078i.m35286d(c9064f0M35273a.m35229b())) == null ? false : C9078i.m35289g(r1.m35292j(), C9078i.f31130b.m35295c()));
    }

    /* JADX INFO: renamed from: d */
    public static final int m7269d(int i10, C1869e c1869e) {
        Locale localeM6625a;
        C2859l.a aVar = C2859l.f7485b;
        if (C2859l.m10250j(i10, aVar.m10255b())) {
            return 2;
        }
        if (C2859l.m10250j(i10, aVar.m10256c())) {
            return 3;
        }
        if (C2859l.m10250j(i10, aVar.m10257d())) {
            return 0;
        }
        if (C2859l.m10250j(i10, aVar.m10258e())) {
            return 1;
        }
        if (!C2859l.m10250j(i10, aVar.m10254a()) && !C2859l.m10250j(i10, aVar.m10259f())) {
            C10010p0.m38820a("Invalid TextDirection.");
            return 0;
        }
        if (c1869e == null || (localeM6625a = c1869e.m6630e(0).m6625a()) == null) {
            localeM6625a = Locale.getDefault();
        }
        int iM33789a = AbstractC8809a.m33789a(localeM6625a);
        return (iM33789a == 0 || iM33789a != 1) ? 2 : 3;
    }
}
