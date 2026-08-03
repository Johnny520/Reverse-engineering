package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends h6.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6.u f7367a;

    public s(k6.u r1) {
            r0 = this;
            r0.<init>()
            r0.f7367a = r1
            return
    }

    @Override // h6.n
    public final void b(o6.a r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.l()
            return
        L6:
            r3.c()
            k6.u r0 = r2.f7367a     // Catch: java.lang.IllegalAccessException -> L21
            java.util.List r0 = r0.f7372a     // Catch: java.lang.IllegalAccessException -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L21
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L21
            k6.r r1 = (k6.r) r1     // Catch: java.lang.IllegalAccessException -> L21
            r1.a(r3, r4)     // Catch: java.lang.IllegalAccessException -> L21
            goto L11
        L21:
            r3 = move-exception
            goto L27
        L23:
            r3.h()
            return
        L27:
            f8.i r4 = l6.c.f7868a
            java.lang.String r4 = "Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            ah.a.p(r4, r3)
            return
    }
}
