package io.ktor.websocket;

import kotlinx.coroutines.C5402;
import p398.AbstractC9139;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4260 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4263 f12781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5402 f12782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5402 f12783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9141 f12784;

    static {
        InterfaceC9141 interfaceC9141M14703 = AbstractC9139.m14703("io.ktor.websocket.WebSocket");
        interfaceC9141M14703.getClass();
        f12784 = interfaceC9141M14703;
        f12783 = new C5402("ws-incoming-processor");
        f12782 = new C5402("ws-outgoing-processor");
        f12781 = new C4263(CloseReason$Codes.NORMAL, "OK");
    }
}
