package okio;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 ]2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001]B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J,\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0010H\u0010¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0000J\u0013\u0010'\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b,J\u0015\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0007¢\u0006\u0002\b-J\r\u0010.\u001a\u00020\tH\u0010¢\u0006\u0002\b/J\b\u0010\b\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\u001d\u00101\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0000H\u0010¢\u0006\u0002\b3J\u0010\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\r\u00109\u001a\u00020\u0004H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\tH\u0010¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\u0006\u0010?\u001a\u00020\u0000J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bHJ\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0000J\u0010\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020MH\u0016J\u001c\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\tH\u0017J\b\u0010Q\u001a\u00020\u0000H\u0016J\b\u0010R\u001a\u00020\u0000H\u0016J\b\u0010S\u001a\u00020\u0004H\u0016J\b\u0010T\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020WH\u0016J%\u0010U\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020Y2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0010¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\\H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006^"}, m115d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$okio", "()[B", "hashCode", "", "getHashCode$okio", "()I", "setHashCode$okio", "(I)V", "size", "utf8", "", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "copyInto", "", "offset", "target", "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "endsWith", "", "suffix", "equals", "", "get", "", "index", "getByte", "-deprecated_getByte", "getSize", "getSize$okio", "hex", "hmac", "key", "hmac$okio", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "pos", "internalGet$okio", "lastIndexOf", "md5", "rangeEquals", "otherOffset", "readObject", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {
    public static final okio.ByteString.Companion Companion = null;
    public static final okio.ByteString EMPTY = null;
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient java.lang.String utf8;

    /* JADX INFO: compiled from: ByteString.kt */
    @kotlin.Metadata(m114d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, m115d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", "offset", "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
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

        public static /* synthetic */ okio.ByteString encodeString$default(okio.ByteString.Companion r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L6
                java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
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
                okio.ByteString r0 = r0.m148of(r1, r2, r3)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final okio.ByteString m10372deprecated_decodeBase64(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r0 = r1.decodeBase64(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final okio.ByteString m10373deprecated_decodeHex(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r0 = r1.decodeHex(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final okio.ByteString m10374deprecated_encodeString(java.lang.String r2, java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.ByteString r0 = r1.encodeString(r2, r3)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final okio.ByteString m10375deprecated_encodeUtf8(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r0 = r1.encodeUtf8(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m10376deprecated_of(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "buffer"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r0 = r1.m146of(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m10377deprecated_of(byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r0 = r1.m148of(r2, r3, r4)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final okio.ByteString m10378deprecated_read(java.io.InputStream r2, int r3) {
                r1 = this;
                java.lang.String r0 = "inputstream"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r0 = r1.read(r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString decodeBase64(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r5
                r1 = 0
                byte[] r2 = okio.Base64.decodeBase64ToArray(r0)
                if (r2 == 0) goto L13
                okio.ByteString r3 = new okio.ByteString
                r3.<init>(r2)
                goto L14
            L13:
                r3 = 0
            L14:
                return r3
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString decodeHex(java.lang.String r10) {
                r9 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r0 = r10
                r1 = 0
                int r2 = r0.length()
                int r2 = r2 % 2
                r3 = 1
                if (r2 != 0) goto L12
                r2 = r3
                goto L13
            L12:
                r2 = 0
            L13:
                if (r2 == 0) goto L46
                int r2 = r0.length()
                int r2 = r2 / 2
                byte[] r2 = new byte[r2]
                r4 = 0
                int r5 = r2.length
            L1f:
                if (r4 >= r5) goto L40
                int r6 = r4 * 2
                char r6 = r0.charAt(r6)
                int r6 = okio.internal.ByteString.access$decodeHexDigit(r6)
                int r6 = r6 << 4
                int r7 = r4 * 2
                int r7 = r7 + r3
                char r7 = r0.charAt(r7)
                int r7 = okio.internal.ByteString.access$decodeHexDigit(r7)
                int r8 = r6 + r7
                byte r8 = (byte) r8
                r2[r4] = r8
                int r4 = r4 + 1
                goto L1f
            L40:
                okio.ByteString r3 = new okio.ByteString
                r3.<init>(r2)
                return r3
            L46:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unexpected hex string: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString encodeString(java.lang.String r4, java.nio.charset.Charset r5) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                okio.ByteString r0 = new okio.ByteString
                byte[] r1 = r4.getBytes(r5)
                java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r0.<init>(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString encodeUtf8(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r5
                r1 = 0
                okio.ByteString r2 = new okio.ByteString
                byte[] r3 = okio._JvmPlatformKt.asUtf8ToByteArray(r0)
                r2.<init>(r3)
                r2.setUtf8$okio(r0)
                return r2
        }

        @kotlin.jvm.JvmStatic
        /* JADX INFO: renamed from: of */
        public final okio.ByteString m146of(java.nio.ByteBuffer r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                int r0 = r3.remaining()
                byte[] r0 = new byte[r0]
                r3.get(r0)
                okio.ByteString r1 = new okio.ByteString
                r1.<init>(r0)
                return r1
        }

        @kotlin.jvm.JvmStatic
        /* JADX INFO: renamed from: of */
        public final okio.ByteString m147of(byte... r5) {
                r4 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                okio.ByteString r1 = new okio.ByteString
                int r2 = r5.length
                byte[] r2 = java.util.Arrays.copyOf(r5, r2)
                java.lang.String r3 = "copyOf(this, size)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.<init>(r2)
                return r1
        }

        @kotlin.jvm.JvmStatic
        /* JADX INFO: renamed from: of */
        public final okio.ByteString m148of(byte[] r11, int r12, int r13) {
                r10 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                r0 = r11
                r1 = 0
                int r2 = okio.SegmentedByteString.resolveDefaultParameter(r0, r13)
                int r3 = r0.length
                long r4 = (long) r3
                long r6 = (long) r12
                long r8 = (long) r2
                okio.SegmentedByteString.checkOffsetAndCount(r4, r6, r8)
                okio.ByteString r3 = new okio.ByteString
                int r4 = r12 + r2
                byte[] r4 = kotlin.collections.ArraysKt.copyOfRange(r0, r12, r4)
                r3.<init>(r4)
                return r3
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString read(java.io.InputStream r5, int r6) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                if (r6 < 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                if (r0 == 0) goto L29
                byte[] r0 = new byte[r6]
                r1 = 0
                r2 = 0
            L10:
                if (r1 >= r6) goto L23
                int r3 = r6 - r1
                int r2 = r5.read(r0, r1, r3)
                r3 = -1
                if (r2 == r3) goto L1d
                int r1 = r1 + r2
                goto L10
            L1d:
                java.io.EOFException r3 = new java.io.EOFException
                r3.<init>()
                throw r3
            L23:
                okio.ByteString r3 = new okio.ByteString
                r3.<init>(r0)
                return r3
            L29:
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "byteCount < 0: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r6)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
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

    public ByteString(byte[] r2) {
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.data = r2
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
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: copyInto"
            r1.<init>(r2)
            throw r1
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString decodeBase64(java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.decodeBase64(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString decodeHex(java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.decodeHex(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString encodeString(java.lang.String r1, java.nio.charset.Charset r2) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.encodeString(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString encodeUtf8(java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.encodeUtf8(r1)
            return r0
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
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: indexOf"
            r0.<init>(r1)
            throw r0
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
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: indexOf"
            r0.<init>(r1)
            throw r0
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
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            r0.<init>(r1)
            throw r0
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
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    /* JADX INFO: renamed from: of */
    public static final okio.ByteString m143of(java.nio.ByteBuffer r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.m146of(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    /* JADX INFO: renamed from: of */
    public static final okio.ByteString m144of(byte... r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.m147of(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    /* JADX INFO: renamed from: of */
    public static final okio.ByteString m145of(byte[] r1, int r2, int r3) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.m148of(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString read(java.io.InputStream r1, int r2) throws java.io.IOException {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.read(r1, r2)
            return r0
    }

    private final void readObject(java.io.ObjectInputStream r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.readInt()
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            r2 = r5
            java.io.InputStream r2 = (java.io.InputStream) r2
            okio.ByteString r1 = r1.read(r2, r0)
            java.lang.String r2 = "data"
            java.lang.Class<okio.ByteString> r3 = okio.ByteString.class
            java.lang.reflect.Field r2 = r3.getDeclaredField(r2)
            r3 = 1
            r2.setAccessible(r3)
            byte[] r3 = r1.data
            r2.set(r4, r3)
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
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: substring"
            r0.<init>(r1)
            throw r0
    }

    private final void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            r2.writeInt(r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m10370deprecated_getByte(int r2) {
            r1 = this;
            byte r0 = r1.getByte(r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m10371deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    public java.nio.ByteBuffer asByteBuffer() {
            r2 = this;
            byte[] r0 = r2.data
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            java.lang.String r1 = "asReadOnlyBuffer(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public java.lang.String base64() {
            r5 = this;
            r0 = r5
            r1 = 0
            byte[] r2 = r0.getData$okio()
            r3 = 0
            r4 = 1
            java.lang.String r0 = okio.Base64.encodeBase64$default(r2, r3, r4, r3)
            return r0
    }

    public java.lang.String base64Url() {
            r4 = this;
            r0 = r4
            r1 = 0
            byte[] r2 = r0.getData$okio()
            byte[] r3 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r0 = okio.Base64.encodeBase64(r2, r3)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.ByteString r2) {
            r1 = this;
            r0 = r2
            okio.ByteString r0 = (okio.ByteString) r0
            int r0 = r1.compareTo2(r0)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(okio.ByteString r13) {
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r12
            r1 = 0
            int r2 = r0.size()
            int r3 = r13.size()
            r4 = 0
            int r5 = java.lang.Math.min(r2, r3)
        L14:
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L34
            byte r8 = r0.getByte(r4)
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r8 = r8 & r9
            byte r9 = r13.getByte(r4)
            r10 = 255(0xff, float:3.57E-43)
            r11 = 0
            r9 = r9 & r10
            if (r8 != r9) goto L2f
            int r4 = r4 + 1
            goto L14
        L2f:
            if (r8 >= r9) goto L32
            goto L3c
        L32:
            r6 = r7
            goto L3c
        L34:
            if (r2 != r3) goto L38
            r6 = 0
            goto L3c
        L38:
            if (r2 >= r3) goto L3b
            goto L3c
        L3b:
            r6 = r7
        L3c:
            return r6
    }

    public void copyInto(int r5, byte[] r6, int r7, int r8) {
            r4 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            r1 = 0
            byte[] r2 = r0.getData$okio()
            int r3 = r5 + r8
            kotlin.collections.ArraysKt.copyInto(r2, r6, r7, r5, r3)
            return
    }

    public okio.ByteString digest$okio(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r6)
            r1 = 0
            byte[] r2 = r5.data
            r3 = 0
            int r4 = r5.size()
            r0.update(r2, r3, r4)
            byte[] r0 = r0.digest()
            okio.ByteString r1 = new okio.ByteString
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.<init>(r0)
            return r1
    }

    public final boolean endsWith(okio.ByteString r6) {
            r5 = this;
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            int r2 = r0.size()
            int r3 = r6.size()
            int r2 = r2 - r3
            r3 = 0
            int r4 = r6.size()
            boolean r0 = r0.rangeEquals(r2, r6, r3, r4)
            return r0
    }

    public final boolean endsWith(byte[] r6) {
            r5 = this;
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            int r2 = r0.size()
            int r3 = r6.length
            int r2 = r2 - r3
            r3 = 0
            int r4 = r6.length
            boolean r0 = r0.rangeEquals(r2, r6, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = 1
            if (r8 != r0) goto L7
            goto L30
        L7:
            boolean r3 = r8 instanceof okio.ByteString
            r4 = 0
            if (r3 == 0) goto L2f
            r3 = r8
            okio.ByteString r3 = (okio.ByteString) r3
            int r3 = r3.size()
            byte[] r5 = r0.getData$okio()
            int r5 = r5.length
            if (r3 != r5) goto L2d
            r3 = r8
            okio.ByteString r3 = (okio.ByteString) r3
            byte[] r5 = r0.getData$okio()
            byte[] r6 = r0.getData$okio()
            int r6 = r6.length
            boolean r3 = r3.rangeEquals(r4, r5, r4, r6)
            if (r3 == 0) goto L2d
            goto L30
        L2d:
            r2 = r4
            goto L30
        L2f:
            r2 = r4
        L30:
            return r2
    }

    public final byte getByte(int r2) {
            r1 = this;
            byte r0 = r1.internalGet$okio(r2)
            return r0
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
            r3 = this;
            r0 = r3
            r1 = 0
            byte[] r2 = r0.getData$okio()
            int r0 = r2.length
            return r0
    }

    public final java.lang.String getUtf8$okio() {
            r1 = this;
            java.lang.String r0 = r1.utf8
            return r0
    }

    public int hashCode() {
            r6 = this;
            r0 = r6
            r1 = 0
            int r2 = r0.getHashCode$okio()
            if (r2 == 0) goto L9
            goto L18
        L9:
            byte[] r3 = r0.getData$okio()
            int r3 = java.util.Arrays.hashCode(r3)
            r4 = r3
            r5 = 0
            r0.setHashCode$okio(r4)
            r2 = r3
        L18:
            return r2
    }

    public java.lang.String hex() {
            r13 = this;
            r0 = r13
            r1 = 0
            byte[] r2 = r0.getData$okio()
            int r2 = r2.length
            int r2 = r2 * 2
            char[] r2 = new char[r2]
            r3 = 0
            byte[] r4 = r0.getData$okio()
            int r5 = r4.length
            r6 = 0
        L12:
            if (r6 >= r5) goto L38
            r7 = r4[r6]
            int r8 = r3 + 1
            char[] r9 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r10 = 4
            r11 = r7
            r12 = 0
            int r10 = r11 >> r10
            r10 = r10 & 15
            char r9 = r9[r10]
            r2[r3] = r9
            int r3 = r8 + 1
            char[] r9 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r10 = 15
            r12 = 0
            r10 = r10 & r11
            char r9 = r9[r10]
            r2[r8] = r9
            int r6 = r6 + 1
            goto L12
        L38:
            java.lang.String r0 = kotlin.text.StringsKt.concatToString(r2)
            return r0
    }

    public okio.ByteString hmac$okio(java.lang.String r5, okio.ByteString r6) {
            r4 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L2e
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L2e
            byte[] r2 = r6.toByteArray()     // Catch: java.security.InvalidKeyException -> L2e
            r1.<init>(r2, r5)     // Catch: java.security.InvalidKeyException -> L2e
            java.security.Key r1 = (java.security.Key) r1     // Catch: java.security.InvalidKeyException -> L2e
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L2e
            okio.ByteString r1 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L2e
            byte[] r2 = r4.data     // Catch: java.security.InvalidKeyException -> L2e
            byte[] r2 = r0.doFinal(r2)     // Catch: java.security.InvalidKeyException -> L2e
            java.lang.String r3 = "doFinal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.security.InvalidKeyException -> L2e
            r1.<init>(r2)     // Catch: java.security.InvalidKeyException -> L2e
            return r1
        L2e:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
    }

    public okio.ByteString hmacSha1(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r0 = r1.hmac$okio(r0, r2)
            return r0
    }

    public okio.ByteString hmacSha256(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r0 = r1.hmac$okio(r0, r2)
            return r0
    }

    public okio.ByteString hmacSha512(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r0 = r1.hmac$okio(r0, r2)
            return r0
    }

    public final int indexOf(okio.ByteString r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = indexOf$default(r3, r4, r2, r0, r1)
            return r0
    }

    public final int indexOf(okio.ByteString r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = r2.internalArray$okio()
            int r0 = r1.indexOf(r0, r3)
            return r0
    }

    public final int indexOf(byte[] r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = indexOf$default(r3, r4, r2, r0, r1)
            return r0
    }

    public int indexOf(byte[] r8, int r9) {
            r7 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r7
            r1 = 0
            byte[] r2 = r0.getData$okio()
            int r2 = r2.length
            int r3 = r8.length
            int r2 = r2 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r9, r3)
            if (r4 > r2) goto L26
        L15:
            byte[] r5 = r0.getData$okio()
            int r6 = r8.length
            boolean r5 = okio.SegmentedByteString.arrayRangeEquals(r5, r4, r8, r3, r6)
            if (r5 == 0) goto L21
            goto L27
        L21:
            if (r4 == r2) goto L26
            int r4 = r4 + 1
            goto L15
        L26:
            r4 = -1
        L27:
            return r4
    }

    public byte[] internalArray$okio() {
            r2 = this;
            r0 = r2
            r1 = 0
            byte[] r0 = r0.getData$okio()
            return r0
    }

    public byte internalGet$okio(int r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            byte[] r2 = r0.getData$okio()
            r0 = r2[r4]
            return r0
    }

    public final int lastIndexOf(okio.ByteString r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = lastIndexOf$default(r3, r4, r2, r0, r1)
            return r0
    }

    public final int lastIndexOf(okio.ByteString r4, int r5) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            r1 = 0
            byte[] r2 = r4.internalArray$okio()
            int r0 = r0.lastIndexOf(r2, r5)
            return r0
    }

    public final int lastIndexOf(byte[] r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = lastIndexOf$default(r3, r4, r2, r0, r1)
            return r0
    }

    public int lastIndexOf(byte[] r9, int r10) {
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            int r2 = okio.SegmentedByteString.resolveDefaultParameter(r0, r10)
            byte[] r3 = r0.getData$okio()
            int r3 = r3.length
            int r4 = r9.length
            int r3 = r3 - r4
            int r4 = java.lang.Math.min(r2, r3)
        L16:
            r5 = -1
            if (r5 >= r4) goto L29
            byte[] r5 = r0.getData$okio()
            r6 = 0
            int r7 = r9.length
            boolean r5 = okio.SegmentedByteString.arrayRangeEquals(r5, r4, r9, r6, r7)
            if (r5 == 0) goto L26
            goto L2a
        L26:
            int r4 = r4 + (-1)
            goto L16
        L29:
            r4 = r5
        L2a:
            return r4
    }

    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    public boolean rangeEquals(int r4, okio.ByteString r5, int r6, int r7) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            r1 = 0
            byte[] r2 = r0.getData$okio()
            boolean r0 = r5.rangeEquals(r6, r2, r4, r7)
            return r0
    }

    public boolean rangeEquals(int r4, byte[] r5, int r6, int r7) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            r1 = 0
            if (r4 < 0) goto L23
            byte[] r2 = r0.getData$okio()
            int r2 = r2.length
            int r2 = r2 - r7
            if (r4 > r2) goto L23
            if (r6 < 0) goto L23
            int r2 = r5.length
            int r2 = r2 - r7
            if (r6 > r2) goto L23
            byte[] r2 = r0.getData$okio()
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r2, r4, r5, r6, r7)
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
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

    public final boolean startsWith(okio.ByteString r5) {
            r4 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            r2 = 0
            int r3 = r5.size()
            boolean r0 = r0.rangeEquals(r2, r5, r2, r3)
            return r0
    }

    public final boolean startsWith(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            r2 = 0
            int r3 = r5.length
            boolean r0 = r0.rangeEquals(r2, r5, r2, r3)
            return r0
    }

    public java.lang.String string(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
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
            okio.ByteString r0 = substring$default(r3, r4, r2, r0, r1)
            return r0
    }

    public okio.ByteString substring(int r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = 0
            int r2 = okio.SegmentedByteString.resolveDefaultParameter(r0, r8)
            r3 = 1
            r4 = 0
            if (r7 < 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r5 == 0) goto L73
            byte[] r5 = r0.getData$okio()
            int r5 = r5.length
            if (r2 > r5) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r4
        L19:
            if (r5 == 0) goto L4a
            int r5 = r2 - r7
            if (r5 < 0) goto L20
            goto L21
        L20:
            r3 = r4
        L21:
            if (r3 == 0) goto L3c
            if (r7 != 0) goto L2d
            byte[] r3 = r0.getData$okio()
            int r3 = r3.length
            if (r2 != r3) goto L2d
            goto L3b
        L2d:
            okio.ByteString r3 = new okio.ByteString
            byte[] r4 = r0.getData$okio()
            byte[] r4 = kotlin.collections.ArraysKt.copyOfRange(r4, r7, r2)
            r3.<init>(r4)
            r0 = r3
        L3b:
            return r0
        L3c:
            r3 = 0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "endIndex < beginIndex"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4a:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "endIndex > length("
            java.lang.StringBuilder r4 = r4.append(r5)
            byte[] r5 = r0.getData$okio()
            int r5 = r5.length
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = 41
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L73:
            r3 = 0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "beginIndex < 0"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public okio.ByteString toAsciiLowercase() {
            r9 = this;
            r0 = r9
            r1 = 0
            r2 = 0
        L3:
            byte[] r3 = r0.getData$okio()
            int r3 = r3.length
            if (r2 >= r3) goto L4d
            byte[] r3 = r0.getData$okio()
            r3 = r3[r2]
            r4 = 65
            if (r3 < r4) goto L4a
            r5 = 90
            if (r3 <= r5) goto L19
            goto L4a
        L19:
            byte[] r6 = r0.getData$okio()
            int r7 = r6.length
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            int r7 = r2 + 1
            int r8 = r3 + 32
            byte r8 = (byte) r8
            r6[r2] = r8
        L2e:
            int r2 = r6.length
            if (r7 >= r2) goto L43
            r3 = r6[r7]
            if (r3 < r4) goto L40
            if (r3 <= r5) goto L38
            goto L40
        L38:
            int r2 = r3 + 32
            byte r2 = (byte) r2
            r6[r7] = r2
            int r7 = r7 + 1
            goto L2e
        L40:
            int r7 = r7 + 1
            goto L2e
        L43:
            okio.ByteString r2 = new okio.ByteString
            r2.<init>(r6)
            r0 = r2
            goto L4e
        L4a:
            int r2 = r2 + 1
            goto L3
        L4d:
        L4e:
            return r0
    }

    public okio.ByteString toAsciiUppercase() {
            r9 = this;
            r0 = r9
            r1 = 0
            r2 = 0
        L3:
            byte[] r3 = r0.getData$okio()
            int r3 = r3.length
            if (r2 >= r3) goto L4d
            byte[] r3 = r0.getData$okio()
            r3 = r3[r2]
            r4 = 97
            if (r3 < r4) goto L4a
            r5 = 122(0x7a, float:1.71E-43)
            if (r3 <= r5) goto L19
            goto L4a
        L19:
            byte[] r6 = r0.getData$okio()
            int r7 = r6.length
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            int r7 = r2 + 1
            int r8 = r3 + (-32)
            byte r8 = (byte) r8
            r6[r2] = r8
        L2e:
            int r2 = r6.length
            if (r7 >= r2) goto L43
            r3 = r6[r7]
            if (r3 < r4) goto L40
            if (r3 <= r5) goto L38
            goto L40
        L38:
            int r2 = r3 + (-32)
            byte r2 = (byte) r2
            r6[r7] = r2
            int r7 = r7 + 1
            goto L2e
        L40:
            int r7 = r7 + 1
            goto L2e
        L43:
            okio.ByteString r2 = new okio.ByteString
            r2.<init>(r6)
            r0 = r2
            goto L4e
        L4a:
            int r2 = r2 + 1
            goto L3
        L4d:
        L4e:
            return r0
    }

    public byte[] toByteArray() {
            r4 = this;
            r0 = r4
            r1 = 0
            byte[] r2 = r0.getData$okio()
            int r3 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r3 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public java.lang.String toString() {
            r22 = this;
            r0 = r22
            r1 = 0
            byte[] r2 = r0.getData$okio()
            int r2 = r2.length
            r3 = 1
            r4 = 0
            if (r2 != 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r4
        Lf:
            if (r2 == 0) goto L15
            java.lang.String r2 = "[size=0]"
            goto L153
        L15:
            byte[] r2 = r0.getData$okio()
            r5 = 64
            int r2 = okio.internal.ByteString.access$codePointIndexToCharIndex(r2, r5)
            r6 = -1
            java.lang.String r7 = "…]"
            java.lang.String r8 = "[size="
            r9 = 93
            if (r2 != r6) goto Le1
            byte[] r6 = r0.getData$okio()
            int r6 = r6.length
            if (r6 > r5) goto L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[hex="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r0.hex()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            goto La7
        L4b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r8)
            byte[] r6 = r0.getData$okio()
            int r6 = r6.length
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " hex="
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 0
            r8 = 64
            r9 = r0
            r10 = 0
            int r11 = okio.SegmentedByteString.resolveDefaultParameter(r9, r8)
            byte[] r12 = r9.getData$okio()
            int r12 = r12.length
            if (r11 > r12) goto L76
            r12 = r3
            goto L77
        L76:
            r12 = r4
        L77:
            if (r12 == 0) goto Lb8
            int r12 = r11 - r6
            if (r12 < 0) goto L7e
            goto L7f
        L7e:
            r3 = r4
        L7f:
            if (r3 == 0) goto Laa
            byte[] r3 = r9.getData$okio()
            int r3 = r3.length
            if (r11 != r3) goto L89
            goto L97
        L89:
            okio.ByteString r3 = new okio.ByteString
            byte[] r4 = r9.getData$okio()
            byte[] r4 = kotlin.collections.ArraysKt.copyOfRange(r4, r6, r11)
            r3.<init>(r4)
            r9 = r3
        L97:
            java.lang.String r3 = r9.hex()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
        La7:
            r2 = r3
            goto L153
        Laa:
            r3 = 0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "endIndex < beginIndex"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        Lb8:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "endIndex > length("
            java.lang.StringBuilder r4 = r4.append(r5)
            byte[] r5 = r9.getData$okio()
            int r5 = r5.length
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = 41
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        Le1:
            java.lang.String r3 = r0.utf8()
            java.lang.String r10 = r3.substring(r4, r2)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            r14 = 4
            r15 = 0
            java.lang.String r11 = "\\"
            java.lang.String r12 = "\\\\"
            r13 = 0
            java.lang.String r16 = kotlin.text.StringsKt.replace$default(r10, r11, r12, r13, r14, r15)
            r20 = 4
            r21 = 0
            java.lang.String r17 = "\n"
            java.lang.String r18 = "\\n"
            r19 = 0
            java.lang.String r10 = kotlin.text.StringsKt.replace$default(r16, r17, r18, r19, r20, r21)
            java.lang.String r11 = "\r"
            java.lang.String r12 = "\\r"
            java.lang.String r4 = kotlin.text.StringsKt.replace$default(r10, r11, r12, r13, r14, r15)
            int r5 = r3.length()
            if (r2 >= r5) goto L13b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r8)
            byte[] r6 = r0.getData$okio()
            int r6 = r6.length
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " text="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            goto L152
        L13b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[text="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r5 = r5.toString()
        L152:
            r2 = r5
        L153:
            return r2
    }

    public java.lang.String utf8() {
            r4 = this;
            r0 = r4
            r1 = 0
            java.lang.String r2 = r0.getUtf8$okio()
            if (r2 != 0) goto L13
            byte[] r3 = r0.internalArray$okio()
            java.lang.String r2 = okio._JvmPlatformKt.toUtf8String(r3)
            r0.setUtf8$okio(r2)
        L13:
            return r2
    }

    public void write(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    public void write$okio(okio.Buffer r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.internal.ByteString.commonWrite(r1, r2, r3, r4)
            return
    }
}
