package p257;

import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8200 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f22594;

    static {
        int[] iArr = new int[WaitDialog$TYPE.values().length];
        f22594 = iArr;
        try {
            iArr[WaitDialog$TYPE.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22594[WaitDialog$TYPE.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22594[WaitDialog$TYPE.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22594[WaitDialog$TYPE.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
