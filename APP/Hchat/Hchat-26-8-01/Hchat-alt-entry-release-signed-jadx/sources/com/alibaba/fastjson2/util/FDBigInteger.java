package com.alibaba.fastjson2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FDBigInteger {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int[] data;
    boolean immutable;
    private int nWords;
    private int offset;
    private static final int[] SMALL_5_POW = {1, 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125};
    private static final int MAX_FIVE_POW = 340;
    private static final FDBigInteger[] POW_5_CACHE = new FDBigInteger[MAX_FIVE_POW];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 0;
        while (true) {
            int[] iArr = SMALL_5_POW;
            if (i9 >= iArr.length) {
                break;
            }
            FDBigInteger fDBigInteger = new FDBigInteger(new int[]{iArr[i9]}, 0);
            fDBigInteger.immutable = true;
            POW_5_CACHE[i9] = fDBigInteger;
            i9++;
        }
        FDBigInteger fDBigIntegerMult = POW_5_CACHE[i9 - 1];
        while (i9 < MAX_FIVE_POW) {
            FDBigInteger[] fDBigIntegerArr = POW_5_CACHE;
            fDBigIntegerMult = fDBigIntegerMult.mult(5);
            fDBigIntegerArr[i9] = fDBigIntegerMult;
            fDBigIntegerMult.immutable = true;
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FDBigInteger(long j3, char[] cArr, int i9, int i10) {
        int[] iArr = new int[Math.max((i10 + 8) / 9, 2)];
        this.data = iArr;
        int i11 = 0;
        iArr[0] = (int) j3;
        iArr[1] = (int) (j3 >>> 32);
        this.offset = 0;
        this.nWords = 2;
        int i12 = i10 - 5;
        while (i9 < i12) {
            int i13 = i9 + 5;
            int i14 = cArr[i9] - '0';
            i9++;
            while (i9 < i13) {
                i14 = ((i14 * 10) + cArr[i9]) - 48;
                i9++;
            }
            multAddMe(100000, i14);
        }
        int i15 = 1;
        while (i9 < i10) {
            i11 = ((i11 * 10) + cArr[i9]) - 48;
            i15 *= 10;
            i9++;
        }
        if (i15 != 1) {
            multAddMe(i15, i11);
        }
        trimLeadingZeros();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static FDBigInteger big5pow(int i9) {
        return i9 < MAX_FIVE_POW ? POW_5_CACHE[i9] : big5powRec(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static FDBigInteger big5powRec(int i9) {
        if (i9 < MAX_FIVE_POW) {
            return POW_5_CACHE[i9];
        }
        int i10 = i9 >> 1;
        int i11 = i9 - i10;
        FDBigInteger fDBigIntegerBig5powRec = big5powRec(i10);
        int[] iArr = SMALL_5_POW;
        if (i11 < iArr.length) {
            return fDBigIntegerBig5powRec.mult(iArr[i11]);
        }
        FDBigInteger fDBigIntegerBig5powRec2 = big5powRec(i11);
        int i12 = fDBigIntegerBig5powRec.nWords;
        if (i12 == 0) {
            return fDBigIntegerBig5powRec;
        }
        if (fDBigIntegerBig5powRec.offset + i12 == 1) {
            return fDBigIntegerBig5powRec2.mult(fDBigIntegerBig5powRec.data[0]);
        }
        int i13 = fDBigIntegerBig5powRec2.nWords;
        if (i13 == 0) {
            return fDBigIntegerBig5powRec2;
        }
        if (fDBigIntegerBig5powRec2.offset + i13 == 1) {
            return fDBigIntegerBig5powRec.mult(fDBigIntegerBig5powRec2.data[0]);
        }
        int[] iArr2 = new int[i12 + i13];
        mult(fDBigIntegerBig5powRec.data, i12, fDBigIntegerBig5powRec2.data, i13, iArr2);
        return new FDBigInteger(iArr2, fDBigIntegerBig5powRec.offset + fDBigIntegerBig5powRec2.offset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int checkZeroTail(int[] iArr, int i9) {
        while (i9 > 0) {
            i9--;
            if (iArr[i9] != 0) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void mult(int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3) {
        for (int i11 = 0; i11 < i9; i11++) {
            long j3 = ((long) iArr[i11]) & 4294967295L;
            long j4 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i11 + i12;
                long j5 = ((((long) iArr2[i12]) & 4294967295L) * j3) + (((long) iArr3[i13]) & 4294967295L) + j4;
                iArr3[i13] = (int) j5;
                j4 = j5 >>> 32;
            }
            iArr3[i11 + i10] = (int) j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void multAddMe(int i9, int i10) {
        int i11;
        long j3 = ((long) i9) & 4294967295L;
        int[] iArr = this.data;
        long j4 = ((((long) iArr[0]) & 4294967295L) * j3) + (((long) i10) & 4294967295L);
        iArr[0] = (int) j4;
        long j5 = j4 >>> 32;
        int i12 = 1;
        while (true) {
            i11 = this.nWords;
            if (i12 >= i11) {
                break;
            }
            int[] iArr2 = this.data;
            long j10 = ((((long) iArr2[i12]) & 4294967295L) * j3) + j5;
            iArr2[i12] = (int) j10;
            j5 = j10 >>> 32;
            i12++;
        }
        if (j5 != 0) {
            int[] iArr3 = this.data;
            this.nWords = i11 + 1;
            iArr3[i11] = (int) j5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void trimLeadingZeros() {
        int i9 = this.nWords;
        if (i9 > 0) {
            int i10 = i9 - 1;
            if (this.data[i10] == 0) {
                while (i10 > 0 && this.data[i10 - 1] == 0) {
                    i10--;
                }
                this.nWords = i10;
                if (i10 == 0) {
                    this.offset = 0;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FDBigInteger valueOfMulPow52(long j3, int i9, int i10) {
        int[] iArr;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        int i13 = i10 >> 5;
        int i14 = i10 & 31;
        int i15 = 0;
        if (i9 == 0) {
            if (i10 == 0) {
                return new FDBigInteger(new int[]{i11, i12}, 0);
            }
            if (i14 == 0) {
                return new FDBigInteger(new int[]{i11, i12}, i13);
            }
            int i16 = i11 << i14;
            int i17 = i12 << i14;
            int i18 = 32 - i14;
            return new FDBigInteger(new int[]{i16, (i11 >>> i18) | i17, i12 >>> i18}, i13);
        }
        int[] iArr2 = SMALL_5_POW;
        long j4 = 4294967295L;
        if (i9 < iArr2.length) {
            long j5 = ((long) iArr2[i9]) & 4294967295L;
            long j10 = (((long) i11) & 4294967295L) * j5;
            int i19 = (int) j10;
            long j11 = ((((long) i12) & 4294967295L) * j5) + (j10 >>> 32);
            int i20 = (int) j11;
            int i21 = (int) (j11 >>> 32);
            if (i14 == 0) {
                return new FDBigInteger(new int[]{i19, i20, i21}, i13);
            }
            int i22 = 32 - i14;
            return new FDBigInteger(new int[]{i19 << i14, (i19 >>> i22) | (i20 << i14), (i20 >>> i22) | (i21 << i14), i21 >>> i22}, i13);
        }
        FDBigInteger fDBigIntegerBig5pow = big5pow(i9);
        int[] iArr3 = fDBigIntegerBig5pow.data;
        int i23 = fDBigIntegerBig5pow.nWords;
        long j12 = ((long) i11) & 4294967295L;
        if (i12 == 0) {
            iArr = new int[i23 + 1 + (i10 != 0 ? 1 : 0)];
        } else {
            iArr = new int[i23 + 2 + (i10 != 0 ? 1 : 0)];
        }
        long j13 = 0;
        int i24 = 0;
        long j14 = 0;
        while (i24 < i23) {
            long j15 = j4;
            long j16 = ((((long) iArr3[i24]) & j15) * j12) + j14;
            iArr[i24] = (int) j16;
            j14 = j16 >>> 32;
            i24++;
            j4 = j15;
        }
        long j17 = j4;
        iArr[i23] = (int) j14;
        if (i12 != 0) {
            long j18 = ((long) i12) & j17;
            while (i15 < i23) {
                int i25 = i15 + 1;
                long j19 = ((((long) iArr3[i15]) & j17) * j18) + (((long) iArr[i25]) & j17) + j13;
                iArr[i25] = (int) j19;
                j13 = j19 >>> 32;
                i15 = i25;
            }
            iArr[i23 + 1] = (int) j13;
        }
        return new FDBigInteger(iArr, fDBigIntegerBig5pow.offset).leftShift(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int cmp(FDBigInteger fDBigInteger) {
        int i9 = this.nWords;
        int i10 = this.offset + i9;
        int i11 = fDBigInteger.nWords;
        int i12 = fDBigInteger.offset + i11;
        if (i10 > i12) {
            return 1;
        }
        if (i10 < i12) {
            return -1;
        }
        while (i9 > 0 && i11 > 0) {
            i9--;
            int i13 = this.data[i9];
            i11--;
            int i14 = fDBigInteger.data[i11];
            if (i13 != i14) {
                return (((long) i13) & 4294967295L) < (((long) i14) & 4294967295L) ? -1 : 1;
            }
        }
        if (i9 > 0) {
            return checkZeroTail(this.data, i9);
        }
        if (i11 > 0) {
            return -checkZeroTail(fDBigInteger.data, i11);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int cmpPow52(int i9, int i10) {
        if (i9 != 0) {
            return cmp(big5pow(i9).leftShift(i10));
        }
        int i11 = i10 >> 5;
        int i12 = i10 & 31;
        int i13 = this.nWords;
        int i14 = this.offset + i13;
        int i15 = i11 + 1;
        if (i14 > i15) {
            return 1;
        }
        if (i14 < i15) {
            return -1;
        }
        int[] iArr = this.data;
        int i16 = iArr[i13 - 1];
        int i17 = 1 << i12;
        return i16 != i17 ? (((long) i16) & 4294967295L) < (((long) i17) & 4294967295L) ? -1 : 1 : checkZeroTail(iArr, i13 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FDBigInteger leftInplaceSub(FDBigInteger fDBigInteger) {
        FDBigInteger fDBigInteger2 = this.immutable ? new FDBigInteger((int[]) this.data.clone(), this.offset) : this;
        int i9 = fDBigInteger.offset - fDBigInteger2.offset;
        int[] iArr = fDBigInteger.data;
        int[] iArr2 = fDBigInteger2.data;
        int i10 = fDBigInteger.nWords;
        int i11 = fDBigInteger2.nWords;
        int i12 = 0;
        if (i9 < 0) {
            int i13 = i11 - i9;
            if (i13 < iArr2.length) {
                int i14 = -i9;
                System.arraycopy(iArr2, 0, iArr2, i14, i11);
                Arrays.fill(iArr2, 0, i14, 0);
            } else {
                int[] iArr3 = new int[i13];
                System.arraycopy(iArr2, 0, iArr3, -i9, i11);
                fDBigInteger2.data = iArr3;
                iArr2 = iArr3;
            }
            fDBigInteger2.offset = fDBigInteger.offset;
            fDBigInteger2.nWords = i13;
            i9 = 0;
            i11 = i13;
        }
        long j3 = 0;
        while (i12 < i10 && i9 < i11) {
            long j4 = ((((long) iArr2[i9]) & 4294967295L) - (((long) iArr[i12]) & 4294967295L)) + j3;
            iArr2[i9] = (int) j4;
            j3 = j4 >> 32;
            i12++;
            i9++;
            fDBigInteger2 = fDBigInteger2;
        }
        FDBigInteger fDBigInteger3 = fDBigInteger2;
        while (j3 != 0 && i9 < i11) {
            long j5 = (((long) iArr2[i9]) & 4294967295L) + j3;
            iArr2[i9] = (int) j5;
            j3 = j5 >> 32;
            i9++;
        }
        fDBigInteger3.trimLeadingZeros();
        return fDBigInteger3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FDBigInteger leftShift(int i9) {
        int i10;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = this.data;
        int i11 = this.nWords;
        int i12 = this.offset;
        if (i9 != 0 && i11 != 0) {
            int i13 = i9 >> 5;
            int i14 = i9 & 31;
            if (this.immutable) {
                if (i14 == 0) {
                    return new FDBigInteger(Arrays.copyOf(iArr4, i11), i12 + i13);
                }
                int i15 = 32 - i14;
                int i16 = i11 - 1;
                int i17 = iArr4[i16];
                int i18 = i17 >>> i15;
                if (i18 != 0) {
                    iArr3 = new int[i11 + 1];
                    iArr3[i11] = i18;
                } else {
                    iArr3 = new int[i11];
                }
                int[] iArr5 = iArr3;
                leftShift(iArr4, i16, iArr5, i14, i15, i17);
                return new FDBigInteger(iArr5, i12 + i13);
            }
            int i19 = i11;
            if (i14 != 0) {
                int i20 = 32 - i14;
                int i21 = 0;
                int i22 = iArr4[0];
                if ((i22 << i14) == 0) {
                    while (i21 < i19 - 1) {
                        int i23 = i21 + 1;
                        int i24 = iArr4[i23];
                        iArr4[i21] = (i22 >>> i20) | (i24 << i14);
                        i21 = i23;
                        i22 = i24;
                    }
                    int i25 = i22 >>> i20;
                    iArr4[i21] = i25;
                    i10 = i25 == 0 ? i19 - 1 : i19;
                    i12++;
                    this.nWords = i10;
                    this.offset = i12 + i13;
                } else {
                    int i26 = i19 - 1;
                    int i27 = iArr4[i26];
                    int i28 = i27 >>> i20;
                    if (i28 != 0) {
                        if (i19 == iArr4.length) {
                            iArr2 = new int[i19 + 1];
                            this.data = iArr2;
                        } else {
                            iArr2 = iArr4;
                        }
                        iArr2[i19] = i28;
                        iArr = iArr2;
                        i19++;
                    } else {
                        iArr = iArr4;
                    }
                    leftShift(iArr4, i26, iArr, i14, i20, i27);
                    i10 = i19;
                    this.nWords = i10;
                    this.offset = i12 + i13;
                }
            } else {
                i10 = i19;
                this.nWords = i10;
                this.offset = i12 + i13;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FDBigInteger multByPow52(int i9, int i10) {
        FDBigInteger fDBigInteger;
        int i11 = this.nWords;
        if (i11 == 0) {
            return this;
        }
        if (i9 != 0) {
            int i12 = i10 != 0 ? 1 : 0;
            int[] iArr = SMALL_5_POW;
            if (i9 < iArr.length) {
                int[] iArr2 = new int[i11 + 1 + i12];
                mult(this.data, i11, iArr[i9], iArr2);
                fDBigInteger = new FDBigInteger(iArr2, this.offset);
            } else {
                FDBigInteger fDBigIntegerBig5pow = big5pow(i9);
                int i13 = this.nWords;
                int i14 = fDBigIntegerBig5pow.nWords;
                int[] iArr3 = new int[i13 + i14 + fDBigIntegerBig5pow.offset + i12];
                mult(this.data, i13, fDBigIntegerBig5pow.data, i14, iArr3);
                fDBigInteger = new FDBigInteger(iArr3, this.offset + fDBigIntegerBig5pow.offset);
            }
        } else {
            fDBigInteger = this;
        }
        return fDBigInteger.leftShift(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FDBigInteger rightInplaceSub(FDBigInteger fDBigInteger) {
        char c10;
        long j3;
        FDBigInteger fDBigInteger2 = fDBigInteger;
        if (fDBigInteger2.immutable) {
            fDBigInteger2 = new FDBigInteger((int[]) fDBigInteger2.data.clone(), fDBigInteger2.offset);
        }
        int i9 = this.offset - fDBigInteger2.offset;
        int[] iArrCopyOf = fDBigInteger2.data;
        int[] iArr = this.data;
        int i10 = fDBigInteger2.nWords;
        int i11 = this.nWords;
        int i12 = 0;
        if (i9 < 0) {
            if (i11 < iArrCopyOf.length) {
                int i13 = -i9;
                System.arraycopy(iArrCopyOf, 0, iArrCopyOf, i13, i10);
                Arrays.fill(iArrCopyOf, 0, i13, 0);
            } else {
                int[] iArr2 = new int[i11];
                System.arraycopy(iArrCopyOf, 0, iArr2, -i9, i10);
                fDBigInteger2.data = iArr2;
                iArrCopyOf = iArr2;
            }
            fDBigInteger2.offset = this.offset;
            i9 = 0;
        } else {
            int i14 = i11 + i9;
            if (i14 >= iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                fDBigInteger2.data = iArrCopyOf;
            }
        }
        long j4 = 0;
        int i15 = 0;
        while (true) {
            c10 = ' ';
            j3 = 4294967295L;
            if (i15 >= i9) {
                break;
            }
            long j5 = (-(4294967295L & ((long) iArrCopyOf[i15]))) + j4;
            iArrCopyOf[i15] = (int) j5;
            j4 = j5 >> 32;
            i15++;
        }
        while (i12 < i11) {
            char c11 = c10;
            long j10 = j3;
            long j11 = ((((long) iArr[i12]) & j3) - (((long) iArrCopyOf[i15]) & j10)) + j4;
            iArrCopyOf[i15] = (int) j11;
            j4 = j11 >> c11;
            i15++;
            i12++;
            c10 = c11;
            j3 = j10;
        }
        fDBigInteger2.nWords = i15;
        fDBigInteger2.trimLeadingZeros();
        return fDBigInteger2;
    }

    private static void mult(int[] iArr, int i9, int i10, int[] iArr2) {
        long j3 = ((long) i10) & 4294967295L;
        long j4 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            long j5 = ((((long) iArr[i11]) & 4294967295L) * j3) + j4;
            iArr2[i11] = (int) j5;
            j4 = j5 >>> 32;
        }
        iArr2[i9] = (int) j4;
    }

    private FDBigInteger mult(int i9) {
        int i10 = this.nWords;
        if (i10 == 0) {
            return this;
        }
        int[] iArr = new int[i10 + 1];
        mult(this.data, i10, i9, iArr);
        return new FDBigInteger(iArr, this.offset);
    }

    private FDBigInteger(int[] iArr, int i9) {
        this.data = iArr;
        this.offset = i9;
        this.nWords = iArr.length;
        trimLeadingZeros();
    }

    private static void leftShift(int[] iArr, int i9, int[] iArr2, int i10, int i11, int i12) {
        while (i9 > 0) {
            int i13 = iArr[i9 - 1];
            iArr2[i9] = (i12 << i10) | (i13 >>> i11);
            i9--;
            i12 = i13;
        }
        iArr2[0] = i12 << i10;
    }
}
