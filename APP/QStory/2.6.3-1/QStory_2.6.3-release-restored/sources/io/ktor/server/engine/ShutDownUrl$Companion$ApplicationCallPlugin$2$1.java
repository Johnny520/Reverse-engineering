package io.ktor.server.engine;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.server.application.C4902;
import io.ktor.server.application.InterfaceC4897;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.ShutDownUrl$Companion$ApplicationCallPlugin$2$1", m556f = "ShutDownUrl.kt", m557l = {100}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;", "Lio/ktor/server/engine/飘花落叶言子楪兰苏世哲;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ShutDownUrl$Companion$ApplicationCallPlugin$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ C4929 $plugin;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$Companion$ApplicationCallPlugin$2$1(C4929 c4929, InterfaceC5189<? super ShutDownUrl$Companion$ApplicationCallPlugin$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$plugin = c4929;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C4902 c4902, InterfaceC4897 interfaceC4897, InterfaceC5189<? super C6008> interfaceC5189) {
        ShutDownUrl$Companion$ApplicationCallPlugin$2$1 shutDownUrl$Companion$ApplicationCallPlugin$2$1 = new ShutDownUrl$Companion$ApplicationCallPlugin$2$1(this.$plugin, interfaceC5189);
        shutDownUrl$Companion$ApplicationCallPlugin$2$1.L$0 = interfaceC4897;
        return shutDownUrl$Companion$ApplicationCallPlugin$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC4897 interfaceC4897 = (InterfaceC4897) this.L$0;
            if (AbstractC5227.m9466(AbstractC3738.m6855(interfaceC4897.mo9018()), this.$plugin.f12787)) {
                C4929 c4929 = this.$plugin;
                this.label = 1;
                if (c4929.m9058(interfaceC4897, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
