package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f2.g f3147h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f2.g f3148i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f2.g f3149j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3150g;

    static {
            f2.g r0 = new f2.g
            r1 = 0
            r0.<init>(r1)
            f2.g.f3147h = r0
            f2.g r0 = new f2.g
            r1 = 1
            r0.<init>(r1)
            f2.g.f3148i = r0
            f2.g r0 = new f2.g
            r1 = 2
            r0.<init>(r1)
            f2.g.f3149j = r0
            return
    }

    public /* synthetic */ g(int r1) {
            r0 = this;
            r0.f3150g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f3150g
            switch(r0) {
                case 0: goto L63;
                case 1: goto L2d;
                default: goto L5;
            }
        L5:
            sf.e r3 = (sf.e) r3
            sf.e r4 = (sf.e) r4
            java.lang.Object r0 = r3.f12418g
            e1.c r0 = (e1.c) r0
            float r0 = r0.f2297b
            java.lang.Object r1 = r4.f12418g
            e1.c r1 = (e1.c) r1
            float r1 = r1.f2297b
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L1c
            goto L2c
        L1c:
            java.lang.Object r3 = r3.f12418g
            e1.c r3 = (e1.c) r3
            float r3 = r3.f2299d
            java.lang.Object r4 = r4.f12418g
            e1.c r4 = (e1.c) r4
            float r4 = r4.f2299d
            int r0 = java.lang.Float.compare(r3, r4)
        L2c:
            return r0
        L2d:
            f2.q r3 = (f2.q) r3
            f2.q r4 = (f2.q) r4
            e1.c r3 = r3.h()
            e1.c r4 = r4.h()
            float r0 = r4.f2298c
            float r1 = r3.f2298c
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L44
            goto L62
        L44:
            float r0 = r3.f2297b
            float r1 = r4.f2297b
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L4f
            goto L62
        L4f:
            float r0 = r3.f2299d
            float r1 = r4.f2299d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L5a
            goto L62
        L5a:
            float r4 = r4.f2296a
            float r3 = r3.f2296a
            int r0 = java.lang.Float.compare(r4, r3)
        L62:
            return r0
        L63:
            f2.q r3 = (f2.q) r3
            f2.q r4 = (f2.q) r4
            e1.c r3 = r3.h()
            e1.c r4 = r4.h()
            float r0 = r3.f2296a
            float r1 = r4.f2296a
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L7a
            goto L98
        L7a:
            float r0 = r3.f2297b
            float r1 = r4.f2297b
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L85
            goto L98
        L85:
            float r0 = r3.f2299d
            float r1 = r4.f2299d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L90
            goto L98
        L90:
            float r3 = r3.f2298c
            float r4 = r4.f2298c
            int r0 = java.lang.Float.compare(r3, r4)
        L98:
            return r0
    }
}
