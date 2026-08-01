package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6157 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f15239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f15240;

    public C6157(InterfaceC7383 interfaceC7383, Ref$ObjectRef ref$ObjectRef) {
        this.f15240 = interfaceC7383;
        this.f15239 = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1;
        T t;
        if (interfaceC5189 instanceof FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1) {
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1) interfaceC5189;
            int i = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1(this, interfaceC5189);
            }
        }
        Object objInvoke = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objInvoke);
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.L$0 = null;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.L$1 = null;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.L$2 = obj;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.I$0 = 0;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label = 1;
            objInvoke = this.f15240.invoke(obj, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1);
            t = obj;
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.L$2;
            AbstractC6017.m10769(objInvoke);
            t = obj2;
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return C6008.f15084;
        }
        this.f15239.element = t;
        throw new AbortFlowException(this);
    }
}
