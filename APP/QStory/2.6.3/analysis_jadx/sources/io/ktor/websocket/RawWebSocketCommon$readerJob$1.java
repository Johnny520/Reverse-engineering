package io.ktor.websocket;

import java.io.EOFException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", l = {91, 95, 98, 102}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RawWebSocketCommon$readerJob$1 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4274 this$0;

    public RawWebSocketCommon$readerJob$1(AbstractC4274 abstractC4274, InterfaceC4357<? super RawWebSocketCommon$readerJob$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new RawWebSocketCommon$readerJob$1(null, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RawWebSocketCommon$readerJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        AbstractC5185.m10210(obj);
                        throw null;
                    }
                    if (i == 1) {
                        AbstractC5185.m10210(obj);
                        AbstractC4280 abstractC4280 = (AbstractC4280) obj;
                        if (abstractC4280.f12837.getControlFrame()) {
                            throw null;
                        }
                        if (abstractC4280.f12838) {
                            throw null;
                        }
                        abstractC4280.f12837.getOpcode();
                        throw null;
                    }
                    if (i == 2) {
                        AbstractC5185.m10210(obj);
                        throw null;
                    }
                    if (i == 3) {
                        AbstractC5185.m10210(obj);
                        throw null;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5185.m10210(obj);
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
