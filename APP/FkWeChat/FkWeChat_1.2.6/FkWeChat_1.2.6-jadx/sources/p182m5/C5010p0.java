package p182m5;

import bsh.C1259t2;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import p215oc.C5725t;
import p254r5.AbstractC6487a;
import p254r5.C6488a0;
import p269s5.C7186a;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5010p0 extends AbstractC5028y0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15275f;

    public C5010p0(C5009p c5009p) {
        super("proto_ids", c5009p, 4);
        this.f15275f = new TreeMap();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15275f.values();
    }

    @Override // p182m5.AbstractC5028y0
    /* JADX INFO: renamed from: q */
    public void mo20135q() {
        Iterator it = mo20137g().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((C5008o0) it.next()).m20101m(i10);
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public AbstractC4979a0 m20266r(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return null;
        }
        if (!(abstractC6487a instanceof C6488a0)) {
            C9987e.m38645a("cst not instance of CstProtoRef");
            return null;
        }
        m20278k();
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) this.f15275f.get(((C6488a0) abstractC6487a).m25731k());
        if (abstractC4979a0 != null) {
            return abstractC4979a0;
        }
        C9987e.m38645a("not found");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public int m20267s(C7186a c7186a) {
        if (c7186a == null) {
            C1259t2.m5095a("prototype == null");
            return 0;
        }
        m20278k();
        C5008o0 c5008o0 = (C5008o0) this.f15275f.get(c7186a);
        if (c5008o0 != null) {
            return c5008o0.m20098j();
        }
        C9987e.m38645a("not found");
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public synchronized C5008o0 m20268t(C7186a c7186a) {
        C5008o0 c5008o0;
        if (c7186a == null) {
            throw new NullPointerException("prototype == null");
        }
        m20279l();
        c5008o0 = (C5008o0) this.f15275f.get(c7186a);
        if (c5008o0 == null) {
            c5008o0 = new C5008o0(c7186a);
            this.f15275f.put(c7186a, c5008o0);
        }
        return c5008o0;
    }

    /* JADX INFO: renamed from: u */
    public void m20269u(InterfaceC8819a interfaceC8819a) {
        m20278k();
        int size = this.f15275f.size();
        int iM20275f = size == 0 ? 0 : m20275f();
        if (size > 65536) {
            C5725t.m23179a("too many proto ids");
            return;
        }
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "proto_ids_size:  " + AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, "proto_ids_off:   " + AbstractC8826h.m33901j(iM20275f));
        }
        interfaceC8819a.writeInt(size);
        interfaceC8819a.writeInt(iM20275f);
    }
}
