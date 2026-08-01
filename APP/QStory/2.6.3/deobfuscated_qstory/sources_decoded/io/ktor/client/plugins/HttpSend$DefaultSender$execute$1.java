package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", l = {118}, m = "execute")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpSend$DefaultSender$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3928 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$DefaultSender$execute$1(AbstractC3928 abstractC3928, InterfaceC4357<? super HttpSend$DefaultSender$execute$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC3928;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
