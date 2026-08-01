package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSSocket", f = "TLSClientSessionJvm.kt", l = {75, 79}, m = "appDataOutputLoop")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TLSSocket$appDataOutputLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4038 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSSocket$appDataOutputLoop$1(C4038 c4038, InterfaceC4357<? super TLSSocket$appDataOutputLoop$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4038;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C4038.m8442(this.this$0, null, this);
    }
}
