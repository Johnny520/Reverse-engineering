package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.flow.InterfaceC6150;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6067 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6028 f15180;

    public C6067(InterfaceC6028 interfaceC6028) {
        this.f15180 = interfaceC6028;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
        if (interfaceC5189 instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
            combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) interfaceC5189;
            int i = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                combineKt$zipImpl$1$1$second$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            C6036 c6036 = (C6036) this.f15180;
            c6036.getClass();
            if (obj == null) {
                obj = AbstractC6051.f15152;
            }
            combineKt$zipImpl$1$1$second$1$1$emit$1.L$0 = null;
            combineKt$zipImpl$1$1$second$1$1$emit$1.label = 1;
            if (c6036.f15143.mo8992(obj, combineKt$zipImpl$1$1$second$1$1$emit$1) == coroutineSingletons) {
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
