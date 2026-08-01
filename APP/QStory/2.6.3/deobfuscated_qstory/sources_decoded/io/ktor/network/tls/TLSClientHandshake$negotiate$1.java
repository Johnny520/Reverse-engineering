package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", l = {163, 164, 167, 168}, m = "negotiate")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TLSClientHandshake$negotiate$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4041 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$negotiate$1(AbstractC4041 abstractC4041, InterfaceC4357<? super TLSClientHandshake$negotiate$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4041;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8445(this);
    }
}
