package androidx.compose.foundation.gestures;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollingLogic.kt", l = {Opcodes.DIV_INT_LIT8, 273}, m = "dispatchMouseWheelScroll", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0554 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(C0554 c0554, InterfaceC4356<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c0554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C0554.m1336(this.this$0, null, null, 0.0f, 0.0f, this);
    }
}
