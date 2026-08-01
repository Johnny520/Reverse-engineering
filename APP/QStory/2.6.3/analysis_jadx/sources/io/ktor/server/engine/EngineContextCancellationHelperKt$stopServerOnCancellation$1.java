package io.ktor.server.engine;

import io.ktor.server.cio.C4081;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.EngineContextCancellationHelperKt$stopServerOnCancellation$1", f = "EngineContextCancellationHelper.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class EngineContextCancellationHelperKt$stopServerOnCancellation$1 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ long $gracePeriodMillis;
    final /* synthetic */ InterfaceC4094 $this_stopServerOnCancellation;
    final /* synthetic */ long $timeoutMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineContextCancellationHelperKt$stopServerOnCancellation$1(InterfaceC4094 interfaceC4094, long j, long j2, InterfaceC4357<? super EngineContextCancellationHelperKt$stopServerOnCancellation$1> interfaceC4357) {
        super(1, interfaceC4357);
        this.$this_stopServerOnCancellation = interfaceC4094;
        this.$gracePeriodMillis = j;
        this.$timeoutMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new EngineContextCancellationHelperKt$stopServerOnCancellation$1(this.$this_stopServerOnCancellation, this.$gracePeriodMillis, this.$timeoutMillis, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((EngineContextCancellationHelperKt$stopServerOnCancellation$1) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        ((C4081) this.$this_stopServerOnCancellation).m8480(this.$gracePeriodMillis, this.$timeoutMillis);
        return C5176.f14739;
    }
}
