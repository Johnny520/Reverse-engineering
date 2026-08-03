package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends v4.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v4.f f14093h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v4.f f14094i = null;

    static {
            v4.f r0 = new v4.f
            r1 = 0
            r0.<init>(r1)
            v4.f.f14093h = r0
            v4.f r0 = new v4.f
            r1 = 1
            r0.<init>(r1)
            v4.f.f14094i = r0
            return
    }

    public static v4.f n(int r1) {
            if (r1 != 0) goto L5
            v4.f r1 = v4.f.f14093h
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            v4.f r1 = v4.f.f14094i
            return r1
        Lb:
            java.lang.String r0 = "bogus value: "
            java.lang.String r1 = eh.a.l(r1, r0)
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            int r0 = r1.f14121g
            if (r0 != 0) goto L7
            java.lang.String r0 = "false"
            return r0
        L7:
            java.lang.String r0 = "true"
            return r0
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.f14866o
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "boolean"
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f14121g
            if (r0 != 0) goto L7
            java.lang.String r0 = "boolean{false}"
            return r0
        L7:
            java.lang.String r0 = "boolean{true}"
            return r0
    }
}
