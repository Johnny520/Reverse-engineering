package io.ktor.server.application;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.application.PipelineCall$DefaultImpls", f = "PipelineCall.kt", l = {92}, m = "receiveNullable")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PipelineCall$receiveNullable$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public PipelineCall$receiveNullable$1(InterfaceC4356<? super PipelineCall$receiveNullable$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4059.m8475(null, null, this);
    }
}
