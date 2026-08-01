package kotlinx.serialization.json.internal;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5496 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15196;

    static {
        int[] iArr = new int[WriteMode.values().length];
        try {
            iArr[WriteMode.LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WriteMode.MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WriteMode.OBJ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f15196 = iArr;
    }
}
