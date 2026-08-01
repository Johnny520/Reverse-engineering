package io.ktor.websocket;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.InterfaceC5200;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", l = {65, 74, 96}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class PingPongKt$pinger$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5207 $channel;
    final /* synthetic */ InterfaceC6554 $onTimeout;
    final /* synthetic */ InterfaceC5200 $outgoing;
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ long $timeoutMillis;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: io.ktor.websocket.PingPongKt$pinger$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", l = {67}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5207 $channel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5207 interfaceC5207, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$channel = interfaceC5207;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$channel, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC5207 interfaceC5207;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0 && i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            do {
                interfaceC5207 = this.$channel;
                this.label = 1;
            } while (interfaceC5207.mo10244(this) != coroutineSingletons);
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingPongKt$pinger$1(long j, long j2, InterfaceC6554 interfaceC6554, InterfaceC5207 interfaceC5207, InterfaceC5200 interfaceC5200, InterfaceC4357<? super PingPongKt$pinger$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$periodMillis = j;
        this.$timeoutMillis = j2;
        this.$onTimeout = interfaceC6554;
        this.$channel = interfaceC5207;
        this.$outgoing = interfaceC5200;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new PingPongKt$pinger$1(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PingPongKt$pinger$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$pinger$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
