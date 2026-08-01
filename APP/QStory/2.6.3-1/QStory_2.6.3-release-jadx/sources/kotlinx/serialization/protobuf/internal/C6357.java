package kotlinx.serialization.protobuf.internal;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5971;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p025.AbstractC7012;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f15613;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f15614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6349 f15617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15616 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ProtoWireType f15615 = ProtoWireType.INVALID;

    public C6357(C6349 c6349) {
        this.f15617 = c6349;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11344(int i) {
        if (i < 0) {
            throw new ProtobufDecodingException(AbstractC7012.m12147(i, "Unexpected negative length: "), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] m11345() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15615 == protoWireType) {
            return m11356();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15615;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6349 m11346() {
        int iM11349 = m11349(ProtoIntegerType.DEFAULT);
        m11344(iM11349);
        C6349 c6349 = this.f15617;
        c6349.m11327(iM11349);
        C6349 c63492 = new C6349(c6349.f15593, c6349.f15591 + iM11349);
        c63492.f15591 = c6349.f15591;
        c6349.f15591 += iM11349;
        return c63492;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6349 m11347() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15615 == protoWireType) {
            return m11346();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15615;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m11348(ProtoIntegerType protoIntegerType) {
        int i = AbstractC6356.f15611[protoIntegerType.ordinal()];
        C6349 c6349 = this.f15617;
        if (i == 1) {
            return c6349.m11325(false);
        }
        if (i == 2) {
            long jM11325 = c6349.m11325(false);
            return (jM11325 & Long.MIN_VALUE) ^ ((((jM11325 << 63) >> 63) ^ jM11325) >> 1);
        }
        if (i == 3) {
            return m11351();
        }
        C5043.m9170();
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m11349(ProtoIntegerType protoIntegerType) {
        int i = AbstractC6356.f15611[protoIntegerType.ordinal()];
        C6349 c6349 = this.f15617;
        if (i == 1) {
            return (int) c6349.m11325(false);
        }
        if (i != 2) {
            if (i == 3) {
                return m11357();
            }
            C5043.m9170();
            return 0;
        }
        int i2 = c6349.f15591;
        int i3 = c6349.f15592;
        if (i2 == i3) {
            throw new SerializationException("Unexpected EOF");
        }
        byte[] bArr = c6349.f15593;
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 >= 0) {
            c6349.f15591 = i4;
        } else if (i3 - i2 > 1) {
            int i6 = i2 + 2;
            int i7 = (bArr[i4] << 7) ^ i5;
            if (i7 >= 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < 32; i9 += 7) {
                    int iM11326 = c6349.m11326();
                    i8 |= (iM11326 & 127) << i9;
                    if ((iM11326 & 128) == 0) {
                        i5 = i8;
                    }
                }
                throw new SerializationException("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            c6349.f15591 = i6;
            i5 = i7 ^ (-128);
        }
        return ((((i5 << 31) >> 31) ^ i5) >> 1) ^ (Integer.MIN_VALUE & i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final String m11350() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15615 != protoWireType) {
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(protoWireType);
            ProtoWireType protoWireType2 = this.f15615;
            sb.append(", but found ");
            sb.append(protoWireType2);
            throw new ProtobufDecodingException(sb.toString(), null, 2, null);
        }
        int iM11349 = m11349(ProtoIntegerType.DEFAULT);
        m11344(iM11349);
        C6349 c6349 = this.f15617;
        byte[] bArr = c6349.f15593;
        int i = c6349.f15591;
        String strM10694 = AbstractC5971.m10694(i, bArr, i + iM11349);
        c6349.f15591 += iM11349;
        return strM10694;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long m11351() {
        long jM11326 = 0;
        for (int i = 0; i < 8; i++) {
            jM11326 |= ((long) (this.f15617.m11326() & Opcodes.CONST_METHOD_TYPE)) << (i * 8);
        }
        return jM11326;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m11352(int i) {
        if (i == -1) {
            this.f15616 = -1;
            this.f15615 = ProtoWireType.INVALID;
            return -1;
        }
        this.f15616 = i >>> 3;
        ProtoWireType.Companion.getClass();
        this.f15615 = ProtoWireType.entryArray[i & 7];
        return this.f15616;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m11353() {
        if (!this.f15614) {
            this.f15613 = (this.f15616 << 3) | this.f15615.getTypeId();
            return m11352((int) this.f15617.m11325(true));
        }
        this.f15614 = false;
        int typeId = (this.f15616 << 3) | this.f15615.getTypeId();
        int iM11352 = m11352(this.f15613);
        this.f15613 = typeId;
        return iM11352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m11354() {
        int i = AbstractC6356.f15612[this.f15615.ordinal()];
        if (i == 1) {
            m11360(ProtoIntegerType.DEFAULT);
            return;
        }
        if (i == 2) {
            m11358(ProtoIntegerType.FIXED);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                m11360(ProtoIntegerType.FIXED);
                return;
            }
            throw new ProtobufDecodingException("Unsupported start group or end group wire type: " + this.f15615, null, 2, null);
        }
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15615 == protoWireType) {
            int iM11349 = m11349(ProtoIntegerType.DEFAULT);
            m11344(iM11349);
            C6349 c6349 = this.f15617;
            c6349.m11327(iM11349);
            c6349.f15591 += iM11349;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15615;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double m11355() {
        ProtoWireType protoWireType = ProtoWireType.i64;
        if (this.f15615 == protoWireType) {
            return Double.longBitsToDouble(m11351());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15615;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] m11356() {
        int iM11349 = m11349(ProtoIntegerType.DEFAULT);
        m11344(iM11349);
        C6349 c6349 = this.f15617;
        c6349.m11327(iM11349);
        byte[] bArr = new byte[iM11349];
        int i = c6349.f15592;
        int i2 = c6349.f15591;
        int i3 = i - i2;
        if (i3 < iM11349) {
            iM11349 = i3;
        }
        AbstractC5179.m9403(c6349.f15593, 0, bArr, i2, i2 + iM11349);
        c6349.f15591 += iM11349;
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m11357() {
        int iM11326 = 0;
        for (int i = 0; i < 4; i++) {
            iM11326 |= (this.f15617.m11326() & Opcodes.CONST_METHOD_TYPE) << (i * 8);
        }
        return iM11326;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long m11358(ProtoIntegerType protoIntegerType) {
        protoIntegerType.getClass();
        ProtoWireType protoWireType = protoIntegerType == ProtoIntegerType.FIXED ? ProtoWireType.i64 : ProtoWireType.VARINT;
        if (this.f15615 == protoWireType) {
            return m11348(protoIntegerType);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15615;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m11359() {
        ProtoWireType protoWireType = ProtoWireType.i32;
        if (this.f15615 == protoWireType) {
            return Float.intBitsToFloat(m11357());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15615;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m11360(ProtoIntegerType protoIntegerType) {
        protoIntegerType.getClass();
        ProtoWireType protoWireType = protoIntegerType == ProtoIntegerType.FIXED ? ProtoWireType.i32 : ProtoWireType.VARINT;
        if (this.f15615 == protoWireType) {
            return m11349(protoIntegerType);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15615;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }
}
