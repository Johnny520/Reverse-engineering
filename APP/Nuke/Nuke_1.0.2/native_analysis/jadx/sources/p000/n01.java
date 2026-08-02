package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n01 implements Comparable, Serializable {

    /* JADX INFO: renamed from: j */
    public static final n01 f6949j = new n01(-31557014167219200L, 0);

    /* JADX INFO: renamed from: k */
    public static final n01 f6950k = new n01(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: h */
    public final long f6951h;

    /* JADX INFO: renamed from: i */
    public final int f6952i;

    public n01(long j, int i) {
        this.f6951h = j;
        this.f6952i = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            C0676s.m4651j("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n01 n01Var = (n01) obj;
        n01Var.getClass();
        int iM5090p = t11.m5090p(this.f6951h, n01Var.f6951h);
        return iM5090p != 0 ? iM5090p : t11.m5089o(this.f6952i, n01Var.f6952i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n01)) {
            return false;
        }
        n01 n01Var = (n01) obj;
        return this.f6951h == n01Var.f6951h && this.f6952i == n01Var.f6952i;
    }

    public final int hashCode() {
        return (this.f6952i * 51) + Long.hashCode(this.f6951h);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.f6951h;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        qp0.m4268w(sb, sb, i4);
        sb.append('-');
        qp0.m4268w(sb, sb, i5);
        sb.append('T');
        qp0.m4268w(sb, sb, i7);
        sb.append(':');
        qp0.m4268w(sb, sb, i9);
        sb.append(':');
        qp0.m4268w(sb, sb, i10);
        int i12 = this.f6952i;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = qp0.f9069k;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String strValueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
