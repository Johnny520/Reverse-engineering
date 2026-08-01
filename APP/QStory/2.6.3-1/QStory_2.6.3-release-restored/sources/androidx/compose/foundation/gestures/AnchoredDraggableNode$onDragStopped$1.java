package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", m556f = "AnchoredDraggable.kt", m557l = {438, 440}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1311 $event;
    int label;
    final /* synthetic */ AbstractC1360 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "availableVelocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", m556f = "AnchoredDraggable.kt", m557l = {442}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00331 extends SuspendLambda implements InterfaceC7383 {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AbstractC1360 this$0;

        public C00331(AbstractC1360 abstractC1360, InterfaceC5189<? super C00331> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00331 c00331 = new C00331(null, interfaceC5189);
            c00331.J$0 = ((C8731) obj).f22216;
            return c00331;
        }

        @Override // p068.InterfaceC7383
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m1744invokesFctU(((C8731) obj).f22216, (InterfaceC5189) obj2);
        }

        /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m1744invokesFctU(long j, InterfaceC5189<? super C8731> interfaceC5189) {
            return ((C00331) create(new C8731(j), interfaceC5189)).invokeSuspend(C6008.f15084);
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            ((Number) obj).floatValue();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AbstractC1360 abstractC1360, C1311 c1311, InterfaceC5189<? super AnchoredDraggableNode$onDragStopped$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$event = c1311;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new AnchoredDraggableNode$onDragStopped$1(null, this.$event, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            long j = this.$event.f1777;
            throw null;
        }
        if (i == 1 || i == 2) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
