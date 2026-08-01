package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3476 extends AbstractC3473 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f11160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f11161;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f11162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f11163;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f11164 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f11165;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11166;

    public AbstractC3476(byte[] bArr, int i, int i2, boolean z) {
        this.f11161 = bArr;
        this.f11160 = i2 + i;
        this.f11162 = i;
        this.f11165 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final long m7754() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f11162;
        int i2 = this.f11160;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f11161;
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
        return m7755();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long m7755() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f11162;
            if (i2 == this.f11160) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f11162 = i2 + 1;
            byte b = this.f11161[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int m7756() throws InvalidProtocolBufferException {
        try {
            int iM7758 = m7758();
            if (this.f11162 <= this.f11160) {
                return iM7758;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        } catch (InvalidProtocolBufferException e) {
            if (this.f11162 > this.f11160) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public abstract int mo7752();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int m7757() {
        int i;
        int i2 = this.f11162;
        int i3 = this.f11160;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f11161;
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
        return (int) m7755();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[PHI: r3
  0x0069: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v12 int) binds: [B:16:0x0041, B:20:0x004d, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7758() throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r7 = this;
            int r0 = r7.f11162
            int r1 = r0 + 1
            byte[] r2 = r7.f11161
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
            r7.f11162 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3476.m7758():int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long m7759() throws InvalidProtocolBufferException {
        int i = this.f11162;
        if (this.f11160 - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11162 = i + 8;
        byte[] bArr = this.f11161;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public abstract int mo7753();

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo7710(int i) throws InvalidProtocolBufferException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m7762(8);
                return true;
            }
            if (i2 == 2) {
                m7762(mo7752());
                return true;
            }
            if (i2 == 3) {
                m7709();
                mo7725(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.f11149 == 0) {
                    mo7725(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m7762(4);
            return true;
        }
        int i4 = this.f11160 - this.f11162;
        byte[] bArr = this.f11161;
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
            int i6 = this.f11162;
            if (i6 == this.f11160) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f11162 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int m7760() throws InvalidProtocolBufferException {
        int i = this.f11162;
        if (this.f11160 - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11162 = i + 4;
        byte[] bArr = this.f11161;
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] m7761(int i) throws InvalidProtocolBufferException {
        if (i > 0) {
            int i2 = this.f11160;
            int i3 = this.f11162;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f11162 = i4;
                return Arrays.copyOfRange(this.f11161, i3, i4);
            }
        }
        if (i > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i == 0) {
            return AbstractC3401.f11052;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final int mo7711() {
        return AbstractC3473.m7705(mo7752());
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo7712() {
        return m7759();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo7713() {
        return m7760();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo7714() {
        return mo7753();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo7716() {
        return m7754();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo7717() {
        return mo7752();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo7718() throws InvalidProtocolBufferException {
        if (mo7738()) {
            this.f11166 = 0;
            return 0;
        }
        int iMo7752 = mo7752();
        this.f11166 = iMo7752;
        if ((iMo7752 >>> 3) != 0) {
            return iMo7752;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final String mo7719() throws InvalidProtocolBufferException {
        int iMo7752 = mo7752();
        String strMo7543 = "";
        if (iMo7752 > 0) {
            int i = this.f11160;
            int i2 = this.f11162;
            if (iMo7752 <= i - i2) {
                if (iMo7752 == 0) {
                    AbstractC3412 abstractC3412 = AbstractC3723.f11538;
                } else {
                    strMo7543 = AbstractC3723.f11538.mo7543(i2, this.f11161, iMo7752);
                }
                this.f11162 += iMo7752;
                return strMo7543;
            }
        }
        if (iMo7752 == 0) {
            return "";
        }
        if (iMo7752 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final String mo7720() throws InvalidProtocolBufferException {
        int iMo7752 = mo7752();
        if (iMo7752 > 0) {
            int i = this.f11160;
            int i2 = this.f11162;
            if (iMo7752 <= i - i2) {
                String str = new String(this.f11161, i2, iMo7752, AbstractC3401.f11054);
                this.f11162 += iMo7752;
                return str;
            }
        }
        if (iMo7752 == 0) {
            return "";
        }
        if (iMo7752 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final long mo7721() {
        return AbstractC3473.m7704(m7754());
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo7722() {
        return this.f11162 - this.f11165;
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo7723() {
        int i = this.f11164;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo7722();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7725(int i) throws InvalidProtocolBufferException {
        if (this.f11166 != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7726(int i, InterfaceC3449 interfaceC3449, C3696 c3696) throws InvalidProtocolBufferException {
        m7724();
        this.f11149++;
        interfaceC3449.mergeFrom(this, c3696);
        mo7725((i << 3) | 4);
        this.f11149--;
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final float mo7727() {
        return Float.intBitsToFloat(m7760());
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC3440 mo7728(InterfaceC3374 interfaceC3374, C3696 c3696) throws InvalidProtocolBufferException {
        int iMo7752 = mo7752();
        m7724();
        int iMo7740 = mo7740(iMo7752);
        this.f11150++;
        InterfaceC3440 interfaceC3440 = (InterfaceC3440) interfaceC3374.mo7358(this, c3696);
        mo7725(0);
        this.f11150--;
        if (mo7723() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        mo7739(iMo7740);
        return interfaceC3440;
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo7729(InterfaceC3449 interfaceC3449, C3696 c3696) throws InvalidProtocolBufferException {
        int iMo7752 = mo7752();
        m7724();
        int iMo7740 = mo7740(iMo7752);
        this.f11150++;
        interfaceC3449.mergeFrom(this, c3696);
        mo7725(0);
        this.f11150--;
        if (mo7723() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        mo7739(iMo7740);
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo7730() {
        return mo7753();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo7731() {
        return m7754();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo7732() throws InvalidProtocolBufferException {
        int iMo7752 = mo7752();
        if (iMo7752 > 0) {
            int i = this.f11160;
            int i2 = this.f11162;
            if (iMo7752 <= i - i2) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.f11161, i2, iMo7752, false);
                this.f11162 += iMo7752;
                return byteStringCopyFrom;
            }
        }
        return iMo7752 == 0 ? ByteString.EMPTY : ByteString.wrap(m7761(iMo7752), false);
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo7733() {
        return m7754() != 0;
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo7734() {
        return m7760();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo7735() {
        return m7759();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final double mo7736() {
        return Double.longBitsToDouble(m7759());
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo7737() {
        return mo7753();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7738() {
        return this.f11162 == this.f11160;
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7739(int i) {
        this.f11164 = i;
        m7763();
    }

    @Override // com.google.protobuf.AbstractC3473
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo7740(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int iMo7722 = mo7722() + i;
        if (iMo7722 < 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i2 = this.f11164;
        if (iMo7722 > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11164 = iMo7722;
        m7763();
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m7762(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.f11160;
            int i3 = this.f11162;
            if (i <= i2 - i3) {
                this.f11162 = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m7763() {
        int i = this.f11160 + this.f11163;
        this.f11160 = i;
        int i2 = i - this.f11165;
        int i3 = this.f11164;
        if (i2 <= i3) {
            this.f11163 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11163 = i4;
        this.f11160 = i - i4;
    }
}
