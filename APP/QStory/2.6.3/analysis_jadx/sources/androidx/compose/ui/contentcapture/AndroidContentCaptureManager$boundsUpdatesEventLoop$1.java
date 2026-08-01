package androidx.compose.ui.contentcapture;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.XOR_INT_LIT16}, m = "boundsUpdatesEventLoop$ui", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ViewOnAttachStateChangeListenerC1421 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421, InterfaceC4357<? super AndroidContentCaptureManager$boundsUpdatesEventLoop$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = viewOnAttachStateChangeListenerC1421;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m2550(this);
    }
}
