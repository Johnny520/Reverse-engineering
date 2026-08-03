package p332wb;

import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.m1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5095m1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18828g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f18829h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18830i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5095m1(InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f18828g = i9;
        this.f18829h = interfaceC1220a;
        this.f18830i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f18828g) {
            case 0:
                this.f18830i.setValue(Boolean.FALSE);
                this.f18829h.invoke();
                break;
            case 1:
                this.f18830i.setValue(Boolean.FALSE);
                this.f18829h.invoke();
                break;
            default:
                this.f18830i.setValue(Boolean.FALSE);
                this.f18829h.invoke();
                break;
        }
        return C3967n.f12976a;
    }
}
