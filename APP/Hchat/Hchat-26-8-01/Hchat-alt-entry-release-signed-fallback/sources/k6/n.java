package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h6.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h6.n f7358h;

    public /* synthetic */ n(h6.n r1, int r2) {
            r0 = this;
            r0.f7357g = r2
            r0.f7358h = r1
            r0.<init>()
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r1, n6.a r2) {
            r0 = this;
            int r1 = r0.f7357g
            switch(r1) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Class r1 = r2.f9028a
            java.lang.Class<java.util.Calendar> r2 = java.util.Calendar.class
            if (r1 == r2) goto L12
            java.lang.Class<java.util.GregorianCalendar> r2 = java.util.GregorianCalendar.class
            if (r1 != r2) goto L10
            goto L12
        L10:
            r1 = 0
            goto L16
        L12:
            h6.n r1 = r0.f7358h
            k6.q0 r1 = (k6.q0) r1
        L16:
            return r1
        L17:
            java.lang.Class r1 = r2.f9028a
            java.lang.Class<java.lang.Number> r2 = java.lang.Number.class
            if (r1 != r2) goto L22
            h6.n r1 = r0.f7358h
            k6.o r1 = (k6.o) r1
            goto L23
        L22:
            r1 = 0
        L23:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f7357g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class<java.util.GregorianCalendar> r1 = java.util.GregorianCalendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            h6.n r1 = r2.f7358h
            k6.q0 r1 = (k6.q0) r1
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
