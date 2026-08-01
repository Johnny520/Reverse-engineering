package p182m5;

import p006a5.AbstractC0069e;
import p254r5.C6492c0;
import p309v5.AbstractC8826h;
import p309v5.C8822d;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5016s0 extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public final C6492c0 f15291u;

    public C5016s0(C6492c0 c6492c0) {
        super(1, m20293w(c6492c0));
        this.f15291u = c6492c0;
    }

    /* JADX INFO: renamed from: w */
    public static int m20293w(C6492c0 c6492c0) {
        return AbstractC0069e.m224a(c6492c0.m25742p()) + c6492c0.m25743s() + 1;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_STRING_DATA_ITEM;
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: k */
    public int mo20092k(AbstractC5004m0 abstractC5004m0) {
        return this.f15291u.compareTo(((C5016s0) abstractC5004m0).f15291u);
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public String mo20094u() {
        return this.f15291u.m25744v();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        C8822d c8822dM25740k = this.f15291u.m25740k();
        int iM25742p = this.f15291u.m25742p();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(AbstractC0069e.m224a(iM25742p), "utf16_size: " + AbstractC8826h.m33901j(iM25742p));
            interfaceC8819a.mo33825d(c8822dM25740k.m33861q() + 1, this.f15291u.m25744v());
        }
        interfaceC8819a.mo33868i(iM25742p);
        interfaceC8819a.mo33867g(c8822dM25740k);
        interfaceC8819a.writeByte(0);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
    }
}
