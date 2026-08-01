package p377;

import java.nio.file.StandardOpenOption;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰哲世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC8987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f25238;

    static {
        int[] iArr = new int[StandardOpenOption.values().length];
        f25238 = iArr;
        try {
            iArr[StandardOpenOption.WRITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25238[StandardOpenOption.DSYNC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25238[StandardOpenOption.SYNC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
