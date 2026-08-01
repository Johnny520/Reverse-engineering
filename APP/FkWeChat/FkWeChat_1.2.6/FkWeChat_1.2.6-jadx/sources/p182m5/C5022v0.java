package p182m5;

import p254r5.C6492c0;
import p254r5.C6496e0;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5022v0 extends AbstractC5029z {
    public C5022v0(C6496e0 c6496e0) {
        super(c6496e0);
    }

    @Override // p182m5.AbstractC5029z, p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        c5009p.m20259t().m20303u(m20317n().m25761p());
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_TYPE_ID_ITEM;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return 4;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        C6492c0 c6492c0M25761p = m20317n().m25761p();
        int iM20301s = c5009p.m20259t().m20301s(c6492c0M25761p);
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20100l() + ' ' + c6492c0M25761p.mo6828g());
            StringBuilder sb2 = new StringBuilder("  descriptor_idx: ");
            sb2.append(AbstractC8826h.m33901j(iM20301s));
            interfaceC8819a.mo33825d(4, sb2.toString());
        }
        interfaceC8819a.writeInt(iM20301s);
    }
}
