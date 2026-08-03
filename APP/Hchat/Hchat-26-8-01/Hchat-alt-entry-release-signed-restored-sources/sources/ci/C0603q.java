package ci;

import p071f1.InterfaceC0998d0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p249qg.AbstractC3603v;
import p276sf.C3967n;

/* JADX INFO: renamed from: ci.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0603q implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1905g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0607s f1906h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0603q(C0607s c0607s, int i9) {
        this.f1905g = i9;
        this.f1906h = c0607s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f1905g) {
            case 0:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) obj;
                interfaceC1235p.getClass();
                return AbstractC3603v.m7563q(this.f1906h.m10550Y0(), null, interfaceC1235p, 3);
            default:
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                C0601p c0601p = this.f1906h.f1911u;
                interfaceC0998d0.mo2549s(c0601p.f1884a);
                interfaceC0998d0.mo2539g(c0601p.f1885b);
                interfaceC0998d0.mo2548r(true);
                return C3967n.f12976a;
        }
    }
}
