package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ad0 implements Comparable {
    public static final z8 i = new z8(18);
    public static final long j = pp0.r(4611686018427387903L);
    public static final long k = pp0.r(-4611686018427387903L);
    public static final long l = 9223372036854759646L;
    public final long h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(long j2, long j3) {
        long j4 = j3 / 1000000;
        long jL = pp0.l(j2, j4);
        if (-4611686018426L > jL || jL >= 4611686018427L) {
            return pp0.r(jL);
        }
        long j5 = ((jL * 1000000) + (j3 - (j4 * 1000000))) << 1;
        int i2 = cd0.a;
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strW0 = pv2.w0(String.valueOf(i3), i4);
            int i5 = -1;
            int length = strW0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strW0.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) strW0, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strW0, 0, i7);
            }
        }
        sb.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(long j2) {
        if (d(j2)) {
            return 0;
        }
        return (int) ((((int) j2) & 1) == 1 ? ((j2 >> 1) % 1000) * 1000000 : (j2 >> 1) % 1000000000);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(long j2) {
        return j2 == j || j2 == k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long e(long j2, long j3) {
        int i2 = ((int) j2) & 1;
        if (i2 != (((int) j3) & 1)) {
            return i2 == 1 ? a(j2 >> 1, j3 >> 1) : a(j3 >> 1, j2 >> 1);
        }
        if (i2 == 0) {
            long j4 = (j2 >> 1) + (j3 >> 1);
            if (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) {
                return pp0.r(j4 / 1000000);
            }
            long j5 = j4 << 1;
            int i3 = cd0.a;
            return j5;
        }
        long jL = pp0.l(j2 >> 1, j3 >> 1);
        if (jL == 9223372036854759646L) {
            s.j("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jL == 4611686018427387903L || jL == -4611686018427387903L) {
            return pp0.r(jL);
        }
        if (-4611686018426L > jL || jL >= 4611686018427L) {
            return pp0.r(ci0.E(jL, -4611686018427387903L, 4611686018427387903L));
        }
        long j6 = (jL * 1000000) << 1;
        int i4 = cd0.a;
        return j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long f(long j2, ed0 ed0Var) {
        if (j2 == j) {
            return Long.MAX_VALUE;
        }
        if (j2 == k) {
            return Long.MIN_VALUE;
        }
        return ed0Var.h.convert(j2 >> 1, ((((int) j2) & 1) == 0 ? ed0.NANOSECONDS : ed0.MILLISECONDS).h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long g(long j2) {
        long j3 = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
        int i2 = cd0.a;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j2 = ((ad0) obj).h;
        long j3 = this.h;
        long j4 = j3 ^ j2;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return t11.p(j3, j2);
        }
        int i2 = (((int) j3) & 1) - (((int) j2) & 1);
        return j3 < 0 ? -i2 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof ad0) {
            return this.h == ((ad0) obj).h;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long jG = this.h;
        if (jG == 0) {
            return "0s";
        }
        if (jG == j) {
            return "Infinity";
        }
        if (jG == k) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = jG < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jG < 0) {
            jG = g(jG);
        }
        long jF = f(jG, ed0.DAYS);
        int iF = d(jG) ? 0 : (int) (f(jG, ed0.HOURS) % 24);
        int iF2 = d(jG) ? 0 : (int) (f(jG, ed0.MINUTES) % 60);
        int iF3 = d(jG) ? 0 : (int) (f(jG, ed0.SECONDS) % 60);
        int iC = c(jG);
        boolean z2 = jF != 0;
        boolean z3 = iF != 0;
        boolean z4 = iF2 != 0;
        boolean z5 = (iF3 == 0 && iC == 0) ? false : true;
        if (z2) {
            sb.append(jF);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iF);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iF2);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iF3 != 0 || z2 || z3 || z4) {
                b(sb, iF3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb.append(iC);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
