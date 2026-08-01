package p182m5;

import bsh.C1259t2;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import p254r5.AbstractC6487a;
import p254r5.C6501h;
import p254r5.C6503i;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4991g extends AbstractC5028y0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15174f;

    /* JADX INFO: renamed from: g */
    public final TreeMap f15175g;

    public C4991g(C5009p c5009p) {
        super("call_site_ids", c5009p, 4);
        this.f15174f = new TreeMap();
        this.f15175g = new TreeMap();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15174f.values();
    }

    @Override // p182m5.AbstractC5028y0
    /* JADX INFO: renamed from: q */
    public void mo20135q() {
        Iterator it = this.f15174f.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((C4989f) it.next()).m20101m(i10);
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m20138r(C6501h c6501h, C4993h c4993h) {
        if (c6501h == null) {
            C1259t2.m5095a("callSite == null");
        } else if (c4993h != null) {
            this.f15175g.put(c6501h, c4993h);
        } else {
            C1259t2.m5095a("callSiteItem == null");
        }
    }

    /* JADX INFO: renamed from: s */
    public AbstractC4979a0 m20139s(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return null;
        }
        m20278k();
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) this.f15174f.get((C6503i) abstractC6487a);
        if (abstractC4979a0 != null) {
            return abstractC4979a0;
        }
        C9987e.m38645a("not found");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public C4993h m20140t(C6501h c6501h) {
        if (c6501h != null) {
            return (C4993h) this.f15175g.get(c6501h);
        }
        C1259t2.m5095a("callSite == null");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m20141u(C6503i c6503i) {
        if (c6503i == null) {
            throw new NullPointerException("cstRef");
        }
        m20279l();
        if (((C4989f) this.f15174f.get(c6503i)) == null) {
            this.f15174f.put(c6503i, new C4989f(c6503i));
        }
    }
}
