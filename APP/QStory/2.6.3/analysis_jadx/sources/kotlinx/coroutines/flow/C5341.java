package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.AbstractC5219;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5341 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f14903;

    public C5341(Ref$ObjectRef ref$ObjectRef) {
        this.f14903 = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        Ref$ObjectRef ref$ObjectRef = this.f14903;
        T t = ref$ObjectRef.element;
        ?? r1 = AbstractC5219.f14807;
        if (t == r1) {
            ref$ObjectRef.element = obj;
            return C5176.f14739;
        }
        ref$ObjectRef.element = r1;
        throw new AbortFlowException(this);
    }
}
