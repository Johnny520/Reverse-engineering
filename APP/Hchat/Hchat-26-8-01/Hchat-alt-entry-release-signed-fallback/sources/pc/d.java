package pc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends oc.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f10463g;

    public d(java.util.HashMap r1) {
            r0 = this;
            r0.<init>()
            r0.f10463g = r1
            return
    }

    public static pc.d b(java.util.List r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L31
        L7:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            nc.b r1 = (nc.b) r1
            int r2 = r1.f9343a
            r3 = 3
            if (r2 == r3) goto L14
            java.lang.String r2 = r1.f9344b
            r0.put(r2, r1)
            goto L14
        L2b:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L33
        L31:
            r4 = 0
            return r4
        L33:
            pc.d r4 = new pc.d
            r4.<init>(r0)
            return r4
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            oc.c r0 = oc.c.f9755a
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.HashMap r0 = r1.f10463g
            java.lang.String r0 = r0.toString()
            return r0
    }
}
