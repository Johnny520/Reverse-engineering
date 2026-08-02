package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bs2 implements Iterable, q41 {
    public static final bs2 l = new bs2(0, 0, 0, null);
    public final long h;
    public final long i;
    public final long j;
    public final long[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bs2(long j, long j2, long j3, long[] jArr) {
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final bs2 a(bs2 bs2Var) {
        long[] jArr;
        bs2 bs2VarB = this;
        bs2 bs2Var2 = l;
        if (bs2Var == bs2Var2) {
            return bs2VarB;
        }
        if (bs2VarB == bs2Var2) {
            return bs2Var2;
        }
        long j = bs2Var.j;
        long j2 = bs2Var.j;
        long[] jArr2 = bs2Var.k;
        long j3 = bs2Var.i;
        long j4 = bs2Var.h;
        long j5 = bs2VarB.j;
        if (j == j5 && jArr2 == (jArr = bs2VarB.k)) {
            return new bs2(bs2VarB.h & (~j4), bs2VarB.i & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                bs2VarB = bs2VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    bs2VarB = bs2VarB.b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    bs2VarB = bs2VarB.b(((long) i2) + j2 + 64);
                }
            }
        }
        return bs2VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final bs2 b(long j) {
        long[] jArr;
        int iU;
        long[] jArr2;
        long j2 = j - this.j;
        if (t11.p(j2, 0L) >= 0 && t11.p(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.i;
            if ((j4 & j3) != 0) {
                return new bs2(this.h, j4 & (~j3), this.j, this.k);
            }
        } else if (t11.p(j2, 64L) >= 0 && t11.p(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.h;
            if ((j6 & j5) != 0) {
                return new bs2(j6 & (~j5), this.i, this.j, this.k);
            }
        } else if (t11.p(j2, 0L) < 0 && (jArr = this.k) != null && (iU = ci0.u(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iU > 0) {
                    mg.b0(jArr, jArr3, 0, 0, iU);
                }
                if (iU < i) {
                    mg.b0(jArr, jArr3, iU, iU + 1, length);
                }
                jArr2 = jArr3;
            }
            return new bs2(this.h, this.i, this.j, jArr2);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.j;
        return (t11.p(j2, 0L) < 0 || t11.p(j2, 64L) >= 0) ? (t11.p(j2, 64L) < 0 || t11.p(j2, 128L) >= 0) ? t11.p(j2, 0L) <= 0 && (jArr = this.k) != null && ci0.u(j, jArr) >= 0 : ((1 << (((int) j2) + (-64))) & this.h) != 0 : ((1 << ((int) j2)) & this.i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final bs2 d(bs2 bs2Var) {
        bs2 bs2VarE;
        long[] jArr;
        bs2 bs2VarE2 = this;
        bs2 bs2Var2 = l;
        if (bs2Var == bs2Var2) {
            return bs2VarE2;
        }
        if (bs2VarE2 == bs2Var2) {
            return bs2Var;
        }
        long j = bs2Var.j;
        long j2 = bs2Var.j;
        long[] jArr2 = bs2Var.k;
        long j3 = bs2Var.i;
        long j4 = bs2Var.h;
        long j5 = bs2VarE2.j;
        long j6 = bs2VarE2.i;
        long j7 = bs2VarE2.h;
        if (j == j5 && jArr2 == (jArr = bs2VarE2.k)) {
            return new bs2(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = bs2VarE2.k;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    bs2VarE2 = bs2VarE2.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        bs2VarE2 = bs2VarE2.e(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        bs2VarE2 = bs2VarE2.e(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return bs2VarE2;
        }
        if (jArr3 != null) {
            bs2VarE = bs2Var;
            for (long j9 : jArr3) {
                bs2VarE = bs2VarE.e(j9);
            }
        } else {
            bs2VarE = bs2Var;
        }
        long j10 = bs2VarE2.j;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    bs2VarE = bs2VarE.e(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    bs2VarE = bs2VarE.e(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return bs2VarE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bs2 e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.j;
        long j6 = j - j5;
        long j7 = 0;
        int iP = t11.p(j6, 0L);
        long j8 = this.i;
        if (iP < 0 || t11.p(j6, 64L) >= 0) {
            int iP2 = t11.p(j6, 64L);
            long j9 = this.h;
            int i2 = 64;
            if (iP2 < 0 || t11.p(j6, 128L) >= 0) {
                int iP3 = t11.p(j6, 128L);
                long[] jArr3 = this.k;
                if (iP3 < 0) {
                    if (jArr3 == null) {
                        return new bs2(this.h, this.i, this.j, new long[]{j});
                    }
                    int iU = ci0.u(j, jArr3);
                    if (iU < 0) {
                        int i3 = -(iU + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        mg.b0(jArr3, jArr4, 0, 0, i3);
                        mg.b0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new bs2(this.h, this.i, this.j, jArr4);
                    }
                } else if (!c(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (t11.p(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    hh1 hh1Var = null;
                    while (true) {
                        if (t11.p(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (hh1Var == null) {
                                hh1Var = new hh1(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((ck1) hh1Var.i).a(((long) i4) + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (hh1Var == null) {
                        jArr = jArr3;
                    } else {
                        ck1 ck1Var = (ck1) hh1Var.i;
                        int i5 = ck1Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = ck1Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                        }
                    }
                    return new bs2(j11, j3, j2, jArr).e(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new bs2(j9 | j13, this.i, this.j, this.k);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new bs2(this.h, j8 | j14, this.j, this.k);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return tp0.B(new as2(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(eu.B(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
