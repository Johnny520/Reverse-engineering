package io.ktor.server.sse;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.sse.SSEServerContent", f = "SSEServerContent.kt", l = {37, 42, 42}, m = "writeTo")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SSEServerContent$writeTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4173 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEServerContent$writeTo$1(C4173 c4173, InterfaceC4357<? super SSEServerContent$writeTo$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4173;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8382(null, this);
    }
}
