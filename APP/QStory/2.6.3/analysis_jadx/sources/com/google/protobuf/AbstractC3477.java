package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3477 extends AbstractC3474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f11165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f11166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f11167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f11168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f11169 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f11170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11171;

    public AbstractC3477(byte[] bArr, int i, int i2, boolean z) {
        this.f11166 = bArr;
        this.f11165 = i2 + i;
        this.f11167 = i;
        this.f11170 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final long m7741() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f11167;
        int i2 = this.f11165;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f11166;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11167 = i3;
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
                this.f11167 = i4;
                return j;
            }
        }
        return m7742();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long m7742() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f11167;
            if (i2 == this.f11165) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f11167 = i2 + 1;
            byte b = this.f11166[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int m7743() throws InvalidProtocolBufferException {
        try {
            int iM7745 = m7745();
            if (this.f11167 <= this.f11165) {
                return iM7745;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        } catch (InvalidProtocolBufferException e) {
            if (this.f11167 > this.f11165) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public abstract int mo7739();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int m7744() {
        int i;
        int i2 = this.f11167;
        int i3 = this.f11165;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f11166;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11167 = i4;
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
                this.f11167 = i5;
                return i;
            }
        }
        return (int) m7742();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[PHI: r3
  0x0069: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v12 int) binds: [B:16:0x0041, B:20:0x004d, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7745() throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r7 = this;
            int r0 = r7.f11167
            int r1 = r0 + 1
            byte[] r2 = r7.f11166
            r3 = r2[r0]
            if (r3 < 0) goto Lc
            goto L6f
        Lc:
            int r4 = r0 + 2
            r1 = r2[r1]
            int r1 = r1 << 7
            r1 = r1 ^ r3
            if (r1 >= 0) goto L19
            r3 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
        L17:
            r1 = r4
            goto L6f
        L19:
            int r3 = r0 + 3
            r4 = r2[r4]
            int r4 = r4 << 14
            r1 = r1 ^ r4
            if (r1 < 0) goto L27
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r3
            r3 = r0
            goto L6f
        L27:
            int r4 = r0 + 4
            r3 = r2[r3]
            int r3 = r3 << 21
            r1 = r1 ^ r3
            if (r1 >= 0) goto L36
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r1 ^ r0
            goto L17
        L36:
            int r3 = r0 + 5
            r4 = r2[r4]
            int r5 = r4 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r4 >= 0) goto L69
            int r4 = r0 + 6
            r3 = r2[r3]
            if (r3 >= 0) goto L6d
            int r3 = r0 + 7
            r4 = r2[r4]
            if (r4 >= 0) goto L69
            int r4 = r0 + 8
            r3 = r2[r3]
            if (r3 >= 0) goto L6d
            int r3 = r0 + 9
            r4 = r2[r4]
            if (r4 >= 0) goto L69
            int r0 = r0 + 10
            r2 = r2[r3]
            if (r2 < 0) goto L64
            r3 = r1
            r1 = r0
            goto L6f
        L64:
            com.google.protobuf.InvalidProtocolBufferException r7 = com.google.protobuf.InvalidProtocolBufferException.malformedVarint()
            throw r7
        L69:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L6f
        L6d:
            r3 = r1
            goto L17
        L6f:
            r7.f11167 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3477.m7745():int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long m7746() throws InvalidProtocolBufferException {
        int i = this.f11167;
        if (this.f11165 - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11167 = i + 8;
        byte[] bArr = this.f11166;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public abstract int mo7740();

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo7697(int i) throws InvalidProtocolBufferException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m7749(8);
                return true;
            }
            if (i2 == 2) {
                m7749(mo7739());
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
            m7749(4);
            return true;
        }
        int i4 = this.f11165 - this.f11167;
        byte[] bArr = this.f11166;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f11167;
                this.f11167 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        while (i3 < 10) {
            int i6 = this.f11167;
            if (i6 == this.f11165) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f11167 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int m7747() throws InvalidProtocolBufferException {
        int i = this.f11167;
        if (this.f11165 - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11167 = i + 4;
        byte[] bArr = this.f11166;
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] m7748(int i) throws InvalidProtocolBufferException {
        if (i > 0) {
            int i2 = this.f11165;
            int i3 = this.f11167;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f11167 = i4;
                return Arrays.copyOfRange(this.f11166, i3, i4);
            }
        }
        if (i > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i == 0) {
            return AbstractC3402.f11057;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final int mo7698() {
        return AbstractC3474.m7692(mo7739());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo7699() {
        return m7746();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo7700() {
        return m7747();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo7701() {
        return mo7740();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo7703() {
        return m7741();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo7704() {
        return mo7739();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo7705() throws InvalidProtocolBufferException {
        if (mo7725()) {
            this.f11171 = 0;
            return 0;
        }
        int iMo7739 = mo7739();
        this.f11171 = iMo7739;
        if ((iMo7739 >>> 3) != 0) {
            return iMo7739;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final String mo7706() throws InvalidProtocolBufferException {
        int iMo7739 = mo7739();
        String strMo7530 = "";
        if (iMo7739 > 0) {
            int i = this.f11165;
            int i2 = this.f11167;
            if (iMo7739 <= i - i2) {
                if (iMo7739 == 0) {
                    AbstractC3413 abstractC3413 = AbstractC3724.f11543;
                } else {
                    strMo7530 = AbstractC3724.f11543.mo7530(i2, this.f11166, iMo7739);
                }
                this.f11167 += iMo7739;
                return strMo7530;
            }
        }
        if (iMo7739 == 0) {
            return "";
        }
        if (iMo7739 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final String mo7707() throws InvalidProtocolBufferException {
        int iMo7739 = mo7739();
        if (iMo7739 > 0) {
            int i = this.f11165;
            int i2 = this.f11167;
            if (iMo7739 <= i - i2) {
                String str = new String(this.f11166, i2, iMo7739, AbstractC3402.f11059);
                this.f11167 += iMo7739;
                return str;
            }
        }
        if (iMo7739 == 0) {
            return "";
        }
        if (iMo7739 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final long mo7708() {
        return AbstractC3474.m7691(m7741());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo7709() {
        return this.f11167 - this.f11170;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo7710() {
        int i = this.f11169;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo7709();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7712(int i) throws InvalidProtocolBufferException {
        if (this.f11171 != i) {
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
        return Float.intBitsToFloat(m7747());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC3441 mo7715(InterfaceC3375 interfaceC3375, C3697 c3697) throws InvalidProtocolBufferException {
        int iMo7739 = mo7739();
        m7711();
        int iMo7727 = mo7727(iMo7739);
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
        int iMo7739 = mo7739();
        m7711();
        int iMo7727 = mo7727(iMo7739);
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
        return mo7740();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo7718() {
        return m7741();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo7719() throws InvalidProtocolBufferException {
        int iMo7739 = mo7739();
        if (iMo7739 > 0) {
            int i = this.f11165;
            int i2 = this.f11167;
            if (iMo7739 <= i - i2) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.f11166, i2, iMo7739, false);
                this.f11167 += iMo7739;
                return byteStringCopyFrom;
            }
        }
        return iMo7739 == 0 ? ByteString.EMPTY : ByteString.wrap(m7748(iMo7739), false);
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo7720() {
        return m7741() != 0;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo7721() {
        return m7747();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo7722() {
        return m7746();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final double mo7723() {
        return Double.longBitsToDouble(m7746());
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo7724() {
        return mo7740();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7725() {
        return this.f11167 == this.f11165;
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7726(int i) {
        this.f11169 = i;
        m7750();
    }

    @Override // com.google.protobuf.AbstractC3474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo7727(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int iMo7709 = mo7709() + i;
        if (iMo7709 < 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i2 = this.f11169;
        if (iMo7709 > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11169 = iMo7709;
        m7750();
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m7749(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.f11165;
            int i3 = this.f11167;
            if (i <= i2 - i3) {
                this.f11167 = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m7750() {
        int i = this.f11165 + this.f11168;
        this.f11165 = i;
        int i2 = i - this.f11170;
        int i3 = this.f11169;
        if (i2 <= i3) {
            this.f11168 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11168 = i4;
        this.f11165 = i - i4;
    }
}
