package p158f0;

import java.util.ArrayList;
import java.util.Iterator;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0974n;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p122Y2.InterfaceC1766a;
import p128a.AbstractC1785a;
import p186k.C2441w;

/* JADX INFO: renamed from: f0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2080l implements Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: h */
    public static final C2080l f6962h = new C2080l(0, 0, 0, null);

    /* JADX INFO: renamed from: d */
    public final long f6963d;

    /* JADX INFO: renamed from: e */
    public final long f6964e;

    /* JADX INFO: renamed from: f */
    public final long f6965f;

    /* JADX INFO: renamed from: g */
    public final long[] f6966g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2080l(long j5, long j6, long j7, long[] jArr) {
        this.f6963d = j5;
        this.f6964e = j6;
        this.f6965f = j7;
        this.f6966g = jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2080l m3820a(C2080l c2080l) {
        C2080l c2080lM3821b;
        long j5;
        long[] jArr;
        C2080l c2080l2 = f6962h;
        if (c2080l == c2080l2) {
            return this;
        }
        if (this == c2080l2) {
            return c2080l2;
        }
        long j6 = c2080l.f6965f;
        long j7 = c2080l.f6965f;
        long[] jArr2 = c2080l.f6966g;
        long j8 = c2080l.f6964e;
        long j9 = c2080l.f6963d;
        long j10 = this.f6965f;
        if (j6 == j10 && jArr2 == (jArr = this.f6966g)) {
            return new C2080l(this.f6963d & (~j9), this.f6964e & (~j8), j10, jArr);
        }
        if (jArr2 != null) {
            c2080lM3821b = this;
            for (long j11 : jArr2) {
                c2080lM3821b = c2080lM3821b.m3821b(j11);
            }
        } else {
            c2080lM3821b = this;
        }
        long j12 = 0;
        if (j8 != 0) {
            int i5 = 0;
            while (i5 < 64) {
                if (((1 << i5) & j8) != j12) {
                    j5 = j12;
                    c2080lM3821b = c2080lM3821b.m3821b(((long) i5) + j7);
                } else {
                    j5 = j12;
                }
                i5++;
                j12 = j5;
            }
        }
        long j13 = j12;
        if (j9 != j13) {
            for (int i6 = 0; i6 < 64; i6++) {
                if (((1 << i6) & j9) != j13) {
                    c2080lM3821b = c2080lM3821b.m3821b(((long) i6) + j7 + ((long) 64));
                }
            }
        }
        return c2080lM3821b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2080l m3821b(long j5) {
        long[] jArr;
        int iM3852c;
        long[] jArr2;
        long j6 = j5 - this.f6965f;
        long j7 = 0;
        if (AbstractC1665j.m2988h(j6, j7) >= 0 && AbstractC1665j.m2988h(j6, 64) < 0) {
            long j8 = 1 << ((int) j6);
            long j9 = this.f6964e;
            if ((j9 & j8) != 0) {
                return new C2080l(this.f6963d, j9 & (~j8), this.f6965f, this.f6966g);
            }
        } else if (AbstractC1665j.m2988h(j6, 64) >= 0 && AbstractC1665j.m2988h(j6, 128) < 0) {
            long j10 = 1 << (((int) j6) - 64);
            long j11 = this.f6963d;
            if ((j11 & j10) != 0) {
                return new C2080l(j11 & (~j10), this.f6964e, this.f6965f, this.f6966g);
            }
        } else if (AbstractC1665j.m2988h(j6, j7) < 0 && (jArr = this.f6966g) != null && (iM3852c = AbstractC2086r.m3852c(j5, jArr)) >= 0) {
            int length = jArr.length;
            int i5 = length - 1;
            if (i5 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i5];
                if (iM3852c > 0) {
                    AbstractC0972l.m1992P(jArr, jArr3, 0, 0, iM3852c);
                }
                if (iM3852c < i5) {
                    AbstractC0972l.m1992P(jArr, jArr3, iM3852c, iM3852c + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C2080l(this.f6963d, this.f6964e, this.f6965f, jArr2);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m3822c(long j5) {
        long[] jArr;
        long j6 = j5 - this.f6965f;
        long j7 = 0;
        return (AbstractC1665j.m2988h(j6, j7) < 0 || AbstractC1665j.m2988h(j6, (long) 64) >= 0) ? (AbstractC1665j.m2988h(j6, (long) 64) < 0 || AbstractC1665j.m2988h(j6, (long) 128) >= 0) ? AbstractC1665j.m2988h(j6, j7) <= 0 && (jArr = this.f6966g) != null && AbstractC2086r.m3852c(j5, jArr) >= 0 : ((1 << (((int) j6) - 64)) & this.f6963d) != 0 : ((1 << ((int) j6)) & this.f6964e) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C2080l m3823d(C2080l c2080l) {
        C2080l c2080lM3824e;
        C2080l c2080lM3824e2;
        long[] jArr;
        C2080l c2080l2 = f6962h;
        if (c2080l == c2080l2) {
            return this;
        }
        if (this == c2080l2) {
            return c2080l;
        }
        long j5 = c2080l.f6965f;
        long j6 = c2080l.f6965f;
        long[] jArr2 = c2080l.f6966g;
        long j7 = c2080l.f6964e;
        long j8 = c2080l.f6963d;
        long j9 = this.f6965f;
        long j10 = this.f6964e;
        long j11 = this.f6963d;
        if (j5 == j9 && jArr2 == (jArr = this.f6966g)) {
            return new C2080l(j11 | j8, j10 | j7, j9, jArr);
        }
        int i5 = 0;
        long[] jArr3 = this.f6966g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                c2080lM3824e = this;
                for (long j12 : jArr2) {
                    c2080lM3824e = c2080lM3824e.m3824e(j12);
                }
            } else {
                c2080lM3824e = this;
            }
            if (j7 != 0) {
                for (int i6 = 0; i6 < 64; i6++) {
                    if (((1 << i6) & j7) != 0) {
                        c2080lM3824e = c2080lM3824e.m3824e(((long) i6) + j6);
                    }
                }
            }
            if (j8 != 0) {
                while (i5 < 64) {
                    if (((1 << i5) & j8) != 0) {
                        c2080lM3824e = c2080lM3824e.m3824e(((long) i5) + j6 + ((long) 64));
                    }
                    i5++;
                }
            }
            return c2080lM3824e;
        }
        if (jArr3 != null) {
            c2080lM3824e2 = c2080l;
            for (long j13 : jArr3) {
                c2080lM3824e2 = c2080lM3824e2.m3824e(j13);
            }
        } else {
            c2080lM3824e2 = c2080l;
        }
        long j14 = this.f6965f;
        if (j10 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j10) != 0) {
                    c2080lM3824e2 = c2080lM3824e2.m3824e(((long) i7) + j14);
                }
            }
        }
        if (j11 != 0) {
            while (i5 < 64) {
                if (((1 << i5) & j11) != 0) {
                    c2080lM3824e2 = c2080lM3824e2.m3824e(((long) i5) + j14 + ((long) 64));
                }
                i5++;
            }
        }
        return c2080lM3824e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2080l m3824e(long j5) {
        long[] jArr;
        long j6;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j7 = this.f6965f;
        long j8 = j5 - j7;
        long j9 = 0;
        int iM2988h = AbstractC1665j.m2988h(j8, j9);
        long j10 = this.f6964e;
        int i5 = 64;
        long j11 = 0;
        if (iM2988h < 0 || AbstractC1665j.m2988h(j8, 64) >= 0) {
            long j12 = 64;
            int iM2988h2 = AbstractC1665j.m2988h(j8, j12);
            long j13 = this.f6963d;
            if (iM2988h2 < 0 || AbstractC1665j.m2988h(j8, 128) >= 0) {
                long j14 = 128;
                int iM2988h3 = AbstractC1665j.m2988h(j8, j14);
                long[] jArr5 = this.f6966g;
                if (iM2988h3 < 0) {
                    if (jArr5 == null) {
                        return new C2080l(this.f6963d, this.f6964e, this.f6965f, new long[]{j5});
                    }
                    int iM3852c = AbstractC2086r.m3852c(j5, jArr5);
                    if (iM3852c < 0) {
                        int i6 = -(iM3852c + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        AbstractC0972l.m1992P(jArr5, jArr6, 0, 0, i6);
                        AbstractC0972l.m1992P(jArr5, jArr6, i6 + 1, i6, length);
                        jArr6[i6] = j5;
                        return new C2080l(this.f6963d, this.f6964e, this.f6965f, jArr6);
                    }
                } else if (!m3822c(j5)) {
                    long j15 = 1;
                    long j16 = ((j5 + j15) / j12) * j12;
                    if (AbstractC1665j.m2988h(j16, j9) < 0) {
                        j16 = (Long.MAX_VALUE - j14) + j15;
                    }
                    long j17 = j7;
                    long j18 = j13;
                    C1753n c1753n = null;
                    while (true) {
                        if (AbstractC1665j.m2988h(j17, j16) >= 0) {
                            jArr = jArr5;
                            j6 = j17;
                            j11 = j10;
                            break;
                        }
                        if (j10 != 0) {
                            if (c1753n == null) {
                                c1753n = new C1753n(jArr5);
                            }
                            int i7 = 0;
                            while (i7 < i5) {
                                if ((j10 & (1 << i7)) != 0) {
                                    jArr4 = jArr5;
                                    ((C2441w) c1753n.f6028e).m4351a(((long) i7) + j17);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i7++;
                                jArr5 = jArr4;
                                i5 = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j18 == 0) {
                            j6 = j16;
                            jArr = jArr7;
                            break;
                        }
                        j17 += j12;
                        jArr5 = jArr7;
                        j10 = j18;
                        i5 = 64;
                        j18 = 0;
                    }
                    if (c1753n == null) {
                        jArr2 = jArr;
                    } else {
                        C2441w c2441w = (C2441w) c1753n.f6028e;
                        int i8 = c2441w.f7886b;
                        if (i8 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i8];
                            long[] jArr9 = c2441w.f7885a;
                            for (int i9 = 0; i9 < i8; i9++) {
                                jArr8[i9] = jArr9[i9];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                        }
                    }
                    return new C2080l(j18, j11, j6, jArr2).m3824e(j5);
                }
            } else {
                long j19 = 1 << (((int) j8) - 64);
                if ((j13 & j19) == 0) {
                    return new C2080l(j13 | j19, this.f6964e, this.f6965f, this.f6966g);
                }
            }
        } else {
            long j20 = 1 << ((int) j8);
            if ((j10 & j20) == 0) {
                return new C2080l(this.f6963d, j10 | j20, this.f6965f, this.f6966g);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC1785a.m3252m(new C2079k(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = arrayList.get(i6);
            i5++;
            if (i5 > 1) {
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
