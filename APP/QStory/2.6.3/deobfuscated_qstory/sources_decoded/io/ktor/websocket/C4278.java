package io.ktor.websocket;

import kotlinx.io.AbstractC5478;
import kotlinx.io.C5477;
import p058.AbstractC6855;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4278 extends AbstractC4280 {
    public C4278(C4263 c4263) {
        c4263.getClass();
        C5477 c5477 = new C5477();
        c5477.m10611(c4263.f12797);
        AbstractC6855.m12086(c5477, c4263.f12796, 0, 14);
        this(AbstractC5478.m10629(c5477, -1));
    }

    public C4278(byte[] bArr) {
        super(true, FrameType.CLOSE, bArr, false, false, false);
    }
}
