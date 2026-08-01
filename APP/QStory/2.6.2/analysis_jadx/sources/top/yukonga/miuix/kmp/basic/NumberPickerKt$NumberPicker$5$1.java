package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.C0412;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5299;
import kotlinx.coroutines.flow.InterfaceC5263;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p108.InterfaceC7316;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$5$1", f = "NumberPicker.kt", l = {134}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$5$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1333 $effectiveIndex$delegate;
    final /* synthetic */ InterfaceC7316 $hapticFeedback;
    final /* synthetic */ InterfaceC1395 $isUserScrolling$delegate;
    final /* synthetic */ InterfaceC1398 $lastHapticIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$5$1(InterfaceC1333 interfaceC1333, InterfaceC7316 interfaceC7316, InterfaceC1398 interfaceC1398, InterfaceC1395 interfaceC1395, InterfaceC4356<? super NumberPickerKt$NumberPicker$5$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$effectiveIndex$delegate = interfaceC1333;
        this.$hapticFeedback = interfaceC7316;
        this.$lastHapticIndex$delegate = interfaceC1398;
        this.$isUserScrolling$delegate = interfaceC1395;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(InterfaceC1333 interfaceC1333) {
        return ((Number) interfaceC1333.getValue()).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new NumberPickerKt$NumberPicker$5$1(this.$effectiveIndex$delegate, this.$hapticFeedback, this.$lastHapticIndex$delegate, this.$isUserScrolling$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((NumberPickerKt$NumberPicker$5$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5318 interfaceC5318M2461 = AbstractC1367.m2461(new C6014(this.$effectiveIndex$delegate, 0));
            if (!(interfaceC5318M2461 instanceof InterfaceC5263)) {
                interfaceC5318M2461 = new C5299(interfaceC5318M2461, AbstractC5321.f14893, AbstractC5321.f14892);
            }
            C0412 c0412 = new C0412(this.$hapticFeedback, this.$lastHapticIndex$delegate, this.$isUserScrolling$delegate, 4);
            this.label = 1;
            if (interfaceC5318M2461.mo8463(c0412, this) == coroutineSingletons) {
                return coroutineSingletons;
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
