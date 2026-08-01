package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.PullToRefreshState", f = "PullToRefresh.kt", l = {356, 361}, m = "handlePointerRelease$miuix", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class PullToRefreshState$handlePointerRelease$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5997 this$0;

    public PullToRefreshState$handlePointerRelease$1(AbstractC5997 abstractC5997, InterfaceC4356<? super PullToRefreshState$handlePointerRelease$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
