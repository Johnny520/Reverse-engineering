package io.ktor.server.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationEngine", f = "CIOApplicationEngine.kt", l = {69, 73}, m = "startSuspend")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CIOApplicationEngine$startSuspend$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4081 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$startSuspend$1(C4081 c4081, InterfaceC4357<? super CIOApplicationEngine$startSuspend$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4081;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8481(false, this);
    }
}
