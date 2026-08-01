package io.ktor.server.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationResponse", f = "CIOApplicationResponse.kt", l = {105, 108}, m = "sendResponseMessage")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CIOApplicationResponse$sendResponseMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4085 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationResponse$sendResponseMessage$1(C4085 c4085, InterfaceC4357<? super CIOApplicationResponse$sendResponseMessage$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4085;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4085 c4085 = this.this$0;
        int i = C4085.f12408;
        return c4085.m8486(false, this);
    }
}
