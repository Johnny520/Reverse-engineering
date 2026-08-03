package p332wb;

import p117i0.InterfaceC1809a1;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.uk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5378uk implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21138g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21139h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC5378uk(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21138g = i9;
        this.f21139h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1809a1 interfaceC1809a1;
        Number number;
        switch (this.f21138g) {
            case 0:
                interfaceC1809a1 = this.f21139h;
                number = (Number) interfaceC1809a1.getValue();
                break;
            default:
                interfaceC1809a1 = this.f21139h;
                number = (Number) interfaceC1809a1.getValue();
                break;
        }
        AbstractC3199a.m6848u(number, 1, interfaceC1809a1);
    }
}
