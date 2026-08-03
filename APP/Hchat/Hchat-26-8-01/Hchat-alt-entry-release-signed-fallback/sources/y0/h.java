package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y0.h f21813g = null;

    static {
            y0.h r0 = new y0.h
            r1 = 2
            r0.<init>(r1)
            y0.h.f21813g = r0
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r2 = (java.lang.String) r2
            y0.m r3 = (y0.m) r3
            int r0 = r2.length()
            if (r0 != 0) goto Lf
            java.lang.String r2 = r3.toString()
            return r2
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
