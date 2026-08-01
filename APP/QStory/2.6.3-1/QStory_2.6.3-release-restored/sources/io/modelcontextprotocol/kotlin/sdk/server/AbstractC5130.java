package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.websocket.InterfaceC5009;
import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5142;
import io.modelcontextprotocol.kotlin.sdk.shared.InterfaceC5141;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7383;
import p072.C7550;
import p072.C7590;
import p072.C7593;
import p072.C7605;
import p072.C7607;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5130 {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9291(InterfaceC5009 interfaceC5009, C5131 c5131, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        WebSocketMcpKtorServerExtensionsKt$createMcpServer$1 webSocketMcpKtorServerExtensionsKt$createMcpServer$1;
        C5128 c5128;
        InterfaceC7383 interfaceC73832;
        InterfaceC5141 interfaceC5141;
        Object objM9300;
        if (continuationImpl instanceof WebSocketMcpKtorServerExtensionsKt$createMcpServer$1) {
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1 = (WebSocketMcpKtorServerExtensionsKt$createMcpServer$1) continuationImpl;
            int i = webSocketMcpKtorServerExtensionsKt$createMcpServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMcpKtorServerExtensionsKt$createMcpServer$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMcpKtorServerExtensionsKt$createMcpServer$1 = new WebSocketMcpKtorServerExtensionsKt$createMcpServer$1(continuationImpl);
            }
        }
        Object obj = webSocketMcpKtorServerExtensionsKt$createMcpServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketMcpKtorServerExtensionsKt$createMcpServer$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C5126 c5126 = new C5126(interfaceC5009);
            c5128 = new C5128(new C7550(), c5131 == null ? new C5131(new C7590(new C7607(), new C7605(), new C7593(), 7)) : c5131);
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$0 = interfaceC7383;
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$1 = c5128;
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1.label = 1;
            if (c5128.m9298(c5126, webSocketMcpKtorServerExtensionsKt$createMcpServer$1) != coroutineSingletons) {
                interfaceC73832 = interfaceC7383;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC6017.m10769(obj);
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5128 = (C5128) webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$0;
            AbstractC6017.m10769(obj);
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$0 = null;
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1.label = 3;
            interfaceC5141 = c5128.f13227;
            if (interfaceC5141 != null || (objM9300 = AbstractC5142.m9300((AbstractC5142) interfaceC5141, webSocketMcpKtorServerExtensionsKt$createMcpServer$1)) != coroutineSingletons) {
                objM9300 = c6008;
            }
            return objM9300 != coroutineSingletons ? coroutineSingletons : c6008;
        }
        c5128 = (C5128) webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$1;
        interfaceC73832 = (InterfaceC7383) webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$0;
        AbstractC6017.m10769(obj);
        webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$0 = c5128;
        webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$1 = null;
        webSocketMcpKtorServerExtensionsKt$createMcpServer$1.label = 2;
        if (interfaceC73832.invoke(c5128, webSocketMcpKtorServerExtensionsKt$createMcpServer$1) != coroutineSingletons) {
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1.L$0 = null;
            webSocketMcpKtorServerExtensionsKt$createMcpServer$1.label = 3;
            interfaceC5141 = c5128.f13227;
            if (interfaceC5141 != null) {
            }
            objM9300 = c6008;
            if (objM9300 != coroutineSingletons) {
            }
        }
    }
}
