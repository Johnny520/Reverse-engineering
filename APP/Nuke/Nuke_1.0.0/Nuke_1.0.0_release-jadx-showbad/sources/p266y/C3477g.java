package p266y;

import p000A.C0039U;
import p007B0.C0190d;
import p016C3.C0244a;
import p034G.C0466k;
import p041H0.AbstractC0596h0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: y.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3477g extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f10793h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3478h f10794i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC0596h0 f10795j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0190d f10796k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0244a f10797l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3477g(C3478h c3478h, AbstractC0596h0 abstractC0596h0, C0190d c0190d, C0244a c0244a, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f10794i = c3478h;
        this.f10795j = abstractC0596h0;
        this.f10796k = c0190d;
        this.f10797l = c0244a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C3477g) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C3477g c3477g = new C3477g(this.f10794i, this.f10795j, this.f10796k, this.f10797l, interfaceC1046d);
        c3477g.f10793h = obj;
        return c3477g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        AbstractC1784a.m3205S(obj);
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f10793h;
        C3478h c3478h = this.f10794i;
        InterfaceC1046d interfaceC1046d = null;
        AbstractC2162v.m3994p(interfaceC2160t, null, new C0466k(c3478h, this.f10795j, this.f10796k, interfaceC1046d, 16), 3);
        return AbstractC2162v.m3994p(interfaceC2160t, null, new C0039U(c3478h, this.f10797l, interfaceC1046d, 24), 3);
    }
}
