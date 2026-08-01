package io.ktor.websocket;

import java.io.EOFException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", m556f = "RawWebSocketCommon.kt", m557l = {91, 95, 98, 102}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RawWebSocketCommon$readerJob$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC5106 this$0;

    public RawWebSocketCommon$readerJob$1(AbstractC5106 abstractC5106, InterfaceC5189<? super RawWebSocketCommon$readerJob$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new RawWebSocketCommon$readerJob$1(null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RawWebSocketCommon$readerJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        AbstractC6017.m10769(obj);
                        throw null;
                    }
                    if (i == 1) {
                        AbstractC6017.m10769(obj);
                        AbstractC5112 abstractC5112 = (AbstractC5112) obj;
                        if (abstractC5112.f13182.getControlFrame()) {
                            throw null;
                        }
                        if (abstractC5112.f13183) {
                            throw null;
                        }
                        abstractC5112.f13182.getOpcode();
                        throw null;
                    }
                    if (i == 2) {
                        AbstractC6017.m10769(obj);
                        throw null;
                    }
                    if (i == 3) {
                        AbstractC6017.m10769(obj);
                        throw null;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6017.m10769(obj);
                    throw null;
                } catch (FrameTooBigException unused) {
                    throw null;
                } catch (CancellationException unused2) {
                    throw null;
                }
            } catch (ProtocolViolationException unused3) {
                throw null;
            } catch (EOFException unused4) {
                throw null;
            }
        } catch (ClosedReceiveChannelException unused5) {
            throw null;
        }
    }
}
