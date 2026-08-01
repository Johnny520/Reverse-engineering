package androidx.lifecycle.compose;

import androidx.compose.runtime.C1336;
import androidx.compose.runtime.InterfaceC1388;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;)V"}, k = 3, mv = {2, 0, 0})
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4360 $context;
    final /* synthetic */ AbstractC2402 $lifecycle;
    final /* synthetic */ Lifecycle$State $minActiveState;
    final /* synthetic */ InterfaceC5319 $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1388 $$this$produceState;
        final /* synthetic */ InterfaceC4360 $context;
        final /* synthetic */ InterfaceC5319 $this_collectAsStateWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
        @InterfaceC6862(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ InterfaceC1388 $$this$produceState;
            final /* synthetic */ InterfaceC5319 $this_collectAsStateWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC5319 interfaceC5319, InterfaceC1388 interfaceC1388, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
                super(2, interfaceC4357);
                this.$this_collectAsStateWithLifecycle = interfaceC5319;
                this.$$this$produceState = interfaceC1388;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    InterfaceC5319 interfaceC5319 = this.$this_collectAsStateWithLifecycle;
                    C1336 c1336 = new C1336(this.$$this$produceState, 3);
                    this.label = 1;
                    if (interfaceC5319.mo8453(c1336, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC4360 interfaceC4360, InterfaceC5319 interfaceC5319, InterfaceC1388 interfaceC1388, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$context = interfaceC4360;
            this.$this_collectAsStateWithLifecycle = interfaceC5319;
            this.$$this$produceState = interfaceC1388;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r7.mo8453(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (kotlinx.coroutines.AbstractC5399.m10470(r7, r1, r6) == r0) goto L17;
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
                top.suzhelan.qstory.hook.item.C5925.m11311(r6)
                return r2
            L14:
                kotlin.AbstractC5185.m10210(r7)
                goto L4b
            L18:
                kotlin.AbstractC5185.m10210(r7)
                kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = r6.$context
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                boolean r7 = kotlin.jvm.internal.AbstractC4395.m8907(r7, r1)
                if (r7 == 0) goto L37
                kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r7 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.飘花落叶言子哲兰楪苏世 r1 = new androidx.compose.runtime.飘花落叶言子哲兰楪苏世
                androidx.compose.runtime.飘花落叶言子苏哲世楪兰 r2 = r6.$$this$produceState
                r1.<init>(r2, r3)
                r6.label = r4
                java.lang.Object r6 = r7.mo8453(r1, r6)
                if (r6 != r0) goto L4b
                goto L4a
            L37:
                kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = r6.$context
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r4 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.飘花落叶言子苏哲世楪兰 r5 = r6.$$this$produceState
                r1.<init>(r4, r5, r2)
                r6.label = r3
                java.lang.Object r6 = kotlinx.coroutines.AbstractC5399.m10470(r7, r1, r6)
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC4360 interfaceC4360, InterfaceC5319 interfaceC5319, InterfaceC4357<? super FlowExtKt$collectAsStateWithLifecycle$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$lifecycle = abstractC2402;
        this.$minActiveState = lifecycle$State;
        this.$context = interfaceC4360;
        this.$this_collectAsStateWithLifecycle = interfaceC5319;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, interfaceC4357);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1388 interfaceC1388, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create(interfaceC1388, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC1388 interfaceC1388 = (InterfaceC1388) this.L$0;
            AbstractC2402 abstractC2402 = this.$lifecycle;
            Lifecycle$State lifecycle$State = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, interfaceC1388, null);
            this.label = 1;
            if (AbstractC2435.m4534(abstractC2402, lifecycle$State, anonymousClass1, this) == coroutineSingletons) {
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
