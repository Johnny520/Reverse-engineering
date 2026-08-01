package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6158 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f15241;

    public C6158(Ref$ObjectRef ref$ObjectRef) {
        this.f15241 = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        this.f15241.element = obj;
        throw new AbortFlowException(this);
    }
}
