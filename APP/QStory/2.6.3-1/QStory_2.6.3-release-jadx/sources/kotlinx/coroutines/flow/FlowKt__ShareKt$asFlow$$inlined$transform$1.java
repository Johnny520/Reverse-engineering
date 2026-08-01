package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ShareKt$asFlow$$inlined$transform$1", m556f = "Share.kt", m557l = {36}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"R", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, m152k = 3, m153mv = {2, 2, 0})
public final class FlowKt__ShareKt$asFlow$$inlined$transform$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6151 $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$asFlow$$inlined$transform$1(InterfaceC6151 interfaceC6151, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_transform = interfaceC6151;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowKt__ShareKt$asFlow$$inlined$transform$1 flowKt__ShareKt$asFlow$$inlined$transform$1 = new FlowKt__ShareKt$asFlow$$inlined$transform$1(this.$this_transform, interfaceC5189);
        flowKt__ShareKt$asFlow$$inlined$transform$1.L$0 = obj;
        return flowKt__ShareKt$asFlow$$inlined$transform$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__ShareKt$asFlow$$inlined$transform$1) create(interfaceC6150, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6151 interfaceC6151 = this.$this_transform;
            C6169 c6169 = new C6169(interfaceC6150);
            this.L$0 = null;
            this.label = 1;
            if (interfaceC6151.mo9012(c6169, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
