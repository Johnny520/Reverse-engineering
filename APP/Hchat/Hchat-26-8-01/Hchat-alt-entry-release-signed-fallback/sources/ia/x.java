package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ia.a0 f6641h;

    public /* synthetic */ x(ia.a0 r1, int r2) {
            r0 = this;
            r0.f6640g = r2
            r0.f6641h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r10 = this;
            int r0 = r10.f6640g
            switch(r0) {
                case 0: goto L5d;
                default: goto L5;
            }
        L5:
            ia.a0 r1 = r10.f6641h
            b5.c r0 = r1.f6539b
            java.util.LinkedHashSet r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            b5.c r3 = r1.f6539b
            ia.c r8 = r3.l(r2)
            java.lang.Object r9 = r1.f6548k
            monitor-enter(r9)
            p8.f r3 = r1.m(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r3 = r3.f10353b     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            ia.c r4 = r1.d(r8)     // Catch: java.lang.Throwable -> L4a
            ia.c r5 = ia.a0.g(r8)     // Catch: java.lang.Throwable -> L4a
            boolean r6 = r1.f()     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r1.e()     // Catch: java.lang.Throwable -> L4a
            boolean r3 = r1.h(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            b5.c r3 = r1.f6539b     // Catch: java.lang.Throwable -> L4a
            r3.a(r2, r8)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r0 = move-exception
            goto L4e
        L4c:
            monitor-exit(r9)
            goto L11
        L4e:
            monitor-exit(r9)
            throw r0
        L50:
            android.app.Activity r0 = ia.a0.c()
            if (r0 == 0) goto L5a
            r2 = 0
            r1.n(r0, r2)
        L5a:
            sf.n r0 = sf.n.f12433a
            return r0
        L5d:
            ia.a0 r0 = r10.f6641h
            java.lang.String r1 = "androidx.recyclerview.widget.RecyclerView"
            r8.g r0 = r0.f6538a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            return r0
    }
}
