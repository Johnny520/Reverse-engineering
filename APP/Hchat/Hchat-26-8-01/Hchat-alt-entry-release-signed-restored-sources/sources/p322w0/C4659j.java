package p322w0;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import ng.C3013k;
import okhttp3.HttpUrl;
import p069f.C0967y;
import p080fb.AbstractC1184v0;
import p114hg.InterfaceC1711a;
import p174m.C2571a;
import tf.AbstractC4165l;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: w0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4659j implements Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: k */
    public static final C4659j f15501k = new C4659j(0, 0, 0, null);

    /* JADX INFO: renamed from: g */
    public final long f15502g;

    /* JADX INFO: renamed from: h */
    public final long f15503h;

    /* JADX INFO: renamed from: i */
    public final long f15504i;

    /* JADX INFO: renamed from: j */
    public final long[] f15505j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4659j(long j3, long j4, long j5, long[] jArr) {
        this.f15502g = j3;
        this.f15503h = j4;
        this.f15504i = j5;
        this.f15505j = jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C4659j m9115a(C4659j c4659j) {
        C4659j c4659jM9116c;
        long j3;
        long[] jArr;
        C4659j c4659j2 = f15501k;
        if (c4659j == c4659j2) {
            return this;
        }
        if (this == c4659j2) {
            return c4659j2;
        }
        long j4 = c4659j.f15504i;
        long j5 = c4659j.f15504i;
        long[] jArr2 = c4659j.f15505j;
        long j10 = c4659j.f15503h;
        long j11 = c4659j.f15502g;
        long j12 = this.f15504i;
        if (j4 == j12 && jArr2 == (jArr = this.f15505j)) {
            return new C4659j(this.f15502g & (~j11), this.f15503h & (~j10), j12, jArr);
        }
        if (jArr2 != null) {
            c4659jM9116c = this;
            for (long j13 : jArr2) {
                c4659jM9116c = c4659jM9116c.m9116c(j13);
            }
        } else {
            c4659jM9116c = this;
        }
        long j14 = 0;
        if (j10 != 0) {
            int i9 = 0;
            while (i9 < 64) {
                if (((1 << i9) & j10) != j14) {
                    j3 = j14;
                    c4659jM9116c = c4659jM9116c.m9116c(((long) i9) + j5);
                } else {
                    j3 = j14;
                }
                i9++;
                j14 = j3;
            }
        }
        long j15 = j14;
        if (j11 != j15) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j11) != j15) {
                    c4659jM9116c = c4659jM9116c.m9116c(((long) i10) + j5 + ((long) 64));
                }
            }
        }
        return c4659jM9116c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C4659j m9116c(long j3) {
        long[] jArr;
        int iM9147c;
        long[] jArr2;
        long j4 = j3 - this.f15504i;
        long j5 = 0;
        if (AbstractC1416l.m3828d(j4, j5) >= 0 && AbstractC1416l.m3828d(j4, 64) < 0) {
            long j10 = 1 << ((int) j4);
            long j11 = this.f15503h;
            if ((j11 & j10) != 0) {
                return new C4659j(this.f15502g, j11 & (~j10), this.f15504i, this.f15505j);
            }
        } else if (AbstractC1416l.m3828d(j4, 64) >= 0 && AbstractC1416l.m3828d(j4, 128) < 0) {
            long j12 = 1 << (((int) j4) - 64);
            long j13 = this.f15502g;
            if ((j13 & j12) != 0) {
                return new C4659j(j13 & (~j12), this.f15503h, this.f15504i, this.f15505j);
            }
        } else if (AbstractC1416l.m3828d(j4, j5) < 0 && (jArr = this.f15505j) != null && (iM9147c = AbstractC4666q.m9147c(j3, jArr)) >= 0) {
            int length = jArr.length;
            int i9 = length - 1;
            if (i9 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i9];
                if (iM9147c > 0) {
                    AbstractC4165l.m8382q0(jArr, jArr3, 0, 0, iM9147c);
                }
                if (iM9147c < i9) {
                    AbstractC4165l.m8382q0(jArr, jArr3, iM9147c, iM9147c + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C4659j(this.f15502g, this.f15503h, this.f15504i, jArr2);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m9117d(long j3) {
        long[] jArr;
        long j4 = j3 - this.f15504i;
        long j5 = 0;
        return (AbstractC1416l.m3828d(j4, j5) < 0 || AbstractC1416l.m3828d(j4, (long) 64) >= 0) ? (AbstractC1416l.m3828d(j4, (long) 64) < 0 || AbstractC1416l.m3828d(j4, (long) 128) >= 0) ? AbstractC1416l.m3828d(j4, j5) <= 0 && (jArr = this.f15505j) != null && AbstractC4666q.m9147c(j3, jArr) >= 0 : ((1 << (((int) j4) - 64)) & this.f15502g) != 0 : ((1 << ((int) j4)) & this.f15503h) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C4659j m9118e(C4659j c4659j) {
        C4659j c4659jM9119f;
        C4659j c4659jM9119f2;
        long[] jArr;
        C4659j c4659j2 = f15501k;
        if (c4659j == c4659j2) {
            return this;
        }
        if (this == c4659j2) {
            return c4659j;
        }
        long j3 = c4659j.f15504i;
        long j4 = c4659j.f15504i;
        long[] jArr2 = c4659j.f15505j;
        long j5 = c4659j.f15503h;
        long j10 = c4659j.f15502g;
        long j11 = this.f15504i;
        long j12 = this.f15503h;
        long j13 = this.f15502g;
        if (j3 == j11 && jArr2 == (jArr = this.f15505j)) {
            return new C4659j(j13 | j10, j12 | j5, j11, jArr);
        }
        int i9 = 0;
        long[] jArr3 = this.f15505j;
        if (jArr3 != null) {
            if (jArr2 != null) {
                c4659jM9119f = this;
                for (long j14 : jArr2) {
                    c4659jM9119f = c4659jM9119f.m9119f(j14);
                }
            } else {
                c4659jM9119f = this;
            }
            if (j5 != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if (((1 << i10) & j5) != 0) {
                        c4659jM9119f = c4659jM9119f.m9119f(((long) i10) + j4);
                    }
                }
            }
            if (j10 != 0) {
                while (i9 < 64) {
                    if (((1 << i9) & j10) != 0) {
                        c4659jM9119f = c4659jM9119f.m9119f(((long) i9) + j4 + ((long) 64));
                    }
                    i9++;
                }
            }
            return c4659jM9119f;
        }
        if (jArr3 != null) {
            c4659jM9119f2 = c4659j;
            for (long j15 : jArr3) {
                c4659jM9119f2 = c4659jM9119f2.m9119f(j15);
            }
        } else {
            c4659jM9119f2 = c4659j;
        }
        long j16 = this.f15504i;
        if (j12 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != 0) {
                    c4659jM9119f2 = c4659jM9119f2.m9119f(((long) i11) + j16);
                }
            }
        }
        if (j13 != 0) {
            while (i9 < 64) {
                if (((1 << i9) & j13) != 0) {
                    c4659jM9119f2 = c4659jM9119f2.m9119f(((long) i9) + j16 + ((long) 64));
                }
                i9++;
            }
        }
        return c4659jM9119f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4659j m9119f(long j3) {
        long[] jArr;
        long j4;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j5 = this.f15504i;
        long j10 = j3 - j5;
        long j11 = 0;
        int iM3828d = AbstractC1416l.m3828d(j10, j11);
        long j12 = this.f15503h;
        int i9 = 64;
        long j13 = 0;
        if (iM3828d < 0 || AbstractC1416l.m3828d(j10, 64) >= 0) {
            long j14 = 64;
            int iM3828d2 = AbstractC1416l.m3828d(j10, j14);
            long j15 = this.f15502g;
            if (iM3828d2 < 0 || AbstractC1416l.m3828d(j10, 128) >= 0) {
                long j16 = 128;
                int iM3828d3 = AbstractC1416l.m3828d(j10, j16);
                long[] jArr5 = this.f15505j;
                if (iM3828d3 < 0) {
                    if (jArr5 == null) {
                        return new C4659j(this.f15502g, this.f15503h, this.f15504i, new long[]{j3});
                    }
                    int iM9147c = AbstractC4666q.m9147c(j3, jArr5);
                    if (iM9147c < 0) {
                        int i10 = -(iM9147c + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        AbstractC4165l.m8382q0(jArr5, jArr6, 0, 0, i10);
                        AbstractC4165l.m8382q0(jArr5, jArr6, i10 + 1, i10, length);
                        jArr6[i10] = j3;
                        return new C4659j(this.f15502g, this.f15503h, this.f15504i, jArr6);
                    }
                } else if (!m9117d(j3)) {
                    long j17 = 1;
                    long j18 = ((j3 + j17) / j14) * j14;
                    if (AbstractC1416l.m3828d(j18, j11) < 0) {
                        j18 = (Long.MAX_VALUE - j16) + j17;
                    }
                    long j19 = j5;
                    long j20 = j15;
                    C2571a c2571a = null;
                    while (true) {
                        if (AbstractC1416l.m3828d(j19, j18) >= 0) {
                            jArr = jArr5;
                            j4 = j19;
                            j13 = j12;
                            break;
                        }
                        if (j12 != 0) {
                            if (c2571a == null) {
                                c2571a = new C2571a(jArr5);
                            }
                            int i11 = 0;
                            while (i11 < i9) {
                                if ((j12 & (1 << i11)) != 0) {
                                    jArr4 = jArr5;
                                    ((C0967y) c2571a.f8339h).m2386a(((long) i11) + j19);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i11++;
                                jArr5 = jArr4;
                                i9 = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j20 == 0) {
                            j4 = j18;
                            jArr = jArr7;
                            break;
                        }
                        j19 += j14;
                        jArr5 = jArr7;
                        j12 = j20;
                        i9 = 64;
                        j20 = 0;
                    }
                    if (c2571a == null) {
                        jArr2 = jArr;
                    } else {
                        C0967y c0967y = (C0967y) c2571a.f8339h;
                        int i12 = c0967y.f3044b;
                        if (i12 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i12];
                            long[] jArr9 = c0967y.f3043a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                jArr8[i13] = jArr9[i13];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                        }
                    }
                    return new C4659j(j20, j13, j4, jArr2).m9119f(j3);
                }
            } else {
                long j21 = 1 << (((int) j10) - 64);
                if ((j15 & j21) == 0) {
                    return new C4659j(j15 | j21, this.f15503h, this.f15504i, this.f15505j);
                }
            }
        } else {
            long j22 = 1 << ((int) j10);
            if ((j12 & j22) == 0) {
                return new C4659j(this.f15502g, j12 | j22, this.f15504i, this.f15505j);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC1184v0.m3175B(new C4658i(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(this));
        Iterator it = iterator();
        while (true) {
            C3013k c3013k = (C3013k) it;
            if (!c3013k.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) c3013k.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i9++;
            if (i9 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
