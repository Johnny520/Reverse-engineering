package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n01 implements Comparable, Serializable {
    public static final n01 j = new n01(-31557014167219200L, 0);
    public static final n01 k = new n01(31556889864403199L, 999999999);
    public final long h;
    public final int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n01(long j2, int i) {
        this.h = j2;
        this.i = i;
        if (-31557014167219200L > j2 || j2 >= 31556889864403200L) {
            s.j("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n01 n01Var = (n01) obj;
        n01Var.getClass();
        int iP = t11.p(this.h, n01Var.h);
        return iP != 0 ? iP : t11.o(this.i, n01Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n01)) {
            return false;
        }
        n01 n01Var = (n01) obj;
        return this.h == n01Var.h && this.i == n01Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.i * 51) + Long.hashCode(this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j2;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j3 = this.h;
        long j4 = j3 / 86400;
        if ((j3 ^ 86400) < 0 && j4 * 86400 != j3) {
            j4--;
        }
        long j5 = j3 % 86400;
        int i = (int) (j5 + (86400 & (((j5 ^ 86400) & ((-j5) | j5)) >> 63)));
        long j6 = 719468 + j4;
        if (j6 < 0) {
            long j7 = ((j4 + 719469) / 146097) - 1;
            j2 = j7 * 400;
            j6 += (-j7) * 146097;
        } else {
            j2 = 0;
        }
        long j8 = ((400 * j6) + 591) / 146097;
        long j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        if (j9 < 0) {
            j8--;
            j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        }
        int i2 = (int) j9;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j8 + j2 + ((long) (i3 / 10)));
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
        qp0.w(sb, sb, i4);
        sb.append('-');
        qp0.w(sb, sb, i5);
        sb.append('T');
        qp0.w(sb, sb, i7);
        sb.append(':');
        qp0.w(sb, sb, i9);
        sb.append(':');
        qp0.w(sb, sb, i10);
        int i12 = this.i;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = qp0.k;
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
