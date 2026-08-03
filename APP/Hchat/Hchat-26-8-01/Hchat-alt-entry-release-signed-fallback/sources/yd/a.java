package yd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends xd.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public yd.b f22417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.List f22418l;

    public a(xd.b r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.f22418l = r1
            return
    }

    public final int H() {
            r2 = this;
            java.util.List r0 = r2.f22418l
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            ud.p r1 = a.a.c0(r1)
            if (r1 == 0) goto L6
            int r1 = r1.f9389i
            if (r1 == 0) goto L6
            return r1
        L1d:
            r0 = 0
            return r0
    }
}
