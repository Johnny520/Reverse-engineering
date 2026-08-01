package io.ktor.websocket;

import kotlinx.coroutines.C5401;
import p400.AbstractC9154;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4259 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4262 f12777;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5401 f12778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5401 f12779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9156 f12780;

    static {
        InterfaceC9156 interfaceC9156M14712 = AbstractC9154.m14712("io.ktor.websocket.WebSocket");
        interfaceC9156M14712.getClass();
        f12780 = interfaceC9156M14712;
        f12779 = new C5401("ws-incoming-processor");
        f12778 = new C5401("ws-outgoing-processor");
        f12777 = new C4262(CloseReason$Codes.NORMAL, "OK");
    }
}
