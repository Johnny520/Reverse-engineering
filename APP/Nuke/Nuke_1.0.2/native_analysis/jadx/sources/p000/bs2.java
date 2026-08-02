package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bs2 implements Iterable, q41 {

    /* JADX INFO: renamed from: l */
    public static final bs2 f1003l = new bs2(0, 0, 0, null);

    /* JADX INFO: renamed from: h */
    public final long f1004h;

    /* JADX INFO: renamed from: i */
    public final long f1005i;

    /* JADX INFO: renamed from: j */
    public final long f1006j;

    /* JADX INFO: renamed from: k */
    public final long[] f1007k;

    public bs2(long j, long j2, long j3, long[] jArr) {
        this.f1004h = j;
        this.f1005i = j2;
        this.f1006j = j3;
        this.f1007k = jArr;
    }

    /* JADX INFO: renamed from: a */
    public final bs2 m584a(bs2 bs2Var) {
        long[] jArr;
        bs2 bs2VarM585b = this;
        bs2 bs2Var2 = f1003l;
        if (bs2Var == bs2Var2) {
            return bs2VarM585b;
        }
        if (bs2VarM585b == bs2Var2) {
            return bs2Var2;
        }
        long j = bs2Var.f1006j;
        long j2 = bs2Var.f1006j;
        long[] jArr2 = bs2Var.f1007k;
        long j3 = bs2Var.f1005i;
        long j4 = bs2Var.f1004h;
        long j5 = bs2VarM585b.f1006j;
        if (j == j5 && jArr2 == (jArr = bs2VarM585b.f1007k)) {
            return new bs2(bs2VarM585b.f1004h & (~j4), bs2VarM585b.f1005i & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                bs2VarM585b = bs2VarM585b.m585b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    bs2VarM585b = bs2VarM585b.m585b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    bs2VarM585b = bs2VarM585b.m585b(((long) i2) + j2 + 64);
                }
            }
        }
        return bs2VarM585b;
    }

    /* JADX INFO: renamed from: b */
    public final bs2 m585b(long j) {
        long[] jArr;
        int iM820u;
        long[] jArr2;
        long j2 = j - this.f1006j;
        if (t11.m5090p(j2, 0L) >= 0 && t11.m5090p(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f1005i;
            if ((j4 & j3) != 0) {
                return new bs2(this.f1004h, j4 & (~j3), this.f1006j, this.f1007k);
            }
        } else if (t11.m5090p(j2, 64L) >= 0 && t11.m5090p(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f1004h;
            if ((j6 & j5) != 0) {
                return new bs2(j6 & (~j5), this.f1005i, this.f1006j, this.f1007k);
            }
        } else if (t11.m5090p(j2, 0L) < 0 && (jArr = this.f1007k) != null && (iM820u = ci0.m820u(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM820u > 0) {
                    AbstractC0460mg.m3087b0(jArr, jArr3, 0, 0, iM820u);
                }
                if (iM820u < i) {
                    AbstractC0460mg.m3087b0(jArr, jArr3, iM820u, iM820u + 1, length);
                }
                jArr2 = jArr3;
            }
            return new bs2(this.f1004h, this.f1005i, this.f1006j, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m586c(long j) {
        long[] jArr;
        long j2 = j - this.f1006j;
        return (t11.m5090p(j2, 0L) < 0 || t11.m5090p(j2, 64L) >= 0) ? (t11.m5090p(j2, 64L) < 0 || t11.m5090p(j2, 128L) >= 0) ? t11.m5090p(j2, 0L) <= 0 && (jArr = this.f1007k) != null && ci0.m820u(j, jArr) >= 0 : ((1 << (((int) j2) + (-64))) & this.f1004h) != 0 : ((1 << ((int) j2)) & this.f1005i) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final bs2 m587d(bs2 bs2Var) {
        bs2 bs2VarM588e;
        long[] jArr;
        bs2 bs2VarM588e2 = this;
        bs2 bs2Var2 = f1003l;
        if (bs2Var == bs2Var2) {
            return bs2VarM588e2;
        }
        if (bs2VarM588e2 == bs2Var2) {
            return bs2Var;
        }
        long j = bs2Var.f1006j;
        long j2 = bs2Var.f1006j;
        long[] jArr2 = bs2Var.f1007k;
        long j3 = bs2Var.f1005i;
        long j4 = bs2Var.f1004h;
        long j5 = bs2VarM588e2.f1006j;
        long j6 = bs2VarM588e2.f1005i;
        long j7 = bs2VarM588e2.f1004h;
        if (j == j5 && jArr2 == (jArr = bs2VarM588e2.f1007k)) {
            return new bs2(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = bs2VarM588e2.f1007k;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    bs2VarM588e2 = bs2VarM588e2.m588e(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        bs2VarM588e2 = bs2VarM588e2.m588e(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        bs2VarM588e2 = bs2VarM588e2.m588e(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return bs2VarM588e2;
        }
        if (jArr3 != null) {
            bs2VarM588e = bs2Var;
            for (long j9 : jArr3) {
                bs2VarM588e = bs2VarM588e.m588e(j9);
            }
        } else {
            bs2VarM588e = bs2Var;
        }
        long j10 = bs2VarM588e2.f1006j;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    bs2VarM588e = bs2VarM588e.m588e(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    bs2VarM588e = bs2VarM588e.m588e(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return bs2VarM588e;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bs2 m588e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.f1006j;
        long j6 = j - j5;
        long j7 = 0;
        int iM5090p = t11.m5090p(j6, 0L);
        long j8 = this.f1005i;
        if (iM5090p < 0 || t11.m5090p(j6, 64L) >= 0) {
            int iM5090p2 = t11.m5090p(j6, 64L);
            long j9 = this.f1004h;
            int i2 = 64;
            if (iM5090p2 < 0 || t11.m5090p(j6, 128L) >= 0) {
                int iM5090p3 = t11.m5090p(j6, 128L);
                long[] jArr3 = this.f1007k;
                if (iM5090p3 < 0) {
                    if (jArr3 == null) {
                        return new bs2(this.f1004h, this.f1005i, this.f1006j, new long[]{j});
                    }
                    int iM820u = ci0.m820u(j, jArr3);
                    if (iM820u < 0) {
                        int i3 = -(iM820u + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        AbstractC0460mg.m3087b0(jArr3, jArr4, 0, 0, i3);
                        AbstractC0460mg.m3087b0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new bs2(this.f1004h, this.f1005i, this.f1006j, jArr4);
                    }
                } else if (!m586c(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (t11.m5090p(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    hh1 hh1Var = null;
                    while (true) {
                        if (t11.m5090p(j5, j10) >= 0) {
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
                                    ((ck1) hh1Var.f4019i).m848a(((long) i4) + j5);
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
                        ck1 ck1Var = (ck1) hh1Var.f4019i;
                        int i5 = ck1Var.f1599b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = ck1Var.f1598a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                        }
                    }
                    return new bs2(j11, j3, j2, jArr).m588e(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new bs2(j9 | j13, this.f1005i, this.f1006j, this.f1007k);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new bs2(this.f1004h, j8 | j14, this.f1006j, this.f1007k);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return tp0.m5340B(new as2(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(this, 10));
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
