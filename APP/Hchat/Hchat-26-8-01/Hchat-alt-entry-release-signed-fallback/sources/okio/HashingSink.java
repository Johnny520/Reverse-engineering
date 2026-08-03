package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HashingSink extends okio.ForwardingSink implements okio.Sink {
    public static final okio.HashingSink.Companion Companion = null;
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

        public final okio.HashingSink hmacSha1(okio.Sink r3, okio.ByteString r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        public final okio.HashingSink hmacSha256(okio.Sink r3, okio.ByteString r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        public final okio.HashingSink hmacSha512(okio.Sink r3, okio.ByteString r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        public final okio.HashingSink md5(okio.Sink r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        public final okio.HashingSink sha1(okio.Sink r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        public final okio.HashingSink sha256(okio.Sink r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        public final okio.HashingSink sha512(okio.Sink r3) {
                r2 = this;
                r3.getClass()
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-512"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            okio.HashingSink$Companion r0 = new okio.HashingSink$Companion
            r1 = 0
            r0.<init>(r1)
            okio.HashingSink.Companion = r0
            return
    }

    public HashingSink(okio.Sink r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)
            r2.getClass()
            r0.<init>(r1, r2)
            return
    }

    public HashingSink(okio.Sink r1, java.security.MessageDigest r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1)
            r0.messageDigest = r2
            r1 = 0
            r0.mac = r1
            return
    }

    public HashingSink(okio.Sink r1, javax.crypto.Mac r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1)
            r0.mac = r2
            r1 = 0
            r0.messageDigest = r1
            return
    }

    public HashingSink(okio.Sink r3, okio.ByteString r4, java.lang.String r5) {
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

    public static final okio.HashingSink hmacSha1(okio.Sink r1, okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha1(r1, r2)
            return r1
    }

    public static final okio.HashingSink hmacSha256(okio.Sink r1, okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha256(r1, r2)
            return r1
    }

    public static final okio.HashingSink hmacSha512(okio.Sink r1, okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha512(r1, r2)
            return r1
    }

    public static final okio.HashingSink md5(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.md5(r1)
            return r1
    }

    public static final okio.HashingSink sha1(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha1(r1)
            return r1
    }

    public static final okio.HashingSink sha256(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha256(r1)
            return r1
    }

    public static final okio.HashingSink sha512(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha512(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m171deprecated_hash() {
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

    @Override // okio.ForwardingSink, okio.Sink
    public void write(okio.Buffer r9, long r10) {
            r8 = this;
            r9.getClass()
            long r0 = r9.size()
            r2 = 0
            r4 = r10
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r10 = r9.head
            r10.getClass()
            r0 = 0
        L14:
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 >= 0) goto L45
            long r2 = r4 - r0
            int r11 = r10.limit
            int r6 = r10.pos
            int r11 = r11 - r6
            long r6 = (long) r11
            long r2 = java.lang.Math.min(r2, r6)
            int r11 = (int) r2
            java.security.MessageDigest r2 = r8.messageDigest
            if (r2 == 0) goto L31
            byte[] r3 = r10.data
            int r6 = r10.pos
            r2.update(r3, r6, r11)
            goto L3d
        L31:
            javax.crypto.Mac r2 = r8.mac
            r2.getClass()
            byte[] r3 = r10.data
            int r6 = r10.pos
            r2.update(r3, r6, r11)
        L3d:
            long r2 = (long) r11
            long r0 = r0 + r2
            okio.Segment r10 = r10.next
            r10.getClass()
            goto L14
        L45:
            super.write(r9, r4)
            return
    }
}
