package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import kotlinx.coroutines.selects.C6201;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m556f = "Delay.kt", m557l = {412}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "downstream", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ InterfaceC6151 $this_sample;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, InterfaceC6151 interfaceC6151, InterfaceC5189<? super FlowKt__DelayKt$sample$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.$periodMillis = j;
        this.$this_sample = interfaceC6151;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, interfaceC5189);
        flowKt__DelayKt$sample$2.L$0 = interfaceC6233;
        flowKt__DelayKt$sample$2.L$1 = interfaceC6150;
        return flowKt__DelayKt$sample$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC6031 interfaceC6031M10836;
        InterfaceC6031 interfaceC6031;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6036 c6036M10836 = AbstractC6037.m10836(interfaceC6233, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1);
            ref$ObjectRef = new Ref$ObjectRef();
            interfaceC6031M10836 = AbstractC6037.m10836(interfaceC6233, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(this.$periodMillis, null), 1);
            interfaceC6031 = c6036M10836;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6031M10836 = (InterfaceC6031) this.L$4;
            ref$ObjectRef = (Ref$ObjectRef) this.L$3;
            interfaceC6031 = (InterfaceC6031) this.L$2;
            AbstractC6017.m10769(obj);
        }
        while (ref$ObjectRef.element != AbstractC6051.f15150) {
            C6201 c6201 = new C6201(getContext());
            c6201.m10980(interfaceC6031.mo10809(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, interfaceC6031M10836, null));
            c6201.m10980(interfaceC6031M10836.mo10819(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, interfaceC6150, null));
            this.L$0 = null;
            this.L$1 = interfaceC6150;
            this.L$2 = interfaceC6031;
            this.L$3 = ref$ObjectRef;
            this.L$4 = interfaceC6031M10836;
            this.L$5 = null;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            if (c6201.m10978(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }
}
