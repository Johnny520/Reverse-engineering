package androidx.compose.material3;

import androidx.compose.foundation.gestures.InterfaceC1393;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p128.C8158;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", m556f = "Slider.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SliderKt$sliderTapModifier$1$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC2033 $state;
    /* synthetic */ long J$0;
    int label;

    public SliderKt$sliderTapModifier$1$1(AbstractC2033 abstractC2033, InterfaceC5189<? super SliderKt$sliderTapModifier$1$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2572invoked4ec7I((InterfaceC1393) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m2572invoked4ec7I(InterfaceC1393 interfaceC1393, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        SliderKt$sliderTapModifier$1$1 sliderKt$sliderTapModifier$1$1 = new SliderKt$sliderTapModifier$1$1(null, interfaceC5189);
        sliderKt$sliderTapModifier$1$1.J$0 = j;
        return sliderKt$sliderTapModifier$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
