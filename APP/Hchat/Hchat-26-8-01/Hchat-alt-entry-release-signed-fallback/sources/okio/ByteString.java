package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {
    public static final okio.ByteString.Companion Companion = null;
    public static final okio.ByteString EMPTY = null;
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient java.lang.String utf8;

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

        public static /* synthetic */ okio.ByteString encodeString$default(okio.ByteString.Companion r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L6
                java.nio.charset.Charset r2 = og.a.f9804a
            L6:
                okio.ByteString r0 = r0.encodeString(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.ByteString of$default(okio.ByteString.Companion r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L5
                r2 = 0
            L5:
                r4 = r4 & 2
                if (r4 == 0) goto Ld
                int r3 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
            Ld:
                okio.ByteString r0 = r0.of(r1, r2, r3)
                return r0
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final okio.ByteString m157deprecated_decodeBase64(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okio.ByteString r1 = r0.decodeBase64(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final okio.ByteString m158deprecated_decodeHex(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okio.ByteString r1 = r0.decodeHex(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final okio.ByteString m159deprecated_encodeString(java.lang.String r1, java.nio.charset.Charset r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                okio.ByteString r1 = r0.encodeString(r1, r2)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final okio.ByteString m160deprecated_encodeUtf8(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okio.ByteString r1 = r0.encodeUtf8(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m161deprecated_of(java.nio.ByteBuffer r1) {
                r0 = this;
                r1.getClass()
                okio.ByteString r1 = r0.of(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m162deprecated_of(byte[] r1, int r2, int r3) {
                r0 = this;
                r1.getClass()
                okio.ByteString r1 = r0.of(r1, r2, r3)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final okio.ByteString m163deprecated_read(java.io.InputStream r1, int r2) {
                r0 = this;
                r1.getClass()
                okio.ByteString r1 = r0.read(r1, r2)
                return r1
        }

        public final okio.ByteString decodeBase64(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                byte[] r2 = okio.Base64.decodeBase64ToArray(r2)
                if (r2 == 0) goto Lf
                okio.ByteString r0 = new okio.ByteString
                r0.<init>(r2)
                return r0
            Lf:
                r2 = 0
                return r2
        }

        public final okio.ByteString decodeHex(java.lang.String r6) {
                r5 = this;
                r6.getClass()
                int r0 = r6.length()
                int r0 = r0 % 2
                if (r0 != 0) goto L39
                int r0 = r6.length()
                int r0 = r0 / 2
                byte[] r1 = new byte[r0]
                r2 = 0
            L14:
                if (r2 >= r0) goto L33
                int r3 = r2 * 2
                char r4 = r6.charAt(r3)
                int r4 = okio.internal.ByteString.access$decodeHexDigit(r4)
                int r4 = r4 << 4
                int r3 = r3 + 1
                char r3 = r6.charAt(r3)
                int r3 = okio.internal.ByteString.access$decodeHexDigit(r3)
                int r3 = r3 + r4
                byte r3 = (byte) r3
                r1[r2] = r3
                int r2 = r2 + 1
                goto L14
            L33:
                okio.ByteString r6 = new okio.ByteString
                r6.<init>(r1)
                return r6
            L39:
                java.lang.String r0 = "Unexpected hex string: "
                java.lang.String r6 = r0.concat(r6)
                j8.o.q(r6)
                r6 = 0
                return r6
        }

        public final okio.ByteString encodeString(java.lang.String r2, java.nio.charset.Charset r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okio.ByteString r0 = new okio.ByteString
                byte[] r2 = r2.getBytes(r3)
                r2.getClass()
                r0.<init>(r2)
                return r0
        }

        public final okio.ByteString encodeUtf8(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                okio.ByteString r0 = new okio.ByteString
                byte[] r1 = okio._JvmPlatformKt.asUtf8ToByteArray(r3)
                r0.<init>(r1)
                r0.setUtf8$okio(r3)
                return r0
        }

        public final okio.ByteString of(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                int r0 = r2.remaining()
                byte[] r0 = new byte[r0]
                r2.get(r0)
                okio.ByteString r2 = new okio.ByteString
                r2.<init>(r0)
                return r2
        }

        public final okio.ByteString of(byte... r3) {
                r2 = this;
                r3.getClass()
                okio.ByteString r0 = new okio.ByteString
                int r1 = r3.length
                byte[] r3 = java.util.Arrays.copyOf(r3, r1)
                r0.<init>(r3)
                return r0
        }

        public final okio.ByteString of(byte[] r8, int r9, int r10) {
                r7 = this;
                r8.getClass()
                int r10 = okio.SegmentedByteString.resolveDefaultParameter(r8, r10)
                int r0 = r8.length
                long r1 = (long) r0
                long r3 = (long) r9
                long r5 = (long) r10
                okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
                okio.ByteString r0 = new okio.ByteString
                int r10 = r10 + r9
                byte[] r8 = tf.l.t0(r8, r9, r10)
                r0.<init>(r8)
                return r0
        }

        public final okio.ByteString read(java.io.InputStream r5, int r6) {
                r4 = this;
                r5.getClass()
                if (r6 < 0) goto L20
                byte[] r0 = new byte[r6]
                r1 = 0
            L8:
                if (r1 >= r6) goto L1a
                int r2 = r6 - r1
                int r2 = r5.read(r0, r1, r2)
                r3 = -1
                if (r2 == r3) goto L15
                int r1 = r1 + r2
                goto L8
            L15:
                j8.o.a()
                r5 = 0
                return r5
            L1a:
                okio.ByteString r5 = new okio.ByteString
                r5.<init>(r0)
                return r5
            L20:
                java.lang.String r5 = "byteCount < 0: "
                java.lang.String r5 = eh.a.l(r6, r5)
                j8.o.q(r5)
                r5 = 0
                return r5
        }
    }

    static {
            okio.ByteString$Companion r0 = new okio.ByteString$Companion
            r1 = 0
            r0.<init>(r1)
            okio.ByteString.Companion = r0
            okio.ByteString r0 = new okio.ByteString
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            okio.ByteString.EMPTY = r0
            return
    }

    public ByteString(byte[] r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.data = r1
            return
    }

    public static /* synthetic */ void copyInto$default(okio.ByteString r1, int r2, byte[] r3, int r4, int r5, int r6, java.lang.Object r7) {
            if (r7 != 0) goto L11
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L8
            r2 = r0
        L8:
            r6 = r6 & 4
            if (r6 == 0) goto Ld
            r4 = r0
        Ld:
            r1.copyInto(r2, r3, r4, r5)
            return
        L11:
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: copyInto"
            j8.o.w(r1)
            return
    }

    public static final okio.ByteString decodeBase64(java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.decodeBase64(r1)
            return r1
    }

    public static final okio.ByteString decodeHex(java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.decodeHex(r1)
            return r1
    }

    public static final okio.ByteString encodeString(java.lang.String r1, java.nio.charset.Charset r2) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.encodeString(r1, r2)
            return r1
    }

    public static final okio.ByteString encodeUtf8(java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.encodeUtf8(r1)
            return r1
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString r0, okio.ByteString r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            int r0 = r0.indexOf(r1, r2)
            return r0
        Lc:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: indexOf"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString r0, byte[] r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            int r0 = r0.indexOf(r1, r2)
            return r0
        Lc:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: indexOf"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString r0, okio.ByteString r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lf
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
        La:
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
        Lf:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString r0, byte[] r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lf
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
        La:
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
        Lf:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    public static final okio.ByteString of(java.nio.ByteBuffer r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1)
            return r1
    }

    public static final okio.ByteString of(byte... r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1)
            return r1
    }

    public static final okio.ByteString of(byte[] r1, int r2, int r3) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1, r2, r3)
            return r1
    }

    public static final okio.ByteString read(java.io.InputStream r1, int r2) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.read(r1, r2)
            return r1
    }

    private final void readObject(java.io.ObjectInputStream r3) {
            r2 = this;
            int r0 = r3.readInt()
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            okio.ByteString r3 = r1.read(r3, r0)
            java.lang.Class<okio.ByteString> r0 = okio.ByteString.class
            java.lang.String r1 = "data"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            byte[] r3 = r3.data
            r0.set(r2, r3)
            return
    }

    public static /* synthetic */ okio.ByteString substring$default(okio.ByteString r0, int r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L14
            r4 = r3 & 1
            if (r4 == 0) goto L7
            r1 = 0
        L7:
            r3 = r3 & 2
            if (r3 == 0) goto Lf
            int r2 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
        Lf:
            okio.ByteString r0 = r0.substring(r1, r2)
            return r0
        L14:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: substring"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    private final void writeObject(java.io.ObjectOutputStream r2) {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            r2.writeInt(r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m155deprecated_getByte(int r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m156deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    public java.nio.ByteBuffer asByteBuffer() {
            r1 = this;
            byte[] r0 = r1.data
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            r0.getClass()
            return r0
    }

    public java.lang.String base64() {
            r3 = this;
            byte[] r0 = r3.getData$okio()
            r1 = 0
            r2 = 1
            java.lang.String r0 = okio.Base64.encodeBase64$default(r0, r1, r2, r1)
            return r0
    }

    public java.lang.String base64Url() {
            r2 = this;
            byte[] r0 = r2.getData$okio()
            byte[] r1 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r0 = okio.Base64.encodeBase64(r0, r1)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.ByteString r1) {
            r0 = this;
            okio.ByteString r1 = (okio.ByteString) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(okio.ByteString r10) {
            r9 = this;
            r10.getClass()
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L11:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2a
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L26
            int r4 = r4 + 1
            goto L11
        L26:
            if (r7 >= r8) goto L29
            return r5
        L29:
            return r6
        L2a:
            if (r0 != r1) goto L2d
            return r3
        L2d:
            if (r0 >= r1) goto L30
            return r5
        L30:
            return r6
    }

    public void copyInto(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r3.getClass()
            byte[] r0 = r1.getData$okio()
            int r5 = r5 + r2
            tf.l.o0(r0, r4, r2, r3, r5)
            return
    }

    public okio.ByteString digest$okio(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)
            byte[] r0 = r3.data
            r1 = 0
            int r2 = r3.size()
            r4.update(r0, r1, r2)
            byte[] r4 = r4.digest()
            okio.ByteString r0 = new okio.ByteString
            r4.getClass()
            r0.<init>(r4)
            return r0
    }

    public final boolean endsWith(okio.ByteString r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.size()
            boolean r4 = r3.rangeEquals(r0, r4, r1, r2)
            return r4
    }

    public final boolean endsWith(byte[] r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.length
            boolean r4 = r3.rangeEquals(r0, r4, r1, r2)
            return r4
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L26
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            if (r1 != r3) goto L26
            byte[] r1 = r4.getData$okio()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            boolean r5 = r5.rangeEquals(r2, r1, r2, r3)
            if (r5 == 0) goto L26
            return r0
        L26:
            return r2
    }

    public final byte getByte(int r1) {
            r0 = this;
            byte r1 = r0.internalGet$okio(r1)
            return r1
    }

    public final byte[] getData$okio() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    public final int getHashCode$okio() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    public int getSize$okio() {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            return r0
    }

    public final java.lang.String getUtf8$okio() {
            r1 = this;
            java.lang.String r0 = r1.utf8
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.getHashCode$okio()
            if (r0 == 0) goto L7
            return r0
        L7:
            byte[] r0 = r1.getData$okio()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.setHashCode$okio(r0)
            return r0
    }

    public java.lang.String hex() {
            r9 = this;
            byte[] r0 = r9.getData$okio()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r1 = r9.getData$okio()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L10:
            if (r3 >= r2) goto L31
            r5 = r1[r3]
            int r6 = r4 + 1
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r8 = r5 >> 4
            r8 = r8 & 15
            char r7 = r7[r8]
            r0[r4] = r7
            int r4 = r4 + 2
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r5 = r5 & 15
            char r5 = r7[r5]
            r0[r6] = r5
            int r3 = r3 + 1
            goto L10
        L31:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    public okio.ByteString hmac$okio(java.lang.String r3, okio.ByteString r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r3)     // Catch: java.security.InvalidKeyException -> L25
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L25
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L25
            r1.<init>(r4, r3)     // Catch: java.security.InvalidKeyException -> L25
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L25
            okio.ByteString r3 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L25
            byte[] r4 = r2.data     // Catch: java.security.InvalidKeyException -> L25
            byte[] r4 = r0.doFinal(r4)     // Catch: java.security.InvalidKeyException -> L25
            r4.getClass()     // Catch: java.security.InvalidKeyException -> L25
            r3.<init>(r4)     // Catch: java.security.InvalidKeyException -> L25
            return r3
        L25:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    public okio.ByteString hmacSha1(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    public okio.ByteString hmacSha256(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    public okio.ByteString hmacSha512(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    public final int indexOf(okio.ByteString r4) {
            r3 = this;
            r4.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = indexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    public final int indexOf(okio.ByteString r1, int r2) {
            r0 = this;
            r1.getClass()
            byte[] r1 = r1.internalArray$okio()
            int r1 = r0.indexOf(r1, r2)
            return r1
    }

    public final int indexOf(byte[] r4) {
            r3 = this;
            r4.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = indexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    public int indexOf(byte[] r5, int r6) {
            r4 = this;
            r5.getClass()
            byte[] r0 = r4.getData$okio()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L22
        L11:
            byte[] r2 = r4.getData$okio()
            int r3 = r5.length
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L1d
            return r6
        L1d:
            if (r6 == r0) goto L22
            int r6 = r6 + 1
            goto L11
        L22:
            r5 = -1
            return r5
    }

    public byte[] internalArray$okio() {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            return r0
    }

    public byte internalGet$okio(int r2) {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            r2 = r0[r2]
            return r2
    }

    public final int lastIndexOf(okio.ByteString r4) {
            r3 = this;
            r4.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = lastIndexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    public final int lastIndexOf(okio.ByteString r1, int r2) {
            r0 = this;
            r1.getClass()
            byte[] r1 = r1.internalArray$okio()
            int r1 = r0.lastIndexOf(r1, r2)
            return r1
    }

    public final int lastIndexOf(byte[] r4) {
            r3 = this;
            r4.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = lastIndexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    public int lastIndexOf(byte[] r4, int r5) {
            r3 = this;
            r4.getClass()
            int r5 = okio.SegmentedByteString.resolveDefaultParameter(r3, r5)
            byte[] r0 = r3.getData$okio()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L12:
            r0 = -1
            if (r0 >= r5) goto L25
            byte[] r0 = r3.getData$okio()
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.SegmentedByteString.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L22
            return r5
        L22:
            int r5 = r5 + (-1)
            goto L12
        L25:
            return r0
    }

    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    public boolean rangeEquals(int r2, okio.ByteString r3, int r4, int r5) {
            r1 = this;
            r3.getClass()
            byte[] r0 = r1.getData$okio()
            boolean r2 = r3.rangeEquals(r4, r0, r2, r5)
            return r2
    }

    public boolean rangeEquals(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r3.getClass()
            if (r2 < 0) goto L1f
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L1f
            if (r4 < 0) goto L1f
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L1f
            byte[] r0 = r1.getData$okio()
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r0, r2, r3, r4, r5)
            if (r2 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public final void setHashCode$okio(int r1) {
            r0 = this;
            r0.hashCode = r1
            return
    }

    public final void setUtf8$okio(java.lang.String r1) {
            r0 = this;
            r0.utf8 = r1
            return
    }

    public final okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    public final okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    public final okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    public final int size() {
            r1 = this;
            int r0 = r1.getSize$okio()
            return r0
    }

    public final boolean startsWith(okio.ByteString r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.size()
            boolean r3 = r2.rangeEquals(r0, r3, r0, r1)
            return r3
    }

    public final boolean startsWith(byte[] r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.length
            boolean r3 = r2.rangeEquals(r0, r3, r0, r1)
            return r3
    }

    public java.lang.String string(java.nio.charset.Charset r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.data
            r0.<init>(r1, r3)
            return r0
    }

    public final okio.ByteString substring() {
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            okio.ByteString r0 = substring$default(r3, r2, r2, r0, r1)
            return r0
    }

    public final okio.ByteString substring(int r4) {
            r3 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            okio.ByteString r4 = substring$default(r3, r4, r2, r0, r1)
            return r4
    }

    public okio.ByteString substring(int r3, int r4) {
            r2 = this;
            int r4 = okio.SegmentedByteString.resolveDefaultParameter(r2, r4)
            if (r3 < 0) goto L46
            byte[] r0 = r2.getData$okio()
            int r0 = r0.length
            if (r4 > r0) goto L30
            int r0 = r4 - r3
            if (r0 < 0) goto L29
            if (r3 != 0) goto L1b
            byte[] r0 = r2.getData$okio()
            int r0 = r0.length
            if (r4 != r0) goto L1b
            return r2
        L1b:
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r2.getData$okio()
            byte[] r3 = tf.l.t0(r1, r3, r4)
            r0.<init>(r3)
            return r0
        L29:
            java.lang.String r3 = "endIndex < beginIndex"
            j8.o.t(r3)
        L2e:
            r3 = 0
            return r3
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "endIndex > length("
            r3.<init>(r4)
            byte[] r4 = r2.getData$okio()
            int r4 = r4.length
            r0 = 41
            java.lang.String r3 = p.a.n(r3, r4, r0)
            j8.o.q(r3)
            goto L2e
        L46:
            java.lang.String r3 = "beginIndex < 0"
            j8.o.t(r3)
            goto L2e
    }

    public okio.ByteString toAsciiLowercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L42
            byte[] r1 = r6.getData$okio()
            r1 = r1[r0]
            r2 = 65
            if (r1 < r2) goto L3f
            r3 = 90
            if (r1 <= r3) goto L17
            goto L3f
        L17:
            byte[] r4 = r6.getData$okio()
            int r5 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            int r5 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r4[r0] = r1
        L27:
            int r0 = r4.length
            if (r5 >= r0) goto L39
            r0 = r4[r5]
            if (r0 < r2) goto L36
            if (r0 <= r3) goto L31
            goto L36
        L31:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r4[r5] = r0
        L36:
            int r5 = r5 + 1
            goto L27
        L39:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r4)
            return r0
        L3f:
            int r0 = r0 + 1
            goto L1
        L42:
            return r6
    }

    public okio.ByteString toAsciiUppercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L42
            byte[] r1 = r6.getData$okio()
            r1 = r1[r0]
            r2 = 97
            if (r1 < r2) goto L3f
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 <= r3) goto L17
            goto L3f
        L17:
            byte[] r4 = r6.getData$okio()
            int r5 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            int r5 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r4[r0] = r1
        L27:
            int r0 = r4.length
            if (r5 >= r0) goto L39
            r0 = r4[r5]
            if (r0 < r2) goto L36
            if (r0 <= r3) goto L31
            goto L36
        L31:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r4[r5] = r0
        L36:
            int r5 = r5 + 1
            goto L27
        L39:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r4)
            return r0
        L3f:
            int r0 = r0 + 1
            goto L1
        L42:
            return r6
    }

    public byte[] toByteArray() {
            r2 = this;
            byte[] r0 = r2.getData$okio()
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            byte[] r0 = r9.getData$okio()
            int r0 = r0.length
            if (r0 != 0) goto La
            java.lang.String r0 = "[size=0]"
            return r0
        La:
            byte[] r0 = r9.getData$okio()
            r1 = 64
            int r0 = okio.internal.ByteString.access$codePointIndexToCharIndex(r0, r1)
            r2 = -1
            java.lang.String r3 = "…]"
            r4 = 0
            java.lang.String r5 = "[size="
            r6 = 93
            if (r0 != r2) goto L9d
            byte[] r0 = r9.getData$okio()
            int r0 = r0.length
            if (r0 > r1) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r9.hex()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            byte[] r2 = r9.getData$okio()
            int r2 = r2.length
            r0.append(r2)
            java.lang.String r2 = " hex="
            r0.append(r2)
            int r1 = okio.SegmentedByteString.resolveDefaultParameter(r9, r1)
            byte[] r2 = r9.getData$okio()
            int r2 = r2.length
            if (r1 > r2) goto L86
            if (r1 < 0) goto L7f
            byte[] r2 = r9.getData$okio()
            int r2 = r2.length
            if (r1 != r2) goto L63
            r2 = r9
            goto L70
        L63:
            okio.ByteString r2 = new okio.ByteString
            byte[] r5 = r9.getData$okio()
            byte[] r1 = tf.l.t0(r5, r4, r1)
            r2.<init>(r1)
        L70:
            java.lang.String r1 = r2.hex()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
        L7f:
            java.lang.String r0 = "endIndex < beginIndex"
            j8.o.t(r0)
            r0 = 0
            return r0
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "endIndex > length("
            r0.<init>(r1)
            byte[] r1 = r9.getData$okio()
            int r1 = r1.length
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            j8.o.q(r0)
            r0 = 0
            return r0
        L9d:
            java.lang.String r1 = r9.utf8()
            java.lang.String r2 = r1.substring(r4, r0)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r2 = og.t.a0(r2, r7, r8, r4)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r2 = og.t.a0(r2, r7, r8, r4)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r2 = og.t.a0(r2, r7, r8, r4)
            int r1 = r1.length()
            if (r0 >= r1) goto Le0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            byte[] r1 = r9.getData$okio()
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " text="
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
        Le0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String utf8() {
            r1 = this;
            java.lang.String r0 = r1.getUtf8$okio()
            if (r0 != 0) goto L11
            byte[] r0 = r1.internalArray$okio()
            java.lang.String r0 = okio._JvmPlatformKt.toUtf8String(r0)
            r1.setUtf8$okio(r0)
        L11:
            return r0
    }

    public void write(java.io.OutputStream r2) {
            r1 = this;
            r2.getClass()
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    public void write$okio(okio.Buffer r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            okio.internal.ByteString.commonWrite(r0, r1, r2, r3)
            return
    }
}
