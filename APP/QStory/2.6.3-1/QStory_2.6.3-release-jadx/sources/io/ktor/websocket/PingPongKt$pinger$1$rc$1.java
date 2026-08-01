package io.ktor.websocket;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5971;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", m556f = "PingPong.kt", m557l = {76, 80}, m558m = "invokeSuspend")
public final class PingPongKt$pinger$1$rc$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6039 $channel;
    final /* synthetic */ InterfaceC6032 $outgoing;
    final /* synthetic */ String $pingMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingPongKt$pinger$1$rc$1(InterfaceC6032 interfaceC6032, String str, InterfaceC6039 interfaceC6039, InterfaceC5189<? super PingPongKt$pinger$1$rc$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$outgoing = interfaceC6032;
        this.$pingMessage = str;
        this.$channel = interfaceC6039;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PingPongKt$pinger$1$rc$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5092.f13129.trace("WebSocket Pinger: sending ping frame");
            InterfaceC6032 interfaceC6032 = this.$outgoing;
            C5113 c5113 = new C5113(AbstractC7684.m12643(this.$pingMessage, AbstractC5964.f15030));
            this.label = 1;
            if (interfaceC6032.mo8992(c5113, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C5114 c5114 = (C5114) obj;
            byte[] bArr = c5114.f13181;
            if (AbstractC5971.m10694(0, bArr, bArr.length).equals(this.$pingMessage)) {
                AbstractC5092.f13129.trace("WebSocket Pinger: received valid pong frame " + c5114);
                return C6008.f15084;
            }
            AbstractC5092.f13129.trace("WebSocket Pinger: received invalid pong frame " + c5114 + ", continue waiting");
        }
        InterfaceC6039 interfaceC6039 = this.$channel;
        this.label = 2;
        obj = interfaceC6039.mo10803(this);
    }
}
