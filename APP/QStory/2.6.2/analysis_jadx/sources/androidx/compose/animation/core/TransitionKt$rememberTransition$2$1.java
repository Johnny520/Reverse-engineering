package androidx.compose.animation.core;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$2$1", f = "Transition.kt", l = {2194}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TransitionKt$rememberTransition$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC0361 $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$2$1(AbstractC0361 abstractC0361, InterfaceC4356<? super TransitionKt$rememberTransition$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$transitionState = abstractC0361;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TransitionKt$rememberTransition$2$1(this.$transitionState, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TransitionKt$rememberTransition$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.$transitionState.getClass();
            throw new ClassCastException();
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0361 abstractC0361 = (AbstractC0361) this.L$1;
        InterfaceC5382 interfaceC5382 = (InterfaceC5382) this.L$0;
        AbstractC5184.m10206(obj);
        try {
            if (abstractC0361 != null) {
                throw new ClassCastException();
            }
            if (abstractC0361 == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (Throwable th) {
            ((C5379) interfaceC5382).m10428(null);
            throw th;
        }
    }
}
