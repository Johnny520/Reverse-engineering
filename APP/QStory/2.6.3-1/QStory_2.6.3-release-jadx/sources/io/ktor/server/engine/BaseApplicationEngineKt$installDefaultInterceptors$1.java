package io.ktor.server.engine;

import io.ktor.server.application.AbstractC4898;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.routing.AbstractC4976;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7380;
import p075.C7686;
import p079.InterfaceC7691;
import p252.C8926;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultInterceptors$1", m556f = "BaseApplicationEngine.kt", m557l = {131}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BaseApplicationEngineKt$installDefaultInterceptors$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    int label;

    public BaseApplicationEngineKt$installDefaultInterceptors$1(InterfaceC5189<? super BaseApplicationEngineKt$installDefaultInterceptors$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        BaseApplicationEngineKt$installDefaultInterceptors$1 baseApplicationEngineKt$installDefaultInterceptors$1 = new BaseApplicationEngineKt$installDefaultInterceptors$1(interfaceC5189);
        baseApplicationEngineKt$installDefaultInterceptors$1.L$0 = abstractC5026;
        return baseApplicationEngineKt$installDefaultInterceptors$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        InterfaceC5919 interfaceC5919M9471 = null;
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
        Object obj2 = ((AbstractC5026) this.L$0).f13009;
        if (!AbstractC4898.m9028((InterfaceC4897) obj2)) {
            InterfaceC4897 interfaceC4897 = (InterfaceC4897) obj2;
            C8926 c8926Mo959 = interfaceC4897.mo9020().mo959();
            if (c8926Mo959 == null && (c8926Mo959 = (C8926) interfaceC4897.getAttributes().m9146(AbstractC4976.f12907)) == null) {
                c8926Mo959 = C8926.f22690;
            }
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
            } catch (Throwable unused) {
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            this.label = 1;
            if (interfaceC4897.mo9021(c8926Mo959, c7686, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
