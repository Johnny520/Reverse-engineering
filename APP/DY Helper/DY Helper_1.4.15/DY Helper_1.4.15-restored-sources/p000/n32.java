package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class n32 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.ThreadLocal f7376 = null;

    /* JADX INFO: renamed from: β */
    public static final long f7377 = 0;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.n32.f7376 = r0
            r0 = 0
            long r0 = m3949(r0, r0)
            p000.n32.f7377 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final long m3949(int r4, int r5) {
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static final android.text.TextDirectionHeuristic m3950(int r1) {
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
