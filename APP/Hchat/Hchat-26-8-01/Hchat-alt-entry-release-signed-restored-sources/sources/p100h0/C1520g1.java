package p100h0;

import p071f1.InterfaceC0998d0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: h0.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1520g1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5078g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f5079h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1520g1(InterfaceC1220a interfaceC1220a, int i9) {
        this.f5078g = i9;
        this.f5079h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f5078g) {
            case 0:
                break;
            case 1:
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                float fFloatValue = ((Number) this.f5079h.invoke()).floatValue();
                interfaceC0998d0.mo2547q(fFloatValue);
                interfaceC0998d0.mo2541i(fFloatValue);
                break;
            case 2:
                this.f5079h.invoke();
                break;
            default:
                this.f5079h.invoke();
                break;
        }
        return C3967n.f12976a;
    }
}
