package io.ktor.util.pipeline;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", l = {504}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "subject", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/lang/Void;Ljava/lang/Void;)V"}, k = 3, mv = {2, 0, 0})
public final class PipelineKt$intercept$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipelineKt$intercept$1(InterfaceC6550 interfaceC6550, InterfaceC4356<? super PipelineKt$intercept$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$block = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        PipelineKt$intercept$1 pipelineKt$intercept$1 = new PipelineKt$intercept$1(this.$block, interfaceC4356);
        pipelineKt$intercept$1.L$0 = abstractC4193;
        pipelineKt$intercept$1.L$1 = obj;
        return pipelineKt$intercept$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4394.m8919();
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
