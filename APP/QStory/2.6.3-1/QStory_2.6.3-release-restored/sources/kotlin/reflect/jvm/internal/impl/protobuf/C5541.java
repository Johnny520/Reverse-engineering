package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5541 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f14110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InputStream f14111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f14113;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f14118;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f14116 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f14115 = new byte[4096];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f14114 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f14112 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f14117 = 0;

    public C5541(InputStream inputStream) {
        this.f14111 = inputStream;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5533 m9939(InterfaceC5531 interfaceC5531, C5558 c5558) throws InvalidProtocolBufferException {
        int iM9956 = m9956();
        if (this.f14118 >= 64) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM9942 = m9942(iM9956);
        this.f14118++;
        InterfaceC5533 interfaceC5533 = (InterfaceC5533) interfaceC5531.mo9831(this, c5558);
        if (this.f14110 != 0) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        this.f14118--;
        m9943(iM9942);
        return interfaceC5533;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m9940() {
        return m9956();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5548 m9941() {
        int iM9956 = m9956();
        int i = this.f14114;
        int i2 = this.f14112;
        if (iM9956 > i - i2 || iM9956 <= 0) {
            return iM9956 == 0 ? AbstractC5542.f14119 : new C5548(m9952(iM9956));
        }
        byte[] bArr = new byte[iM9956];
        System.arraycopy(this.f14115, i2, bArr, 0, iM9956);
        C5548 c5548 = new C5548(bArr);
        this.f14112 += iM9956;
        return c5548;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m9942(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f14117 + this.f14112 + i;
        int i3 = this.f14116;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f14116 = i2;
        m9945();
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9943(int i) {
        this.f14116 = i;
        m9945();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m9944() {
        int i = this.f14116;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f14117 + this.f14112);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m9945() {
        int i = this.f14114 + this.f14113;
        this.f14114 = i;
        int i2 = this.f14117 + i;
        int i3 = this.f14116;
        if (i2 <= i3) {
            this.f14113 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f14113 = i4;
        this.f14114 = i - i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m9946() throws InvalidProtocolBufferException {
        if (this.f14112 == this.f14114 && !m9948(1)) {
            this.f14110 = 0;
            return 0;
        }
        int iM9956 = m9956();
        this.f14110 = iM9956;
        if ((iM9956 >>> 3) != 0) {
            return iM9956;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m9947(int i) throws InvalidProtocolBufferException {
        int i2 = this.f14114;
        int i3 = this.f14112;
        if (i <= i2 - i3 && i >= 0) {
            this.f14112 = i3 + i;
            return;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.f14117;
        int i5 = i4 + i3 + i;
        int i6 = this.f14116;
        if (i5 > i6) {
            m9947((i6 - i4) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i7 = i2 - i3;
        this.f14112 = i2;
        m9949(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f14114;
            if (i8 <= i9) {
                this.f14112 = i8;
                return;
            } else {
                i7 += i9;
                this.f14112 = i9;
                m9949(1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m9948(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.f14112;
        int i3 = i2 + i;
        int i4 = this.f14114;
        if (i3 <= i4) {
            C6755.m11870(AbstractC0900.m722(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        if (this.f14117 + i2 + i <= this.f14116 && (inputStream = this.f14111) != null) {
            byte[] bArr = this.f14115;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f14117 += i2;
                this.f14114 -= i2;
                this.f14112 = 0;
            }
            int i5 = this.f14114;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                C6755.m11870(AbstractC0900.m722(i6, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
            } else if (i6 > 0) {
                this.f14114 += i6;
                if ((this.f14117 + i) - 67108864 > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                m9945();
                if (this.f14114 >= i) {
                    return true;
                }
                return m9948(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m9949(int i) throws InvalidProtocolBufferException {
        if (!m9948(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m9950(int i, C5540 c5540) throws IOException {
        boolean zM9950;
        int i2 = i & 7;
        if (i2 == 0) {
            long jM9953 = m9953();
            c5540.m9925(i);
            c5540.m9927(jM9953);
            return true;
        }
        if (i2 == 1) {
            long jM9955 = m9955();
            c5540.m9925(i);
            c5540.m9926(jM9955);
            return true;
        }
        if (i2 == 2) {
            C5548 c5548M9941 = m9941();
            c5540.m9925(i);
            c5540.m9925(c5548M9941.size());
            c5540.m9934(c5548M9941);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM9951 = m9951();
            c5540.m9925(i);
            c5540.m9932(iM9951);
            return true;
        }
        c5540.m9925(i);
        do {
            int iM9946 = m9946();
            if (iM9946 == 0) {
                break;
            }
            int i3 = this.f14118;
            if (i3 >= 64) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f14118 = i3 + 1;
            zM9950 = m9950(iM9946, c5540);
            this.f14118--;
        } while (zM9950);
        int i4 = ((i >>> 3) << 3) | 4;
        if (this.f14110 != i4) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c5540.m9925(i4);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m9951() throws InvalidProtocolBufferException {
        int i = this.f14112;
        if (this.f14114 - i < 4) {
            m9949(4);
            i = this.f14112;
        }
        this.f14112 = i + 4;
        byte[] bArr = this.f14115;
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] m9952(int i) throws InvalidProtocolBufferException {
        if (i <= 0) {
            if (i == 0) {
                return AbstractC5547.f14128;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f14117;
        int i3 = this.f14112;
        int i4 = i2 + i3 + i;
        int i5 = this.f14116;
        if (i4 > i5) {
            m9947((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.f14115;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.f14114 - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.f14112 = this.f14114;
            int i7 = i - i6;
            if (i7 > 0) {
                m9949(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.f14112 = i7;
            return bArr2;
        }
        int i8 = this.f14114;
        this.f14117 = i2 + i8;
        this.f14112 = 0;
        this.f14114 = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f14111;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f14117 += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m9953() {
        long j;
        long j2;
        long j3;
        int i = this.f14112;
        int i2 = this.f14114;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f14115;
            byte b = bArr[i];
            if (b >= 0) {
                this.f14112 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 >= 0) {
                    int i5 = i + 3;
                    long j5 = j4 ^ ((long) (bArr[i4] << 14));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ ((long) (bArr[i5] << 21));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (((long) bArr[i4]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j5 = j4 ^ (((long) bArr[i4]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j4 >= 0) {
                                            int i6 = i + 9;
                                            long j6 = (j4 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            i4 = j6 < 0 ? i + 10 : i6;
                                            j = j6;
                                            this.f14112 = i4;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                            }
                        }
                    }
                    i4 = i5;
                    j = j3 ^ j5;
                    this.f14112 = i4;
                    return j;
                }
                j2 = -128;
                j = j2 ^ j4;
                this.f14112 = i4;
                return j;
            }
        }
        return m9954();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long m9954() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f14112 == this.f14114) {
                m9949(1);
            }
            int i2 = this.f14112;
            this.f14112 = i2 + 1;
            byte b = this.f14115[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long m9955() throws InvalidProtocolBufferException {
        int i = this.f14112;
        if (this.f14114 - i < 8) {
            m9949(8);
            i = this.f14112;
        }
        this.f14112 = i + 8;
        byte[] bArr = this.f14115;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m9956() {
        int i;
        int i2 = this.f14112;
        int i3 = this.f14114;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f14115;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f14112 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
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
                this.f14112 = i5;
                return i;
            }
        }
        return (int) m9954();
    }
}
