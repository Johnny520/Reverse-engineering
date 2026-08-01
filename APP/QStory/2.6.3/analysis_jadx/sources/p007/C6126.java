package p007;

import java.io.IOException;
import kotlin.text.AbstractC5139;
import okhttp3.Protocol;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6126 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Protocol m11516(String str) throws IOException {
        str.getClass();
        Protocol protocol = Protocol.HTTP_1_0;
        if (str.equals(protocol.protocol)) {
            return protocol;
        }
        Protocol protocol2 = Protocol.HTTP_1_1;
        if (str.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
        if (str.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = Protocol.HTTP_2;
        if (str.equals(protocol4.protocol)) {
            return protocol4;
        }
        Protocol protocol5 = Protocol.SPDY_3;
        if (str.equals(protocol5.protocol)) {
            return protocol5;
        }
        Protocol protocol6 = Protocol.QUIC;
        if (str.equals(protocol6.protocol)) {
            return protocol6;
        }
        Protocol protocol7 = Protocol.HTTP_3;
        if (AbstractC5139.m10139(str, protocol7.protocol, false)) {
            return protocol7;
        }
        C5925.m11307("Unexpected protocol: ".concat(str));
        return null;
    }
}
