package io.ktor.server.engine;

import io.ktor.server.cio.C4080;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.ApplicationEngine$stopSuspend$2", f = "ApplicationEngine.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ApplicationEngine$stopSuspend$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $gracePeriodMillis;
    final /* synthetic */ long $timeoutMillis;
    int label;
    final /* synthetic */ InterfaceC4093 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationEngine$stopSuspend$2(InterfaceC4093 interfaceC4093, long j, long j2, InterfaceC4356<? super ApplicationEngine$stopSuspend$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = interfaceC4093;
        this.$gracePeriodMillis = j;
        this.$timeoutMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ApplicationEngine$stopSuspend$2(this.this$0, this.$gracePeriodMillis, this.$timeoutMillis, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ApplicationEngine$stopSuspend$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        ((C4080) this.this$0).m8490(this.$gracePeriodMillis, this.$timeoutMillis);
        return C5175.f14739;
    }
}
