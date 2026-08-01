package io.ktor.websocket;

import io.ktor.util.cio.ChannelWriteException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", l = {58, 60, 61, 79, 79, 79, 79}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RawWebSocketCommon$writerJob$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4273 this$0;

    public RawWebSocketCommon$writerJob$1(AbstractC4273 abstractC4273, InterfaceC4356<? super RawWebSocketCommon$writerJob$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new RawWebSocketCommon$writerJob$1(null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RawWebSocketCommon$writerJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (this.label) {
                case 0:
                    AbstractC5184.m10206(obj);
                    throw null;
                case 1:
                    AbstractC5184.m10206(obj);
                    if (obj instanceof AbstractC4279) {
                        throw null;
                    }
                    throw new IllegalArgumentException("unknown message " + obj);
                case 2:
                    AbstractC5184.m10206(obj);
                    throw null;
                case 3:
                    Object obj2 = this.L$0;
                    AbstractC5184.m10206(obj);
                    if (obj2 instanceof C4277) {
                        throw null;
                    }
                    throw null;
                case 4:
                case 5:
                case 6:
                    AbstractC5184.m10206(obj);
                    throw null;
                case 7:
                    Throwable th = (Throwable) this.L$0;
                    AbstractC5184.m10206(obj);
                    throw th;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (ChannelWriteException unused) {
            throw null;
        }
    }
}
