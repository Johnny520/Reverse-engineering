package p354xh;

import p071f1.InterfaceC0998d0;
import p085fg.InterfaceC1231l;
import p116i.C1739c;
import p276sf.C3967n;

/* JADX INFO: renamed from: xh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5816a implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23603g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1739c f23604h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5816a(C1739c c1739c, int i9) {
        this.f23603g = i9;
        this.f23604h = c1739c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
        switch (this.f23603g) {
            case 0:
                interfaceC0998d0.getClass();
                float fFloatValue = 1.0f - (((Number) this.f23604h.m4360d()).floatValue() * 0.2f);
                interfaceC0998d0.mo2547q(fFloatValue);
                interfaceC0998d0.mo2541i(fFloatValue);
                break;
            default:
                interfaceC0998d0.getClass();
                interfaceC0998d0.mo2544n(((Number) this.f23604h.m4360d()).floatValue());
                break;
        }
        return C3967n.f12976a;
    }
}
