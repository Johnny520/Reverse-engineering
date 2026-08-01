package io.ktor.client.plugins.cookies;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", l = {54}, m = "captureHeaderCookies$ktor_client_core")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCookies$captureHeaderCookies$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3896 this$0;

    public HttpCookies$captureHeaderCookies$1(AbstractC3896 abstractC3896, InterfaceC4357<? super HttpCookies$captureHeaderCookies$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
