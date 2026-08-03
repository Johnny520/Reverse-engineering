package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.appcompat.view.menu.a {
    public androidx.appcompat.widget.a.d i;
    public android.graphics.drawable.Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final android.util.SparseBooleanArray r;
    public androidx.appcompat.widget.a.e s;
    public androidx.appcompat.widget.a.C0010a t;
    public androidx.appcompat.widget.a.c u;
    public androidx.appcompat.widget.a.b v;
    public final androidx.appcompat.widget.a.f w;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0010a extends androidx.appcompat.view.menu.i {
        public final /* synthetic */ androidx.appcompat.widget.a l;

        public C0010a(androidx.appcompat.widget.a r7, android.content.Context r8, androidx.appcompat.view.menu.m r9, android.view.View r10) {
                r6 = this;
                r6.l = r7
                int r1 = androidx.appcompat.R.attr.actionOverflowMenuStyle
                r5 = 0
                r0 = r6
                r2 = r8
                r4 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                androidx.appcompat.view.menu.h r8 = r4.A
                int r8 = r8.x
                r9 = 32
                r8 = r8 & r9
                if (r8 != r9) goto L16
                goto L20
            L16:
                androidx.appcompat.widget.a$d r8 = r7.i
                if (r8 != 0) goto L1e
                androidx.appcompat.view.menu.k r8 = r7.h
                android.view.View r8 = (android.view.View) r8
            L1e:
                r0.e = r8
            L20:
                androidx.appcompat.widget.a$f r7 = r7.w
                r0.h = r7
                a.eb r8 = r0.i
                if (r8 == 0) goto L2b
                r8.h(r7)
            L2b:
                return
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
                r2 = this;
                r0 = 0
                androidx.appcompat.widget.a r1 = r2.l
                r1.t = r0
                r1.getClass()
                super.c()
                return
        }
    }

    public class b extends androidx.appcompat.view.menu.ActionMenuItemView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.a f852a;

        public b(androidx.appcompat.widget.a r1) {
                r0 = this;
                r0.<init>()
                r0.f852a = r1
                return
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.widget.a.e f853a;
        public final /* synthetic */ androidx.appcompat.widget.a b;

        public c(androidx.appcompat.widget.a r1, androidx.appcompat.widget.a.e r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f853a = r2
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                androidx.appcompat.widget.a r0 = r3.b
                androidx.appcompat.view.menu.f r1 = r0.c
                if (r1 == 0) goto Ld
                androidx.appcompat.view.menu.f$a r2 = r1.e
                if (r2 == 0) goto Ld
                r2.b(r1)
            Ld:
                androidx.appcompat.view.menu.k r1 = r0.h
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L2d
                android.os.IBinder r1 = r1.getWindowToken()
                if (r1 == 0) goto L2d
                androidx.appcompat.widget.a$e r1 = r3.f853a
                boolean r2 = r1.b()
                if (r2 == 0) goto L22
                goto L2b
            L22:
                android.view.View r2 = r1.e
                if (r2 != 0) goto L27
                goto L2d
            L27:
                r2 = 0
                r1.d(r2, r2, r2, r2)
            L2b:
                r0.s = r1
            L2d:
                r1 = 0
                r0.u = r1
                return
        }
    }

    public class d extends a.C0113e1 implements androidx.appcompat.widget.ActionMenuView.a {
        public final /* synthetic */ androidx.appcompat.widget.a d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0011a extends a.V6 {
            public final /* synthetic */ androidx.appcompat.widget.a.d j;

            public C0011a(androidx.appcompat.widget.a.d r1, androidx.appcompat.widget.a.d r2) {
                    r0 = this;
                    r0.j = r1
                    r0.<init>(r2)
                    return
            }

            @Override // a.V6
            public final a.InterfaceC0108de b() {
                    r1 = this;
                    androidx.appcompat.widget.a$d r0 = r1.j
                    androidx.appcompat.widget.a r0 = r0.d
                    androidx.appcompat.widget.a$e r0 = r0.s
                    if (r0 != 0) goto La
                    r0 = 0
                    return r0
                La:
                    a.eb r0 = r0.a()
                    return r0
            }

            @Override // a.V6
            public final boolean c() {
                    r1 = this;
                    androidx.appcompat.widget.a$d r0 = r1.j
                    androidx.appcompat.widget.a r0 = r0.d
                    r0.l()
                    r0 = 1
                    return r0
            }

            @Override // a.V6
            public final boolean d() {
                    r2 = this;
                    androidx.appcompat.widget.a$d r0 = r2.j
                    androidx.appcompat.widget.a r0 = r0.d
                    androidx.appcompat.widget.a$c r1 = r0.u
                    if (r1 == 0) goto La
                    r0 = 0
                    return r0
                La:
                    r0.f()
                    r0 = 1
                    return r0
            }
        }

        public d(androidx.appcompat.widget.a r2, android.content.Context r3) {
                r1 = this;
                r1.d = r2
                r2 = 0
                int r0 = androidx.appcompat.R.attr.actionOverflowButtonStyle
                r1.<init>(r3, r2, r0)
                r2 = 1
                r1.setClickable(r2)
                r1.setFocusable(r2)
                r3 = 0
                r1.setVisibility(r3)
                r1.setEnabled(r2)
                java.lang.CharSequence r2 = r1.getContentDescription()
                a.C0467xf.a(r1, r2)
                androidx.appcompat.widget.a$d$a r2 = new androidx.appcompat.widget.a$d$a
                r2.<init>(r1, r1)
                r1.setOnTouchListener(r2)
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean c() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.view.View
        public final boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 0
                r2.playSoundEffect(r0)
                androidx.appcompat.widget.a r0 = r2.d
                r0.l()
                return r1
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int r5, int r6, int r7, int r8) {
                r4 = this;
                boolean r5 = super.setFrame(r5, r6, r7, r8)
                android.graphics.drawable.Drawable r6 = r4.getDrawable()
                android.graphics.drawable.Drawable r7 = r4.getBackground()
                if (r6 == 0) goto L3f
                if (r7 == 0) goto L3f
                int r6 = r4.getWidth()
                int r8 = r4.getHeight()
                int r0 = java.lang.Math.max(r6, r8)
                int r0 = r0 / 2
                int r1 = r4.getPaddingLeft()
                int r2 = r4.getPaddingRight()
                int r1 = r1 - r2
                int r2 = r4.getPaddingTop()
                int r3 = r4.getPaddingBottom()
                int r2 = r2 - r3
                int r6 = r6 + r1
                int r6 = r6 / 2
                int r8 = r8 + r2
                int r8 = r8 / 2
                int r1 = r6 - r0
                int r2 = r8 - r0
                int r6 = r6 + r0
                int r8 = r8 + r0
                a.C0439w5.a.f(r7, r1, r2, r6, r8)
            L3f:
                return r5
        }
    }

    public class e extends androidx.appcompat.view.menu.i {
        public final /* synthetic */ androidx.appcompat.widget.a l;

        public e(androidx.appcompat.widget.a r7, android.content.Context r8, androidx.appcompat.view.menu.f r9, android.view.View r10) {
                r6 = this;
                r6.l = r7
                int r1 = androidx.appcompat.R.attr.actionOverflowMenuStyle
                r5 = 1
                r0 = r6
                r2 = r8
                r4 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 8388613(0x800005, float:1.175495E-38)
                r0.f = r8
                androidx.appcompat.widget.a$f r7 = r7.w
                r0.h = r7
                a.eb r8 = r0.i
                if (r8 == 0) goto L1c
                r8.h(r7)
            L1c:
                return
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
                r3 = this;
                androidx.appcompat.widget.a r0 = r3.l
                androidx.appcompat.view.menu.f r1 = r0.c
                if (r1 == 0) goto La
                r2 = 1
                r1.c(r2)
            La:
                r1 = 0
                r0.s = r1
                super.c()
                return
        }
    }

    public class f implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.a f854a;

        public f(androidx.appcompat.widget.a r1) {
                r0 = this;
                r0.<init>()
                r0.f854a = r1
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f r3, boolean r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.m
                if (r0 == 0) goto L11
                r0 = r3
                androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
                androidx.appcompat.view.menu.f r0 = r0.z
                androidx.appcompat.view.menu.f r0 = r0.k()
                r1 = 0
                r0.c(r1)
            L11:
                androidx.appcompat.widget.a r0 = r2.f854a
                androidx.appcompat.view.menu.j$a r0 = r0.e
                if (r0 == 0) goto L1a
                r0.a(r3, r4)
            L1a:
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f r4) {
                r3 = this;
                androidx.appcompat.widget.a r0 = r3.f854a
                androidx.appcompat.view.menu.f r1 = r0.c
                r2 = 0
                if (r4 != r1) goto L8
                return r2
            L8:
                r1 = r4
                androidx.appcompat.view.menu.m r1 = (androidx.appcompat.view.menu.m) r1
                androidx.appcompat.view.menu.h r1 = r1.A
                r1.getClass()
                r0.getClass()
                androidx.appcompat.view.menu.j$a r0 = r0.e
                if (r0 == 0) goto L1c
                boolean r4 = r0.b(r4)
                return r4
            L1c:
                return r2
        }
    }

    public a(android.content.Context r3) {
            r2 = this;
            int r0 = androidx.appcompat.R.layout.abc_action_menu_layout
            int r1 = androidx.appcompat.R.layout.abc_action_menu_item_layout
            r2.<init>()
            r2.f813a = r3
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.d = r3
            r2.f = r0
            r2.g = r1
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r2.r = r3
            androidx.appcompat.widget.a$f r3 = new androidx.appcompat.widget.a$f
            r3.<init>(r2)
            r2.w = r3
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f r3, boolean r4) {
            r2 = this;
            r2.f()
            androidx.appcompat.widget.a$a r0 = r2.t
            if (r0 == 0) goto L12
            boolean r1 = r0.b()
            if (r1 == 0) goto L12
            a.eb r0 = r0.i
            r0.dismiss()
        L12:
            androidx.appcompat.view.menu.j$a r0 = r2.e
            if (r0 == 0) goto L19
            r0.a(r3, r4)
        L19:
            return
    }

    public final android.view.View b(androidx.appcompat.view.menu.h r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r0 = r4.getActionView()
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r2 = r4.e()
            if (r2 == 0) goto L3e
        Ld:
            boolean r0 = r5 instanceof androidx.appcompat.view.menu.k.a
            if (r0 == 0) goto L14
            androidx.appcompat.view.menu.k$a r5 = (androidx.appcompat.view.menu.k.a) r5
            goto L1e
        L14:
            int r5 = r3.g
            android.view.LayoutInflater r0 = r3.d
            android.view.View r5 = r0.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.k$a r5 = (androidx.appcompat.view.menu.k.a) r5
        L1e:
            r5.b(r4)
            androidx.appcompat.view.menu.k r0 = r3.h
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r2 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            r2.setItemInvoker(r0)
            androidx.appcompat.widget.a$b r0 = r3.v
            if (r0 != 0) goto L36
            androidx.appcompat.widget.a$b r0 = new androidx.appcompat.widget.a$b
            r0.<init>(r3)
            r3.v = r0
        L36:
            androidx.appcompat.widget.a$b r0 = r3.v
            r2.setPopupCallback(r0)
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L3e:
            boolean r4 = r4.C
            if (r4 == 0) goto L44
            r1 = 8
        L44:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionMenuView r6 = (androidx.appcompat.widget.ActionMenuView) r6
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            r6.getClass()
            boolean r5 = r4 instanceof androidx.appcompat.widget.ActionMenuView.c
            if (r5 != 0) goto L5b
            androidx.appcompat.widget.ActionMenuView$c r4 = androidx.appcompat.widget.ActionMenuView.m(r4)
            r0.setLayoutParams(r4)
        L5b:
            return r0
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
            r17 = this;
            r0 = r17
            androidx.appcompat.view.menu.f r1 = r0.c
            r3 = 0
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = r1.l()
            int r4 = r1.size()
            goto L12
        L10:
            r4 = r3
            r1 = 0
        L12:
            int r5 = r0.p
            int r6 = r0.o
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.view.menu.k r8 = r0.h
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = r3
            r10 = r9
            r11 = r10
            r12 = r11
        L22:
            r13 = 2
            r14 = 1
            if (r9 >= r4) goto L4a
            java.lang.Object r15 = r1.get(r9)
            androidx.appcompat.view.menu.h r15 = (androidx.appcompat.view.menu.h) r15
            int r3 = r15.y
            r2 = r3 & 2
            if (r2 != r13) goto L35
            int r11 = r11 + 1
            goto L3d
        L35:
            r2 = r3 & 1
            if (r2 != r14) goto L3c
            int r12 = r12 + 1
            goto L3d
        L3c:
            r10 = r14
        L3d:
            boolean r2 = r0.q
            if (r2 == 0) goto L46
            boolean r2 = r15.C
            if (r2 == 0) goto L46
            r5 = 0
        L46:
            int r9 = r9 + 1
            r3 = 0
            goto L22
        L4a:
            boolean r2 = r0.l
            if (r2 == 0) goto L55
            if (r10 != 0) goto L53
            int r12 = r12 + r11
            if (r12 <= r5) goto L55
        L53:
            int r5 = r5 + (-1)
        L55:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r2 = r0.r
            r2.clear()
            r3 = 0
            r9 = 0
        L5d:
            if (r3 >= r4) goto Lfb
            java.lang.Object r10 = r1.get(r3)
            androidx.appcompat.view.menu.h r10 = (androidx.appcompat.view.menu.h) r10
            int r11 = r10.y
            r12 = r11 & 2
            if (r12 != r13) goto L6d
            r12 = r14
            goto L6e
        L6d:
            r12 = 0
        L6e:
            int r15 = r10.b
            if (r12 == 0) goto L8d
            r12 = 0
            android.view.View r11 = r0.b(r10, r12, r8)
            r11.measure(r7, r7)
            int r11 = r11.getMeasuredWidth()
            int r6 = r6 - r11
            if (r9 != 0) goto L82
            r9 = r11
        L82:
            if (r15 == 0) goto L87
            r2.put(r15, r14)
        L87:
            r10.f(r14)
        L8a:
            r0 = 0
            goto Lf3
        L8d:
            r11 = r11 & 1
            if (r11 != r14) goto Lef
            boolean r11 = r2.get(r15)
            if (r5 > 0) goto L99
            if (r11 == 0) goto L9d
        L99:
            if (r6 <= 0) goto L9d
            r12 = r14
            goto L9e
        L9d:
            r12 = 0
        L9e:
            r13 = 0
            if (r12 == 0) goto Lb8
            android.view.View r14 = r0.b(r10, r13, r8)
            r14.measure(r7, r7)
            int r14 = r14.getMeasuredWidth()
            int r6 = r6 - r14
            if (r9 != 0) goto Lb0
            r9 = r14
        Lb0:
            int r14 = r6 + r9
            if (r14 <= 0) goto Lb6
            r14 = 1
            goto Lb7
        Lb6:
            r14 = 0
        Lb7:
            r12 = r12 & r14
        Lb8:
            if (r12 == 0) goto Lc1
            if (r15 == 0) goto Lc1
            r14 = 1
            r2.put(r15, r14)
            goto Le7
        Lc1:
            if (r11 == 0) goto Le7
            r11 = 0
            r2.put(r15, r11)
            r11 = 0
        Lc8:
            if (r11 >= r3) goto Le7
            java.lang.Object r14 = r1.get(r11)
            androidx.appcompat.view.menu.h r14 = (androidx.appcompat.view.menu.h) r14
            int r13 = r14.b
            if (r13 != r15) goto Le1
            int r13 = r14.x
            r0 = 32
            r13 = r13 & r0
            if (r13 != r0) goto Ldd
            int r5 = r5 + 1
        Ldd:
            r0 = 0
            r14.f(r0)
        Le1:
            int r11 = r11 + 1
            r13 = 0
            r0 = r17
            goto Lc8
        Le7:
            if (r12 == 0) goto Leb
            int r5 = r5 + (-1)
        Leb:
            r10.f(r12)
            goto L8a
        Lef:
            r0 = 0
            r10.f(r0)
        Lf3:
            int r3 = r3 + 1
            r13 = 2
            r0 = r17
            r14 = 1
            goto L5d
        Lfb:
            r16 = r14
            return r16
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(android.content.Context r5, androidx.appcompat.view.menu.f r6) {
            r4 = this;
            r4.b = r5
            android.view.LayoutInflater.from(r5)
            r4.c = r6
            android.content.res.Resources r6 = r5.getResources()
            boolean r0 = r4.m
            if (r0 != 0) goto L12
            r0 = 1
            r4.l = r0
        L12:
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1 = 2
            int r0 = r0 / r1
            r4.n = r0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r0 = r5.screenWidthDp
            int r2 = r5.screenHeightDp
            int r5 = r5.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r5 > r3) goto L5a
            if (r0 > r3) goto L5a
            r5 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r3) goto L3c
            if (r2 > r5) goto L5a
        L3c:
            if (r0 <= r5) goto L41
            if (r2 <= r3) goto L41
            goto L5a
        L41:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L58
            r5 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r0 <= r3) goto L4d
            if (r2 > r5) goto L58
        L4d:
            if (r0 <= r5) goto L52
            if (r2 <= r3) goto L52
            goto L58
        L52:
            r5 = 360(0x168, float:5.04E-43)
            if (r0 < r5) goto L5b
            r1 = 3
            goto L5b
        L58:
            r1 = 4
            goto L5b
        L5a:
            r1 = 5
        L5b:
            r4.p = r1
            int r5 = r4.n
            boolean r0 = r4.l
            r1 = 0
            if (r0 == 0) goto L90
            androidx.appcompat.widget.a$d r0 = r4.i
            if (r0 != 0) goto L88
            androidx.appcompat.widget.a$d r0 = new androidx.appcompat.widget.a$d
            android.content.Context r2 = r4.f813a
            r0.<init>(r4, r2)
            r4.i = r0
            boolean r2 = r4.k
            r3 = 0
            if (r2 == 0) goto L7f
            android.graphics.drawable.Drawable r2 = r4.j
            r0.setImageDrawable(r2)
            r4.j = r1
            r4.k = r3
        L7f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.widget.a$d r1 = r4.i
            r1.measure(r0, r0)
        L88:
            androidx.appcompat.widget.a$d r0 = r4.i
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L92
        L90:
            r4.i = r1
        L92:
            r4.o = r5
            android.util.DisplayMetrics r5 = r6.getDisplayMetrics()
            float r5 = r5.density
            return
    }

    public final boolean f() {
            r3 = this;
            androidx.appcompat.widget.a$c r0 = r3.u
            r1 = 1
            if (r0 == 0) goto L12
            androidx.appcompat.view.menu.k r2 = r3.h
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.u = r0
            return r1
        L12:
            androidx.appcompat.widget.a$e r0 = r3.s
            if (r0 == 0) goto L22
            boolean r2 = r0.b()
            if (r2 == 0) goto L21
            a.eb r0 = r0.i
            r0.dismiss()
        L21:
            return r1
        L22:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
            r11 = this;
            androidx.appcompat.view.menu.k r0 = r11.h
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La
            goto L78
        La:
            androidx.appcompat.view.menu.f r3 = r11.c
            if (r3 == 0) goto L62
            r3.i()
            androidx.appcompat.view.menu.f r3 = r11.c
            java.util.ArrayList r3 = r3.l()
            int r4 = r3.size()
            r5 = r2
            r6 = r5
        L1d:
            if (r5 >= r4) goto L63
            java.lang.Object r7 = r3.get(r5)
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            int r8 = r7.x
            r9 = 32
            r8 = r8 & r9
            if (r8 != r9) goto L5f
            android.view.View r8 = r0.getChildAt(r6)
            boolean r9 = r8 instanceof androidx.appcompat.view.menu.k.a
            if (r9 == 0) goto L3c
            r9 = r8
            androidx.appcompat.view.menu.k$a r9 = (androidx.appcompat.view.menu.k.a) r9
            androidx.appcompat.view.menu.h r9 = r9.getItemData()
            goto L3d
        L3c:
            r9 = r1
        L3d:
            android.view.View r10 = r11.b(r7, r8, r0)
            if (r7 == r9) goto L49
            r10.setPressed(r2)
            r10.jumpDrawablesToCurrentState()
        L49:
            if (r10 == r8) goto L5d
            android.view.ViewParent r7 = r10.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L56
            r7.removeView(r10)
        L56:
            androidx.appcompat.view.menu.k r7 = r11.h
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.addView(r10, r6)
        L5d:
            int r6 = r6 + 1
        L5f:
            int r5 = r5 + 1
            goto L1d
        L62:
            r6 = r2
        L63:
            int r3 = r0.getChildCount()
            if (r6 >= r3) goto L78
            android.view.View r3 = r0.getChildAt(r6)
            androidx.appcompat.widget.a$d r4 = r11.i
            if (r3 != r4) goto L74
            int r6 = r6 + 1
            goto L63
        L74:
            r0.removeViewAt(r6)
            goto L63
        L78:
            androidx.appcompat.view.menu.k r0 = r11.h
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            androidx.appcompat.view.menu.f r0 = r11.c
            if (r0 == 0) goto L9a
            r0.i()
            java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r0.i
            int r3 = r0.size()
            r4 = r2
        L8d:
            if (r4 >= r3) goto L9a
            java.lang.Object r5 = r0.get(r4)
            androidx.appcompat.view.menu.h r5 = (androidx.appcompat.view.menu.h) r5
            a.Q r5 = r5.A
            int r4 = r4 + 1
            goto L8d
        L9a:
            androidx.appcompat.view.menu.f r0 = r11.c
            if (r0 == 0) goto La3
            r0.i()
            java.util.ArrayList<androidx.appcompat.view.menu.h> r1 = r0.j
        La3:
            boolean r0 = r11.l
            r3 = 1
            if (r0 == 0) goto Lbe
            if (r1 == 0) goto Lbe
            int r0 = r1.size()
            if (r0 != r3) goto Lbb
            java.lang.Object r0 = r1.get(r2)
            androidx.appcompat.view.menu.h r0 = (androidx.appcompat.view.menu.h) r0
            boolean r0 = r0.C
            r2 = r0 ^ 1
            goto Lbe
        Lbb:
            if (r0 <= 0) goto Lbe
            r2 = r3
        Lbe:
            if (r2 == 0) goto Lf3
            androidx.appcompat.widget.a$d r0 = r11.i
            if (r0 != 0) goto Lcd
            androidx.appcompat.widget.a$d r0 = new androidx.appcompat.widget.a$d
            android.content.Context r1 = r11.f813a
            r0.<init>(r11, r1)
            r11.i = r0
        Lcd:
            androidx.appcompat.widget.a$d r0 = r11.i
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.appcompat.view.menu.k r1 = r11.h
            if (r0 == r1) goto L106
            if (r0 == 0) goto Le0
            androidx.appcompat.widget.a$d r1 = r11.i
            r0.removeView(r1)
        Le0:
            androidx.appcompat.view.menu.k r0 = r11.h
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            androidx.appcompat.widget.a$d r1 = r11.i
            r0.getClass()
            androidx.appcompat.widget.ActionMenuView$c r2 = androidx.appcompat.widget.ActionMenuView.l()
            r2.f836a = r3
            r0.addView(r1, r2)
            goto L106
        Lf3:
            androidx.appcompat.widget.a$d r0 = r11.i
            if (r0 == 0) goto L106
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.view.menu.k r1 = r11.h
            if (r0 != r1) goto L106
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            androidx.appcompat.widget.a$d r0 = r11.i
            r1.removeView(r0)
        L106:
            androidx.appcompat.view.menu.k r0 = r11.h
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            boolean r1 = r11.l
            r0.setOverflowReserved(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(androidx.appcompat.view.menu.m r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            goto L3c
        L8:
            r0 = r10
        L9:
            androidx.appcompat.view.menu.f r2 = r0.z
            androidx.appcompat.view.menu.f r3 = r9.c
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.k r2 = r9.h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1b
            goto L3a
        L1b:
            int r4 = r2.getChildCount()
            r5 = r1
        L20:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.k.a
            if (r7 == 0) goto L37
            r7 = r6
            androidx.appcompat.view.menu.k$a r7 = (androidx.appcompat.view.menu.k.a) r7
            androidx.appcompat.view.menu.h r7 = r7.getItemData()
            androidx.appcompat.view.menu.h r8 = r0.A
            if (r7 != r8) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L20
        L3a:
            if (r3 != 0) goto L3d
        L3c:
            return r1
        L3d:
            androidx.appcompat.view.menu.h r0 = r10.A
            r0.getClass()
            java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r10.f
            int r0 = r0.size()
            r2 = r1
        L49:
            r4 = 1
            if (r2 >= r0) goto L61
            android.view.MenuItem r5 = r10.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5e
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5e
            r0 = r4
            goto L62
        L5e:
            int r2 = r2 + 1
            goto L49
        L61:
            r0 = r1
        L62:
            androidx.appcompat.widget.a$a r2 = new androidx.appcompat.widget.a$a
            android.content.Context r5 = r9.b
            r2.<init>(r9, r5, r10, r3)
            r9.t = r2
            r2.g = r0
            a.eb r2 = r2.i
            if (r2 == 0) goto L74
            r2.o(r0)
        L74:
            androidx.appcompat.widget.a$a r0 = r9.t
            boolean r2 = r0.b()
            if (r2 == 0) goto L7d
            goto L84
        L7d:
            android.view.View r2 = r0.e
            if (r2 == 0) goto L8c
            r0.d(r1, r1, r1, r1)
        L84:
            androidx.appcompat.view.menu.j$a r0 = r9.e
            if (r0 == 0) goto L8b
            r0.b(r10)
        L8b:
            return r4
        L8c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r10.<init>(r0)
            throw r10
    }

    public final boolean k() {
            r1 = this;
            androidx.appcompat.widget.a$e r0 = r1.s
            if (r0 == 0) goto Lc
            boolean r0 = r0.b()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean l() {
            r4 = this;
            boolean r0 = r4.l
            if (r0 == 0) goto L3c
            boolean r0 = r4.k()
            if (r0 != 0) goto L3c
            androidx.appcompat.view.menu.f r0 = r4.c
            if (r0 == 0) goto L3c
            androidx.appcompat.view.menu.k r1 = r4.h
            if (r1 == 0) goto L3c
            androidx.appcompat.widget.a$c r1 = r4.u
            if (r1 != 0) goto L3c
            r0.i()
            java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r0.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            androidx.appcompat.widget.a$e r0 = new androidx.appcompat.widget.a$e
            android.content.Context r1 = r4.b
            androidx.appcompat.view.menu.f r2 = r4.c
            androidx.appcompat.widget.a$d r3 = r4.i
            r0.<init>(r4, r1, r2, r3)
            androidx.appcompat.widget.a$c r1 = new androidx.appcompat.widget.a$c
            r1.<init>(r4, r0)
            r4.u = r1
            androidx.appcompat.view.menu.k r0 = r4.h
            android.view.View r0 = (android.view.View) r0
            r0.post(r1)
            r0 = 1
            return r0
        L3c:
            r0 = 0
            return r0
    }
}
