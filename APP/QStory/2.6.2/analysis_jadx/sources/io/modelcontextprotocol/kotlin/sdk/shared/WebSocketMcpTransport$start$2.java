package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$2", f = "WebSocketMcpTransport.kt", l = {47, 60}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class WebSocketMcpTransport$start$2 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ AbstractC4309 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpTransport$start$2(AbstractC4309 abstractC4309, InterfaceC4356<? super WebSocketMcpTransport$start$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC4309;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new WebSocketMcpTransport$start$2(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WebSocketMcpTransport$start$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: Exception -> 0x0010, TRY_ENTER, TryCatch #0 {Exception -> 0x0010, blocks: (B:6:0x000c, B:21:0x0039, B:23:0x0043, B:26:0x007a, B:27:0x0081), top: B:34:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:15:0x0020). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L19
            if (r1 != r3) goto L12
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.lang.Exception -> L10
            goto L20
        L10:
            r9 = move-exception
            goto L82
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            r8 = 0
            return r8
        L19:
            kotlin.AbstractC5184.m10206(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            goto L33
        L1d:
            kotlin.AbstractC5184.m10206(r9)
        L20:
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世 r9 = r8.this$0     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r9 = (io.modelcontextprotocol.kotlin.sdk.server.C4293) r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            io.ktor.server.websocket.飘花落叶言子楪世兰苏哲 r9 = r9.f12848     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r9 = r9.mo8557()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            r8.label = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            java.lang.Object r9 = r9.mo10240(r8)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            if (r9 != r0) goto L33
            goto L79
        L33:
            io.ktor.websocket.飘花落叶言子楪苏兰哲世 r9 = (io.ktor.websocket.AbstractC4279) r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> Lbb
            boolean r1 = r9 instanceof io.ktor.websocket.C4278
            if (r1 == 0) goto L8a
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲 r1 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4310.m8753()     // Catch: java.lang.Exception -> L10
            io.ktor.websocket.飘花落叶言子楪苏兰世哲 r9 = (io.ktor.websocket.C4278) r9     // Catch: java.lang.Exception -> L10
            boolean r4 = r9.f12834     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L7a
            java.nio.charset.Charset r4 = kotlin.text.AbstractC5131.f14688     // Catch: java.lang.Exception -> L10
            java.nio.charset.CharsetDecoder r4 = r4.newDecoder()     // Catch: java.lang.Exception -> L10
            r4.getClass()     // Catch: java.lang.Exception -> L10
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = new kotlinx.io.飘花落叶言子楪世苏哲兰     // Catch: java.lang.Exception -> L10
            r5.<init>()     // Catch: java.lang.Exception -> L10
            byte[] r9 = r9.f12832     // Catch: java.lang.Exception -> L10
            int r6 = r9.length     // Catch: java.lang.Exception -> L10
            r7 = 0
            p058.AbstractC6854.m12055(r5, r9, r7, r6)     // Catch: java.lang.Exception -> L10
            java.lang.String r9 = p253.AbstractC8189.m13684(r4, r5)     // Catch: java.lang.Exception -> L10
            r1.getClass()     // Catch: java.lang.Exception -> L10
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪苏兰 r4 = p056.InterfaceC6660.Companion     // Catch: java.lang.Exception -> L10
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r4 = r4.serializer()     // Catch: java.lang.Exception -> L10
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r4 = (p089.InterfaceC7183) r4     // Catch: java.lang.Exception -> L10
            java.lang.Object r9 = r1.m12399(r9, r4)     // Catch: java.lang.Exception -> L10
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪兰苏 r9 = (p056.InterfaceC6660) r9     // Catch: java.lang.Exception -> L10
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世 r1 = r8.this$0     // Catch: java.lang.Exception -> L10
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r1 = r1.f12870     // Catch: java.lang.Exception -> L10
            r8.label = r3     // Catch: java.lang.Exception -> L10
            java.lang.Object r9 = r1.invoke(r9, r8)     // Catch: java.lang.Exception -> L10
            if (r9 != r0) goto L20
        L79:
            return r0
        L7a:
            java.lang.String r9 = "Text could be only extracted from non-fragmented frame"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L10
            r0.<init>(r9)     // Catch: java.lang.Exception -> L10
            throw r0     // Catch: java.lang.Exception -> L10
        L82:
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世 r8 = r8.this$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r8 = r8.f12872
            r8.invoke(r9)
            throw r9
        L8a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected text frame, got "
            r1.<init>(r2)
            java.lang.Class r2 = r9.getClass()
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r3 = kotlin.jvm.internal.AbstractC4395.f12971
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r2 = r3.mo8927(r2)
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世 r8 = r8.this$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r8 = r8.f12872
            r8.invoke(r0)
            throw r0
        Lbb:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
