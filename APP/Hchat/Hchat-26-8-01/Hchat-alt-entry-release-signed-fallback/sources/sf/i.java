package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements sf.c, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fg.a f12425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Object f12426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f12427i;

    public i(fg.a r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12425g = r1
            sf.m r1 = sf.m.f12432a
            r0.f12426h = r1
            r0.f12427i = r0
            return
    }

    @Override // sf.c
    public final boolean a() {
            r2 = this;
            java.lang.Object r0 = r2.f12426h
            sf.m r1 = sf.m.f12432a
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // sf.c
    public final java.lang.Object getValue() {
            r3 = this;
            java.lang.Object r0 = r3.f12426h
            sf.m r1 = sf.m.f12432a
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.f12427i
            monitor-enter(r0)
            java.lang.Object r2 = r3.f12426h     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            fg.a r1 = r3.f12425g     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.invoke()     // Catch: java.lang.Throwable -> L1f
            r3.f12426h = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.f12425g = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
            return r0
    }
}
