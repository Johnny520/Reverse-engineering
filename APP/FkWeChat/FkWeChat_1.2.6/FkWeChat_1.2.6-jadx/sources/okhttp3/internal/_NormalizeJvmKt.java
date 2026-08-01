package okhttp3.internal;

import java.text.Normalizer;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, m16758d2 = {"normalizeNfc", _UrlKt.FRAGMENT_ENCODE_SET, "string", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class _NormalizeJvmKt {
    public static final String normalizeNfc(String str) {
        str.getClass();
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        strNormalize.getClass();
        return strNormalize;
    }
}
