package okhttp3;

/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u000b"}, m115d2 = {"Lokhttp3/CookieJar;", "", "loadForRequest", "", "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "", "cookies", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public interface CookieJar {
    public static final okhttp3.CookieJar.Companion Companion = null;
    public static final okhttp3.CookieJar NO_COOKIES = null;

    /* JADX INFO: compiled from: CookieJar.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m115d2 = {"Lokhttp3/CookieJar$Companion;", "", "()V", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        static final /* synthetic */ okhttp3.CookieJar.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: CookieJar.kt */
        @kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u000b"}, m115d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "()V", "loadForRequest", "", "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "", "cookies", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
        private static final class NoCookies implements okhttp3.CookieJar {
            public NoCookies() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.CookieJar
            public java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl r2) {
                    r1 = this;
                    java.lang.String r0 = "url"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
                    return r0
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(okhttp3.HttpUrl r2, java.util.List<okhttp3.Cookie> r3) {
                    r1 = this;
                    java.lang.String r0 = "url"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.lang.String r0 = "cookies"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    return
            }
        }

        static {
                okhttp3.CookieJar$Companion r0 = new okhttp3.CookieJar$Companion
                r0.<init>()
                okhttp3.CookieJar.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.CookieJar$Companion r0 = okhttp3.CookieJar.Companion.$$INSTANCE
            okhttp3.CookieJar.Companion = r0
            okhttp3.CookieJar$Companion$NoCookies r0 = new okhttp3.CookieJar$Companion$NoCookies
            r0.<init>()
            okhttp3.CookieJar r0 = (okhttp3.CookieJar) r0
            okhttp3.CookieJar.NO_COOKIES = r0
            return
    }

    java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl r1);

    void saveFromResponse(okhttp3.HttpUrl r1, java.util.List<okhttp3.Cookie> r2);
}
