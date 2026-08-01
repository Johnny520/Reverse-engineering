package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt", m556f = "KtorServer.kt", m557l = {74}, m558m = "mcpSseEndpoint")
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class KtorServerKt$mcpSseEndpoint$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public KtorServerKt$mcpSseEndpoint$1(InterfaceC5189<? super KtorServerKt$mcpSseEndpoint$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        AbstractC5124.m9290(null, null, this);
        return C6008.f15084;
    }
}
