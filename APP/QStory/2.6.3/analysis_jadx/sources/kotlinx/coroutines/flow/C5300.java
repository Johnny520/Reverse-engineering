package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbstractC5219;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5300 implements InterfaceC5319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6558 f14881;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6554 f14882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5319 f14883;

    public C5300(InterfaceC5319 interfaceC5319, InterfaceC6558 interfaceC6558, InterfaceC6554 interfaceC6554) {
        this.f14883 = interfaceC5319;
        this.f14881 = interfaceC6558;
        this.f14882 = interfaceC6554;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8453(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = AbstractC5219.f14807;
        Object objMo8453 = this.f14883.mo8453(new C5301(this, ref$ObjectRef, interfaceC5318), interfaceC4357);
        return objMo8453 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8453 : C5176.f14739;
    }
}
