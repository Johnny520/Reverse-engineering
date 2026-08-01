package com.google.protobuf;

import java.util.Locale;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3466 extends AbstractC3461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f11136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f11138;

    public C3466(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            C5919.m11249(AbstractC6136.m11559(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.f11138 = bArr;
        this.f11136 = 0;
        this.f11137 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m7700(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f11138, this.f11136, i2);
            this.f11136 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(this.f11136, this.f11137, i2, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo7658(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2;
        int i3 = this.f11136;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f11138;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f11136 = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i2, this.f11137, 1, (Throwable) e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(i2, this.f11137, 1, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo7659(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 0);
        mo7658(i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo7660(long j) throws CodedOutputStream$OutOfSpaceException {
        int i;
        int i2 = this.f11136;
        boolean z = AbstractC3461.f11124;
        byte[] bArr = this.f11138;
        if (!z || mo7681() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i, this.f11137, 1, (Throwable) e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                AbstractC3725.m8010(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC3725.m8010(bArr, i2, (byte) j);
        }
        this.f11136 = i;
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo7661(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 0);
        mo7660(j);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7662(int i, InterfaceC3440 interfaceC3440) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 2);
        mo7673(interfaceC3440);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo7663(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            mo7658(i);
        } else {
            mo7660(i);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo7664(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 0);
        mo7663(i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7665(long j) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11136;
        try {
            byte[] bArr = this.f11138;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f11136 = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i, this.f11137, 8, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7666(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 1);
        mo7665(j);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo7667(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2 = this.f11136;
        try {
            byte[] bArr = this.f11138;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f11136 = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i2, this.f11137, 4, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo7668(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7658((i << 3) | i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo7669(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11136;
        try {
            int iM7648 = AbstractC3461.m7648(str.length() * 3);
            int iM76482 = AbstractC3461.m7648(str.length());
            byte[] bArr = this.f11138;
            if (iM76482 != iM7648) {
                mo7658(AbstractC3723.m7997(str));
                int i2 = this.f11136;
                this.f11136 = AbstractC3723.f11538.mo7542(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + iM76482;
            this.f11136 = i3;
            int iMo7542 = AbstractC3723.f11538.mo7542(str, bArr, i3, bArr.length - i3);
            this.f11136 = i;
            mo7658((iMo7542 - i) - iM76482);
            this.f11136 = iMo7542;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7670(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 2);
        mo7669(str);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo7671(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo7668(1, 3);
        mo7659(2, i);
        mo7679(3, byteString);
        mo7668(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo7672(int i, InterfaceC3440 interfaceC3440) throws CodedOutputStream$OutOfSpaceException {
        mo7668(1, 3);
        mo7659(2, i);
        mo7662(3, interfaceC3440);
        mo7668(1, 4);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7673(InterfaceC3440 interfaceC3440) throws CodedOutputStream$OutOfSpaceException {
        mo7658(interfaceC3440.getSerializedSize());
        interfaceC3440.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3538
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7699(int i, byte[] bArr, int i2) throws CodedOutputStream$OutOfSpaceException {
        m7700(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7675(byte[] bArr, int i) throws CodedOutputStream$OutOfSpaceException {
        mo7658(i);
        m7700(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7676(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 0);
        mo7682(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo7678(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 5);
        mo7667(i2);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo7679(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo7668(i, 2);
        mo7680(byteString);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo7680(ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo7658(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo7681() {
        return this.f11137 - this.f11136;
    }

    @Override // com.google.protobuf.AbstractC3461
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7682(byte b) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11136;
        try {
            int i2 = i + 1;
            try {
                this.f11138[i] = b;
                this.f11136 = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new CodedOutputStream$OutOfSpaceException(i, this.f11137, 1, (Throwable) e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }
}
