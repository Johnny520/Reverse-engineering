package kotlinx.serialization.protobuf.internal;

import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5139;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p009.AbstractC6183;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5525 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f15268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f15269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5517 f15272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15271 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ProtoWireType f15270 = ProtoWireType.INVALID;

    public C5525(C5517 c5517) {
        this.f15272 = c5517;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10785(int i) {
        if (i < 0) {
            throw new ProtobufDecodingException(AbstractC6183.m11588(i, "Unexpected negative length: "), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] m10786() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 == protoWireType) {
            return m10797();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5517 m10787() {
        int iM10790 = m10790(ProtoIntegerType.DEFAULT);
        m10785(iM10790);
        C5517 c5517 = this.f15272;
        c5517.m10768(iM10790);
        C5517 c55172 = new C5517(c5517.f15248, c5517.f15246 + iM10790);
        c55172.f15246 = c5517.f15246;
        c5517.f15246 += iM10790;
        return c55172;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5517 m10788() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 == protoWireType) {
            return m10787();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m10789(ProtoIntegerType protoIntegerType) {
        int i = AbstractC5524.f15266[protoIntegerType.ordinal()];
        C5517 c5517 = this.f15272;
        if (i == 1) {
            return c5517.m10766(false);
        }
        if (i == 2) {
            long jM10766 = c5517.m10766(false);
            return (jM10766 & Long.MIN_VALUE) ^ ((((jM10766 << 63) >> 63) ^ jM10766) >> 1);
        }
        if (i == 3) {
            return m10792();
        }
        C4211.m8611();
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m10790(kotlinx.serialization.protobuf.ProtoIntegerType r8) {
        /*
            r7 = this;
            int[] r0 = kotlinx.serialization.protobuf.internal.AbstractC5524.f15266
            int r8 = r8.ordinal()
            r8 = r0[r8]
            r0 = 0
            kotlinx.serialization.protobuf.internal.飘花落叶言子楪世苏哲兰 r1 = r7.f15272
            r2 = 1
            if (r8 == r2) goto L6e
            r3 = 2
            if (r8 == r3) goto L1d
            r1 = 3
            if (r8 != r1) goto L19
            int r7 = r7.m10798()
            return r7
        L19:
            io.ktor.util.C4211.m8611()
            return r0
        L1d:
            int r7 = r1.f15246
            int r8 = r1.f15247
            if (r7 == r8) goto L66
            byte[] r4 = r1.f15248
            int r5 = r7 + 1
            r6 = r4[r7]
            if (r6 < 0) goto L2e
            r1.f15246 = r5
            goto L50
        L2e:
            int r8 = r8 - r7
            if (r8 <= r2) goto L3e
            int r7 = r7 + r3
            r8 = r4[r5]
            int r8 = r8 << 7
            r8 = r8 ^ r6
            if (r8 >= 0) goto L3e
            r1.f15246 = r7
            r6 = r8 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L50
        L3e:
            r7 = r0
        L3f:
            r8 = 32
            if (r0 >= r8) goto L5e
            int r8 = r1.m10767()
            r3 = r8 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << r0
            r7 = r7 | r3
            r8 = r8 & 128(0x80, float:1.8E-43)
            if (r8 != 0) goto L5b
            r6 = r7
        L50:
            int r7 = r6 << 31
            int r7 = r7 >> 31
            r7 = r7 ^ r6
            int r7 = r7 >> r2
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 & r6
            r7 = r7 ^ r8
            return r7
        L5b:
            int r0 = r0 + 7
            goto L3f
        L5e:
            kotlinx.serialization.SerializationException r7 = new kotlinx.serialization.SerializationException
            java.lang.String r8 = "Input stream is malformed: Varint too long (exceeded 32 bits)"
            r7.<init>(r8)
            throw r7
        L66:
            kotlinx.serialization.SerializationException r7 = new kotlinx.serialization.SerializationException
            java.lang.String r8 = "Unexpected EOF"
            r7.<init>(r8)
            throw r7
        L6e:
            long r7 = r1.m10766(r0)
            int r7 = (int) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.protobuf.internal.C5525.m10790(kotlinx.serialization.protobuf.ProtoIntegerType):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final String m10791() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 != protoWireType) {
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(protoWireType);
            ProtoWireType protoWireType2 = this.f15270;
            sb.append(", but found ");
            sb.append(protoWireType2);
            throw new ProtobufDecodingException(sb.toString(), null, 2, null);
        }
        int iM10790 = m10790(ProtoIntegerType.DEFAULT);
        m10785(iM10790);
        C5517 c5517 = this.f15272;
        byte[] bArr = c5517.f15248;
        int i = c5517.f15246;
        String strM10135 = AbstractC5139.m10135(i, bArr, i + iM10790);
        c5517.f15246 += iM10790;
        return strM10135;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long m10792() {
        long jM10767 = 0;
        for (int i = 0; i < 8; i++) {
            jM10767 |= ((long) (this.f15272.m10767() & Opcodes.CONST_METHOD_TYPE)) << (i * 8);
        }
        return jM10767;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m10793(int i) {
        if (i == -1) {
            this.f15271 = -1;
            this.f15270 = ProtoWireType.INVALID;
            return -1;
        }
        this.f15271 = i >>> 3;
        ProtoWireType.Companion.getClass();
        this.f15270 = ProtoWireType.entryArray[i & 7];
        return this.f15271;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m10794() {
        if (!this.f15269) {
            this.f15268 = (this.f15271 << 3) | this.f15270.getTypeId();
            return m10793((int) this.f15272.m10766(true));
        }
        this.f15269 = false;
        int typeId = (this.f15271 << 3) | this.f15270.getTypeId();
        int iM10793 = m10793(this.f15268);
        this.f15268 = typeId;
        return iM10793;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m10795() {
        int i = AbstractC5524.f15267[this.f15270.ordinal()];
        if (i == 1) {
            m10801(ProtoIntegerType.DEFAULT);
            return;
        }
        if (i == 2) {
            m10799(ProtoIntegerType.FIXED);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                m10801(ProtoIntegerType.FIXED);
                return;
            }
            throw new ProtobufDecodingException("Unsupported start group or end group wire type: " + this.f15270, null, 2, null);
        }
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 == protoWireType) {
            int iM10790 = m10790(ProtoIntegerType.DEFAULT);
            m10785(iM10790);
            C5517 c5517 = this.f15272;
            c5517.m10768(iM10790);
            c5517.f15246 += iM10790;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double m10796() {
        ProtoWireType protoWireType = ProtoWireType.i64;
        if (this.f15270 == protoWireType) {
            return Double.longBitsToDouble(m10792());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] m10797() {
        int iM10790 = m10790(ProtoIntegerType.DEFAULT);
        m10785(iM10790);
        C5517 c5517 = this.f15272;
        c5517.m10768(iM10790);
        byte[] bArr = new byte[iM10790];
        int i = c5517.f15247;
        int i2 = c5517.f15246;
        int i3 = i - i2;
        if (i3 < iM10790) {
            iM10790 = i3;
        }
        AbstractC4347.m8844(c5517.f15248, 0, bArr, i2, i2 + iM10790);
        c5517.f15246 += iM10790;
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m10798() {
        int iM10767 = 0;
        for (int i = 0; i < 4; i++) {
            iM10767 |= (this.f15272.m10767() & Opcodes.CONST_METHOD_TYPE) << (i * 8);
        }
        return iM10767;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long m10799(ProtoIntegerType protoIntegerType) {
        protoIntegerType.getClass();
        ProtoWireType protoWireType = protoIntegerType == ProtoIntegerType.FIXED ? ProtoWireType.i64 : ProtoWireType.VARINT;
        if (this.f15270 == protoWireType) {
            return m10789(protoIntegerType);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m10800() {
        ProtoWireType protoWireType = ProtoWireType.i32;
        if (this.f15270 == protoWireType) {
            return Float.intBitsToFloat(m10798());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m10801(ProtoIntegerType protoIntegerType) {
        protoIntegerType.getClass();
        ProtoWireType protoWireType = protoIntegerType == ProtoIntegerType.FIXED ? ProtoWireType.i32 : ProtoWireType.VARINT;
        if (this.f15270 == protoWireType) {
            return m10790(protoIntegerType);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }
}
