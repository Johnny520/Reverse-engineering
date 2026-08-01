package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.PullToRefreshState", f = "PullToRefresh.kt", l = {325}, m = "startRefreshing$miuix", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class PullToRefreshState$startRefreshing$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC6003 this$0;

    public PullToRefreshState$startRefreshing$1(AbstractC6003 abstractC6003, InterfaceC4357<? super PullToRefreshState$startRefreshing$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
