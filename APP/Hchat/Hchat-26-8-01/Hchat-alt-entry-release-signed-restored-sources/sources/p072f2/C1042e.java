package p072f2;

import p085fg.InterfaceC1231l;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1042e extends AbstractC5852n implements InterfaceC5665z1 {

    /* JADX INFO: renamed from: u */
    public boolean f3276u;

    /* JADX INFO: renamed from: v */
    public final boolean f3277v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1231l f3278w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1042e(boolean z9, boolean z10, InterfaceC1231l interfaceC1231l) {
        this.f3276u = z9;
        this.f3277v = z10;
        this.f3278w = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: S0 */
    public final boolean mo1609S0() {
        return this.f3276u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        this.f3278w.invoke(interfaceC1062y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: c0 */
    public final boolean mo2643c0() {
        return this.f3277v;
    }
}
