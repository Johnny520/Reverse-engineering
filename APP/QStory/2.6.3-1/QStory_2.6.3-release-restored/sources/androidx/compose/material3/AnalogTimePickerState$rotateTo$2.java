package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC1195;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", m556f = "TimePicker.kt", m557l = {823, 826}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, m151d2 = {"<anonymous>", ""}, m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class AnalogTimePickerState$rotateTo$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ float $angle;
    final /* synthetic */ boolean $animate;
    final /* synthetic */ InterfaceC1195 $animationSpec;
    int label;
    final /* synthetic */ AbstractC2014 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$rotateTo$2(AbstractC2014 abstractC2014, float f, boolean z, InterfaceC1195 interfaceC1195, InterfaceC5189<? super AnalogTimePickerState$rotateTo$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.$angle = f;
        this.$animate = z;
        this.$animationSpec = interfaceC1195;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new AnalogTimePickerState$rotateTo$2(null, this.$angle, this.$animate, this.$animationSpec, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<Object> interfaceC5189) {
        return ((AnalogTimePickerState$rotateTo$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        if (i == 2) {
            AbstractC6017.m10769(obj);
            return obj;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
