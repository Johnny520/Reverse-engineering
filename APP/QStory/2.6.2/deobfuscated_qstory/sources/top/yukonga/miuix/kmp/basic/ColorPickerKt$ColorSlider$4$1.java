package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1397;
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
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ColorPickerKt$ColorSlider$4$1", f = "ColorPicker.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class ColorPickerKt$ColorSlider$4$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ AbstractC5991 $hapticState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC1333 $onValueChangedState;
    final /* synthetic */ float $sliderHeightPx;
    final /* synthetic */ InterfaceC1397 $sliderWidthPxState$delegate;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerKt$ColorSlider$4$1(boolean z, float f, InterfaceC1333 interfaceC1333, AbstractC5991 abstractC5991, InterfaceC1397 interfaceC1397, InterfaceC1397 interfaceC13972, InterfaceC4356<? super ColorPickerKt$ColorSlider$4$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$isRtl = z;
        this.$sliderHeightPx = f;
        this.$onValueChangedState = interfaceC1333;
        this.$sliderWidthPxState$delegate = interfaceC1397;
        this.$dragOffset$delegate = interfaceC13972;
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11305invoked4ec7I((InterfaceC5400) obj, ((C7328) obj2).f19546, (InterfaceC4356) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11305invoked4ec7I(InterfaceC5400 interfaceC5400, long j, InterfaceC4356<? super C5175> interfaceC4356) {
        ColorPickerKt$ColorSlider$4$1 colorPickerKt$ColorSlider$4$1 = new ColorPickerKt$ColorSlider$4$1(this.$isRtl, this.$sliderHeightPx, this.$onValueChangedState, null, this.$sliderWidthPxState$delegate, this.$dragOffset$delegate, interfaceC4356);
        colorPickerKt$ColorSlider$4$1.J$0 = j;
        return colorPickerKt$ColorSlider$4$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        float fM2424 = this.$isRtl ? ((AbstractC1349) this.$sliderWidthPxState$delegate).m2424() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
        ((AbstractC1349) this.$dragOffset$delegate).m2425(fM2424);
        float fM24242 = ((AbstractC1349) this.$sliderWidthPxState$delegate).m2424();
        float f = this.$sliderHeightPx;
        float f2 = f / 2.0f;
        ((InterfaceC6557) this.$onValueChangedState.getValue()).invoke(new Float(AbstractC6087.m11419((AbstractC6087.m11419(fM2424, f2, fM24242 - f2) - f2) / (fM24242 - f), 0.0f, 1.0f)));
        throw null;
    }
}
