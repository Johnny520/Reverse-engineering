package p182m5;

import bsh.C1259t2;
import p254r5.C6492c0;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5018t0 extends AbstractC4979a0 implements Comparable {

    /* JADX INFO: renamed from: r */
    public final C6492c0 f15294r;

    /* JADX INFO: renamed from: s */
    public C5016s0 f15295s;

    public C5018t0(C6492c0 c6492c0) {
        if (c6492c0 == null) {
            C1259t2.m5095a("value == null");
            throw null;
        }
        this.f15294r = c6492c0;
        this.f15295s = null;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        if (this.f15295s == null) {
            C5002l0 c5002l0M20258s = c5009p.m20258s();
            C5016s0 c5016s0 = new C5016s0(this.f15294r);
            this.f15295s = c5016s0;
            c5002l0M20258s.m20190q(c5016s0);
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_STRING_ID_ITEM;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f15294r.compareTo(((C5018t0) obj).f15294r);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5018t0) {
            return this.f15294r.equals(((C5018t0) obj).f15294r);
        }
        return false;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return 4;
    }

    public int hashCode() {
        return this.f15294r.hashCode();
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20201l = this.f15295s.m20201l();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20100l() + ' ' + this.f15294r.m25745w(100));
            StringBuilder sb2 = new StringBuilder("  string_data_off: ");
            sb2.append(AbstractC8826h.m33901j(iM20201l));
            interfaceC8819a.mo33825d(4, sb2.toString());
        }
        interfaceC8819a.writeInt(iM20201l);
    }

    /* JADX INFO: renamed from: n */
    public C6492c0 m20296n() {
        return this.f15294r;
    }
}
