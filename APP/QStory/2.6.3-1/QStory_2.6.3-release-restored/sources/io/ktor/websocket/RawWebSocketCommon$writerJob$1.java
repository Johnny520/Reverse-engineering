package io.ktor.websocket;

import io.ktor.util.cio.ChannelWriteException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", m556f = "RawWebSocketCommon.kt", m557l = {58, 60, 61, 79, 79, 79, 79}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RawWebSocketCommon$writerJob$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC5106 this$0;

    public RawWebSocketCommon$writerJob$1(AbstractC5106 abstractC5106, InterfaceC5189<? super RawWebSocketCommon$writerJob$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new RawWebSocketCommon$writerJob$1(null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RawWebSocketCommon$writerJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (this.label) {
                case 0:
                    AbstractC6017.m10769(obj);
                    throw null;
                case 1:
                    AbstractC6017.m10769(obj);
                    if (obj instanceof AbstractC5112) {
                        throw null;
                    }
                    throw new IllegalArgumentException("unknown message " + obj);
                case 2:
                    AbstractC6017.m10769(obj);
                    throw null;
                case 3:
                    Object obj2 = this.L$0;
                    AbstractC6017.m10769(obj);
                    if (obj2 instanceof C5110) {
                        throw null;
                    }
                    throw null;
                case 4:
                case 5:
                case 6:
                    AbstractC6017.m10769(obj);
                    throw null;
                case 7:
                    Throwable th = (Throwable) this.L$0;
                    AbstractC6017.m10769(obj);
                    throw th;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (ChannelWriteException unused) {
            throw null;
        }
    }
}
