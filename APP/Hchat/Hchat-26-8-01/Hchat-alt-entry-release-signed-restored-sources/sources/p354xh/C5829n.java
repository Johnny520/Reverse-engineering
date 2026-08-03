package p354xh;

import p057e1.C0807b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: xh.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5829n implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23694g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f23695h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5829n(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f23694g = i9;
        this.f23695h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f23694g) {
            case 0:
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) obj;
                interfaceC4428t.getClass();
                this.f23695h.setValue(new C0807b(interfaceC4428t.mo8867m(0L)));
                break;
            default:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f23695h.getValue();
                if (interfaceC1220a != null) {
                    interfaceC1220a.invoke();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
