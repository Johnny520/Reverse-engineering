package okio;

import gg.AbstractC1411g;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p276sf.InterfaceC3954a;
import tf.AbstractC4165l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString(byte[] bArr) {
        bArr.getClass();
        this.data = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void copyInto$default(ByteString byteString, int i9, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: copyInto");
            return;
        }
        if ((i12 & 1) != 0) {
            i9 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        byteString.copyInto(i9, bArr, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i9, int i10, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: indexOf");
            return 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return byteString.indexOf(byteString2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i9, int i10, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: lastIndexOf");
            return 0;
        }
        if ((i10 & 2) != 0) {
            i9 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static final ByteString m6806of(ByteBuffer byteBuffer) {
        return Companion.m6809of(byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString read(InputStream inputStream, int i9) {
        return Companion.read(inputStream, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i9, int i10, int i11, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: substring");
            return null;
        }
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m11065deprecated_getByte(int i9) {
        return getByte(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m11066deprecated_size() {
        return size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        byteBufferAsReadOnlyBuffer.getClass();
        return byteBufferAsReadOnlyBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(ByteString byteString) {
        byteString.getClass();
        int size = size();
        int size2 = byteString.size();
        int iMin = Math.min(size, size2);
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = getByte(i9) & 255;
            int i11 = byteString.getByte(i9) & 255;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void copyInto(int i9, byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC4165l.m8380o0(getData$okio(), i10, i9, bArr, i11 + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString digest$okio(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean endsWith(ByteString byteString) {
        byteString.getClass();
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte getByte(int i9) {
        return internalGet$okio(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] getData$okio() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getHashCode$okio() {
        return this.hashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSize$okio() {
        return getData$okio().length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getUtf8$okio() {
        return this.utf8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i9 = 0;
        for (byte b10 : getData$okio()) {
            int i10 = i9 + 1;
            cArr[i9] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i9 += 2;
            cArr[i10] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString hmac$okio(String str, ByteString byteString) throws NoSuchAlgorithmException {
        str.getClass();
        byteString.getClass();
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            bArrDoFinal.getClass();
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString hmacSha1(ByteString byteString) {
        byteString.getClass();
        return hmac$okio("HmacSHA1", byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString hmacSha256(ByteString byteString) {
        byteString.getClass();
        return hmac$okio("HmacSHA256", byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString hmacSha512(ByteString byteString) {
        byteString.getClass();
        return hmac$okio("HmacSHA512", byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int indexOf(byte[] bArr, int i9) {
        bArr.getClass();
        int length = getData$okio().length - bArr.length;
        int iMax = Math.max(i9, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(getData$okio(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte internalGet$okio(int i9) {
        return getData$okio()[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int lastIndexOf(byte[] bArr, int i9) {
        bArr.getClass();
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(this, i9), getData$okio().length - bArr.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(getData$okio(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString md5() {
        return digest$okio("MD5");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean rangeEquals(int i9, byte[] bArr, int i10, int i11) {
        bArr.getClass();
        return i9 >= 0 && i9 <= getData$okio().length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && SegmentedByteString.arrayRangeEquals(getData$okio(), i9, bArr, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHashCode$okio(int i9) {
        this.hashCode = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return getSize$okio();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean startsWith(ByteString byteString) {
        byteString.getClass();
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String string(Charset charset) {
        charset.getClass();
        return new String(this.data, charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString substring(int i9, int i10) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i10);
        if (i9 < 0) {
            C2104o.m5294t("beginIndex < 0");
            return null;
        }
        if (iResolveDefaultParameter > getData$okio().length) {
            C2104o.m5291q(AbstractC3199a.m6841n(new StringBuilder("endIndex > length("), getData$okio().length, ')'));
            return null;
        }
        if (iResolveDefaultParameter - i9 >= 0) {
            return (i9 == 0 && iResolveDefaultParameter == getData$okio().length) ? this : new ByteString(AbstractC4165l.m8385t0(getData$okio(), i9, iResolveDefaultParameter));
        }
        C2104o.m5294t("endIndex < beginIndex");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString toAsciiLowercase() {
        for (int i9 = 0; i9 < getData$okio().length; i9++) {
            byte b10 = getData$okio()[i9];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                bArrCopyOf[i9] = (byte) (b10 + 32);
                for (int i10 = i9 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i10] = (byte) (b11 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteString toAsciiUppercase() {
        for (int i9 = 0; i9 < getData$okio().length; i9++) {
            byte b10 = getData$okio()[i9];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                bArrCopyOf[i9] = (byte) (b10 - 32);
                for (int i10 = i9 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i10] = (byte) (b11 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        return Arrays.copyOf(data$okio, data$okio.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = okio.internal.ByteString.codePointIndexToCharIndex(getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = utf8();
            String strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(strUtf8.substring(0, iCodePointIndexToCharIndex), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strM6737a0 + ']';
            }
            return "[size=" + getData$okio().length + " text=" + strM6737a0 + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, 64);
        if (iResolveDefaultParameter > getData$okio().length) {
            C2104o.m5291q(AbstractC3199a.m6841n(new StringBuilder("endIndex > length("), getData$okio().length, ')'));
            return null;
        }
        if (iResolveDefaultParameter < 0) {
            C2104o.m5294t("endIndex < beginIndex");
            return null;
        }
        sb2.append((iResolveDefaultParameter == getData$okio().length ? this : new ByteString(AbstractC4165l.m8385t0(getData$okio(), 0, iResolveDefaultParameter))).hex());
        sb2.append("…]");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void write(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        outputStream.write(this.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void write$okio(Buffer buffer, int i9, int i10) {
        buffer.getClass();
        okio.internal.ByteString.commonWrite(this, buffer, i9, i10);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.ByteString.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                charset = AbstractC3137a.f10177a;
            }
            return companion.encodeString(str, charset);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i9, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i9 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.m6811of(bArr, i9, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m11067deprecated_decodeBase64(String str) {
            str.getClass();
            return decodeBase64(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m11068deprecated_decodeHex(String str) {
            str.getClass();
            return decodeHex(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m11069deprecated_encodeString(String str, Charset charset) {
            str.getClass();
            charset.getClass();
            return encodeString(str, charset);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m11070deprecated_encodeUtf8(String str) {
            str.getClass();
            return encodeUtf8(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m11071deprecated_of(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return m6809of(byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m11073deprecated_read(InputStream inputStream, int i9) {
            inputStream.getClass();
            return read(inputStream, i9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString decodeBase64(String str) {
            str.getClass();
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        /* JADX DEBUG: Class process forced to load method for inline: okio.internal.-ByteString.access$decodeHexDigit(char):int */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString decodeHex(String str) {
            str.getClass();
            if (str.length() % 2 != 0) {
                C2104o.m5291q("Unexpected hex string: ".concat(str));
                return null;
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = i9 * 2;
                bArr[i9] = (byte) (okio.internal.ByteString.decodeHexDigit(str.charAt(i10 + 1)) + (okio.internal.ByteString.decodeHexDigit(str.charAt(i10)) << 4));
            }
            return new ByteString(bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString encodeString(String str, Charset charset) {
            str.getClass();
            charset.getClass();
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return new ByteString(bytes);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString encodeUtf8(String str) {
            str.getClass();
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: of */
        public final ByteString m6811of(byte[] bArr, int i9, int i10) {
            bArr.getClass();
            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i10);
            SegmentedByteString.checkOffsetAndCount(bArr.length, i9, iResolveDefaultParameter);
            return new ByteString(AbstractC4165l.m8385t0(bArr, i9, iResolveDefaultParameter + i9));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString read(InputStream inputStream, int i9) throws IOException {
            inputStream.getClass();
            if (i9 < 0) {
                C2104o.m5291q(AbstractC0921a.m2249l(i9, "byteCount < 0: "));
                return null;
            }
            byte[] bArr = new byte[i9];
            int i10 = 0;
            while (i10 < i9) {
                int i11 = inputStream.read(bArr, i10, i9 - i10);
                if (i11 == -1) {
                    C2104o.m5277a();
                    return null;
                }
                i10 += i11;
            }
            return new ByteString(bArr);
        }

        private Companion() {
        }

        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m11072deprecated_of(byte[] bArr, int i9, int i10) {
            bArr.getClass();
            return m6811of(bArr, i9, i10);
        }

        /* JADX INFO: renamed from: of */
        public final ByteString m6810of(byte... bArr) {
            bArr.getClass();
            return new ByteString(Arrays.copyOf(bArr, bArr.length));
        }

        /* JADX INFO: renamed from: of */
        public final ByteString m6809of(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }
    }

    /* JADX INFO: renamed from: of */
    public static final ByteString m6807of(byte... bArr) {
        return Companion.m6810of(bArr);
    }

    /* JADX INFO: renamed from: of */
    public static final ByteString m6808of(byte[] bArr, int i9, int i10) {
        return Companion.m6811of(bArr, i9, i10);
    }

    public final boolean startsWith(byte[] bArr) {
        bArr.getClass();
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i9, int i10, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: indexOf");
            return 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return byteString.indexOf(bArr, i9);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i9, int i10, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: lastIndexOf");
            return 0;
        }
        if ((i10 & 2) != 0) {
            i9 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i9);
    }

    public final boolean endsWith(byte[] bArr) {
        bArr.getClass();
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public boolean rangeEquals(int i9, ByteString byteString, int i10, int i11) {
        byteString.getClass();
        return byteString.rangeEquals(i10, getData$okio(), i9, i11);
    }

    public final int indexOf(byte[] bArr) {
        bArr.getClass();
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int indexOf(ByteString byteString, int i9) {
        byteString.getClass();
        return indexOf(byteString.internalArray$okio(), i9);
    }

    public final int indexOf(ByteString byteString) {
        byteString.getClass();
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] bArr) {
        bArr.getClass();
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString byteString, int i9) {
        byteString.getClass();
        return lastIndexOf(byteString.internalArray$okio(), i9);
    }

    public final int lastIndexOf(ByteString byteString) {
        byteString.getClass();
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final ByteString substring(int i9) {
        return substring$default(this, i9, 0, 2, null);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }
}
