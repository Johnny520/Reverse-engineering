package io.ktor.websocket;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", l = {67, 68, 71, 74}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RawWebSocketJvm$1 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    int label;
    final /* synthetic */ C4265 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketJvm$1(C4265 c4265, InterfaceC4357<? super RawWebSocketJvm$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4265;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new RawWebSocketJvm$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RawWebSocketJvm$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[Catch: all -> 0x0037, CancellationException -> 0x0039, ProtocolViolationException -> 0x003b, FrameTooBigException -> 0x003d, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x003d, ProtocolViolationException -> 0x003b, blocks: (B:19:0x0033, B:34:0x0059, B:37:0x0067, B:39:0x006f, B:30:0x0044, B:33:0x004b), top: B:60:0x000a, outer: #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0083 -> B:34:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketJvm$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
