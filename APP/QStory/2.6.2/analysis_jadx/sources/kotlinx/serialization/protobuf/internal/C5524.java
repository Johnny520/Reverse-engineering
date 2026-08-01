package kotlinx.serialization.protobuf.internal;

import com.android.dx.io.Opcodes;
import io.ktor.util.C4210;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5138;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p007.AbstractC6136;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5524 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f15268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f15269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5516 f15272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15271 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ProtoWireType f15270 = ProtoWireType.INVALID;

    public C5524(C5516 c5516) {
        this.f15272 = c5516;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10728(int i) {
        if (i < 0) {
            throw new ProtobufDecodingException(AbstractC6136.m11556(i, "Unexpected negative length: "), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] m10729() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 == protoWireType) {
            return m10740();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5516 m10730() {
        int iM10733 = m10733(ProtoIntegerType.DEFAULT);
        m10728(iM10733);
        C5516 c5516 = this.f15272;
        c5516.m10711(iM10733);
        C5516 c55162 = new C5516(c5516.f15248, c5516.f15246 + iM10733);
        c55162.f15246 = c5516.f15246;
        c5516.f15246 += iM10733;
        return c55162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5516 m10731() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 == protoWireType) {
            return m10730();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m10732(ProtoIntegerType protoIntegerType) {
        int i = AbstractC5523.f15266[protoIntegerType.ordinal()];
        C5516 c5516 = this.f15272;
        if (i == 1) {
            return c5516.m10709(false);
        }
        if (i == 2) {
            long jM10709 = c5516.m10709(false);
            return (jM10709 & Long.MIN_VALUE) ^ ((((jM10709 << 63) >> 63) ^ jM10709) >> 1);
        }
        if (i == 3) {
            return m10735();
        }
        C4210.m8621();
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m10733(kotlinx.serialization.protobuf.ProtoIntegerType r8) {
        /*
            r7 = this;
            int[] r0 = kotlinx.serialization.protobuf.internal.AbstractC5523.f15266
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
            int r7 = r7.m10741()
            return r7
        L19:
            io.ktor.util.C4210.m8621()
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
            int r8 = r1.m10710()
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
            long r7 = r1.m10709(r0)
            int r7 = (int) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.protobuf.internal.C5524.m10733(kotlinx.serialization.protobuf.ProtoIntegerType):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final String m10734() {
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 != protoWireType) {
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(protoWireType);
            ProtoWireType protoWireType2 = this.f15270;
            sb.append(", but found ");
            sb.append(protoWireType2);
            throw new ProtobufDecodingException(sb.toString(), null, 2, null);
        }
        int iM10733 = m10733(ProtoIntegerType.DEFAULT);
        m10728(iM10733);
        C5516 c5516 = this.f15272;
        byte[] bArr = c5516.f15248;
        int i = c5516.f15246;
        String strM10134 = AbstractC5138.m10134(i, bArr, i + iM10733);
        c5516.f15246 += iM10733;
        return strM10134;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long m10735() {
        long jM10710 = 0;
        for (int i = 0; i < 8; i++) {
            jM10710 |= ((long) (this.f15272.m10710() & Opcodes.CONST_METHOD_TYPE)) << (i * 8);
        }
        return jM10710;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m10736(int i) {
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
    public final int m10737() {
        if (!this.f15269) {
            this.f15268 = (this.f15271 << 3) | this.f15270.getTypeId();
            return m10736((int) this.f15272.m10709(true));
        }
        this.f15269 = false;
        int typeId = (this.f15271 << 3) | this.f15270.getTypeId();
        int iM10736 = m10736(this.f15268);
        this.f15268 = typeId;
        return iM10736;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m10738() {
        int i = AbstractC5523.f15267[this.f15270.ordinal()];
        if (i == 1) {
            m10744(ProtoIntegerType.DEFAULT);
            return;
        }
        if (i == 2) {
            m10742(ProtoIntegerType.FIXED);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                m10744(ProtoIntegerType.FIXED);
                return;
            }
            throw new ProtobufDecodingException("Unsupported start group or end group wire type: " + this.f15270, null, 2, null);
        }
        ProtoWireType protoWireType = ProtoWireType.SIZE_DELIMITED;
        if (this.f15270 == protoWireType) {
            int iM10733 = m10733(ProtoIntegerType.DEFAULT);
            m10728(iM10733);
            C5516 c5516 = this.f15272;
            c5516.m10711(iM10733);
            c5516.f15246 += iM10733;
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
    public final double m10739() {
        ProtoWireType protoWireType = ProtoWireType.i64;
        if (this.f15270 == protoWireType) {
            return Double.longBitsToDouble(m10735());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] m10740() {
        int iM10733 = m10733(ProtoIntegerType.DEFAULT);
        m10728(iM10733);
        C5516 c5516 = this.f15272;
        c5516.m10711(iM10733);
        byte[] bArr = new byte[iM10733];
        int i = c5516.f15247;
        int i2 = c5516.f15246;
        int i3 = i - i2;
        if (i3 < iM10733) {
            iM10733 = i3;
        }
        AbstractC4346.m8840(c5516.f15248, 0, bArr, i2, i2 + iM10733);
        c5516.f15246 += iM10733;
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m10741() {
        int iM10710 = 0;
        for (int i = 0; i < 4; i++) {
            iM10710 |= (this.f15272.m10710() & Opcodes.CONST_METHOD_TYPE) << (i * 8);
        }
        return iM10710;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long m10742(ProtoIntegerType protoIntegerType) {
        protoIntegerType.getClass();
        ProtoWireType protoWireType = protoIntegerType == ProtoIntegerType.FIXED ? ProtoWireType.i64 : ProtoWireType.VARINT;
        if (this.f15270 == protoWireType) {
            return m10732(protoIntegerType);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m10743() {
        ProtoWireType protoWireType = ProtoWireType.i32;
        if (this.f15270 == protoWireType) {
            return Float.intBitsToFloat(m10741());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m10744(ProtoIntegerType protoIntegerType) {
        protoIntegerType.getClass();
        ProtoWireType protoWireType = protoIntegerType == ProtoIntegerType.FIXED ? ProtoWireType.i32 : ProtoWireType.VARINT;
        if (this.f15270 == protoWireType) {
            return m10733(protoIntegerType);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(protoWireType);
        ProtoWireType protoWireType2 = this.f15270;
        sb.append(", but found ");
        sb.append(protoWireType2);
        throw new ProtobufDecodingException(sb.toString(), null, 2, null);
    }
}
