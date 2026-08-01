package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.C6041;
import kotlinx.coroutines.channels.C6042;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"T", "Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;)Z"}, m152k = 3, m153mv = {2, 2, 0})
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m556f = "Delay.kt", m557l = {395}, m558m = "invokeSuspend", m559v = 1)
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6150 $downStream;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(InterfaceC6150 interfaceC6150, InterfaceC5189<? super FlowKt__DelayKt$timeoutInternal$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$downStream = interfaceC6150;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, interfaceC5189);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = ((C6034) obj).f15136;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m10847invokeWpGqRn0(((C6034) obj).f15136, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m10847invokeWpGqRn0(Object obj, InterfaceC5189<? super Boolean> interfaceC5189) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new C6034(obj), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6150 interfaceC6150 = this.$downStream;
            if (!(obj2 instanceof C6042)) {
                this.L$0 = null;
                this.L$1 = obj2;
                this.L$2 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (interfaceC6150.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            AbstractC6017.m10769(obj);
        }
        if (!(obj2 instanceof C6041)) {
            return Boolean.TRUE;
        }
        Throwable thM10832 = C6034.m10832(obj2);
        if (thM10832 == null) {
            return Boolean.FALSE;
        }
        throw thM10832;
    }
}
