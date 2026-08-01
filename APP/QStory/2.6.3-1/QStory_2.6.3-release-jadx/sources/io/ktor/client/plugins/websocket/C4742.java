package io.ktor.client.plugins.websocket;

import io.ktor.http.content.AbstractC4829;
import io.ktor.util.AbstractC5040;
import io.ktor.util.AbstractC5049;
import kotlin.AbstractC6019;
import p104.C7996;
import p252.AbstractC8944;
import p252.C8945;
import p252.C8946;
import p252.InterfaceC8941;

/* JADX INFO: renamed from: io.ktor.client.plugins.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4742 extends AbstractC4829 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8946 f12466;

    public C4742() {
        AbstractC6019.m10773(new C7996(16));
        String strM9150 = AbstractC5040.m9150(AbstractC5049.m9192(16));
        C8945 c8945 = new C8945(2);
        String[] strArr = AbstractC8944.f22758;
        c8945.mo2983("Upgrade", "websocket");
        c8945.mo2983("Connection", "Upgrade");
        c8945.mo2983("Sec-WebSocket-Key", strM9150);
        c8945.mo2983("Sec-WebSocket-Version", "13");
        this.f12466 = c8945.m14144();
    }

    public final String toString() {
        return "WebSocketContent";
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8941 mo8841() {
        return this.f12466;
    }
}
