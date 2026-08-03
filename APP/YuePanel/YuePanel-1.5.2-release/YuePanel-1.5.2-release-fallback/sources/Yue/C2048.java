package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class C2048 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean f6537 = false;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.ThreadLocal<java.text.DecimalFormat>[] f6538 = null;

    static {
            r0 = 4
            java.lang.ThreadLocal[] r1 = new java.lang.ThreadLocal[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L10
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L10:
            Yue.C2048.f6538 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.text.DecimalFormat m9583(int r2) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0"
            r0.<init>(r1)
            if (r2 <= 0) goto Lc
            r0.setMinimumFractionDigits(r2)
        Lc:
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP
            r0.setRoundingMode(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m9584(double r2, int r4) {
            java.lang.ThreadLocal<java.text.DecimalFormat>[] r0 = Yue.C2048.f6538
            int r1 = r0.length
            if (r4 >= r1) goto L1d
            r0 = r0[r4]
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L15
            java.text.DecimalFormat r1 = m9583(r4)
            r0.set(r1)
            goto L1a
        L15:
            java.lang.String r4 = "get() ?: default().also(this::set)"
            Yue.C3329.m13905(r1, r4)
        L1a:
            java.text.DecimalFormat r1 = (java.text.DecimalFormat) r1
            goto L21
        L1d:
            java.text.DecimalFormat r1 = m9583(r4)
        L21:
            java.lang.String r2 = r1.format(r2)
            java.lang.String r3 = "format.format(value)"
            Yue.C3329.m13905(r2, r3)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String m9585(double r1, int r3) {
            r0 = 0
            java.text.DecimalFormat r0 = m9583(r0)
            r0.setMaximumFractionDigits(r3)
            java.lang.String r1 = r0.format(r1)
            java.lang.String r2 = "createFormatForDecimals(… }\n        .format(value)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m9586() {
            boolean r0 = Yue.C2048.f6537
            return r0
    }
}
