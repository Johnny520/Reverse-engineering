package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends y0.n implements d1.u, android.view.ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public android.view.ViewTreeObserver f21169u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x2.p f21170v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x2.p f21171w;

    public q() {
            r2 = this;
            r2.<init>()
            x2.p r0 = new x2.p
            r1 = 0
            r0.<init>(r2, r1)
            r2.f21170v = r0
            x2.p r0 = new x2.p
            r1 = 1
            r0.<init>(r2, r1)
            r2.f21171w = r0
            return
    }

    @Override // y0.n
    public final void c1() {
            r1 = this;
            android.view.View r0 = x1.k.y(r1)
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r1.f21169u = r0
            r0.addOnGlobalFocusChangeListener(r1)
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            android.view.ViewTreeObserver r0 = r2.f21169u
            if (r0 == 0) goto Ld
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto Ld
            r0.removeOnGlobalFocusChangeListener(r2)
        Ld:
            r0 = 0
            r2.f21169u = r0
            android.view.View r0 = x1.k.y(r2)
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalFocusChangeListener(r2)
            return
    }

    public final d1.b0 k1() {
            r10 = this;
            y0.n r0 = r10.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitLocalDescendants called on an unattached node"
            u1.a.b(r0)
        Lb:
            y0.n r0 = r10.f21819g
            int r1 = r0.f21822j
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L75
            y0.n r0 = r0.f21824l
            r1 = 0
            r2 = r1
        L17:
            if (r0 == 0) goto L75
            int r3 = r0.f21821i
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L72
            r3 = 0
            r4 = r0
            r5 = r3
        L22:
            if (r4 == 0) goto L72
            boolean r6 = r4 instanceof d1.b0
            r7 = 1
            if (r6 == 0) goto L32
            r6 = r4
            d1.b0 r6 = (d1.b0) r6
            if (r2 == 0) goto L2f
            return r6
        L2f:
            r6 = r1
            r2 = r7
            goto L33
        L32:
            r6 = r7
        L33:
            if (r6 == 0) goto L6d
            int r6 = r4.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L6d
            boolean r6 = r4 instanceof x1.j
            if (r6 == 0) goto L6d
            r6 = r4
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r8 = r1
        L45:
            if (r6 == 0) goto L6a
            int r9 = r6.f21821i
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L67
            int r8 = r8 + 1
            if (r8 != r7) goto L53
            r4 = r6
            goto L67
        L53:
            if (r5 != 0) goto L5e
            j0.b r5 = new j0.b
            r9 = 16
            y0.n[] r9 = new y0.n[r9]
            r5.<init>(r9)
        L5e:
            if (r4 == 0) goto L64
            r5.b(r4)
            r4 = r3
        L64:
            r5.b(r6)
        L67:
            y0.n r6 = r6.f21824l
            goto L45
        L6a:
            if (r8 != r7) goto L6d
            goto L22
        L6d:
            y0.n r4 = x1.k.e(r5)
            goto L22
        L72:
            y0.n r0 = r0.f21824l
            goto L17
        L75:
            java.lang.String r0 = "Could not find focus target of embedded view wrapper"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(android.view.View r7, android.view.View r8) {
            r6 = this;
            x1.f0 r0 = x1.k.w(r6)
            x1.r1 r0 = r0.f20902t
            if (r0 != 0) goto La
            goto L92
        La:
            android.view.View r0 = x2.i.c(r6)
            x1.r1 r1 = x1.k.x(r6)
            y1.t r1 = (y1.t) r1
            d1.l r1 = r1.getFocusOwner()
            x1.r1 r2 = x1.k.x(r6)
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L39
            boolean r5 = r7.equals(r2)
            if (r5 != 0) goto L39
            android.view.ViewParent r7 = r7.getParent()
        L2a:
            if (r7 == 0) goto L39
            android.view.ViewParent r5 = r0.getParent()
            if (r7 != r5) goto L34
            r7 = r3
            goto L3a
        L34:
            android.view.ViewParent r7 = r7.getParent()
            goto L2a
        L39:
            r7 = r4
        L3a:
            if (r8 == 0) goto L55
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L55
            android.view.ViewParent r8 = r8.getParent()
        L46:
            if (r8 == 0) goto L55
            android.view.ViewParent r2 = r0.getParent()
            if (r8 != r2) goto L50
            r8 = r3
            goto L56
        L50:
            android.view.ViewParent r8 = r8.getParent()
            goto L46
        L55:
            r8 = r4
        L56:
            if (r7 == 0) goto L5b
            if (r8 == 0) goto L5b
            goto L92
        L5b:
            if (r8 == 0) goto L7b
            d1.b0 r7 = r6.k1()
            d1.z r8 = r7.p1()
            int r8 = r8.ordinal()
            if (r8 == 0) goto L92
            if (r8 == r3) goto L92
            r0 = 2
            if (r8 == r0) goto L92
            r0 = 3
            if (r8 != r0) goto L77
            d1.d.w(r7)
            return
        L77:
            okio.a.k()
            return
        L7b:
            if (r7 == 0) goto L92
            d1.b0 r7 = r6.k1()
            d1.z r7 = r7.p1()
            boolean r7 = r7.a()
            if (r7 == 0) goto L92
            r7 = 8
            d1.p r1 = (d1.p) r1
            r1.b(r7, r4, r4)
        L92:
            return
    }

    @Override // d1.u
    public final void r0(d1.r r2) {
            r1 = this;
            r0 = 0
            r2.c(r0)
            x2.p r0 = r1.f21170v
            r2.e(r0)
            x2.p r0 = r1.f21171w
            r2.b(r0)
            return
    }
}
