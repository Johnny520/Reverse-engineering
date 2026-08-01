package com.google.protobuf;

import java.util.Locale;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3467 extends AbstractC3462 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f11141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f11143;

    public C3467(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            C5925.m11310(AbstractC6183.m11591(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.f11143 = bArr;
        this.f11141 = 0;
        this.f11142 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m7687(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f11143, this.f11141, i2);
            this.f11141 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(this.f11141, this.f11142, i2, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo7645(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2;
        int i3 = this.f11141;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f11143;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f11141 = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i2, this.f11142, 1, (Throwable) e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(i2, this.f11142, 1, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo7646(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 0);
        mo7645(i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo7647(long j) throws CodedOutputStream$OutOfSpaceException {
        int i;
        int i2 = this.f11141;
        boolean z = AbstractC3462.f11129;
        byte[] bArr = this.f11143;
        if (!z || mo7668() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i, this.f11142, 1, (Throwable) e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                AbstractC3726.m7997(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC3726.m7997(bArr, i2, (byte) j);
        }
        this.f11141 = i;
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo7648(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 0);
        mo7647(j);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7649(int i, InterfaceC3441 interfaceC3441) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 2);
        mo7660(interfaceC3441);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo7650(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            mo7645(i);
        } else {
            mo7647(i);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo7651(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 0);
        mo7650(i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7652(long j) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11141;
        try {
            byte[] bArr = this.f11143;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f11141 = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i, this.f11142, 8, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7653(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 1);
        mo7652(j);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo7654(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2 = this.f11141;
        try {
            byte[] bArr = this.f11143;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f11141 = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i2, this.f11142, 4, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo7655(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7645((i << 3) | i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo7656(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11141;
        try {
            int iM7635 = AbstractC3462.m7635(str.length() * 3);
            int iM76352 = AbstractC3462.m7635(str.length());
            byte[] bArr = this.f11143;
            if (iM76352 != iM7635) {
                mo7645(AbstractC3724.m7984(str));
                int i2 = this.f11141;
                this.f11141 = AbstractC3724.f11543.mo7529(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + iM76352;
            this.f11141 = i3;
            int iMo7529 = AbstractC3724.f11543.mo7529(str, bArr, i3, bArr.length - i3);
            this.f11141 = i;
            mo7645((iMo7529 - i) - iM76352);
            this.f11141 = iMo7529;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7657(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 2);
        mo7656(str);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo7658(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo7655(1, 3);
        mo7646(2, i);
        mo7666(3, byteString);
        mo7655(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo7659(int i, InterfaceC3441 interfaceC3441) throws CodedOutputStream$OutOfSpaceException {
        mo7655(1, 3);
        mo7646(2, i);
        mo7649(3, interfaceC3441);
        mo7655(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7660(InterfaceC3441 interfaceC3441) throws CodedOutputStream$OutOfSpaceException {
        mo7645(interfaceC3441.getSerializedSize());
        interfaceC3441.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3539
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7686(int i, byte[] bArr, int i2) throws CodedOutputStream$OutOfSpaceException {
        m7687(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7662(byte[] bArr, int i) throws CodedOutputStream$OutOfSpaceException {
        mo7645(i);
        m7687(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7663(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 0);
        mo7669(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo7665(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 5);
        mo7654(i2);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo7666(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo7655(i, 2);
        mo7667(byteString);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo7667(ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo7645(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo7668() {
        return this.f11142 - this.f11141;
    }

    @Override // com.google.protobuf.AbstractC3462
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7669(byte b) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11141;
        try {
            int i2 = i + 1;
            try {
                this.f11143[i] = b;
                this.f11141 = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new CodedOutputStream$OutOfSpaceException(i, this.f11142, 1, (Throwable) e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }
}
