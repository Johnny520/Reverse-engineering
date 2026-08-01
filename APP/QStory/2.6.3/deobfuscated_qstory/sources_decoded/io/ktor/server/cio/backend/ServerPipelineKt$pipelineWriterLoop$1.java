package io.ktor.server.cio.backend;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.backend.ServerPipelineKt", f = "ServerPipeline.kt", l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.REM_DOUBLE_2ADDR, Opcodes.ADD_INT_LIT16}, m = "pipelineWriterLoop-dWUq8MI")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ServerPipelineKt$pipelineWriterLoop$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ServerPipelineKt$pipelineWriterLoop$1(InterfaceC4357<? super ServerPipelineKt$pipelineWriterLoop$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4074.m8476(null, 0L, null, this);
    }
}
