package io.ktor.client.plugins.websocket;

import io.ktor.http.content.AbstractC3997;
import io.ktor.util.AbstractC4208;
import io.ktor.util.AbstractC4217;
import kotlin.AbstractC5187;
import p088.C7167;
import p236.AbstractC8115;
import p236.C8116;
import p236.C8117;
import p236.InterfaceC8112;

/* JADX INFO: renamed from: io.ktor.client.plugins.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3910 extends AbstractC3997 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8117 f12121;

    public C3910() {
        AbstractC5187.m10214(new C7167(16));
        String strM8591 = AbstractC4208.m8591(AbstractC4217.m8633(16));
        C8116 c8116 = new C8116(2);
        String[] strArr = AbstractC8115.f22413;
        c8116.mo2423("Upgrade", "websocket");
        c8116.mo2423("Connection", "Upgrade");
        c8116.mo2423("Sec-WebSocket-Key", strM8591);
        c8116.mo2423("Sec-WebSocket-Version", "13");
        this.f12121 = c8116.m13585();
    }

    public final String toString() {
        return "WebSocketContent";
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8112 mo8282() {
        return this.f12121;
    }
}
