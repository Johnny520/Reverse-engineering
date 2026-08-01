package p182m5;

import bsh.C1259t2;
import p254r5.C6493d;
import p309v5.C8823e;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5011q extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public final C6493d f15276u;

    /* JADX INFO: renamed from: v */
    public byte[] f15277v;

    public C5011q(C6493d c6493d) {
        super(1, -1);
        if (c6493d == null) {
            C1259t2.m5095a("array == null");
            throw null;
        }
        this.f15276u = c6493d;
        this.f15277v = null;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        C4980a1.m20103b(c5009p, this.f15276u);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_ENCODED_ARRAY_ITEM;
    }

    public int hashCode() {
        return this.f15276u.hashCode();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: k */
    public int mo20092k(AbstractC5004m0 abstractC5004m0) {
        return this.f15276u.compareTo(((C5011q) abstractC5004m0).f15276u);
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: s */
    public void mo20093s(AbstractC5012q0 abstractC5012q0, int i10) {
        C8823e c8823e = new C8823e();
        new C4980a1(abstractC5012q0.m20274e(), c8823e).m20107f(this.f15276u, false);
        byte[] bArrM33874r = c8823e.m33874r();
        this.f15277v = bArrM33874r;
        m20205t(bArrM33874r.length);
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public String mo20094u() {
        return this.f15276u.mo6828g();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        if (!interfaceC8819a.mo33828k()) {
            interfaceC8819a.write(this.f15277v);
            return;
        }
        interfaceC8819a.mo33825d(0, m20203p() + " encoded array");
        new C4980a1(c5009p, interfaceC8819a).m20107f(this.f15276u, true);
    }
}
