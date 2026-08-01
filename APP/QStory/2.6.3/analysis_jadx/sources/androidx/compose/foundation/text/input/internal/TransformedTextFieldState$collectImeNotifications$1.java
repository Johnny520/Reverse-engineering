package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", l = {769}, m = "collectImeNotifications", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0854 this$0;

    public TransformedTextFieldState$collectImeNotifications$1(AbstractC0854 abstractC0854, InterfaceC4357<? super TransformedTextFieldState$collectImeNotifications$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
