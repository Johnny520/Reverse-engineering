package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class FDBigInteger {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int[] data;
    private boolean immutable;
    private int nWords;
    private int offset;
    private static final int[] SMALL_5_POW = {1, 5, 25, Opcodes.LUSHR, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125};
    private static final FDBigInteger[] POW_5_CACHE = new FDBigInteger[340];

    static {
        int i10 = 0;
        while (true) {
            int[] iArr = SMALL_5_POW;
            if (i10 >= iArr.length) {
                break;
            }
            FDBigInteger fDBigInteger = new FDBigInteger(new int[]{iArr[i10]}, 0);
            fDBigInteger.makeImmutable();
            POW_5_CACHE[i10] = fDBigInteger;
            i10++;
        }
        FDBigInteger fDBigIntegerMult = POW_5_CACHE[i10 - 1];
        while (i10 < 340) {
            FDBigInteger[] fDBigIntegerArr = POW_5_CACHE;
            fDBigIntegerMult = fDBigIntegerMult.mult(5);
            fDBigIntegerArr[i10] = fDBigIntegerMult;
            fDBigIntegerMult.makeImmutable();
            i10++;
        }
    }

    public FDBigInteger(long j10, byte[] bArr, int i10, int i11) {
        int[] iArr = new int[Math.max((i11 + 8) / 9, 2)];
        this.data = iArr;
        int i12 = 0;
        iArr[0] = (int) j10;
        iArr[1] = (int) (j10 >>> 32);
        this.offset = 0;
        this.nWords = 2;
        int i13 = i11 - 5;
        while (i10 < i13) {
            int i14 = i10 + 5;
            int i15 = bArr[i10] + JSONB.Constants.BC_INT64_BYTE_ZERO;
            i10++;
            while (i10 < i14) {
                i15 = ((i15 * 10) + bArr[i10]) - 48;
                i10++;
            }
            multAddMe(100000, i15);
        }
        int i16 = 1;
        while (i10 < i11) {
            i12 = ((i12 * 10) + bArr[i10]) - 48;
            i16 *= 10;
            i10++;
        }
        if (i16 != 1) {
            multAddMe(i16, i12);
        }
        trimLeadingZeros();
    }

    private static FDBigInteger big5pow(int i10) {
        return i10 < 340 ? POW_5_CACHE[i10] : big5powRec(i10);
    }

    private static FDBigInteger big5powRec(int i10) {
        if (i10 < 340) {
            return POW_5_CACHE[i10];
        }
        int i11 = i10 >> 1;
        int i12 = i10 - i11;
        FDBigInteger fDBigIntegerBig5powRec = big5powRec(i11);
        int[] iArr = SMALL_5_POW;
        return i12 < iArr.length ? fDBigIntegerBig5powRec.mult(iArr[i12]) : fDBigIntegerBig5powRec.mult(big5powRec(i12));
    }

    private static int checkZeroTail(int[] iArr, int i10) {
        while (i10 > 0) {
            i10--;
            if (iArr[i10] != 0) {
                return 1;
            }
        }
        return 0;
    }

    private FDBigInteger mult(FDBigInteger fDBigInteger) {
        if (this.nWords == 0) {
            return this;
        }
        if (size() == 1) {
            return fDBigInteger.mult(this.data[0]);
        }
        if (fDBigInteger.nWords == 0) {
            return fDBigInteger;
        }
        if (fDBigInteger.size() == 1) {
            return mult(fDBigInteger.data[0]);
        }
        int i10 = this.nWords;
        int i11 = fDBigInteger.nWords;
        int[] iArr = new int[i10 + i11];
        mult(this.data, i10, fDBigInteger.data, i11, iArr);
        return new FDBigInteger(iArr, this.offset + fDBigInteger.offset);
    }

    private void multAddMe(int i10, int i11) {
        int i12;
        long j10 = ((long) i10) & 4294967295L;
        int[] iArr = this.data;
        long j11 = ((((long) iArr[0]) & 4294967295L) * j10) + (((long) i11) & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = j11 >>> 32;
        int i13 = 1;
        while (true) {
            i12 = this.nWords;
            if (i13 >= i12) {
                break;
            }
            int[] iArr2 = this.data;
            long j13 = j12 + ((((long) iArr2[i13]) & 4294967295L) * j10);
            iArr2[i13] = (int) j13;
            j12 = j13 >>> 32;
            i13++;
        }
        if (j12 != 0) {
            int[] iArr3 = this.data;
            this.nWords = i12 + 1;
            iArr3[i12] = (int) j12;
        }
    }

    private int size() {
        return this.nWords + this.offset;
    }

    private void trimLeadingZeros() {
        int i10 = this.nWords;
        if (i10 > 0) {
            int i11 = i10 - 1;
            if (this.data[i11] == 0) {
                while (i11 > 0 && this.data[i11 - 1] == 0) {
                    i11--;
                }
                this.nWords = i11;
                if (i11 == 0) {
                    this.offset = 0;
                }
            }
        }
    }

    public static FDBigInteger valueOfMulPow52(long j10, int i10, int i11) {
        int[] iArr;
        int i12 = (int) j10;
        int i13 = (int) (j10 >>> 32);
        int i14 = i11 >> 5;
        int i15 = i11 & 31;
        if (i10 == 0) {
            if (i11 == 0) {
                return new FDBigInteger(new int[]{i12, i13}, 0);
            }
            if (i15 == 0) {
                return new FDBigInteger(new int[]{i12, i13}, i14);
            }
            int i16 = 32 - i15;
            return new FDBigInteger(new int[]{i12 << i15, (i12 >>> i16) | (i13 << i15), i13 >>> i16}, i14);
        }
        int[] iArr2 = SMALL_5_POW;
        if (i10 >= iArr2.length) {
            FDBigInteger fDBigIntegerBig5pow = big5pow(i10);
            if (i13 == 0) {
                int i17 = fDBigIntegerBig5pow.nWords;
                iArr = new int[i17 + 1 + (i11 != 0 ? 1 : 0)];
                mult(fDBigIntegerBig5pow.data, i17, i12, iArr);
            } else {
                int i18 = fDBigIntegerBig5pow.nWords;
                iArr = new int[i18 + 2 + (i11 != 0 ? 1 : 0)];
                mult(fDBigIntegerBig5pow.data, i18, i12, i13, iArr);
            }
            return new FDBigInteger(iArr, fDBigIntegerBig5pow.offset).leftShift(i11);
        }
        long j11 = ((long) iArr2[i10]) & 4294967295L;
        long j12 = (((long) i12) & 4294967295L) * j11;
        int i19 = (int) j12;
        long j13 = ((4294967295L & ((long) i13)) * j11) + (j12 >>> 32);
        int i20 = (int) j13;
        int i21 = (int) (j13 >>> 32);
        if (i15 == 0) {
            return new FDBigInteger(new int[]{i19, i20, i21}, i14);
        }
        int i22 = 32 - i15;
        return new FDBigInteger(new int[]{i19 << i15, (i19 >>> i22) | (i20 << i15), (i20 >>> i22) | (i21 << i15), i21 >>> i22}, i14);
    }

    public int cmp(FDBigInteger fDBigInteger) {
        int i10 = this.nWords;
        int i11 = this.offset + i10;
        int i12 = fDBigInteger.nWords;
        int i13 = fDBigInteger.offset + i12;
        if (i11 > i13) {
            return 1;
        }
        if (i11 < i13) {
            return -1;
        }
        while (i10 > 0 && i12 > 0) {
            i10--;
            int i14 = this.data[i10];
            i12--;
            int i15 = fDBigInteger.data[i12];
            if (i14 != i15) {
                return (((long) i14) & 4294967295L) < (((long) i15) & 4294967295L) ? -1 : 1;
            }
        }
        if (i10 > 0) {
            return checkZeroTail(this.data, i10);
        }
        if (i12 > 0) {
            return -checkZeroTail(fDBigInteger.data, i12);
        }
        return 0;
    }

    public int cmpPow52(int i10, int i11) {
        if (i10 != 0) {
            return cmp(big5pow(i10).leftShift(i11));
        }
        int i12 = i11 >> 5;
        int i13 = i11 & 31;
        int i14 = this.nWords;
        int i15 = this.offset + i14;
        int i16 = i12 + 1;
        if (i15 > i16) {
            return 1;
        }
        if (i15 < i16) {
            return -1;
        }
        int[] iArr = this.data;
        int i17 = iArr[i14 - 1];
        int i18 = 1 << i13;
        return i17 != i18 ? (((long) i17) & 4294967295L) < (((long) i18) & 4294967295L) ? -1 : 1 : checkZeroTail(iArr, i14 - 1);
    }

    public FDBigInteger leftInplaceSub(FDBigInteger fDBigInteger) {
        FDBigInteger fDBigInteger2 = this.immutable ? new FDBigInteger((int[]) this.data.clone(), this.offset) : this;
        int i10 = fDBigInteger.offset - fDBigInteger2.offset;
        int[] iArr = fDBigInteger.data;
        int[] iArr2 = fDBigInteger2.data;
        int i11 = fDBigInteger.nWords;
        int i12 = fDBigInteger2.nWords;
        int i13 = 0;
        if (i10 < 0) {
            int i14 = i12 - i10;
            if (i14 < iArr2.length) {
                int i15 = -i10;
                System.arraycopy(iArr2, 0, iArr2, i15, i12);
                Arrays.fill(iArr2, 0, i15, 0);
            } else {
                int[] iArr3 = new int[i14];
                System.arraycopy(iArr2, 0, iArr3, -i10, i12);
                fDBigInteger2.data = iArr3;
                iArr2 = iArr3;
            }
            fDBigInteger2.offset = fDBigInteger.offset;
            fDBigInteger2.nWords = i14;
            i10 = 0;
            i12 = i14;
        }
        long j10 = 0;
        while (i13 < i11 && i10 < i12) {
            long j11 = ((((long) iArr2[i10]) & 4294967295L) - (((long) iArr[i13]) & 4294967295L)) + j10;
            iArr2[i10] = (int) j11;
            j10 = j11 >> 32;
            i13++;
            i10++;
            fDBigInteger2 = fDBigInteger2;
        }
        FDBigInteger fDBigInteger3 = fDBigInteger2;
        while (j10 != 0 && i10 < i12) {
            long j12 = (((long) iArr2[i10]) & 4294967295L) + j10;
            iArr2[i10] = (int) j12;
            j10 = j12 >> 32;
            i10++;
        }
        fDBigInteger3.trimLeadingZeros();
        return fDBigInteger3;
    }

    public FDBigInteger leftShift(int i10) {
        int i11;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = this.data;
        int i12 = this.nWords;
        int i13 = this.offset;
        if (i10 != 0 && i12 != 0) {
            int i14 = i10 >> 5;
            int i15 = i10 & 31;
            if (this.immutable) {
                if (i15 == 0) {
                    return new FDBigInteger(Arrays.copyOf(iArr4, i12), i13 + i14);
                }
                int i16 = 32 - i15;
                int i17 = i12 - 1;
                int i18 = iArr4[i17];
                int i19 = i18 >>> i16;
                if (i19 != 0) {
                    iArr3 = new int[i12 + 1];
                    iArr3[i12] = i19;
                } else {
                    iArr3 = new int[i12];
                }
                int[] iArr5 = iArr3;
                leftShift(iArr4, i17, iArr5, i15, i16, i18);
                return new FDBigInteger(iArr5, i13 + i14);
            }
            int i20 = i12;
            if (i15 != 0) {
                int i21 = 32 - i15;
                int i22 = 0;
                int i23 = iArr4[0];
                if ((i23 << i15) == 0) {
                    while (i22 < i20 - 1) {
                        int i24 = i22 + 1;
                        int i25 = iArr4[i24];
                        iArr4[i22] = (i23 >>> i21) | (i25 << i15);
                        i22 = i24;
                        i23 = i25;
                    }
                    int i26 = i23 >>> i21;
                    iArr4[i22] = i26;
                    i11 = i26 == 0 ? i20 - 1 : i20;
                    i13++;
                    this.nWords = i11;
                    this.offset = i13 + i14;
                } else {
                    int i27 = i20 - 1;
                    int i28 = iArr4[i27];
                    int i29 = i28 >>> i21;
                    if (i29 != 0) {
                        if (i20 == iArr4.length) {
                            iArr2 = new int[i20 + 1];
                            this.data = iArr2;
                        } else {
                            iArr2 = iArr4;
                        }
                        iArr2[i20] = i29;
                        iArr = iArr2;
                        i20++;
                    } else {
                        iArr = iArr4;
                    }
                    leftShift(iArr4, i27, iArr, i15, i21, i28);
                    i11 = i20;
                    this.nWords = i11;
                    this.offset = i13 + i14;
                }
            } else {
                i11 = i20;
                this.nWords = i11;
                this.offset = i13 + i14;
            }
        }
        return this;
    }

    public void makeImmutable() {
        this.immutable = true;
    }

    public FDBigInteger multByPow52(int i10, int i11) {
        FDBigInteger fDBigInteger;
        int i12 = this.nWords;
        if (i12 == 0) {
            return this;
        }
        if (i10 != 0) {
            int i13 = i11 != 0 ? 1 : 0;
            int[] iArr = SMALL_5_POW;
            if (i10 < iArr.length) {
                int[] iArr2 = new int[i12 + 1 + i13];
                mult(this.data, i12, iArr[i10], iArr2);
                fDBigInteger = new FDBigInteger(iArr2, this.offset);
            } else {
                FDBigInteger fDBigIntegerBig5pow = big5pow(i10);
                int[] iArr3 = new int[this.nWords + fDBigIntegerBig5pow.size() + i13];
                mult(this.data, this.nWords, fDBigIntegerBig5pow.data, fDBigIntegerBig5pow.nWords, iArr3);
                fDBigInteger = new FDBigInteger(iArr3, this.offset + fDBigIntegerBig5pow.offset);
            }
        } else {
            fDBigInteger = this;
        }
        return fDBigInteger.leftShift(i11);
    }

    public FDBigInteger rightInplaceSub(FDBigInteger fDBigInteger) {
        char c10;
        long j10;
        FDBigInteger fDBigInteger2 = fDBigInteger;
        if (fDBigInteger2.immutable) {
            fDBigInteger2 = new FDBigInteger((int[]) fDBigInteger2.data.clone(), fDBigInteger2.offset);
        }
        int i10 = this.offset - fDBigInteger2.offset;
        int[] iArrCopyOf = fDBigInteger2.data;
        int[] iArr = this.data;
        int i11 = fDBigInteger2.nWords;
        int i12 = this.nWords;
        int i13 = 0;
        if (i10 < 0) {
            if (i12 < iArrCopyOf.length) {
                int i14 = -i10;
                System.arraycopy(iArrCopyOf, 0, iArrCopyOf, i14, i11);
                Arrays.fill(iArrCopyOf, 0, i14, 0);
            } else {
                int[] iArr2 = new int[i12];
                System.arraycopy(iArrCopyOf, 0, iArr2, -i10, i11);
                fDBigInteger2.data = iArr2;
                iArrCopyOf = iArr2;
            }
            fDBigInteger2.offset = this.offset;
            i10 = 0;
        } else {
            int i15 = i12 + i10;
            if (i15 >= iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                fDBigInteger2.data = iArrCopyOf;
            }
        }
        long j11 = 0;
        int i16 = 0;
        while (true) {
            c10 = ' ';
            j10 = 4294967295L;
            if (i16 >= i10) {
                break;
            }
            long j12 = (-(4294967295L & ((long) iArrCopyOf[i16]))) + j11;
            iArrCopyOf[i16] = (int) j12;
            j11 = j12 >> 32;
            i16++;
        }
        while (i13 < i12) {
            char c11 = c10;
            long j13 = j10;
            long j14 = ((((long) iArr[i13]) & j10) - (((long) iArrCopyOf[i16]) & j13)) + j11;
            iArrCopyOf[i16] = (int) j14;
            j11 = j14 >> c11;
            i16++;
            i13++;
            c10 = c11;
            j10 = j13;
        }
        fDBigInteger2.nWords = i16;
        fDBigInteger2.trimLeadingZeros();
        return fDBigInteger2;
    }

    private FDBigInteger mult(int i10) {
        int i11 = this.nWords;
        if (i11 == 0) {
            return this;
        }
        int[] iArr = new int[i11 + 1];
        mult(this.data, i11, i10, iArr);
        return new FDBigInteger(iArr, this.offset);
    }

    private static void mult(int[] iArr, int i10, int i11, int[] iArr2) {
        long j10 = ((long) i11) & 4294967295L;
        long j11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j12 = ((((long) iArr[i12]) & 4294967295L) * j10) + j11;
            iArr2[i12] = (int) j12;
            j11 = j12 >>> 32;
        }
        iArr2[i10] = (int) j11;
    }

    private static void mult(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3) {
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = ((long) iArr[i12]) & 4294967295L;
            long j11 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i12 + i13;
                long j12 = j11 + (((long) iArr3[i14]) & 4294967295L) + ((((long) iArr2[i13]) & 4294967295L) * j10);
                iArr3[i14] = (int) j12;
                j11 = j12 >>> 32;
            }
            iArr3[i12 + i11] = (int) j11;
        }
    }

    private static void mult(int[] iArr, int i10, int i11, int i12, int[] iArr2) {
        mult(iArr, i10, i11, iArr2);
        long j10 = ((long) i12) & 4294967295L;
        long j11 = 0;
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i13 + 1;
            long j12 = (((long) iArr2[i14]) & 4294967295L) + ((((long) iArr[i13]) & 4294967295L) * j10) + j11;
            iArr2[i14] = (int) j12;
            j11 = j12 >>> 32;
            i13 = i14;
        }
        iArr2[i10 + 1] = (int) j11;
    }

    private FDBigInteger(int[] iArr, int i10) {
        this.data = iArr;
        this.offset = i10;
        this.nWords = iArr.length;
        trimLeadingZeros();
    }

    private static void leftShift(int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13) {
        while (i10 > 0) {
            int i14 = iArr[i10 - 1];
            iArr2[i10] = (i13 << i11) | (i14 >>> i12);
            i10--;
            i13 = i14;
        }
        iArr2[0] = i13 << i11;
    }
}
