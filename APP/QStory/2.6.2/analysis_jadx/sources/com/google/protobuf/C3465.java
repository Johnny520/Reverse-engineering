package com.google.protobuf;

import bsh.C2632;
import java.io.IOException;
import java.io.OutputStream;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3465 extends AbstractC3461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final OutputStream f11132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f11133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f11135;

    public C3465(OutputStream outputStream, int i) {
        if (outputStream == null) {
            C2632.m5298("out");
            throw null;
        }
        this.f11132 = outputStream;
        if (i < 0) {
            C5919.m11249("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f11135 = bArr;
        this.f11134 = bArr.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m7691(int i) {
        if (this.f11134 - this.f11133 < i) {
            m7695();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m7692(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f11133;
        int i4 = this.f11134;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f11135;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f11133 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f11133 = i4;
        m7695();
        if (i7 > i4) {
            this.f11132.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f11133 = i7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m7693(int i) {
        boolean z = AbstractC3461.f11124;
        byte[] bArr = this.f11135;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f11133;
                if (i2 == 0) {
                    this.f11133 = i3 + 1;
                    AbstractC3725.m8010(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f11133 = i3 + 1;
                    AbstractC3725.m8010(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f11133;
                if (i4 == 0) {
                    this.f11133 = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f11133 = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m7694(int i, int i2) {
        m7693((i << 3) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m7695() {
        this.f11132.write(this.f11135, 0, this.f11133);
        this.f11133 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m7696(long j) {
        boolean z = AbstractC3461.f11124;
        byte[] bArr = this.f11135;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f11133;
                if (j2 == 0) {
                    this.f11133 = i + 1;
                    AbstractC3725.m8010(bArr, i, (byte) j);
                    return;
                } else {
                    this.f11133 = i + 1;
                    AbstractC3725.m8010(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f11133;
                if (j3 == 0) {
                    this.f11133 = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f11133 = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m7697(int i) {
        int i2 = this.f11133;
        byte[] bArr = this.f11135;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f11133 = i2 + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m7698(long j) {
        int i = this.f11133;
        byte[] bArr = this.f11135;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f11133 = i + 8;
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo7658(int i) {
        m7691(5);
        m7693(i);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo7659(int i, int i2) {
        m7691(20);
        m7694(i, 0);
        m7693(i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo7660(long j) {
        m7691(10);
        m7696(j);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo7661(int i, long j) {
        m7691(20);
        m7694(i, 0);
        m7696(j);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7662(int i, InterfaceC3440 interfaceC3440) {
        mo7668(i, 2);
        mo7673(interfaceC3440);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo7663(int i) {
        if (i >= 0) {
            mo7658(i);
        } else {
            mo7660(i);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo7664(int i, int i2) {
        m7691(20);
        m7694(i, 0);
        if (i2 >= 0) {
            m7693(i2);
        } else {
            m7696(i2);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7665(long j) {
        m7691(8);
        m7698(j);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7666(int i, long j) {
        m7691(18);
        m7694(i, 1);
        m7698(j);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo7667(int i) {
        m7691(4);
        m7697(i);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo7668(int i, int i2) {
        mo7658((i << 3) | i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo7669(String str) throws Exception {
        int length = str.length() * 3;
        int iM7648 = AbstractC3461.m7648(length);
        int i = iM7648 + length;
        int i2 = this.f11134;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iMo7542 = AbstractC3723.f11538.mo7542(str, bArr, 0, length);
            mo7658(iMo7542);
            m7692(bArr, 0, iMo7542);
            return;
        }
        if (i > i2 - this.f11133) {
            m7695();
        }
        int iM76482 = AbstractC3461.m7648(str.length());
        int i3 = this.f11133;
        byte[] bArr2 = this.f11135;
        try {
            if (iM76482 == iM7648) {
                int i4 = i3 + iM76482;
                this.f11133 = i4;
                int iMo75422 = AbstractC3723.f11538.mo7542(str, bArr2, i4, i2 - i4);
                this.f11133 = i3;
                m7693((iMo75422 - i3) - iM76482);
                this.f11133 = iMo75422;
            } else {
                int iM7997 = AbstractC3723.m7997(str);
                m7693(iM7997);
                this.f11133 = AbstractC3723.f11538.mo7542(str, bArr2, this.f11133, iM7997);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7670(int i, String str) throws Exception {
        mo7668(i, 2);
        mo7669(str);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo7671(int i, ByteString byteString) {
        mo7668(1, 3);
        mo7659(2, i);
        mo7679(3, byteString);
        mo7668(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo7672(int i, InterfaceC3440 interfaceC3440) {
        mo7668(1, 3);
        mo7659(2, i);
        mo7662(3, interfaceC3440);
        mo7668(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7673(InterfaceC3440 interfaceC3440) {
        mo7658(interfaceC3440.getSerializedSize());
        interfaceC3440.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3538
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7699(int i, byte[] bArr, int i2) throws IOException {
        m7692(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7675(byte[] bArr, int i) throws IOException {
        mo7658(i);
        m7692(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7676(int i, boolean z) {
        m7691(11);
        m7694(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f11133;
        this.f11135[i2] = b;
        this.f11133 = i2 + 1;
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo7678(int i, int i2) {
        m7691(14);
        m7694(i, 5);
        m7697(i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo7679(int i, ByteString byteString) {
        mo7668(i, 2);
        mo7680(byteString);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo7680(ByteString byteString) {
        mo7658(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo7681() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7682(byte b) {
        if (this.f11133 == this.f11134) {
            m7695();
        }
        int i = this.f11133;
        this.f11135[i] = b;
        this.f11133 = i + 1;
    }
}
