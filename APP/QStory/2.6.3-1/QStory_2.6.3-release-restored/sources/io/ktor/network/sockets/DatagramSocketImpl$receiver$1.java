package io.ktor.network.sockets;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.channels.InterfaceC6032;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", m556f = "DatagramSocketImpl.kt", m557l = {52, 52}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/network/sockets/飘花落叶言子楪苏哲世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DatagramSocketImpl$receiver$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4860 this$0;

    public DatagramSocketImpl$receiver$1(AbstractC4860 abstractC4860, InterfaceC5189<? super DatagramSocketImpl$receiver$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DatagramSocketImpl$receiver$1 datagramSocketImpl$receiver$1 = new DatagramSocketImpl$receiver$1(null, interfaceC5189);
        datagramSocketImpl$receiver$1.L$0 = obj;
        return datagramSocketImpl$receiver$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DatagramSocketImpl$receiver$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6028 interfaceC6028;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC6028 = (InterfaceC6028) this.L$0;
            } else if (i == 1) {
                InterfaceC6032 interfaceC6032 = (InterfaceC6032) this.L$1;
                InterfaceC6028 interfaceC60282 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                this.L$0 = interfaceC60282;
                this.L$1 = null;
                this.label = 2;
                if (interfaceC6032.mo8992(obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC6028 = interfaceC60282;
            } else {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC6028 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
            }
            C6036 c6036 = (C6036) interfaceC6028;
            c6036.getClass();
            this.L$0 = interfaceC6028;
            this.L$1 = c6036;
            this.label = 1;
            int i2 = AbstractC4860.f12640;
            throw null;
        } catch (ClosedChannelException | IOException unused) {
            return C6008.f15084;
        }
    }
}
