package p257;

import com.kongzue.dialogx.interfaces.SELECT_MODE;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8205 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f22612;

    static {
        int[] iArr = new int[SELECT_MODE.values().length];
        f22612 = iArr;
        try {
            iArr[SELECT_MODE.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22612[SELECT_MODE.SINGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22612[SELECT_MODE.MULTIPLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
