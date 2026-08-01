package androidx.compose.runtime;

import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1359 implements InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC1360 f3933;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f3934;

    public C1359(InterfaceC6558 interfaceC6558) {
        this.f3934 = interfaceC6558;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2174() {
        this.f3933 = (InterfaceC1360) this.f3934.invoke(AbstractC1367.f3971);
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2175() {
        InterfaceC1360 interfaceC1360 = this.f3933;
        if (interfaceC1360 != null) {
            interfaceC1360.dispose();
        }
        this.f3933 = null;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2176() {
    }
}
