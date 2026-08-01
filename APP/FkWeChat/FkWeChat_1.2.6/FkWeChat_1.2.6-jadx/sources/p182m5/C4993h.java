package p182m5;

import p254r5.C6501h;
import p309v5.C8823e;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4993h extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public final C6501h f15178u;

    /* JADX INFO: renamed from: v */
    public byte[] f15179v;

    public C4993h(C6501h c6501h) {
        super(1, m20145w(c6501h));
        this.f15178u = c6501h;
    }

    /* JADX INFO: renamed from: w */
    public static int m20145w(C6501h c6501h) {
        return -1;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        C4980a1.m20103b(c5009p, this.f15178u);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: s */
    public void mo20093s(AbstractC5012q0 abstractC5012q0, int i10) {
        C8823e c8823e = new C8823e();
        new C4980a1(abstractC5012q0.m20274e(), c8823e).m20107f(this.f15178u, true);
        byte[] bArrM33874r = c8823e.m33874r();
        this.f15179v = bArrM33874r;
        m20205t(bArrM33874r.length);
    }

    public String toString() {
        return this.f15178u.toString();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public String mo20094u() {
        return this.f15178u.mo6828g();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        if (!interfaceC8819a.mo33828k()) {
            interfaceC8819a.write(this.f15179v);
            return;
        }
        interfaceC8819a.mo33825d(0, m20203p() + " call site");
        new C4980a1(c5009p, interfaceC8819a).m20107f(this.f15178u, true);
    }
}
