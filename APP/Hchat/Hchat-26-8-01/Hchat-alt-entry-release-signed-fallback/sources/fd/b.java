package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3899b;

    public /* synthetic */ b(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f3898a = r2
            r0.f3899b = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r5 = this;
            int r0 = r5.f3898a
            switch(r0) {
                case 0: goto L77;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f3899b
            r8.g r0 = (r8.g) r0
            h.Hchat.dexkit.DexFinder r1 = r0.f11624e
            r1.resolveConversationMuteApi()
            h.Hchat.dexkit.DexFinder r0 = r0.f11624e
            boolean r0 = r0.isPrivateConversationMuteApiReady()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L19:
            java.lang.Object r0 = r5.f3899b
            fd.a r0 = (fd.a) r0
            ud.e r1 = r0.f3887a
            md.a r2 = md.a.L
            md.f r3 = r1.f8877g
            boolean r2 = r3.a(r2)
            ud.u r3 = r1.f13688k
            if (r2 == 0) goto L4c
            fc.b r2 = r3.c()
            b.e r3 = r0.f3889c
            java.lang.Object r4 = r3.f332h
            ud.e r4 = (ud.e) r4
            r3.i(r4, r2)
            r2.f()
            r2.k(r1)
            r0.j(r2)
            r2.f()
            r0.g(r2)
            bc.d r0 = r2.w()
            goto L76
        L4c:
            fc.b r2 = r3.c()
            md.a r4 = md.a.f8838s
            md.f r1 = r1.f8877g
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L5b
            goto L62
        L5b:
            r0.b(r2)
            r1 = 0
            r0.a(r2, r1)
        L62:
            fc.b r1 = r3.c()
            r0.j(r1)
            r1.f()
            r0.g(r1)
            r1.c(r2)
            bc.d r0 = r1.w()
        L76:
            return r0
        L77:
            java.lang.Object r0 = r5.f3899b
            gd.b r0 = (gd.b) r0
            ud.e r1 = r0.f4485a
            r2 = 0
            hd.a r0 = r0.b(r1, r2)
            h6.f r1 = gd.b.f4484c
            r1.getClass()
            java.lang.Class r2 = r0.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            j6.q r4 = new j6.q     // Catch: java.io.IOException -> La1
            r4.<init>(r3)     // Catch: java.io.IOException -> La1
            o6.a r4 = r1.c(r4)     // Catch: java.io.IOException -> La1
            r1.d(r0, r2, r4)     // Catch: java.io.IOException -> La1
            java.lang.String r0 = r3.toString()
            return r0
        La1:
            r0 = move-exception
            af.d r1 = new af.d
            r1.<init>(r0)
            throw r1
    }
}
