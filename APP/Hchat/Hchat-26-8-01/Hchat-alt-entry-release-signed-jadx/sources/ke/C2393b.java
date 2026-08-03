package ke;

import af.C0078a;
import be.AbstractC0269a;
import java.util.HashSet;
import java.util.Iterator;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import p081fc.C1203f;
import p082fd.C1208e;
import p082fd.C1210g;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: ke.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2393b extends AbstractC0269a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C2393b.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        if (c4322r.f14415p || c4322r.f14407G == null || c4322r.f14425z.isEmpty()) {
            return;
        }
        if (c4322r.f9217g.mo6236b(C2825b.f9188c)) {
            return;
        }
        HashSet hashSet = new HashSet();
        AbstractC5700d.m10279h0(c4322r, new C2392a(hashSet, 0), c4322r.f14407G);
        if (c4322r.f14425z.size() != hashSet.size()) {
            for (C4305a c4305a : c4322r.f14425z) {
                if (!hashSet.contains(c4305a) && !c4305a.f14351l.isEmpty()) {
                    if (!c4305a.f9217g.mo6235a(EnumC2824a.f9173z)) {
                        if (!c4305a.f9217g.mo6235a(EnumC2824a.f9166s)) {
                            if (!c4305a.f9217g.mo6235a(EnumC2824a.f9168u)) {
                                C1203f c1203f = new C1203f();
                                c1203f.m3268o();
                                c1203f.mo3256f();
                                C1208e c1208e = new C1208e(C1210g.m3313h(c4322r), true);
                                Iterator it = c4305a.f14351l.iterator();
                                while (it.hasNext()) {
                                    try {
                                        c1208e.m3306j((C4320p) it.next(), c1203f, null);
                                    } catch (C0078a unused) {
                                    }
                                }
                                c1203f.mo3256f();
                                String strReplace = c1203f.f4035a.toString().replace("*/", "*\\/");
                                c4322r.m6382K("Code restructure failed: missing block: " + String.valueOf(c4305a) + ", code lost:" + strReplace);
                            }
                        }
                    }
                }
            }
        }
        AbstractC5700d.m10279h0(c4322r, new C2398g(2), c4322r.f14407G);
    }
}
