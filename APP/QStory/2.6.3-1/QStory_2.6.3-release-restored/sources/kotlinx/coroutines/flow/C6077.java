package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6077 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f15189;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$IntRef f15190;

    public C6077(Ref$IntRef ref$IntRef, InterfaceC6150 interfaceC6150) {
        this.f15190 = ref$IntRef;
        this.f15189 = interfaceC6150;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        if (interfaceC5189 instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) interfaceC5189;
            int i = flowKt__LimitKt$drop$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$drop$2$1$emit$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC6017.m10769(obj2);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj2);
        Ref$IntRef ref$IntRef = this.f15190;
        int i3 = ref$IntRef.element;
        if (i3 < 1) {
            ref$IntRef.element = i3 + 1;
            return c6008;
        }
        flowKt__LimitKt$drop$2$1$emit$1.L$0 = null;
        flowKt__LimitKt$drop$2$1$emit$1.label = 1;
        return this.f15189.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
