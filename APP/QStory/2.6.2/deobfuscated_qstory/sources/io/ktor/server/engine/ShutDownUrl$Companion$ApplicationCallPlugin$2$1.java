package io.ktor.server.engine;

import com.bumptech.glide.AbstractC3054;
import io.ktor.server.application.C4069;
import io.ktor.server.application.InterfaceC4064;
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
@InterfaceC6861(c = "io.ktor.server.engine.ShutDownUrl$Companion$ApplicationCallPlugin$2$1", f = "ShutDownUrl.kt", l = {100}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;", "Lio/ktor/server/engine/飘花落叶言子楪兰苏世哲;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;)V"}, k = 3, mv = {2, 0, 0})
final class ShutDownUrl$Companion$ApplicationCallPlugin$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ C4096 $plugin;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$Companion$ApplicationCallPlugin$2$1(C4096 c4096, InterfaceC4356<? super ShutDownUrl$Companion$ApplicationCallPlugin$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$plugin = c4096;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C4069 c4069, InterfaceC4064 interfaceC4064, InterfaceC4356<? super C5175> interfaceC4356) {
        ShutDownUrl$Companion$ApplicationCallPlugin$2$1 shutDownUrl$Companion$ApplicationCallPlugin$2$1 = new ShutDownUrl$Companion$ApplicationCallPlugin$2$1(this.$plugin, interfaceC4356);
        shutDownUrl$Companion$ApplicationCallPlugin$2$1.L$0 = interfaceC4064;
        return shutDownUrl$Companion$ApplicationCallPlugin$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4064 interfaceC4064 = (InterfaceC4064) this.L$0;
            if (AbstractC4394.m8917(AbstractC3054.m6611(interfaceC4064.mo8469()), this.$plugin.f12438)) {
                C4096 c4096 = this.$plugin;
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
