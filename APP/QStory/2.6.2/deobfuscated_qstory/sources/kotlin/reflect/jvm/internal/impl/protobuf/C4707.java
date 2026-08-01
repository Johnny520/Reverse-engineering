package kotlin.reflect.jvm.internal.impl.protobuf;

import com.android.dx.io.Opcodes;
import io.ktor.util.C4210;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final OutputStream f13757;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f13758;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f13760;

    public C4707(byte[] bArr, int i) {
        this.f13757 = null;
        this.f13760 = bArr;
        this.f13758 = 0;
        this.f13759 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m9368(long j) {
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
    public static int m9369(int i) {
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
    public static int m9370(int i, InterfaceC4700 interfaceC4700) {
        int iM9374 = m9374(i);
        int serializedSize = interfaceC4700.getSerializedSize();
        return m9369(serializedSize) + serializedSize + iM9374;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9371(int i) {
        if (i >= 0) {
            return m9369(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m9372(int i, int i2) {
        return m9371(i2) + m9374(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m9373(int i, int i2) {
        return m9371(i2) + m9374(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m9374(int i) {
        return m9369(i << 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C4707 m9375(OutputStream outputStream, int i) {
        return new C4707(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m9376(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m9384((i & 127) | 128);
            i >>>= 7;
        }
        m9384(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m9377(long j) throws IOException {
        m9384(((int) j) & Opcodes.CONST_METHOD_TYPE);
        m9384(((int) (j >> 8)) & Opcodes.CONST_METHOD_TYPE);
        m9384(((int) (j >> 16)) & Opcodes.CONST_METHOD_TYPE);
        m9384(((int) (j >> 24)) & Opcodes.CONST_METHOD_TYPE);
        m9384(((int) (j >> 32)) & Opcodes.CONST_METHOD_TYPE);
        m9384(((int) (j >> 40)) & Opcodes.CONST_METHOD_TYPE);
        m9384(((int) (j >> 48)) & Opcodes.CONST_METHOD_TYPE);
        m9384(((int) (j >> 56)) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m9378(long j) throws IOException {
        while (((-128) & j) != 0) {
            m9384((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m9384((int) j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m9379(int i, int i2) throws IOException {
        m9376((i << 3) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m9380(int i, InterfaceC4700 interfaceC4700) throws IOException {
        m9379(i, 2);
        m9376(interfaceC4700.getSerializedSize());
        interfaceC4700.writeTo(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m9381(int i) throws IOException {
        if (i >= 0) {
            m9376(i);
        } else {
            m9378(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m9382(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f13758;
        int i2 = this.f13759;
        int i3 = i2 - i;
        byte[] bArr2 = this.f13760;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.f13758 += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.f13758 = i2;
        m9389();
        if (i4 > i2) {
            this.f13757.write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.f13758 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m9383(int i) throws IOException {
        m9384(i & Opcodes.CONST_METHOD_TYPE);
        m9384((i >> 8) & Opcodes.CONST_METHOD_TYPE);
        m9384((i >> 16) & Opcodes.CONST_METHOD_TYPE);
        m9384((i >> 24) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m9384(int i) throws IOException {
        byte b = (byte) i;
        if (this.f13758 == this.f13759) {
            m9389();
        }
        int i2 = this.f13758;
        this.f13758 = i2 + 1;
        this.f13760[i2] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m9385(AbstractC4709 abstractC4709) throws IOException {
        int size = abstractC4709.size();
        int i = this.f13758;
        int i2 = this.f13759;
        int i3 = i2 - i;
        byte[] bArr = this.f13760;
        if (i3 >= size) {
            abstractC4709.m9410(bArr, 0, i, size);
            this.f13758 += size;
            return;
        }
        abstractC4709.m9410(bArr, 0, i, i3);
        int i4 = size - i3;
        this.f13758 = i2;
        m9389();
        if (i4 <= i2) {
            abstractC4709.m9410(bArr, i3, 0, i4);
            this.f13758 = i4;
            return;
        }
        if (i3 < 0) {
            C4210.m8626("Source offset < 0: ", 30, i3);
            return;
        }
        if (i4 < 0) {
            C4210.m8626("Length < 0: ", 23, i4);
            return;
        }
        int i5 = i3 + i4;
        if (i5 > abstractC4709.size()) {
            C4210.m8626("Source end offset exceeded: ", 39, i5);
        } else if (i4 > 0) {
            abstractC4709.mo9358(this.f13757, i3, i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m9386() throws IOException {
        if (this.f13757 != null) {
            m9389();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m9387(int i, int i2) throws IOException {
        m9379(i, 0);
        m9381(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m9388(int i, int i2) throws IOException {
        m9379(i, 0);
        m9381(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m9389() throws IOException {
        OutputStream outputStream = this.f13757;
        if (outputStream == null) {
            throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            };
        }
        outputStream.write(this.f13760, 0, this.f13758);
        this.f13758 = 0;
    }

    public C4707(OutputStream outputStream, byte[] bArr) {
        this.f13757 = outputStream;
        this.f13760 = bArr;
        this.f13758 = 0;
        this.f13759 = bArr.length;
    }
}
