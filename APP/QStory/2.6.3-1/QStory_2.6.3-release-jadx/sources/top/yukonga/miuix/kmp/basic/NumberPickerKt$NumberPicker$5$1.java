package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.C1258;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2233;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6132;
import kotlinx.coroutines.flow.InterfaceC6096;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p124.InterfaceC8146;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$5$1", m556f = "NumberPicker.kt", m557l = {134}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$5$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2168 $effectiveIndex$delegate;
    final /* synthetic */ InterfaceC8146 $hapticFeedback;
    final /* synthetic */ InterfaceC2230 $isUserScrolling$delegate;
    final /* synthetic */ InterfaceC2233 $lastHapticIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$5$1(InterfaceC2168 interfaceC2168, InterfaceC8146 interfaceC8146, InterfaceC2233 interfaceC2233, InterfaceC2230 interfaceC2230, InterfaceC5189<? super NumberPickerKt$NumberPicker$5$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$effectiveIndex$delegate = interfaceC2168;
        this.$hapticFeedback = interfaceC8146;
        this.$lastHapticIndex$delegate = interfaceC2233;
        this.$isUserScrolling$delegate = interfaceC2230;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(InterfaceC2168 interfaceC2168) {
        return ((Number) interfaceC2168.getValue()).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new NumberPickerKt$NumberPicker$5$1(this.$effectiveIndex$delegate, this.$hapticFeedback, this.$lastHapticIndex$delegate, this.$isUserScrolling$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((NumberPickerKt$NumberPicker$5$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6151 interfaceC6151M3030 = AbstractC2202.m3030(new C6850(this.$effectiveIndex$delegate, 0));
            if (!(interfaceC6151M3030 instanceof InterfaceC6096)) {
                interfaceC6151M3030 = new C6132(interfaceC6151M3030, AbstractC6154.f15238, AbstractC6154.f15237);
            }
            C1258 c1258 = new C1258(this.$hapticFeedback, this.$lastHapticIndex$delegate, this.$isUserScrolling$delegate, 4);
            this.label = 1;
            if (interfaceC6151M3030.mo9012(c1258, this) == coroutineSingletons) {
                return coroutineSingletons;
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
