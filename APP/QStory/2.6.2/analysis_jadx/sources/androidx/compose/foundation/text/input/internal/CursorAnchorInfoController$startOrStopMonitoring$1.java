package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.C5244;
import kotlinx.coroutines.flow.C5283;
import kotlinx.coroutines.flow.C5287;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", l = {154}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CursorAnchorInfoController$startOrStopMonitoring$1 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ C0873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoController$startOrStopMonitoring$1(C0873 c0873, InterfaceC4356<? super CursorAnchorInfoController$startOrStopMonitoring$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0873;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CursorAnchorInfo invokeSuspend$lambda$0(C0873 c0873) {
        c0873.getClass();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CursorAnchorInfoController$startOrStopMonitoring$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CursorAnchorInfoController$startOrStopMonitoring$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C5283 c5283M2461 = AbstractC1367.m2461(new C0869(this.this$0, 0));
        C0861 c0861 = new C0861(this.this$0, i2);
        this.label = 1;
        Object objMo8463 = c5283M2461.mo8463(new C5244(new Ref$IntRef(), new C5287(c0861)), this);
        if (objMo8463 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo8463 = c5175;
        }
        if (objMo8463 != coroutineSingletons) {
            objMo8463 = c5175;
        }
        return objMo8463 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
