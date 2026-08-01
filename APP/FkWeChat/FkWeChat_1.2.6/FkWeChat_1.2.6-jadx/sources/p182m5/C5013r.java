package p182m5;

import bsh.C1259t2;
import p006a5.AbstractC0069e;
import p239q5.AbstractC6247a;
import p254r5.C6508m;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5013r extends AbstractC5015s implements Comparable {

    /* JADX INFO: renamed from: r */
    public final C6508m f15283r;

    public C5013r(C6508m c6508m, int i10) {
        super(i10);
        if (c6508m != null) {
            this.f15283r = c6508m;
        } else {
            C1259t2.m5095a("field == null");
            throw null;
        }
    }

    @Override // p182m5.AbstractC5015s
    /* JADX INFO: renamed from: a */
    public int mo20281a(C5009p c5009p, InterfaceC8819a interfaceC8819a, int i10, int i11) {
        int iM20307t = c5009p.m20249j().m20307t(this.f15283r);
        int i12 = iM20307t - i10;
        int iM20292c = m20292c();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, String.format("  [%x] %s", Integer.valueOf(i11), this.f15283r.mo6828g()));
            interfaceC8819a.mo33825d(AbstractC0069e.m224a(i12), "    field_idx:    " + AbstractC8826h.m33901j(iM20307t));
            interfaceC8819a.mo33825d(AbstractC0069e.m224a(iM20292c), "    access_flags: " + AbstractC6247a.m24648b(iM20292c));
        }
        interfaceC8819a.mo33868i(i12);
        interfaceC8819a.mo33868i(iM20292c);
        return iM20307t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5013r) && compareTo((C5013r) obj) == 0;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f15283r.mo6828g();
    }

    /* JADX INFO: renamed from: h */
    public void m20282h(C5009p c5009p) {
        c5009p.m20249j().m20308u(this.f15283r);
    }

    public int hashCode() {
        return this.f15283r.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5013r c5013r) {
        return this.f15283r.compareTo(c5013r.f15283r);
    }

    /* JADX INFO: renamed from: k */
    public C6508m m20284k() {
        return this.f15283r;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(C5013r.class.getName());
        sb2.append('{');
        sb2.append(AbstractC8826h.m33898g(m20292c()));
        sb2.append(' ');
        sb2.append(this.f15283r);
        sb2.append('}');
        return sb2.toString();
    }
}
