package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SliderKt$RangeSlider$7$1", m556f = "Slider.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SliderKt$RangeSlider$7$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC2230 $isDraggingEnd$delegate;
    final /* synthetic */ InterfaceC2230 $isDraggingStart$delegate;
    final /* synthetic */ InterfaceC2168 $onValueChangeFinishedState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$7$1(InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC2168 interfaceC2168, InterfaceC5189<? super SliderKt$RangeSlider$7$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$isDraggingStart$delegate = interfaceC2230;
        this.$isDraggingEnd$delegate = interfaceC22302;
        this.$onValueChangeFinishedState$delegate = interfaceC2168;
    }

    public final Object invoke(InterfaceC6233 interfaceC6233, float f, InterfaceC5189<? super C6008> interfaceC5189) {
        return new SliderKt$RangeSlider$7$1(this.$isDraggingStart$delegate, this.$isDraggingEnd$delegate, this.$onValueChangeFinishedState$delegate, interfaceC5189).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC2230 interfaceC2230 = this.$isDraggingStart$delegate;
        Boolean bool = Boolean.FALSE;
        interfaceC2230.setValue(bool);
        this.$isDraggingEnd$delegate.setValue(bool);
        InterfaceC7372 interfaceC7372 = (InterfaceC7372) this.$onValueChangeFinishedState$delegate.getValue();
        if (interfaceC7372 != null) {
            interfaceC7372.invoke();
        }
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6233) obj, ((Number) obj2).floatValue(), (InterfaceC5189<? super C6008>) obj3);
    }
}
