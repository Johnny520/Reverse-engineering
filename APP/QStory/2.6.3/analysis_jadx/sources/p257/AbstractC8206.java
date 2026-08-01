package p257;

import com.kongzue.dialogx.interfaces.SELECT_MODE;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f22611;

    static {
        int[] iArr = new int[SELECT_MODE.values().length];
        f22611 = iArr;
        try {
            iArr[SELECT_MODE.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22611[SELECT_MODE.SINGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22611[SELECT_MODE.MULTIPLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
