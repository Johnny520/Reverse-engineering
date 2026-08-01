package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.flow.internal.AbstractC6049;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6136 extends C6134 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7383 f15233;

    public C6136(InterfaceC7383 interfaceC7383, InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        super(interfaceC7383, interfaceC5192, i, bufferOverflow);
        this.f15233 = interfaceC7383;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.C6134, kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo10849(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        Object obj;
        if (interfaceC5189 instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) interfaceC5189;
            int i = callbackFlowBuilder$collectTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.label = i - Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, interfaceC5189);
            }
        }
        Object obj2 = callbackFlowBuilder$collectTo$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = callbackFlowBuilder$collectTo$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            callbackFlowBuilder$collectTo$1.L$0 = interfaceC6028;
            callbackFlowBuilder$collectTo$1.label = 1;
            Object objMo10849 = super.mo10849(interfaceC6028, callbackFlowBuilder$collectTo$1);
            obj = interfaceC6028;
            if (objMo10849 == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC6028 interfaceC60282 = (InterfaceC6028) callbackFlowBuilder$collectTo$1.L$0;
            AbstractC6017.m10769(obj2);
            obj = interfaceC60282;
        }
        if (((AbstractC6043) obj).f15143.m10800()) {
            return C6008.f15084;
        }
        C6755.m11870("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // kotlinx.coroutines.flow.C6134, kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC6049 mo10853(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        return new C6136(this.f15233, interfaceC5192, i, bufferOverflow);
    }
}
