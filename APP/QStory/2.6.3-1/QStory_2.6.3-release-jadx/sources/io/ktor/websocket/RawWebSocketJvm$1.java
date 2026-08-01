package io.ktor.websocket;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.RawWebSocketJvm$1", m556f = "RawWebSocketJvm.kt", m557l = {67, 68, 71, 74}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RawWebSocketJvm$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    int label;
    final /* synthetic */ C5097 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketJvm$1(C5097 c5097, InterfaceC5189<? super RawWebSocketJvm$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c5097;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new RawWebSocketJvm$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RawWebSocketJvm$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[Catch: all -> 0x0037, CancellationException -> 0x0039, ProtocolViolationException -> 0x003b, FrameTooBigException -> 0x003d, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x003d, ProtocolViolationException -> 0x003b, blocks: (B:19:0x0033, B:34:0x0059, B:37:0x0067, B:39:0x006f, B:30:0x0044, B:33:0x004b), top: B:60:0x000a, outer: #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0083 -> B:34:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProtocolViolationException protocolViolationException;
        FrameTooBigException frameTooBigException;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 c6023;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                } catch (FrameTooBigException e) {
                    C6022 c6022 = this.this$0.f13145.f13118;
                    C5110 c5110 = new C5110(new C5095(CloseReason$Codes.TOO_BIG, e.getMessage()));
                    this.L$0 = e;
                    this.label = 3;
                    if (c6022.mo8992(c5110, this) != coroutineSingletons) {
                        frameTooBigException = e;
                    }
                    return coroutineSingletons;
                } catch (ProtocolViolationException e2) {
                    C6022 c60222 = this.this$0.f13145.f13118;
                    C5110 c51102 = new C5110(new C5095(CloseReason$Codes.PROTOCOL_ERROR, e2.getMessage()));
                    this.L$0 = e2;
                    this.label = 4;
                    if (c60222.mo8992(c51102, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocolViolationException = e2;
                }
            } catch (CancellationException e3) {
                this.this$0.f13144.f13156.m10801(e3, true);
            } catch (Throwable th) {
                this.this$0.f13148.m10801(th, false);
            }
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C6022 c60223 = this.this$0.f13144.f13156;
                c60223.getClass();
                c6023 = new C6023(c60223);
            } else {
                if (i == 1) {
                    InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$0;
                    AbstractC6017.m10769(obj);
                    interfaceC6044 = interfaceC60442;
                    if (((Boolean) obj).booleanValue()) {
                        C6023 c60232 = (C6023) interfaceC6044;
                        AbstractC5112 abstractC5112 = (AbstractC5112) c60232.m10821();
                        C6022 c60224 = this.this$0.f13148;
                        this.L$0 = c60232;
                        this.label = 2;
                        c6023 = c60232;
                        if (c60224.mo8992(abstractC5112, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    return C6008.f15084;
                }
                if (i != 2) {
                    if (i == 3) {
                        frameTooBigException = (FrameTooBigException) this.L$0;
                        AbstractC6017.m10769(obj);
                        this.this$0.f13148.m10801(frameTooBigException, false);
                        return C6008.f15084;
                    }
                    if (i != 4) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    protocolViolationException = (ProtocolViolationException) this.L$0;
                    AbstractC6017.m10769(obj);
                    this.this$0.f13148.m10801(protocolViolationException, false);
                    return C6008.f15084;
                }
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$0;
                AbstractC6017.m10769(obj);
                c6023 = interfaceC60443;
            }
            this.L$0 = c6023;
            this.label = 1;
            C6023 c60233 = (C6023) c6023;
            obj = c60233.m10823(this);
            interfaceC6044 = c60233;
            if (obj != coroutineSingletons) {
                if (((Boolean) obj).booleanValue()) {
                }
                return C6008.f15084;
            }
            return coroutineSingletons;
        } finally {
            this.this$0.f13148.mo8994(null);
        }
    }
}
