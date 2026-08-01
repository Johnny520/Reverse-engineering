package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6082 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6028 f15191;

    public C6082(InterfaceC6028 interfaceC6028) {
        this.f15191 = interfaceC6028;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        FlowKt__DelayKt$sample$2$values$1$1$emit$1 flowKt__DelayKt$sample$2$values$1$1$emit$1;
        if (interfaceC5189 instanceof FlowKt__DelayKt$sample$2$values$1$1$emit$1) {
            flowKt__DelayKt$sample$2$values$1$1$emit$1 = (FlowKt__DelayKt$sample$2$values$1$1$emit$1) interfaceC5189;
            int i = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__DelayKt$sample$2$values$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__DelayKt$sample$2$values$1$1$emit$1 = new FlowKt__DelayKt$sample$2$values$1$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = flowKt__DelayKt$sample$2$values$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            if (obj == null) {
                obj = AbstractC6051.f15152;
            }
            flowKt__DelayKt$sample$2$values$1$1$emit$1.L$0 = null;
            flowKt__DelayKt$sample$2$values$1$1$emit$1.label = 1;
            if (((AbstractC6043) this.f15191).f15143.mo8992(obj, flowKt__DelayKt$sample$2$values$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj2);
        }
        return C6008.f15084;
    }
}
