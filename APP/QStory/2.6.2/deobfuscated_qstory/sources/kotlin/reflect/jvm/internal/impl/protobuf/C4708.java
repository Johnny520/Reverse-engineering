package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f13761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InputStream f13762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f13764;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f13769;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f13767 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f13766 = new byte[4096];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f13765 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f13763 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f13768 = 0;

    public C4708(InputStream inputStream) {
        this.f13762 = inputStream;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4700 m9390(InterfaceC4698 interfaceC4698, C4725 c4725) throws InvalidProtocolBufferException {
        int iM9407 = m9407();
        if (this.f13769 >= 64) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM9393 = m9393(iM9407);
        this.f13769++;
        InterfaceC4700 interfaceC4700 = (InterfaceC4700) interfaceC4698.mo9282(this, c4725);
        if (this.f13761 != 0) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        this.f13769--;
        m9394(iM9393);
        return interfaceC4700;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m9391() {
        return m9407();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4715 m9392() {
        int iM9407 = m9407();
        int i = this.f13765;
        int i2 = this.f13763;
        if (iM9407 > i - i2 || iM9407 <= 0) {
            return iM9407 == 0 ? AbstractC4709.f13770 : new C4715(m9403(iM9407));
        }
        byte[] bArr = new byte[iM9407];
        System.arraycopy(this.f13766, i2, bArr, 0, iM9407);
        C4715 c4715 = new C4715(bArr);
        this.f13763 += iM9407;
        return c4715;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m9393(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f13768 + this.f13763 + i;
        int i3 = this.f13767;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f13767 = i2;
        m9396();
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9394(int i) {
        this.f13767 = i;
        m9396();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m9395() {
        int i = this.f13767;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f13768 + this.f13763);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m9396() {
        int i = this.f13765 + this.f13764;
        this.f13765 = i;
        int i2 = this.f13768 + i;
        int i3 = this.f13767;
        if (i2 <= i3) {
            this.f13764 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f13764 = i4;
        this.f13765 = i - i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m9397() throws InvalidProtocolBufferException {
        if (this.f13763 == this.f13765 && !m9399(1)) {
            this.f13761 = 0;
            return 0;
        }
        int iM9407 = m9407();
        this.f13761 = iM9407;
        if ((iM9407 >>> 3) != 0) {
            return iM9407;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m9398(int i) throws InvalidProtocolBufferException {
        int i2 = this.f13765;
        int i3 = this.f13763;
        if (i <= i2 - i3 && i >= 0) {
            this.f13763 = i3 + i;
            return;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.f13768;
        int i5 = i4 + i3 + i;
        int i6 = this.f13767;
        if (i5 > i6) {
            m9398((i6 - i4) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i7 = i2 - i3;
        this.f13763 = i2;
        m9400(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f13765;
            if (i8 <= i9) {
                this.f13763 = i8;
                return;
            } else {
                i7 += i9;
                this.f13763 = i9;
                m9400(1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m9399(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.f13763;
        int i3 = i2 + i;
        int i4 = this.f13765;
        if (i3 <= i4) {
            C5919.m11250(AbstractC0053.m161(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        if (this.f13768 + i2 + i <= this.f13767 && (inputStream = this.f13762) != null) {
            byte[] bArr = this.f13766;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f13768 += i2;
                this.f13765 -= i2;
                this.f13763 = 0;
            }
            int i5 = this.f13765;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                C5919.m11250(AbstractC0053.m161(i6, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
            } else if (i6 > 0) {
                this.f13765 += i6;
                if ((this.f13768 + i) - 67108864 > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                m9396();
                if (this.f13765 >= i) {
                    return true;
                }
                return m9399(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m9400(int i) throws InvalidProtocolBufferException {
        if (!m9399(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m9401(int i, C4707 c4707) throws IOException {
        boolean zM9401;
        int i2 = i & 7;
        if (i2 == 0) {
            long jM9404 = m9404();
            c4707.m9376(i);
            c4707.m9378(jM9404);
            return true;
        }
        if (i2 == 1) {
            long jM9406 = m9406();
            c4707.m9376(i);
            c4707.m9377(jM9406);
            return true;
        }
        if (i2 == 2) {
            C4715 c4715M9392 = m9392();
            c4707.m9376(i);
            c4707.m9376(c4715M9392.size());
            c4707.m9385(c4715M9392);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM9402 = m9402();
            c4707.m9376(i);
            c4707.m9383(iM9402);
            return true;
        }
        c4707.m9376(i);
        do {
            int iM9397 = m9397();
            if (iM9397 == 0) {
                break;
            }
            int i3 = this.f13769;
            if (i3 >= 64) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f13769 = i3 + 1;
            zM9401 = m9401(iM9397, c4707);
            this.f13769--;
        } while (zM9401);
        int i4 = ((i >>> 3) << 3) | 4;
        if (this.f13761 != i4) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c4707.m9376(i4);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m9402() throws InvalidProtocolBufferException {
        int i = this.f13763;
        if (this.f13765 - i < 4) {
            m9400(4);
            i = this.f13763;
        }
        this.f13763 = i + 4;
        byte[] bArr = this.f13766;
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] m9403(int i) throws InvalidProtocolBufferException {
        if (i <= 0) {
            if (i == 0) {
                return AbstractC4714.f13779;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f13768;
        int i3 = this.f13763;
        int i4 = i2 + i3 + i;
        int i5 = this.f13767;
        if (i4 > i5) {
            m9398((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.f13766;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.f13765 - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.f13763 = this.f13765;
            int i7 = i - i6;
            if (i7 > 0) {
                m9400(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.f13763 = i7;
            return bArr2;
        }
        int i8 = this.f13765;
        this.f13768 = i2 + i8;
        this.f13763 = 0;
        this.f13765 = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f13762;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f13768 += i11;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m9404() {
        /*
            r12 = this;
            int r0 = r12.f13763
            int r1 = r12.f13765
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.f13766
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.f13763 = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.m9405()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.f13763 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C4708.m9404():long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long m9405() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f13763 == this.f13765) {
                m9400(1);
            }
            int i2 = this.f13763;
            this.f13763 = i2 + 1;
            byte b = this.f13766[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long m9406() throws InvalidProtocolBufferException {
        int i = this.f13763;
        if (this.f13765 - i < 8) {
            m9400(8);
            i = this.f13763;
        }
        this.f13763 = i + 8;
        byte[] bArr = this.f13766;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m9407() {
        int i;
        int i2 = this.f13763;
        int i3 = this.f13765;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f13766;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f13763 = i4;
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
                this.f13763 = i5;
                return i;
            }
        }
        return (int) m9405();
    }
}
