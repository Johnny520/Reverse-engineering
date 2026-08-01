package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p057.InterfaceC6850;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", l = {40}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class WebSocketWriter$writeLoopJob$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C4254 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoopJob$1(C4254 c4254, InterfaceC4356<? super WebSocketWriter$writeLoopJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4254;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new WebSocketWriter$writeLoopJob$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WebSocketWriter$writeLoopJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6850 interfaceC6850;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            interfaceC6850 = (InterfaceC6850) this.L$0;
            try {
                AbstractC5184.m10206(obj);
                interfaceC6850.mo8344(obj2);
                return C5175.f14739;
            } catch (Throwable th) {
                th = th;
                interfaceC6850.mo8344(obj2);
                throw th;
            }
        }
        AbstractC5184.m10206(obj);
        C4254 c4254 = this.this$0;
        InterfaceC6850 interfaceC68502 = c4254.f12770;
        Object objMo8345 = interfaceC68502.mo8345();
        try {
            this.L$0 = interfaceC68502;
            this.L$1 = objMo8345;
            this.label = 1;
            if (C4254.m8716(c4254, (ByteBuffer) objMo8345, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC6850 = interfaceC68502;
            obj2 = objMo8345;
            interfaceC6850.mo8344(obj2);
            return C5175.f14739;
        } catch (Throwable th2) {
            th = th2;
            interfaceC6850 = interfaceC68502;
            obj2 = objMo8345;
            interfaceC6850.mo8344(obj2);
            throw th;
        }
    }
}
