package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum TlsVersion extends java.lang.Enum<okhttp3.TlsVersion> {
    private static final /* synthetic */ okhttp3.TlsVersion[] $VALUES = null;
    public static final okhttp3.TlsVersion.Companion Companion = null;
    public static final okhttp3.TlsVersion SSL_3_0 = null;
    public static final okhttp3.TlsVersion TLS_1_0 = null;
    public static final okhttp3.TlsVersion TLS_1_1 = null;
    public static final okhttp3.TlsVersion TLS_1_2 = null;
    public static final okhttp3.TlsVersion TLS_1_3 = null;
    private final java.lang.String javaName;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.TlsVersion forJavaName(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                int r0 = r3.hashCode()
                r1 = 79201641(0x4b88569, float:4.338071E-36)
                if (r0 == r1) goto L41
                r1 = 79923350(0x4c38896, float:4.5969714E-36)
                if (r0 == r1) goto L36
                switch(r0) {
                    case -503070503: goto L2b;
                    case -503070502: goto L20;
                    case -503070501: goto L15;
                    default: goto L14;
                }
            L14:
                goto L4c
            L15:
                java.lang.String r0 = "TLSv1.3"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4c
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_3
                return r3
            L20:
                java.lang.String r0 = "TLSv1.2"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4c
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_2
                return r3
            L2b:
                java.lang.String r0 = "TLSv1.1"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4c
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_1
                return r3
            L36:
                java.lang.String r0 = "TLSv1"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4c
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_0
                return r3
            L41:
                java.lang.String r0 = "SSLv3"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4c
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.SSL_3_0
                return r3
            L4c:
                java.lang.String r0 = "Unexpected TLS version: "
                java.lang.String r3 = r0.concat(r3)
                j8.o.t(r3)
                r3 = 0
                return r3
        }
    }

    private static final /* synthetic */ okhttp3.TlsVersion[] $values() {
            okhttp3.TlsVersion r0 = okhttp3.TlsVersion.TLS_1_3
            okhttp3.TlsVersion r1 = okhttp3.TlsVersion.TLS_1_2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_1
            okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_0
            okhttp3.TlsVersion r4 = okhttp3.TlsVersion.SSL_3_0
            okhttp3.TlsVersion[] r0 = new okhttp3.TlsVersion[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 0
            java.lang.String r2 = "TLSv1.3"
            java.lang.String r3 = "TLS_1_3"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_3 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 1
            java.lang.String r2 = "TLSv1.2"
            java.lang.String r3 = "TLS_1_2"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_2 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 2
            java.lang.String r2 = "TLSv1.1"
            java.lang.String r3 = "TLS_1_1"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_1 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 3
            java.lang.String r2 = "TLSv1"
            java.lang.String r3 = "TLS_1_0"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_0 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 4
            java.lang.String r2 = "SSLv3"
            java.lang.String r3 = "SSL_3_0"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.SSL_3_0 = r0
            okhttp3.TlsVersion[] r0 = $values()
            okhttp3.TlsVersion.$VALUES = r0
            okhttp3.TlsVersion$Companion r0 = new okhttp3.TlsVersion$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.TlsVersion.Companion = r0
            return
    }

    TlsVersion(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.javaName = r3
            return
    }

    public static final okhttp3.TlsVersion forJavaName(java.lang.String r1) {
            okhttp3.TlsVersion$Companion r0 = okhttp3.TlsVersion.Companion
            okhttp3.TlsVersion r1 = r0.forJavaName(r1)
            return r1
    }

    public static okhttp3.TlsVersion valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.TlsVersion> r0 = okhttp3.TlsVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.TlsVersion r1 = (okhttp3.TlsVersion) r1
            return r1
    }

    public static okhttp3.TlsVersion[] values() {
            okhttp3.TlsVersion[] r0 = okhttp3.TlsVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.TlsVersion[] r0 = (okhttp3.TlsVersion[]) r0
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final java.lang.String m150deprecated_javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }

    public final java.lang.String javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }
}
