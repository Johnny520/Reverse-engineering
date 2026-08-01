package androidx.compose.p001ui.scrollcapture;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", m556f = "ComposeScrollCaptureCallback.android.kt", m557l = {134, 137}, m558m = "onScrollCaptureImageRequest", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollCaptureCallbackC2767 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(ScrollCaptureCallbackC2767 scrollCaptureCallbackC2767, InterfaceC5189<? super ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = scrollCaptureCallbackC2767;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC2767.m4198(this.this$0, null, null, this);
    }
}
