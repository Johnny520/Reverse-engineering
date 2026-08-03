package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Authenticator {
    public static final okhttp3.Authenticator.Companion Companion = null;
    public static final okhttp3.Authenticator JAVA_NET_AUTHENTICATOR = null;
    public static final okhttp3.Authenticator NONE = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Authenticator.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class AuthenticatorNone implements okhttp3.Authenticator {
            public AuthenticatorNone() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.Authenticator
            public okhttp3.Request authenticate(okhttp3.Route r1, okhttp3.Response r2) {
                    r0 = this;
                    r2.getClass()
                    r1 = 0
                    return r1
            }
        }

        static {
                okhttp3.Authenticator$Companion r0 = new okhttp3.Authenticator$Companion
                r0.<init>()
                okhttp3.Authenticator.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.Authenticator$Companion r0 = okhttp3.Authenticator.Companion.$$INSTANCE
            okhttp3.Authenticator.Companion = r0
            okhttp3.Authenticator$Companion$AuthenticatorNone r0 = new okhttp3.Authenticator$Companion$AuthenticatorNone
            r0.<init>()
            okhttp3.Authenticator.NONE = r0
            okhttp3.internal.authenticator.JavaNetAuthenticator r0 = new okhttp3.internal.authenticator.JavaNetAuthenticator
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            okhttp3.Authenticator.JAVA_NET_AUTHENTICATOR = r0
            return
    }

    okhttp3.Request authenticate(okhttp3.Route r1, okhttp3.Response r2);
}
