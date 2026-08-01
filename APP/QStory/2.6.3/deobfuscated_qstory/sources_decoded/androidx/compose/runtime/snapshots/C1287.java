package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import p053.AbstractC6561;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1287 implements Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1287 f3764 = new C1287(0, 0, 0, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long[] f3765;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f3766;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f3767;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f3768;

    public C1287(long j, long j2, long j3, long[] jArr) {
        this.f3768 = j;
        this.f3766 = j2;
        this.f3767 = j3;
        this.f3765 = jArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC6561.m12045(new SnapshotIdSet$iterator$1(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(this, 10));
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
    public final C1287 m2288(C1287 c1287) {
        C1287 c1287M2292;
        long[] jArr;
        C1287 c1287M22922 = this;
        C1287 c12872 = f3764;
        if (c1287 == c12872) {
            return c1287M22922;
        }
        if (c1287M22922 == c12872) {
            return c1287;
        }
        long j = c1287.f3767;
        long j2 = c1287.f3767;
        long[] jArr2 = c1287.f3765;
        long j3 = c1287.f3766;
        long j4 = c1287.f3768;
        long j5 = c1287M22922.f3767;
        long j6 = c1287M22922.f3766;
        long j7 = c1287M22922.f3768;
        if (j == j5 && jArr2 == (jArr = c1287M22922.f3765)) {
            return new C1287(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = c1287M22922.f3765;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    c1287M22922 = c1287M22922.m2292(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        c1287M22922 = c1287M22922.m2292(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        c1287M22922 = c1287M22922.m2292(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return c1287M22922;
        }
        if (jArr3 != null) {
            c1287M2292 = c1287;
            for (long j9 : jArr3) {
                c1287M2292 = c1287M2292.m2292(j9);
            }
        } else {
            c1287M2292 = c1287;
        }
        long j10 = c1287M22922.f3767;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    c1287M2292 = c1287M2292.m2292(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    c1287M2292 = c1287M2292.m2292(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return c1287M2292;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2289(long j) {
        long[] jArr;
        long j2 = j - this.f3767;
        return (AbstractC4395.m8904(j2, 0L) < 0 || AbstractC4395.m8904(j2, 64L) >= 0) ? (AbstractC4395.m8904(j2, 64L) < 0 || AbstractC4395.m8904(j2, 128L) >= 0) ? AbstractC4395.m8904(j2, 0L) <= 0 && (jArr = this.f3765) != null && AbstractC1274.m2232(j, jArr) >= 0 : ((1 << (((int) j2) + (-64))) & this.f3768) != 0 : ((1 << ((int) j2)) & this.f3766) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1287 m2290(long j) {
        long[] jArr;
        int iM2232;
        long[] jArr2;
        long j2 = j - this.f3767;
        if (AbstractC4395.m8904(j2, 0L) >= 0 && AbstractC4395.m8904(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f3766;
            if ((j4 & j3) != 0) {
                return new C1287(this.f3768, j4 & (~j3), this.f3767, this.f3765);
            }
        } else if (AbstractC4395.m8904(j2, 64L) >= 0 && AbstractC4395.m8904(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f3768;
            if ((j6 & j5) != 0) {
                return new C1287(j6 & (~j5), this.f3766, this.f3767, this.f3765);
            }
        } else if (AbstractC4395.m8904(j2, 0L) < 0 && (jArr = this.f3765) != null && (iM2232 = AbstractC1274.m2232(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM2232 > 0) {
                    AbstractC4347.m8842(jArr, jArr3, 0, 0, iM2232);
                }
                if (iM2232 < i) {
                    AbstractC4347.m8842(jArr, jArr3, iM2232, iM2232 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C1287(this.f3768, this.f3766, this.f3767, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1287 m2291(C1287 c1287) {
        long[] jArr;
        C1287 c1287M2290 = this;
        C1287 c12872 = f3764;
        if (c1287 == c12872) {
            return c1287M2290;
        }
        if (c1287M2290 == c12872) {
            return c12872;
        }
        long j = c1287.f3767;
        long j2 = c1287.f3767;
        long[] jArr2 = c1287.f3765;
        long j3 = c1287.f3766;
        long j4 = c1287.f3768;
        long j5 = c1287M2290.f3767;
        if (j == j5 && jArr2 == (jArr = c1287M2290.f3765)) {
            return new C1287(c1287M2290.f3768 & (~j4), c1287M2290.f3766 & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                c1287M2290 = c1287M2290.m2290(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    c1287M2290 = c1287M2290.m2290(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    c1287M2290 = c1287M2290.m2290(((long) i2) + j2 + 64);
                }
            }
        }
        return c1287M2290;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.C1287 m2292(long r30) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1287.m2292(long):androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰世哲");
    }
}
