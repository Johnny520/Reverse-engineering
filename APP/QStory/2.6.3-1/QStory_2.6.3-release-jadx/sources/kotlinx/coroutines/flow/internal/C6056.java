package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import p079.InterfaceC7692;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6056 implements InterfaceC5189, InterfaceC7692 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f15162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5189 f15163;

    public C6056(InterfaceC5189 interfaceC5189, InterfaceC5192 interfaceC5192) {
        this.f15163 = interfaceC5189;
        this.f15162 = interfaceC5192;
    }

    @Override // p079.InterfaceC7692
    public final InterfaceC7692 getCallerFrame() {
        return (InterfaceC7692) this.f15163;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return this.f15162;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        this.f15163.resumeWith(obj);
    }
}
