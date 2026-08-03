package p332wb;

import p080fb.C1113d1;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.kr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5055kr implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18517g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1113d1 f18518h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18519i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18520j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5055kr(C1113d1 c1113d1, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f18517g = i9;
        this.f18518h = c1113d1;
        this.f18519i = interfaceC1809a1;
        this.f18520j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f18517g) {
            case 0:
                this.f18519i.setValue(this.f18518h.f3636a);
                this.f18520j.setValue(null);
                break;
            default:
                C1113d1 c1113d1 = this.f18518h;
                this.f18519i.setValue(c1113d1.f3637b);
                this.f18520j.setValue(c1113d1.f3636a);
                break;
        }
        return C3967n.f12976a;
    }
}
