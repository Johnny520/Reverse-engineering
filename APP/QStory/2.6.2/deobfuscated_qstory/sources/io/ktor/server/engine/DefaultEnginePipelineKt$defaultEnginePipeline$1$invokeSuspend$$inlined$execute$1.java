package io.ktor.server.engine;

import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V", "io/ktor/util/pipeline/PipelineKt$execute$2"}, k = 3, mv = {2, 0, 0})
@InterfaceC6861(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", l = {488}, m = "invokeSuspend")
public final class DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ Object $context;
    final /* synthetic */ AbstractC4194 $this_execute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1(AbstractC4194 abstractC4194, Object obj, InterfaceC4356 interfaceC4356) {
        super(1, interfaceC4356);
        this.$this_execute = abstractC4194;
        this.$context = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1(this.$this_execute, this.$context, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4194 abstractC4194 = this.$this_execute;
            Object obj2 = this.$context;
            this.label = 1;
            if (abstractC4194.m8584(obj2, c5175, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return c5175;
    }
}
