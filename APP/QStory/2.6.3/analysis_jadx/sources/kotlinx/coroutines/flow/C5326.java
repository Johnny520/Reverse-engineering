package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5326 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f14896;

    public C5326(Ref$ObjectRef ref$ObjectRef) {
        this.f14896 = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        this.f14896.element = obj;
        throw new AbortFlowException(this);
    }
}
