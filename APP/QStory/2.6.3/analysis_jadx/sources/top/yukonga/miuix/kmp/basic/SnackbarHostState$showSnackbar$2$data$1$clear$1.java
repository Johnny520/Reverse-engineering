package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.SnackbarHostState$showSnackbar$2$data$1", f = "Snackbar.kt", l = {422}, m = "clear", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class SnackbarHostState$showSnackbar$2$data$1$clear$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5992 this$0;

    public SnackbarHostState$showSnackbar$2$data$1$clear$1(AbstractC5992 abstractC5992, InterfaceC4357<? super SnackbarHostState$showSnackbar$2$data$1$clear$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
