package io.ktor.server.engine;

import io.ktor.server.application.InterfaceC4056;
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
@InterfaceC6861(c = "io.ktor.server.engine.DefaultEnginePipelineKt$logError$2", f = "DefaultEnginePipeline.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class DefaultEnginePipelineKt$logError$2 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC4056 $call;
    final /* synthetic */ Throwable $error;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultEnginePipelineKt$logError$2(InterfaceC4056 interfaceC4056, Throwable th, InterfaceC4356<? super DefaultEnginePipelineKt$logError$2> interfaceC4356) {
        super(1, interfaceC4356);
        this.$call = interfaceC4056;
        this.$error = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new DefaultEnginePipelineKt$logError$2(this.$call, this.$error, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultEnginePipelineKt$logError$2) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        AbstractC4092.m8505(this.$call.mo8470().f12337, this.$call, this.$error);
        return C5175.f14739;
    }
}
