package io.ktor.server.websocket;

import io.ktor.websocket.InterfaceC5090;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.websocket.WebSocketUpgrade$upgrade$2", m556f = "WebSocketUpgrade.kt", m557l = {97, 98}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class WebSocketUpgrade$upgrade$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5090 $webSocket;
    int label;
    final /* synthetic */ C5008 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketUpgrade$upgrade$2(C5008 c5008, InterfaceC5090 interfaceC5090, InterfaceC5189<? super WebSocketUpgrade$upgrade$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c5008;
        this.$webSocket = interfaceC5090;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new WebSocketUpgrade$upgrade$2(this.this$0, this.$webSocket, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WebSocketUpgrade$upgrade$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r6.mo9107(r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } finally {
            try {
            } finally {
            }
        }
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7383 interfaceC7383 = this.this$0.f12986;
            InterfaceC5090 interfaceC5090 = this.$webSocket;
            this.label = 1;
            if (interfaceC7383.invoke(interfaceC5090, this) == coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC5090 interfaceC50902 = this.$webSocket;
        this.label = 2;
    }
}
