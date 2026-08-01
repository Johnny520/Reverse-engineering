package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p048.InterfaceC6514;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p112.C7329;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.SliderKt$RangeSlider$6$1", f = "Slider.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class SliderKt$RangeSlider$6$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ float $coercedEnd;
    final /* synthetic */ float $coercedStart;
    final /* synthetic */ InterfaceC1397 $currentEndValue$delegate;
    final /* synthetic */ InterfaceC1397 $currentStartValue$delegate;
    final /* synthetic */ InterfaceC1397 $endDragOffset$delegate;
    final /* synthetic */ AbstractC6002 $hapticState;
    final /* synthetic */ InterfaceC1395 $isDraggingEnd$delegate;
    final /* synthetic */ InterfaceC1395 $isDraggingStart$delegate;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC1395 $lastDraggedIsStart$delegate;
    final /* synthetic */ InterfaceC1398 $layoutHeight$delegate;
    final /* synthetic */ InterfaceC1398 $layoutWidth$delegate;
    final /* synthetic */ InterfaceC1397 $startDragOffset$delegate;
    final /* synthetic */ InterfaceC6514 $valueRange;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$6$1(InterfaceC6514 interfaceC6514, boolean z, AbstractC6002 abstractC6002, float f, float f2, InterfaceC1398 interfaceC1398, InterfaceC1398 interfaceC13982, InterfaceC1397 interfaceC1397, InterfaceC1397 interfaceC13972, InterfaceC1395 interfaceC1395, InterfaceC1397 interfaceC13973, InterfaceC1395 interfaceC13952, InterfaceC1397 interfaceC13974, InterfaceC1395 interfaceC13953, InterfaceC4357<? super SliderKt$RangeSlider$6$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$valueRange = interfaceC6514;
        this.$isRtl = z;
        this.$coercedStart = f;
        this.$coercedEnd = f2;
        this.$layoutHeight$delegate = interfaceC1398;
        this.$layoutWidth$delegate = interfaceC13982;
        this.$currentStartValue$delegate = interfaceC1397;
        this.$currentEndValue$delegate = interfaceC13972;
        this.$isDraggingStart$delegate = interfaceC1395;
        this.$startDragOffset$delegate = interfaceC13973;
        this.$isDraggingEnd$delegate = interfaceC13952;
        this.$endDragOffset$delegate = interfaceC13974;
        this.$lastDraggedIsStart$delegate = interfaceC13953;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11376invoked4ec7I((InterfaceC5401) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11376invoked4ec7I(InterfaceC5401 interfaceC5401, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        SliderKt$RangeSlider$6$1 sliderKt$RangeSlider$6$1 = new SliderKt$RangeSlider$6$1(this.$valueRange, this.$isRtl, null, this.$coercedStart, this.$coercedEnd, this.$layoutHeight$delegate, this.$layoutWidth$delegate, this.$currentStartValue$delegate, this.$currentEndValue$delegate, this.$isDraggingStart$delegate, this.$startDragOffset$delegate, this.$isDraggingEnd$delegate, this.$endDragOffset$delegate, this.$lastDraggedIsStart$delegate, interfaceC4357);
        sliderKt$RangeSlider$6$1.J$0 = j;
        return sliderKt$RangeSlider$6$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        float fM2432 = ((AbstractC1346) this.$layoutHeight$delegate).m2432() / 2.0f;
        float fM24322 = ((AbstractC1346) this.$layoutWidth$delegate).m2432() - (2.0f * fM2432);
        if (fM24322 < 0.0f) {
            fM24322 = 0.0f;
        }
        float fM2434 = (((AbstractC1349) this.$currentStartValue$delegate).m2434() - ((Number) this.$valueRange.getStart()).floatValue()) / (((Number) this.$valueRange.mo12001()).floatValue() - ((Number) this.$valueRange.getStart()).floatValue());
        float fM24342 = (((AbstractC1349) this.$currentEndValue$delegate).m2434() - ((Number) this.$valueRange.getStart()).floatValue()) / (((Number) this.$valueRange.mo12001()).floatValue() - ((Number) this.$valueRange.getStart()).floatValue());
        boolean z = this.$isRtl;
        if (z) {
            fM2434 = 1.0f - fM2434;
        }
        if (z) {
            fM24342 = 1.0f - fM24342;
        }
        float f = (fM2434 * fM24322) + fM2432;
        float f2 = (fM24342 * fM24322) + fM2432;
        float f3 = (fM2432 * 0.5f) + (0.72f * fM2432);
        int i = (int) (j >> 32);
        boolean z2 = Math.abs(Float.intBitsToFloat(i) - f) <= f3;
        boolean z3 = Math.abs(Float.intBitsToFloat(i) - f2) <= f3;
        if (z2 && !z3) {
            this.$isDraggingStart$delegate.setValue(Boolean.TRUE);
            ((AbstractC1349) this.$startDragOffset$delegate).m2435(Float.intBitsToFloat(i));
            throw null;
        }
        if (!z2 && z3) {
            this.$isDraggingEnd$delegate.setValue(Boolean.TRUE);
            ((AbstractC1349) this.$endDragOffset$delegate).m2435(Float.intBitsToFloat(i));
            throw null;
        }
        if (z2 && z3) {
            if (((Boolean) this.$lastDraggedIsStart$delegate.getValue()).booleanValue()) {
                this.$isDraggingStart$delegate.setValue(Boolean.TRUE);
                ((AbstractC1349) this.$startDragOffset$delegate).m2435(Float.intBitsToFloat(i));
                throw null;
            }
            this.$isDraggingEnd$delegate.setValue(Boolean.TRUE);
            ((AbstractC1349) this.$endDragOffset$delegate).m2435(Float.intBitsToFloat(i));
            throw null;
        }
        if (Math.abs(Float.intBitsToFloat(i) - f) <= Math.abs(Float.intBitsToFloat(i) - f2)) {
            this.$isDraggingStart$delegate.setValue(Boolean.TRUE);
            ((AbstractC1349) this.$startDragOffset$delegate).m2435(Float.intBitsToFloat(i));
            throw null;
        }
        this.$isDraggingEnd$delegate.setValue(Boolean.TRUE);
        ((AbstractC1349) this.$endDragOffset$delegate).m2435(Float.intBitsToFloat(i));
        throw null;
    }
}
