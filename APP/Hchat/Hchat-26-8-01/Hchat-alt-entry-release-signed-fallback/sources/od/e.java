package od;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.e f9785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9787c;

    public e(java.lang.String r1, od.e r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f9786b = r1
            r0.f9785a = r2
            r0.f9787c = r3
            return
    }

    public static synchronized od.e a(ud.u r4, java.lang.String r5) {
            java.lang.Class<od.e> r0 = od.e.class
            monitor-enter(r0)
            be.k r1 = r4.f13746e     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.f816e     // Catch: java.lang.Throwable -> L23
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L23
            od.e r1 = (od.e) r1     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L13
            monitor-exit(r0)
            return r1
        L13:
            r1 = 46
            int r1 = r5.lastIndexOf(r1)     // Catch: java.lang.Throwable -> L23
            r2 = -1
            if (r1 != r2) goto L25
            od.e r1 = new od.e     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r1.<init>(r5, r2, r5)     // Catch: java.lang.Throwable -> L23
            goto L3a
        L23:
            r4 = move-exception
            goto L47
        L25:
            r2 = 0
            java.lang.String r2 = r5.substring(r2, r1)     // Catch: java.lang.Throwable -> L23
            od.e r2 = a(r4, r2)     // Catch: java.lang.Throwable -> L23
            od.e r3 = new od.e     // Catch: java.lang.Throwable -> L23
            int r1 = r1 + 1
            java.lang.String r1 = r5.substring(r1)     // Catch: java.lang.Throwable -> L23
            r3.<init>(r5, r2, r1)     // Catch: java.lang.Throwable -> L23
            r1 = r3
        L3a:
            be.k r4 = r4.f13746e     // Catch: java.lang.Throwable -> L23
            java.lang.Object r4 = r4.f816e     // Catch: java.lang.Throwable -> L23
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = r1.f9786b     // Catch: java.lang.Throwable -> L23
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r1
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    public static synchronized od.e b(ud.u r3, od.e r4, java.lang.String r5) {
            java.lang.Class<od.e> r0 = od.e.class
            monitor-enter(r0)
            if (r4 != 0) goto L7
            r1 = r5
            goto L1d
        L7:
            java.lang.String r1 = r4.f9786b     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            r2.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "."
            r2.append(r1)     // Catch: java.lang.Throwable -> L3d
            r2.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L3d
        L1d:
            be.k r2 = r3.f13746e     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.f816e     // Catch: java.lang.Throwable -> L3d
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3d
            od.e r2 = (od.e) r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2d
            monitor-exit(r0)
            return r2
        L2d:
            od.e r2 = new od.e     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L3d
            be.k r3 = r3.f13746e     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r3 = r3.f816e     // Catch: java.lang.Throwable -> L3d
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L3d
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            return r2
        L3d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r3
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof od.e
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            od.e r2 = (od.e) r2
            java.lang.String r2 = r2.f9786b
            java.lang.String r0 = r1.f9786b
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f9786b
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f9786b
            return r0
    }
}
