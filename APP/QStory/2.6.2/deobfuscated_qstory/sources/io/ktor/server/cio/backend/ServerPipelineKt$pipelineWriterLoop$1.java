package io.ktor.server.cio.backend;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.backend.ServerPipelineKt", f = "ServerPipeline.kt", l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.REM_DOUBLE_2ADDR, Opcodes.ADD_INT_LIT16}, m = "pipelineWriterLoop-dWUq8MI")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ServerPipelineKt$pipelineWriterLoop$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ServerPipelineKt$pipelineWriterLoop$1(InterfaceC4356<? super ServerPipelineKt$pipelineWriterLoop$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4073.m8486(null, 0L, null, this);
    }
}
