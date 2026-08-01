package androidx.lifecycle.compose;

import androidx.compose.runtime.C1336;
import androidx.compose.runtime.InterfaceC1388;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;)V"}, k = 3, mv = {2, 0, 0})
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4359 $context;
    final /* synthetic */ AbstractC2402 $lifecycle;
    final /* synthetic */ Lifecycle$State $minActiveState;
    final /* synthetic */ InterfaceC5318 $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC1388 $$this$produceState;
        final /* synthetic */ InterfaceC4359 $context;
        final /* synthetic */ InterfaceC5318 $this_collectAsStateWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
        @InterfaceC6861(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ InterfaceC1388 $$this$produceState;
            final /* synthetic */ InterfaceC5318 $this_collectAsStateWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC5318 interfaceC5318, InterfaceC1388 interfaceC1388, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
                super(2, interfaceC4356);
                this.$this_collectAsStateWithLifecycle = interfaceC5318;
                this.$$this$produceState = interfaceC1388;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5318 interfaceC5318 = this.$this_collectAsStateWithLifecycle;
                    C1336 c1336 = new C1336(this.$$this$produceState, 3);
                    this.label = 1;
                    if (interfaceC5318.mo8463(c1336, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                return C5175.f14739;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC4359 interfaceC4359, InterfaceC5318 interfaceC5318, InterfaceC1388 interfaceC1388, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$context = interfaceC4359;
            this.$this_collectAsStateWithLifecycle = interfaceC5318;
            this.$$this$produceState = interfaceC1388;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r7.mo8463(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (kotlinx.coroutines.AbstractC5398.m10466(r7, r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L18
                if (r1 == r4) goto L14
                if (r1 != r3) goto Le
                goto L14
            Le:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5919.m11250(r6)
                return r2
            L14:
                kotlin.AbstractC5184.m10206(r7)
                goto L4b
            L18:
                kotlin.AbstractC5184.m10206(r7)
                kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = r6.$context
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                boolean r7 = kotlin.jvm.internal.AbstractC4394.m8917(r7, r1)
                if (r7 == 0) goto L37
                kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r7 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.飘花落叶言子哲兰楪苏世 r1 = new androidx.compose.runtime.飘花落叶言子哲兰楪苏世
                androidx.compose.runtime.飘花落叶言子苏哲世楪兰 r2 = r6.$$this$produceState
                r1.<init>(r2, r3)
                r6.label = r4
                java.lang.Object r6 = r7.mo8463(r1, r6)
                if (r6 != r0) goto L4b
                goto L4a
            L37:
                kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = r6.$context
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r4 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.飘花落叶言子苏哲世楪兰 r5 = r6.$$this$produceState
                r1.<init>(r4, r5, r2)
                r6.label = r3
                java.lang.Object r6 = kotlinx.coroutines.AbstractC5398.m10466(r7, r1, r6)
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC4359 interfaceC4359, InterfaceC5318 interfaceC5318, InterfaceC4356<? super FlowExtKt$collectAsStateWithLifecycle$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$lifecycle = abstractC2402;
        this.$minActiveState = lifecycle$State;
        this.$context = interfaceC4359;
        this.$this_collectAsStateWithLifecycle = interfaceC5318;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, interfaceC4356);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1388 interfaceC1388, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create(interfaceC1388, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC1388 interfaceC1388 = (InterfaceC1388) this.L$0;
            AbstractC2402 abstractC2402 = this.$lifecycle;
            Lifecycle$State lifecycle$State = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, interfaceC1388, null);
            this.label = 1;
            if (AbstractC2435.m4524(abstractC2402, lifecycle$State, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
