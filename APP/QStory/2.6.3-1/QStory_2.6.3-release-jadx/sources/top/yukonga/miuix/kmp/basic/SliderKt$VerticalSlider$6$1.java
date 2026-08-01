package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.InterfaceC2233;
import androidx.window.area.AbstractC3400;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SliderKt$VerticalSlider$6$1", m556f = "Slider.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SliderKt$VerticalSlider$6$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC2232 $dragOffset$delegate;
    final /* synthetic */ InterfaceC7387 $fractionToValueVertical;
    final /* synthetic */ AbstractC6827 $hapticState;
    final /* synthetic */ InterfaceC2230 $isDragging$delegate;
    final /* synthetic */ InterfaceC2233 $layoutHeight$delegate;
    final /* synthetic */ InterfaceC2233 $layoutWidth$delegate;
    final /* synthetic */ InterfaceC2168 $onValueChangeState$delegate;
    final /* synthetic */ boolean $reverseDirection;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$VerticalSlider$6$1(boolean z, InterfaceC7387 interfaceC7387, AbstractC6827 abstractC6827, InterfaceC2230 interfaceC2230, InterfaceC2232 interfaceC2232, InterfaceC2233 interfaceC2233, InterfaceC2233 interfaceC22332, InterfaceC2168 interfaceC2168, InterfaceC5189<? super SliderKt$VerticalSlider$6$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$reverseDirection = z;
        this.$fractionToValueVertical = interfaceC7387;
        this.$isDragging$delegate = interfaceC2230;
        this.$dragOffset$delegate = interfaceC2232;
        this.$layoutHeight$delegate = interfaceC2233;
        this.$layoutWidth$delegate = interfaceC22332;
        this.$onValueChangeState$delegate = interfaceC2168;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11937invoked4ec7I((InterfaceC6233) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11937invoked4ec7I(InterfaceC6233 interfaceC6233, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        SliderKt$VerticalSlider$6$1 sliderKt$VerticalSlider$6$1 = new SliderKt$VerticalSlider$6$1(this.$reverseDirection, this.$fractionToValueVertical, null, this.$isDragging$delegate, this.$dragOffset$delegate, this.$layoutHeight$delegate, this.$layoutWidth$delegate, this.$onValueChangeState$delegate, interfaceC5189);
        sliderKt$VerticalSlider$6$1.J$0 = j;
        return sliderKt$VerticalSlider$6$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        this.$isDragging$delegate.setValue(Boolean.TRUE);
        int i = (int) (j & 4294967295L);
        ((AbstractC2184) this.$dragOffset$delegate).m2995(Float.intBitsToFloat(i));
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fM2992 = ((AbstractC2181) this.$layoutWidth$delegate).m2992() / 2.0f;
        float fM29922 = ((AbstractC2181) this.$layoutHeight$delegate).m2992() - (2.0f * fM2992);
        if (fM29922 < 0.0f) {
            fM29922 = 0.0f;
        }
        float fM5631 = fM29922 != 0.0f ? AbstractC3400.m5631((fIntBitsToFloat - fM2992) / fM29922, 0.0f, 1.0f) : 0.0f;
        if (!this.$reverseDirection) {
            fM5631 = 1.0f - fM5631;
        }
        ((InterfaceC7387) this.$onValueChangeState$delegate.getValue()).invoke(new Float(((Number) this.$fractionToValueVertical.invoke(new Float(fM5631))).floatValue()));
        throw null;
    }
}
