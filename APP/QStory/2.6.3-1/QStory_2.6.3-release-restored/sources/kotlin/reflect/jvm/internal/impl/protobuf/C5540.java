package kotlin.reflect.jvm.internal.impl.protobuf;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5540 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final OutputStream f14106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f14107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f14109;

    public C5540(byte[] bArr, int i) {
        this.f14106 = null;
        this.f14109 = bArr;
        this.f14107 = 0;
        this.f14108 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m9917(long j) {
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
    public static int m9918(int i) {
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
    public static int m9919(int i, InterfaceC5533 interfaceC5533) {
        int iM9923 = m9923(i);
        int serializedSize = interfaceC5533.getSerializedSize();
        return m9918(serializedSize) + serializedSize + iM9923;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9920(int i) {
        if (i >= 0) {
            return m9918(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m9921(int i, int i2) {
        return m9920(i2) + m9923(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m9922(int i, int i2) {
        return m9920(i2) + m9923(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m9923(int i) {
        return m9918(i << 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C5540 m9924(OutputStream outputStream, int i) {
        return new C5540(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m9925(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m9933((i & 127) | 128);
            i >>>= 7;
        }
        m9933(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m9926(long j) throws IOException {
        m9933(((int) j) & Opcodes.CONST_METHOD_TYPE);
        m9933(((int) (j >> 8)) & Opcodes.CONST_METHOD_TYPE);
        m9933(((int) (j >> 16)) & Opcodes.CONST_METHOD_TYPE);
        m9933(((int) (j >> 24)) & Opcodes.CONST_METHOD_TYPE);
        m9933(((int) (j >> 32)) & Opcodes.CONST_METHOD_TYPE);
        m9933(((int) (j >> 40)) & Opcodes.CONST_METHOD_TYPE);
        m9933(((int) (j >> 48)) & Opcodes.CONST_METHOD_TYPE);
        m9933(((int) (j >> 56)) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m9927(long j) throws IOException {
        while (((-128) & j) != 0) {
            m9933((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m9933((int) j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m9928(int i, int i2) throws IOException {
        m9925((i << 3) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m9929(int i, InterfaceC5533 interfaceC5533) throws IOException {
        m9928(i, 2);
        m9925(interfaceC5533.getSerializedSize());
        interfaceC5533.writeTo(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m9930(int i) throws IOException {
        if (i >= 0) {
            m9925(i);
        } else {
            m9927(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m9931(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f14107;
        int i2 = this.f14108;
        int i3 = i2 - i;
        byte[] bArr2 = this.f14109;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.f14107 += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.f14107 = i2;
        m9938();
        if (i4 > i2) {
            this.f14106.write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.f14107 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m9932(int i) throws IOException {
        m9933(i & Opcodes.CONST_METHOD_TYPE);
        m9933((i >> 8) & Opcodes.CONST_METHOD_TYPE);
        m9933((i >> 16) & Opcodes.CONST_METHOD_TYPE);
        m9933((i >> 24) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m9933(int i) throws IOException {
        byte b = (byte) i;
        if (this.f14107 == this.f14108) {
            m9938();
        }
        int i2 = this.f14107;
        this.f14107 = i2 + 1;
        this.f14109[i2] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m9934(AbstractC5542 abstractC5542) throws IOException {
        int size = abstractC5542.size();
        int i = this.f14107;
        int i2 = this.f14108;
        int i3 = i2 - i;
        byte[] bArr = this.f14109;
        if (i3 >= size) {
            abstractC5542.m9959(bArr, 0, i, size);
            this.f14107 += size;
            return;
        }
        abstractC5542.m9959(bArr, 0, i, i3);
        int i4 = size - i3;
        this.f14107 = i2;
        m9938();
        if (i4 <= i2) {
            abstractC5542.m9959(bArr, i3, 0, i4);
            this.f14107 = i4;
            return;
        }
        if (i3 < 0) {
            C5043.m9175("Source offset < 0: ", 30, i3);
            return;
        }
        if (i4 < 0) {
            C5043.m9175("Length < 0: ", 23, i4);
            return;
        }
        int i5 = i3 + i4;
        if (i5 > abstractC5542.size()) {
            C5043.m9175("Source end offset exceeded: ", 39, i5);
        } else if (i4 > 0) {
            abstractC5542.mo9907(this.f14106, i3, i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m9935() throws IOException {
        if (this.f14106 != null) {
            m9938();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m9936(int i, int i2) throws IOException {
        m9928(i, 0);
        m9930(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m9937(int i, int i2) throws IOException {
        m9928(i, 0);
        m9930(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m9938() throws IOException {
        OutputStream outputStream = this.f14106;
        if (outputStream == null) {
            throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            };
        }
        outputStream.write(this.f14109, 0, this.f14107);
        this.f14107 = 0;
    }

    public C5540(OutputStream outputStream, byte[] bArr) {
        this.f14106 = outputStream;
        this.f14109 = bArr;
        this.f14107 = 0;
        this.f14108 = bArr.length;
    }
}
