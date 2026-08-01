package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC1395;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import p205.C7907;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class TimePickerKt$ClockText$2$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ InterfaceC1395 $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ InterfaceC1395 $parentCenter$delegate;
    final /* synthetic */ AbstractC1179 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2$1$1$1(AbstractC1179 abstractC1179, float f, boolean z, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4356<? super TimePickerKt$ClockText$2$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$maxDist = f;
        this.$autoSwitchToMinute = z;
        this.$center$delegate = interfaceC1395;
        this.$parentCenter$delegate = interfaceC13952;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TimePickerKt$ClockText$2$1$1$1(null, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TimePickerKt$ClockText$2$1$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC1395 interfaceC1395 = this.$center$delegate;
        int i2 = AbstractC1170.f3369;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((C7328) interfaceC1395.getValue()).f19546 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((C7328) this.$center$delegate.getValue()).f19546 & 4294967295L));
        long j = ((C7907) this.$parentCenter$delegate.getValue()).f21883;
        this.label = 1;
        AbstractC1170.m2017(fIntBitsToFloat, fIntBitsToFloat2, j, this);
        return c5175 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
