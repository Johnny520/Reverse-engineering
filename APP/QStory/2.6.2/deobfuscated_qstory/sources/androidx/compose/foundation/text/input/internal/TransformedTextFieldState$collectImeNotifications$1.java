package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", l = {769}, m = "collectImeNotifications", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0854 this$0;

    public TransformedTextFieldState$collectImeNotifications$1(AbstractC0854 abstractC0854, InterfaceC4356<? super TransformedTextFieldState$collectImeNotifications$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
