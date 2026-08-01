package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q21 implements Iterable, p40 {

    /* JADX INFO: renamed from: h */
    public static final q21 f5028h = new q21(0, 0, 0, null);

    /* JADX INFO: renamed from: d */
    public final long f5029d;

    /* JADX INFO: renamed from: e */
    public final long f5030e;

    /* JADX INFO: renamed from: f */
    public final long f5031f;

    /* JADX INFO: renamed from: g */
    public final long[] f5032g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q21(long j, long j2, long j3, long[] jArr) {
        this.f5029d = j;
        this.f5030e = j2;
        this.f5031f = j3;
        this.f5032g = jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final q21 m3189a(q21 q21Var) {
        long[] jArr;
        q21 q21VarM3190b = this;
        q21 q21Var2 = f5028h;
        if (q21Var == q21Var2) {
            return q21VarM3190b;
        }
        if (q21VarM3190b == q21Var2) {
            return q21Var2;
        }
        long j = q21Var.f5031f;
        long j2 = q21Var.f5031f;
        long[] jArr2 = q21Var.f5032g;
        long j3 = q21Var.f5030e;
        long j4 = q21Var.f5029d;
        long j5 = q21VarM3190b.f5031f;
        if (j == j5 && jArr2 == (jArr = q21VarM3190b.f5032g)) {
            return new q21(q21VarM3190b.f5029d & (~j4), q21VarM3190b.f5030e & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                q21VarM3190b = q21VarM3190b.m3190b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    q21VarM3190b = q21VarM3190b.m3190b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    q21VarM3190b = q21VarM3190b.m3190b(((long) i2) + j2 + 64);
                }
            }
        }
        return q21VarM3190b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final q21 m3190b(long j) {
        long[] jArr;
        int iM1209h;
        long[] jArr2;
        long j2 = j - this.f5031f;
        if (p30.m3009s(j2, 0L) >= 0 && p30.m3009s(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f5030e;
            if ((j4 & j3) != 0) {
                return new q21(this.f5029d, j4 & (~j3), this.f5031f, this.f5032g);
            }
        } else if (p30.m3009s(j2, 64L) >= 0 && p30.m3009s(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f5029d;
            if ((j6 & j5) != 0) {
                return new q21(j6 & (~j5), this.f5030e, this.f5031f, this.f5032g);
            }
        } else if (p30.m3009s(j2, 0L) < 0 && (jArr = this.f5032g) != null && (iM1209h = g60.m1209h(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM1209h > 0) {
                    AbstractC0201f9.m1056b0(jArr, jArr3, 0, 0, iM1209h);
                }
                if (iM1209h < i) {
                    AbstractC0201f9.m1056b0(jArr, jArr3, iM1209h, iM1209h + 1, length);
                }
                jArr2 = jArr3;
            }
            return new q21(this.f5029d, this.f5030e, this.f5031f, jArr2);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m3191c(long j) {
        long[] jArr;
        long j2 = j - this.f5031f;
        return (p30.m3009s(j2, 0L) < 0 || p30.m3009s(j2, 64L) >= 0) ? (p30.m3009s(j2, 64L) < 0 || p30.m3009s(j2, 128L) >= 0) ? p30.m3009s(j2, 0L) <= 0 && (jArr = this.f5032g) != null && g60.m1209h(j, jArr) >= 0 : ((1 << (((int) j2) + (-64))) & this.f5029d) != 0 : ((1 << ((int) j2)) & this.f5030e) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final q21 m3192d(q21 q21Var) {
        q21 q21VarM3193e;
        long[] jArr;
        q21 q21VarM3193e2 = this;
        q21 q21Var2 = f5028h;
        if (q21Var == q21Var2) {
            return q21VarM3193e2;
        }
        if (q21VarM3193e2 == q21Var2) {
            return q21Var;
        }
        long j = q21Var.f5031f;
        long j2 = q21Var.f5031f;
        long[] jArr2 = q21Var.f5032g;
        long j3 = q21Var.f5030e;
        long j4 = q21Var.f5029d;
        long j5 = q21VarM3193e2.f5031f;
        long j6 = q21VarM3193e2.f5030e;
        long j7 = q21VarM3193e2.f5029d;
        if (j == j5 && jArr2 == (jArr = q21VarM3193e2.f5032g)) {
            return new q21(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = q21VarM3193e2.f5032g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    q21VarM3193e2 = q21VarM3193e2.m3193e(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        q21VarM3193e2 = q21VarM3193e2.m3193e(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        q21VarM3193e2 = q21VarM3193e2.m3193e(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return q21VarM3193e2;
        }
        if (jArr3 != null) {
            q21VarM3193e = q21Var;
            for (long j9 : jArr3) {
                q21VarM3193e = q21VarM3193e.m3193e(j9);
            }
        } else {
            q21VarM3193e = q21Var;
        }
        long j10 = q21VarM3193e2.f5031f;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    q21VarM3193e = q21VarM3193e.m3193e(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    q21VarM3193e = q21VarM3193e.m3193e(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return q21VarM3193e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q21 m3193e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.f5031f;
        long j6 = j - j5;
        long j7 = 0;
        int iM3009s = p30.m3009s(j6, 0L);
        long j8 = this.f5030e;
        if (iM3009s < 0 || p30.m3009s(j6, 64L) >= 0) {
            int iM3009s2 = p30.m3009s(j6, 64L);
            long j9 = this.f5029d;
            int i2 = 64;
            if (iM3009s2 < 0 || p30.m3009s(j6, 128L) >= 0) {
                int iM3009s3 = p30.m3009s(j6, 128L);
                long[] jArr3 = this.f5032g;
                if (iM3009s3 < 0) {
                    if (jArr3 == null) {
                        return new q21(this.f5029d, this.f5030e, this.f5031f, new long[]{j});
                    }
                    int iM1209h = g60.m1209h(j, jArr3);
                    if (iM1209h < 0) {
                        int i3 = -(iM1209h + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        AbstractC0201f9.m1056b0(jArr3, jArr4, 0, 0, i3);
                        AbstractC0201f9.m1056b0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new q21(this.f5029d, this.f5030e, this.f5031f, jArr4);
                    }
                } else if (!m3191c(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (p30.m3009s(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    C0910x1 c0910x1 = null;
                    while (true) {
                        if (p30.m3009s(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (c0910x1 == null) {
                                c0910x1 = new C0910x1(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((yg0) c0910x1.f7232e).m5257a(((long) i4) + j5);
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
                    if (c0910x1 == null) {
                        jArr = jArr3;
                    } else {
                        yg0 yg0Var = (yg0) c0910x1.f7232e;
                        int i5 = yg0Var.f7622b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = yg0Var.f7621a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                        }
                    }
                    return new q21(j11, j3, j2, jArr).m3193e(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new q21(j9 | j13, this.f5030e, this.f5031f, this.f5032g);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new q21(this.f5029d, j8 | j14, this.f5031f, this.f5032g);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return v50.m4408n(new p21(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(this));
        Iterator it = iterator();
        while (true) {
            q01 q01Var = (q01) it;
            if (!q01Var.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) q01Var.next()).longValue()));
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
