package okio;

import gg.AbstractC1411g;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HashingSource extends ForwardingSource implements Source {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, ByteString byteString, String str) throws NoSuchAlgorithmException {
        source.getClass();
        byteString.getClass();
        str.getClass();
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            this(source, mac);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m11082deprecated_hash() {
        return hash();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString hash() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            mac.getClass();
            bArrDoFinal = mac.doFinal();
        }
        bArrDoFinal.getClass();
        return new ByteString(bArrDoFinal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer buffer, long j3) {
        buffer.getClass();
        long j4 = super.read(buffer, j3);
        if (j4 != -1) {
            long size = buffer.size() - j4;
            long size2 = buffer.size();
            Segment segment = buffer.head;
            segment.getClass();
            while (size2 > size) {
                segment = segment.prev;
                segment.getClass();
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < buffer.size()) {
                int i9 = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i9, segment.limit - i9);
                } else {
                    Mac mac = this.mac;
                    mac.getClass();
                    mac.update(segment.data, i9, segment.limit - i9);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                segment.getClass();
                size = size2;
            }
        }
        return j4;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.HashingSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HashingSource hmacSha1(Source source, ByteString byteString) {
            source.getClass();
            byteString.getClass();
            return new HashingSource(source, byteString, "HmacSHA1");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HashingSource hmacSha256(Source source, ByteString byteString) {
            source.getClass();
            byteString.getClass();
            return new HashingSource(source, byteString, "HmacSHA256");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HashingSource hmacSha512(Source source, ByteString byteString) {
            source.getClass();
            byteString.getClass();
            return new HashingSource(source, byteString, "HmacSHA512");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HashingSource md5(Source source) {
            source.getClass();
            return new HashingSource(source, "MD5");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HashingSource sha1(Source source) {
            source.getClass();
            return new HashingSource(source, "SHA-1");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HashingSource sha256(Source source) {
            source.getClass();
            return new HashingSource(source, "SHA-256");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HashingSource sha512(Source source) {
            source.getClass();
            return new HashingSource(source, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, String str) throws NoSuchAlgorithmException {
        source.getClass();
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.getClass();
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, Mac mac) {
        super(source);
        source.getClass();
        mac.getClass();
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, MessageDigest messageDigest) {
        super(source);
        source.getClass();
        messageDigest.getClass();
        this.messageDigest = messageDigest;
        this.mac = null;
    }
}
