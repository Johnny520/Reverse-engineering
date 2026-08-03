package ne;

import ae.C0076g;
import be.AbstractC0269a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mh.AbstractC2846d;
import p012ah.C0086a;
import p302ud.C4309e;
import p302ud.C4325u;

/* JADX INFO: renamed from: ne.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2995a extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public Map f9771g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C2995a.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        c4325u.f14435a.getClass();
        this.f9771g = Collections.EMPTY_MAP;
        c4325u.f14444j.add(new C0086a(4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public final boolean mo1054h(C4309e c4309e) {
        List list;
        Map map = this.f9771g;
        if (map == null || (list = (List) map.get(c4309e.f14373m.f10138g.mo7350l())) == null) {
            list = Collections.EMPTY_LIST;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                C0086a.m445d();
                return false;
            }
        }
        c4309e.f14382v.forEach(new C0076g(this, 15));
        return false;
    }
}
