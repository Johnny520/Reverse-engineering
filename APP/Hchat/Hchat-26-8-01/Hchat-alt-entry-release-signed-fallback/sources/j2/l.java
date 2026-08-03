package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f6712a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f6713b = 0;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            j2.l.f6712a = r0
            r0 = 0
            long r0 = a(r0, r0)
            j2.l.f6713b = r0
            return
    }

    public static final long a(int r4, int r5) {
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static final android.text.TextDirectionHeuristic b(int r1) {
            if (r1 == 0) goto L23
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L17
            r0 = 5
            if (r1 == r0) goto L14
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r1
        L14:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LOCALE
            return r1
        L17:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            return r1
        L1a:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r1
        L1d:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r1
        L20:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.RTL
            return r1
        L23:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LTR
            return r1
    }
}
