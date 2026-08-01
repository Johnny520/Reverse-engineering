package io.ktor.network.sockets;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C5203;
import kotlinx.coroutines.channels.InterfaceC5195;
import kotlinx.coroutines.channels.InterfaceC5199;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", l = {52, 52}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/network/sockets/飘花落叶言子楪苏哲世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class DatagramSocketImpl$receiver$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4027 this$0;

    public DatagramSocketImpl$receiver$1(AbstractC4027 abstractC4027, InterfaceC4356<? super DatagramSocketImpl$receiver$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DatagramSocketImpl$receiver$1 datagramSocketImpl$receiver$1 = new DatagramSocketImpl$receiver$1(null, interfaceC4356);
        datagramSocketImpl$receiver$1.L$0 = obj;
        return datagramSocketImpl$receiver$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DatagramSocketImpl$receiver$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5195 interfaceC5195;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                interfaceC5195 = (InterfaceC5195) this.L$0;
            } else if (i == 1) {
                InterfaceC5199 interfaceC5199 = (InterfaceC5199) this.L$1;
                InterfaceC5195 interfaceC51952 = (InterfaceC5195) this.L$0;
                AbstractC5184.m10206(obj);
                this.L$0 = interfaceC51952;
                this.L$1 = null;
                this.label = 2;
                if (interfaceC5199.mo8443(obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC5195 = interfaceC51952;
            } else {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC5195 = (InterfaceC5195) this.L$0;
                AbstractC5184.m10206(obj);
            }
            C5203 c5203 = (C5203) interfaceC5195;
            c5203.getClass();
            this.L$0 = interfaceC5195;
            this.L$1 = c5203;
            this.label = 1;
            int i2 = AbstractC4027.f12291;
            throw null;
        } catch (ClosedChannelException | IOException unused) {
            return C5175.f14739;
        }
    }
}
