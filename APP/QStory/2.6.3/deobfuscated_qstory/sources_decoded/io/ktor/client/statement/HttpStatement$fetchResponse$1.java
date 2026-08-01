package io.ktor.client.statement;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {147, 148, 149}, m = "fetchResponse")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpStatement$fetchResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3943 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpStatement$fetchResponse$1(AbstractC3943 abstractC3943, InterfaceC4357<? super HttpStatement$fetchResponse$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC3943;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
