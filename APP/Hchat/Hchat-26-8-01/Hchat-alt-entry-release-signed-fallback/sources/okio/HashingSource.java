package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HashingSource extends okio.ForwardingSource implements okio.Source {
    public static final okio.HashingSource.Companion Companion = null;
    private final javax.crypto.Mac mac;
    private final java.security.MessageDigest messageDigest;

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

        public final okio.HashingSource hmacSha1(okio.Source r3, okio.ByteString r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        public final okio.HashingSource hmacSha256(okio.Source r3, okio.ByteString r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        public final okio.HashingSource hmacSha512(okio.Source r3, okio.ByteString r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        public final okio.HashingSource md5(okio.Source r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        public final okio.HashingSource sha1(okio.Source r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        public final okio.HashingSource sha256(okio.Source r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        public final okio.HashingSource sha512(okio.Source r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-512"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            okio.HashingSource$Companion r0 = new okio.HashingSource$Companion
            r1 = 0
            r0.<init>(r1)
            okio.HashingSource.Companion = r0
            return
    }

    public HashingSource(okio.Source r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)
            r2.getClass()
            r0.<init>(r1, r2)
            return
    }

    public HashingSource(okio.Source r1, java.security.MessageDigest r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1)
            r0.messageDigest = r2
            r1 = 0
            r0.mac = r1
            return
    }

    public HashingSource(okio.Source r1, javax.crypto.Mac r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1)
            r0.mac = r2
            r1 = 0
            r0.messageDigest = r1
            return
    }

    public HashingSource(okio.Source r3, okio.ByteString r4, java.lang.String r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L1d
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L1d
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L1d
            r1.<init>(r4, r5)     // Catch: java.security.InvalidKeyException -> L1d
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L1d
            r2.<init>(r3, r0)
            return
        L1d:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    public static final okio.HashingSource hmacSha1(okio.Source r1, okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha1(r1, r2)
            return r1
    }

    public static final okio.HashingSource hmacSha256(okio.Source r1, okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha256(r1, r2)
            return r1
    }

    public static final okio.HashingSource hmacSha512(okio.Source r1, okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha512(r1, r2)
            return r1
    }

    public static final okio.HashingSource md5(okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.md5(r1)
            return r1
    }

    public static final okio.HashingSource sha1(okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha1(r1)
            return r1
    }

    public static final okio.HashingSource sha256(okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha256(r1)
            return r1
    }

    public static final okio.HashingSource sha512(okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha512(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m172deprecated_hash() {
            r1 = this;
            okio.ByteString r0 = r1.hash()
            return r0
    }

    public final okio.ByteString hash() {
            r2 = this;
            java.security.MessageDigest r0 = r2.messageDigest
            if (r0 == 0) goto L9
            byte[] r0 = r0.digest()
            goto L12
        L9:
            javax.crypto.Mac r0 = r2.mac
            r0.getClass()
            byte[] r0 = r0.doFinal()
        L12:
            okio.ByteString r1 = new okio.ByteString
            r0.getClass()
            r1.<init>(r0)
            return r1
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(okio.Buffer r8, long r9) {
            r7 = this;
            r8.getClass()
            long r9 = super.read(r8, r9)
            r0 = -1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L62
            long r0 = r8.size()
            long r0 = r0 - r9
            long r2 = r8.size()
            okio.Segment r4 = r8.head
            r4.getClass()
        L1b:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L2c
            okio.Segment r4 = r4.prev
            r4.getClass()
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r2 = r2 - r5
            goto L1b
        L2c:
            long r5 = r8.size()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L62
            int r5 = r4.pos
            long r5 = (long) r5
            long r5 = r5 + r0
            long r5 = r5 - r2
            int r0 = (int) r5
            java.security.MessageDigest r1 = r7.messageDigest
            if (r1 == 0) goto L47
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r6 = r6 - r0
            r1.update(r5, r0, r6)
            goto L54
        L47:
            javax.crypto.Mac r1 = r7.mac
            r1.getClass()
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r6 = r6 - r0
            r1.update(r5, r0, r6)
        L54:
            int r0 = r4.limit
            int r1 = r4.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 + r0
            okio.Segment r4 = r4.next
            r4.getClass()
            r0 = r2
            goto L2c
        L62:
            return r9
    }
}
