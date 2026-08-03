package e8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f2356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f2357c;

    public a() {
            r1 = this;
            r0 = 1
            r1.f2355a = r0
            r1.<init>()
            java.lang.String r0 = ""
            r1.f2356b = r0
            r1.f2357c = r0
            return
    }

    public a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f2355a = r0
            r1.<init>()
            r1.f2356b = r2
            r1.f2357c = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2355a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f2356b
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = r2.f2357c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
