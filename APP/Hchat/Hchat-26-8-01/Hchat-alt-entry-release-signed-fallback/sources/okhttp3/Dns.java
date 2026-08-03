package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Dns {
    public static final okhttp3.Dns.Companion Companion = null;
    public static final okhttp3.Dns SYSTEM = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Dns.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class DnsSystem implements okhttp3.Dns {
            public DnsSystem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.Dns
            public java.util.List<java.net.InetAddress> lookup(java.lang.String r4) {
                    r3 = this;
                    r4.getClass()
                    java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r4)     // Catch: java.lang.NullPointerException -> Lf
                    r0.getClass()     // Catch: java.lang.NullPointerException -> Lf
                    java.util.List r4 = tf.l.L0(r0)     // Catch: java.lang.NullPointerException -> Lf
                    return r4
                Lf:
                    r0 = move-exception
                    java.net.UnknownHostException r1 = new java.net.UnknownHostException
                    java.lang.String r2 = "Broken system behaviour for dns lookup of "
                    java.lang.String r4 = r2.concat(r4)
                    r1.<init>(r4)
                    r1.initCause(r0)
                    throw r1
            }
        }

        static {
                okhttp3.Dns$Companion r0 = new okhttp3.Dns$Companion
                r0.<init>()
                okhttp3.Dns.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.Dns$Companion r0 = okhttp3.Dns.Companion.$$INSTANCE
            okhttp3.Dns.Companion = r0
            okhttp3.Dns$Companion$DnsSystem r0 = new okhttp3.Dns$Companion$DnsSystem
            r0.<init>()
            okhttp3.Dns.SYSTEM = r0
            return
    }

    java.util.List<java.net.InetAddress> lookup(java.lang.String r1);
}
