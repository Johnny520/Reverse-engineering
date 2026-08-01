package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.SliderKt$RangeSlider$7$1", f = "Slider.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, k = 3, mv = {2, 3, 0})
final class SliderKt$RangeSlider$7$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC1395 $isDraggingEnd$delegate;
    final /* synthetic */ InterfaceC1395 $isDraggingStart$delegate;
    final /* synthetic */ InterfaceC1333 $onValueChangeFinishedState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$7$1(InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC1333 interfaceC1333, InterfaceC4356<? super SliderKt$RangeSlider$7$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$isDraggingStart$delegate = interfaceC1395;
        this.$isDraggingEnd$delegate = interfaceC13952;
        this.$onValueChangeFinishedState$delegate = interfaceC1333;
    }

    public final Object invoke(InterfaceC5400 interfaceC5400, float f, InterfaceC4356<? super C5175> interfaceC4356) {
        return new SliderKt$RangeSlider$7$1(this.$isDraggingStart$delegate, this.$isDraggingEnd$delegate, this.$onValueChangeFinishedState$delegate, interfaceC4356).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC1395 interfaceC1395 = this.$isDraggingStart$delegate;
        Boolean bool = Boolean.FALSE;
        interfaceC1395.setValue(bool);
        this.$isDraggingEnd$delegate.setValue(bool);
        InterfaceC6542 interfaceC6542 = (InterfaceC6542) this.$onValueChangeFinishedState$delegate.getValue();
        if (interfaceC6542 != null) {
            interfaceC6542.invoke();
        }
        return C5175.f14739;
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5400) obj, ((Number) obj2).floatValue(), (InterfaceC4356<? super C5175>) obj3);
    }
}
