package androidx.compose.material3;

import androidx.compose.foundation.gestures.InterfaceC0552;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p112.C7328;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class SliderKt$sliderTapModifier$1$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC1198 $state;
    /* synthetic */ long J$0;
    int label;

    public SliderKt$sliderTapModifier$1$1(AbstractC1198 abstractC1198, InterfaceC4356<? super SliderKt$sliderTapModifier$1$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2002invoked4ec7I((InterfaceC0552) obj, ((C7328) obj2).f19546, (InterfaceC4356) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m2002invoked4ec7I(InterfaceC0552 interfaceC0552, long j, InterfaceC4356<? super C5175> interfaceC4356) {
        SliderKt$sliderTapModifier$1$1 sliderKt$sliderTapModifier$1$1 = new SliderKt$sliderTapModifier$1$1(null, interfaceC4356);
        sliderKt$sliderTapModifier$1$1.J$0 = j;
        return sliderKt$sliderTapModifier$1$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        throw null;
    }
}
