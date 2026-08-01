package io.ktor.websocket;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.PingPongKt$ponger$1", m556f = "PingPong.kt", m557l = {117, 32}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class PingPongKt$ponger$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6039 $channel;
    final /* synthetic */ InterfaceC6032 $outgoing;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingPongKt$ponger$1(InterfaceC6039 interfaceC6039, InterfaceC6032 interfaceC6032, InterfaceC5189<? super PingPongKt$ponger$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$channel = interfaceC6039;
        this.$outgoing = interfaceC6032;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PingPongKt$ponger$1(this.$channel, this.$outgoing, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PingPongKt$ponger$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r6.mo8992(r7, r10) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #2 {all -> 0x001e, blocks: (B:7:0x0019, B:19:0x0041, B:23:0x0055, B:25:0x005d, B:14:0x0032, B:18:0x003d), top: B:39:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: ClosedSendChannelException -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ClosedSendChannelException -> 0x008e, blocks: (B:28:0x0084, B:32:0x008a, B:33:0x008d, B:17:0x0039, B:30:0x0088, B:7:0x0019, B:19:0x0041, B:23:0x0055, B:25:0x005d, B:14:0x0032, B:18:0x003d), top: B:39:0x0007, inners: #0, #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0081 -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6031 interfaceC6031;
        InterfaceC6032 interfaceC6032;
        InterfaceC6032 interfaceC60322;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 it;
        Object objM10823;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
            } finally {
            }
        } catch (ClosedSendChannelException unused) {
        }
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6031 = this.$channel;
            interfaceC6032 = this.$outgoing;
            it = interfaceC6031.iterator();
            this.L$0 = interfaceC6032;
            this.L$1 = interfaceC6031;
            this.L$2 = it;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            objM10823 = c6023.m10823(this);
            if (objM10823 != coroutineSingletons) {
            }
        } else if (i == 1) {
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$2;
            interfaceC6031 = (InterfaceC6031) this.L$1;
            interfaceC60322 = (InterfaceC6032) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6044 = interfaceC60442;
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$2;
            interfaceC6031 = (InterfaceC6031) this.L$1;
            interfaceC60322 = (InterfaceC6032) this.L$0;
            AbstractC6017.m10769(obj);
            InterfaceC6044 interfaceC60444 = interfaceC60443;
            interfaceC6032 = interfaceC60322;
            it = interfaceC60444;
            this.L$0 = interfaceC6032;
            this.L$1 = interfaceC6031;
            this.L$2 = it;
            this.label = 1;
            C6023 c60232 = (C6023) it;
            objM10823 = c60232.m10823(this);
            if (objM10823 != coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC60322 = interfaceC6032;
            obj = objM10823;
            interfaceC6044 = c60232;
            if (((Boolean) obj).booleanValue()) {
                interfaceC6031.mo10815(null);
                return C6008.f15084;
            }
            C6023 c60233 = (C6023) interfaceC6044;
            C5113 c5113 = (C5113) c60233.m10821();
            AbstractC5092.f13129.trace("Received ping message, sending pong message");
            C5114 c5114 = new C5114(c5113.f13181, C5108.f13176);
            this.L$0 = interfaceC60322;
            this.L$1 = interfaceC6031;
            this.L$2 = c60233;
            this.label = 2;
            interfaceC60444 = c60233;
        }
    }
}
