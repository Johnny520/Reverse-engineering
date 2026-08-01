package androidx.lifecycle.compose;

import androidx.compose.runtime.C2171;
import androidx.compose.runtime.InterfaceC2223;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", m556f = "FlowExt.kt", m557l = {177}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"T", "Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5192 $context;
    final /* synthetic */ AbstractC3235 $lifecycle;
    final /* synthetic */ Lifecycle$State $minActiveState;
    final /* synthetic */ InterfaceC6151 $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", m556f = "FlowExt.kt", m557l = {179, 181}, m558m = "invokeSuspend", m559v = 1)
    public static final class C02301 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2223 $$this$produceState;
        final /* synthetic */ InterfaceC5192 $context;
        final /* synthetic */ InterfaceC6151 $this_collectAsStateWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
        @InterfaceC7691(m555c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", m556f = "FlowExt.kt", m557l = {182}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ InterfaceC2223 $$this$produceState;
            final /* synthetic */ InterfaceC6151 $this_collectAsStateWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC6151 interfaceC6151, InterfaceC2223 interfaceC2223, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
                super(2, interfaceC5189);
                this.$this_collectAsStateWithLifecycle = interfaceC6151;
                this.$$this$produceState = interfaceC2223;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6151 interfaceC6151 = this.$this_collectAsStateWithLifecycle;
                    C2171 c2171 = new C2171(this.$$this$produceState, 3);
                    this.label = 1;
                    if (interfaceC6151.mo9012(c2171, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02301(InterfaceC5192 interfaceC5192, InterfaceC6151 interfaceC6151, InterfaceC2223 interfaceC2223, InterfaceC5189<? super C02301> interfaceC5189) {
            super(2, interfaceC5189);
            this.$context = interfaceC5192;
            this.$this_collectAsStateWithLifecycle = interfaceC6151;
            this.$$this$produceState = interfaceC2223;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C02301(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C02301) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r7.mo9012(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (kotlinx.coroutines.AbstractC6231.m11029(r7, r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                if (AbstractC5227.m9466(this.$context, EmptyCoroutineContext.INSTANCE)) {
                    InterfaceC6151 interfaceC6151 = this.$this_collectAsStateWithLifecycle;
                    C2171 c2171 = new C2171(this.$$this$produceState, 2);
                    this.label = 1;
                } else {
                    InterfaceC5192 interfaceC5192 = this.$context;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, null);
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(AbstractC3235 abstractC3235, Lifecycle$State lifecycle$State, InterfaceC5192 interfaceC5192, InterfaceC6151 interfaceC6151, InterfaceC5189<? super FlowExtKt$collectAsStateWithLifecycle$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$lifecycle = abstractC3235;
        this.$minActiveState = lifecycle$State;
        this.$context = interfaceC5192;
        this.$this_collectAsStateWithLifecycle = interfaceC6151;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, interfaceC5189);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2223 interfaceC2223, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create(interfaceC2223, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC2223 interfaceC2223 = (InterfaceC2223) this.L$0;
            AbstractC3235 abstractC3235 = this.$lifecycle;
            Lifecycle$State lifecycle$State = this.$minActiveState;
            C02301 c02301 = new C02301(this.$context, this.$this_collectAsStateWithLifecycle, interfaceC2223, null);
            this.label = 1;
            if (AbstractC3268.m5094(abstractC3235, lifecycle$State, c02301, this) == coroutineSingletons) {
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
