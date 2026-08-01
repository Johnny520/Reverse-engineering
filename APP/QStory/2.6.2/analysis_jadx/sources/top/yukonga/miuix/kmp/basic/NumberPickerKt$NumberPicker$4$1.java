package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$4$1", f = "NumberPicker.kt", l = {114}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$4$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ C0331 $flingAnimatable;
    final /* synthetic */ InterfaceC1395 $isDragging$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$4$1(C0331 c0331, InterfaceC1395 interfaceC1395, InterfaceC1397 interfaceC1397, InterfaceC4356<? super NumberPickerKt$NumberPicker$4$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$flingAnimatable = c0331;
        this.$isDragging$delegate = interfaceC1395;
        this.$dragOffset$delegate = interfaceC1397;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new NumberPickerKt$NumberPicker$4$1(this.$flingAnimatable, this.$isDragging$delegate, this.$dragOffset$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((NumberPickerKt$NumberPicker$4$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (!((Boolean) this.$isDragging$delegate.getValue()).booleanValue() && ((AbstractC1349) this.$dragOffset$delegate).m2424() == 0.0f) {
                C0331 c0331 = this.$flingAnimatable;
                Float f = new Float(0.0f);
                this.label = 1;
                if (c0331.m1030(f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
