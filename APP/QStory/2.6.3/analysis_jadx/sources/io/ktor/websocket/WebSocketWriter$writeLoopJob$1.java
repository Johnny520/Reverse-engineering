package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p057.InterfaceC6851;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", l = {40}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class WebSocketWriter$writeLoopJob$1 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C4255 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoopJob$1(C4255 c4255, InterfaceC4357<? super WebSocketWriter$writeLoopJob$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4255;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new WebSocketWriter$writeLoopJob$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WebSocketWriter$writeLoopJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6851 interfaceC6851;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            interfaceC6851 = (InterfaceC6851) this.L$0;
            try {
                AbstractC5185.m10210(obj);
                interfaceC6851.mo8334(obj2);
                return C5176.f14739;
            } catch (Throwable th) {
                th = th;
                interfaceC6851.mo8334(obj2);
                throw th;
            }
        }
        AbstractC5185.m10210(obj);
        C4255 c4255 = this.this$0;
        InterfaceC6851 interfaceC68512 = c4255.f12774;
        Object objMo8335 = interfaceC68512.mo8335();
        try {
            this.L$0 = interfaceC68512;
            this.L$1 = objMo8335;
            this.label = 1;
            if (C4255.m8706(c4255, (ByteBuffer) objMo8335, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC6851 = interfaceC68512;
            obj2 = objMo8335;
            interfaceC6851.mo8334(obj2);
            return C5176.f14739;
        } catch (Throwable th2) {
            th = th2;
            interfaceC6851 = interfaceC68512;
            obj2 = objMo8335;
            interfaceC6851.mo8334(obj2);
            throw th;
        }
    }
}
