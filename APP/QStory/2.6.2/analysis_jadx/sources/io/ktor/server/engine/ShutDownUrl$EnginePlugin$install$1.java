package io.ktor.server.engine;

import com.bumptech.glide.AbstractC3054;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.ShutDownUrl$EnginePlugin$install$1", f = "ShutDownUrl.kt", l = {65}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class ShutDownUrl$EnginePlugin$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ C4096 $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$EnginePlugin$install$1(C4096 c4096, InterfaceC4356<? super ShutDownUrl$EnginePlugin$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$plugin = c4096;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
        ShutDownUrl$EnginePlugin$install$1 shutDownUrl$EnginePlugin$install$1 = new ShutDownUrl$EnginePlugin$install$1(this.$plugin, interfaceC4356);
        shutDownUrl$EnginePlugin$install$1.L$0 = abstractC4193;
        return shutDownUrl$EnginePlugin$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
            if (AbstractC4394.m8917(AbstractC3054.m6611(((InterfaceC4064) abstractC4193.f12660).mo8469()), this.$plugin.f12438)) {
                C4096 c4096 = this.$plugin;
                InterfaceC4064 interfaceC4064 = (InterfaceC4064) abstractC4193.f12660;
                this.label = 1;
                if (c4096.m8509(interfaceC4064, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
