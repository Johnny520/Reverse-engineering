package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$4$1", f = "NumberPicker.kt", l = {114}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$4$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ C0331 $flingAnimatable;
    final /* synthetic */ InterfaceC1395 $isDragging$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$4$1(C0331 c0331, InterfaceC1395 interfaceC1395, InterfaceC1397 interfaceC1397, InterfaceC4357<? super NumberPickerKt$NumberPicker$4$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$flingAnimatable = c0331;
        this.$isDragging$delegate = interfaceC1395;
        this.$dragOffset$delegate = interfaceC1397;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new NumberPickerKt$NumberPicker$4$1(this.$flingAnimatable, this.$isDragging$delegate, this.$dragOffset$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((NumberPickerKt$NumberPicker$4$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (!((Boolean) this.$isDragging$delegate.getValue()).booleanValue() && ((AbstractC1349) this.$dragOffset$delegate).m2434() == 0.0f) {
                C0331 c0331 = this.$flingAnimatable;
                Float f = new Float(0.0f);
                this.label = 1;
                if (c0331.m1031(f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
