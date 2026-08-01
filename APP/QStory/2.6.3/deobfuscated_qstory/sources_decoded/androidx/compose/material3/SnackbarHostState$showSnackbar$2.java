package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {428, 431}, m = "showSnackbar")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1215 this$0;

    public SnackbarHostState$showSnackbar$2(AbstractC1215 abstractC1215, InterfaceC4357<? super SnackbarHostState$showSnackbar$2> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
