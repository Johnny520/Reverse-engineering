package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.AbstractC5218;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5340 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f14903;

    public C5340(Ref$ObjectRef ref$ObjectRef) {
        this.f14903 = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        Ref$ObjectRef ref$ObjectRef = this.f14903;
        T t = ref$ObjectRef.element;
        ?? r1 = AbstractC5218.f14807;
        if (t == r1) {
            ref$ObjectRef.element = obj;
            return C5175.f14739;
        }
        ref$ObjectRef.element = r1;
        throw new AbortFlowException(this);
    }
}
