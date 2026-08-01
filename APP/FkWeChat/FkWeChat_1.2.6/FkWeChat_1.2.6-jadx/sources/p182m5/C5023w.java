package p182m5;

import bsh.C1259t2;
import java.util.Collection;
import java.util.TreeMap;
import p254r5.AbstractC6487a;
import p254r5.C6508m;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5023w extends AbstractC4990f0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15299f;

    public C5023w(C5009p c5009p) {
        super("field_ids", c5009p);
        this.f15299f = new TreeMap();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15299f.values();
    }

    /* JADX INFO: renamed from: s */
    public AbstractC4979a0 m20306s(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return null;
        }
        m20278k();
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) this.f15299f.get((C6508m) abstractC6487a);
        if (abstractC4979a0 != null) {
            return abstractC4979a0;
        }
        C9987e.m38645a("not found");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public int m20307t(C6508m c6508m) {
        if (c6508m == null) {
            C1259t2.m5095a("ref == null");
            return 0;
        }
        m20278k();
        C5021v c5021v = (C5021v) this.f15299f.get(c6508m);
        if (c5021v != null) {
            return c5021v.m20098j();
        }
        C9987e.m38645a("not found");
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public synchronized C5021v m20308u(C6508m c6508m) {
        C5021v c5021v;
        if (c6508m == null) {
            throw new NullPointerException("field == null");
        }
        m20279l();
        c5021v = (C5021v) this.f15299f.get(c6508m);
        if (c5021v == null) {
            c5021v = new C5021v(c6508m);
            this.f15299f.put(c6508m, c5021v);
        }
        return c5021v;
    }

    /* JADX INFO: renamed from: v */
    public void m20309v(InterfaceC8819a interfaceC8819a) {
        m20278k();
        int size = this.f15299f.size();
        int iM20275f = size == 0 ? 0 : m20275f();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "field_ids_size:  " + AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, "field_ids_off:   " + AbstractC8826h.m33901j(iM20275f));
        }
        interfaceC8819a.writeInt(size);
        interfaceC8819a.writeInt(iM20275f);
    }
}
