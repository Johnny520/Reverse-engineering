package com.google.protobuf;

import bsh.C3466;
import java.io.IOException;
import java.io.OutputStream;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4298 extends AbstractC4294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final OutputStream f11482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f11483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f11485;

    public C4298(OutputStream outputStream, int i) {
        if (outputStream == null) {
            C3466.m5903("out");
            throw null;
        }
        this.f11482 = outputStream;
        if (i < 0) {
            C6755.m11869("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f11485 = bArr;
        this.f11484 = bArr.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m8237(int i) {
        if (this.f11484 - this.f11483 < i) {
            m8241();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m8238(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f11483;
        int i4 = this.f11484;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f11485;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f11483 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f11483 = i4;
        m8241();
        if (i7 > i4) {
            this.f11482.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f11483 = i7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m8239(int i) {
        boolean z = AbstractC4294.f11474;
        byte[] bArr = this.f11485;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f11483;
                if (i2 == 0) {
                    this.f11483 = i3 + 1;
                    AbstractC4558.m8556(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f11483 = i3 + 1;
                    AbstractC4558.m8556(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f11483;
                if (i4 == 0) {
                    this.f11483 = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f11483 = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m8240(int i, int i2) {
        m8239((i << 3) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m8241() {
        this.f11482.write(this.f11485, 0, this.f11483);
        this.f11483 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m8242(long j) {
        boolean z = AbstractC4294.f11474;
        byte[] bArr = this.f11485;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f11483;
                if (j2 == 0) {
                    this.f11483 = i + 1;
                    AbstractC4558.m8556(bArr, i, (byte) j);
                    return;
                } else {
                    this.f11483 = i + 1;
                    AbstractC4558.m8556(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f11483;
                if (j3 == 0) {
                    this.f11483 = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f11483 = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m8243(int i) {
        int i2 = this.f11483;
        byte[] bArr = this.f11485;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f11483 = i2 + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m8244(long j) {
        int i = this.f11483;
        byte[] bArr = this.f11485;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f11483 = i + 8;
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo8204(int i) {
        m8237(5);
        m8239(i);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo8205(int i, int i2) {
        m8237(20);
        m8240(i, 0);
        m8239(i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo8206(long j) {
        m8237(10);
        m8242(j);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo8207(int i, long j) {
        m8237(20);
        m8240(i, 0);
        m8242(j);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo8208(int i, InterfaceC4273 interfaceC4273) {
        mo8214(i, 2);
        mo8219(interfaceC4273);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo8209(int i) {
        if (i >= 0) {
            mo8204(i);
        } else {
            mo8206(i);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8210(int i, int i2) {
        m8237(20);
        m8240(i, 0);
        if (i2 >= 0) {
            m8239(i2);
        } else {
            m8242(i2);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo8211(long j) {
        m8237(8);
        m8244(j);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo8212(int i, long j) {
        m8237(18);
        m8240(i, 1);
        m8244(j);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo8213(int i) {
        m8237(4);
        m8243(i);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo8214(int i, int i2) {
        mo8204((i << 3) | i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo8215(String str) throws Exception {
        int length = str.length() * 3;
        int iM8194 = AbstractC4294.m8194(length);
        int i = iM8194 + length;
        int i2 = this.f11484;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iMo8088 = AbstractC4556.f11888.mo8088(str, bArr, 0, length);
            mo8204(iMo8088);
            m8238(bArr, 0, iMo8088);
            return;
        }
        if (i > i2 - this.f11483) {
            m8241();
        }
        int iM81942 = AbstractC4294.m8194(str.length());
        int i3 = this.f11483;
        byte[] bArr2 = this.f11485;
        try {
            if (iM81942 == iM8194) {
                int i4 = i3 + iM81942;
                this.f11483 = i4;
                int iMo80882 = AbstractC4556.f11888.mo8088(str, bArr2, i4, i2 - i4);
                this.f11483 = i3;
                m8239((iMo80882 - i3) - iM81942);
                this.f11483 = iMo80882;
            } else {
                int iM8543 = AbstractC4556.m8543(str);
                m8239(iM8543);
                this.f11483 = AbstractC4556.f11888.mo8088(str, bArr2, this.f11483, iM8543);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo8216(int i, String str) throws Exception {
        mo8214(i, 2);
        mo8215(str);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo8217(int i, ByteString byteString) {
        mo8214(1, 3);
        mo8205(2, i);
        mo8225(3, byteString);
        mo8214(1, 4);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo8218(int i, InterfaceC4273 interfaceC4273) {
        mo8214(1, 3);
        mo8205(2, i);
        mo8208(3, interfaceC4273);
        mo8214(1, 4);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8219(InterfaceC4273 interfaceC4273) {
        mo8204(interfaceC4273.getSerializedSize());
        interfaceC4273.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC4371
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8245(int i, byte[] bArr, int i2) throws IOException {
        m8238(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo8221(byte[] bArr, int i) throws IOException {
        mo8204(i);
        m8238(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo8222(int i, boolean z) {
        m8237(11);
        m8240(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f11483;
        this.f11485[i2] = b;
        this.f11483 = i2 + 1;
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo8224(int i, int i2) {
        m8237(14);
        m8240(i, 5);
        m8243(i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo8225(int i, ByteString byteString) {
        mo8214(i, 2);
        mo8226(byteString);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo8226(ByteString byteString) {
        mo8204(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo8227() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo8228(byte b) {
        if (this.f11483 == this.f11484) {
            m8241();
        }
        int i = this.f11483;
        this.f11485[i] = b;
        this.f11483 = i + 1;
    }
}
