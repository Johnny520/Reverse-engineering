package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends android.app.Dialog implements androidx.lifecycle.q, u3.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.s f22261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p4.t f22262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b.f f22263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fg.a f22264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y2.u f22265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.view.View f22266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y2.t f22267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22268n;

    public v(fg.a r17, y2.u r18, android.view.View r19, u2.m r20, u2.c r21, java.util.UUID r22) {
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            android.content.Context r3 = r19.getContext()
            boolean r4 = r1.f22260c
            if (r4 == 0) goto L11
            r4 = 2131361792(0x7f0a0000, float:1.8343346E38)
            goto L14
        L11:
            r4 = 2131361793(0x7f0a0001, float:1.8343348E38)
        L14:
            r2.<init>(r3, r4)
            r3 = 0
            r0.<init>(r2, r3)
            pa.c r2 = new pa.c
            i.e0 r4 = new i.e0
            r5 = 28
            r4.<init>(r0, r5)
            r2.<init>(r0, r4)
            p4.t r4 = new p4.t
            r4.<init>(r2)
            r0.f22262h = r4
            b.f r2 = new b.f
            a1.a r4 = new a1.a
            r6 = 2
            r4.<init>(r0, r6)
            r2.<init>()
            r2.f335b = r4
            tf.k r4 = new tf.k
            r4.<init>()
            r2.f336c = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            r8 = 1
            if (r4 < r7) goto L5b
            b.a r4 = new b.a
            r4.<init>(r2, r3)
            b.a r4 = new b.a
            r4.<init>(r2, r8)
            b.c r9 = b.c.f325a
            android.window.OnBackInvokedCallback r4 = r9.a(r4)
            r2.f337d = r4
        L5b:
            r0.f22263i = r2
            r4 = r17
            r0.f22264j = r4
            r0.f22265k = r1
            r1 = r19
            r0.f22266l = r1
            r4 = 8
            float r4 = (float) r4
            android.view.Window r9 = r0.getWindow()
            r10 = 0
            if (r9 == 0) goto L17d
            y2.u r11 = r0.f22265k
            android.view.Window r12 = r0.getWindow()
            if (r12 == 0) goto L85
            android.view.WindowManager$LayoutParams r13 = r12.getAttributes()
            r11.getClass()
            r13.type = r6
            r12.setAttributes(r13)
        L85:
            r9.requestFeature(r8)
            r11 = 17170445(0x106000d, float:2.461195E-38)
            r9.setBackgroundDrawableResource(r11)
            y2.u r11 = r0.f22265k
            boolean r11 = r11.f22260c
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 35
            r14 = 30
            if (r12 < r13) goto L9e
            b2.b.d(r9, r11)
            goto Lb6
        L9e:
            if (r12 < r14) goto La4
            b2.b.c(r9, r11)
            goto Lb6
        La4:
            android.view.View r13 = r9.getDecorView()
            int r15 = r13.getSystemUiVisibility()
            if (r11 == 0) goto Lb1
            r11 = r15 & (-1793(0xfffffffffffff8ff, float:NaN))
            goto Lb3
        Lb1:
            r11 = r15 | 1792(0x700, float:2.511E-42)
        Lb3:
            r13.setSystemUiVisibility(r11)
        Lb6:
            r11 = 17
            r9.setGravity(r11)
            y2.u r11 = r0.f22265k
            boolean r11 = r11.f22260c
            if (r11 != 0) goto Ldf
            r11 = 65792(0x10100, float:9.2194E-41)
            r9.addFlags(r11)
            android.view.WindowManager$LayoutParams r11 = r9.getAttributes()
            if (r12 < r5) goto Ld2
            y2.o r5 = y2.o.f22245a
            r5.a(r11)
        Ld2:
            if (r12 < r14) goto Ldc
            y2.p r5 = y2.p.f22246a
            r5.b(r11, r3)
            r5.c(r11, r3)
        Ldc:
            r9.setAttributes(r11)
        Ldf:
            y2.t r5 = new y2.t
            android.content.Context r11 = r0.getContext()
            r5.<init>(r11, r9)
            y2.u r11 = r0.f22265k
            r11.getClass()
            java.lang.String r11 = ""
            r0.setTitle(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "Dialog:"
            r11.<init>(r13)
            r13 = r22
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r13 = 2131099699(0x7f060033, float:1.7811759E38)
            r5.setTag(r13, r11)
            r5.setClipChildren(r3)
            r3 = r21
            float r3 = r3.x0(r4)
            r5.setElevation(r3)
            i1.l r3 = new i1.l
            r3.<init>(r6)
            r5.setOutlineProvider(r3)
            r0.f22267m = r5
            android.view.View r3 = r9.getDecorView()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L129
            r10 = r3
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
        L129:
            if (r10 == 0) goto L12e
            c(r10)
        L12e:
            r0.setContentView(r5)
            androidx.lifecycle.q r3 = androidx.lifecycle.d0.a(r1)
            r4 = 2131099773(0x7f06007d, float:1.7811909E38)
            r5.setTag(r4, r3)
            c9.a1 r3 = androidx.lifecycle.d0.b(r1)
            r4 = 2131099777(0x7f060081, float:1.7811917E38)
            r5.setTag(r4, r3)
            u3.c r1 = ac.p.t(r1)
            r3 = 2131099776(0x7f060080, float:1.7811915E38)
            r5.setTag(r3, r1)
            fg.a r1 = r0.f22264j
            y2.u r3 = r0.f22265k
            r4 = r20
            r0.g(r1, r3, r4)
            y2.a r1 = new y2.a
            r1.<init>(r0, r8)
            b.g r3 = new b.g
            r3.<init>(r1)
            androidx.lifecycle.s r1 = r0.d()
            androidx.lifecycle.l r4 = r1.f300c
            androidx.lifecycle.l r5 = androidx.lifecycle.l.f289g
            if (r4 != r5) goto L16d
            goto L17c
        L16d:
            b.d r4 = new b.d
            r4.<init>(r2, r1, r3)
            java.util.concurrent.CopyOnWriteArrayList r1 = r3.f339a
            r1.add(r4)
            if (r12 < r7) goto L17c
            r2.d()
        L17c:
            return
        L17d:
            java.lang.String r1 = "Dialog has no window"
            j8.o.A(r1)
            throw r10
    }

    public static void a(y2.v r0) {
            super.onBackPressed()
            return
    }

    public static final void c(android.view.ViewGroup r4) {
            r0 = 0
            r4.setClipChildren(r0)
            boolean r1 = r4 instanceof y2.t
            if (r1 == 0) goto L9
            goto L23
        L9:
            int r1 = r4.getChildCount()
        Ld:
            if (r0 >= r1) goto L23
            android.view.View r2 = r4.getChildAt(r0)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L20
            c(r2)
        L20:
            int r0 = r0 + 1
            goto Ld
        L23:
            return
    }

    @Override // android.app.Dialog
    public final void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r1.getClass()
            r0.e()
            super.addContentView(r1, r2)
            return
    }

    @Override // u3.c
    public final m.a b() {
            r1 = this;
            p4.t r0 = r1.f22262h
            java.lang.Object r0 = r0.f10225i
            m.a r0 = (m.a) r0
            return r0
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
            r0 = this;
            return
    }

    public final androidx.lifecycle.s d() {
            r2 = this;
            androidx.lifecycle.s r0 = r2.f22261g
            if (r0 != 0) goto Lc
            androidx.lifecycle.s r0 = new androidx.lifecycle.s
            r1 = 1
            r0.<init>(r2, r1)
            r2.f22261g = r0
        Lc:
            return r0
    }

    public final void e() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131099773(0x7f06007d, float:1.7811909E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131099775(0x7f06007f, float:1.7811913E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131099776(0x7f060080, float:1.7811915E38)
            r0.setTag(r1, r2)
            return
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.s f() {
            r1 = this;
            androidx.lifecycle.s r0 = r1.d()
            return r0
    }

    public final void g(fg.a r6, y2.u r7, u2.m r8) {
            r5 = this;
            r5.f22264j = r6
            r5.f22265k = r7
            r7.getClass()
            android.view.View r6 = r5.f22266l
            boolean r6 = y2.m.b(r6)
            android.view.Window r0 = r5.getWindow()
            r0.getClass()
            r1 = 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L1a
            r6 = r1
            goto L1c
        L1a:
            r6 = -8193(0xffffffffffffdfff, float:NaN)
        L1c:
            r0.setFlags(r6, r1)
            int r6 = r8.ordinal()
            r8 = 0
            r0 = 1
            if (r6 == 0) goto L2f
            if (r6 != r0) goto L2b
            r6 = r0
            goto L30
        L2b:
            okio.a.k()
            return
        L2f:
            r6 = r8
        L30:
            y2.t r1 = r5.f22267m
            r1.setLayoutDirection(r6)
            boolean r6 = r7.f22260c
            boolean r7 = r7.f22259b
            android.view.Window r2 = r1.f22252p
            boolean r3 = r1.f22256t
            if (r3 == 0) goto L4a
            boolean r3 = r1.f22254r
            if (r7 != r3) goto L4a
            boolean r3 = r1.f22255s
            if (r6 == r3) goto L48
            goto L4a
        L48:
            r3 = r8
            goto L4b
        L4a:
            r3 = r0
        L4b:
            r1.f22254r = r7
            r1.f22255s = r6
            if (r3 == 0) goto L68
            android.view.WindowManager$LayoutParams r3 = r2.getAttributes()
            r4 = -2
            if (r7 == 0) goto L5a
            r7 = r4
            goto L5b
        L5a:
            r7 = -1
        L5b:
            int r3 = r3.width
            if (r7 != r3) goto L63
            boolean r3 = r1.f22256t
            if (r3 != 0) goto L68
        L63:
            r2.setLayout(r7, r4)
            r1.f22256t = r0
        L68:
            r5.setCanceledOnTouchOutside(r0)
            android.view.Window r7 = r5.getWindow()
            if (r7 == 0) goto L82
            if (r6 == 0) goto L74
            goto L7f
        L74:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 31
            if (r6 >= r8) goto L7d
            r8 = 16
            goto L7f
        L7d:
            r8 = 48
        L7f:
            r7.setSoftInputMode(r8)
        L82:
            return
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r1 = this;
            b.f r0 = r1.f22263i
            r0.a()
            return
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            android.window.OnBackInvokedDispatcher r0 = ai.a.p(r2)
            r0.getClass()
            b.f r1 = r2.f22263i
            r1.getClass()
            r1.f338e = r0
            r1.d()
        L1a:
            p4.t r0 = r2.f22262h
            r0.F(r3)
            androidx.lifecycle.s r3 = r2.d()
            androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_CREATE
            r3.d(r0)
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            y2.u r0 = r1.f22265k
            boolean r0 = r0.f22258a
            if (r0 == 0) goto L1d
            boolean r0 = r3.isTracking()
            if (r0 == 0) goto L1d
            boolean r0 = r3.isCanceled()
            if (r0 != 0) goto L1d
            r0 = 111(0x6f, float:1.56E-43)
            if (r2 != r0) goto L1d
            fg.a r2 = r1.f22264j
            r2.invoke()
            r2 = 1
            return r2
        L1d:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
            r2 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            r0.getClass()
            p4.t r1 = r2.f22262h
            r1.G(r0)
            return r0
    }

    @Override // android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.s r0 = r2.d()
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_RESUME
            r0.d(r1)
            return
    }

    @Override // android.app.Dialog
    public final void onStop() {
            r2 = this;
            androidx.lifecycle.s r0 = r2.d()
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_DESTROY
            r0.d(r1)
            r0 = 0
            r2.f22261g = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            y2.u r1 = r9.f22265k
            r1.getClass()
            y2.t r1 = r9.f22267m
            r1.getClass()
            float r2 = r10.getX()
            float r2 = java.lang.Math.abs(r2)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 3
            r5 = 0
            r6 = 1
            if (r2 > 0) goto L75
            float r2 = r10.getY()
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L75
            android.view.View r2 = r1.getChildAt(r5)
            if (r2 != 0) goto L33
            goto L75
        L33:
            int r3 = r1.getLeft()
            int r7 = r2.getLeft()
            int r7 = r7 + r3
            int r3 = r2.getWidth()
            int r3 = r3 + r7
            int r1 = r1.getTop()
            int r8 = r2.getTop()
            int r8 = r8 + r1
            int r1 = r2.getHeight()
            int r1 = r1 + r8
            float r2 = r10.getX()
            int r2 = ig.a.X(r2)
            if (r7 > r2) goto L75
            if (r2 > r3) goto L75
            float r2 = r10.getY()
            int r2 = ig.a.X(r2)
            if (r8 > r2) goto L75
            if (r2 > r1) goto L75
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L72
            if (r10 == r6) goto L72
            if (r10 == r4) goto L72
            goto L8f
        L72:
            r9.f22268n = r5
            return r0
        L75:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L90
            if (r10 == r6) goto L83
            if (r10 == r4) goto L80
            goto L8f
        L80:
            r9.f22268n = r5
            return r0
        L83:
            boolean r10 = r9.f22268n
            if (r10 == 0) goto L8f
            fg.a r10 = r9.f22264j
            r10.invoke()
            r9.f22268n = r5
            return r6
        L8f:
            return r0
        L90:
            r9.f22268n = r6
            return r6
    }

    @Override // android.app.Dialog
    public final void setContentView(int r1) {
            r0 = this;
            r0.e()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.e()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r1.getClass()
            r0.e()
            super.setContentView(r1, r2)
            return
    }
}
