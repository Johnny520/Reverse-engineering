package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d6.e f2006h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2007g;

    static {
            d6.e r0 = new d6.e
            r1 = 0
            r0.<init>(r1)
            d6.e.f2006h = r0
            return
    }

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f2007g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f2007g
            switch(r0) {
                case 0: goto L6d;
                default: goto L5;
            }
        L5:
            d6.i r3 = (d6.i) r3
            d6.i r4 = (d6.i) r4
            boolean r0 = r3.c()
            if (r0 != 0) goto L16
            boolean r0 = r4.c()
            if (r0 == 0) goto L16
            goto L56
        L16:
            boolean r0 = r4.c()
            if (r0 != 0) goto L23
            boolean r0 = r3.c()
            if (r0 == 0) goto L23
            goto L48
        L23:
            boolean r0 = r3.c()
            if (r0 == 0) goto L38
            boolean r0 = r4.c()
            if (r0 == 0) goto L38
            java.lang.Comparable r0 = r3.f2023a
            java.lang.Comparable r1 = r4.f2023a
            int r0 = r0.compareTo(r1)
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L3c
            goto L6c
        L3c:
            boolean r1 = r3.d()
            if (r1 != 0) goto L4a
            boolean r1 = r4.d()
            if (r1 == 0) goto L4a
        L48:
            r0 = 1
            goto L6c
        L4a:
            boolean r1 = r4.d()
            if (r1 != 0) goto L58
            boolean r1 = r3.d()
            if (r1 == 0) goto L58
        L56:
            r0 = -1
            goto L6c
        L58:
            boolean r1 = r3.d()
            if (r1 == 0) goto L6c
            boolean r1 = r4.d()
            if (r1 == 0) goto L6c
            java.lang.Comparable r3 = r3.f2024b
            java.lang.Comparable r4 = r4.f2024b
            int r0 = r3.compareTo(r4)
        L6c:
            return r0
        L6d:
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r3 = r3.compareTo(r4)
            return r3
    }
}
