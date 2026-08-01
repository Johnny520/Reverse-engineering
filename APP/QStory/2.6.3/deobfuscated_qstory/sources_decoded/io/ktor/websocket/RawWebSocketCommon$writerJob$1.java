package io.ktor.websocket;

import io.ktor.util.cio.ChannelWriteException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", l = {58, 60, 61, 79, 79, 79, 79}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RawWebSocketCommon$writerJob$1 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4274 this$0;

    public RawWebSocketCommon$writerJob$1(AbstractC4274 abstractC4274, InterfaceC4357<? super RawWebSocketCommon$writerJob$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new RawWebSocketCommon$writerJob$1(null, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RawWebSocketCommon$writerJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (this.label) {
                case 0:
                    AbstractC5185.m10210(obj);
                    throw null;
                case 1:
                    AbstractC5185.m10210(obj);
                    if (obj instanceof AbstractC4280) {
                        throw null;
                    }
                    throw new IllegalArgumentException("unknown message " + obj);
                case 2:
                    AbstractC5185.m10210(obj);
                    throw null;
                case 3:
                    Object obj2 = this.L$0;
                    AbstractC5185.m10210(obj);
                    if (obj2 instanceof C4278) {
                        throw null;
                    }
                    throw null;
                case 4:
                case 5:
                case 6:
                    AbstractC5185.m10210(obj);
                    throw null;
                case 7:
                    Throwable th = (Throwable) this.L$0;
                    AbstractC5185.m10210(obj);
                    throw th;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (ChannelWriteException unused) {
            throw null;
        }
    }
}
