package da;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2154i;

    public g(da.h r2, android.view.View r3) {
            r1 = this;
            r0 = 1
            r1.f2152g = r0
            r1.<init>()
            r1.f2153h = r2
            r1.f2154i = r3
            return
    }

    public /* synthetic */ g(java.util.Comparator r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f2152g = r3
            r0.f2154i = r1
            r0.f2153h = r2
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f2152g
            switch(r0) {
                case 0: goto L91;
                case 1: goto L70;
                case 2: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2153h
            n8.c r0 = (n8.c) r0
            java.lang.Object r1 = r2.f2154i
            a9.h r1 = (a9.h) r1
            int r1 = r1.compare(r3, r4)
            if (r1 == 0) goto L14
            goto L2c
        L14:
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            int r4 = n8.c.a(r0, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            int r3 = n8.c.a(r0, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r1 = r4.compareTo(r3)
        L2c:
            return r1
        L2d:
            java.lang.Object r0 = r2.f2153h
            da.h r0 = (da.h) r0
            java.lang.Object r1 = r2.f2154i
            da.g r1 = (da.g) r1
            int r1 = r1.compare(r3, r4)
            if (r1 == 0) goto L3c
            goto L6f
        L3c:
            da.f r3 = (da.f) r3
            android.view.View r1 = r3.f2150a
            android.widget.TextView r3 = r3.f2151b
            r0.getClass()
            java.lang.String r3 = da.h.r(r1, r3)
            java.lang.String r3 = da.h.s(r3)
            int r3 = r3.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            da.f r4 = (da.f) r4
            android.view.View r0 = r4.f2150a
            android.widget.TextView r4 = r4.f2151b
            java.lang.String r4 = da.h.r(r0, r4)
            java.lang.String r4 = da.h.s(r4)
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r1 = r3.compareTo(r4)
        L6f:
            return r1
        L70:
            da.f r4 = (da.f) r4
            java.lang.Object r0 = r2.f2153h
            da.h r0 = (da.h) r0
            java.lang.Object r1 = r2.f2154i
            android.view.View r1 = (android.view.View) r1
            int r4 = da.h.a(r0, r1, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            da.f r3 = (da.f) r3
            int r3 = da.h.a(r0, r1, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r4.compareTo(r3)
            return r3
        L91:
            java.lang.Object r0 = r2.f2153h
            da.h r0 = (da.h) r0
            java.lang.Object r1 = r2.f2154i
            c9.a0 r1 = (c9.a0) r1
            int r1 = r1.compare(r3, r4)
            if (r1 == 0) goto La0
            goto Ld7
        La0:
            da.e r3 = (da.e) r3
            da.f r3 = r3.f2147a
            android.view.View r1 = r3.f2150a
            android.widget.TextView r3 = r3.f2151b
            r0.getClass()
            java.lang.String r3 = da.h.r(r1, r3)
            java.lang.String r3 = da.h.s(r3)
            int r3 = r3.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            da.e r4 = (da.e) r4
            da.f r4 = r4.f2147a
            android.view.View r0 = r4.f2150a
            android.widget.TextView r4 = r4.f2151b
            java.lang.String r4 = da.h.r(r0, r4)
            java.lang.String r4 = da.h.s(r4)
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r1 = r3.compareTo(r4)
        Ld7:
            return r1
    }
}
