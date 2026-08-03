package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1.d f4878a = null;

    static {
            g1.d r0 = h0.w.f5010e
            h0.e0.f4878a = r0
            return
    }

    public static final boolean a(s1.k r7) {
            java.lang.Object r0 = r7.f12262a
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L39
            java.lang.Object r5 = r0.get(r3)
            s1.t r5 = (s1.t) r5
            int r5 = r5.f12299i
            r6 = 2
            if (r5 != r6) goto L19
            int r3 = r3 + 1
            goto L8
        L19:
            android.view.MotionEvent r0 = r7.a()
            if (r0 == 0) goto L28
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = r0.isFromSource(r1)
            if (r0 != r4) goto L28
            goto L39
        L28:
            android.view.MotionEvent r7 = r7.a()
            if (r7 == 0) goto L38
            r0 = 1048584(0x100008, float:1.469379E-39)
            boolean r7 = r7.isFromSource(r0)
            if (r7 != r4) goto L38
            goto L39
        L38:
            return r2
        L39:
            return r4
    }
}
