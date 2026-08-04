package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛵᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0848 implements Comparable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0135 f3910 = new C0135(13);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final long f3911 = AbstractC1367.m2768(4611686018427387903L);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final long f3909 = AbstractC1367.m2768(-4611686018427387903L);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final long m1923(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM2770 = AbstractC1367.m2770(j, j3);
        if (-4611686018426L > jM2770 || jM2770 >= 4611686018427L) {
            return AbstractC1367.m2768(jM2770);
        }
        long j4 = ((jM2770 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = AbstractC0542.f2598;
        return j4;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final long m1924(long j, EnumC0426 enumC0426) {
        if (j == f3911) {
            return Long.MAX_VALUE;
        }
        if (j == f3909) {
            return Long.MIN_VALUE;
        }
        return enumC0426.f2176.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC0426.NANOSECONDS : EnumC0426.MILLISECONDS).f2176);
    }
}
