package kotlinx.coroutines.flow;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6132 implements InterfaceC6151 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7387 f15226;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7383 f15227;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6151 f15228;

    public C6132(InterfaceC6151 interfaceC6151, InterfaceC7387 interfaceC7387, InterfaceC7383 interfaceC7383) {
        this.f15228 = interfaceC6151;
        this.f15226 = interfaceC7387;
        this.f15227 = interfaceC7383;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = AbstractC6051.f15152;
        Object objMo9012 = this.f15228.mo9012(new C6133(this, ref$ObjectRef, interfaceC6150), interfaceC5189);
        return objMo9012 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9012 : C6008.f15084;
    }
}
