package io.ktor.server.engine;

import bsh.C3466;
import io.ktor.http.content.AbstractC4819;
import io.ktor.server.application.AbstractC4898;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.BaseApplicationResponse$Companion$setupSendPipeline$1", m556f = "BaseApplicationResponse.kt", m557l = {321}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BaseApplicationResponse$Companion$setupSendPipeline$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BaseApplicationResponse$Companion$setupSendPipeline$1(InterfaceC5189<? super BaseApplicationResponse$Companion$setupSendPipeline$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        BaseApplicationResponse$Companion$setupSendPipeline$1 baseApplicationResponse$Companion$setupSendPipeline$1 = new BaseApplicationResponse$Companion$setupSendPipeline$1(interfaceC5189);
        baseApplicationResponse$Companion$setupSendPipeline$1.L$0 = abstractC5026;
        baseApplicationResponse$Companion$setupSendPipeline$1.L$1 = obj;
        return baseApplicationResponse$Companion$setupSendPipeline$1.invokeSuspend(C6008.f15084);
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
        Object obj3 = abstractC5026.f13009;
        if (!AbstractC4898.m9028((InterfaceC4897) obj3)) {
            if (!(obj2 instanceof AbstractC4819)) {
                C3466.m5900(AbstractC5228.f13320.mo9476(obj2.getClass()), "Response pipeline couldn't transform '", "' to the OutgoingContent");
                return null;
            }
            InterfaceC4897 interfaceC4897 = (InterfaceC4897) obj3;
            InterfaceC4966 interfaceC4966Mo9020 = interfaceC4897.mo9020();
            AbstractC4940 abstractC4940 = interfaceC4966Mo9020 instanceof AbstractC4940 ? (AbstractC4940) interfaceC4966Mo9020 : null;
            if (abstractC4940 == null) {
                abstractC4940 = (AbstractC4940) interfaceC4897.getAttributes().m9148(AbstractC4940.f12823);
            }
            this.L$0 = null;
            this.label = 1;
            if (abstractC4940.mo9048((AbstractC4819) obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
