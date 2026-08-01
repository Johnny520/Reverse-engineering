package io.ktor.server.cio.backend;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.backend.ServerPipelineKt", m556f = "ServerPipeline.kt", m557l = {190}, m558m = "respondBadRequest")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ServerPipelineKt$respondBadRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ServerPipelineKt$respondBadRequest$1(InterfaceC5189<? super ServerPipelineKt$respondBadRequest$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4906.m9034(null, this);
    }
}
