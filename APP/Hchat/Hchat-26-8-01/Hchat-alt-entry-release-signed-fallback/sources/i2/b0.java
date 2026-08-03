package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i2.b0 f6252g = null;

    static {
            i2.b0 r0 = new i2.b0
            r0.<init>()
            i2.b0.f6252g = r0
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = gg.l.a(r3, r0)
            if (r0 == 0) goto L10
            long r0 = f1.w.f3131g
            f1.w r3 = new f1.w
            r3.<init>(r0)
            return r3
        L10:
            r3.getClass()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r0 = f1.c0.c(r3)
            f1.w r3 = new f1.w
            r3.<init>(r0)
            return r3
    }
}
