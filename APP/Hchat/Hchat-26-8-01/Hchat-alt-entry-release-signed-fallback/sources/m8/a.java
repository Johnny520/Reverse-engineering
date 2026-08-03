package m8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8.c f8777a;

    public a(m8.c r1, g1.d r2) {
            r0 = this;
            r0.<init>()
            r0.f8777a = r1
            return
    }

    public final void a(h.Hchat.dexkit.DexFinder r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L13
        L3:
            java.lang.Class<?> r0 = r3.netQueueClass
            if (r0 != 0) goto L14
            java.util.List<java.lang.Class<?>> r0 = r3.netQueueCandidateClasses
            r0.getClass()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            goto L14
        L13:
            return
        L14:
            java.lang.Class<?> r0 = r3.netQueueClass
            java.util.List<java.lang.Class<?>> r3 = r3.netQueueCandidateClasses
            m8.c r1 = r2.f8777a
            r1.c(r0, r3)
            return
    }
}
