package androidx.compose.ui.platform;

import androidx.compose.foundation.text.input.internal.C0861;
import io.ktor.util.C4211;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5264;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", f = "WindowRecomposer.android.kt", l = {446}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class MotionDurationScaleImpl$startObservingSystemScaleFactor$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5264 $durationScaleStateFlow;
    int label;
    final /* synthetic */ C1868 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDurationScaleImpl$startObservingSystemScaleFactor$1(InterfaceC5264 interfaceC5264, C1868 c1868, InterfaceC4357<? super MotionDurationScaleImpl$startObservingSystemScaleFactor$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$durationScaleStateFlow = interfaceC5264;
        this.this$0 = c1868;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(this.$durationScaleStateFlow, this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MotionDurationScaleImpl$startObservingSystemScaleFactor$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5264 interfaceC5264 = this.$durationScaleStateFlow;
            C0861 c0861 = new C0861(this.this$0, 4);
            this.label = 1;
            if (interfaceC5264.mo8453(c0861, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        C4211.m8602();
        return null;
    }
}
