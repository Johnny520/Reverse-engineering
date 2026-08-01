package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4307 extends AbstractC4306 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] f11501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InputStream f11502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f11503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f11504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f11505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f11506 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f11507;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11508;

    public C4307(InputStream inputStream) {
        AbstractC4234.m8064(inputStream, "input");
        this.f11502 = inputStream;
        this.f11501 = new byte[4096];
        this.f11504 = 0;
        this.f11507 = 0;
        this.f11505 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m8287(int i) throws InvalidProtocolBufferException {
        if (m8297(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f11505) - this.f11507) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.sizeLimitExceeded();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m8288(int i) throws InvalidProtocolBufferException {
        int i2 = this.f11504;
        int i3 = this.f11507;
        if (i <= i2 - i3 && i >= 0) {
            this.f11507 = i3 + i;
            return;
        }
        InputStream inputStream = this.f11502;
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.f11505;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f11506;
        if (i6 > i7) {
            m8288((i7 - i4) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11505 = i5;
        int i8 = i2 - i3;
        this.f11504 = 0;
        this.f11507 = 0;
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
                this.f11505 += i8;
                m8291();
                throw th;
            }
        }
        this.f11505 += i8;
        m8291();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f11504;
        int i10 = i9 - this.f11507;
        this.f11507 = i9;
        m8287(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f11504;
            if (i11 <= i12) {
                this.f11507 = i11;
                return;
            } else {
                i10 += i12;
                this.f11507 = i12;
                m8287(1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long m8289() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f11507;
        int i2 = this.f11504;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f11501;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11507 = i3;
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
                this.f11507 = i4;
                return j;
            }
        }
        return m8292();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long m8290() throws InvalidProtocolBufferException {
        int i = this.f11507;
        if (this.f11504 - i < 8) {
            m8287(8);
            i = this.f11507;
        }
        this.f11507 = i + 8;
        byte[] bArr = this.f11501;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m8291() {
        int i = this.f11504 + this.f11503;
        this.f11504 = i;
        int i2 = this.f11505 + i;
        int i3 = this.f11506;
        if (i2 <= i3) {
            this.f11503 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11503 = i4;
        this.f11504 = i - i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long m8292() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f11507 == this.f11504) {
                m8287(1);
            }
            int i2 = this.f11507;
            this.f11507 = i2 + 1;
            byte b = this.f11501[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final ArrayList m8293(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f11502.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11505 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int m8294() throws InvalidProtocolBufferException {
        int i = this.f11507;
        if (this.f11504 - i < 4) {
            m8287(4);
            i = this.f11507;
        }
        this.f11507 = i + 4;
        byte[] bArr = this.f11501;
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo8256(int i) throws InvalidProtocolBufferException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m8288(8);
                return true;
            }
            if (i2 == 2) {
                m8288(mo8260());
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
            m8288(4);
            return true;
        }
        int i4 = this.f11504 - this.f11507;
        byte[] bArr = this.f11501;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f11507;
                this.f11507 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        while (i3 < 10) {
            if (this.f11507 == this.f11504) {
                m8287(1);
            }
            int i6 = this.f11507;
            this.f11507 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final byte[] m8295(int i) throws IOException {
        if (i == 0) {
            return AbstractC4234.f11402;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11505;
        int i3 = this.f11507;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i5 = this.f11506;
        if (i4 > i5) {
            m8288((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f11504 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f11502;
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
        System.arraycopy(this.f11501, this.f11507, bArr, 0, i6);
        this.f11505 += this.f11504;
        this.f11507 = 0;
        this.f11504 = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11505 += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] m8296(int i) throws IOException {
        byte[] bArrM8295 = m8295(i);
        if (bArrM8295 != null) {
            return bArrM8295;
        }
        int i2 = this.f11507;
        int i3 = this.f11504;
        int length = i3 - i2;
        this.f11505 += i3;
        this.f11507 = 0;
        this.f11504 = 0;
        ArrayList<byte[]> arrayListM8293 = m8293(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11501, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM8293) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final int mo8257() {
        return AbstractC4306.m8251(mo8260());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo8258() {
        return m8290();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo8259() {
        return m8294();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo8260() {
        int i;
        int i2 = this.f11507;
        int i3 = this.f11504;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f11501;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11507 = i4;
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
                this.f11507 = i5;
                return i;
            }
        }
        return (int) m8292();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo8262() {
        return m8289();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo8263() {
        return mo8260();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo8264() throws InvalidProtocolBufferException {
        if (mo8284()) {
            this.f11508 = 0;
            return 0;
        }
        int iMo8260 = mo8260();
        this.f11508 = iMo8260;
        if ((iMo8260 >>> 3) != 0) {
            return iMo8260;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final String mo8265() throws IOException {
        int iMo8260 = mo8260();
        int i = this.f11507;
        int i2 = this.f11504;
        int i3 = i2 - i;
        byte[] bArrM8296 = this.f11501;
        if (iMo8260 <= i3 && iMo8260 > 0) {
            this.f11507 = i + iMo8260;
        } else {
            if (iMo8260 == 0) {
                return "";
            }
            if (iMo8260 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i = 0;
            if (iMo8260 <= i2) {
                m8287(iMo8260);
                this.f11507 = iMo8260;
            } else {
                bArrM8296 = m8296(iMo8260);
            }
        }
        if (iMo8260 != 0) {
            return AbstractC4556.f11888.mo8089(i, bArrM8296, iMo8260);
        }
        AbstractC4245 abstractC4245 = AbstractC4556.f11888;
        return "";
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final String mo8266() throws InvalidProtocolBufferException {
        int iMo8260 = mo8260();
        byte[] bArr = this.f11501;
        if (iMo8260 > 0) {
            int i = this.f11504;
            int i2 = this.f11507;
            if (iMo8260 <= i - i2) {
                String str = new String(bArr, i2, iMo8260, AbstractC4234.f11404);
                this.f11507 += iMo8260;
                return str;
            }
        }
        if (iMo8260 == 0) {
            return "";
        }
        if (iMo8260 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (iMo8260 > this.f11504) {
            return new String(m8296(iMo8260), AbstractC4234.f11404);
        }
        m8287(iMo8260);
        String str2 = new String(bArr, this.f11507, iMo8260, AbstractC4234.f11404);
        this.f11507 += iMo8260;
        return str2;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final long mo8267() {
        return AbstractC4306.m8250(m8289());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo8268() {
        return this.f11505 + this.f11507;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo8269() {
        int i = this.f11506;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f11505 + this.f11507);
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8271(int i) throws InvalidProtocolBufferException {
        if (this.f11508 != i) {
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
        return Float.intBitsToFloat(m8294());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC4273 mo8274(InterfaceC4207 interfaceC4207, C4529 c4529) throws InvalidProtocolBufferException {
        int iMo8260 = mo8260();
        m8270();
        int iMo8286 = mo8286(iMo8260);
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
        int iMo8260 = mo8260();
        m8270();
        int iMo8286 = mo8286(iMo8260);
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
        return mo8260();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo8277() {
        return m8289();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo8278() throws IOException {
        int iMo8260 = mo8260();
        int i = this.f11504;
        int i2 = this.f11507;
        int i3 = i - i2;
        byte[] bArr = this.f11501;
        if (iMo8260 <= i3 && iMo8260 > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i2, iMo8260, false);
            this.f11507 += iMo8260;
            return byteStringCopyFrom;
        }
        if (iMo8260 == 0) {
            return ByteString.EMPTY;
        }
        if (iMo8260 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrM8295 = m8295(iMo8260);
        if (bArrM8295 != null) {
            return ByteString.copyFrom(bArrM8295, 0, bArrM8295.length, false);
        }
        int i4 = this.f11507;
        int i5 = this.f11504;
        int length = i5 - i4;
        this.f11505 += i5;
        this.f11507 = 0;
        this.f11504 = 0;
        ArrayList<byte[]> arrayListM8293 = m8293(iMo8260 - length);
        byte[] bArr2 = new byte[iMo8260];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM8293) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return ByteString.wrap(bArr2);
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo8279() {
        return m8289() != 0;
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo8280() {
        return m8294();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo8281() {
        return m8290();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final double mo8282() {
        return Double.longBitsToDouble(m8290());
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo8283() {
        return mo8260();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8284() {
        return this.f11507 == this.f11504 && !m8297(1);
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo8285(int i) {
        this.f11506 = i;
        m8291();
    }

    @Override // com.google.protobuf.AbstractC4306
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo8286(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11505 + this.f11507 + i;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i3 = this.f11506;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11506 = i2;
        m8291();
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m8297(int i) throws IOException {
        InputStream inputStream = this.f11502;
        int i2 = this.f11507;
        int i3 = i2 + i;
        int i4 = this.f11504;
        if (i3 <= i4) {
            C6755.m11870(AbstractC0900.m722(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f11505;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f11506) {
            byte[] bArr = this.f11501;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f11505 += i2;
                this.f11504 -= i2;
                this.f11507 = 0;
            }
            int i6 = this.f11504;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f11505) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f11504 += i7;
                    m8291();
                    if (this.f11504 >= i || m8297(i)) {
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
