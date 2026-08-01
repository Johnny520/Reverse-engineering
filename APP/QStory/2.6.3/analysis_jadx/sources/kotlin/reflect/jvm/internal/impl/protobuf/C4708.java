package kotlin.reflect.jvm.internal.impl.protobuf;

import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final OutputStream f13761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f13762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f13764;

    public C4708(byte[] bArr, int i) {
        this.f13761 = null;
        this.f13764 = bArr;
        this.f13762 = 0;
        this.f13763 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m9358(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m9359(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m9360(int i, InterfaceC4701 interfaceC4701) {
        int iM9364 = m9364(i);
        int serializedSize = interfaceC4701.getSerializedSize();
        return m9359(serializedSize) + serializedSize + iM9364;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9361(int i) {
        if (i >= 0) {
            return m9359(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m9362(int i, int i2) {
        return m9361(i2) + m9364(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m9363(int i, int i2) {
        return m9361(i2) + m9364(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m9364(int i) {
        return m9359(i << 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C4708 m9365(OutputStream outputStream, int i) {
        return new C4708(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m9366(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m9374((i & 127) | 128);
            i >>>= 7;
        }
        m9374(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m9367(long j) throws IOException {
        m9374(((int) j) & Opcodes.CONST_METHOD_TYPE);
        m9374(((int) (j >> 8)) & Opcodes.CONST_METHOD_TYPE);
        m9374(((int) (j >> 16)) & Opcodes.CONST_METHOD_TYPE);
        m9374(((int) (j >> 24)) & Opcodes.CONST_METHOD_TYPE);
        m9374(((int) (j >> 32)) & Opcodes.CONST_METHOD_TYPE);
        m9374(((int) (j >> 40)) & Opcodes.CONST_METHOD_TYPE);
        m9374(((int) (j >> 48)) & Opcodes.CONST_METHOD_TYPE);
        m9374(((int) (j >> 56)) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m9368(long j) throws IOException {
        while (((-128) & j) != 0) {
            m9374((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m9374((int) j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m9369(int i, int i2) throws IOException {
        m9366((i << 3) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m9370(int i, InterfaceC4701 interfaceC4701) throws IOException {
        m9369(i, 2);
        m9366(interfaceC4701.getSerializedSize());
        interfaceC4701.writeTo(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m9371(int i) throws IOException {
        if (i >= 0) {
            m9366(i);
        } else {
            m9368(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m9372(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f13762;
        int i2 = this.f13763;
        int i3 = i2 - i;
        byte[] bArr2 = this.f13764;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.f13762 += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.f13762 = i2;
        m9379();
        if (i4 > i2) {
            this.f13761.write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.f13762 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m9373(int i) throws IOException {
        m9374(i & Opcodes.CONST_METHOD_TYPE);
        m9374((i >> 8) & Opcodes.CONST_METHOD_TYPE);
        m9374((i >> 16) & Opcodes.CONST_METHOD_TYPE);
        m9374((i >> 24) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m9374(int i) throws IOException {
        byte b = (byte) i;
        if (this.f13762 == this.f13763) {
            m9379();
        }
        int i2 = this.f13762;
        this.f13762 = i2 + 1;
        this.f13764[i2] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m9375(AbstractC4710 abstractC4710) throws IOException {
        int size = abstractC4710.size();
        int i = this.f13762;
        int i2 = this.f13763;
        int i3 = i2 - i;
        byte[] bArr = this.f13764;
        if (i3 >= size) {
            abstractC4710.m9400(bArr, 0, i, size);
            this.f13762 += size;
            return;
        }
        abstractC4710.m9400(bArr, 0, i, i3);
        int i4 = size - i3;
        this.f13762 = i2;
        m9379();
        if (i4 <= i2) {
            abstractC4710.m9400(bArr, i3, 0, i4);
            this.f13762 = i4;
            return;
        }
        if (i3 < 0) {
            C4211.m8616("Source offset < 0: ", 30, i3);
            return;
        }
        if (i4 < 0) {
            C4211.m8616("Length < 0: ", 23, i4);
            return;
        }
        int i5 = i3 + i4;
        if (i5 > abstractC4710.size()) {
            C4211.m8616("Source end offset exceeded: ", 39, i5);
        } else if (i4 > 0) {
            abstractC4710.mo9348(this.f13761, i3, i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m9376() throws IOException {
        if (this.f13761 != null) {
            m9379();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m9377(int i, int i2) throws IOException {
        m9369(i, 0);
        m9371(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m9378(int i, int i2) throws IOException {
        m9369(i, 0);
        m9371(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m9379() throws IOException {
        OutputStream outputStream = this.f13761;
        if (outputStream == null) {
            throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            };
        }
        outputStream.write(this.f13764, 0, this.f13762);
        this.f13762 = 0;
    }

    public C4708(OutputStream outputStream, byte[] bArr) {
        this.f13761 = outputStream;
        this.f13764 = bArr;
        this.f13762 = 0;
        this.f13763 = bArr.length;
    }
}
