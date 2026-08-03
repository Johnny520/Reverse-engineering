package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements h6.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f7369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h6.n f7370i;

    public /* synthetic */ s0(java.lang.Class r1, h6.n r2, int r3) {
            r0 = this;
            r0.f7368g = r3
            r0.f7369h = r1
            r0.f7370i = r2
            r0.<init>()
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r1, n6.a r2) {
            r0 = this;
            int r1 = r0.f7368g
            switch(r1) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Class r1 = r2.f9028a
            java.lang.Class r2 = r0.f7369h
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 != 0) goto L11
            r1 = 0
            goto L17
        L11:
            h6.d r1 = new h6.d
            r2 = 2
            r1.<init>(r0, r2)
        L17:
            return r1
        L18:
            java.lang.Class r1 = r2.f9028a
            java.lang.Class r2 = r0.f7369h
            if (r1 != r2) goto L21
            h6.n r1 = r0.f7370i
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f7368g
            switch(r0) {
                case 0: goto L29;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[typeHierarchy="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f7369h
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            h6.n r1 = r2.f7370i
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f7369h
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            h6.n r1 = r2.f7370i
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
