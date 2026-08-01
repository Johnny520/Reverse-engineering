package io.ktor.server.cio;

import io.ktor.http.cio.C3966;
import io.ktor.server.cio.backend.C4073;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationEngine$startConnector$1", f = "CIOApplicationEngine.kt", l = {112}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/server/cio/backend/飘花落叶言子楪世兰苏哲;", "Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;", "request", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/cio/backend/飘花落叶言子楪世兰苏哲;Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$startConnector$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C4081 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$startConnector$1(C4081 c4081, InterfaceC4357<? super CIOApplicationEngine$startConnector$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = c4081;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C4073 c4073, C3966 c3966, InterfaceC4357<? super C5176> interfaceC4357) {
        CIOApplicationEngine$startConnector$1 cIOApplicationEngine$startConnector$1 = new CIOApplicationEngine$startConnector$1(this.this$0, interfaceC4357);
        cIOApplicationEngine$startConnector$1.L$0 = c4073;
        cIOApplicationEngine$startConnector$1.L$1 = c3966;
        return cIOApplicationEngine$startConnector$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C4073 c4073 = (C4073) this.L$0;
        C3966 c3966 = (C3966) this.L$1;
        C4081 c4081 = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object objM10470 = AbstractC5399.m10470(c4081.f12393, new CIOApplicationEngine$handleRequest$2(c4081, c3966, c4073, null), this);
        if (objM10470 != coroutineSingletons) {
            objM10470 = c5176;
        }
        return objM10470 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
