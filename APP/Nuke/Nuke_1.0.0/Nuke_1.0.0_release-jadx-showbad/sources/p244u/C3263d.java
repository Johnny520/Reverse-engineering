package p244u;

import p029F0.InterfaceC0379Q;

/* JADX INFO: renamed from: u.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3263d implements InterfaceC3271h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10095a = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.InterfaceC3271h
    /* JADX INFO: renamed from: c */
    public final void mo5541c(int i5, InterfaceC0379Q interfaceC0379Q, int[] iArr, int[] iArr2) {
        switch (this.f10095a) {
            case 0:
                AbstractC3273i.m5545c(i5, iArr, iArr2, false);
                break;
            default:
                AbstractC3273i.m5544b(iArr, iArr2, false);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f10095a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
