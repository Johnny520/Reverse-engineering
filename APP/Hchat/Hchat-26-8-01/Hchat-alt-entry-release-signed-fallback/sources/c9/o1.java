package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r8.g f1297h;

    public /* synthetic */ o1(java.lang.Object r1, r8.g r2, int r3) {
            r0 = this;
            r0.f1296g = r3
            r0.f1297h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ o1(r8.g r2) {
            r1 = this;
            r0 = 3
            r1.f1296g = r0
            r1.<init>()
            r1.f1297h = r2
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f1296g
            r1 = 0
            r8.g r2 = r9.f1297h
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L71;
                case 2: goto L53;
                case 3: goto L26;
                default: goto L8;
            }
        L8:
            hh.o r10 = (hh.o) r10
            r10.getClass()
            java.lang.ClassLoader r0 = r2.f11622c     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r10 = r10.r(r0)     // Catch: java.lang.Throwable -> L14
            goto L1c
        L14:
            r0 = move-exception
            r10 = r0
            sf.f r0 = new sf.f
            r0.<init>(r10)
            r10 = r0
        L1c:
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r10
        L23:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
        L26:
            eb.i r10 = (eb.i) r10
            r10.getClass()
            java.util.concurrent.ExecutorService r0 = x8.q.f21329a
            android.content.Context r8 = r2.f11620a
            java.lang.String r4 = r10.f2556a
            java.lang.String r5 = r10.f2558c
            int r6 = r10.f2559d
            r5.getClass()
            x8.r r7 = new x8.r
            r7.<init>(r8)
            java.lang.String r10 = "auto_accept_enable"
            boolean r10 = r7.e(r10)
            if (r10 != 0) goto L46
            goto L50
        L46:
            java.util.concurrent.ExecutorService r10 = x8.q.f21329a
            lb.a r3 = new lb.a
            r3.<init>(r4, r5, r6, r7, r8)
            r10.execute(r3)
        L50:
            sf.n r10 = sf.n.f12433a
            return r10
        L53:
            hh.o r10 = (hh.o) r10
            r10.getClass()
            java.lang.ClassLoader r0 = r2.f11622c     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r10 = r10.r(r0)     // Catch: java.lang.Throwable -> L5f
            goto L67
        L5f:
            r0 = move-exception
            r10 = r0
            sf.f r0 = new sf.f
            r0.<init>(r10)
            r10 = r0
        L67:
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto L6d
            goto L6e
        L6d:
            r1 = r10
        L6e:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
        L71:
            hh.o r10 = (hh.o) r10
            r10.getClass()
            java.lang.ClassLoader r0 = r2.f11622c     // Catch: java.lang.Throwable -> L7d
            java.lang.reflect.Method r10 = r10.r(r0)     // Catch: java.lang.Throwable -> L7d
            goto L85
        L7d:
            r0 = move-exception
            r10 = r0
            sf.f r0 = new sf.f
            r0.<init>(r10)
            r10 = r0
        L85:
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto L8b
            goto L8c
        L8b:
            r1 = r10
        L8c:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
        L8f:
            hh.o r10 = (hh.o) r10
            r10.getClass()
            java.lang.ClassLoader r0 = r2.f11622c     // Catch: java.lang.Throwable -> L9b
            java.lang.reflect.Method r10 = r10.r(r0)     // Catch: java.lang.Throwable -> L9b
            goto La3
        L9b:
            r0 = move-exception
            r10 = r0
            sf.f r0 = new sf.f
            r0.<init>(r10)
            r10 = r0
        La3:
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto La9
            goto Laa
        La9:
            r1 = r10
        Laa:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
    }
}
