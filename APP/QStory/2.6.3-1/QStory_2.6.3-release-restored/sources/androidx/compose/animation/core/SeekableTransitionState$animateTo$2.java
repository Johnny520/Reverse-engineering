package androidx.compose.animation.core;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", m556f = "Transition.kt", m557l = {607}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 1, 0})
final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC1157 $animationSpec;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ C1210 $transition;
    int label;
    final /* synthetic */ AbstractC1147 this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", m556f = "Transition.kt", m557l = {2194, 620, 622, 676, 678}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00211 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1157 $animationSpec;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ C1210 $transition;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractC1147 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00211(AbstractC1147 abstractC1147, Object obj, C1210 c1210, InterfaceC1157 interfaceC1157, InterfaceC5189<? super C00211> interfaceC5189) {
            super(2, interfaceC5189);
            this.$targetState = obj;
            this.$transition = c1210;
            this.$animationSpec = interfaceC1157;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00211(null, this.$targetState, this.$transition, this.$animationSpec, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00211) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i == 1) {
                if (this.L$1 != null) {
                    throw new ClassCastException();
                }
                InterfaceC6215 interfaceC6215 = (InterfaceC6215) this.L$0;
                AbstractC6017.m10769(obj);
                try {
                    throw null;
                } catch (Throwable th) {
                    ((C6212) interfaceC6215).m10991(null);
                    throw th;
                }
            }
            if (i == 2) {
                AbstractC6017.m10769(obj);
                this.label = 3;
                throw null;
            }
            if (i == 3) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i == 4) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(C1210 c1210, AbstractC1147 abstractC1147, Object obj, InterfaceC1157 interfaceC1157, InterfaceC5189<? super SeekableTransitionState$animateTo$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.$transition = c1210;
        this.$targetState = obj;
        this.$animationSpec = interfaceC1157;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new SeekableTransitionState$animateTo$2(this.$transition, null, this.$targetState, this.$animationSpec, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SeekableTransitionState$animateTo$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C00211 c00211 = new C00211(null, this.$targetState, this.$transition, this.$animationSpec, null);
            this.label = 1;
            if (AbstractC6231.m11066(c00211, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        this.$transition.m1632();
        return C6008.f15084;
    }
}
