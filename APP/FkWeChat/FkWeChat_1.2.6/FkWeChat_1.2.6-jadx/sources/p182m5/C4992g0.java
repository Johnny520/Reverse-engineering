package p182m5;

import bsh.C1259t2;
import p254r5.C6520y;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p309v5.InterfaceC8837s;

/* JADX INFO: renamed from: m5.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4992g0 implements InterfaceC8837s, Comparable {

    /* JADX INFO: renamed from: q */
    public final C6520y f15176q;

    /* JADX INFO: renamed from: r */
    public C4981b f15177r;

    public C4992g0(C6520y c6520y, C4981b c4981b) {
        if (c6520y == null) {
            C1259t2.m5095a("method == null");
            throw null;
        }
        if (c4981b == null) {
            C1259t2.m5095a("annotations == null");
            throw null;
        }
        this.f15176q = c6520y;
        this.f15177r = c4981b;
    }

    /* JADX INFO: renamed from: a */
    public void m20142a(C5009p c5009p) {
        C5000k0 c5000k0M20255p = c5009p.m20255p();
        C5002l0 c5002l0M20262w = c5009p.m20262w();
        c5000k0M20255p.m20181u(this.f15176q);
        this.f15177r = (C4981b) c5002l0M20262w.m20191r(this.f15177r);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4992g0 c4992g0) {
        return this.f15176q.compareTo(c4992g0.f15176q);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4992g0) {
            return this.f15176q.equals(((C4992g0) obj).f15176q);
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f15176q.mo6828g() + ": " + this.f15177r;
    }

    /* JADX INFO: renamed from: h */
    public void m20144h(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20180t = c5009p.m20255p().m20180t(this.f15176q);
        int iM20201l = this.f15177r.m20201l();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, "    " + this.f15176q.mo6828g());
            interfaceC8819a.mo33825d(4, "      method_idx:      " + AbstractC8826h.m33901j(iM20180t));
            interfaceC8819a.mo33825d(4, "      annotations_off: " + AbstractC8826h.m33901j(iM20201l));
        }
        interfaceC8819a.writeInt(iM20180t);
        interfaceC8819a.writeInt(iM20201l);
    }

    public int hashCode() {
        return this.f15176q.hashCode();
    }
}
