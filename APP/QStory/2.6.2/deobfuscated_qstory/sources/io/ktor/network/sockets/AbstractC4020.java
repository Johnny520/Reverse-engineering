package io.ktor.network.sockets;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f12276;

    static {
        boolean z;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f12276 = z;
    }
}
