package p015;

import java.io.IOException;
import kotlin.text.AbstractC5138;
import okhttp3.Protocol;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6199 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Protocol m11645(String str) throws IOException {
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
        if (AbstractC5138.m10125(str, protocol7.protocol, false)) {
            return protocol7;
        }
        C5919.m11246("Unexpected protocol: ".concat(str));
        return null;
    }
}
