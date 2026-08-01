package androidx.compose.p001ui.contentcapture;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", m556f = "AndroidContentCaptureManager.android.kt", m557l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.XOR_INT_LIT16}, m558m = "boundsUpdatesEventLoop$ui", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ViewOnAttachStateChangeListenerC2256 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256, InterfaceC5189<? super AndroidContentCaptureManager$boundsUpdatesEventLoop$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = viewOnAttachStateChangeListenerC2256;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3110(this);
    }
}
