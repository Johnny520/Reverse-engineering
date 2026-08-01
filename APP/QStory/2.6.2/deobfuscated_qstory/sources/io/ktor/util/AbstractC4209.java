package io.ktor.util;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f12696;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z = true;
        }
        f12696 = z;
    }
}
