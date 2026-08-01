package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol", f = "Protocol.kt", l = {198}, m = "onNotification")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Protocol$onNotification$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4307 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$onNotification$1(AbstractC4307 abstractC4307, InterfaceC4357<? super Protocol$onNotification$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4307;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4307.m8736(this.this$0, null, this);
    }
}
