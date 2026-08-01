package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.InterfaceC2233;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p064.InterfaceC7343;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p128.C8158;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SliderKt$RangeSlider$6$1", m556f = "Slider.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SliderKt$RangeSlider$6$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ float $coercedEnd;
    final /* synthetic */ float $coercedStart;
    final /* synthetic */ InterfaceC2232 $currentEndValue$delegate;
    final /* synthetic */ InterfaceC2232 $currentStartValue$delegate;
    final /* synthetic */ InterfaceC2232 $endDragOffset$delegate;
    final /* synthetic */ AbstractC6832 $hapticState;
    final /* synthetic */ InterfaceC2230 $isDraggingEnd$delegate;
    final /* synthetic */ InterfaceC2230 $isDraggingStart$delegate;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC2230 $lastDraggedIsStart$delegate;
    final /* synthetic */ InterfaceC2233 $layoutHeight$delegate;
    final /* synthetic */ InterfaceC2233 $layoutWidth$delegate;
    final /* synthetic */ InterfaceC2232 $startDragOffset$delegate;
    final /* synthetic */ InterfaceC7343 $valueRange;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$6$1(InterfaceC7343 interfaceC7343, boolean z, AbstractC6832 abstractC6832, float f, float f2, InterfaceC2233 interfaceC2233, InterfaceC2233 interfaceC22332, InterfaceC2232 interfaceC2232, InterfaceC2232 interfaceC22322, InterfaceC2230 interfaceC2230, InterfaceC2232 interfaceC22323, InterfaceC2230 interfaceC22302, InterfaceC2232 interfaceC22324, InterfaceC2230 interfaceC22303, InterfaceC5189<? super SliderKt$RangeSlider$6$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$valueRange = interfaceC7343;
        this.$isRtl = z;
        this.$coercedStart = f;
        this.$coercedEnd = f2;
        this.$layoutHeight$delegate = interfaceC2233;
        this.$layoutWidth$delegate = interfaceC22332;
        this.$currentStartValue$delegate = interfaceC2232;
        this.$currentEndValue$delegate = interfaceC22322;
        this.$isDraggingStart$delegate = interfaceC2230;
        this.$startDragOffset$delegate = interfaceC22323;
        this.$isDraggingEnd$delegate = interfaceC22302;
        this.$endDragOffset$delegate = interfaceC22324;
        this.$lastDraggedIsStart$delegate = interfaceC22303;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11935invoked4ec7I((InterfaceC6233) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11935invoked4ec7I(InterfaceC6233 interfaceC6233, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        SliderKt$RangeSlider$6$1 sliderKt$RangeSlider$6$1 = new SliderKt$RangeSlider$6$1(this.$valueRange, this.$isRtl, null, this.$coercedStart, this.$coercedEnd, this.$layoutHeight$delegate, this.$layoutWidth$delegate, this.$currentStartValue$delegate, this.$currentEndValue$delegate, this.$isDraggingStart$delegate, this.$startDragOffset$delegate, this.$isDraggingEnd$delegate, this.$endDragOffset$delegate, this.$lastDraggedIsStart$delegate, interfaceC5189);
        sliderKt$RangeSlider$6$1.J$0 = j;
        return sliderKt$RangeSlider$6$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        float fM2992 = ((AbstractC2181) this.$layoutHeight$delegate).m2992() / 2.0f;
        float fM29922 = ((AbstractC2181) this.$layoutWidth$delegate).m2992() - (2.0f * fM2992);
        if (fM29922 < 0.0f) {
            fM29922 = 0.0f;
        }
        float fM2994 = (((AbstractC2184) this.$currentStartValue$delegate).m2994() - ((Number) this.$valueRange.getStart()).floatValue()) / (((Number) this.$valueRange.mo12560()).floatValue() - ((Number) this.$valueRange.getStart()).floatValue());
        float fM29942 = (((AbstractC2184) this.$currentEndValue$delegate).m2994() - ((Number) this.$valueRange.getStart()).floatValue()) / (((Number) this.$valueRange.mo12560()).floatValue() - ((Number) this.$valueRange.getStart()).floatValue());
        boolean z = this.$isRtl;
        if (z) {
            fM2994 = 1.0f - fM2994;
        }
        if (z) {
            fM29942 = 1.0f - fM29942;
        }
        float f = (fM2994 * fM29922) + fM2992;
        float f2 = (fM29942 * fM29922) + fM2992;
        float f3 = (fM2992 * 0.5f) + (0.72f * fM2992);
        int i = (int) (j >> 32);
        boolean z2 = Math.abs(Float.intBitsToFloat(i) - f) <= f3;
        boolean z3 = Math.abs(Float.intBitsToFloat(i) - f2) <= f3;
        if (z2 && !z3) {
            this.$isDraggingStart$delegate.setValue(Boolean.TRUE);
            ((AbstractC2184) this.$startDragOffset$delegate).m2995(Float.intBitsToFloat(i));
            throw null;
        }
        if (!z2 && z3) {
            this.$isDraggingEnd$delegate.setValue(Boolean.TRUE);
            ((AbstractC2184) this.$endDragOffset$delegate).m2995(Float.intBitsToFloat(i));
            throw null;
        }
        if (z2 && z3) {
            if (((Boolean) this.$lastDraggedIsStart$delegate.getValue()).booleanValue()) {
                this.$isDraggingStart$delegate.setValue(Boolean.TRUE);
                ((AbstractC2184) this.$startDragOffset$delegate).m2995(Float.intBitsToFloat(i));
                throw null;
            }
            this.$isDraggingEnd$delegate.setValue(Boolean.TRUE);
            ((AbstractC2184) this.$endDragOffset$delegate).m2995(Float.intBitsToFloat(i));
            throw null;
        }
        if (Math.abs(Float.intBitsToFloat(i) - f) <= Math.abs(Float.intBitsToFloat(i) - f2)) {
            this.$isDraggingStart$delegate.setValue(Boolean.TRUE);
            ((AbstractC2184) this.$startDragOffset$delegate).m2995(Float.intBitsToFloat(i));
            throw null;
        }
        this.$isDraggingEnd$delegate.setValue(Boolean.TRUE);
        ((AbstractC2184) this.$endDragOffset$delegate).m2995(Float.intBitsToFloat(i));
        throw null;
    }
}
