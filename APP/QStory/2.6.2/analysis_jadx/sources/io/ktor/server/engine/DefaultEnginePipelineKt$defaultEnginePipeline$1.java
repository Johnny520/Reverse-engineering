package io.ktor.server.engine;

import io.ktor.server.application.InterfaceC4064;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1", f = "DefaultEnginePipeline.kt", l = {123, 42, 35, 42, 39, 42, 42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class DefaultEnginePipelineKt$defaultEnginePipeline$1 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1", f = "DefaultEnginePipeline.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6557 {
        final /* synthetic */ AbstractC4193 $$this$intercept;
        final /* synthetic */ ChannelIOException $error;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC4193 abstractC4193, ChannelIOException channelIOException, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(1, interfaceC4356);
            this.$$this$intercept = abstractC4193;
            this.$error = channelIOException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$$this$intercept, this.$error, interfaceC4356);
        }

        @Override // p052.InterfaceC6557
        public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            AbstractC4092.m8505(((InterfaceC4064) this.$$this$intercept.f12660).mo8470().f12337, (InterfaceC4064) this.$$this$intercept.f12660, this.$error);
            return C5175.f14739;
        }
    }

    public DefaultEnginePipelineKt$defaultEnginePipeline$1(InterfaceC4356<? super DefaultEnginePipelineKt$defaultEnginePipeline$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultEnginePipelineKt$defaultEnginePipeline$1 defaultEnginePipelineKt$defaultEnginePipeline$1 = new DefaultEnginePipelineKt$defaultEnginePipeline$1(interfaceC4356);
        defaultEnginePipelineKt$defaultEnginePipeline$1.L$0 = abstractC4193;
        return defaultEnginePipelineKt$defaultEnginePipeline$1.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r8 != r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (io.ktor.utils.io.AbstractC4243.m8691(r9, Long.MAX_VALUE, r8) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (io.ktor.utils.io.AbstractC4243.m8691(r9, Long.MAX_VALUE, r8) != r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        if (io.ktor.utils.io.AbstractC4243.m8691(r1, Long.MAX_VALUE, r8) != r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r6v7, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v1, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v6, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v8, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
