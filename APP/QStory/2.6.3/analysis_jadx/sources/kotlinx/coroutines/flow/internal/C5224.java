package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import p063.InterfaceC6863;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5224 implements InterfaceC4357, InterfaceC6863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4360 f14817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4357 f14818;

    public C5224(InterfaceC4357 interfaceC4357, InterfaceC4360 interfaceC4360) {
        this.f14818 = interfaceC4357;
        this.f14817 = interfaceC4360;
    }

    @Override // p063.InterfaceC6863
    public final InterfaceC6863 getCallerFrame() {
        return (InterfaceC6863) this.f14818;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f14817;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        this.f14818.resumeWith(obj);
    }
}
