package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5325 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f14896;

    public C5325(Ref$ObjectRef ref$ObjectRef) {
        this.f14896 = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        this.f14896.element = obj;
        throw new AbortFlowException(this);
    }
}
