package androidx.compose.animation.core;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$2$1", f = "Transition.kt", l = {2194}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TransitionKt$rememberTransition$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC0361 $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$2$1(AbstractC0361 abstractC0361, InterfaceC4357<? super TransitionKt$rememberTransition$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$transitionState = abstractC0361;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TransitionKt$rememberTransition$2$1(this.$transitionState, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TransitionKt$rememberTransition$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.$transitionState.getClass();
            throw new ClassCastException();
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0361 abstractC0361 = (AbstractC0361) this.L$1;
        InterfaceC5383 interfaceC5383 = (InterfaceC5383) this.L$0;
        AbstractC5185.m10210(obj);
        try {
            if (abstractC0361 != null) {
                throw new ClassCastException();
            }
            if (abstractC0361 == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (Throwable th) {
            ((C5380) interfaceC5383).m10432(null);
            throw th;
        }
    }
}
