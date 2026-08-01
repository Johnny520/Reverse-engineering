package androidx.compose.material3.carousel;

import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.gestures.InterfaceC0507;
import androidx.compose.foundation.pager.C0769;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1", f = "CarouselState.kt", l = {111}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, k = 3, mv = {2, 0, 0})
final class CarouselState$animateScrollToItem$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ AbstractC1113 $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselState$animateScrollToItem$2$1(AbstractC1113 abstractC1113, int i, InterfaceC0349 interfaceC0349, InterfaceC4357<? super CarouselState$animateScrollToItem$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$targetPage = i;
        this.$animationSpec = interfaceC0349;
    }

    private static final C5176 invokeSuspend$lambda$0(AbstractC1113 abstractC1113, InterfaceC0507 interfaceC0507, int i) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        CarouselState$animateScrollToItem$2$1 carouselState$animateScrollToItem$2$1 = new CarouselState$animateScrollToItem$2$1(null, this.$targetPage, this.$animationSpec, interfaceC4357);
        carouselState$animateScrollToItem$2$1.L$0 = obj;
        return carouselState$animateScrollToItem$2$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0507 interfaceC0507, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CarouselState$animateScrollToItem$2$1) create(interfaceC0507, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return C5176.f14739;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C0769 c0769 = new C0769((InterfaceC0507) this.L$0);
        int i2 = this.$targetPage;
        this.label = 1;
        invokeSuspend$lambda$0(null, c0769, new Integer(i2).intValue());
        throw null;
    }
}
