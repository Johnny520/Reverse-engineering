package io.ktor.server.engine;

import io.ktor.server.application.AbstractC4065;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.routing.AbstractC4143;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6550;
import p059.C6856;
import p063.InterfaceC6861;
import p236.C8096;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultInterceptors$1", f = "BaseApplicationEngine.kt", l = {131}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationEngineKt$installDefaultInterceptors$1 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    int label;

    public BaseApplicationEngineKt$installDefaultInterceptors$1(InterfaceC4356<? super BaseApplicationEngineKt$installDefaultInterceptors$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
        BaseApplicationEngineKt$installDefaultInterceptors$1 baseApplicationEngineKt$installDefaultInterceptors$1 = new BaseApplicationEngineKt$installDefaultInterceptors$1(interfaceC4356);
        baseApplicationEngineKt$installDefaultInterceptors$1.L$0 = abstractC4193;
        return baseApplicationEngineKt$installDefaultInterceptors$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        InterfaceC5086 interfaceC5086M8922 = null;
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
        Object obj2 = ((AbstractC4193) this.L$0).f12660;
        if (!AbstractC4065.m8479((InterfaceC4064) obj2)) {
            InterfaceC4064 interfaceC4064 = (InterfaceC4064) obj2;
            C8096 c8096Mo398 = interfaceC4064.mo8471().mo398();
            if (c8096Mo398 == null && (c8096Mo398 = (C8096) interfaceC4064.getAttributes().m8597(AbstractC4143.f12558)) == null) {
                c8096Mo398 = C8096.f22347;
            }
            InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C8096.class);
            try {
                interfaceC5086M8922 = AbstractC4395.m8922(C8096.class);
            } catch (Throwable unused) {
            }
            C6856 c6856 = new C6856(interfaceC5092Mo8927, interfaceC5086M8922);
            this.label = 1;
            if (interfaceC4064.mo8472(c8096Mo398, c6856, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5175;
    }
}
