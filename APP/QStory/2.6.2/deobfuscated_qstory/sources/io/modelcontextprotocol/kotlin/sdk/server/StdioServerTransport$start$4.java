package io.modelcontextprotocol.kotlin.sdk.server;

import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4310;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.channels.InterfaceC5211;
import p052.InterfaceC6553;
import p056.InterfaceC6660;
import p063.InterfaceC6861;
import p088.AbstractC7158;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$4", f = "StdioServerTransport.kt", l = {82}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class StdioServerTransport$start$4 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4296 this$0;

    public StdioServerTransport$start$4(AbstractC4296 abstractC4296, InterfaceC4356<? super StdioServerTransport$start$4> interfaceC4356) {
        super(2, interfaceC4356);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Error writing to stdout";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new StdioServerTransport$start$4(null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StdioServerTransport$start$4) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC5211 interfaceC5211 = (InterfaceC5211) this.L$0;
        AbstractC5184.m10206(obj);
        if (!((Boolean) obj).booleanValue()) {
            return C5175.f14739;
        }
        InterfaceC6660 interfaceC6660 = (InterfaceC6660) ((C5190) interfaceC5211).m10258();
        interfaceC6660.getClass();
        AbstractC7158 abstractC7158M8753 = AbstractC4310.m8753();
        abstractC7158M8753.getClass();
        abstractC7158M8753.m12397(InterfaceC6660.Companion.serializer(), interfaceC6660).concat("\n");
        throw null;
    }
}
