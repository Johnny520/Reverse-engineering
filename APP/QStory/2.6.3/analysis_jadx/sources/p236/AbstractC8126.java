package p236;

import io.ktor.http.CookieEncoding;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f22427;

    static {
        int[] iArr = new int[CookieEncoding.values().length];
        try {
            iArr[CookieEncoding.RAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CookieEncoding.DQUOTES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CookieEncoding.URI_ENCODING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22427 = iArr;
    }
}
