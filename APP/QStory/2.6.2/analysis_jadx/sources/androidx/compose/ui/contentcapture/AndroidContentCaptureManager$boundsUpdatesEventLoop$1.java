package androidx.compose.ui.contentcapture;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.XOR_INT_LIT16}, m = "boundsUpdatesEventLoop$ui", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ViewOnAttachStateChangeListenerC1421 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421, InterfaceC4356<? super AndroidContentCaptureManager$boundsUpdatesEventLoop$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = viewOnAttachStateChangeListenerC1421;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m2540(this);
    }
}
