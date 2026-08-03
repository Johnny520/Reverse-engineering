package okhttp3.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Internal {
    public static final okhttp3.Headers.Builder addHeaderLenient(okhttp3.Headers.Builder r0, java.lang.String r1) {
            r0.getClass()
            r1.getClass()
            okhttp3.Headers$Builder r0 = r0.addLenient$okhttp(r1)
            return r0
    }

    public static final okhttp3.Headers.Builder addHeaderLenient(okhttp3.Headers.Builder r0, java.lang.String r1, java.lang.String r2) {
            r0.getClass()
            r1.getClass()
            r2.getClass()
            okhttp3.Headers$Builder r0 = r0.addLenient$okhttp(r1, r2)
            return r0
    }

    public static final void applyConnectionSpec(okhttp3.ConnectionSpec r0, javax.net.ssl.SSLSocket r1, boolean r2) {
            r0.getClass()
            r1.getClass()
            r0.apply$okhttp(r1, r2)
            return
    }

    public static final okhttp3.Response cacheGet(okhttp3.Cache r0, okhttp3.Request r1) {
            r0.getClass()
            r1.getClass()
            okhttp3.Response r0 = r0.get$okhttp(r1)
            return r0
    }

    public static final java.lang.String cookieToString(okhttp3.Cookie r0, boolean r1) {
            r0.getClass()
            java.lang.String r0 = r0.toString$okhttp(r1)
            return r0
    }

    public static final okhttp3.Cookie parseCookie(long r1, okhttp3.HttpUrl r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            okhttp3.Cookie r1 = r0.parse$okhttp(r1, r3, r4)
            return r1
    }
}
