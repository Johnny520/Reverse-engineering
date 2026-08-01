package com.google.protobuf;

import java.util.Locale;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4299 extends AbstractC4294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f11486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f11488;

    public C4299(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            C6755.m11869(AbstractC7012.m12150(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.f11488 = bArr;
        this.f11486 = 0;
        this.f11487 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m8246(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f11488, this.f11486, i2);
            this.f11486 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(this.f11486, this.f11487, i2, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo8204(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2;
        int i3 = this.f11486;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f11488;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f11486 = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i2, this.f11487, 1, (Throwable) e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(i2, this.f11487, 1, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo8205(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 0);
        mo8204(i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo8206(long j) throws CodedOutputStream$OutOfSpaceException {
        int i;
        int i2 = this.f11486;
        boolean z = AbstractC4294.f11474;
        byte[] bArr = this.f11488;
        if (!z || mo8227() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i, this.f11487, 1, (Throwable) e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                AbstractC4558.m8556(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC4558.m8556(bArr, i2, (byte) j);
        }
        this.f11486 = i;
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo8207(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 0);
        mo8206(j);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo8208(int i, InterfaceC4273 interfaceC4273) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 2);
        mo8219(interfaceC4273);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo8209(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            mo8204(i);
        } else {
            mo8206(i);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8210(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 0);
        mo8209(i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo8211(long j) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11486;
        try {
            byte[] bArr = this.f11488;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f11486 = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i, this.f11487, 8, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo8212(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 1);
        mo8211(j);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo8213(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2 = this.f11486;
        try {
            byte[] bArr = this.f11488;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f11486 = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i2, this.f11487, 4, (Throwable) e);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo8214(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo8204((i << 3) | i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo8215(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11486;
        try {
            int iM8194 = AbstractC4294.m8194(str.length() * 3);
            int iM81942 = AbstractC4294.m8194(str.length());
            byte[] bArr = this.f11488;
            if (iM81942 != iM8194) {
                mo8204(AbstractC4556.m8543(str));
                int i2 = this.f11486;
                this.f11486 = AbstractC4556.f11888.mo8088(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + iM81942;
            this.f11486 = i3;
            int iMo8088 = AbstractC4556.f11888.mo8088(str, bArr, i3, bArr.length - i3);
            this.f11486 = i;
            mo8204((iMo8088 - i) - iM81942);
            this.f11486 = iMo8088;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo8216(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 2);
        mo8215(str);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo8217(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo8214(1, 3);
        mo8205(2, i);
        mo8225(3, byteString);
        mo8214(1, 4);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo8218(int i, InterfaceC4273 interfaceC4273) throws CodedOutputStream$OutOfSpaceException {
        mo8214(1, 3);
        mo8205(2, i);
        mo8208(3, interfaceC4273);
        mo8214(1, 4);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8219(InterfaceC4273 interfaceC4273) throws CodedOutputStream$OutOfSpaceException {
        mo8204(interfaceC4273.getSerializedSize());
        interfaceC4273.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC4371
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8245(int i, byte[] bArr, int i2) throws CodedOutputStream$OutOfSpaceException {
        m8246(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo8221(byte[] bArr, int i) throws CodedOutputStream$OutOfSpaceException {
        mo8204(i);
        m8246(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo8222(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 0);
        mo8228(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo8224(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 5);
        mo8213(i2);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo8225(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo8214(i, 2);
        mo8226(byteString);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo8226(ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo8204(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo8227() {
        return this.f11487 - this.f11486;
    }

    @Override // com.google.protobuf.AbstractC4294
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo8228(byte b) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f11486;
        try {
            int i2 = i + 1;
            try {
                this.f11488[i] = b;
                this.f11486 = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new CodedOutputStream$OutOfSpaceException(i, this.f11487, 1, (Throwable) e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }
}
