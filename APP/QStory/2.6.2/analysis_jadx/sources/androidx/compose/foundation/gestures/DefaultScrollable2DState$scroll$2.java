package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2", f = "Scrollable2DState.kt", l = {146}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class DefaultScrollable2DState$scroll$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    final /* synthetic */ MutatePriority $scrollPriority;
    int label;
    final /* synthetic */ AbstractC0527 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2$1", f = "Scrollable2DState.kt", l = {149}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6553 $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC0527 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC0527 abstractC0527, InterfaceC6553 interfaceC6553, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$block = interfaceC6553;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$block, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC0549 interfaceC0549, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC0549, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        
            throw null;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r0 = r2.label
                r1 = 0
                if (r0 == 0) goto L17
                r2 = 1
                if (r0 == r2) goto L12
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r3)
                throw r2
            L12:
                kotlin.AbstractC5184.m10206(r3)     // Catch: java.lang.Throwable -> L16
                throw r1
            L16:
                throw r1
            L17:
                kotlin.AbstractC5184.m10206(r3)
                java.lang.Object r2 = r2.L$0
                androidx.compose.foundation.gestures.飘花落叶言子苏兰世楪哲 r2 = (androidx.compose.foundation.gestures.InterfaceC0549) r2
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScrollable2DState$scroll$2(AbstractC0527 abstractC0527, MutatePriority mutatePriority, InterfaceC6553 interfaceC6553, InterfaceC4356<? super DefaultScrollable2DState$scroll$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$scrollPriority = mutatePriority;
        this.$block = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new DefaultScrollable2DState$scroll$2(null, this.$scrollPriority, this.$block, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultScrollable2DState$scroll$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
