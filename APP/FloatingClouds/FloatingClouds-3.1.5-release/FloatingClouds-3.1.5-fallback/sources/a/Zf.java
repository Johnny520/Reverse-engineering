package a;

/* JADX INFO: loaded from: classes.dex */
public final class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference<a.C0163gf> f381a = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            a.Zf.f381a = r0
            return
    }

    public static long a(long r1) {
            r0 = 0
            java.util.Calendar r0 = e(r0)
            r0.setTimeInMillis(r1)
            java.util.Calendar r1 = c(r0)
            long r1 = r1.getTimeInMillis()
            return r1
    }

    @android.annotation.TargetApi(24)
    public static android.icu.text.DateFormat b(java.lang.String r0, java.util.Locale r1) {
            android.icu.text.DateFormat r0 = android.icu.text.DateFormat.getInstanceForSkeleton(r0, r1)
            java.lang.String r1 = "UTC"
            android.icu.util.TimeZone r1 = android.icu.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            android.icu.text.DisplayContext r1 = android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE
            r0.setContext(r1)
            return r0
    }

    public static java.util.Calendar c(java.util.Calendar r4) {
            java.util.Calendar r4 = e(r4)
            r0 = 0
            java.util.Calendar r0 = e(r0)
            r1 = 1
            int r1 = r4.get(r1)
            r2 = 2
            int r2 = r4.get(r2)
            r3 = 5
            int r4 = r4.get(r3)
            r0.set(r1, r2, r4)
            return r0
    }

    public static java.util.Calendar d() {
            java.util.concurrent.atomic.AtomicReference<a.gf> r0 = a.Zf.f381a
            java.lang.Object r0 = r0.get()
            a.gf r0 = (a.C0163gf) r0
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r1 = 12
            r0.set(r1, r2)
            r1 = 13
            r0.set(r1, r2)
            r1 = 14
            r0.set(r1, r2)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            return r0
    }

    public static java.util.Calendar e(java.util.Calendar r3) {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            if (r3 != 0) goto L10
            r0.clear()
            return r0
        L10:
            long r1 = r3.getTimeInMillis()
            r0.setTimeInMillis(r1)
            return r0
    }
}
