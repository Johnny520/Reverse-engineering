package io.ktor.server.engine;

import io.ktor.server.cio.C4913;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.ApplicationEngine$stopSuspend$2", m556f = "ApplicationEngine.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ApplicationEngine$stopSuspend$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $gracePeriodMillis;
    final /* synthetic */ long $timeoutMillis;
    int label;
    final /* synthetic */ InterfaceC4926 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationEngine$stopSuspend$2(InterfaceC4926 interfaceC4926, long j, long j2, InterfaceC5189<? super ApplicationEngine$stopSuspend$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = interfaceC4926;
        this.$gracePeriodMillis = j;
        this.$timeoutMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ApplicationEngine$stopSuspend$2(this.this$0, this.$gracePeriodMillis, this.$timeoutMillis, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ApplicationEngine$stopSuspend$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        ((C4913) this.this$0).m9039(this.$gracePeriodMillis, this.$timeoutMillis);
        return C6008.f15084;
    }
}
