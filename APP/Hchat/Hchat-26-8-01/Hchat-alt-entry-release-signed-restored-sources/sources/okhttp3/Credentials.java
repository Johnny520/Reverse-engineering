package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.ByteString;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Credentials() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String basic(String str, String str2, Charset charset) {
        str.getClass();
        str2.getClass();
        charset.getClass();
        return AbstractC4855en.m9263g("Basic ", ByteString.Companion.encodeString(str + ':' + str2, charset).base64());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            charset.getClass();
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2) {
        str.getClass();
        str2.getClass();
        return basic$default(str, str2, null, 4, null);
    }
}
