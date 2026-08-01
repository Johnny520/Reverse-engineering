package okhttp3;

import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5114x;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/CookieJar;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/HttpUrl;", "url", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "cookies", "Ll8/i0;", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface CookieJar {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, m16758d2 = {"Lokhttp3/CookieJar$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        @Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m16758d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "<init>", "()V", "Lokhttp3/HttpUrl;", "url", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "cookies", "Ll8/i0;", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl url) {
                url.getClass();
                return AbstractC5114x.m20800o();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                url.getClass();
                cookies.getClass();
            }
        }

        private Companion() {
        }
    }

    List<Cookie> loadForRequest(HttpUrl url);

    void saveFromResponse(HttpUrl url, List<Cookie> cookies);
}
