package u9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f13547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13549j;

    public /* synthetic */ f(i0.a1 r2, java.util.ArrayList r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.f13546g = r0
            r1.<init>()
            r1.f13548i = r3
            r1.f13547h = r4
            r1.f13549j = r2
            return
    }

    public /* synthetic */ f(u9.h r2, android.view.View r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.f13546g = r0
            r1.<init>()
            r1.f13548i = r2
            r1.f13549j = r3
            r1.f13547h = r4
            return
    }

    public /* synthetic */ f(boolean r2, fg.a r3, fg.a r4) {
            r1 = this;
            r0 = 2
            r1.f13546g = r0
            r1.<init>()
            r1.f13547h = r2
            r1.f13548i = r3
            r1.f13549j = r4
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f13546g
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f13548i
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r4.f13549j
            fg.a r1 = (fg.a) r1
            boolean r2 = r4.f13547h
            if (r2 == 0) goto L15
            r0.invoke()
            goto L18
        L15:
            r1.invoke()
        L18:
            sf.n r0 = sf.n.f12433a
            return r0
        L1b:
            java.lang.Object r0 = r4.f13548i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r4.f13549j
            i0.a1 r1 = (i0.a1) r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r0.next()
            eb.c0 r3 = (eb.c0) r3
            java.lang.String r3 = r3.f2506a
            r2.add(r3)
            goto L2c
        L3e:
            boolean r0 = r4.f13547h
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set r0 = tf.d0.T(r0, r2)
            goto L57
        L4d:
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.LinkedHashSet r0 = tf.d0.U(r0, r2)
        L57:
            r1.setValue(r0)
        L5a:
            sf.n r0 = sf.n.f12433a
            return r0
        L5d:
            java.lang.Object r0 = r4.f13548i
            u9.h r0 = (u9.h) r0
            java.lang.Object r1 = r4.f13549j
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r4.f13547h
            r0.a(r1, r2)
            goto L5a
    }
}
