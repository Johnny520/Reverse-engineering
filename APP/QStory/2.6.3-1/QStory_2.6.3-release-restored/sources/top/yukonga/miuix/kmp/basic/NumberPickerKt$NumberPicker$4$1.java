package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C1177;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$4$1", m556f = "NumberPicker.kt", m557l = {114}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$4$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2232 $dragOffset$delegate;
    final /* synthetic */ C1177 $flingAnimatable;
    final /* synthetic */ InterfaceC2230 $isDragging$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$4$1(C1177 c1177, InterfaceC2230 interfaceC2230, InterfaceC2232 interfaceC2232, InterfaceC5189<? super NumberPickerKt$NumberPicker$4$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$flingAnimatable = c1177;
        this.$isDragging$delegate = interfaceC2230;
        this.$dragOffset$delegate = interfaceC2232;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new NumberPickerKt$NumberPicker$4$1(this.$flingAnimatable, this.$isDragging$delegate, this.$dragOffset$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((NumberPickerKt$NumberPicker$4$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (!((Boolean) this.$isDragging$delegate.getValue()).booleanValue() && ((AbstractC2184) this.$dragOffset$delegate).m2994() == 0.0f) {
                C1177 c1177 = this.$flingAnimatable;
                Float f = new Float(0.0f);
                this.label = 1;
                if (c1177.m1591(f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
