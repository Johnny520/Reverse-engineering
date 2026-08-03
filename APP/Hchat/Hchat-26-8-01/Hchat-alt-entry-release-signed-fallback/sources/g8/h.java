package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f4365d;

    public h(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.f4362a = r0
            r1.<init>()
            boolean r0 = xe.q.g(r3)
            if (r0 != 0) goto L11
            r1.f4364c = r2
            r1.f4363b = r3
            return
        L11:
            java.lang.String r2 = "Class alias can't be empty"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public h(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.f4362a = r0
            r1.<init>()
            r1.f4363b = r2
            r1.f4364c = r3
            r1.f4365d = r4
            return
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.f4362a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = r6.f4365d
            java.lang.String r1 = ", pkg="
            java.lang.String r2 = ", fullName="
            java.lang.String r3 = "Alias{"
            java.lang.String r4 = r6.f4363b
            java.lang.String r5 = r6.f4364c
            java.lang.StringBuilder r1 = bc.e.p(r3, r4, r1, r5, r2)
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.r(r1, r0, r2)
            return r0
    }
}
