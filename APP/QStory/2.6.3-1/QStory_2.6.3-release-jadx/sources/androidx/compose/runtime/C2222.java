package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC5192;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2222 implements InterfaceC2223, InterfaceC2230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f4375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f4376;

    public C2222(InterfaceC2230 interfaceC2230, InterfaceC5192 interfaceC5192) {
        this.f4376 = interfaceC2230;
        this.f4375 = interfaceC5192;
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        return this.f4376.getValue();
    }

    @Override // androidx.compose.runtime.InterfaceC2230
    public final void setValue(Object obj) {
        this.f4376.setValue(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f4375;
    }
}
