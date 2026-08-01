package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.C0412;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5300;
import kotlinx.coroutines.flow.InterfaceC5264;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p108.InterfaceC7317;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$5$1", f = "NumberPicker.kt", l = {134}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$5$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1333 $effectiveIndex$delegate;
    final /* synthetic */ InterfaceC7317 $hapticFeedback;
    final /* synthetic */ InterfaceC1395 $isUserScrolling$delegate;
    final /* synthetic */ InterfaceC1398 $lastHapticIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$5$1(InterfaceC1333 interfaceC1333, InterfaceC7317 interfaceC7317, InterfaceC1398 interfaceC1398, InterfaceC1395 interfaceC1395, InterfaceC4357<? super NumberPickerKt$NumberPicker$5$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$effectiveIndex$delegate = interfaceC1333;
        this.$hapticFeedback = interfaceC7317;
        this.$lastHapticIndex$delegate = interfaceC1398;
        this.$isUserScrolling$delegate = interfaceC1395;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(InterfaceC1333 interfaceC1333) {
        return ((Number) interfaceC1333.getValue()).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new NumberPickerKt$NumberPicker$5$1(this.$effectiveIndex$delegate, this.$hapticFeedback, this.$lastHapticIndex$delegate, this.$isUserScrolling$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((NumberPickerKt$NumberPicker$5$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5319 interfaceC5319M2470 = AbstractC1367.m2470(new C6020(this.$effectiveIndex$delegate, 0));
            if (!(interfaceC5319M2470 instanceof InterfaceC5264)) {
                interfaceC5319M2470 = new C5300(interfaceC5319M2470, AbstractC5322.f14893, AbstractC5322.f14892);
            }
            C0412 c0412 = new C0412(this.$hapticFeedback, this.$lastHapticIndex$delegate, this.$isUserScrolling$delegate, 4);
            this.label = 1;
            if (interfaceC5319M2470.mo8453(c0412, this) == coroutineSingletons) {
                return coroutineSingletons;
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
