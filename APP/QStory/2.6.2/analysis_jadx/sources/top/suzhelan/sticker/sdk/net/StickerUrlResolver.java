package top.suzhelan.sticker.sdk.net;

import androidx.activity.AbstractC0053;
import java.net.URI;
import kotlin.Metadata;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\u0007"}, d2 = {"Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "resolveAssetUrl", "", "path", "online-sticker-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickerUrlResolver {
    public static final StickerUrlResolver INSTANCE = new StickerUrlResolver();

    private StickerUrlResolver() {
    }

    public static final String resolveAssetUrl(String path) {
        CharSequence charSequenceSubSequence;
        if (path == null || AbstractC5143.m10164(path)) {
            return StickerSdkConfig.BASE_URL;
        }
        if (AbstractC5138.m10125(path, "http://", false) || AbstractC5138.m10125(path, "https://", false)) {
            return path;
        }
        URI uri = new URI(StickerSdkConfig.BASE_URL);
        String string = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), null, null, null).toString();
        string.getClass();
        char[] cArr = {'/'};
        int length = string.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = string.charAt(length);
                int i2 = 0;
                while (true) {
                    if (i2 >= 1) {
                        i2 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (i2 < 0) {
                    charSequenceSubSequence = string.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        String string2 = charSequenceSubSequence.toString();
        if (!AbstractC5138.m10125(path, "/", false)) {
            path = "/".concat(path);
        }
        return AbstractC0053.m136(string2, path);
    }
}
