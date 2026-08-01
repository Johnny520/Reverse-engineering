package io.ktor.websocket;

import io.ktor.util.AbstractC5049;
import java.util.TimeZone;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.AbstractC5233;
import kotlin.random.XorWowRandom;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p259.AbstractC8979;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.PingPongKt$pinger$1", m556f = "PingPong.kt", m557l = {65, 74, 96}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class PingPongKt$pinger$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6039 $channel;
    final /* synthetic */ InterfaceC7383 $onTimeout;
    final /* synthetic */ InterfaceC6032 $outgoing;
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ long $timeoutMillis;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: io.ktor.websocket.PingPongKt$pinger$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.websocket.PingPongKt$pinger$1$1", m556f = "PingPong.kt", m557l = {67}, m558m = "invokeSuspend")
    public static final class C03751 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6039 $channel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03751(InterfaceC6039 interfaceC6039, InterfaceC5189<? super C03751> interfaceC5189) {
            super(2, interfaceC5189);
            this.$channel = interfaceC6039;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C03751(this.$channel, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03751) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC6039 interfaceC6039;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0 && i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            do {
                interfaceC6039 = this.$channel;
                this.label = 1;
            } while (interfaceC6039.mo10803(this) != coroutineSingletons);
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingPongKt$pinger$1(long j, long j2, InterfaceC7383 interfaceC7383, InterfaceC6039 interfaceC6039, InterfaceC6032 interfaceC6032, InterfaceC5189<? super PingPongKt$pinger$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$periodMillis = j;
        this.$timeoutMillis = j2;
        this.$onTimeout = interfaceC7383;
        this.$channel = interfaceC6039;
        this.$outgoing = interfaceC6032;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PingPongKt$pinger$1(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PingPongKt$pinger$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (r13.invoke(r1, r12) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, PHI: r1 r6 r13
  0x00b9: PHI (r1v7 byte[]) = (r1v5 byte[]), (r1v13 byte[]) binds: [B:23:0x00b6, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r6v12 kotlin.random.飘花落叶言子楪世兰苏哲) = (r6v8 kotlin.random.飘花落叶言子楪世兰苏哲), (r6v16 kotlin.random.飘花落叶言子楪世兰苏哲) binds: [B:23:0x00b6, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r13v8 java.lang.Object) = (r13v6 java.lang.Object), (r13v0 java.lang.Object) binds: [B:23:0x00b6, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, blocks: (B:7:0x0010, B:12:0x0023, B:12:0x0023, B:12:0x0023, B:25:0x00b9, B:25:0x00b9, B:25:0x00b9, B:27:0x00bd, B:27:0x00bd, B:27:0x00bd, B:18:0x006d, B:18:0x006d, B:18:0x006d, B:22:0x0084, B:22:0x0084, B:22:0x0084, B:15:0x0030, B:15:0x0030, B:15:0x0030), top: B:34:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, blocks: (B:7:0x0010, B:12:0x0023, B:12:0x0023, B:12:0x0023, B:25:0x00b9, B:25:0x00b9, B:25:0x00b9, B:27:0x00bd, B:27:0x00bd, B:27:0x00bd, B:18:0x006d, B:18:0x006d, B:18:0x006d, B:22:0x0084, B:22:0x0084, B:22:0x0084, B:15:0x0030, B:15:0x0030, B:15:0x0030), top: B:34:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b6 -> B:25:0x00b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC5233 xorWowRandom;
        byte[] bArr;
        AbstractC5233 abstractC5233;
        long j;
        C03751 c03751;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5092.f13129.trace("Starting WebSocket pinger coroutine with period " + this.$periodMillis + " ms and timeout " + this.$timeoutMillis + " ms");
            TimeZone timeZone = AbstractC8979.f22819;
            long jCurrentTimeMillis = System.currentTimeMillis();
            xorWowRandom = new XorWowRandom((int) jCurrentTimeMillis, (int) (jCurrentTimeMillis >> 32));
            bArr = new byte[32];
            j = this.$periodMillis;
            c03751 = new C03751(this.$channel, null);
            this.L$0 = xorWowRandom;
            this.L$1 = bArr;
            this.label = 1;
            if (AbstractC6231.m11032(j, c03751, this) != coroutineSingletons) {
            }
        } else {
            if (i == 1) {
                bArr = (byte[]) this.L$1;
                abstractC5233 = (AbstractC5233) this.L$0;
                AbstractC6017.m10769(obj);
                abstractC5233.nextBytes(bArr);
                String str = "[ping " + AbstractC5049.m9196(bArr) + " ping]";
                long j2 = this.$timeoutMillis;
                PingPongKt$pinger$1$rc$1 pingPongKt$pinger$1$rc$1 = new PingPongKt$pinger$1$rc$1(this.$outgoing, str, this.$channel, null);
                this.L$0 = abstractC5233;
                this.L$1 = bArr;
                this.label = 2;
                obj = AbstractC6231.m11032(j2, pingPongKt$pinger$1$rc$1, this);
                if (obj == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 2) {
                if (i == 3) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bArr = (byte[]) this.L$1;
            abstractC5233 = (AbstractC5233) this.L$0;
            AbstractC6017.m10769(obj);
            if (((C6008) obj) == null) {
                xorWowRandom = abstractC5233;
                j = this.$periodMillis;
                c03751 = new C03751(this.$channel, null);
                this.L$0 = xorWowRandom;
                this.L$1 = bArr;
                this.label = 1;
                if (AbstractC6231.m11032(j, c03751, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                abstractC5233 = xorWowRandom;
                abstractC5233.nextBytes(bArr);
                String str2 = "[ping " + AbstractC5049.m9196(bArr) + " ping]";
                long j22 = this.$timeoutMillis;
                PingPongKt$pinger$1$rc$1 pingPongKt$pinger$1$rc$12 = new PingPongKt$pinger$1$rc$1(this.$outgoing, str2, this.$channel, null);
                this.L$0 = abstractC5233;
                this.L$1 = bArr;
                this.label = 2;
                obj = AbstractC6231.m11032(j22, pingPongKt$pinger$1$rc$12, this);
                if (obj == coroutineSingletons) {
                    if (((C6008) obj) == null) {
                    }
                }
                return coroutineSingletons;
            }
            AbstractC5092.f13129.trace("WebSocket pinger has timed out");
            InterfaceC7383 interfaceC7383 = this.$onTimeout;
            C5095 c5095 = new C5095(CloseReason$Codes.INTERNAL_ERROR, "Ping timeout");
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
    }
}
