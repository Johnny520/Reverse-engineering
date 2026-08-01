package p182m5;

import bsh.C1259t2;
import p254r5.C6508m;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p309v5.InterfaceC8837s;

/* JADX INFO: renamed from: m5.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5019u implements InterfaceC8837s, Comparable {

    /* JADX INFO: renamed from: q */
    public final C6508m f15296q;

    /* JADX INFO: renamed from: r */
    public C4981b f15297r;

    public C5019u(C6508m c6508m, C4981b c4981b) {
        if (c6508m == null) {
            C1259t2.m5095a("field == null");
            throw null;
        }
        if (c4981b == null) {
            C1259t2.m5095a("annotations == null");
            throw null;
        }
        this.f15296q = c6508m;
        this.f15297r = c4981b;
    }

    /* JADX INFO: renamed from: a */
    public void m20297a(C5009p c5009p) {
        C5023w c5023wM20249j = c5009p.m20249j();
        C5002l0 c5002l0M20262w = c5009p.m20262w();
        c5023wM20249j.m20308u(this.f15296q);
        this.f15297r = (C4981b) c5002l0M20262w.m20191r(this.f15297r);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5019u c5019u) {
        return this.f15296q.compareTo(c5019u.f15296q);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5019u) {
            return this.f15296q.equals(((C5019u) obj).f15296q);
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f15296q.mo6828g() + ": " + this.f15297r;
    }

    /* JADX INFO: renamed from: h */
    public void m20299h(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20307t = c5009p.m20249j().m20307t(this.f15296q);
        int iM20201l = this.f15297r.m20201l();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, "    " + this.f15296q.mo6828g());
            interfaceC8819a.mo33825d(4, "      field_idx:       " + AbstractC8826h.m33901j(iM20307t));
            interfaceC8819a.mo33825d(4, "      annotations_off: " + AbstractC8826h.m33901j(iM20201l));
        }
        interfaceC8819a.writeInt(iM20307t);
        interfaceC8819a.writeInt(iM20201l);
    }

    public int hashCode() {
        return this.f15296q.hashCode();
    }
}
