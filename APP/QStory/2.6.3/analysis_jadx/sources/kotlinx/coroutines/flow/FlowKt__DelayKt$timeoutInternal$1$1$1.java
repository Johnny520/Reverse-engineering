package kotlinx.coroutines.flow;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C5202;
import kotlinx.coroutines.channels.C5209;
import kotlinx.coroutines.channels.C5210;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;)Z"}, k = 3, mv = {2, 2, 0})
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5318 $downStream;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(InterfaceC5318 interfaceC5318, InterfaceC4357<? super FlowKt__DelayKt$timeoutInternal$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$downStream = interfaceC5318;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, interfaceC4357);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = ((C5202) obj).f14791;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m10288invokeWpGqRn0(((C5202) obj).f14791, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m10288invokeWpGqRn0(Object obj, InterfaceC4357<? super Boolean> interfaceC4357) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new C5202(obj), interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5318 interfaceC5318 = this.$downStream;
            if (!(obj2 instanceof C5210)) {
                this.L$0 = null;
                this.L$1 = obj2;
                this.L$2 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (interfaceC5318.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            AbstractC5185.m10210(obj);
        }
        if (!(obj2 instanceof C5209)) {
            return Boolean.TRUE;
        }
        Throwable thM10273 = C5202.m10273(obj2);
        if (thM10273 == null) {
            return Boolean.FALSE;
        }
        throw thM10273;
    }
}
