package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.InterfaceC1398;
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
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.SliderKt$Slider$6$1", f = "Slider.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class SliderKt$Slider$6$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ boolean $effectiveReverseDirection;
    final /* synthetic */ InterfaceC6558 $fractionToValue;
    final /* synthetic */ AbstractC5997 $hapticState;
    final /* synthetic */ InterfaceC1395 $isDragging$delegate;
    final /* synthetic */ InterfaceC1398 $layoutHeight$delegate;
    final /* synthetic */ InterfaceC1398 $layoutWidth$delegate;
    final /* synthetic */ InterfaceC1333 $onValueChangeState$delegate;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$6$1(boolean z, InterfaceC6558 interfaceC6558, AbstractC5997 abstractC5997, InterfaceC1395 interfaceC1395, InterfaceC1397 interfaceC1397, InterfaceC1398 interfaceC1398, InterfaceC1398 interfaceC13982, InterfaceC1333 interfaceC1333, InterfaceC4357<? super SliderKt$Slider$6$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$effectiveReverseDirection = z;
        this.$fractionToValue = interfaceC6558;
        this.$isDragging$delegate = interfaceC1395;
        this.$dragOffset$delegate = interfaceC1397;
        this.$layoutWidth$delegate = interfaceC1398;
        this.$layoutHeight$delegate = interfaceC13982;
        this.$onValueChangeState$delegate = interfaceC1333;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11377invoked4ec7I((InterfaceC5401) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11377invoked4ec7I(InterfaceC5401 interfaceC5401, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        SliderKt$Slider$6$1 sliderKt$Slider$6$1 = new SliderKt$Slider$6$1(this.$effectiveReverseDirection, this.$fractionToValue, null, this.$isDragging$delegate, this.$dragOffset$delegate, this.$layoutWidth$delegate, this.$layoutHeight$delegate, this.$onValueChangeState$delegate, interfaceC4357);
        sliderKt$Slider$6$1.J$0 = j;
        return sliderKt$Slider$6$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        this.$isDragging$delegate.setValue(Boolean.TRUE);
        int i = (int) (j >> 32);
        ((AbstractC1349) this.$dragOffset$delegate).m2435(Float.intBitsToFloat(i));
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fM2432 = ((AbstractC1346) this.$layoutHeight$delegate).m2432() / 2.0f;
        float fM24322 = ((AbstractC1346) this.$layoutWidth$delegate).m2432() - (2.0f * fM2432);
        if (fM24322 < 0.0f) {
            fM24322 = 0.0f;
        }
        float fM5071 = fM24322 != 0.0f ? AbstractC2567.m5071((fIntBitsToFloat - fM2432) / fM24322, 0.0f, 1.0f) : 0.0f;
        if (this.$effectiveReverseDirection) {
            fM5071 = 1.0f - fM5071;
        }
        ((InterfaceC6558) this.$onValueChangeState$delegate.getValue()).invoke(new Float(((Number) this.$fractionToValue.invoke(new Float(fM5071))).floatValue()));
        throw null;
    }
}
