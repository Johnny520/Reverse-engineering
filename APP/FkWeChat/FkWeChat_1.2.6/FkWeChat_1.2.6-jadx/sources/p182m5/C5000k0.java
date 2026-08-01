package p182m5;

import bsh.C1259t2;
import java.util.Collection;
import java.util.TreeMap;
import p254r5.AbstractC6487a;
import p254r5.AbstractC6495e;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5000k0 extends AbstractC4990f0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15204f;

    public C5000k0(C5009p c5009p) {
        super("method_ids", c5009p);
        this.f15204f = new TreeMap();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15204f.values();
    }

    /* JADX INFO: renamed from: s */
    public AbstractC4979a0 m20179s(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return null;
        }
        m20278k();
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) this.f15204f.get((AbstractC6495e) abstractC6487a);
        if (abstractC4979a0 != null) {
            return abstractC4979a0;
        }
        C9987e.m38645a("not found");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public int m20180t(AbstractC6495e abstractC6495e) {
        if (abstractC6495e == null) {
            C1259t2.m5095a("ref == null");
            return 0;
        }
        m20278k();
        C4998j0 c4998j0 = (C4998j0) this.f15204f.get(abstractC6495e);
        if (c4998j0 != null) {
            return c4998j0.m20098j();
        }
        C9987e.m38645a("not found");
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public synchronized C4998j0 m20181u(AbstractC6495e abstractC6495e) {
        C4998j0 c4998j0;
        if (abstractC6495e == null) {
            throw new NullPointerException("method == null");
        }
        m20279l();
        c4998j0 = (C4998j0) this.f15204f.get(abstractC6495e);
        if (c4998j0 == null) {
            c4998j0 = new C4998j0(abstractC6495e);
            this.f15204f.put(abstractC6495e, c4998j0);
        }
        return c4998j0;
    }

    /* JADX INFO: renamed from: v */
    public void m20182v(InterfaceC8819a interfaceC8819a) {
        m20278k();
        int size = this.f15204f.size();
        int iM20275f = size == 0 ? 0 : m20275f();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "method_ids_size: " + AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, "method_ids_off:  " + AbstractC8826h.m33901j(iM20275f));
        }
        interfaceC8819a.writeInt(size);
        interfaceC8819a.writeInt(iM20275f);
    }
}
