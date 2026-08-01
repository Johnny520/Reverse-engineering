package p376;

import java.nio.file.StandardOpenOption;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC8987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f25217;

    static {
        int[] iArr = new int[StandardOpenOption.values().length];
        f25217 = iArr;
        try {
            iArr[StandardOpenOption.WRITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25217[StandardOpenOption.DSYNC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25217[StandardOpenOption.SYNC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
