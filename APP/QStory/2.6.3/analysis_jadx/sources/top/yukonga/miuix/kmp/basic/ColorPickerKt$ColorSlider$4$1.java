package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1397;
import androidx.window.area.AbstractC2567;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p112.C7329;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ColorPickerKt$ColorSlider$4$1", f = "ColorPicker.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class ColorPickerKt$ColorSlider$4$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ AbstractC5997 $hapticState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC1333 $onValueChangedState;
    final /* synthetic */ float $sliderHeightPx;
    final /* synthetic */ InterfaceC1397 $sliderWidthPxState$delegate;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerKt$ColorSlider$4$1(boolean z, float f, InterfaceC1333 interfaceC1333, AbstractC5997 abstractC5997, InterfaceC1397 interfaceC1397, InterfaceC1397 interfaceC13972, InterfaceC4357<? super ColorPickerKt$ColorSlider$4$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$isRtl = z;
        this.$sliderHeightPx = f;
        this.$onValueChangedState = interfaceC1333;
        this.$sliderWidthPxState$delegate = interfaceC1397;
        this.$dragOffset$delegate = interfaceC13972;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11365invoked4ec7I((InterfaceC5401) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11365invoked4ec7I(InterfaceC5401 interfaceC5401, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        ColorPickerKt$ColorSlider$4$1 colorPickerKt$ColorSlider$4$1 = new ColorPickerKt$ColorSlider$4$1(this.$isRtl, this.$sliderHeightPx, this.$onValueChangedState, null, this.$sliderWidthPxState$delegate, this.$dragOffset$delegate, interfaceC4357);
        colorPickerKt$ColorSlider$4$1.J$0 = j;
        return colorPickerKt$ColorSlider$4$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        float fM2434 = this.$isRtl ? ((AbstractC1349) this.$sliderWidthPxState$delegate).m2434() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
        ((AbstractC1349) this.$dragOffset$delegate).m2435(fM2434);
        float fM24342 = ((AbstractC1349) this.$sliderWidthPxState$delegate).m2434();
        float f = this.$sliderHeightPx;
        float f2 = f / 2.0f;
        ((InterfaceC6558) this.$onValueChangedState.getValue()).invoke(new Float(AbstractC2567.m5071((AbstractC2567.m5071(fM2434, f2, fM24342 - f2) - f2) / (fM24342 - f), 0.0f, 1.0f)));
        throw null;
    }
}
