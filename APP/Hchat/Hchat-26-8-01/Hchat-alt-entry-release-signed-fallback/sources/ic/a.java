package ic;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements hc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6651g;

    public a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f6651g = r1
            return
    }

    public static void a(fc.f r1, ud.p r2) {
            if (r2 != 0) goto L3
            goto L1b
        L3:
            r1.getClass()
            boolean r0 = r1 instanceof fc.b
            if (r0 == 0) goto L1b
            int r2 = r2.f13716n
            if (r2 >= 0) goto L10
            r2 = 0
            goto L16
        L10:
            ic.a r0 = new ic.a
            r0.<init>(r2)
            r2 = r0
        L16:
            if (r2 == 0) goto L1b
            r1.l(r2)
        L1b:
            return
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 8
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f6651g
            java.lang.String r1 = "offset="
            java.lang.String r0 = eh.a.l(r0, r1)
            return r0
    }
}
