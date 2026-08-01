package io.ktor.server.engine;

import bsh.C2633;
import io.ktor.http.content.AbstractC3987;
import io.ktor.server.application.AbstractC4066;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.BaseApplicationResponse$Companion$setupSendPipeline$1", f = "BaseApplicationResponse.kt", l = {321}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationResponse$Companion$setupSendPipeline$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BaseApplicationResponse$Companion$setupSendPipeline$1(InterfaceC4357<? super BaseApplicationResponse$Companion$setupSendPipeline$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        BaseApplicationResponse$Companion$setupSendPipeline$1 baseApplicationResponse$Companion$setupSendPipeline$1 = new BaseApplicationResponse$Companion$setupSendPipeline$1(interfaceC4357);
        baseApplicationResponse$Companion$setupSendPipeline$1.L$0 = abstractC4194;
        baseApplicationResponse$Companion$setupSendPipeline$1.L$1 = obj;
        return baseApplicationResponse$Companion$setupSendPipeline$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
        Object obj2 = this.L$1;
        Object obj3 = abstractC4194.f12664;
        if (!AbstractC4066.m8469((InterfaceC4065) obj3)) {
            if (!(obj2 instanceof AbstractC3987)) {
                C2633.m5340(AbstractC4396.f12975.mo8917(obj2.getClass()), "Response pipeline couldn't transform '", "' to the OutgoingContent");
                return null;
            }
            InterfaceC4065 interfaceC4065 = (InterfaceC4065) obj3;
            InterfaceC4134 interfaceC4134Mo8461 = interfaceC4065.mo8461();
            AbstractC4108 abstractC4108 = interfaceC4134Mo8461 instanceof AbstractC4108 ? (AbstractC4108) interfaceC4134Mo8461 : null;
            if (abstractC4108 == null) {
                abstractC4108 = (AbstractC4108) interfaceC4065.getAttributes().m8589(AbstractC4108.f12478);
            }
            this.L$0 = null;
            this.label = 1;
            if (abstractC4108.mo8489((AbstractC3987) obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5176;
    }
}
