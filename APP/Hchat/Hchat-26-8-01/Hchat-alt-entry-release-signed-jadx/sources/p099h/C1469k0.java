package p099h;

import gg.AbstractC1417m;
import p071f1.InterfaceC0998d0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: h.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1469k0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f4883g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f4884h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1469k0(boolean z9, InterfaceC1220a interfaceC1220a) {
        super(1);
        this.f4883g = z9;
        this.f4884h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        ((InterfaceC0998d0) obj).mo2548r(!this.f4883g && ((Boolean) this.f4884h.invoke()).booleanValue());
        return C3967n.f12976a;
    }
}
