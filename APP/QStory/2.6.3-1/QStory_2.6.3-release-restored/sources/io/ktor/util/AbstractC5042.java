package io.ktor.util;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5042 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f13045;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z = true;
        }
        f13045 = z;
    }
}
