package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import p063.InterfaceC6862;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5223 implements InterfaceC4356, InterfaceC6862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4359 f14817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4356 f14818;

    public C5223(InterfaceC4356 interfaceC4356, InterfaceC4359 interfaceC4359) {
        this.f14818 = interfaceC4356;
        this.f14817 = interfaceC4359;
    }

    @Override // p063.InterfaceC6862
    public final InterfaceC6862 getCallerFrame() {
        return (InterfaceC6862) this.f14818;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f14817;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        this.f14818.resumeWith(obj);
    }
}
