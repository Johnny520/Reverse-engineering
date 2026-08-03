package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1.a2 f21848a = null;

    static {
            y1.a2 r0 = new y1.a2
            r0.<init>()
            y1.a2.f21848a = r0
            return
    }

    public final boolean a(android.view.MotionEvent r4, int r5) {
            r3 = this;
            float r0 = j2.b.b(r4, r5)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2 = 2139095040(0x7f800000, float:Infinity)
            if (r0 >= r2) goto L1d
            float r4 = j2.b.v(r4, r5)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            r4 = r4 & r1
            if (r4 >= r2) goto L1d
            r4 = 1
            return r4
        L1d:
            r4 = 0
            return r4
    }
}
