package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p222p.AbstractC3199a;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6147SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6147SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        bArr.getClass();
        iArr.getClass();
        this.segments = bArr;
        this.directory = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Object writeReplace() {
        ByteString byteString = toByteString();
        byteString.getClass();
        return byteString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        byteBufferAsReadOnlyBuffer.getClass();
        return byteBufferAsReadOnlyBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public void copyInto(int i9, byte[] bArr, int i10, int i11) {
        bArr.getClass();
        long j3 = i11;
        SegmentedByteString.checkOffsetAndCount(size(), i9, j3);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, j3);
        int i12 = i11 + i9;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            int i16 = (i9 - i13) + i15;
            AbstractC4165l.m8380o0(getSegments$okio()[iSegment], i10, i16, bArr, i16 + iMin);
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public ByteString digest$okio(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = getDirectory$okio()[length + i9];
            int i12 = getDirectory$okio()[i9];
            messageDigest.update(getSegments$okio()[i9], i11, i12 - i10);
            i9++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] getDirectory$okio() {
        return this.directory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            int i12 = getDirectory$okio()[length + i9];
            int i13 = getDirectory$okio()[i9];
            byte[] bArr = getSegments$okio()[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        setHashCode$okio(i10);
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public ByteString hmac$okio(String str, ByteString byteString) throws NoSuchAlgorithmException {
        str.getClass();
        byteString.getClass();
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                int i11 = getDirectory$okio()[length + i9];
                int i12 = getDirectory$okio()[i9];
                mac.update(getSegments$okio()[i9], i11, i12 - i10);
                i9++;
                i10 = i12;
            }
            byte[] bArrDoFinal = mac.doFinal();
            bArrDoFinal.getClass();
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public int indexOf(byte[] bArr, int i9) {
        bArr.getClass();
        return toByteString().indexOf(bArr, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public byte internalGet$okio(int i9) {
        SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i9, 1L);
        int iSegment = okio.internal.SegmentedByteString.segment(this, i9);
        return getSegments$okio()[iSegment][(i9 - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public int lastIndexOf(byte[] bArr, int i9) {
        bArr.getClass();
        return toByteString().lastIndexOf(bArr, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public boolean rangeEquals(int i9, byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i9 < 0 || i9 > size() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!SegmentedByteString.arrayRangeEquals(getSegments$okio()[iSegment], (i9 - i13) + i15, bArr, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public String string(Charset charset) {
        charset.getClass();
        return toByteString().string(charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public ByteString substring(int i9, int i10) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i10);
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "beginIndex=", " < 0"));
            return null;
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(iResolveDefaultParameter, "endIndex=", " > length(");
            sbM2257t.append(size());
            sbM2257t.append(')');
            throw new IllegalArgumentException(sbM2257t.toString().toString());
        }
        int i11 = iResolveDefaultParameter - i9;
        if (i11 < 0) {
            C2104o.m5291q(AbstractC3199a.m6837j(iResolveDefaultParameter, "endIndex=", " < beginIndex=", i9));
            return null;
        }
        if (i9 == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (i9 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = okio.internal.SegmentedByteString.segment(this, i9);
        int iSegment2 = okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) AbstractC4165l.m8386u0(getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(getDirectory$okio()[i12] - i9, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i9 - i15) + iArr[length];
        return new C6147SegmentedByteString(bArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int i12 = getDirectory$okio()[length + i9];
            int i13 = getDirectory$okio()[i9];
            int i14 = i13 - i10;
            AbstractC4165l.m8380o0(getSegments$okio()[i9], i11, i12, bArr, i12 + i14);
            i11 += i14;
            i9++;
            i10 = i13;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = getDirectory$okio()[length + i9];
            int i12 = getDirectory$okio()[i9];
            outputStream.write(getSegments$okio()[i9], i11, i12 - i10);
            i9++;
            i10 = i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ByteString
    public void write$okio(Buffer buffer, int i9, int i10) {
        buffer.getClass();
        int i11 = i9 + i10;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i9);
        while (i9 < i11) {
            int i12 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i13 = getDirectory$okio()[iSegment] - i12;
            int i14 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i9;
            int i15 = (i9 - i12) + i14;
            Segment segment = new Segment(getSegments$okio()[iSegment], i15, i15 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                segment2.getClass();
                Segment segment3 = segment2.prev;
                segment3.getClass();
                segment3.push(segment);
            }
            i9 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i10));
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i9, ByteString byteString, int i10, int i11) {
        byteString.getClass();
        if (i9 < 0 || i9 > size() - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!byteString.rangeEquals(i10, getSegments$okio()[iSegment], (i9 - i13) + i15, iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }
}
