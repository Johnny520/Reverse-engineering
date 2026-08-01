package androidx.compose.material3.carousel;

import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.foundation.gestures.InterfaceC1348;
import androidx.compose.foundation.pager.C1610;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1", m556f = "CarouselState.kt", m557l = {111}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CarouselState$animateScrollToItem$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ AbstractC1951 $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselState$animateScrollToItem$2$1(AbstractC1951 abstractC1951, int i, InterfaceC1195 interfaceC1195, InterfaceC5189<? super CarouselState$animateScrollToItem$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$targetPage = i;
        this.$animationSpec = interfaceC1195;
    }

    private static final C6008 invokeSuspend$lambda$0(AbstractC1951 abstractC1951, InterfaceC1348 interfaceC1348, int i) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CarouselState$animateScrollToItem$2$1 carouselState$animateScrollToItem$2$1 = new CarouselState$animateScrollToItem$2$1(null, this.$targetPage, this.$animationSpec, interfaceC5189);
        carouselState$animateScrollToItem$2$1.L$0 = obj;
        return carouselState$animateScrollToItem$2$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1348 interfaceC1348, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CarouselState$animateScrollToItem$2$1) create(interfaceC1348, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C1610 c1610 = new C1610((InterfaceC1348) this.L$0);
        int i2 = this.$targetPage;
        this.label = 1;
        invokeSuspend$lambda$0(null, c1610, new Integer(i2).intValue());
        throw null;
    }
}
