package androidx.compose.animation.core;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", m556f = "Transition.kt", m557l = {496}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 1, 0})
final class SeekableTransitionState$seekTo$3 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ float $fraction;
    final /* synthetic */ Object $oldTargetState;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ C1210 $transition;
    int label;
    final /* synthetic */ AbstractC1147 this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", m556f = "Transition.kt", m557l = {518}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00221 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ float $fraction;
        final /* synthetic */ Object $oldTargetState;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ C1210 $transition;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1147 this$0;

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", m556f = "Transition.kt", m557l = {514}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            int label;
            final /* synthetic */ AbstractC1147 this$0;

            public AnonymousClass1(AbstractC1147 abstractC1147, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(null, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00221(Object obj, Object obj2, AbstractC1147 abstractC1147, C1210 c1210, float f, InterfaceC5189<? super C00221> interfaceC5189) {
            super(2, interfaceC5189);
            this.$targetState = obj;
            this.$oldTargetState = obj2;
            this.$transition = c1210;
            this.$fraction = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00221 c00221 = new C00221(this.$targetState, this.$oldTargetState, null, this.$transition, this.$fraction, interfaceC5189);
            c00221.L$0 = obj;
            return c00221;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00221) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6017.m10769(obj);
                throw null;
            }
            AbstractC6017.m10769(obj);
            if (AbstractC5227.m9466(this.$targetState, this.$oldTargetState)) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$seekTo$3(Object obj, Object obj2, AbstractC1147 abstractC1147, C1210 c1210, float f, InterfaceC5189<? super SeekableTransitionState$seekTo$3> interfaceC5189) {
        super(1, interfaceC5189);
        this.$targetState = obj;
        this.$oldTargetState = obj2;
        this.$transition = c1210;
        this.$fraction = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new SeekableTransitionState$seekTo$3(this.$targetState, this.$oldTargetState, null, this.$transition, this.$fraction, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SeekableTransitionState$seekTo$3) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C00221 c00221 = new C00221(this.$targetState, this.$oldTargetState, null, this.$transition, this.$fraction, null);
            this.label = 1;
            if (AbstractC6231.m11066(c00221, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
