package ee;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f2734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.IdentityHashMap f2735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2736c;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2734a = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.f2735b = r0
            return
    }

    public final void a(ud.a r3) {
            r2 = this;
            java.util.ArrayList r0 = r3.f13674l
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            r2.b(r3, r1)
            goto L6
        L16:
            return
    }

    public final void b(ud.a r2, ud.p r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.f2734a
            r0.add(r3)
            java.util.IdentityHashMap r0 = r1.f2735b
            r0.put(r3, r2)
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.util.ArrayList r0 = r5.f2734a
            java.util.stream.Stream r0 = r0.stream()
            com.alibaba.fastjson2.writer.b r1 = new com.alibaba.fastjson2.writer.b
            r2 = 16
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            java.lang.String r1 = ", "
            java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r1)
            java.lang.Object r0 = r0.collect(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r5.f2736c
            if (r1 == 0) goto L24
            java.lang.String r1 = " complete"
            goto L26
        L24:
            java.lang.String r1 = ""
        L26:
            java.lang.String r2 = "]"
            java.lang.String r3 = "}"
            java.lang.String r4 = "{["
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
