package p257;

import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f22593;

    static {
        int[] iArr = new int[WaitDialog$TYPE.values().length];
        f22593 = iArr;
        try {
            iArr[WaitDialog$TYPE.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22593[WaitDialog$TYPE.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22593[WaitDialog$TYPE.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22593[WaitDialog$TYPE.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
