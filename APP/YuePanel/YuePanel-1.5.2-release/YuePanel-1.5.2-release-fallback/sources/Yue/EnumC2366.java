package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2366 extends java.lang.Enum<Yue.EnumC2366> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final Yue.EnumC2366 f7750 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final Yue.EnumC2366 f7751 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Yue.EnumC2366 f7752 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Yue.EnumC2366 f7753 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Yue.EnumC2366 f7754 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.EnumC2366[] f7755 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f7756;

    static {
            Yue.ۥ۠ۡۨۢ r0 = new Yue.ۥ۠ۡۨۢ
            r1 = 0
            r2 = 0
            java.lang.String r4 = "DEX_FILES"
            r0.<init>(r4, r1, r2)
            Yue.EnumC2366.f7750 = r0
            Yue.ۥ۠ۡۨۢ r0 = new Yue.ۥ۠ۡۨۢ
            r1 = 1
            r2 = 1
            java.lang.String r4 = "EXTRA_DESCRIPTORS"
            r0.<init>(r4, r1, r2)
            Yue.EnumC2366.f7751 = r0
            Yue.ۥ۠ۡۨۢ r0 = new Yue.ۥ۠ۡۨۢ
            r1 = 2
            r2 = 2
            java.lang.String r4 = "CLASSES"
            r0.<init>(r4, r1, r2)
            Yue.EnumC2366.f7752 = r0
            Yue.ۥ۠ۡۨۢ r0 = new Yue.ۥ۠ۡۨۢ
            r1 = 3
            r2 = 3
            java.lang.String r4 = "METHODS"
            r0.<init>(r4, r1, r2)
            Yue.EnumC2366.f7753 = r0
            Yue.ۥ۠ۡۨۢ r0 = new Yue.ۥ۠ۡۨۢ
            r1 = 4
            r2 = 4
            java.lang.String r4 = "AGGREGATION_COUNT"
            r0.<init>(r4, r1, r2)
            Yue.EnumC2366.f7754 = r0
            Yue.ۥ۠ۡۨۢ[] r0 = m10895()
            Yue.EnumC2366.f7755 = r0
            return
    }

    EnumC2366(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f7756 = r3
            return
    }

    public static Yue.EnumC2366 valueOf(java.lang.String r1) {
            java.lang.Class<Yue.ۥ۠ۡۨۢ> r0 = Yue.EnumC2366.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            Yue.ۥ۠ۡۨۢ r1 = (Yue.EnumC2366) r1
            return r1
    }

    public static Yue.EnumC2366[] values() {
            Yue.ۥ۠ۡۨۢ[] r0 = Yue.EnumC2366.f7755
            java.lang.Object r0 = r0.clone()
            Yue.ۥ۠ۡۨۢ[] r0 = (Yue.EnumC2366[]) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ Yue.EnumC2366[] m10895() {
            Yue.ۥ۠ۡۨۢ r0 = Yue.EnumC2366.f7750
            Yue.ۥ۠ۡۨۢ r1 = Yue.EnumC2366.f7751
            Yue.ۥ۠ۡۨۢ r2 = Yue.EnumC2366.f7752
            Yue.ۥ۠ۡۨۢ r3 = Yue.EnumC2366.f7753
            Yue.ۥ۠ۡۨۢ r4 = Yue.EnumC2366.f7754
            Yue.ۥ۠ۡۨۢ[] r0 = new Yue.EnumC2366[]{r0, r1, r2, r3, r4}
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.EnumC2366 m10896(long r4) {
            Yue.ۥ۠ۡۨۢ[] r0 = values()
            r1 = 0
        L5:
            int r2 = r0.length
            if (r1 >= r2) goto L18
            r2 = r0[r1]
            long r2 = r2.m10897()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L15
            r4 = r0[r1]
            return r4
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported FileSection Type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long m10897() {
            r2 = this;
            long r0 = r2.f7756
            return r0
    }
}
