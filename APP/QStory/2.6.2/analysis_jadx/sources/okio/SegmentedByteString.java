package okio;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3055;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import okio.internal.AbstractC5570;
import p005.C6101;
import p005.C6107;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J#\u0010$\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020!H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J'\u00106\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0010¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010BJ/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010CJ3\u0010F\u001a\u0002052\b\b\u0002\u0010:\u001a\u00020!2\u0006\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bF\u0010GJ!\u0010I\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010JJ!\u0010K\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bK\u0010JJ\u000f\u0010M\u001a\u00020\u0003H\u0010¢\u0006\u0004\bL\u0010/J\u001a\u0010O\u001a\u00020@2\b\u0010>\u001a\u0004\u0018\u00010NH\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020!H\u0016¢\u0006\u0004\bQ\u0010,J\u000f\u0010R\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "", "", "segments", "", "directory", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "([[B[I)V", "toByteString", "()Lokio/ByteString;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "writeReplace", "()Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "()Ljava/lang/String;", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "toByteArray", "()[B", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write", "(Ljava/io/OutputStream;)V", "L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;", "buffer", "offset", "byteCount", "write$okio", "(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;II)V", "other", "otherOffset", "", "rangeEquals", "(ILokio/ByteString;II)Z", "(I[BII)Z", TypeProxy.INSTANCE_FIELD, "targetOffset", "copyInto", "(I[BII)V", "fromIndex", "indexOf", "([BI)I", "lastIndexOf", "internalArray$okio", "internalArray", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "[[B", "getSegments$okio", "()[[B", "[I", "getDirectory$okio", "()[I", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData());
        bArr.getClass();
        iArr.getClass();
        this.segments = bArr;
        this.directory = iArr;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        byteString.getClass();
        return byteString;
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        byteBufferAsReadOnlyBuffer.getClass();
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
        target.getClass();
        long j = byteCount;
        AbstractC3055.m6628(size(), offset, j);
        AbstractC3055.m6628(target.length, targetOffset, j);
        int i = byteCount + offset;
        int iM10879 = AbstractC5570.m10879(this, offset);
        while (offset < i) {
            int i2 = iM10879 == 0 ? 0 : getDirectory()[iM10879 - 1];
            int i3 = getDirectory()[iM10879] - i2;
            int i4 = getDirectory()[getSegments().length + iM10879];
            int iMin = Math.min(i, i3 + i2) - offset;
            int i5 = (offset - i2) + i4;
            AbstractC4346.m8840(getSegments()[iM10879], targetOffset, target, i5, i5 + iMin);
            targetOffset += iMin;
            offset += iMin;
            iM10879++;
        }
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        algorithm.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory()[length + i];
            int i4 = getDirectory()[i];
            messageDigest.update(getSegments()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ByteString) {
            ByteString byteString = (ByteString) other;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: getDirectory$okio, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: getSegments$okio, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory()[length + i];
            int i5 = getDirectory()[i];
            byte[] bArr = getSegments()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }

    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        algorithm.getClass();
        key.getClass();
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getDirectory()[length + i];
                int i4 = getDirectory()[i];
                mac.update(getSegments()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] bArrDoFinal = mac.doFinal();
            bArrDoFinal.getClass();
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // okio.ByteString
    public int indexOf(byte[] other, int fromIndex) {
        other.getClass();
        return toByteString().indexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int pos) {
        AbstractC3055.m6628(getDirectory()[getSegments().length - 1], pos, 1L);
        int iM10879 = AbstractC5570.m10879(this, pos);
        return getSegments()[iM10879][(pos - (iM10879 == 0 ? 0 : getDirectory()[iM10879 - 1])) + getDirectory()[getSegments().length + iM10879]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] other, int fromIndex) {
        other.getClass();
        return toByteString().lastIndexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
        other.getClass();
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i = byteCount + offset;
        int iM10879 = AbstractC5570.m10879(this, offset);
        while (offset < i) {
            int i2 = iM10879 == 0 ? 0 : getDirectory()[iM10879 - 1];
            int i3 = getDirectory()[iM10879] - i2;
            int i4 = getDirectory()[getSegments().length + iM10879];
            int iMin = Math.min(i, i3 + i2) - offset;
            if (!AbstractC3055.m6630(getSegments()[iM10879], (offset - i2) + i4, other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iM10879++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        charset.getClass();
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int beginIndex, int endIndex) {
        if (endIndex == -1234567890) {
            endIndex = size();
        }
        if (beginIndex < 0) {
            C5919.m11253(AbstractC0053.m161(beginIndex, "beginIndex=", " < 0"));
            return null;
        }
        if (endIndex > size()) {
            StringBuilder sbM148 = AbstractC0053.m148(endIndex, "endIndex=", " > length(");
            sbM148.append(size());
            sbM148.append(')');
            throw new IllegalArgumentException(sbM148.toString().toString());
        }
        int i = endIndex - beginIndex;
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11559(endIndex, beginIndex, "endIndex=", " < beginIndex="));
            return null;
        }
        if (beginIndex == 0 && endIndex == size()) {
            return this;
        }
        if (beginIndex == endIndex) {
            return ByteString.EMPTY;
        }
        int iM10879 = AbstractC5570.m10879(this, beginIndex);
        int iM108792 = AbstractC5570.m10879(this, endIndex - 1);
        byte[][] bArr = (byte[][]) AbstractC4346.m8862(getSegments(), iM10879, iM108792 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iM10879 <= iM108792) {
            int i2 = iM10879;
            int i3 = 0;
            while (true) {
                iArr[i3] = Math.min(getDirectory()[i2] - beginIndex, i);
                int i4 = i3 + 1;
                iArr[i3 + bArr.length] = getDirectory()[getSegments().length + i2];
                if (i2 == iM108792) {
                    break;
                }
                i2++;
                i3 = i4;
            }
        }
        int i5 = iM10879 != 0 ? getDirectory()[iM10879 - 1] : 0;
        int length = bArr.length;
        iArr[length] = (beginIndex - i5) + iArr[length];
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory()[length + i];
            int i5 = getDirectory()[i];
            int i6 = i5 - i2;
            AbstractC4346.m8840(getSegments()[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(OutputStream out) throws IOException {
        out.getClass();
        int length = getSegments().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory()[length + i];
            int i4 = getDirectory()[i];
            out.write(getSegments()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // okio.ByteString
    public void write$okio(C6101 buffer, int offset, int byteCount) {
        buffer.getClass();
        int i = offset + byteCount;
        int iM10879 = AbstractC5570.m10879(this, offset);
        while (offset < i) {
            int i2 = iM10879 == 0 ? 0 : getDirectory()[iM10879 - 1];
            int i3 = getDirectory()[iM10879] - i2;
            int i4 = getDirectory()[getSegments().length + iM10879];
            int iMin = Math.min(i, i3 + i2) - offset;
            int i5 = (offset - i2) + i4;
            C6107 c6107 = new C6107(getSegments()[iM10879], i5, i5 + iMin, true);
            C6107 c61072 = buffer.f16658;
            if (c61072 == null) {
                c6107.f16680 = c6107;
                c6107.f16674 = c6107;
                buffer.f16658 = c6107;
            } else {
                C6107 c61073 = c61072.f16680;
                c61073.getClass();
                c61073.m11506(c6107);
            }
            offset += iMin;
            iM10879++;
        }
        buffer.f16657 += (long) byteCount;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, ByteString other, int otherOffset, int byteCount) {
        other.getClass();
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i = byteCount + offset;
        int iM10879 = AbstractC5570.m10879(this, offset);
        while (offset < i) {
            int i2 = iM10879 == 0 ? 0 : getDirectory()[iM10879 - 1];
            int i3 = getDirectory()[iM10879] - i2;
            int i4 = getDirectory()[getSegments().length + iM10879];
            int iMin = Math.min(i, i3 + i2) - offset;
            if (!other.rangeEquals(otherOffset, getSegments()[iM10879], (offset - i2) + i4, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iM10879++;
        }
        return true;
    }
}
