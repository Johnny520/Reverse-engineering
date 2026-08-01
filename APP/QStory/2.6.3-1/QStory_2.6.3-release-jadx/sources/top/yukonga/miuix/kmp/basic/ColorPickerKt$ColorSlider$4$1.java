package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2232;
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
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ColorPickerKt$ColorSlider$4$1", m556f = "ColorPicker.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ColorPickerKt$ColorSlider$4$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC2232 $dragOffset$delegate;
    final /* synthetic */ AbstractC6827 $hapticState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC2168 $onValueChangedState;
    final /* synthetic */ float $sliderHeightPx;
    final /* synthetic */ InterfaceC2232 $sliderWidthPxState$delegate;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerKt$ColorSlider$4$1(boolean z, float f, InterfaceC2168 interfaceC2168, AbstractC6827 abstractC6827, InterfaceC2232 interfaceC2232, InterfaceC2232 interfaceC22322, InterfaceC5189<? super ColorPickerKt$ColorSlider$4$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$isRtl = z;
        this.$sliderHeightPx = f;
        this.$onValueChangedState = interfaceC2168;
        this.$sliderWidthPxState$delegate = interfaceC2232;
        this.$dragOffset$delegate = interfaceC22322;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11924invoked4ec7I((InterfaceC6233) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11924invoked4ec7I(InterfaceC6233 interfaceC6233, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        ColorPickerKt$ColorSlider$4$1 colorPickerKt$ColorSlider$4$1 = new ColorPickerKt$ColorSlider$4$1(this.$isRtl, this.$sliderHeightPx, this.$onValueChangedState, null, this.$sliderWidthPxState$delegate, this.$dragOffset$delegate, interfaceC5189);
        colorPickerKt$ColorSlider$4$1.J$0 = j;
        return colorPickerKt$ColorSlider$4$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        float fM2994 = this.$isRtl ? ((AbstractC2184) this.$sliderWidthPxState$delegate).m2994() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
        ((AbstractC2184) this.$dragOffset$delegate).m2995(fM2994);
        float fM29942 = ((AbstractC2184) this.$sliderWidthPxState$delegate).m2994();
        float f = this.$sliderHeightPx;
        float f2 = f / 2.0f;
        ((InterfaceC7387) this.$onValueChangedState.getValue()).invoke(new Float(AbstractC3400.m5631((AbstractC3400.m5631(fM2994, f2, fM29942 - f2) - f2) / (fM29942 - f), 0.0f, 1.0f)));
        throw null;
    }
}
