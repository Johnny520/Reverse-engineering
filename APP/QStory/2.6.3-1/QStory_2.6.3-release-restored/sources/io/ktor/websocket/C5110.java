package io.ktor.websocket;

import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import p074.AbstractC7684;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5110 extends AbstractC5112 {
    public C5110(C5095 c5095) {
        c5095.getClass();
        C6309 c6309 = new C6309();
        c6309.m11170(c5095.f13142);
        AbstractC7684.m12645(c6309, c5095.f13141, 0, 14);
        this(AbstractC6310.m11188(c6309, -1));
    }

    public C5110(byte[] bArr) {
        super(true, FrameType.CLOSE, bArr, false, false, false);
    }
}
