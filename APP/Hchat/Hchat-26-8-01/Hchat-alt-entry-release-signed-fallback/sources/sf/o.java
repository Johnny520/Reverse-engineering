package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements sf.c, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fg.a f12434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f12435h;

    @Override // sf.c
    public final boolean a() {
            r2 = this;
            java.lang.Object r0 = r2.f12435h
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
            r2 = this;
            java.lang.Object r0 = r2.f12435h
            sf.m r1 = sf.m.f12432a
            if (r0 != r1) goto L14
            fg.a r0 = r2.f12434g
            r0.getClass()
            java.lang.Object r0 = r0.invoke()
            r2.f12435h = r0
            r0 = 0
            r2.f12434g = r0
        L14:
            java.lang.Object r0 = r2.f12435h
            return r0
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
