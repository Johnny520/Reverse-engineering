package io.ktor.websocket;

import kotlinx.coroutines.C6234;
import p414.AbstractC9968;
import p414.InterfaceC9970;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5092 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5095 f13126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6234 f13127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6234 f13128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9970 f13129;

    static {
        InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262("io.ktor.websocket.WebSocket");
        interfaceC9970M15262.getClass();
        f13129 = interfaceC9970M15262;
        f13128 = new C6234("ws-incoming-processor");
        f13127 = new C6234("ws-outgoing-processor");
        f13126 = new C5095(CloseReason$Codes.NORMAL, "OK");
    }
}
