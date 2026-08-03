package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface CookieJar {
    public static final okhttp3.CookieJar.Companion Companion = null;
    public static final okhttp3.CookieJar NO_COOKIES = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ okhttp3.CookieJar.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class NoCookies implements okhttp3.CookieJar {
            public NoCookies() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.CookieJar
            public java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl r1) {
                    r0 = this;
                    r1.getClass()
                    tf.t r1 = tf.t.f13167g
                    return r1
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(okhttp3.HttpUrl r1, java.util.List<okhttp3.Cookie> r2) {
                    r0 = this;
                    r1.getClass()
                    r2.getClass()
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
            okhttp3.CookieJar.NO_COOKIES = r0
            return
    }

    java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl r1);

    void saveFromResponse(okhttp3.HttpUrl r1, java.util.List<okhttp3.Cookie> r2);
}
