package com.google.protobuf;

import bsh.C2633;
import java.io.IOException;
import java.io.OutputStream;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3466 extends AbstractC3462 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final OutputStream f11137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f11138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f11140;

    public C3466(OutputStream outputStream, int i) {
        if (outputStream == null) {
            C2633.m5343("out");
            throw null;
        }
        this.f11137 = outputStream;
        if (i < 0) {
            C5925.m11310("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f11140 = bArr;
        this.f11139 = bArr.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m7678(int i) {
        if (this.f11139 - this.f11138 < i) {
            m7682();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m7679(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f11138;
        int i4 = this.f11139;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f11140;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f11138 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f11138 = i4;
        m7682();
        if (i7 > i4) {
            this.f11137.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f11138 = i7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m7680(int i) {
        boolean z = AbstractC3462.f11129;
        byte[] bArr = this.f11140;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f11138;
                if (i2 == 0) {
                    this.f11138 = i3 + 1;
                    AbstractC3726.m7997(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f11138 = i3 + 1;
                    AbstractC3726.m7997(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f11138;
                if (i4 == 0) {
                    this.f11138 = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f11138 = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m7681(int i, int i2) {
        m7680((i << 3) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m7682() {
        this.f11137.write(this.f11140, 0, this.f11138);
        this.f11138 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m7683(long j) {
        boolean z = AbstractC3462.f11129;
        byte[] bArr = this.f11140;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f11138;
                if (j2 == 0) {
                    this.f11138 = i + 1;
                    AbstractC3726.m7997(bArr, i, (byte) j);
                    return;
                } else {
                    this.f11138 = i + 1;
                    AbstractC3726.m7997(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f11138;
                if (j3 == 0) {
                    this.f11138 = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f11138 = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m7684(int i) {
        int i2 = this.f11138;
        byte[] bArr = this.f11140;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f11138 = i2 + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m7685(long j) {
        int i = this.f11138;
        byte[] bArr = this.f11140;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f11138 = i + 8;
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo7645(int i) {
        m7678(5);
        m7680(i);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo7646(int i, int i2) {
        m7678(20);
        m7681(i, 0);
        m7680(i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo7647(long j) {
        m7678(10);
        m7683(j);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo7648(int i, long j) {
        m7678(20);
        m7681(i, 0);
        m7683(j);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7649(int i, InterfaceC3441 interfaceC3441) {
        mo7655(i, 2);
        mo7660(interfaceC3441);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo7650(int i) {
        if (i >= 0) {
            mo7645(i);
        } else {
            mo7647(i);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo7651(int i, int i2) {
        m7678(20);
        m7681(i, 0);
        if (i2 >= 0) {
            m7680(i2);
        } else {
            m7683(i2);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7652(long j) {
        m7678(8);
        m7685(j);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7653(int i, long j) {
        m7678(18);
        m7681(i, 1);
        m7685(j);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo7654(int i) {
        m7678(4);
        m7684(i);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo7655(int i, int i2) {
        mo7645((i << 3) | i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo7656(String str) throws Exception {
        int length = str.length() * 3;
        int iM7635 = AbstractC3462.m7635(length);
        int i = iM7635 + length;
        int i2 = this.f11139;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iMo7529 = AbstractC3724.f11543.mo7529(str, bArr, 0, length);
            mo7645(iMo7529);
            m7679(bArr, 0, iMo7529);
            return;
        }
        if (i > i2 - this.f11138) {
            m7682();
        }
        int iM76352 = AbstractC3462.m7635(str.length());
        int i3 = this.f11138;
        byte[] bArr2 = this.f11140;
        try {
            if (iM76352 == iM7635) {
                int i4 = i3 + iM76352;
                this.f11138 = i4;
                int iMo75292 = AbstractC3724.f11543.mo7529(str, bArr2, i4, i2 - i4);
                this.f11138 = i3;
                m7680((iMo75292 - i3) - iM76352);
                this.f11138 = iMo75292;
            } else {
                int iM7984 = AbstractC3724.m7984(str);
                m7680(iM7984);
                this.f11138 = AbstractC3724.f11543.mo7529(str, bArr2, this.f11138, iM7984);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7657(int i, String str) throws Exception {
        mo7655(i, 2);
        mo7656(str);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo7658(int i, ByteString byteString) {
        mo7655(1, 3);
        mo7646(2, i);
        mo7666(3, byteString);
        mo7655(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo7659(int i, InterfaceC3441 interfaceC3441) {
        mo7655(1, 3);
        mo7646(2, i);
        mo7649(3, interfaceC3441);
        mo7655(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7660(InterfaceC3441 interfaceC3441) {
        mo7645(interfaceC3441.getSerializedSize());
        interfaceC3441.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3539
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7686(int i, byte[] bArr, int i2) throws IOException {
        m7679(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7662(byte[] bArr, int i) throws IOException {
        mo7645(i);
        m7679(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7663(int i, boolean z) {
        m7678(11);
        m7681(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f11138;
        this.f11140[i2] = b;
        this.f11138 = i2 + 1;
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo7665(int i, int i2) {
        m7678(14);
        m7681(i, 5);
        m7684(i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo7666(int i, ByteString byteString) {
        mo7655(i, 2);
        mo7667(byteString);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo7667(ByteString byteString) {
        mo7645(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo7668() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7669(byte b) {
        if (this.f11138 == this.f11139) {
            m7682();
        }
        int i = this.f11138;
        this.f11140[i] = b;
        this.f11138 = i + 1;
    }
}
