package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends h6.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.f f7385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.n f7386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Type f7387c;

    public y(h6.f r1, h6.n r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.f7385a = r1
            r0.f7386b = r2
            r0.f7387c = r3
            return
    }

    @Override // h6.n
    public final void b(o6.a r5, java.lang.Object r6) {
            r4 = this;
            java.lang.reflect.Type r0 = r4.f7387c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            h6.n r2 = r4.f7386b
            if (r1 == r0) goto L3d
            n6.a r0 = new n6.a
            r0.<init>(r1)
            h6.f r1 = r4.f7385a
            h6.n r0 = r1.b(r0)
            boolean r1 = r0 instanceof k6.s
            if (r1 != 0) goto L26
            goto L3c
        L26:
            r1 = r2
        L27:
            boolean r3 = r1 instanceof k6.x
            if (r3 == 0) goto L37
            r3 = r1
            k6.x r3 = (k6.x) r3
            h6.n r3 = r3.c()
            if (r3 != r1) goto L35
            goto L37
        L35:
            r1 = r3
            goto L27
        L37:
            boolean r1 = r1 instanceof k6.s
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r0
        L3d:
            r2.b(r5, r6)
            return
    }
}
