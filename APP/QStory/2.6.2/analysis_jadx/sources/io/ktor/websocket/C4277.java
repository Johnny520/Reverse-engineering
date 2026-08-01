package io.ktor.websocket;

import kotlinx.io.AbstractC5477;
import kotlinx.io.C5476;
import p058.AbstractC6854;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4277 extends AbstractC4279 {
    public C4277(C4262 c4262) {
        c4262.getClass();
        C5476 c5476 = new C5476();
        c5476.m10607(c4262.f12793);
        AbstractC6854.m12058(c5476, c4262.f12792, 0, 14);
        this(AbstractC5477.m10625(c5476, -1));
    }

    public C4277(byte[] bArr) {
        super(true, FrameType.CLOSE, bArr, false, false, false);
    }
}
