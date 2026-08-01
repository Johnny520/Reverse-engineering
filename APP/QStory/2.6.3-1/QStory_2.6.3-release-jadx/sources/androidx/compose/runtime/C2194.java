package androidx.compose.runtime;

import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2194 implements InterfaceC2174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2195 f4278;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f4279;

    public C2194(InterfaceC7387 interfaceC7387) {
        this.f4279 = interfaceC7387;
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2734() {
        this.f4278 = (InterfaceC2195) this.f4279.invoke(AbstractC2202.f4316);
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2735() {
        InterfaceC2195 interfaceC2195 = this.f4278;
        if (interfaceC2195 != null) {
            interfaceC2195.dispose();
        }
        this.f4278 = null;
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2736() {
    }
}
