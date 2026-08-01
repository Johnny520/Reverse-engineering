package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt", f = "KtorServer.kt", l = {74}, m = "mcpSseEndpoint")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class KtorServerKt$mcpSseEndpoint$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public KtorServerKt$mcpSseEndpoint$1(InterfaceC4357<? super KtorServerKt$mcpSseEndpoint$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        AbstractC4292.m8731(null, null, this);
        return C5176.f14739;
    }
}
