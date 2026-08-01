package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.InterfaceC6150;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6064 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f15170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6233 f15171;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6068 f15172;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f15173;

    public C6064(Ref$ObjectRef ref$ObjectRef, InterfaceC6233 interfaceC6233, C6068 c6068, InterfaceC6150 interfaceC6150) {
        this.f15173 = ref$ObjectRef;
        this.f15171 = interfaceC6233;
        this.f15172 = c6068;
        this.f15170 = interfaceC6150;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, kotlinx.coroutines.飘花落叶言子哲楪世兰苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
        if (interfaceC5189 instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) interfaceC5189;
            int i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef = this.f15173;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            InterfaceC6284 interfaceC6284 = (InterfaceC6284) ref$ObjectRef.element;
            if (interfaceC6284 != null) {
                interfaceC6284.mo10815(new ChildCancelledException());
                channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = obj;
                channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = interfaceC6284;
                channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = null;
                channelFlowTransformLatest$flowCollect$3$1$emit$1.I$0 = 0;
                channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                if (interfaceC6284.mo11123(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
            AbstractC6017.m10769(obj2);
        }
        ref$ObjectRef.element = AbstractC6231.m11036(this.f15171, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3$1$2(this.f15172, this.f15170, obj, null), 1);
        return C6008.f15084;
    }
}
