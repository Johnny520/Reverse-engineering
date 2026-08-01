package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4309 extends AbstractC4306 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f11510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f11511;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f11512;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f11513;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f11514 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f11515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11516;

    public AbstractC4309(byte[] bArr, int i, int i2, boolean z) {
        this.f11511 = bArr;
        this.f11510 = i2 + i;
        this.f11512 = i;
        this.f11515 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final long m8300() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f11512;
        int i2 = this.f11510;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f11511;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11512 = i3;
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
                this.f11512 = i4;
                return j;
            }
        }
        return m8301();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long m8301() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f11512;
            if (i2 == this.f11510) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f11512 = i2 + 1;
            byte b = this.f11511[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int m8302() throws InvalidProtocolBufferException {
        try {
            int iM8304 = m8304();
            if (this.f11512 <= this.f11510) {
                return iM8304;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        } catch (InvalidProtocolBufferException e) {
            if (this.f11512 > this.f11510) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public abstract int mo8298();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int m8303() {
        int i;
        int i2 = this.f11512;
        int i3 = this.f11510;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f11511;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11512 = i4;
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
                this.f11512 = i5;
                return i;
            }
        }
        return (int) m8301();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[PHI: r3
  0x0069: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v12 int) binds: [B:16:0x0041, B:20:0x004d, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m8304() throws InvalidProtocolBufferException {
        int i = this.f11512;
        int i2 = i + 1;
        byte[] bArr = this.f11511;
        int i3 = bArr[i];
        if (i3 < 0) {
            int i4 = i + 2;
            int i5 = (bArr[i2] << 7) ^ i3;
            if (i5 < 0) {
                i3 = i5 ^ (-128);
            } else {
                int i6 = i + 3;
                int i7 = i5 ^ (bArr[i4] << 14);
                if (i7 >= 0) {
                    int i8 = i7 ^ 16256;
                    i2 = i6;
                    i3 = i8;
                } else {
                    i4 = i + 4;
                    int i9 = i7 ^ (bArr[i6] << 21);
                    if (i9 < 0) {
                        i3 = i9 ^ (-2080896);
                    } else {
                        int i10 = i + 5;
                        int i11 = bArr[i4];
                        int i12 = (i9 ^ (i11 << 28)) ^ 266354560;
                        if (i11 < 0) {
                            i4 = i + 6;
                            if (bArr[i10] < 0) {
                                i10 = i + 7;
                                if (bArr[i4] < 0) {
                                    i4 = i + 8;
                                    if (bArr[i10] < 0) {
                                        i10 = i + 9;
                                        if (bArr[i4] < 0) {
                                            int i13 = i + 10;
                                            if (bArr[i10] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i3 = i12;
                                            i2 = i13;
                                        } else {
                                            int i14 = i10;
                                            i3 = i12;
                                            i2 = i14;
                                        }
                                    }
                                }
                            }
                            i3 = i12;
                        }
                    }
                }
            }
            i2 = i4;
        }
        this.f11512 = i2;
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long m8305() throws InvalidProtocolBufferException {
        int i = this.f11512;
        if (this.f11510 - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11512 = i + 8;
        byte[] bArr = this.f11511;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public abstract int mo8299();

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo8256(int i) throws InvalidProtocolBufferException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m8308(8);
                return true;
            }
            if (i2 == 2) {
                m8308(mo8298());
                return true;
            }
            if (i2 == 3) {
                m8255();
                mo8271(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.f11499 == 0) {
                    mo8271(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m8308(4);
            return true;
        }
        int i4 = this.f11510 - this.f11512;
        byte[] bArr = this.f11511;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f11512;
                this.f11512 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        while (i3 < 10) {
            int i6 = this.f11512;
            if (i6 == this.f11510) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f11512 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int m8306() throws InvalidProtocolBufferException {
        int i = this.f11512;
        if (this.f11510 - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11512 = i + 4;
        byte[] bArr = this.f11511;
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] m8307(int i) throws InvalidProtocolBufferException {
        if (i > 0) {
            int i2 = this.f11510;
            int i3 = this.f11512;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f11512 = i4;
                return Arrays.copyOfRange(this.f11511, i3, i4);
            }
        }
        if (i > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i == 0) {
            return AbstractC4234.f11402;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final int mo8257() {
        return AbstractC4306.m8251(mo8298());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo8258() {
        return m8305();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo8259() {
        return m8306();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo8260() {
        return mo8299();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo8262() {
        return m8300();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo8263() {
        return mo8298();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo8264() throws InvalidProtocolBufferException {
        if (mo8284()) {
            this.f11516 = 0;
            return 0;
        }
        int iMo8298 = mo8298();
        this.f11516 = iMo8298;
        if ((iMo8298 >>> 3) != 0) {
            return iMo8298;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final String mo8265() throws InvalidProtocolBufferException {
        int iMo8298 = mo8298();
        String strMo8089 = "";
        if (iMo8298 > 0) {
            int i = this.f11510;
            int i2 = this.f11512;
            if (iMo8298 <= i - i2) {
                if (iMo8298 == 0) {
                    AbstractC4245 abstractC4245 = AbstractC4556.f11888;
                } else {
                    strMo8089 = AbstractC4556.f11888.mo8089(i2, this.f11511, iMo8298);
                }
                this.f11512 += iMo8298;
                return strMo8089;
            }
        }
        if (iMo8298 == 0) {
            return "";
        }
        if (iMo8298 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final String mo8266() throws InvalidProtocolBufferException {
        int iMo8298 = mo8298();
        if (iMo8298 > 0) {
            int i = this.f11510;
            int i2 = this.f11512;
            if (iMo8298 <= i - i2) {
                String str = new String(this.f11511, i2, iMo8298, AbstractC4234.f11404);
                this.f11512 += iMo8298;
                return str;
            }
        }
        if (iMo8298 == 0) {
            return "";
        }
        if (iMo8298 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final long mo8267() {
        return AbstractC4306.m8250(m8300());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo8268() {
        return this.f11512 - this.f11515;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo8269() {
        int i = this.f11514;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo8268();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8271(int i) throws InvalidProtocolBufferException {
        if (this.f11516 != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo8272(int i, InterfaceC4282 interfaceC4282, C4529 c4529) throws InvalidProtocolBufferException {
        m8270();
        this.f11499++;
        interfaceC4282.mergeFrom(this, c4529);
        mo8271((i << 3) | 4);
        this.f11499--;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final float mo8273() {
        return Float.intBitsToFloat(m8306());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC4273 mo8274(InterfaceC4207 interfaceC4207, C4529 c4529) throws InvalidProtocolBufferException {
        int iMo8298 = mo8298();
        m8270();
        int iMo8286 = mo8286(iMo8298);
        this.f11500++;
        InterfaceC4273 interfaceC4273 = (InterfaceC4273) interfaceC4207.mo7904(this, c4529);
        mo8271(0);
        this.f11500--;
        if (mo8269() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        mo8285(iMo8286);
        return interfaceC4273;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo8275(InterfaceC4282 interfaceC4282, C4529 c4529) throws InvalidProtocolBufferException {
        int iMo8298 = mo8298();
        m8270();
        int iMo8286 = mo8286(iMo8298);
        this.f11500++;
        interfaceC4282.mergeFrom(this, c4529);
        mo8271(0);
        this.f11500--;
        if (mo8269() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        mo8285(iMo8286);
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo8276() {
        return mo8299();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo8277() {
        return m8300();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo8278() throws InvalidProtocolBufferException {
        int iMo8298 = mo8298();
        if (iMo8298 > 0) {
            int i = this.f11510;
            int i2 = this.f11512;
            if (iMo8298 <= i - i2) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.f11511, i2, iMo8298, false);
                this.f11512 += iMo8298;
                return byteStringCopyFrom;
            }
        }
        return iMo8298 == 0 ? ByteString.EMPTY : ByteString.wrap(m8307(iMo8298), false);
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo8279() {
        return m8300() != 0;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo8280() {
        return m8306();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo8281() {
        return m8305();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final double mo8282() {
        return Double.longBitsToDouble(m8305());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo8283() {
        return mo8299();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8284() {
        return this.f11512 == this.f11510;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo8285(int i) {
        this.f11514 = i;
        m8309();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo8286(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int iMo8268 = mo8268() + i;
        if (iMo8268 < 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i2 = this.f11514;
        if (iMo8268 > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11514 = iMo8268;
        m8309();
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m8308(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.f11510;
            int i3 = this.f11512;
            if (i <= i2 - i3) {
                this.f11512 = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m8309() {
        int i = this.f11510 + this.f11513;
        this.f11510 = i;
        int i2 = i - this.f11515;
        int i3 = this.f11514;
        if (i2 <= i3) {
            this.f11513 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11513 = i4;
        this.f11510 = i - i4;
    }
}
