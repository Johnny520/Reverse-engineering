package io.ktor.client.engine.cio;

import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.ConnectionPipelineKt$skipCancels$1", f = "ConnectionPipeline.kt", l = {162, 167, 170, 178, 178}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ConnectionPipelineKt$skipCancels$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4251 $input;
    final /* synthetic */ InterfaceC4246 $output;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipelineKt$skipCancels$1(InterfaceC4246 interfaceC4246, InterfaceC4251 interfaceC4251, InterfaceC4356<? super ConnectionPipelineKt$skipCancels$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$output = interfaceC4246;
        this.$input = interfaceC4251;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ConnectionPipelineKt$skipCancels$1(this.$output, this.$input, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ConnectionPipelineKt$skipCancels$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (io.ktor.utils.io.AbstractC4243.m8667(r10, r0, r16) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (io.ktor.utils.io.AbstractC4243.m8691(r11, Long.MAX_VALUE, r16) != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (((io.ktor.utils.io.C4248) r0).m8714(r16) == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:31:0x00a6, B:33:0x00ae, B:37:0x00c4, B:22:0x0073, B:34:0x00b1, B:19:0x0057), top: B:59:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[Catch: all -> 0x00f9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00dc, B:50:0x00fd, B:51:0x0100, B:25:0x007c), top: B:65:0x007c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c1 -> B:20:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d9 -> B:20:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.ConnectionPipelineKt$skipCancels$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
