package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ad0 implements Comparable {

    /* JADX INFO: renamed from: i */
    public static final C0953z8 f155i = new C0953z8(18);

    /* JADX INFO: renamed from: j */
    public static final long f156j = pp0.m3920r(4611686018427387903L);

    /* JADX INFO: renamed from: k */
    public static final long f157k = pp0.m3920r(-4611686018427387903L);

    /* JADX INFO: renamed from: l */
    public static final long f158l = 9223372036854759646L;

    /* JADX INFO: renamed from: h */
    public final long f159h;

    /* JADX INFO: renamed from: a */
    public static final long m130a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM3914l = pp0.m3914l(j, j3);
        if (-4611686018426L > jM3914l || jM3914l >= 4611686018427L) {
            return pp0.m3920r(jM3914l);
        }
        long j4 = ((jM3914l * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = cd0.f1486a;
        return j4;
    }

    /* JADX INFO: renamed from: b */
    public static final void m131b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strM4010w0 = pv2.m4010w0(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strM4010w0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM4010w0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strM4010w0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM4010w0, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static final int m132c(long j) {
        if (m133d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m133d(long j) {
        return j == f156j || j == f157k;
    }

    /* JADX INFO: renamed from: e */
    public static final long m134e(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m130a(j >> 1, j2 >> 1) : m130a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return pp0.m3920r(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = cd0.f1486a;
            return j4;
        }
        long jM3914l = pp0.m3914l(j >> 1, j2 >> 1);
        if (jM3914l == 9223372036854759646L) {
            C0676s.m4651j("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM3914l == 4611686018427387903L || jM3914l == -4611686018427387903L) {
            return pp0.m3920r(jM3914l);
        }
        if (-4611686018426L > jM3914l || jM3914l >= 4611686018427L) {
            return pp0.m3920r(ci0.m780E(jM3914l, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jM3914l * 1000000) << 1;
        int i3 = cd0.f1486a;
        return j5;
    }

    /* JADX INFO: renamed from: f */
    public static final long m135f(long j, ed0 ed0Var) {
        if (j == f156j) {
            return Long.MAX_VALUE;
        }
        if (j == f157k) {
            return Long.MIN_VALUE;
        }
        return ed0Var.f2398h.convert(j >> 1, ((((int) j) & 1) == 0 ? ed0.NANOSECONDS : ed0.MILLISECONDS).f2398h);
    }

    /* JADX INFO: renamed from: g */
    public static final long m136g(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = cd0.f1486a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((ad0) obj).f159h;
        long j2 = this.f159h;
        long j3 = j2 ^ j;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return t11.m5090p(j2, j);
        }
        int i = (((int) j2) & 1) - (((int) j) & 1);
        return j2 < 0 ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ad0) {
            return this.f159h == ((ad0) obj).f159h;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f159h);
    }

    public final String toString() {
        long jM136g = this.f159h;
        if (jM136g == 0) {
            return "0s";
        }
        if (jM136g == f156j) {
            return "Infinity";
        }
        if (jM136g == f157k) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = jM136g < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jM136g < 0) {
            jM136g = m136g(jM136g);
        }
        long jM135f = m135f(jM136g, ed0.DAYS);
        int iM135f = m133d(jM136g) ? 0 : (int) (m135f(jM136g, ed0.HOURS) % 24);
        int iM135f2 = m133d(jM136g) ? 0 : (int) (m135f(jM136g, ed0.MINUTES) % 60);
        int iM135f3 = m133d(jM136g) ? 0 : (int) (m135f(jM136g, ed0.SECONDS) % 60);
        int iM132c = m132c(jM136g);
        boolean z2 = jM135f != 0;
        boolean z3 = iM135f != 0;
        boolean z4 = iM135f2 != 0;
        boolean z5 = (iM135f3 == 0 && iM132c == 0) ? false : true;
        if (z2) {
            sb.append(jM135f);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM135f);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM135f2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM135f3 != 0 || z2 || z3 || z4) {
                m131b(sb, iM135f3, iM132c, 9, "s", false);
            } else if (iM132c >= 1000000) {
                m131b(sb, iM132c / 1000000, iM132c % 1000000, 6, "ms", false);
            } else if (iM132c >= 1000) {
                m131b(sb, iM132c / 1000, iM132c % 1000, 3, "us", false);
            } else {
                sb.append(iM132c);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
