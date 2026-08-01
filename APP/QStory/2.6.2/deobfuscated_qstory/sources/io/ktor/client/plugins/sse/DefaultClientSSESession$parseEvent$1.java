package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", l = {47, 49, 98}, m = "parseEvent")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultClientSSESession$parseEvent$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3905 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$parseEvent$1(C3905 c3905, InterfaceC4356<? super DefaultClientSSESession$parseEvent$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c3905;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C3905.m8295(this.this$0, null, this);
    }
}
