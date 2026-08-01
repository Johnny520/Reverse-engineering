package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC1395;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import p205.C7908;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class TimePickerKt$ClockText$2$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ InterfaceC1395 $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ InterfaceC1395 $parentCenter$delegate;
    final /* synthetic */ AbstractC1179 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2$1$1$1(AbstractC1179 abstractC1179, float f, boolean z, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4357<? super TimePickerKt$ClockText$2$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$maxDist = f;
        this.$autoSwitchToMinute = z;
        this.$center$delegate = interfaceC1395;
        this.$parentCenter$delegate = interfaceC13952;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TimePickerKt$ClockText$2$1$1$1(null, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TimePickerKt$ClockText$2$1$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC1395 interfaceC1395 = this.$center$delegate;
        int i2 = AbstractC1170.f3370;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((C7329) interfaceC1395.getValue()).f19541 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((C7329) this.$center$delegate.getValue()).f19541 & 4294967295L));
        long j = ((C7908) this.$parentCenter$delegate.getValue()).f21880;
        this.label = 1;
        AbstractC1170.m2027(fIntBitsToFloat, fIntBitsToFloat2, j, this);
        return c5176 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
