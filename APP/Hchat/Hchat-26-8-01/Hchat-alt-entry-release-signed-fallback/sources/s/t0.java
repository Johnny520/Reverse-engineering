package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s.w0 f12112h;

    public /* synthetic */ t0(s.w0 r1, int r2) {
            r0 = this;
            r0.f12111g = r2
            r0.f12112h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f12111g
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            s.w0 r0 = r4.f12112h
            fg.a r1 = r0.f12121u
            java.lang.Object r1 = r1.invoke()
            r.k r1 = (r.k) r1
            if (r5 < 0) goto L1e
            int r2 = r1.c()
            if (r5 >= r2) goto L1e
            goto L39
        L1e:
            java.lang.String r2 = "Can't scroll to index "
            java.lang.String r3 = ", it is out of bounds [0, "
            java.lang.StringBuilder r2 = eh.a.t(r5, r2, r3)
            int r1 = r1.c()
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            o.b.a(r1)
        L39:
            qg.t r1 = r0.Y0()
            s.v0 r2 = new s.v0
            r3 = 0
            r2.<init>(r0, r5, r3)
            r5 = 3
            qg.v.q(r1, r3, r2, r5)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L4a:
            s.w0 r0 = r4.f12112h
            fg.a r0 = r0.f12121u
            java.lang.Object r0 = r0.invoke()
            r.k r0 = (r.k) r0
            int r1 = r0.c()
            r2 = 0
        L59:
            if (r2 >= r1) goto L69
            java.lang.Object r3 = r0.d(r2)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L66
            goto L6a
        L66:
            int r2 = r2 + 1
            goto L59
        L69:
            r2 = -1
        L6a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            return r5
    }
}
