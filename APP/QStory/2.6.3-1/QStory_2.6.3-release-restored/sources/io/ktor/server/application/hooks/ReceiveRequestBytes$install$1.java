package io.ktor.server.application.hooks;

import io.ktor.server.application.InterfaceC4897;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.hooks.ReceiveRequestBytes$install$1", m556f = "CommonHooks.kt", m557l = {133}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ReceiveRequestBytes$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7383 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveRequestBytes$install$1(InterfaceC7383 interfaceC7383, InterfaceC5189<? super ReceiveRequestBytes$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7383;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        ReceiveRequestBytes$install$1 receiveRequestBytes$install$1 = new ReceiveRequestBytes$install$1(this.$handler, interfaceC5189);
        receiveRequestBytes$install$1.L$0 = abstractC5026;
        receiveRequestBytes$install$1.L$1 = obj;
        return receiveRequestBytes$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
        Object obj2 = this.L$1;
        if (obj2 instanceof InterfaceC5084) {
            InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.$handler.invoke((InterfaceC4897) abstractC5026.f13009, obj2);
            this.L$0 = null;
            this.label = 1;
            if (abstractC5026.mo9129(interfaceC5084, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
