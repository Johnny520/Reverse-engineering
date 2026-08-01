package kotlinx.coroutines.flow;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.AbstractC6051;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6173 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f15248;

    public C6173(Ref$ObjectRef ref$ObjectRef) {
        this.f15248 = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        Ref$ObjectRef ref$ObjectRef = this.f15248;
        T t = ref$ObjectRef.element;
        ?? r1 = AbstractC6051.f15152;
        if (t == r1) {
            ref$ObjectRef.element = obj;
            return C6008.f15084;
        }
        ref$ObjectRef.element = r1;
        throw new AbortFlowException(this);
    }
}
