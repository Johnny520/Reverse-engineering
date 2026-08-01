package io.ktor.websocket;

import java.io.EOFException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", l = {91, 95, 98, 102}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RawWebSocketCommon$readerJob$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4273 this$0;

    public RawWebSocketCommon$readerJob$1(AbstractC4273 abstractC4273, InterfaceC4356<? super RawWebSocketCommon$readerJob$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new RawWebSocketCommon$readerJob$1(null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RawWebSocketCommon$readerJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        AbstractC5184.m10206(obj);
                        throw null;
                    }
                    if (i == 1) {
                        AbstractC5184.m10206(obj);
                        AbstractC4279 abstractC4279 = (AbstractC4279) obj;
                        if (abstractC4279.f12833.getControlFrame()) {
                            throw null;
                        }
                        if (abstractC4279.f12834) {
                            throw null;
                        }
                        abstractC4279.f12833.getOpcode();
                        throw null;
                    }
                    if (i == 2) {
                        AbstractC5184.m10206(obj);
                        throw null;
                    }
                    if (i == 3) {
                        AbstractC5184.m10206(obj);
                        throw null;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5184.m10206(obj);
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
