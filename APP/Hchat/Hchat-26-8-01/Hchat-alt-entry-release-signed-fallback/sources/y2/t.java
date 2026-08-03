package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends y1.a implements g3.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.view.Window f22252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0.j1 f22253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22256t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22257u;

    public t(android.content.Context r1, android.view.Window r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f22252p = r2
            s0.d r1 = y2.r.f22250a
            i0.j1 r1 = i0.r.u(r1)
            r0.f22253q = r1
            int r1 = g3.q.f4227a
            g3.m.b(r0, r0)
            x2.a r1 = new x2.a
            r2 = 1
            r1.<init>(r0, r2)
            g3.q.b(r0, r1)
            return
    }

    @Override // y1.a
    public final void a(i0.h0 r6, int r7) {
            r5 = this;
            r0 = 1735448596(0x6770d814, float:1.1373539E24)
            r6.b0(r0)
            boolean r0 = r6.h(r5)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L19
            r1 = r4
            goto L1a
        L19:
            r1 = r3
        L1a:
            r0 = r0 & r4
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L31
            i0.j1 r0 = r5.f22253q
            java.lang.Object r0 = r0.getValue()
            fg.p r0 = (fg.p) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.invoke(r6, r1)
            goto L34
        L31:
            r6.V()
        L34:
            i0.r1 r6 = r6.t()
            if (r6 == 0) goto L42
            a1.h r0 = new a1.h
            r1 = 6
            r0.<init>(r5, r7, r1)
            r6.f6035d = r0
        L42:
            return
    }

    @Override // g3.e
    public final g3.r0 c(android.view.View r6, g3.r0 r7) {
            r5 = this;
            boolean r6 = r5.f22255s
            if (r6 == 0) goto L5
            goto L3c
        L5:
            r6 = 0
            android.view.View r0 = r5.getChildAt(r6)
            int r1 = r0.getLeft()
            int r1 = java.lang.Math.max(r6, r1)
            int r2 = r0.getTop()
            int r2 = java.lang.Math.max(r6, r2)
            int r3 = r5.getWidth()
            int r4 = r0.getRight()
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r6, r3)
            int r4 = r5.getHeight()
            int r0 = r0.getBottom()
            int r4 = r4 - r0
            int r6 = java.lang.Math.max(r6, r4)
            if (r1 != 0) goto L3d
            if (r2 != 0) goto L3d
            if (r3 != 0) goto L3d
            if (r6 != 0) goto L3d
        L3c:
            return r7
        L3d:
            g3.n0 r7 = r7.f4230a
            g3.r0 r6 = r7.n(r1, r2, r3, r6)
            return r6
    }

    @Override // y1.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.f22257u
            return r0
    }

    @Override // y1.a
    public final void h(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r4 = 0
            android.view.View r4 = r3.getChildAt(r4)
            if (r4 != 0) goto L8
            return
        L8:
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r2 = r2 + r0
            int r7 = r7 - r5
            int r8 = r8 - r6
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            int r7 = r7 - r5
            int r7 = r7 - r1
            int r8 = r8 - r6
            int r8 = r8 - r2
            int r0 = r3.getPaddingLeft()
            int r7 = r7 / 2
            int r7 = r7 + r0
            int r0 = r3.getPaddingTop()
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r5 = r5 + r7
            int r6 = r6 + r8
            r4.layout(r7, r8, r5, r6)
            return
    }

    @Override // y1.a
    public final void i(int r13, int r14) {
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.i(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.f22252p
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L49
            boolean r8 = r12.f22254r
            if (r8 != 0) goto L49
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L49
            boolean r8 = r12.f22255s
            if (r8 == 0) goto L46
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            y2.n r8 = y2.n.f22244a
            int r8 = r8.a(r6)
            goto L4a
        L3b:
            r9 = 32
            if (r8 >= r9) goto L49
            y2.p r8 = y2.p.f22246a
            int r8 = r8.a(r6)
            goto L4a
        L46:
            int r8 = r3 + 1
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L61
            r9 = r0
        L61:
            int r8 = r8 - r11
            if (r8 >= 0) goto L65
            goto L66
        L65:
            r0 = r8
        L66:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 != 0) goto L6d
            goto L71
        L6d:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L71:
            if (r4 != 0) goto L74
            goto L78
        L74:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L78:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L88
            if (r8 == r13) goto L91
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L91
        L88:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L91:
            if (r4 == r7) goto L9d
            if (r4 == r13) goto L9b
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto La6
        L9b:
            r13 = r3
            goto La6
        L9d:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        La6:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.f22255s
            if (r13 != 0) goto Lc7
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lc7
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc7
            r6.addFlags(r7)
            boolean r13 = r12.f22254r
            if (r13 != 0) goto Lc7
            r13 = -1
            r6.setLayout(r13, r13)
        Lc7:
            return
    }
}
