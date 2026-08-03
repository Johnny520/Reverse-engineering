package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Interceptor {
    public static final okhttp3.Interceptor.Companion Companion = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Chain {
        okhttp3.Call call();

        int connectTimeoutMillis();

        okhttp3.Connection connection();

        okhttp3.Response proceed(okhttp3.Request r1);

        int readTimeoutMillis();

        okhttp3.Request request();

        okhttp3.Interceptor.Chain withConnectTimeout(int r1, java.util.concurrent.TimeUnit r2);

        okhttp3.Interceptor.Chain withReadTimeout(int r1, java.util.concurrent.TimeUnit r2);

        okhttp3.Interceptor.Chain withWriteTimeout(int r1, java.util.concurrent.TimeUnit r2);

        int writeTimeoutMillis();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Interceptor.Companion $$INSTANCE = null;

        static {
                okhttp3.Interceptor$Companion r0 = new okhttp3.Interceptor$Companion
                r0.<init>()
                okhttp3.Interceptor.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.Interceptor invoke(fg.l r2) {
                r1 = this;
                r2.getClass()
                okhttp3.Interceptor$Companion$invoke$1 r0 = new okhttp3.Interceptor$Companion$invoke$1
                r0.<init>(r2)
                return r0
        }
    }

    static {
            okhttp3.Interceptor$Companion r0 = okhttp3.Interceptor.Companion.$$INSTANCE
            okhttp3.Interceptor.Companion = r0
            return
    }

    okhttp3.Response intercept(okhttp3.Interceptor.Chain r1);
}
