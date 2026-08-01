package io.ktor.server.cio;

import io.ktor.http.cio.C4798;
import io.ktor.server.cio.backend.C4905;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.CIOApplicationEngine$startConnector$1", m556f = "CIOApplicationEngine.kt", m557l = {112}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/server/cio/backend/飘花落叶言子楪世兰苏哲;", "Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;", "request", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/cio/backend/飘花落叶言子楪世兰苏哲;Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOApplicationEngine$startConnector$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C4913 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$startConnector$1(C4913 c4913, InterfaceC5189<? super CIOApplicationEngine$startConnector$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = c4913;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C4905 c4905, C4798 c4798, InterfaceC5189<? super C6008> interfaceC5189) {
        CIOApplicationEngine$startConnector$1 cIOApplicationEngine$startConnector$1 = new CIOApplicationEngine$startConnector$1(this.this$0, interfaceC5189);
        cIOApplicationEngine$startConnector$1.L$0 = c4905;
        cIOApplicationEngine$startConnector$1.L$1 = c4798;
        return cIOApplicationEngine$startConnector$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        C4905 c4905 = (C4905) this.L$0;
        C4798 c4798 = (C4798) this.L$1;
        C4913 c4913 = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object objM11029 = AbstractC6231.m11029(c4913.f12738, new CIOApplicationEngine$handleRequest$2(c4913, c4798, c4905, null), this);
        if (objM11029 != coroutineSingletons) {
            objM11029 = c6008;
        }
        return objM11029 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
