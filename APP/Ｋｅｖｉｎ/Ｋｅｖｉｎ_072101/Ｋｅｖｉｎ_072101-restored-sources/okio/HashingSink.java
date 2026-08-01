package okio;

/* JADX INFO: compiled from: HashingSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m115d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "sink", "digest", "Ljava/security/MessageDigest;", "(Lokio/Sink;Ljava/security/MessageDigest;)V", "algorithm", "", "(Lokio/Sink;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Sink;Ljavax/crypto/Mac;)V", "key", "Lokio/ByteString;", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "write", "", "source", "Lokio/Buffer;", "byteCount", "", "Companion", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class HashingSink extends okio.ForwardingSink implements okio.Sink {
    public static final okio.HashingSink.Companion Companion = null;
    private final javax.crypto.Mac mac;
    private final java.security.MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSink.kt */
    @kotlin.Metadata(m114d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, m115d2 = {"Lokio/HashingSink$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSink;", "sink", "Lokio/Sink;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha1(okio.Sink r3, okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha256(okio.Sink r3, okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha512(okio.Sink r3, okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink md5(okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha1(okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha256(okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha512(okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
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

    public HashingSink(okio.Sink r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r4)
            java.lang.String r1 = "getInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r0)
            return
    }

    public HashingSink(okio.Sink r2, java.security.MessageDigest r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.messageDigest = r3
            r0 = 0
            r1.mac = r0
            return
    }

    public HashingSink(okio.Sink r2, javax.crypto.Mac r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.mac = r3
            r0 = 0
            r1.messageDigest = r0
            return
    }

    public HashingSink(okio.Sink r6, okio.ByteString r7, java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r8)     // Catch: java.security.InvalidKeyException -> L31
            r1 = r0
            r2 = 0
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L31
            byte[] r4 = r7.toByteArray()     // Catch: java.security.InvalidKeyException -> L31
            r3.<init>(r4, r8)     // Catch: java.security.InvalidKeyException -> L31
            java.security.Key r3 = (java.security.Key) r3     // Catch: java.security.InvalidKeyException -> L31
            r1.init(r3)     // Catch: java.security.InvalidKeyException -> L31
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.security.InvalidKeyException -> L31
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r5.<init>(r6, r0)
            return
        L31:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha1(okio.Sink r1, okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r0 = r0.hmacSha1(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha256(okio.Sink r1, okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r0 = r0.hmacSha256(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha512(okio.Sink r1, okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r0 = r0.hmacSha512(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink md5(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r0 = r0.md5(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha1(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r0 = r0.sha1(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha256(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r0 = r0.sha256(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha512(okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r0 = r0.sha512(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hash", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m10386deprecated_hash() {
            r1 = this;
            okio.ByteString r0 = r1.hash()
            return r0
    }

    public final okio.ByteString hash() {
            r2 = this;
            java.security.MessageDigest r0 = r2.messageDigest
            if (r0 == 0) goto Lb
            java.security.MessageDigest r0 = r2.messageDigest
            byte[] r0 = r0.digest()
            goto L14
        Lb:
            javax.crypto.Mac r0 = r2.mac
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r0 = r0.doFinal()
        L14:
            okio.ByteString r1 = new okio.ByteString
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.<init>(r0)
            return r1
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(okio.Buffer r10, long r11) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            long r1 = r10.size()
            r3 = 0
            r5 = r11
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r0 = 0
            okio.Segment r2 = r10.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
        L16:
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 >= 0) goto L4b
            long r3 = r11 - r0
            int r5 = r2.limit
            int r6 = r2.pos
            int r5 = r5 - r6
            r6 = 0
            long r7 = (long) r5
            long r7 = java.lang.Math.min(r3, r7)
            int r3 = (int) r7
            java.security.MessageDigest r4 = r9.messageDigest
            if (r4 == 0) goto L36
            java.security.MessageDigest r4 = r9.messageDigest
            byte[] r5 = r2.data
            int r6 = r2.pos
            r4.update(r5, r6, r3)
            goto L42
        L36:
            javax.crypto.Mac r4 = r9.mac
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            byte[] r5 = r2.data
            int r6 = r2.pos
            r4.update(r5, r6, r3)
        L42:
            long r4 = (long) r3
            long r0 = r0 + r4
            okio.Segment r4 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r2 = r4
            goto L16
        L4b:
            super.write(r10, r11)
            return
    }
}
