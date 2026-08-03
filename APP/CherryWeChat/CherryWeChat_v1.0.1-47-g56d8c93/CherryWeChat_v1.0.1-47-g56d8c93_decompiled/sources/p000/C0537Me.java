package p000;

/* JADX INFO: renamed from: Me */
/* JADX INFO: loaded from: classes.dex */
public final class C0537Me implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final long f1747b;

    /* JADX INFO: renamed from: c */
    public static final long f1748c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f1749d = 0;

    /* JADX INFO: renamed from: a */
    public final long f1750a;

    static {
        int i = AbstractC0580Ne.f1877a;
        f1747b = AbstractC0628Oj.m1244m(4611686018427387903L);
        f1748c = AbstractC0628Oj.m1244m(-4611686018427387903L);
    }

    /* JADX INFO: renamed from: a */
    public static final long m1030a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return AbstractC0628Oj.m1244m(AbstractC0828TB.m1640g(j5));
        }
        long j6 = ((j5 * j3) + (j2 - (j4 * j3))) << 1;
        int i = AbstractC0580Ne.f1877a;
        return j6;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1031b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC2374ph.m4813j(i3, "Desired length ", " is less than zero."));
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i7);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static final int m1032c(long j) {
        if (m1033d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1033d(long j) {
        return j == f1747b || j == f1748c;
    }

    /* JADX INFO: renamed from: e */
    public static final long m1034e(long j, long j2) {
        if (m1033d(j)) {
            if (!m1033d(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m1033d(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m1030a(j >> 1, j2 >> 1) : m1030a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        if (i != 0) {
            return AbstractC0628Oj.m1245n(j3);
        }
        if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
            return AbstractC0628Oj.m1244m(j3 / ((long) 1000000));
        }
        long j4 = j3 << 1;
        int i2 = AbstractC0580Ne.f1877a;
        return j4;
    }

    /* JADX INFO: renamed from: f */
    public static final long m1035f(long j, EnumC0666Pe enumC0666Pe) {
        if (j == f1747b) {
            return Long.MAX_VALUE;
        }
        if (j == f1748c) {
            return Long.MIN_VALUE;
        }
        return enumC0666Pe.f2131a.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC0666Pe.NANOSECONDS : EnumC0666Pe.MILLISECONDS).f2131a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C0537Me) obj).f1750a;
        long j2 = this.f1750a;
        long j3 = j2 ^ j;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j2) & 1) - (((int) j) & 1);
            return j2 < 0 ? -i : i;
        }
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0537Me) {
            return this.f1750a == ((C0537Me) obj).f1750a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1750a);
    }

    public final String toString() {
        long j;
        int iM1035f;
        long j2 = this.f1750a;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f1747b) {
            return "Infinity";
        }
        if (j2 == f1748c) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j2 < 0) {
            j2 = ((long) (((int) j2) & 1)) + ((-(j2 >> 1)) << 1);
            int i2 = AbstractC0580Ne.f1877a;
        }
        long jM1035f = m1035f(j2, EnumC0666Pe.DAYS);
        int iM1035f2 = m1033d(j2) ? 0 : (int) (m1035f(j2, EnumC0666Pe.HOURS) % ((long) 24));
        if (m1033d(j2)) {
            j = 0;
            iM1035f = 0;
        } else {
            j = 0;
            iM1035f = (int) (m1035f(j2, EnumC0666Pe.MINUTES) % ((long) 60));
        }
        int iM1035f3 = m1033d(j2) ? 0 : (int) (m1035f(j2, EnumC0666Pe.SECONDS) % ((long) 60));
        int iM1032c = m1032c(j2);
        boolean z2 = jM1035f != j;
        boolean z3 = iM1035f2 != 0;
        boolean z4 = iM1035f != 0;
        boolean z5 = (iM1035f3 == 0 && iM1032c == 0) ? false : true;
        if (z2) {
            sb.append(jM1035f);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM1035f2);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM1035f);
            sb.append('m');
            i = i4;
        }
        if (z5) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM1035f3 != 0 || z2 || z3 || z4) {
                m1031b(sb, iM1035f3, iM1032c, 9, "s", false);
            } else if (iM1032c >= 1000000) {
                m1031b(sb, iM1032c / 1000000, iM1032c % 1000000, 6, "ms", false);
            } else if (iM1032c >= 1000) {
                m1031b(sb, iM1032c / 1000, iM1032c % 1000, 3, "us", false);
            } else {
                sb.append(iM1032c);
                sb.append("ns");
            }
            i = i5;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
