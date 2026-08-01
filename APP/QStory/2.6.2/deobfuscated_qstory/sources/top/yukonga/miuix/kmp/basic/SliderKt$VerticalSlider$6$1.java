package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p000.AbstractC6087;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p112.C7328;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.SliderKt$VerticalSlider$6$1", f = "Slider.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class SliderKt$VerticalSlider$6$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ InterfaceC6557 $fractionToValueVertical;
    final /* synthetic */ AbstractC5991 $hapticState;
    final /* synthetic */ InterfaceC1395 $isDragging$delegate;
    final /* synthetic */ InterfaceC1398 $layoutHeight$delegate;
    final /* synthetic */ InterfaceC1398 $layoutWidth$delegate;
    final /* synthetic */ InterfaceC1333 $onValueChangeState$delegate;
    final /* synthetic */ boolean $reverseDirection;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$VerticalSlider$6$1(boolean z, InterfaceC6557 interfaceC6557, AbstractC5991 abstractC5991, InterfaceC1395 interfaceC1395, InterfaceC1397 interfaceC1397, InterfaceC1398 interfaceC1398, InterfaceC1398 interfaceC13982, InterfaceC1333 interfaceC1333, InterfaceC4356<? super SliderKt$VerticalSlider$6$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$reverseDirection = z;
        this.$fractionToValueVertical = interfaceC6557;
        this.$isDragging$delegate = interfaceC1395;
        this.$dragOffset$delegate = interfaceC1397;
        this.$layoutHeight$delegate = interfaceC1398;
        this.$layoutWidth$delegate = interfaceC13982;
        this.$onValueChangeState$delegate = interfaceC1333;
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11318invoked4ec7I((InterfaceC5400) obj, ((C7328) obj2).f19546, (InterfaceC4356) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11318invoked4ec7I(InterfaceC5400 interfaceC5400, long j, InterfaceC4356<? super C5175> interfaceC4356) {
        SliderKt$VerticalSlider$6$1 sliderKt$VerticalSlider$6$1 = new SliderKt$VerticalSlider$6$1(this.$reverseDirection, this.$fractionToValueVertical, null, this.$isDragging$delegate, this.$dragOffset$delegate, this.$layoutHeight$delegate, this.$layoutWidth$delegate, this.$onValueChangeState$delegate, interfaceC4356);
        sliderKt$VerticalSlider$6$1.J$0 = j;
        return sliderKt$VerticalSlider$6$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        this.$isDragging$delegate.setValue(Boolean.TRUE);
        int i = (int) (j & 4294967295L);
        ((AbstractC1349) this.$dragOffset$delegate).m2425(Float.intBitsToFloat(i));
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fM2422 = ((AbstractC1346) this.$layoutWidth$delegate).m2422() / 2.0f;
        float fM24222 = ((AbstractC1346) this.$layoutHeight$delegate).m2422() - (2.0f * fM2422);
        if (fM24222 < 0.0f) {
            fM24222 = 0.0f;
        }
        float fM11419 = fM24222 != 0.0f ? AbstractC6087.m11419((fIntBitsToFloat - fM2422) / fM24222, 0.0f, 1.0f) : 0.0f;
        if (!this.$reverseDirection) {
            fM11419 = 1.0f - fM11419;
        }
        ((InterfaceC6557) this.$onValueChangeState$delegate.getValue()).invoke(new Float(((Number) this.$fractionToValueVertical.invoke(new Float(fM11419))).floatValue()));
        throw null;
    }
}
