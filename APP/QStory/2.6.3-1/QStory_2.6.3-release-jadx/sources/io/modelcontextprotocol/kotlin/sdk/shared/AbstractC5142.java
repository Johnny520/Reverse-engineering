package io.modelcontextprotocol.kotlin.sdk.shared;

import io.ktor.server.websocket.InterfaceC5009;
import io.ktor.util.C5043;
import io.ktor.websocket.AbstractC5089;
import io.ktor.websocket.C5095;
import io.ktor.websocket.C5111;
import io.ktor.websocket.CloseReason$Codes;
import io.ktor.websocket.FrameType;
import io.modelcontextprotocol.kotlin.sdk.server.C5126;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.InterfaceC6032;
import p072.InterfaceC7490;
import p074.AbstractC7684;
import p104.AbstractC7988;
import p252.AbstractC8944;
import p252.InterfaceC8941;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5142 extends AbstractC5138 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6016 f13232 = AbstractC6019.m10773(new C5140(this, 5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AtomicBoolean f13231 = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m9299(AbstractC5142 abstractC5142, ContinuationImpl continuationImpl) {
        WebSocketMcpTransport$start$1 webSocketMcpTransport$start$1;
        if (continuationImpl instanceof WebSocketMcpTransport$start$1) {
            webSocketMcpTransport$start$1 = (WebSocketMcpTransport$start$1) continuationImpl;
            int i = webSocketMcpTransport$start$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMcpTransport$start$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMcpTransport$start$1 = new WebSocketMcpTransport$start$1(abstractC5142, continuationImpl);
            }
        }
        Object obj = webSocketMcpTransport$start$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketMcpTransport$start$1.label;
        C6008 c6008 = C6008.f15084;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (!abstractC5142.f13231.compareAndSet(false, true)) {
                C6755.m11870("WebSocketClientTransport already started! If using Client class, note that connect() calls start() automatically.");
                return null;
            }
            webSocketMcpTransport$start$1.L$0 = abstractC5142;
            webSocketMcpTransport$start$1.label = 1;
            InterfaceC8941 interfaceC8941Mo944 = ((C5126) abstractC5142).f13197.mo9101().mo9018().mo944();
            String[] strArr = AbstractC8944.f22758;
            String strMo8915 = interfaceC8941Mo944.mo8915("Sec-WebSocket-Protocol");
            if (!AbstractC5227.m9466(strMo8915, "mcp")) {
                C5043.m9178(strMo8915, "Invalid subprotocol: ", ", expected mcp");
                return null;
            }
            if (c6008 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC5142 = (AbstractC5142) webSocketMcpTransport$start$1.L$0;
            AbstractC6017.m10769(obj);
        }
        AbstractC6231.m11036((InterfaceC6233) abstractC5142.f13232.getValue(), new C6234("WebSocketMcpTransport.collect#" + abstractC5142.hashCode()), null, new WebSocketMcpTransport$start$2(abstractC5142, null), 2);
        AbstractC6231.m11052(((C5126) abstractC5142).f13197.mo2990()).mo11118(new C5133(abstractC5142, i3));
        return c6008;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.mo11123(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m9300(AbstractC5142 abstractC5142, ContinuationImpl continuationImpl) {
        WebSocketMcpTransport$close$1 webSocketMcpTransport$close$1;
        if (continuationImpl instanceof WebSocketMcpTransport$close$1) {
            webSocketMcpTransport$close$1 = (WebSocketMcpTransport$close$1) continuationImpl;
            int i = webSocketMcpTransport$close$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMcpTransport$close$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMcpTransport$close$1 = new WebSocketMcpTransport$close$1(abstractC5142, continuationImpl);
            }
        }
        Object obj = webSocketMcpTransport$close$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketMcpTransport$close$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (!abstractC5142.f13231.get()) {
                C6755.m11870("Not connected");
                return null;
            }
            InterfaceC5009 interfaceC5009 = ((C5126) abstractC5142).f13197;
            webSocketMcpTransport$close$1.L$0 = abstractC5142;
            webSocketMcpTransport$close$1.label = 1;
            if (AbstractC5089.m9273(interfaceC5009, new C5095(CloseReason$Codes.NORMAL, ""), webSocketMcpTransport$close$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        abstractC5142 = (AbstractC5142) webSocketMcpTransport$close$1.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC6284 interfaceC6284M11052 = AbstractC6231.m11052(((C5126) abstractC5142).f13197.mo2990());
        webSocketMcpTransport$close$1.L$0 = null;
        webSocketMcpTransport$close$1.label = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m9301(InterfaceC7490 interfaceC7490, InterfaceC5189 interfaceC5189) {
        if (!this.f13231.get()) {
            C6755.m11870("Not connected");
            return null;
        }
        InterfaceC6032 interfaceC6032Mo9104 = ((C5126) this).f13197.mo9104();
        AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
        abstractC7988M9302.getClass();
        Object objMo8992 = interfaceC6032Mo9104.mo8992(new C5111(true, FrameType.TEXT, AbstractC7684.m12643(abstractC7988M9302.m12983(InterfaceC7490.Companion.serializer(), interfaceC7490), AbstractC5964.f15033), false, false, false), interfaceC5189);
        return objMo8992 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8992 : C6008.f15084;
    }
}
