package androidx.compose.ui.scrollcapture;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {134, 137}, m = "onScrollCaptureImageRequest", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollCaptureCallbackC1932 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932, InterfaceC4356<? super ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = scrollCaptureCallbackC1932;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC1932.m3628(this.this$0, null, null, this);
    }
}
