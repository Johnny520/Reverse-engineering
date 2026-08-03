package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h6.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6.y f7316b;

    public c(k6.d r1, k6.y r2, k6.y r3) {
            r0 = this;
            r1 = 1
            r0.f7315a = r1
            r0.<init>()
            r0.f7316b = r3
            return
    }

    public c(k6.y r2) {
            r1 = this;
            r0 = 0
            r1.f7315a = r0
            r1.<init>()
            r1.f7316b = r2
            return
    }

    @Override // h6.n
    public final void b(o6.a r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f7315a
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto Ld
            r3.l()
            goto L3c
        Ld:
            r3.c()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.i(r1)
            java.lang.Object r0 = r0.getValue()
            k6.y r1 = r2.f7316b
            r1.b(r3, r0)
            goto L18
        L39:
            r3.h()
        L3c:
            return
        L3d:
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 != 0) goto L45
            r3.l()
            goto L5f
        L45:
            r3.b()
            java.util.Iterator r4 = r4.iterator()
        L4c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r4.next()
            k6.y r1 = r2.f7316b
            r1.b(r3, r0)
            goto L4c
        L5c:
            r3.g()
        L5f:
            return
    }
}
