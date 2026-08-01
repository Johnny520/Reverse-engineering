package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC2230;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import p221.C8737;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", m556f = "TimePicker.kt", m557l = {1769}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class TimePickerKt$ClockText$2$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ InterfaceC2230 $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ InterfaceC2230 $parentCenter$delegate;
    final /* synthetic */ AbstractC2014 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2$1$1$1(AbstractC2014 abstractC2014, float f, boolean z, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC5189<? super TimePickerKt$ClockText$2$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$maxDist = f;
        this.$autoSwitchToMinute = z;
        this.$center$delegate = interfaceC2230;
        this.$parentCenter$delegate = interfaceC22302;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TimePickerKt$ClockText$2$1$1$1(null, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TimePickerKt$ClockText$2$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC2230 interfaceC2230 = this.$center$delegate;
        int i2 = AbstractC2005.f3715;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((C8158) interfaceC2230.getValue()).f19886 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((C8158) this.$center$delegate.getValue()).f19886 & 4294967295L));
        long j = ((C8737) this.$parentCenter$delegate.getValue()).f22225;
        this.label = 1;
        AbstractC2005.m2587(fIntBitsToFloat, fIntBitsToFloat2, j, this);
        return c6008 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
