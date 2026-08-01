package p182m5;

import p254r5.AbstractC6518w;
import p254r5.C6521z;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4988e0 extends AbstractC5029z {

    /* JADX INFO: renamed from: s */
    public final AbstractC6518w f15171s;

    public AbstractC4988e0(AbstractC6518w abstractC6518w) {
        super(abstractC6518w.m25802k());
        this.f15171s = abstractC6518w;
    }

    @Override // p182m5.AbstractC5029z, p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        super.mo20090a(c5009p);
        c5009p.m20259t().m20303u(m20132p().m25803n().m25814p());
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return 8;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public final void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        C5020u0 c5020u0M20259t = c5009p.m20259t();
        C6521z c6521zM25803n = this.f15171s.m25803n();
        int iM20311s = c5024w0M20260u.m20311s(m20317n());
        int iM20301s = c5020u0M20259t.m20301s(c6521zM25803n.m25814p());
        int iMo20133r = mo20133r(c5009p);
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20100l() + ' ' + this.f15171s.mo6828g());
            StringBuilder sb2 = new StringBuilder("  class_idx: ");
            sb2.append(AbstractC8826h.m33898g(iM20311s));
            interfaceC8819a.mo33825d(2, sb2.toString());
            interfaceC8819a.mo33825d(2, String.format("  %-10s %s", mo20134s() + ':', AbstractC8826h.m33898g(iMo20133r)));
            StringBuilder sb3 = new StringBuilder("  name_idx:  ");
            sb3.append(AbstractC8826h.m33901j(iM20301s));
            interfaceC8819a.mo33825d(4, sb3.toString());
        }
        interfaceC8819a.writeShort(iM20311s);
        interfaceC8819a.writeShort(iMo20133r);
        interfaceC8819a.writeInt(iM20301s);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC6518w m20132p() {
        return this.f15171s;
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo20133r(C5009p c5009p);

    /* JADX INFO: renamed from: s */
    public abstract String mo20134s();
}
