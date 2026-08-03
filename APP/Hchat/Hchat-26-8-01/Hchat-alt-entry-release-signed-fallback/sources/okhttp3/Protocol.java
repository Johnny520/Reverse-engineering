package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum Protocol extends java.lang.Enum<okhttp3.Protocol> {
    private static final /* synthetic */ okhttp3.Protocol[] $VALUES = null;
    public static final okhttp3.Protocol.Companion Companion = null;
    public static final okhttp3.Protocol H2_PRIOR_KNOWLEDGE = null;
    public static final okhttp3.Protocol HTTP_1_0 = null;
    public static final okhttp3.Protocol HTTP_1_1 = null;
    public static final okhttp3.Protocol HTTP_2 = null;
    public static final okhttp3.Protocol QUIC = null;

    @sf.a
    public static final okhttp3.Protocol SPDY_3 = null;
    private final java.lang.String protocol;

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

        public final okhttp3.Protocol get(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L10
                return r0
            L10:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L1d
                return r0
            L1d:
                okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L2a
                return r0
            L2a:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_2
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L37
                return r0
            L37:
                okhttp3.Protocol r0 = okhttp3.Protocol.SPDY_3
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L44
                return r0
            L44:
                okhttp3.Protocol r0 = okhttp3.Protocol.QUIC
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L51
                return r0
            L51:
                java.lang.String r0 = "Unexpected protocol: "
                java.lang.String r3 = r0.concat(r3)
                j8.o.y(r3)
                r3 = 0
                return r3
        }
    }

    private static final /* synthetic */ okhttp3.Protocol[] $values() {
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Protocol r2 = okhttp3.Protocol.SPDY_3
            okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_2
            okhttp3.Protocol r4 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            okhttp3.Protocol r5 = okhttp3.Protocol.QUIC
            okhttp3.Protocol[] r0 = new okhttp3.Protocol[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 0
            java.lang.String r2 = "http/1.0"
            java.lang.String r3 = "HTTP_1_0"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.HTTP_1_0 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 1
            java.lang.String r2 = "http/1.1"
            java.lang.String r3 = "HTTP_1_1"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.HTTP_1_1 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 2
            java.lang.String r2 = "spdy/3.1"
            java.lang.String r3 = "SPDY_3"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.SPDY_3 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 3
            java.lang.String r2 = "h2"
            java.lang.String r3 = "HTTP_2"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.HTTP_2 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 4
            java.lang.String r2 = "h2_prior_knowledge"
            java.lang.String r3 = "H2_PRIOR_KNOWLEDGE"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.H2_PRIOR_KNOWLEDGE = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 5
            java.lang.String r2 = "quic"
            java.lang.String r3 = "QUIC"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.QUIC = r0
            okhttp3.Protocol[] r0 = $values()
            okhttp3.Protocol.$VALUES = r0
            okhttp3.Protocol$Companion r0 = new okhttp3.Protocol$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Protocol.Companion = r0
            return
    }

    Protocol(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.protocol = r3
            return
    }

    public static final /* synthetic */ java.lang.String access$getProtocol$p(okhttp3.Protocol r0) {
            java.lang.String r0 = r0.protocol
            return r0
    }

    public static final okhttp3.Protocol get(java.lang.String r1) {
            okhttp3.Protocol$Companion r0 = okhttp3.Protocol.Companion
            okhttp3.Protocol r1 = r0.get(r1)
            return r1
    }

    public static okhttp3.Protocol valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.Protocol> r0 = okhttp3.Protocol.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.Protocol r1 = (okhttp3.Protocol) r1
            return r1
    }

    public static okhttp3.Protocol[] values() {
            okhttp3.Protocol[] r0 = okhttp3.Protocol.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.Protocol[] r0 = (okhttp3.Protocol[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }
}
