package androidx.compose.runtime.snapshots;

import androidx.appcompat.app.C0960;
import androidx.collection.C1102;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import p069.AbstractC7390;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2122 implements Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C2122 f4109 = new C2122(0, 0, 0, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long[] f4110;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f4111;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f4112;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f4113;

    public C2122(long j, long j2, long j3, long[] jArr) {
        this.f4113 = j;
        this.f4111 = j2;
        this.f4112 = j3;
        this.f4110 = jArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC7390.m12604(new SnapshotIdSet$iterator$1(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(this, 10));
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2122 m2848(C2122 c2122) {
        C2122 c2122M2852;
        long[] jArr;
        C2122 c2122M28522 = this;
        C2122 c21222 = f4109;
        if (c2122 == c21222) {
            return c2122M28522;
        }
        if (c2122M28522 == c21222) {
            return c2122;
        }
        long j = c2122.f4112;
        long j2 = c2122.f4112;
        long[] jArr2 = c2122.f4110;
        long j3 = c2122.f4111;
        long j4 = c2122.f4113;
        long j5 = c2122M28522.f4112;
        long j6 = c2122M28522.f4111;
        long j7 = c2122M28522.f4113;
        if (j == j5 && jArr2 == (jArr = c2122M28522.f4110)) {
            return new C2122(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = c2122M28522.f4110;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    c2122M28522 = c2122M28522.m2852(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        c2122M28522 = c2122M28522.m2852(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        c2122M28522 = c2122M28522.m2852(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return c2122M28522;
        }
        if (jArr3 != null) {
            c2122M2852 = c2122;
            for (long j9 : jArr3) {
                c2122M2852 = c2122M2852.m2852(j9);
            }
        } else {
            c2122M2852 = c2122;
        }
        long j10 = c2122M28522.f4112;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    c2122M2852 = c2122M2852.m2852(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    c2122M2852 = c2122M2852.m2852(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return c2122M2852;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2849(long j) {
        long[] jArr;
        long j2 = j - this.f4112;
        return (AbstractC5227.m9463(j2, 0L) < 0 || AbstractC5227.m9463(j2, 64L) >= 0) ? (AbstractC5227.m9463(j2, 64L) < 0 || AbstractC5227.m9463(j2, 128L) >= 0) ? AbstractC5227.m9463(j2, 0L) <= 0 && (jArr = this.f4110) != null && AbstractC2109.m2792(j, jArr) >= 0 : ((1 << (((int) j2) + (-64))) & this.f4113) != 0 : ((1 << ((int) j2)) & this.f4111) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2122 m2850(long j) {
        long[] jArr;
        int iM2792;
        long[] jArr2;
        long j2 = j - this.f4112;
        if (AbstractC5227.m9463(j2, 0L) >= 0 && AbstractC5227.m9463(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f4111;
            if ((j4 & j3) != 0) {
                return new C2122(this.f4113, j4 & (~j3), this.f4112, this.f4110);
            }
        } else if (AbstractC5227.m9463(j2, 64L) >= 0 && AbstractC5227.m9463(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f4113;
            if ((j6 & j5) != 0) {
                return new C2122(j6 & (~j5), this.f4111, this.f4112, this.f4110);
            }
        } else if (AbstractC5227.m9463(j2, 0L) < 0 && (jArr = this.f4110) != null && (iM2792 = AbstractC2109.m2792(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM2792 > 0) {
                    AbstractC5179.m9401(jArr, jArr3, 0, 0, iM2792);
                }
                if (iM2792 < i) {
                    AbstractC5179.m9401(jArr, jArr3, iM2792, iM2792 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C2122(this.f4113, this.f4111, this.f4112, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2122 m2851(C2122 c2122) {
        long[] jArr;
        C2122 c2122M2850 = this;
        C2122 c21222 = f4109;
        if (c2122 == c21222) {
            return c2122M2850;
        }
        if (c2122M2850 == c21222) {
            return c21222;
        }
        long j = c2122.f4112;
        long j2 = c2122.f4112;
        long[] jArr2 = c2122.f4110;
        long j3 = c2122.f4111;
        long j4 = c2122.f4113;
        long j5 = c2122M2850.f4112;
        if (j == j5 && jArr2 == (jArr = c2122M2850.f4110)) {
            return new C2122(c2122M2850.f4113 & (~j4), c2122M2850.f4111 & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                c2122M2850 = c2122M2850.m2850(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    c2122M2850 = c2122M2850.m2850(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    c2122M2850 = c2122M2850.m2850(((long) i2) + j2 + 64);
                }
            }
        }
        return c2122M2850;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2122 m2852(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.f4112;
        long j6 = j - j5;
        long j7 = 0;
        int iM9463 = AbstractC5227.m9463(j6, 0L);
        long j8 = this.f4111;
        if (iM9463 < 0 || AbstractC5227.m9463(j6, 64L) >= 0) {
            int iM94632 = AbstractC5227.m9463(j6, 64L);
            long j9 = this.f4113;
            int i2 = 64;
            if (iM94632 < 0 || AbstractC5227.m9463(j6, 128L) >= 0) {
                int iM94633 = AbstractC5227.m9463(j6, 128L);
                long[] jArr3 = this.f4110;
                if (iM94633 < 0) {
                    if (jArr3 == null) {
                        return new C2122(this.f4113, this.f4111, this.f4112, new long[]{j});
                    }
                    int iM2792 = AbstractC2109.m2792(j, jArr3);
                    if (iM2792 < 0) {
                        int i3 = -(iM2792 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        AbstractC5179.m9401(jArr3, jArr4, 0, 0, i3);
                        AbstractC5179.m9401(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new C2122(this.f4113, this.f4111, this.f4112, jArr4);
                    }
                } else if (!m2849(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (AbstractC5227.m9463(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    C0960 c0960 = null;
                    while (true) {
                        if (AbstractC5227.m9463(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (c0960 == null) {
                                c0960 = new C0960(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((C1102) c0960.f702).m1379(((long) i4) + j5);
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
                    if (c0960 == null) {
                        jArr = jArr3;
                    } else {
                        C1102 c1102 = (C1102) c0960.f702;
                        int i5 = c1102.f1275;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = c1102.f1276;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                        }
                    }
                    return new C2122(j11, j3, j2, jArr).m2852(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new C2122(j9 | j13, this.f4111, this.f4112, this.f4110);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new C2122(this.f4113, j8 | j14, this.f4112, this.f4110);
            }
        }
        return this;
    }
}
