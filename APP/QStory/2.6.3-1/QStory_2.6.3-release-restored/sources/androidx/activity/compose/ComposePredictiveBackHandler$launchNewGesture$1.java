package androidx.activity.compose;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", m556f = "PredictiveBackHandler.kt", m557l = {231}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ComposePredictiveBackHandler$launchNewGesture$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC0856 this$0;

    /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", m556f = "PredictiveBackHandler.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00001 extends SuspendLambda implements InterfaceC7380 {
        final /* synthetic */ Ref$BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00001(Ref$BooleanRef ref$BooleanRef, InterfaceC5189<? super C00001> interfaceC5189) {
            super(3, interfaceC5189);
            this.$completed = ref$BooleanRef;
        }

        @Override // p068.InterfaceC7380
        public final Object invoke(InterfaceC6150 interfaceC6150, Throwable th, InterfaceC5189<? super C6008> interfaceC5189) {
            return new C00001(this.$completed, interfaceC5189).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$completed.element = true;
            return C6008.f15084;
        }
    }

    public ComposePredictiveBackHandler$launchNewGesture$1(AbstractC0856 abstractC0856, InterfaceC5189<? super ComposePredictiveBackHandler$launchNewGesture$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ComposePredictiveBackHandler$launchNewGesture$1(null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ComposePredictiveBackHandler$launchNewGesture$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$0;
        AbstractC6017.m10769(obj);
        if (ref$BooleanRef.element) {
            return C6008.f15084;
        }
        C6755.m11870("You must collect the progress flow");
        return null;
    }
}
