package io.modelcontextprotocol.kotlin.sdk.shared;

import io.ktor.websocket.C4278;
import io.ktor.websocket.FrameType;
import io.modelcontextprotocol.kotlin.sdk.server.C4293;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.AbstractC5131;
import kotlinx.coroutines.channels.InterfaceC5199;
import p056.InterfaceC6660;
import p058.AbstractC6854;
import p088.AbstractC7158;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4309 extends AbstractC4305 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5183 f12883 = AbstractC5186.m10210(new C4307(this, 5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AtomicBoolean f12882 = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8750(io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$1
            if (r0 == 0) goto L13
            r0 = r7
            io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$1 r0 = (io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$1 r0 = new io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2e
            java.lang.Object r6 = r0.L$0
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世 r6 = (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309) r6
            kotlin.AbstractC5184.m10206(r7)
            goto L68
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L34:
            kotlin.AbstractC5184.m10206(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f12882
            r2 = 0
            boolean r7 = r7.compareAndSet(r2, r5)
            if (r7 == 0) goto Lae
            r0.L$0 = r6
            r0.label = r5
            r7 = r6
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r7 = (io.modelcontextprotocol.kotlin.sdk.server.C4293) r7
            io.ktor.server.websocket.飘花落叶言子楪世兰苏哲 r7 = r7.f12848
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r7 = r7.mo8552()
            io.ktor.server.request.飘花落叶言子楪世哲苏兰 r7 = r7.mo8469()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世哲苏 r7 = r7.mo383()
            java.lang.String[] r0 = p236.AbstractC8114.f22415
            java.lang.String r0 = "Sec-WebSocket-Protocol"
            java.lang.String r7 = r7.mo8366(r0)
            java.lang.String r0 = "mcp"
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r7, r0)
            if (r0 == 0) goto La6
            if (r4 != r1) goto L68
            return r1
        L68:
            kotlin.飘花落叶言子楪苏世哲兰 r7 = r6.f12883
            java.lang.Object r7 = r7.getValue()
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r7 = (kotlinx.coroutines.InterfaceC5400) r7
            kotlinx.coroutines.飘花落叶言子世楪哲苏兰 r0 = new kotlinx.coroutines.飘花落叶言子世楪哲苏兰
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "WebSocketMcpTransport.collect#"
            r1.<init>(r2)
            int r2 = r6.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$2 r1 = new io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$2
            r1.<init>(r6, r3)
            r2 = 2
            kotlinx.coroutines.AbstractC5398.m10473(r7, r0, r3, r1, r2)
            r7 = r6
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r7 = (io.modelcontextprotocol.kotlin.sdk.server.C4293) r7
            io.ktor.server.websocket.飘花落叶言子楪世兰苏哲 r7 = r7.f12848
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = r7.mo2420()
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = kotlinx.coroutines.AbstractC5398.m10489(r7)
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰哲苏 r0 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰哲苏
            r0.<init>(r6, r5)
            r7.mo10554(r0)
            return r4
        La6:
            java.lang.String r6 = "Invalid subprotocol: "
            java.lang.String r0 = ", expected mcp"
            io.ktor.util.C4210.m8629(r7, r6, r0)
            return r3
        Lae:
            java.lang.String r6 = "WebSocketClientTransport already started! If using Client class, note that connect() calls start() automatically."
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309.m8750(io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.mo10558(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8751(io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$close$1
            if (r0 == 0) goto L13
            r0 = r7
            io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$close$1 r0 = (io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$close$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$close$1 r0 = new io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$close$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r3) goto L2b
            kotlin.AbstractC5184.m10206(r7)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r4
        L31:
            java.lang.Object r6 = r0.L$0
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世 r6 = (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309) r6
            kotlin.AbstractC5184.m10206(r7)
            goto L54
        L39:
            kotlin.AbstractC5184.m10206(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f12882
            boolean r7 = r7.get()
            if (r7 == 0) goto L6e
            r7 = r6
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r7 = (io.modelcontextprotocol.kotlin.sdk.server.C4293) r7
            io.ktor.server.websocket.飘花落叶言子楪世兰苏哲 r7 = r7.f12848
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = io.ktor.websocket.AbstractC4256.m8723(r7, r0)
            if (r7 != r1) goto L54
            goto L6a
        L54:
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r6 = (io.modelcontextprotocol.kotlin.sdk.server.C4293) r6
            io.ktor.server.websocket.飘花落叶言子楪世兰苏哲 r6 = r6.f12848
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r6 = r6.mo2420()
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r6 = kotlinx.coroutines.AbstractC5398.m10489(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.mo10558(r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L6e:
            java.lang.String r6 = "Not connected"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309.m8751(io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m8752(InterfaceC6660 interfaceC6660, InterfaceC4356 interfaceC4356) {
        if (!this.f12882.get()) {
            C5919.m11250("Not connected");
            return null;
        }
        InterfaceC5199 interfaceC5199Mo8555 = ((C4293) this).f12848.mo8555();
        AbstractC7158 abstractC7158M8753 = AbstractC4310.m8753();
        abstractC7158M8753.getClass();
        Object objMo8443 = interfaceC5199Mo8555.mo8443(new C4278(true, FrameType.TEXT, AbstractC6854.m12056(abstractC7158M8753.m12397(InterfaceC6660.Companion.serializer(), interfaceC6660), AbstractC5131.f14688), false, false, false), interfaceC4356);
        return objMo8443 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8443 : C5175.f14739;
    }
}
