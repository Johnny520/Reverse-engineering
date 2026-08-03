package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements i0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1807c;

    public /* synthetic */ w(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f1805a = r2
            r0.f1806b = r1
            r0.f1807c = r3
            r0.<init>()
            return
    }

    @Override // i0.z
    public final void a() {
            r4 = this;
            int r0 = r4.f1805a
            r1 = 0
            java.lang.Object r2 = r4.f1807c
            java.lang.Object r3 = r4.f1806b
            switch(r0) {
                case 0: goto L95;
                case 1: goto L8b;
                case 2: goto L81;
                case 3: goto L6b;
                case 4: goto L61;
                case 5: goto L47;
                case 6: goto L3f;
                case 7: goto L35;
                case 8: goto L2b;
                case 9: goto L1b;
                default: goto La;
            }
        La:
            ia.n r3 = (ia.n) r3
            r3.invoke(r1)
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r0 = r2.getValue()
            fg.a r0 = (fg.a) r0
            r0.invoke()
            return
        L1b:
            android.view.Window r3 = (android.view.Window) r3
            if (r3 == 0) goto L2a
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L2a
            int r0 = r2.intValue()
            r3.setSoftInputMode(r0)
        L2a:
            return
        L2b:
            w.n1 r3 = (w.n1) r3
            w0.p r0 = r3.f14577c
            fg.l r2 = (fg.l) r2
            r0.remove(r2)
            return
        L35:
            s3.a r3 = (s3.a) r3
            r3.a()
            s3.e r2 = (s3.e) r2
            r2.f12362e = r1
            return
        L3f:
            s.x0 r3 = (s.x0) r3
            f.l0 r0 = r3.f12137i
            r0.k(r2)
            return
        L47:
            p.s1 r3 = (p.s1) r3
            android.view.View r2 = (android.view.View) r2
            int r0 = r3.f10006t
            int r0 = r0 + (-1)
            r3.f10006t = r0
            if (r0 != 0) goto L60
            int r0 = g3.q.f4227a
            g3.m.b(r2, r1)
            g3.q.b(r2, r1)
            p.f0 r0 = r3.f10007u
            r2.removeOnAttachStateChangeListener(r0)
        L60:
            return
        L61:
            i.k1 r3 = (i.k1) r3
            i.g1 r2 = (i.g1) r2
            w0.p r0 = r3.f5715i
            r0.remove(r2)
            return
        L6b:
            i.k1 r3 = (i.k1) r3
            i.d1 r2 = (i.d1) r2
            i0.j1 r0 = r2.f5646b
            java.lang.Object r0 = r0.getValue()
            i.c1 r0 = (i.c1) r0
            if (r0 == 0) goto L80
            i.g1 r0 = r0.f5615g
            w0.p r1 = r3.f5715i
            r1.remove(r0)
        L80:
            return
        L81:
            i.k1 r3 = (i.k1) r3
            i.k1 r2 = (i.k1) r2
            w0.p r0 = r3.f5716j
            r0.remove(r2)
            return
        L8b:
            i.g0 r3 = (i.g0) r3
            i.d0 r2 = (i.d0) r2
            j0.b r0 = r3.f5662a
            r0.j(r2)
            return
        L95:
            w0.p r3 = (w0.p) r3
            ci.v r0 = ci.v.f1802h
            tf.r.i1(r0, r3)
            w0.p r2 = (w0.p) r2
            ci.v r0 = ci.v.f1803i
            tf.r.i1(r0, r2)
            return
    }
}
