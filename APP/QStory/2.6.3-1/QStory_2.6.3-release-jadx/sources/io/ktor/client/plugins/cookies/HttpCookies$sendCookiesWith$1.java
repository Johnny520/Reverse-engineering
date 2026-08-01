package io.ktor.client.plugins.cookies;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cookies.HttpCookies", m556f = "HttpCookies.kt", m557l = {59}, m558m = "sendCookiesWith$ktor_client_core")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpCookies$sendCookiesWith$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4728 this$0;

    public HttpCookies$sendCookiesWith$1(AbstractC4728 abstractC4728, InterfaceC5189<? super HttpCookies$sendCookiesWith$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
