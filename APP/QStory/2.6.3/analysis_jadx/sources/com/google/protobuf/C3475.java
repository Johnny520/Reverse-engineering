package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3475 extends AbstractC3474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] f11156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InputStream f11157;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f11158;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f11159;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f11160;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f11161 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f11162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11163;

    public C3475(InputStream inputStream) {
        AbstractC3402.m7505(inputStream, "input");
        this.f11157 = inputStream;
        this.f11156 = new byte[4096];
        this.f11159 = 0;
        this.f11162 = 0;
        this.f11160 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m7728(int i) throws InvalidProtocolBufferException {
        if (m7738(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f11160) - this.f11162) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.sizeLimitExceeded();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m7729(int i) throws InvalidProtocolBufferException {
        int i2 = this.f11159;
        int i3 = this.f11162;
        if (i <= i2 - i3 && i >= 0) {
            this.f11162 = i3 + i;
            return;
        }
        InputStream inputStream = this.f11157;
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.f11160;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f11161;
        if (i6 > i7) {
            m7729((i7 - i4) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11160 = i5;
        int i8 = i2 - i3;
        this.f11159 = 0;
        this.f11162 = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.setThrownFromInputStream();
                    throw e;
                }
            } catch (Throwable th) {
                this.f11160 += i8;
                m7732();
                throw th;
            }
        }
        this.f11160 += i8;
        m7732();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f11159;
        int i10 = i9 - this.f11162;
        this.f11162 = i9;
        m7728(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f11159;
            if (i11 <= i12) {
                this.f11162 = i11;
                return;
            } else {
                i10 += i12;
                this.f11162 = i12;
                m7728(1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long m7730() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f11162;
        int i2 = this.f11159;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f11156;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11162 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (((long) bArr[i8]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i10 = i + 10;
                                                long j8 = (((long) bArr[i4]) << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j3 ^ j7;
                            }
                            j = j2 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f11162 = i4;
                return j;
            }
        }
        return m7733();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long m7731() throws InvalidProtocolBufferException {
        int i = this.f11162;
        if (this.f11159 - i < 8) {
            m7728(8);
            i = this.f11162;
        }
        this.f11162 = i + 8;
        byte[] bArr = this.f11156;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m7732() {
        int i = this.f11159 + this.f11158;
        this.f11159 = i;
        int i2 = this.f11160 + i;
        int i3 = this.f11161;
        if (i2 <= i3) {
            this.f11158 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11158 = i4;
        this.f11159 = i - i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long m7733() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f11162 == this.f11159) {
                m7728(1);
            }
            int i2 = this.f11162;
            this.f11162 = i2 + 1;
            byte b = this.f11156[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final ArrayList m7734(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f11157.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11160 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int m7735() throws InvalidProtocolBufferException {
        int i = this.f11162;
        if (this.f11159 - i < 4) {
            m7728(4);
            i = this.f11162;
        }
        this.f11162 = i + 4;
        byte[] bArr = this.f11156;
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo7697(int i) throws InvalidProtocolBufferException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m7729(8);
                return true;
            }
            if (i2 == 2) {
                m7729(mo7701());
                return true;
            }
            if (i2 == 3) {
                m7696();
                mo7712(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.f11154 == 0) {
                    mo7712(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m7729(4);
            return true;
        }
        int i4 = this.f11159 - this.f11162;
        byte[] bArr = this.f11156;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f11162;
                this.f11162 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        while (i3 < 10) {
            if (this.f11162 == this.f11159) {
                m7728(1);
            }
            int i6 = this.f11162;
            this.f11162 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final byte[] m7736(int i) throws IOException {
        if (i == 0) {
            return AbstractC3402.f11057;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11160;
        int i3 = this.f11162;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i5 = this.f11161;
        if (i4 > i5) {
            m7729((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f11159 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f11157;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11156, this.f11162, bArr, 0, i6);
        this.f11160 += this.f11159;
        this.f11162 = 0;
        this.f11159 = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11160 += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] m7737(int i) throws IOException {
        byte[] bArrM7736 = m7736(i);
        if (bArrM7736 != null) {
            return bArrM7736;
        }
        int i2 = this.f11162;
        int i3 = this.f11159;
        int length = i3 - i2;
        this.f11160 += i3;
        this.f11162 = 0;
        this.f11159 = 0;
        ArrayList<byte[]> arrayListM7734 = m7734(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11156, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM7734) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final int mo7698() {
        return AbstractC3474.m7692(mo7701());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo7699() {
        return m7731();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo7700() {
        return m7735();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo7701() {
        int i;
        int i2 = this.f11162;
        int i3 = this.f11159;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f11156;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11162 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f11162 = i5;
                return i;
            }
        }
        return (int) m7733();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo7703() {
        return m7730();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo7704() {
        return mo7701();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo7705() throws InvalidProtocolBufferException {
        if (mo7725()) {
            this.f11163 = 0;
            return 0;
        }
        int iMo7701 = mo7701();
        this.f11163 = iMo7701;
        if ((iMo7701 >>> 3) != 0) {
            return iMo7701;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final String mo7706() throws IOException {
        int iMo7701 = mo7701();
        int i = this.f11162;
        int i2 = this.f11159;
        int i3 = i2 - i;
        byte[] bArrM7737 = this.f11156;
        if (iMo7701 <= i3 && iMo7701 > 0) {
            this.f11162 = i + iMo7701;
        } else {
            if (iMo7701 == 0) {
                return "";
            }
            if (iMo7701 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i = 0;
            if (iMo7701 <= i2) {
                m7728(iMo7701);
                this.f11162 = iMo7701;
            } else {
                bArrM7737 = m7737(iMo7701);
            }
        }
        if (iMo7701 != 0) {
            return AbstractC3724.f11543.mo7530(i, bArrM7737, iMo7701);
        }
        AbstractC3413 abstractC3413 = AbstractC3724.f11543;
        return "";
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final String mo7707() throws InvalidProtocolBufferException {
        int iMo7701 = mo7701();
        byte[] bArr = this.f11156;
        if (iMo7701 > 0) {
            int i = this.f11159;
            int i2 = this.f11162;
            if (iMo7701 <= i - i2) {
                String str = new String(bArr, i2, iMo7701, AbstractC3402.f11059);
                this.f11162 += iMo7701;
                return str;
            }
        }
        if (iMo7701 == 0) {
            return "";
        }
        if (iMo7701 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (iMo7701 > this.f11159) {
            return new String(m7737(iMo7701), AbstractC3402.f11059);
        }
        m7728(iMo7701);
        String str2 = new String(bArr, this.f11162, iMo7701, AbstractC3402.f11059);
        this.f11162 += iMo7701;
        return str2;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final long mo7708() {
        return AbstractC3474.m7691(m7730());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo7709() {
        return this.f11160 + this.f11162;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo7710() {
        int i = this.f11161;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f11160 + this.f11162);
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7712(int i) throws InvalidProtocolBufferException {
        if (this.f11163 != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7713(int i, InterfaceC3450 interfaceC3450, C3697 c3697) throws InvalidProtocolBufferException {
        m7711();
        this.f11154++;
        interfaceC3450.mergeFrom(this, c3697);
        mo7712((i << 3) | 4);
        this.f11154--;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final float mo7714() {
        return Float.intBitsToFloat(m7735());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC3441 mo7715(InterfaceC3375 interfaceC3375, C3697 c3697) throws InvalidProtocolBufferException {
        int iMo7701 = mo7701();
        m7711();
        int iMo7727 = mo7727(iMo7701);
        this.f11155++;
        InterfaceC3441 interfaceC3441 = (InterfaceC3441) interfaceC3375.mo7345(this, c3697);
        mo7712(0);
        this.f11155--;
        if (mo7710() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        mo7726(iMo7727);
        return interfaceC3441;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo7716(InterfaceC3450 interfaceC3450, C3697 c3697) throws InvalidProtocolBufferException {
        int iMo7701 = mo7701();
        m7711();
        int iMo7727 = mo7727(iMo7701);
        this.f11155++;
        interfaceC3450.mergeFrom(this, c3697);
        mo7712(0);
        this.f11155--;
        if (mo7710() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        mo7726(iMo7727);
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo7717() {
        return mo7701();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo7718() {
        return m7730();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo7719() throws IOException {
        int iMo7701 = mo7701();
        int i = this.f11159;
        int i2 = this.f11162;
        int i3 = i - i2;
        byte[] bArr = this.f11156;
        if (iMo7701 <= i3 && iMo7701 > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i2, iMo7701, false);
            this.f11162 += iMo7701;
            return byteStringCopyFrom;
        }
        if (iMo7701 == 0) {
            return ByteString.EMPTY;
        }
        if (iMo7701 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrM7736 = m7736(iMo7701);
        if (bArrM7736 != null) {
            return ByteString.copyFrom(bArrM7736, 0, bArrM7736.length, false);
        }
        int i4 = this.f11162;
        int i5 = this.f11159;
        int length = i5 - i4;
        this.f11160 += i5;
        this.f11162 = 0;
        this.f11159 = 0;
        ArrayList<byte[]> arrayListM7734 = m7734(iMo7701 - length);
        byte[] bArr2 = new byte[iMo7701];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM7734) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return ByteString.wrap(bArr2);
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo7720() {
        return m7730() != 0;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo7721() {
        return m7735();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo7722() {
        return m7731();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final double mo7723() {
        return Double.longBitsToDouble(m7731());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo7724() {
        return mo7701();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7725() {
        return this.f11162 == this.f11159 && !m7738(1);
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7726(int i) {
        this.f11161 = i;
        m7732();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo7727(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11160 + this.f11162 + i;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i3 = this.f11161;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11161 = i2;
        m7732();
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m7738(int i) throws IOException {
        InputStream inputStream = this.f11157;
        int i2 = this.f11162;
        int i3 = i2 + i;
        int i4 = this.f11159;
        if (i3 <= i4) {
            C5925.m11311(AbstractC0053.m162(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f11160;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f11161) {
            byte[] bArr = this.f11156;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f11160 += i2;
                this.f11159 -= i2;
                this.f11162 = 0;
            }
            int i6 = this.f11159;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f11160) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f11159 += i7;
                    m7732();
                    if (this.f11159 >= i || m7738(i)) {
                        return true;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }
        return false;
    }
}
