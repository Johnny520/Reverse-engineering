package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C5201;
import kotlinx.coroutines.channels.C5208;
import kotlinx.coroutines.channels.C5209;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;)Z"}, k = 3, mv = {2, 2, 0})
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5317 $downStream;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(InterfaceC5317 interfaceC5317, InterfaceC4356<? super FlowKt__DelayKt$timeoutInternal$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$downStream = interfaceC5317;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, interfaceC4356);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = ((C5201) obj).f14791;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m10284invokeWpGqRn0(((C5201) obj).f14791, (InterfaceC4356) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m10284invokeWpGqRn0(Object obj, InterfaceC4356<? super Boolean> interfaceC4356) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new C5201(obj), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5317 interfaceC5317 = this.$downStream;
            if (!(obj2 instanceof C5209)) {
                this.L$0 = null;
                this.L$1 = obj2;
                this.L$2 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (interfaceC5317.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            AbstractC5184.m10206(obj);
        }
        if (!(obj2 instanceof C5208)) {
            return Boolean.TRUE;
        }
        Throwable thM10269 = C5201.m10269(obj2);
        if (thM10269 == null) {
            return Boolean.FALSE;
        }
        throw thM10269;
    }
}
