package androidx.compose.ui.platform;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {Opcodes.DIV_INT_LIT8}, m = "textInputSession", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1923 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$1(C1923 c1923, InterfaceC4356<? super ChainedPlatformTextInputInterceptor$textInputSession$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c1923;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3624(null, null, this);
    }
}
