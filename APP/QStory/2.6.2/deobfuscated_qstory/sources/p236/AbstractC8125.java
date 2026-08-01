package p236;

import io.ktor.http.CookieEncoding;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f22429;

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
        f22429 = iArr;
    }
}
