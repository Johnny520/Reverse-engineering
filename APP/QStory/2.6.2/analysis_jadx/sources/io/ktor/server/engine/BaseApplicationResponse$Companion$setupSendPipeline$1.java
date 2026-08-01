package io.ktor.server.engine;

import bsh.C2632;
import io.ktor.http.content.AbstractC3986;
import io.ktor.server.application.AbstractC4065;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.BaseApplicationResponse$Companion$setupSendPipeline$1", f = "BaseApplicationResponse.kt", l = {321}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationResponse$Companion$setupSendPipeline$1 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BaseApplicationResponse$Companion$setupSendPipeline$1(InterfaceC4356<? super BaseApplicationResponse$Companion$setupSendPipeline$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        BaseApplicationResponse$Companion$setupSendPipeline$1 baseApplicationResponse$Companion$setupSendPipeline$1 = new BaseApplicationResponse$Companion$setupSendPipeline$1(interfaceC4356);
        baseApplicationResponse$Companion$setupSendPipeline$1.L$0 = abstractC4193;
        baseApplicationResponse$Companion$setupSendPipeline$1.L$1 = obj;
        return baseApplicationResponse$Companion$setupSendPipeline$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
        Object obj2 = this.L$1;
        Object obj3 = abstractC4193.f12660;
        if (!AbstractC4065.m8479((InterfaceC4064) obj3)) {
            if (!(obj2 instanceof AbstractC3986)) {
                C2632.m5295(AbstractC4395.f12971.mo8927(obj2.getClass()), "Response pipeline couldn't transform '", "' to the OutgoingContent");
                return null;
            }
            InterfaceC4064 interfaceC4064 = (InterfaceC4064) obj3;
            InterfaceC4133 interfaceC4133Mo8471 = interfaceC4064.mo8471();
            AbstractC4107 abstractC4107 = interfaceC4133Mo8471 instanceof AbstractC4107 ? (AbstractC4107) interfaceC4133Mo8471 : null;
            if (abstractC4107 == null) {
                abstractC4107 = (AbstractC4107) interfaceC4064.getAttributes().m8599(AbstractC4107.f12474);
            }
            this.L$0 = null;
            this.label = 1;
            if (abstractC4107.mo8499((AbstractC3986) obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5175;
    }
}
