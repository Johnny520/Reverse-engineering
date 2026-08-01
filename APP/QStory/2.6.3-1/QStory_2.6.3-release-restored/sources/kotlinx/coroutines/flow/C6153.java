package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6153 implements InterfaceC6151 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;
        if (interfaceC5189 instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) {
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = (FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) interfaceC5189;
            int i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1(this, interfaceC5189);
            }
        }
        Object obj = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$1;
        int i4 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$0;
        Iterator it = (Iterator) flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$4;
        InterfaceC6150 interfaceC61502 = (InterfaceC6150) flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$2;
        AbstractC6017.m10769(obj);
        while (it.hasNext()) {
            Object next = it.next();
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$0 = null;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$1 = null;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$2 = interfaceC61502;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$3 = null;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$4 = it;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$5 = null;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$6 = null;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$0 = i4;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$1 = i3;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$2 = 0;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label = 1;
            if (interfaceC61502.emit(next, flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }
}
