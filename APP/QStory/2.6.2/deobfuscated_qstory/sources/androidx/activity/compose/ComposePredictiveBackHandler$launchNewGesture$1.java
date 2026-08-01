package androidx.activity.compose;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", l = {231}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class ComposePredictiveBackHandler$launchNewGesture$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC0009 this$0;

    /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6550 {
        final /* synthetic */ Ref$BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(3, interfaceC4356);
            this.$completed = ref$BooleanRef;
        }

        @Override // p052.InterfaceC6550
        public final Object invoke(InterfaceC5317 interfaceC5317, Throwable th, InterfaceC4356<? super C5175> interfaceC4356) {
            return new AnonymousClass1(this.$completed, interfaceC4356).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$completed.element = true;
            return C5175.f14739;
        }
    }

    public ComposePredictiveBackHandler$launchNewGesture$1(AbstractC0009 abstractC0009, InterfaceC4356<? super ComposePredictiveBackHandler$launchNewGesture$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ComposePredictiveBackHandler$launchNewGesture$1(null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ComposePredictiveBackHandler$launchNewGesture$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$0;
        AbstractC5184.m10206(obj);
        if (ref$BooleanRef.element) {
            return C5175.f14739;
        }
        C5919.m11250("You must collect the progress flow");
        return null;
    }
}
