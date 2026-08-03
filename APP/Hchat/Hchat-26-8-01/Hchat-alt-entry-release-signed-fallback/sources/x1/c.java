package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d1.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1.c f20850a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f20851b;

    static {
            x1.c r0 = new x1.c
            r0.<init>()
            x1.c.f20850a = r0
            return
    }

    @Override // d1.r
    public final boolean a() {
            r1 = this;
            java.lang.Boolean r0 = x1.c.f20851b
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            java.lang.String r0 = "canFocus is read before it is written"
            af.d r0 = wb.en.a(r0)
            throw r0
    }

    @Override // d1.r
    public final void c(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            x1.c.f20851b = r1
            return
    }
}
