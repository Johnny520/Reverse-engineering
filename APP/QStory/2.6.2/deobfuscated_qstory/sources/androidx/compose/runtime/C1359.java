package androidx.compose.runtime;

import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1359 implements InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC1360 f3932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f3933;

    public C1359(InterfaceC6557 interfaceC6557) {
        this.f3933 = interfaceC6557;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2164() {
        this.f3932 = (InterfaceC1360) this.f3933.invoke(AbstractC1367.f3970);
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2165() {
        InterfaceC1360 interfaceC1360 = this.f3932;
        if (interfaceC1360 != null) {
            interfaceC1360.dispose();
        }
        this.f3932 = null;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2166() {
    }
}
