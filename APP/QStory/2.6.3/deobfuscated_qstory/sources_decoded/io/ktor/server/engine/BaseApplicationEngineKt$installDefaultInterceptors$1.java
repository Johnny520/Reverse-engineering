package io.ktor.server.engine;

import io.ktor.server.application.AbstractC4066;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.routing.AbstractC4144;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6551;
import p059.C6857;
import p063.InterfaceC6862;
import p236.C8097;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultInterceptors$1", f = "BaseApplicationEngine.kt", l = {131}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationEngineKt$installDefaultInterceptors$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    int label;

    public BaseApplicationEngineKt$installDefaultInterceptors$1(InterfaceC4357<? super BaseApplicationEngineKt$installDefaultInterceptors$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, C5176 c5176, InterfaceC4357<? super C5176> interfaceC4357) {
        BaseApplicationEngineKt$installDefaultInterceptors$1 baseApplicationEngineKt$installDefaultInterceptors$1 = new BaseApplicationEngineKt$installDefaultInterceptors$1(interfaceC4357);
        baseApplicationEngineKt$installDefaultInterceptors$1.L$0 = abstractC4194;
        return baseApplicationEngineKt$installDefaultInterceptors$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        InterfaceC5087 interfaceC5087M8912 = null;
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
        Object obj2 = ((AbstractC4194) this.L$0).f12664;
        if (!AbstractC4066.m8469((InterfaceC4065) obj2)) {
            InterfaceC4065 interfaceC4065 = (InterfaceC4065) obj2;
            C8097 c8097Mo399 = interfaceC4065.mo8461().mo399();
            if (c8097Mo399 == null && (c8097Mo399 = (C8097) interfaceC4065.getAttributes().m8587(AbstractC4144.f12562)) == null) {
                c8097Mo399 = C8097.f22345;
            }
            InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C8097.class);
            try {
                interfaceC5087M8912 = AbstractC4396.m8912(C8097.class);
            } catch (Throwable unused) {
            }
            C6857 c6857 = new C6857(interfaceC5093Mo8917, interfaceC5087M8912);
            this.label = 1;
            if (interfaceC4065.mo8462(c8097Mo399, c6857, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5176;
    }
}
