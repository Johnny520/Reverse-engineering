package p308v1;

import p085fg.InterfaceC1231l;
import p293u2.C4242l;
import p339x1.InterfaceC5655w0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: v1.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4435w0 extends AbstractC5852n implements InterfaceC5655w0 {

    /* JADX INFO: renamed from: u */
    public InterfaceC1231l f14745u;

    /* JADX INFO: renamed from: v */
    public long f14746v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5655w0
    /* JADX INFO: renamed from: e */
    public final void mo744e(long j3) {
        if (C4242l.m8534a(this.f14746v, j3)) {
            return;
        }
        this.f14745u.invoke(new C4242l(j3));
        this.f14746v = j3;
    }
}
