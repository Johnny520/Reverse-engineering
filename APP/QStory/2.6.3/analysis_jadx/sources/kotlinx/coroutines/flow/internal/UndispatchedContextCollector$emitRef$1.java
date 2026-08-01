package kotlinx.coroutines.flow.internal;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {Opcodes.ADD_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5318 $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(InterfaceC5318 interfaceC5318, InterfaceC4357<? super UndispatchedContextCollector$emitRef$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$downstream = interfaceC5318;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, interfaceC4357);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5318 interfaceC5318 = this.$downstream;
            this.L$0 = null;
            this.label = 1;
            if (interfaceC5318.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
