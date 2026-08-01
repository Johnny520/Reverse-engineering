package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC0349;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {823, 826}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
final class AnalogTimePickerState$rotateTo$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ float $angle;
    final /* synthetic */ boolean $animate;
    final /* synthetic */ InterfaceC0349 $animationSpec;
    int label;
    final /* synthetic */ AbstractC1179 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$rotateTo$2(AbstractC1179 abstractC1179, float f, boolean z, InterfaceC0349 interfaceC0349, InterfaceC4357<? super AnalogTimePickerState$rotateTo$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.$angle = f;
        this.$animate = z;
        this.$animationSpec = interfaceC0349;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new AnalogTimePickerState$rotateTo$2(null, this.$angle, this.$animate, this.$animationSpec, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<Object> interfaceC4357) {
        return ((AnalogTimePickerState$rotateTo$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        if (i == 2) {
            AbstractC5185.m10210(obj);
            return obj;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
