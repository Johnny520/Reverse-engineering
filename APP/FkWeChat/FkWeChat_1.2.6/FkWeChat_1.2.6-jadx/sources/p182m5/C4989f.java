package p182m5;

import p254r5.C6501h;
import p254r5.C6503i;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4989f extends AbstractC4979a0 implements Comparable {

    /* JADX INFO: renamed from: r */
    public final C6503i f15172r;

    /* JADX INFO: renamed from: s */
    public C4993h f15173s = null;

    public C4989f(C6503i c6503i) {
        this.f15172r = c6503i;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        C6501h c6501hM25771k = this.f15172r.m25771k();
        C4991g c4991gM20245f = c5009p.m20245f();
        C4993h c4993hM20140t = c4991gM20245f.m20140t(c6501hM25771k);
        if (c4993hM20140t == null) {
            C5002l0 c5002l0M20244e = c5009p.m20244e();
            c4993hM20140t = new C4993h(c6501hM25771k);
            c5002l0M20244e.m20190q(c4993hM20140t);
            c4991gM20245f.m20138r(c6501hM25771k, c4993hM20140t);
        }
        this.f15173s = c4993hM20140t;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f15172r.compareTo(((C4989f) obj).f15172r);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return 4;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20201l = this.f15173s.m20201l();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20100l() + ' ' + this.f15172r.toString());
            StringBuilder sb2 = new StringBuilder("call_site_off: ");
            sb2.append(AbstractC8826h.m33901j(iM20201l));
            interfaceC8819a.mo33825d(4, sb2.toString());
        }
        interfaceC8819a.writeInt(iM20201l);
    }
}
