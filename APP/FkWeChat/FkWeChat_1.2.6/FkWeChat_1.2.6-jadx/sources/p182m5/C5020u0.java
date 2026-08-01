package p182m5;

import bsh.C1259t2;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import p254r5.AbstractC6487a;
import p254r5.C6492c0;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5020u0 extends AbstractC5028y0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15298f;

    public C5020u0(C5009p c5009p) {
        super("string_ids", c5009p, 4);
        this.f15298f = new TreeMap();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15298f.values();
    }

    @Override // p182m5.AbstractC5028y0
    /* JADX INFO: renamed from: q */
    public void mo20135q() {
        Iterator it = this.f15298f.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((C5018t0) it.next()).m20101m(i10);
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public AbstractC4979a0 m20300r(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return null;
        }
        m20278k();
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) this.f15298f.get((C6492c0) abstractC6487a);
        if (abstractC4979a0 != null) {
            return abstractC4979a0;
        }
        C9987e.m38645a("not found");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public int m20301s(C6492c0 c6492c0) {
        if (c6492c0 == null) {
            C1259t2.m5095a("string == null");
            return 0;
        }
        m20278k();
        C5018t0 c5018t0 = (C5018t0) this.f15298f.get(c6492c0);
        if (c5018t0 != null) {
            return c5018t0.m20098j();
        }
        C9987e.m38645a("not found");
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public synchronized C5018t0 m20302t(C5018t0 c5018t0) {
        if (c5018t0 == null) {
            throw new NullPointerException("string == null");
        }
        m20279l();
        C6492c0 c6492c0M20296n = c5018t0.m20296n();
        C5018t0 c5018t02 = (C5018t0) this.f15298f.get(c6492c0M20296n);
        if (c5018t02 != null) {
            return c5018t02;
        }
        this.f15298f.put(c6492c0M20296n, c5018t0);
        return c5018t0;
    }

    /* JADX INFO: renamed from: u */
    public C5018t0 m20303u(C6492c0 c6492c0) {
        return m20302t(new C5018t0(c6492c0));
    }

    /* JADX INFO: renamed from: v */
    public void m20304v(InterfaceC8819a interfaceC8819a) {
        m20278k();
        int size = this.f15298f.size();
        int iM20275f = size == 0 ? 0 : m20275f();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "string_ids_size: " + AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, "string_ids_off:  " + AbstractC8826h.m33901j(iM20275f));
        }
        interfaceC8819a.writeInt(size);
        interfaceC8819a.writeInt(iM20275f);
    }
}
