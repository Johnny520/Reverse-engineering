package io.ktor.client.engine.cio;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
@InterfaceC6861(c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1$task$1", f = "ConnectionPipeline.kt", l = {45}, m = "invokeSuspend")
public final class ConnectionPipeline$pipelineContext$1$task$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5206 $tasks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$pipelineContext$1$task$1(InterfaceC5206 interfaceC5206, InterfaceC4356<? super ConnectionPipeline$pipelineContext$1$task$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$tasks = interfaceC5206;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ConnectionPipeline$pipelineContext$1$task$1(this.$tasks, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((ConnectionPipeline$pipelineContext$1$task$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC5206 interfaceC5206 = this.$tasks;
        this.label = 1;
        Object objMo10240 = interfaceC5206.mo10240(this);
        return objMo10240 == coroutineSingletons ? coroutineSingletons : objMo10240;
    }
}
