package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends tf.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Iterator f9424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fg.l f9425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.HashSet f9426k;

    public b(java.util.Iterator r1, fg.l r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f9424i = r1
            r0.f9425j = r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f9426k = r1
            return
    }

    @Override // tf.b
    public final void a() {
            r3 = this;
        L0:
            java.util.Iterator r0 = r3.f9424i
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r0 = r0.next()
            fg.l r1 = r3.f9425j
            java.lang.Object r1 = r1.invoke(r0)
            java.util.HashSet r2 = r3.f9426k
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L0
            r3.f13139h = r0
            r0 = 1
            r3.f13138g = r0
            return
        L20:
            r0 = 2
            r3.f13138g = r0
            return
    }
}
