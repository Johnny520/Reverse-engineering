package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p073.InterfaceC7680;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", m556f = "WebSocketWriter.kt", m557l = {40}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class WebSocketWriter$writeLoopJob$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5087 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoopJob$1(C5087 c5087, InterfaceC5189<? super WebSocketWriter$writeLoopJob$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c5087;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new WebSocketWriter$writeLoopJob$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WebSocketWriter$writeLoopJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC7680 interfaceC7680;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            interfaceC7680 = (InterfaceC7680) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                interfaceC7680.mo8893(obj2);
                return C6008.f15084;
            } catch (Throwable th) {
                th = th;
                interfaceC7680.mo8893(obj2);
                throw th;
            }
        }
        AbstractC6017.m10769(obj);
        C5087 c5087 = this.this$0;
        InterfaceC7680 interfaceC76802 = c5087.f13119;
        Object objMo8894 = interfaceC76802.mo8894();
        try {
            this.L$0 = interfaceC76802;
            this.L$1 = objMo8894;
            this.label = 1;
            if (C5087.m9265(c5087, (ByteBuffer) objMo8894, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC7680 = interfaceC76802;
            obj2 = objMo8894;
            interfaceC7680.mo8893(obj2);
            return C6008.f15084;
        } catch (Throwable th2) {
            th = th2;
            interfaceC7680 = interfaceC76802;
            obj2 = objMo8894;
            interfaceC7680.mo8893(obj2);
            throw th;
        }
    }
}
