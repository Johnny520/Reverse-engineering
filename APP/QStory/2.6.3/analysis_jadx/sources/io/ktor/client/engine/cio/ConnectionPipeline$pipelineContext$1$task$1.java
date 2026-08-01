package io.ktor.client.engine.cio;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
@InterfaceC6862(c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1$task$1", f = "ConnectionPipeline.kt", l = {45}, m = "invokeSuspend")
public final class ConnectionPipeline$pipelineContext$1$task$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5207 $tasks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$pipelineContext$1$task$1(InterfaceC5207 interfaceC5207, InterfaceC4357<? super ConnectionPipeline$pipelineContext$1$task$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$tasks = interfaceC5207;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ConnectionPipeline$pipelineContext$1$task$1(this.$tasks, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((ConnectionPipeline$pipelineContext$1$task$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC5207 interfaceC5207 = this.$tasks;
        this.label = 1;
        Object objMo10244 = interfaceC5207.mo10244(this);
        return objMo10244 == coroutineSingletons ? coroutineSingletons : objMo10244;
    }
}
