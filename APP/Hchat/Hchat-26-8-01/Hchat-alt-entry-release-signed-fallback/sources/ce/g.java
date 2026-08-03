package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1640a = 0;

    static {
            java.lang.Class<ce.g> r0 = ce.g.class
            mh.d.b(r0)
            return
    }

    public static void a(ae.h r2, ud.a r3, ud.a r4) {
            java.util.List r0 = r2.f244h
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ae.f r1 = (ae.f) r1
            ud.a r1 = r1.f234c
            ce.m.j(r3, r1)
            if (r4 == 0) goto L6
            ce.m.j(r4, r1)
            goto L6
        L1d:
            ae.h r2 = r2.f246j
            if (r2 == 0) goto L24
            a(r2, r3, r4)
        L24:
            return
    }
}
