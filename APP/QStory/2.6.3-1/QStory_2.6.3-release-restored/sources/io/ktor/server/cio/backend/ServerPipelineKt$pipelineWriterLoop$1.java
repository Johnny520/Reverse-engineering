package io.ktor.server.cio.backend;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.backend.ServerPipelineKt", m556f = "ServerPipeline.kt", m557l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.REM_DOUBLE_2ADDR, Opcodes.ADD_INT_LIT16}, m558m = "pipelineWriterLoop-dWUq8MI")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ServerPipelineKt$pipelineWriterLoop$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ServerPipelineKt$pipelineWriterLoop$1(InterfaceC5189<? super ServerPipelineKt$pipelineWriterLoop$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4906.m9035(null, 0L, null, this);
    }
}
