package androidx.compose.foundation.gestures;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p205.C7902;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {438, 440}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0470 $event;
    int label;
    final /* synthetic */ AbstractC0519 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "availableVelocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {442}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AbstractC0519 this$0;

        public AnonymousClass1(AbstractC0519 abstractC0519, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, interfaceC4357);
            anonymousClass1.J$0 = ((C7902) obj).f21871;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m1184invokesFctU(((C7902) obj).f21871, (InterfaceC4357) obj2);
        }

        /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m1184invokesFctU(long j, InterfaceC4357<? super C7902> interfaceC4357) {
            return ((AnonymousClass1) create(new C7902(j), interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5185.m10210(obj);
            ((Number) obj).floatValue();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AbstractC0519 abstractC0519, C0470 c0470, InterfaceC4357<? super AnchoredDraggableNode$onDragStopped$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$event = c0470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new AnchoredDraggableNode$onDragStopped$1(null, this.$event, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            long j = this.$event.f1432;
            throw null;
        }
        if (i == 1 || i == 2) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
