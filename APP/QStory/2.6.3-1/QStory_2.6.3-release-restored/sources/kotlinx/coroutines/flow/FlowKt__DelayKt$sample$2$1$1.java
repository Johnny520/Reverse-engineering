package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.C6042;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "", "result", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;)V"}, m152k = 3, m153mv = {2, 2, 0})
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m556f = "Delay.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ InterfaceC6031 $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC6031 interfaceC6031, InterfaceC5189<? super FlowKt__DelayKt$sample$2$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = interfaceC6031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, interfaceC5189);
        flowKt__DelayKt$sample$2$1$1.L$0 = ((C6034) obj).f15136;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m10846invokeWpGqRn0(((C6034) obj).f15136, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m10846invokeWpGqRn0(Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(new C6034(obj), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r0 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z = r0 instanceof C6042;
        if (!z) {
            ref$ObjectRef.element = r0;
        }
        InterfaceC6031 interfaceC6031 = this.$ticker;
        if (z) {
            Throwable thM10832 = C6034.m10832(r0);
            if (thM10832 != null) {
                throw thM10832;
            }
            interfaceC6031.mo10815(new ChildCancelledException());
            ref$ObjectRef.element = AbstractC6051.f15150;
        }
        return C6008.f15084;
    }
}
