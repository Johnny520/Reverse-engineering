package p182m5;

import ae.C0307f;
import bsh.C1259t2;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import p006a5.C0067c;
import p254r5.AbstractC6487a;
import p254r5.C6496e0;
import p269s5.C7188c;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5024w0 extends AbstractC5028y0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15300f;

    public C5024w0(C5009p c5009p) {
        super("type_ids", c5009p, 4);
        this.f15300f = new TreeMap();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15300f.values();
    }

    @Override // p182m5.AbstractC5028y0
    /* JADX INFO: renamed from: q */
    public void mo20135q() {
        Iterator it = mo20137g().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((C5022v0) it.next()).m20101m(i10);
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public AbstractC4979a0 m20310r(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return null;
        }
        m20278k();
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) this.f15300f.get(((C6496e0) abstractC6487a).m25760n());
        if (abstractC4979a0 != null) {
            return abstractC4979a0;
        }
        C0307f.m923a("not found: ", abstractC6487a);
        return null;
    }

    /* JADX INFO: renamed from: s */
    public int m20311s(C6496e0 c6496e0) {
        if (c6496e0 != null) {
            return m20312t(c6496e0.m25760n());
        }
        C1259t2.m5095a("type == null");
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int m20312t(C7188c c7188c) {
        if (c7188c == null) {
            C1259t2.m5095a("type == null");
            return 0;
        }
        m20278k();
        C5022v0 c5022v0 = (C5022v0) this.f15300f.get(c7188c);
        if (c5022v0 != null) {
            return c5022v0.m20098j();
        }
        C0307f.m923a("not found: ", c7188c);
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public synchronized C5022v0 m20313u(C6496e0 c6496e0) {
        C5022v0 c5022v0;
        if (c6496e0 == null) {
            throw new NullPointerException("type == null");
        }
        m20279l();
        C7188c c7188cM25760n = c6496e0.m25760n();
        c5022v0 = (C5022v0) this.f15300f.get(c7188cM25760n);
        if (c5022v0 == null) {
            c5022v0 = new C5022v0(c6496e0);
            this.f15300f.put(c7188cM25760n, c5022v0);
        }
        return c5022v0;
    }

    /* JADX INFO: renamed from: v */
    public synchronized C5022v0 m20314v(C7188c c7188c) {
        C5022v0 c5022v0;
        if (c7188c == null) {
            throw new NullPointerException("type == null");
        }
        m20279l();
        c5022v0 = (C5022v0) this.f15300f.get(c7188c);
        if (c5022v0 == null) {
            c5022v0 = new C5022v0(new C6496e0(c7188c));
            this.f15300f.put(c7188c, c5022v0);
        }
        return c5022v0;
    }

    /* JADX INFO: renamed from: w */
    public void m20315w(InterfaceC8819a interfaceC8819a) {
        m20278k();
        int size = this.f15300f.size();
        int iM20275f = size == 0 ? 0 : m20275f();
        if (size > 65536) {
            throw new C0067c(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(mo20137g().size()), 65536));
        }
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "type_ids_size:   " + AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, "type_ids_off:    " + AbstractC8826h.m33901j(iM20275f));
        }
        interfaceC8819a.writeInt(size);
        interfaceC8819a.writeInt(iM20275f);
    }
}
