package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6072 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f15184;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f15185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$BooleanRef f15186;

    public C6072(Ref$BooleanRef ref$BooleanRef, InterfaceC6150 interfaceC6150, InterfaceC7383 interfaceC7383) {
        this.f15186 = ref$BooleanRef;
        this.f15184 = interfaceC6150;
        this.f15185 = interfaceC7383;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        if (interfaceC5189 instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) interfaceC5189;
            int i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, interfaceC5189);
            }
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        InterfaceC6150 interfaceC6150 = this.f15184;
        Ref$BooleanRef ref$BooleanRef = this.f15186;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(objInvoke);
            if (ref$BooleanRef.element) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                if (interfaceC6150.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons) {
                    return c6008;
                }
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = obj;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
                objInvoke = this.f15185.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                if (objInvoke != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC6017.m10769(objInvoke);
            return c6008;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                AbstractC6017.m10769(objInvoke);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj = flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
        AbstractC6017.m10769(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            ref$BooleanRef.element = true;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
            if (interfaceC6150.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
