package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.io.InterfaceC5483;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3", f = "StdioClientTransport.kt", l = {88, 89}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class StdioClientTransport$start$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5483 $outputStream;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4283 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StdioClientTransport$start$3(AbstractC4283 abstractC4283, InterfaceC5483 interfaceC5483, InterfaceC4356<? super StdioClientTransport$start$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$outputStream = interfaceC5483;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        StdioClientTransport$start$3 stdioClientTransport$start$3 = new StdioClientTransport$start$3(null, this.$outputStream, interfaceC4356);
        stdioClientTransport$start$3.L$0 = obj;
        return stdioClientTransport$start$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StdioClientTransport$start$3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5451 interfaceC5451;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            C5416 c5416M10473 = AbstractC5398.m10473(interfaceC5400, null, null, new StdioClientTransport$start$3$readJob$1(null, null), 3);
            C5416 c5416M104732 = AbstractC5398.m10473(interfaceC5400, null, null, new StdioClientTransport$start$3$writeJob$1(null, this.$outputStream, null), 3);
            this.L$0 = c5416M104732;
            this.label = 1;
            if (c5416M10473.mo10558(this) != coroutineSingletons) {
                interfaceC5451 = c5416M104732;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            throw null;
        }
        interfaceC5451 = (InterfaceC5451) this.L$0;
        AbstractC5184.m10206(obj);
        this.L$0 = null;
        this.label = 2;
        if (AbstractC5398.m10502(interfaceC5451, this) != coroutineSingletons) {
            throw null;
        }
        return coroutineSingletons;
    }
}
