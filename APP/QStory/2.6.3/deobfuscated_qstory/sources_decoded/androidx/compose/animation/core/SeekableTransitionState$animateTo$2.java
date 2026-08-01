package androidx.compose.animation.core;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {607}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC0311 $animationSpec;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ C0364 $transition;
    int label;
    final /* synthetic */ AbstractC0301 this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2194, 620, 622, 676, 678}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC0311 $animationSpec;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ C0364 $transition;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractC0301 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC0301 abstractC0301, Object obj, C0364 c0364, InterfaceC0311 interfaceC0311, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$targetState = obj;
            this.$transition = c0364;
            this.$animationSpec = interfaceC0311;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(null, this.$targetState, this.$transition, this.$animationSpec, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                throw null;
            }
            if (i == 1) {
                if (this.L$1 != null) {
                    throw new ClassCastException();
                }
                InterfaceC5383 interfaceC5383 = (InterfaceC5383) this.L$0;
                AbstractC5185.m10210(obj);
                try {
                    throw null;
                } catch (Throwable th) {
                    ((C5380) interfaceC5383).m10432(null);
                    throw th;
                }
            }
            if (i == 2) {
                AbstractC5185.m10210(obj);
                this.label = 3;
                throw null;
            }
            if (i == 3) {
                AbstractC5185.m10210(obj);
                throw null;
            }
            if (i == 4) {
                AbstractC5185.m10210(obj);
                throw null;
            }
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5185.m10210(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(C0364 c0364, AbstractC0301 abstractC0301, Object obj, InterfaceC0311 interfaceC0311, InterfaceC4357<? super SeekableTransitionState$animateTo$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.$transition = c0364;
        this.$targetState = obj;
        this.$animationSpec = interfaceC0311;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new SeekableTransitionState$animateTo$2(this.$transition, null, this.$targetState, this.$animationSpec, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SeekableTransitionState$animateTo$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$targetState, this.$transition, this.$animationSpec, null);
            this.label = 1;
            if (AbstractC5399.m10507(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        this.$transition.m1072();
        return C5176.f14739;
    }
}
