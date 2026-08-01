package io.ktor.server.cio;

import io.ktor.http.cio.C3965;
import io.ktor.server.cio.backend.C4072;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.CIOApplicationEngine$startConnector$1", f = "CIOApplicationEngine.kt", l = {112}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/server/cio/backend/飘花落叶言子楪世兰苏哲;", "Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;", "request", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/cio/backend/飘花落叶言子楪世兰苏哲;Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$startConnector$1 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C4080 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$startConnector$1(C4080 c4080, InterfaceC4356<? super CIOApplicationEngine$startConnector$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.this$0 = c4080;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C4072 c4072, C3965 c3965, InterfaceC4356<? super C5175> interfaceC4356) {
        CIOApplicationEngine$startConnector$1 cIOApplicationEngine$startConnector$1 = new CIOApplicationEngine$startConnector$1(this.this$0, interfaceC4356);
        cIOApplicationEngine$startConnector$1.L$0 = c4072;
        cIOApplicationEngine$startConnector$1.L$1 = c3965;
        return cIOApplicationEngine$startConnector$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C4072 c4072 = (C4072) this.L$0;
        C3965 c3965 = (C3965) this.L$1;
        C4080 c4080 = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object objM10466 = AbstractC5398.m10466(c4080.f12389, new CIOApplicationEngine$handleRequest$2(c4080, c3965, c4072, null), this);
        if (objM10466 != coroutineSingletons) {
            objM10466 = c5175;
        }
        return objM10466 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
