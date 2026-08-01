package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {428, 431}, m = "showSnackbar")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1215 this$0;

    public SnackbarHostState$showSnackbar$2(AbstractC1215 abstractC1215, InterfaceC4356<? super SnackbarHostState$showSnackbar$2> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
