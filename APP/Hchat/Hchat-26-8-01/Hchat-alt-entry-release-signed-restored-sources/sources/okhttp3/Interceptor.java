package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import p085fg.InterfaceC1231l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i9, TimeUnit timeUnit);

        Chain withReadTimeout(int i9, TimeUnit timeUnit);

        Chain withWriteTimeout(int i9, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Interceptor invoke(final InterfaceC1231l interfaceC1231l) {
            interfaceC1231l.getClass();
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return (Response) interfaceC1231l.invoke(chain);
                }
            };
        }
    }

    Response intercept(Chain chain);
}
