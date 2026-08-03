package ye;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.function.Function;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import p038ce.C0552e;
import p053df.C0781i;
import p067ef.C0918c;
import p157kd.AbstractC2390d;
import p215od.C3128a;
import p215od.C3129b;
import p215od.C3130c;
import p246qd.AbstractC3506j;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4325u;

/* JADX INFO: renamed from: ye.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6035f {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f24493a = AbstractC2846d.m6274b(AbstractC6035f.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m10799a(final C4309e c4309e, C0781i c0781i, final boolean z9) {
        HashMap map = new HashMap();
        ((C3129b) c4309e.f14371k.f14438d.f7001b).f10144a.forEach(new C0552e(map, 2));
        TreeMap treeMap = new TreeMap();
        if (z9) {
            for (C4309e c4309e2 : c4309e.f14382v) {
                C6034e c6034e = new C6034e(c4309e2);
                c4309e2.f14381u.forEach(new C6031b(c6034e, 0));
                treeMap.put(c4309e2.f14373m.m6646k(), c6034e);
            }
        }
        for (final C0918c c0918c : c0781i.f2351a) {
            String str = c0918c.f2875c;
            final String strReplace = c0918c.f2876d.replace('.', '_');
            final C6034e c6034e2 = (C6034e) treeMap.computeIfAbsent(str, new Function() { // from class: ye.c
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    C4309e c4309e3 = c4309e;
                    C4325u c4325u = c4309e3.f14371k;
                    C3128a c3128aM6637e = C3128a.m6637e(c4325u, AbstractC3506j.m7360x(c4309e3.f14373m.m6651q() + "$" + ((String) obj)));
                    C4309e c4309eM8715f = c4325u.m8715f(c3128aM6637e);
                    if (c4309eM8715f != null) {
                        C6034e c6034e3 = new C6034e(c4309eM8715f);
                        c4309eM8715f.f14381u.forEach(new C6031b(c6034e3, 1));
                        return c6034e3;
                    }
                    C4309e c4309eM8645T = C4309e.m8645T(c4325u, c3128aM6637e, 25);
                    if (z9) {
                        c4309eM8645T.m6381J("Added by JADX");
                    }
                    return new C6034e(c4309eM8645T);
                }
            });
            c6034e2.f24492b.computeIfAbsent(strReplace, new Function() { // from class: ye.d
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    C4309e c4309e3 = c6034e2.f24491a;
                    C4325u c4325u = c4309e3.f14371k;
                    C4311g c4311g = new C4311g(c4309e3, c4325u.f14439e.m1199h(new C3130c(c4309e3.f14373m, strReplace, AbstractC3506j.f11385b)), 25);
                    c4311g.m6233y(new C2958a(6, Integer.valueOf(c0918c.f2873a)));
                    c4309e3.m8648R(c4311g);
                    if (z9) {
                        c4311g.m6381J("Added by JADX");
                    }
                    return c4311g;
                }
            });
            C4311g c4311g = (C4311g) map.get(Integer.valueOf(c0918c.f2873a));
            if (c4311g != null) {
                C3130c c3130c = c4311g.f14390l;
                if (!c3130c.f10147h.equals(strReplace) && AbstractC2390d.m5714c(strReplace) && c4309e.f14371k.f14435a.m1036a()) {
                    c4311g.m6231w(EnumC2824a.f9171x);
                    c3130c.f10149j = strReplace;
                }
            }
        }
    }
}
