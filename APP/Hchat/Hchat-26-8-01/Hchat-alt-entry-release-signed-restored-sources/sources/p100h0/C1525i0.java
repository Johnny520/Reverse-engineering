package p100h0;

import p057e1.C0807b;
import p085fg.InterfaceC1220a;
import p116i.C1772n;
import p117i0.InterfaceC1854l2;

/* JADX INFO: renamed from: h0.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1525i0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5091g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1854l2 f5092h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1525i0(InterfaceC1854l2 interfaceC1854l2, int i9) {
        this.f5091g = i9;
        this.f5092h = interfaceC1854l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        float fFloatValue;
        int i9 = this.f5091g;
        InterfaceC1854l2 interfaceC1854l2 = this.f5092h;
        switch (i9) {
            case 0:
                return new C0807b(((C0807b) interfaceC1854l2.getValue()).f2414a);
            case 1:
                C1772n c1772n = AbstractC1537m0.f5124a;
                return new C0807b(((C0807b) interfaceC1854l2.getValue()).f2414a);
            case 2:
                fFloatValue = ((Number) interfaceC1854l2.getValue()).floatValue();
                break;
            default:
                fFloatValue = ((Number) interfaceC1854l2.getValue()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
