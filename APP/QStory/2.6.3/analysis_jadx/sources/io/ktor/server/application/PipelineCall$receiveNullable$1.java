package io.ktor.server.application;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.PipelineCall$DefaultImpls", f = "PipelineCall.kt", l = {92}, m = "receiveNullable")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PipelineCall$receiveNullable$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public PipelineCall$receiveNullable$1(InterfaceC4357<? super PipelineCall$receiveNullable$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4060.m8465(null, null, this);
    }
}
