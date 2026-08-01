package androidx.compose.ui.platform;

import androidx.compose.foundation.text.input.internal.C0861;
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5263;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", f = "WindowRecomposer.android.kt", l = {446}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class MotionDurationScaleImpl$startObservingSystemScaleFactor$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5263 $durationScaleStateFlow;
    int label;
    final /* synthetic */ C1868 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDurationScaleImpl$startObservingSystemScaleFactor$1(InterfaceC5263 interfaceC5263, C1868 c1868, InterfaceC4356<? super MotionDurationScaleImpl$startObservingSystemScaleFactor$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$durationScaleStateFlow = interfaceC5263;
        this.this$0 = c1868;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(this.$durationScaleStateFlow, this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MotionDurationScaleImpl$startObservingSystemScaleFactor$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5263 interfaceC5263 = this.$durationScaleStateFlow;
            C0861 c0861 = new C0861(this.this$0, 4);
            this.label = 1;
            if (interfaceC5263.mo8463(c0861, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C4210.m8612();
        return null;
    }
}
