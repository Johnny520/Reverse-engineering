package io.ktor.websocket;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", l = {67, 68, 71, 74}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RawWebSocketJvm$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    int label;
    final /* synthetic */ C4264 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketJvm$1(C4264 c4264, InterfaceC4356<? super RawWebSocketJvm$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4264;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new RawWebSocketJvm$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RawWebSocketJvm$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
