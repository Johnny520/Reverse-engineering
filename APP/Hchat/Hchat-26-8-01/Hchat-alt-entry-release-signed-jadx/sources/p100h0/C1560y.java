package p100h0;

import p057e1.C0807b;
import p085fg.InterfaceC1231l;
import p267s1.AbstractC3913s;
import p267s1.C3914t;
import p276sf.C3967n;
import p321w.InterfaceC4647y0;

/* JADX INFO: renamed from: h0.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1560y implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5207g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4647y0 f5208h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1560y(InterfaceC4647y0 interfaceC4647y0, int i9) {
        this.f5207g = i9;
        this.f5208h = interfaceC4647y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f5207g) {
            case 0:
                C3914t c3914t = (C3914t) obj;
                this.f5208h.mo4013e(AbstractC3913s.m8115h(c3914t, false));
                c3914t.m8118a();
                break;
            case 1:
                C3914t c3914t2 = (C3914t) obj;
                this.f5208h.mo4013e(AbstractC3913s.m8115h(c3914t2, false));
                c3914t2.m8118a();
                break;
            default:
                this.f5208h.mo4009a(((C0807b) obj).f2414a, C1556w.f5191d);
                break;
        }
        return C3967n.f12976a;
    }
}
