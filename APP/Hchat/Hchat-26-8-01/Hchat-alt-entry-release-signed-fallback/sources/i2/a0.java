package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i2.a0 f6251g = null;

    static {
            i2.a0 r0 = new i2.a0
            r0.<init>()
            i2.a0.f6251g = r0
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            v0.b r3 = (v0.b) r3
            f1.w r4 = (f1.w) r4
            long r3 = r4.f3133a
            r0 = 16
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        Lf:
            int r3 = f1.c0.w(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }
}
