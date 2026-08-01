package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1919 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(C1919 c1919, InterfaceC4356<? super ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c1919;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3457(null, this);
    }
}
