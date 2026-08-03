package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends android.view.View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i1.l f6234q = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1.a f6235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1.v f6236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1.b f6237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.graphics.Outline f6239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u2.c f6241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u2.m f6242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public fg.l f6243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i1.b f6244p;

    static {
            i1.l r0 = new i1.l
            r1 = 0
            r0.<init>(r1)
            i1.m.f6234q = r0
            return
    }

    public m(j1.a r2, f1.v r3, h1.b r4) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            r1.f6235g = r2
            r1.f6236h = r3
            r1.f6237i = r4
            i1.l r2 = i1.m.f6234q
            r1.setOutlineProvider(r2)
            r2 = 1
            r1.f6240l = r2
            u2.d r2 = h1.c.f5041a
            r1.f6241m = r2
            u2.m r2 = u2.m.f13354g
            r1.f6242n = r2
            i1.c r2 = i1.d.f6158a
            r2.getClass()
            i1.a r2 = i1.a.f6130i
            r1.f6243o = r2
            r2 = 0
            r1.setWillNotDraw(r2)
            r2 = 0
            r1.setClipBounds(r2)
            return
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas r18) {
            r17 = this;
            r1 = r17
            f1.v r0 = r1.f6236h
            f1.b r2 = r0.f3125a
            android.graphics.Canvas r3 = r2.f3025a
            r4 = r18
            r2.f3025a = r4
            u2.c r4 = r1.f6241m
            u2.m r5 = r1.f6242n
            int r6 = r1.getWidth()
            float r6 = (float) r6
            int r7 = r1.getHeight()
            float r7 = (float) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r8 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            r10 = 32
            long r8 = r8 << r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            long r6 = r6 | r8
            i1.b r8 = r1.f6244p
            fg.l r9 = r1.f6243o
            h1.b r10 = r1.f6237i
            b5.c r11 = r10.z0()
            u2.c r11 = r11.s()
            b5.c r12 = r10.z0()
            u2.m r12 = r12.u()
            b5.c r13 = r10.z0()
            f1.u r13 = r13.p()
            b5.c r14 = r10.z0()
            long r14 = r14.v()
            b5.c r1 = r10.z0()
            java.lang.Object r1 = r1.f470b
            i1.b r1 = (i1.b) r1
            r16 = r3
            b5.c r3 = r10.z0()
            r3.R(r4)
            r3.S(r5)
            r3.P(r2)
            r3.U(r6)
            r3.f470b = r8
            r2.e()
            r9.invoke(r10)     // Catch: java.lang.Throwable -> L97
            r2.p()
            b5.c r2 = r10.z0()
            r2.R(r11)
            r2.S(r12)
            r2.P(r13)
            r2.U(r14)
            r2.f470b = r1
            f1.b r0 = r0.f3125a
            r1 = r16
            r0.f3025a = r1
            r0 = 0
            r3 = r17
            r3.f6238j = r0
            return
        L97:
            r0 = move-exception
            r3 = r17
            r2.p()
            b5.c r2 = r10.z0()
            r2.R(r11)
            r2.S(r12)
            r2.P(r13)
            r2.U(r14)
            r2.f470b = r1
            throw r0
    }

    @Override // android.view.View
    public final void forceLayout() {
            r0 = this;
            return
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
            r1 = this;
            boolean r0 = r1.f6240l
            return r0
    }

    public final f1.v getCanvasHolder() {
            r1 = this;
            f1.v r0 = r1.f6236h
            return r0
    }

    public final android.view.View getOwnerView() {
            r1 = this;
            j1.a r0 = r1.f6235g
            return r0
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
            r1 = this;
            boolean r0 = r1.f6240l
            return r0
    }

    @Override // android.view.View
    public final void invalidate() {
            r1 = this;
            boolean r0 = r1.f6238j
            if (r0 != 0) goto La
            r0 = 1
            r1.f6238j = r0
            super.invalidate()
        La:
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6240l
            if (r0 == r2) goto L9
            r1.f6240l = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setInvalidated(boolean r1) {
            r0 = this;
            r0.f6238j = r1
            return
    }
}
