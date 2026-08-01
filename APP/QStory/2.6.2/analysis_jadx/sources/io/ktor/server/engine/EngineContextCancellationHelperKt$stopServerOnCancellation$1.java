package io.ktor.server.engine;

import io.ktor.server.cio.C4080;
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
@InterfaceC6861(c = "io.ktor.server.engine.EngineContextCancellationHelperKt$stopServerOnCancellation$1", f = "EngineContextCancellationHelper.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class EngineContextCancellationHelperKt$stopServerOnCancellation$1 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ long $gracePeriodMillis;
    final /* synthetic */ InterfaceC4093 $this_stopServerOnCancellation;
    final /* synthetic */ long $timeoutMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineContextCancellationHelperKt$stopServerOnCancellation$1(InterfaceC4093 interfaceC4093, long j, long j2, InterfaceC4356<? super EngineContextCancellationHelperKt$stopServerOnCancellation$1> interfaceC4356) {
        super(1, interfaceC4356);
        this.$this_stopServerOnCancellation = interfaceC4093;
        this.$gracePeriodMillis = j;
        this.$timeoutMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new EngineContextCancellationHelperKt$stopServerOnCancellation$1(this.$this_stopServerOnCancellation, this.$gracePeriodMillis, this.$timeoutMillis, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((EngineContextCancellationHelperKt$stopServerOnCancellation$1) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        ((C4080) this.$this_stopServerOnCancellation).m8490(this.$gracePeriodMillis, this.$timeoutMillis);
        return C5175.f14739;
    }
}
