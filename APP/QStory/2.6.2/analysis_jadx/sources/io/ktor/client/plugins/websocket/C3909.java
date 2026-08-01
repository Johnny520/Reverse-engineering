package io.ktor.client.plugins.websocket;

import io.ktor.http.content.AbstractC3996;
import io.ktor.util.AbstractC4207;
import io.ktor.util.AbstractC4216;
import kotlin.AbstractC5186;
import p088.C7166;
import p236.AbstractC8114;
import p236.C8115;
import p236.C8116;
import p236.InterfaceC8111;

/* JADX INFO: renamed from: io.ktor.client.plugins.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3909 extends AbstractC3996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8116 f12116;

    public C3909() {
        AbstractC5186.m10210(new C7166(16));
        String strM8601 = AbstractC4207.m8601(AbstractC4216.m8643(16));
        C8115 c8115 = new C8115(2);
        String[] strArr = AbstractC8114.f22415;
        c8115.mo2413("Upgrade", "websocket");
        c8115.mo2413("Connection", "Upgrade");
        c8115.mo2413("Sec-WebSocket-Key", strM8601);
        c8115.mo2413("Sec-WebSocket-Version", "13");
        this.f12116 = c8115.m13556();
    }

    public final String toString() {
        return "WebSocketContent";
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8111 mo8292() {
        return this.f12116;
    }
}
