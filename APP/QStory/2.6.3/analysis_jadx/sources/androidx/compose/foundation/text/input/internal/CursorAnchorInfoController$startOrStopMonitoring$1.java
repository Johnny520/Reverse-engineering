package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.C5245;
import kotlinx.coroutines.flow.C5284;
import kotlinx.coroutines.flow.C5288;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", l = {154}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CursorAnchorInfoController$startOrStopMonitoring$1 extends SuspendLambda implements InterfaceC6554 {
    int label;
    final /* synthetic */ C0873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoController$startOrStopMonitoring$1(C0873 c0873, InterfaceC4357<? super CursorAnchorInfoController$startOrStopMonitoring$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0873;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CursorAnchorInfo invokeSuspend$lambda$0(C0873 c0873) {
        c0873.getClass();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CursorAnchorInfoController$startOrStopMonitoring$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CursorAnchorInfoController$startOrStopMonitoring$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C5284 c5284M2470 = AbstractC1367.m2470(new C0869(this.this$0, 0));
        C0861 c0861 = new C0861(this.this$0, i2);
        this.label = 1;
        Object objMo8453 = c5284M2470.mo8453(new C5245(new Ref$IntRef(), new C5288(c0861)), this);
        if (objMo8453 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo8453 = c5176;
        }
        if (objMo8453 != coroutineSingletons) {
            objMo8453 = c5176;
        }
        return objMo8453 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
