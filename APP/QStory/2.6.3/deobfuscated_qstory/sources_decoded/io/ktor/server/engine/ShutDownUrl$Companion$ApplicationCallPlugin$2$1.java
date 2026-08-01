package io.ktor.server.engine;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.server.application.C4070;
import io.ktor.server.application.InterfaceC4065;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.ShutDownUrl$Companion$ApplicationCallPlugin$2$1", f = "ShutDownUrl.kt", l = {100}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;", "Lio/ktor/server/engine/飘花落叶言子楪兰苏世哲;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;)V"}, k = 3, mv = {2, 0, 0})
final class ShutDownUrl$Companion$ApplicationCallPlugin$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ C4097 $plugin;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$Companion$ApplicationCallPlugin$2$1(C4097 c4097, InterfaceC4357<? super ShutDownUrl$Companion$ApplicationCallPlugin$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$plugin = c4097;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C4070 c4070, InterfaceC4065 interfaceC4065, InterfaceC4357<? super C5176> interfaceC4357) {
        ShutDownUrl$Companion$ApplicationCallPlugin$2$1 shutDownUrl$Companion$ApplicationCallPlugin$2$1 = new ShutDownUrl$Companion$ApplicationCallPlugin$2$1(this.$plugin, interfaceC4357);
        shutDownUrl$Companion$ApplicationCallPlugin$2$1.L$0 = interfaceC4065;
        return shutDownUrl$Companion$ApplicationCallPlugin$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC4065 interfaceC4065 = (InterfaceC4065) this.L$0;
            if (AbstractC4395.m8907(AbstractC2905.m6295(interfaceC4065.mo8459()), this.$plugin.f12442)) {
                C4097 c4097 = this.$plugin;
                this.label = 1;
                if (c4097.m8499(interfaceC4065, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
