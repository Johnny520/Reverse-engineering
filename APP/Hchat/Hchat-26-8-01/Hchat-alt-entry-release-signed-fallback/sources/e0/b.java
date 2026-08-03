package e0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1.l f2279a = null;

    static {
            r0 = 40
            float r0 = (float) r0
            r1 = 10
            float r1 = (float) r1
            x1.l r2 = new x1.l
            r2.<init>(r1, r0, r1, r0)
            e0.b.f2279a = r2
            return
    }

    public static final y0.o a(boolean r1, boolean r2, fg.a r3) {
            y0.l r0 = y0.l.f21818a
            if (r1 == 0) goto L1b
            boolean r1 = e0.e.f2289a
            if (r1 == 0) goto L1b
            if (r2 == 0) goto L11
            s1.e0 r0 = new s1.e0
            x1.l r1 = e0.b.f2279a
            r0.<init>(r1)
        L11:
            e0.a r1 = new e0.a
            r1.<init>(r3)
            y0.o r1 = r0.d(r1)
            return r1
        L1b:
            return r0
    }
}
