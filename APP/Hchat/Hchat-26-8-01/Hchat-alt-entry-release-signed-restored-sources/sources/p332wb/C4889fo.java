package p332wb;

import p036c9.C0467n0;
import p117i0.InterfaceC1898z;
import p174m.C2571a;

/* JADX INFO: renamed from: wb.fo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4889fo implements InterfaceC1898z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2571a f17242b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4889fo(C2571a c2571a, int i9) {
        this.f17241a = i9;
        this.f17242b = c2571a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1898z
    /* JADX INFO: renamed from: a */
    public final void mo725a() {
        switch (this.f17241a) {
            case 0:
                ((C0467n0) this.f17242b.f8339h).invoke();
                break;
            default:
                C2571a c2571a = this.f17242b;
                if (c2571a != null) {
                    ((C0467n0) c2571a.f8339h).invoke();
                }
                break;
        }
    }
}
