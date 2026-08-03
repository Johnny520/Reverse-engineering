package od;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f9772b;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f9771a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f9772b = r0
            return
    }

    public final void a(java.lang.Object r4, ud.l r5) {
            r3 = this;
            java.util.HashSet r0 = r3.f9772b
            boolean r1 = r0.contains(r4)
            java.util.concurrent.ConcurrentHashMap r2 = r3.f9771a
            if (r1 == 0) goto Le
            r2.remove(r4)
            return
        Le:
            java.lang.Object r5 = r2.put(r4, r5)
            ud.l r5 = (ud.l) r5
            if (r5 == 0) goto L1c
            r2.remove(r4)
            r0.add(r4)
        L1c:
            return
    }
}
