package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6646k;

    public /* synthetic */ y(ia.a0 r2, boolean r3, boolean r4, fg.l r5) {
            r1 = this;
            r0 = 0
            r1.f6642g = r0
            r1.<init>()
            r1.f6645j = r2
            r1.f6643h = r3
            r1.f6644i = r4
            r1.f6646k = r5
            return
    }

    public /* synthetic */ y(s3.a r1, boolean r2, fg.a r3, fg.a r4, boolean r5, fg.a r6, fg.a r7, s3.e r8) {
            r0 = this;
            r3 = 1
            r0.f6642g = r3
            r0.<init>()
            r0.f6645j = r1
            r0.f6643h = r2
            r0.f6644i = r5
            r0.f6646k = r8
            return
    }

    public /* synthetic */ y(boolean r2, boolean r3, java.util.Set r4, i0.a1 r5) {
            r1 = this;
            r0 = 2
            r1.f6642g = r0
            r1.<init>()
            r1.f6643h = r2
            r1.f6644i = r3
            r1.f6645j = r4
            r1.f6646k = r5
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f6642g
            switch(r0) {
                case 0: goto Laa;
                case 1: goto L45;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f6645j
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r8.f6646k
            i0.a1 r1 = (i0.a1) r1
            boolean r2 = r8.f6643h
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L22
            tf.v r0 = tf.v.f13169g
            goto L3f
        L22:
            boolean r2 = r8.f6644i
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = tf.d0.T(r2, r0)
            goto L3f
        L33:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r0 = tf.d0.U(r2, r0)
        L3f:
            r1.setValue(r0)
        L42:
            sf.n r0 = sf.n.f12433a
            return r0
        L45:
            java.lang.Object r0 = r8.f6645j
            s3.a r0 = (s3.a) r0
            java.lang.Object r1 = r8.f6646k
            s3.e r1 = (s3.e) r1
            boolean r2 = r0.f12339e
            boolean r3 = r8.f6643h
            if (r2 != r3) goto L54
            goto L61
        L54:
            r0.f12339e = r3
            r3.a r2 = r0.f12340f
            if (r2 == 0) goto L61
            r3.d r2 = r2.f11334b
            if (r2 == 0) goto L61
            r2.a()
        L61:
            boolean r2 = r0.f12338d
            boolean r3 = r8.f6644i
            if (r2 != r3) goto L68
            goto L75
        L68:
            r0.f12338d = r3
            r3.a r2 = r0.f12340f
            if (r2 == 0) goto L75
            r3.d r2 = r2.f11334b
            if (r2 == 0) goto L75
            r2.a()
        L75:
            i0.j1 r2 = r1.f12360c
            java.lang.Object r2 = r2.getValue()
            r3.c r2 = (r3.c) r2
            i0.j1 r3 = r1.f12359b
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            i0.j1 r1 = r1.f12361d
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r2.getClass()
            r3.getClass()
            r1.getClass()
            r0.f12335a = r2
            r0.f12336b = r3
            r0.f12337c = r1
            r3.a r1 = r0.f12340f
            if (r1 == 0) goto La7
            r3.d r1 = r1.f11334b
            if (r1 == 0) goto La7
            r1.c(r0)
        La7:
            sf.n r0 = sf.n.f12433a
            return r0
        Laa:
            java.lang.Object r0 = r8.f6645j
            ia.a0 r0 = (ia.a0) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f6549l
            boolean r2 = r8.f6643h
            boolean r3 = r8.f6644i
            java.lang.Object r4 = r8.f6646k
            fg.l r4 = (fg.l) r4
            r5 = 0
            boolean r2 = r0.p(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Lc2
            goto Lc9
        Lc2:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> Ld7
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Ld7
            r2 = r3
        Lc9:
            java.lang.Throwable r3 = sf.g.b(r2)     // Catch: java.lang.Throwable -> Ld7
            if (r3 == 0) goto Ld9
            ab.b r6 = r0.f6541d     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r7 = "恢复朋友圈伪互动缓存失败"
            r6.invoke(r7, r3)     // Catch: java.lang.Throwable -> Ld7
            goto Ld9
        Ld7:
            r0 = move-exception
            goto Lf6
        Ld9:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Ld7
            boolean r6 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> Ld7
            if (r6 == 0) goto Le0
            r2 = r3
        Le0:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Ld7
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Ld7
            r1.set(r5)
            android.os.Handler r0 = r0.f6545h
            ba.e r1 = new ba.e
            r3 = 2
            r1.<init>(r4, r2, r3)
            r0.post(r1)
            goto L42
        Lf6:
            r1.set(r5)
            throw r0
    }
}
