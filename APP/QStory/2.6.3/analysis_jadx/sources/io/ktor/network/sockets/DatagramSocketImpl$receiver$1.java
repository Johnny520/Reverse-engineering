package io.ktor.network.sockets;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C5204;
import kotlinx.coroutines.channels.InterfaceC5196;
import kotlinx.coroutines.channels.InterfaceC5200;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", l = {52, 52}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/network/sockets/飘花落叶言子楪苏哲世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class DatagramSocketImpl$receiver$1 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4028 this$0;

    public DatagramSocketImpl$receiver$1(AbstractC4028 abstractC4028, InterfaceC4357<? super DatagramSocketImpl$receiver$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DatagramSocketImpl$receiver$1 datagramSocketImpl$receiver$1 = new DatagramSocketImpl$receiver$1(null, interfaceC4357);
        datagramSocketImpl$receiver$1.L$0 = obj;
        return datagramSocketImpl$receiver$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DatagramSocketImpl$receiver$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5196 interfaceC5196;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                interfaceC5196 = (InterfaceC5196) this.L$0;
            } else if (i == 1) {
                InterfaceC5200 interfaceC5200 = (InterfaceC5200) this.L$1;
                InterfaceC5196 interfaceC51962 = (InterfaceC5196) this.L$0;
                AbstractC5185.m10210(obj);
                this.L$0 = interfaceC51962;
                this.L$1 = null;
                this.label = 2;
                if (interfaceC5200.mo8433(obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC5196 = interfaceC51962;
            } else {
                if (i != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC5196 = (InterfaceC5196) this.L$0;
                AbstractC5185.m10210(obj);
            }
            C5204 c5204 = (C5204) interfaceC5196;
            c5204.getClass();
            this.L$0 = interfaceC5196;
            this.L$1 = c5204;
            this.label = 1;
            int i2 = AbstractC4028.f12295;
            throw null;
        } catch (ClosedChannelException | IOException unused) {
            return C5176.f14739;
        }
    }
}
