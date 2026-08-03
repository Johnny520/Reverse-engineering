package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup implements a.Xa {
    public android.content.res.ColorStateList A;
    public boolean B;
    public boolean C;
    public final java.util.ArrayList<android.view.View> D;
    public final java.util.ArrayList<android.view.View> E;
    public final int[] F;
    public final a.C0049ab G;
    public java.util.ArrayList<android.view.MenuItem> H;
    public androidx.appcompat.widget.Toolbar.h I;
    public final androidx.appcompat.widget.Toolbar.a J;
    public androidx.appcompat.widget.d K;
    public androidx.appcompat.widget.a L;
    public androidx.appcompat.widget.Toolbar.f M;
    public a.C0413uf.c N;
    public a.C0413uf.d O;
    public boolean P;
    public android.window.OnBackInvokedCallback Q;
    public android.window.OnBackInvokedDispatcher R;
    public boolean S;
    public final androidx.appcompat.widget.Toolbar.b T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.widget.ActionMenuView f845a;
    public a.C0345r1 b;
    public a.C0345r1 c;
    public a.C0077c1 d;
    public a.C0113e1 e;
    public final android.graphics.drawable.Drawable f;
    public final java.lang.CharSequence g;
    public a.C0077c1 h;
    public android.view.View i;
    public android.content.Context j;
    public int k;
    public int l;
    public int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public a.Bd t;
    public int u;
    public int v;
    public final int w;
    public java.lang.CharSequence x;
    public java.lang.CharSequence y;
    public android.content.res.ColorStateList z;

    public class a implements androidx.appcompat.widget.ActionMenuView.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f846a;

        public a(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.<init>()
                r0.f846a = r1
                return
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f847a;

        public b(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.<init>()
                r0.f847a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f847a
                r0.u()
                return
        }
    }

    public class c implements androidx.appcompat.view.menu.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f848a;

        public c(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.<init>()
                r0.f848a = r1
                return
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f r1, android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.widget.Toolbar r1 = r0.f848a
                a.uf$d r1 = r1.O
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f r4) {
                r3 = this;
                androidx.appcompat.widget.Toolbar r0 = r3.f848a
                androidx.appcompat.widget.ActionMenuView r1 = r0.f845a
                androidx.appcompat.widget.a r1 = r1.t
                if (r1 == 0) goto Lf
                boolean r1 = r1.k()
                if (r1 == 0) goto Lf
                goto L27
            Lf:
                a.ab r1 = r0.G
                java.util.concurrent.CopyOnWriteArrayList<a.gb> r1 = r1.b
                java.util.Iterator r1 = r1.iterator()
            L17:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r1.next()
                a.gb r2 = (a.InterfaceC0159gb) r2
                r2.b(r4)
                goto L17
            L27:
                a.uf$d r0 = r0.O
                if (r0 == 0) goto L2e
                r0.b(r4)
            L2e:
                return
        }
    }

    public class d implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f849a;

        public d(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.<init>()
                r0.f849a = r1
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r1) {
                r0 = this;
                androidx.appcompat.widget.Toolbar r1 = r0.f849a
                androidx.appcompat.widget.Toolbar$f r1 = r1.M
                if (r1 != 0) goto L8
                r1 = 0
                goto La
            L8:
                androidx.appcompat.view.menu.h r1 = r1.b
            La:
                if (r1 == 0) goto Lf
                r1.collapseActionView()
            Lf:
                return
        }
    }

    public static class e {
        public static android.window.OnBackInvokedDispatcher a(android.view.View r0) {
                android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
                return r0
        }

        public static android.window.OnBackInvokedCallback b(java.lang.Runnable r2) {
                java.util.Objects.requireNonNull(r2)
                a.V0 r0 = new a.V0
                r1 = 2
                r0.<init>(r1, r2)
                return r0
        }

        public static void c(java.lang.Object r1, java.lang.Object r2) {
                android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
                r0 = 1000000(0xf4240, float:1.401298E-39)
                android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
                r1.registerOnBackInvokedCallback(r0, r2)
                return
        }

        public static void d(java.lang.Object r0, java.lang.Object r1) {
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.unregisterOnBackInvokedCallback(r1)
                return
        }
    }

    public class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f850a;
        public androidx.appcompat.view.menu.h b;
        public final /* synthetic */ androidx.appcompat.widget.Toolbar c;

        public f(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }

        @Override // androidx.appcompat.view.menu.j
        public final void a(androidx.appcompat.view.menu.f r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean c(androidx.appcompat.view.menu.h r7) {
                r6 = this;
                androidx.appcompat.widget.Toolbar r0 = r6.c
                android.view.View r1 = r0.i
                boolean r2 = r1 instanceof a.InterfaceC0258m3
                if (r2 == 0) goto Ld
                a.m3 r1 = (a.InterfaceC0258m3) r1
                r1.e()
            Ld:
                android.view.View r1 = r0.i
                r0.removeView(r1)
                a.c1 r1 = r0.h
                r0.removeView(r1)
                r1 = 0
                r0.i = r1
                java.util.ArrayList<android.view.View> r2 = r0.E
                int r3 = r2.size()
                r4 = 1
                int r3 = r3 - r4
            L22:
                if (r3 < 0) goto L30
                java.lang.Object r5 = r2.get(r3)
                android.view.View r5 = (android.view.View) r5
                r0.addView(r5)
                int r3 = r3 + (-1)
                goto L22
            L30:
                r2.clear()
                r6.b = r1
                r0.requestLayout()
                r1 = 0
                r7.C = r1
                androidx.appcompat.view.menu.f r7 = r7.n
                r7.p(r1)
                r0.v()
                return r4
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean d() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.j
        public final void e(android.content.Context r2, androidx.appcompat.view.menu.f r3) {
                r1 = this;
                androidx.appcompat.view.menu.f r2 = r1.f850a
                if (r2 == 0) goto Lb
                androidx.appcompat.view.menu.h r0 = r1.b
                if (r0 == 0) goto Lb
                r2.d(r0)
            Lb:
                r1.f850a = r3
                return
        }

        @Override // androidx.appcompat.view.menu.j
        public final void g() {
                r4 = this;
                androidx.appcompat.view.menu.h r0 = r4.b
                if (r0 == 0) goto L24
                androidx.appcompat.view.menu.f r0 = r4.f850a
                if (r0 == 0) goto L1f
                java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r0.f
                int r0 = r0.size()
                r1 = 0
            Lf:
                if (r1 >= r0) goto L1f
                androidx.appcompat.view.menu.f r2 = r4.f850a
                android.view.MenuItem r2 = r2.getItem(r1)
                androidx.appcompat.view.menu.h r3 = r4.b
                if (r2 != r3) goto L1c
                goto L24
            L1c:
                int r1 = r1 + 1
                goto Lf
            L1f:
                androidx.appcompat.view.menu.h r0 = r4.b
                r4.c(r0)
            L24:
                return
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean i(androidx.appcompat.view.menu.h r7) {
                r6 = this;
                androidx.appcompat.widget.Toolbar r0 = r6.c
                r0.c()
                a.c1 r1 = r0.h
                android.view.ViewParent r1 = r1.getParent()
                if (r1 == r0) goto L1d
                boolean r2 = r1 instanceof android.view.ViewGroup
                if (r2 == 0) goto L18
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                a.c1 r2 = r0.h
                r1.removeView(r2)
            L18:
                a.c1 r1 = r0.h
                r0.addView(r1)
            L1d:
                android.view.View r1 = r7.getActionView()
                r0.i = r1
                r6.b = r7
                android.view.ViewParent r1 = r1.getParent()
                r2 = 2
                if (r1 == r0) goto L51
                boolean r3 = r1 instanceof android.view.ViewGroup
                if (r3 == 0) goto L37
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                android.view.View r3 = r0.i
                r1.removeView(r3)
            L37:
                androidx.appcompat.widget.Toolbar$g r1 = androidx.appcompat.widget.Toolbar.h()
                int r3 = r0.n
                r3 = r3 & 112(0x70, float:1.57E-43)
                r4 = 8388611(0x800003, float:1.1754948E-38)
                r3 = r3 | r4
                r1.f156a = r3
                r1.b = r2
                android.view.View r3 = r0.i
                r3.setLayoutParams(r1)
                android.view.View r1 = r0.i
                r0.addView(r1)
            L51:
                int r1 = r0.getChildCount()
                r3 = 1
                int r1 = r1 - r3
            L57:
                if (r1 < 0) goto L76
                android.view.View r4 = r0.getChildAt(r1)
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.appcompat.widget.Toolbar$g r5 = (androidx.appcompat.widget.Toolbar.g) r5
                int r5 = r5.b
                if (r5 == r2) goto L73
                androidx.appcompat.widget.ActionMenuView r5 = r0.f845a
                if (r4 == r5) goto L73
                r0.removeViewAt(r1)
                java.util.ArrayList<android.view.View> r5 = r0.E
                r5.add(r4)
            L73:
                int r1 = r1 + (-1)
                goto L57
            L76:
                r0.requestLayout()
                r7.C = r3
                androidx.appcompat.view.menu.f r7 = r7.n
                r1 = 0
                r7.p(r1)
                android.view.View r7 = r0.i
                boolean r1 = r7 instanceof a.InterfaceC0258m3
                if (r1 == 0) goto L8c
                a.m3 r7 = (a.InterfaceC0258m3) r7
                r7.d()
            L8c:
                r0.v()
                return r3
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean j(androidx.appcompat.view.menu.m r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static class g extends a.L.a {
        public int b;
    }

    public interface h {
    }

    public static class i extends a.r {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.i> CREATOR = null;
        public int c;
        public boolean d;

        public class a implements android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.Toolbar.i> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.appcompat.widget.Toolbar$i r0 = new androidx.appcompat.widget.Toolbar$i
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final androidx.appcompat.widget.Toolbar.i createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.appcompat.widget.Toolbar$i r0 = new androidx.appcompat.widget.Toolbar$i
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$i[] r1 = new androidx.appcompat.widget.Toolbar.i[r1]
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.Toolbar$i$a r0 = new androidx.appcompat.widget.Toolbar$i$a
                r0.<init>()
                androidx.appcompat.widget.Toolbar.i.CREATOR = r0
                return
        }

        public i(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.c = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.d = r1
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.c
                r1.writeInt(r2)
                boolean r2 = r0.d
                r1.writeInt(r2)
                return
        }
    }

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.toolbarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            r8.<init>(r9, r10, r11)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r8.w = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.D = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.E = r1
            r1 = 2
            int[] r1 = new int[r1]
            r8.F = r1
            a.ab r1 = new a.ab
            a.tf r2 = new a.tf
            r3 = 1
            r2.<init>(r8, r3)
            r1.<init>(r2)
            r8.G = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.H = r1
            androidx.appcompat.widget.Toolbar$a r1 = new androidx.appcompat.widget.Toolbar$a
            r1.<init>(r8)
            r8.J = r1
            androidx.appcompat.widget.Toolbar$b r1 = new androidx.appcompat.widget.Toolbar$b
            r1.<init>(r8)
            r8.T = r1
            android.content.Context r1 = r8.getContext()
            int[] r2 = androidx.appcompat.R.styleable.Toolbar
            a.of r1 = a.C0306of.e(r1, r10, r2, r11)
            int[] r4 = androidx.appcompat.R.styleable.Toolbar
            android.content.res.TypedArray r6 = r1.b
            r2 = r8
            r3 = r9
            r5 = r10
            r7 = r11
            a.C0414ug.i(r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleTextAppearance
            android.content.res.TypedArray r10 = r1.b
            r11 = 0
            int r9 = r10.getResourceId(r9, r11)
            r2.l = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_subtitleTextAppearance
            int r9 = r10.getResourceId(r9, r11)
            r2.m = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_android_gravity
            int r9 = r10.getInteger(r9, r0)
            r2.w = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_buttonGravity
            r0 = 48
            int r9 = r10.getInteger(r9, r0)
            r2.n = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleMargin
            int r9 = r10.getDimensionPixelOffset(r9, r11)
            int r0 = androidx.appcompat.R.styleable.Toolbar_titleMargins
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L8b
            int r0 = androidx.appcompat.R.styleable.Toolbar_titleMargins
            int r9 = r10.getDimensionPixelOffset(r0, r9)
        L8b:
            r2.s = r9
            r2.r = r9
            r2.q = r9
            r2.p = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleMarginStart
            r0 = -1
            int r9 = r10.getDimensionPixelOffset(r9, r0)
            if (r9 < 0) goto L9e
            r2.p = r9
        L9e:
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleMarginEnd
            int r9 = r10.getDimensionPixelOffset(r9, r0)
            if (r9 < 0) goto La8
            r2.q = r9
        La8:
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleMarginTop
            int r9 = r10.getDimensionPixelOffset(r9, r0)
            if (r9 < 0) goto Lb2
            r2.r = r9
        Lb2:
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleMarginBottom
            int r9 = r10.getDimensionPixelOffset(r9, r0)
            if (r9 < 0) goto Lbc
            r2.s = r9
        Lbc:
            int r9 = androidx.appcompat.R.styleable.Toolbar_maxButtonHeight
            int r9 = r10.getDimensionPixelSize(r9, r0)
            r2.o = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_contentInsetStart
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = r10.getDimensionPixelOffset(r9, r0)
            int r3 = androidx.appcompat.R.styleable.Toolbar_contentInsetEnd
            int r3 = r10.getDimensionPixelOffset(r3, r0)
            int r4 = androidx.appcompat.R.styleable.Toolbar_contentInsetLeft
            int r4 = r10.getDimensionPixelSize(r4, r11)
            int r5 = androidx.appcompat.R.styleable.Toolbar_contentInsetRight
            int r5 = r10.getDimensionPixelSize(r5, r11)
            r8.d()
            a.Bd r6 = r2.t
            r6.h = r11
            if (r4 == r0) goto Leb
            r6.e = r4
            r6.f32a = r4
        Leb:
            if (r5 == r0) goto Lf1
            r6.f = r5
            r6.b = r5
        Lf1:
            if (r9 != r0) goto Lf5
            if (r3 == r0) goto Lf8
        Lf5:
            r6.a(r9, r3)
        Lf8:
            int r9 = androidx.appcompat.R.styleable.Toolbar_contentInsetStartWithNavigation
            int r9 = r10.getDimensionPixelOffset(r9, r0)
            r2.u = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_contentInsetEndWithActions
            int r9 = r10.getDimensionPixelOffset(r9, r0)
            r2.v = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_collapseIcon
            android.graphics.drawable.Drawable r9 = r1.b(r9)
            r2.f = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_collapseContentDescription
            java.lang.CharSequence r9 = r10.getText(r9)
            r2.g = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_title
            java.lang.CharSequence r9 = r10.getText(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L127
            r8.setTitle(r9)
        L127:
            int r9 = androidx.appcompat.R.styleable.Toolbar_subtitle
            java.lang.CharSequence r9 = r10.getText(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L136
            r8.setSubtitle(r9)
        L136:
            android.content.Context r9 = r8.getContext()
            r2.j = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_popupTheme
            int r9 = r10.getResourceId(r9, r11)
            r8.setPopupTheme(r9)
            int r9 = androidx.appcompat.R.styleable.Toolbar_navigationIcon
            android.graphics.drawable.Drawable r9 = r1.b(r9)
            if (r9 == 0) goto L150
            r8.setNavigationIcon(r9)
        L150:
            int r9 = androidx.appcompat.R.styleable.Toolbar_navigationContentDescription
            java.lang.CharSequence r9 = r10.getText(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L15f
            r8.setNavigationContentDescription(r9)
        L15f:
            int r9 = androidx.appcompat.R.styleable.Toolbar_logo
            android.graphics.drawable.Drawable r9 = r1.b(r9)
            if (r9 == 0) goto L16a
            r8.setLogo(r9)
        L16a:
            int r9 = androidx.appcompat.R.styleable.Toolbar_logoDescription
            java.lang.CharSequence r9 = r10.getText(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L179
            r8.setLogoDescription(r9)
        L179:
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleTextColor
            boolean r9 = r10.hasValue(r9)
            if (r9 == 0) goto L18a
            int r9 = androidx.appcompat.R.styleable.Toolbar_titleTextColor
            android.content.res.ColorStateList r9 = r1.a(r9)
            r8.setTitleTextColor(r9)
        L18a:
            int r9 = androidx.appcompat.R.styleable.Toolbar_subtitleTextColor
            boolean r9 = r10.hasValue(r9)
            if (r9 == 0) goto L19b
            int r9 = androidx.appcompat.R.styleable.Toolbar_subtitleTextColor
            android.content.res.ColorStateList r9 = r1.a(r9)
            r8.setSubtitleTextColor(r9)
        L19b:
            int r9 = androidx.appcompat.R.styleable.Toolbar_menu
            boolean r9 = r10.hasValue(r9)
            if (r9 == 0) goto L1ac
            int r9 = androidx.appcompat.R.styleable.Toolbar_menu
            int r9 = r10.getResourceId(r9, r11)
            r8.m(r9)
        L1ac:
            r1.f()
            return
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.Menu r1 = r4.getMenu()
            r2 = 0
        La:
            int r3 = r1.size()
            if (r2 >= r3) goto L1a
            android.view.MenuItem r3 = r1.getItem(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto La
        L1a:
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            a.Ie r0 = new a.Ie
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            return r0
    }

    public static androidx.appcompat.widget.Toolbar.g h() {
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 0
            r0.b = r1
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.f156a = r1
            return r0
    }

    public static androidx.appcompat.widget.Toolbar.g i(android.view.ViewGroup.LayoutParams r2) {
            boolean r0 = r2 instanceof androidx.appcompat.widget.Toolbar.g
            r1 = 0
            if (r0 == 0) goto L13
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.g) r2
            r0.<init>(r2)
            r0.b = r1
            int r2 = r2.b
            r0.b = r2
            return r0
        L13:
            boolean r0 = r2 instanceof a.L.a
            if (r0 == 0) goto L21
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            a.L$a r2 = (a.L.a) r2
            r0.<init>(r2)
            r0.b = r1
            return r0
        L21:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L3f
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            r0.b = r1
            int r1 = r2.leftMargin
            r0.leftMargin = r1
            int r1 = r2.topMargin
            r0.topMargin = r1
            int r1 = r2.rightMargin
            r0.rightMargin = r1
            int r2 = r2.bottomMargin
            r0.bottomMargin = r2
            return r0
        L3f:
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            r0.<init>(r2)
            r0.b = r1
            return r0
    }

    public static int k(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
            int r1 = r1.getMarginEnd()
            int r1 = r1 + r0
            return r1
    }

    public static int l(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.topMargin
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            return r0
    }

    public final void a(java.util.ArrayList r9, int r10) {
            r8 = this;
            int r0 = r8.getLayoutDirection()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            int r3 = r8.getChildCount()
            int r4 = r8.getLayoutDirection()
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r4)
            r9.clear()
            r4 = 5
            r5 = 3
            if (r0 == 0) goto L54
            int r3 = r3 - r2
        L1f:
            if (r3 < 0) goto L89
            android.view.View r0 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r6 = r1.b
            if (r6 != 0) goto L51
            boolean r6 = r8.t(r0)
            if (r6 == 0) goto L51
            int r1 = r1.f156a
            int r6 = r8.getLayoutDirection()
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r6)
            r1 = r1 & 7
            if (r1 == r2) goto L4c
            if (r1 == r5) goto L4c
            if (r1 == r4) goto L4c
            if (r6 != r2) goto L4b
            r1 = r4
            goto L4c
        L4b:
            r1 = r5
        L4c:
            if (r1 != r10) goto L51
            r9.add(r0)
        L51:
            int r3 = r3 + (-1)
            goto L1f
        L54:
            if (r1 >= r3) goto L89
            android.view.View r0 = r8.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r6 = (androidx.appcompat.widget.Toolbar.g) r6
            int r7 = r6.b
            if (r7 != 0) goto L86
            boolean r7 = r8.t(r0)
            if (r7 == 0) goto L86
            int r6 = r6.f156a
            int r7 = r8.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            if (r6 == r2) goto L81
            if (r6 == r5) goto L81
            if (r6 == r4) goto L81
            if (r7 != r2) goto L80
            r6 = r4
            goto L81
        L80:
            r6 = r5
        L81:
            if (r6 != r10) goto L86
            r9.add(r0)
        L86:
            int r1 = r1 + 1
            goto L54
        L89:
            return
    }

    @Override // a.Xa
    public final void addMenuProvider(a.InterfaceC0159gb r3) {
            r2 = this;
            a.ab r0 = r2.G
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r1 = r0.b
            r1.add(r3)
            java.lang.Runnable r3 = r0.f400a
            r3.run()
            return
    }

    public final void b(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.Toolbar$g r0 = h()
            goto L18
        Lb:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            androidx.appcompat.widget.Toolbar$g r0 = i(r0)
            goto L18
        L16:
            androidx.appcompat.widget.Toolbar$g r0 = (androidx.appcompat.widget.Toolbar.g) r0
        L18:
            r1 = 1
            r0.b = r1
            if (r4 == 0) goto L2a
            android.view.View r4 = r2.i
            if (r4 == 0) goto L2a
            r3.setLayoutParams(r0)
            java.util.ArrayList<android.view.View> r4 = r2.E
            r4.add(r3)
            return
        L2a:
            r2.addView(r3, r0)
            return
    }

    public final void c() {
            r4 = this;
            a.c1 r0 = r4.h
            if (r0 != 0) goto L3e
            a.c1 r0 = new a.c1
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.R.attr.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.h = r0
            android.graphics.drawable.Drawable r1 = r4.f
            r0.setImageDrawable(r1)
            a.c1 r0 = r4.h
            java.lang.CharSequence r1 = r4.g
            r0.setContentDescription(r1)
            androidx.appcompat.widget.Toolbar$g r0 = h()
            int r1 = r4.n
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.f156a = r1
            r1 = 2
            r0.b = r1
            a.c1 r1 = r4.h
            r1.setLayoutParams(r0)
            a.c1 r0 = r4.h
            androidx.appcompat.widget.Toolbar$d r1 = new androidx.appcompat.widget.Toolbar$d
            r1.<init>(r4)
            r0.setOnClickListener(r1)
        L3e:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof androidx.appcompat.widget.Toolbar.g
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public final void d() {
            r3 = this;
            a.Bd r0 = r3.t
            if (r0 != 0) goto L1e
            a.Bd r0 = new a.Bd
            r0.<init>()
            r1 = 0
            r0.f32a = r1
            r0.b = r1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.c = r2
            r0.d = r2
            r0.e = r1
            r0.f = r1
            r0.g = r1
            r0.h = r1
            r3.t = r0
        L1e:
            return
    }

    public final void e() {
            r3 = this;
            r3.f()
            androidx.appcompat.widget.ActionMenuView r0 = r3.f845a
            androidx.appcompat.view.menu.f r1 = r0.p
            if (r1 != 0) goto L2a
            android.view.Menu r0 = r0.getMenu()
            androidx.appcompat.view.menu.f r0 = (androidx.appcompat.view.menu.f) r0
            androidx.appcompat.widget.Toolbar$f r1 = r3.M
            if (r1 != 0) goto L1a
            androidx.appcompat.widget.Toolbar$f r1 = new androidx.appcompat.widget.Toolbar$f
            r1.<init>(r3)
            r3.M = r1
        L1a:
            androidx.appcompat.widget.ActionMenuView r1 = r3.f845a
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            androidx.appcompat.widget.Toolbar$f r1 = r3.M
            android.content.Context r2 = r3.j
            r0.b(r1, r2)
            r3.v()
        L2a:
            return
    }

    public final void f() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f845a
            if (r0 != 0) goto L42
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
            r3.f845a = r0
            int r1 = r3.k
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f845a
            androidx.appcompat.widget.Toolbar$a r1 = r3.J
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f845a
            a.uf$c r1 = r3.N
            androidx.appcompat.widget.Toolbar$c r2 = new androidx.appcompat.widget.Toolbar$c
            r2.<init>(r3)
            r0.u = r1
            r0.v = r2
            androidx.appcompat.widget.Toolbar$g r0 = h()
            int r1 = r3.n
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1 = r1 | r2
            r0.f156a = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.f845a
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f845a
            r1 = 0
            r3.b(r0, r1)
        L42:
            return
    }

    public final void g() {
            r4 = this;
            a.c1 r0 = r4.d
            if (r0 != 0) goto L25
            a.c1 r0 = new a.c1
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.R.attr.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.d = r0
            androidx.appcompat.widget.Toolbar$g r0 = h()
            int r1 = r4.n
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.f156a = r1
            a.c1 r1 = r4.d
            r1.setLayoutParams(r0)
        L25:
            return
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$g r0 = h()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r5) {
            r4 = this;
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1, r5)
            r2 = 0
            r0.f156a = r2
            int[] r3 = androidx.appcompat.R.styleable.ActionBarLayout
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r3)
            int r1 = androidx.appcompat.R.styleable.ActionBarLayout_android_layout_gravity
            int r1 = r5.getInt(r1, r2)
            r0.f156a = r1
            r5.recycle()
            r0.b = r2
            return r0
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$g r1 = i(r1)
            return r1
    }

    public java.lang.CharSequence getCollapseContentDescription() {
            r1 = this;
            a.c1 r0 = r1.h
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
            r1 = this;
            a.c1 r0 = r1.h
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getContentInsetEnd() {
            r2 = this;
            a.Bd r0 = r2.t
            if (r0 == 0) goto Le
            boolean r1 = r0.g
            if (r1 == 0) goto Lb
            int r0 = r0.f32a
            return r0
        Lb:
            int r0 = r0.b
            return r0
        Le:
            r0 = 0
            return r0
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.v
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r0 = r2.getContentInsetEnd()
            return r0
    }

    public int getContentInsetLeft() {
            r1 = this;
            a.Bd r0 = r1.t
            if (r0 == 0) goto L7
            int r0 = r0.f32a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetRight() {
            r1 = this;
            a.Bd r0 = r1.t
            if (r0 == 0) goto L7
            int r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetStart() {
            r2 = this;
            a.Bd r0 = r2.t
            if (r0 == 0) goto Le
            boolean r1 = r0.g
            if (r1 == 0) goto Lb
            int r0 = r0.b
            return r0
        Lb:
            int r0 = r0.f32a
            return r0
        Le:
            r0 = 0
            return r0
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r0 = r2.getContentInsetStart()
            return r0
    }

    public int getCurrentContentInsetEnd() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f845a
            if (r0 == 0) goto L1e
            androidx.appcompat.view.menu.f r0 = r0.p
            if (r0 == 0) goto L1e
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L1e
            int r0 = r3.getContentInsetEnd()
            int r1 = r3.v
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L1e:
            int r0 = r3.getContentInsetEnd()
            return r0
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r0 = r2.getCurrentContentInsetEnd()
            return r0
        Lc:
            int r0 = r2.getCurrentContentInsetStart()
            return r0
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r0 = r2.getCurrentContentInsetStart()
            return r0
        Lc:
            int r0 = r2.getCurrentContentInsetEnd()
            return r0
    }

    public int getCurrentContentInsetStart() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r3.getContentInsetStart()
            int r1 = r3.u
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L16:
            int r0 = r3.getContentInsetStart()
            return r0
    }

    public android.graphics.drawable.Drawable getLogo() {
            r1 = this;
            a.e1 r0 = r1.e
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r1 = this;
            a.e1 r0 = r1.e
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            r1.e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f845a
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    public android.view.View getNavButtonView() {
            r1 = this;
            a.c1 r0 = r1.d
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r1 = this;
            a.c1 r0 = r1.d
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r1 = this;
            a.c1 r0 = r1.d
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
            r1 = this;
            androidx.appcompat.widget.a r0 = r1.L
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f845a
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.j
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.y
            return r0
    }

    public final android.widget.TextView getSubtitleTextView() {
            r1 = this;
            a.r1 r0 = r1.c
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.x
            return r0
    }

    public int getTitleMarginBottom() {
            r1 = this;
            int r0 = r1.s
            return r0
    }

    public int getTitleMarginEnd() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    public int getTitleMarginStart() {
            r1 = this;
            int r0 = r1.p
            return r0
    }

    public int getTitleMarginTop() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public final android.widget.TextView getTitleTextView() {
            r1 = this;
            a.r1 r0 = r1.b
            return r0
    }

    public a.N4 getWrapper() {
            r2 = this;
            androidx.appcompat.widget.d r0 = r2.K
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.d r0 = new androidx.appcompat.widget.d
            r1 = 1
            r0.<init>(r2, r1)
            r2.K = r0
        Lc:
            androidx.appcompat.widget.d r0 = r2.K
            return r0
    }

    public final int j(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r0 = (androidx.appcompat.widget.Toolbar.g) r0
            int r7 = r7.getMeasuredHeight()
            r1 = 0
            if (r8 <= 0) goto L12
            int r8 = r7 - r8
            int r8 = r8 / 2
            goto L13
        L12:
            r8 = r1
        L13:
            int r2 = r0.f156a
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 16
            r4 = 80
            r5 = 48
            if (r2 == r3) goto L27
            if (r2 == r5) goto L27
            if (r2 == r4) goto L27
            int r2 = r6.w
            r2 = r2 & 112(0x70, float:1.57E-43)
        L27:
            if (r2 == r5) goto L62
            if (r2 == r4) goto L53
            int r8 = r6.getPaddingTop()
            int r2 = r6.getPaddingBottom()
            int r3 = r6.getHeight()
            int r4 = r3 - r8
            int r4 = r4 - r2
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r5 = r0.topMargin
            if (r4 >= r5) goto L43
            r4 = r5
            goto L51
        L43:
            int r3 = r3 - r2
            int r3 = r3 - r7
            int r3 = r3 - r4
            int r3 = r3 - r8
            int r7 = r0.bottomMargin
            if (r3 >= r7) goto L51
            int r7 = r7 - r3
            int r4 = r4 - r7
            int r4 = java.lang.Math.max(r1, r4)
        L51:
            int r8 = r8 + r4
            return r8
        L53:
            int r1 = r6.getHeight()
            int r2 = r6.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = r1 - r7
            int r7 = r0.bottomMargin
            int r1 = r1 - r7
            int r1 = r1 - r8
            return r1
        L62:
            int r7 = r6.getPaddingTop()
            int r7 = r7 - r8
            return r7
    }

    public void m(int r3) {
            r2 = this;
            android.view.MenuInflater r0 = r2.getMenuInflater()
            android.view.Menu r1 = r2.getMenu()
            r0.inflate(r3, r1)
            return
    }

    public final void n() {
            r5 = this;
            java.util.ArrayList<android.view.MenuItem> r0 = r5.H
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            android.view.Menu r2 = r5.getMenu()
            int r1 = r1.getItemId()
            r2.removeItem(r1)
            goto L6
        L1e:
            android.view.Menu r0 = r5.getMenu()
            java.util.ArrayList r1 = r5.getCurrentMenuItems()
            android.view.MenuInflater r2 = r5.getMenuInflater()
            a.ab r3 = r5.G
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r3 = r3.b
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r3.next()
            a.gb r4 = (a.InterfaceC0159gb) r4
            r4.a(r0, r2)
            goto L32
        L42:
            java.util.ArrayList r0 = r5.getCurrentMenuItems()
            r0.removeAll(r1)
            r5.H = r0
            return
    }

    public final boolean o(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList<android.view.View> r0 = r1.E
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.v()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.Toolbar$b r0 = r1.T
            r1.removeCallbacks(r0)
            r1.v()
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.C = r1
        Lb:
            boolean r3 = r5.C
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.C = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.C = r1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
            r18 = this;
            r0 = r18
            int r1 = r0.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.F
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap<android.view.View, a.Jg> r12 = a.C0414ug.f721a
            int r12 = r0.getMinimumHeight()
            if (r12 < 0) goto L3c
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L3d
        L3c:
            r12 = r2
        L3d:
            a.c1 r13 = r0.d
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L58
            if (r1 == 0) goto L50
            a.c1 r13 = r0.d
            int r13 = r0.q(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L5a
        L50:
            a.c1 r13 = r0.d
            int r13 = r0.p(r13, r6, r12, r11)
        L56:
            r14 = r10
            goto L5a
        L58:
            r13 = r6
            goto L56
        L5a:
            a.c1 r15 = r0.h
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L71
            if (r1 == 0) goto L6b
            a.c1 r15 = r0.h
            int r14 = r0.q(r15, r14, r12, r11)
            goto L71
        L6b:
            a.c1 r15 = r0.h
            int r13 = r0.p(r15, r13, r12, r11)
        L71:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f845a
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L88
            if (r1 == 0) goto L82
            androidx.appcompat.widget.ActionMenuView r15 = r0.f845a
            int r13 = r0.p(r15, r13, r12, r11)
            goto L88
        L82:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f845a
            int r14 = r0.q(r15, r14, r12, r11)
        L88:
            int r15 = r0.getCurrentContentInsetLeft()
            int r16 = r0.getCurrentContentInsetRight()
            r19 = r3
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r19] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.i
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto Lc5
            if (r1 == 0) goto Lbf
            android.view.View r13 = r0.i
            int r10 = r0.q(r13, r10, r12, r11)
            goto Lc5
        Lbf:
            android.view.View r13 = r0.i
            int r3 = r0.p(r13, r3, r12, r11)
        Lc5:
            a.e1 r13 = r0.e
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto Ldc
            if (r1 == 0) goto Ld6
            a.e1 r13 = r0.e
            int r10 = r0.q(r13, r10, r12, r11)
            goto Ldc
        Ld6:
            a.e1 r13 = r0.e
            int r3 = r0.p(r13, r3, r12, r11)
        Ldc:
            a.r1 r13 = r0.b
            boolean r13 = r0.t(r13)
            a.r1 r14 = r0.c
            boolean r14 = r0.t(r14)
            if (r13 == 0) goto L101
            a.r1 r15 = r0.b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r2 = r15.topMargin
            r22 = r1
            a.r1 r1 = r0.b
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r15.bottomMargin
            int r1 = r1 + r2
            goto L104
        L101:
            r22 = r1
            r1 = 0
        L104:
            if (r14 == 0) goto L11f
            a.r1 r2 = r0.c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.g) r2
            int r15 = r2.topMargin
            r21 = r1
            a.r1 r1 = r0.c
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r15
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r1 = r1 + r21
            goto L121
        L11f:
            r21 = r1
        L121:
            if (r13 != 0) goto L125
            if (r14 == 0) goto L281
        L125:
            if (r13 == 0) goto L12a
            a.r1 r2 = r0.b
            goto L12c
        L12a:
            a.r1 r2 = r0.c
        L12c:
            if (r14 == 0) goto L131
            a.r1 r15 = r0.c
            goto L133
        L131:
            a.r1 r15 = r0.b
        L133:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.g) r2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            r21 = r1
            if (r13 == 0) goto L14b
            a.r1 r1 = r0.b
            int r1 = r1.getMeasuredWidth()
            if (r1 > 0) goto L155
        L14b:
            if (r14 == 0) goto L158
            a.r1 r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            if (r1 <= 0) goto L158
        L155:
            r23 = r19
            goto L15a
        L158:
            r23 = 0
        L15a:
            int r1 = r0.w
            r1 = r1 & 112(0x70, float:1.57E-43)
            r16 = r3
            r3 = 48
            if (r1 == r3) goto L19d
            r3 = 80
            if (r1 == r3) goto L193
            int r1 = r5 - r8
            int r1 = r1 - r9
            int r1 = r1 - r21
            int r1 = r1 / 2
            int r3 = r2.topMargin
            r17 = r3
            int r3 = r0.r
            int r3 = r17 + r3
            if (r1 >= r3) goto L17b
            r1 = r3
            goto L191
        L17b:
            int r5 = r5 - r9
            int r5 = r5 - r21
            int r5 = r5 - r1
            int r5 = r5 - r8
            int r2 = r2.bottomMargin
            int r3 = r0.s
            int r2 = r2 + r3
            if (r5 >= r2) goto L191
            int r2 = r15.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L191:
            int r8 = r8 + r1
            goto L1a8
        L193:
            int r5 = r5 - r9
            int r1 = r15.bottomMargin
            int r5 = r5 - r1
            int r1 = r0.s
            int r5 = r5 - r1
            int r8 = r5 - r21
            goto L1a8
        L19d:
            int r1 = r0.getPaddingTop()
            int r2 = r2.topMargin
            int r1 = r1 + r2
            int r2 = r0.r
            int r8 = r1 + r2
        L1a8:
            if (r22 == 0) goto L218
            if (r23 == 0) goto L1af
            int r1 = r0.p
            goto L1b0
        L1af:
            r1 = 0
        L1b0:
            r2 = r11[r19]
            int r1 = r1 - r2
            r2 = 0
            int r3 = java.lang.Math.max(r2, r1)
            int r10 = r10 - r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r19] = r1
            if (r13 == 0) goto L1e6
            a.r1 r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            a.r1 r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            a.r1 r3 = r0.b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            a.r1 r5 = r0.b
            r5.layout(r2, r8, r10, r3)
            int r5 = r0.q
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1e7
        L1e6:
            r2 = r10
        L1e7:
            if (r14 == 0) goto L20d
            a.r1 r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            a.r1 r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            a.r1 r3 = r0.c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            a.r1 r5 = r0.c
            r5.layout(r1, r8, r10, r3)
            int r1 = r0.q
            int r1 = r10 - r1
            goto L20e
        L20d:
            r1 = r10
        L20e:
            if (r23 == 0) goto L215
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L215:
            r3 = r16
            goto L281
        L218:
            if (r23 == 0) goto L21e
            int r1 = r0.p
        L21c:
            r2 = 0
            goto L220
        L21e:
            r1 = 0
            goto L21c
        L220:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r16
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L255
            a.r1 r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            a.r1 r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            a.r1 r5 = r0.b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            a.r1 r9 = r0.b
            r9.layout(r3, r8, r2, r5)
            int r8 = r0.q
            int r2 = r2 + r8
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L256
        L255:
            r2 = r3
        L256:
            if (r14 == 0) goto L27a
            a.r1 r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            a.r1 r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            a.r1 r5 = r0.c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            a.r1 r9 = r0.c
            r9.layout(r3, r8, r1, r5)
            int r5 = r0.q
            int r1 = r1 + r5
            goto L27b
        L27a:
            r1 = r3
        L27b:
            if (r23 == 0) goto L281
            int r3 = java.lang.Math.max(r2, r1)
        L281:
            java.util.ArrayList<android.view.View> r1 = r0.D
            r2 = 3
            r0.a(r1, r2)
            int r2 = r1.size()
            r5 = r3
            r3 = 0
        L28d:
            if (r3 >= r2) goto L29c
            java.lang.Object r8 = r1.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r5 = r0.p(r8, r5, r12, r11)
            int r3 = r3 + 1
            goto L28d
        L29c:
            r2 = 5
            r0.a(r1, r2)
            int r2 = r1.size()
            r3 = 0
        L2a5:
            if (r3 >= r2) goto L2b4
            java.lang.Object r8 = r1.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r10 = r0.q(r8, r10, r12, r11)
            int r3 = r3 + 1
            goto L2a5
        L2b4:
            r3 = r19
            r0.a(r1, r3)
            r2 = 0
            r8 = r11[r2]
            r2 = r11[r3]
            int r3 = r1.size()
            r9 = r2
            r13 = r8
            r2 = 0
            r8 = 0
        L2c6:
            if (r2 >= r3) goto L2fe
            java.lang.Object r14 = r1.get(r2)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            r16 = r2
            int r2 = r15.leftMargin
            int r2 = r2 - r13
            int r13 = r15.rightMargin
            int r13 = r13 - r9
            r9 = 0
            int r15 = java.lang.Math.max(r9, r2)
            int r17 = java.lang.Math.max(r9, r13)
            int r2 = -r2
            int r2 = java.lang.Math.max(r9, r2)
            int r13 = -r13
            int r13 = java.lang.Math.max(r9, r13)
            int r14 = r14.getMeasuredWidth()
            int r14 = r14 + r15
            int r14 = r14 + r17
            int r8 = r8 + r14
            r14 = 1
            int r15 = r16 + 1
            r9 = r13
            r13 = r2
            r2 = r15
            goto L2c6
        L2fe:
            r9 = 0
            int r4 = r4 - r6
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r2 = r8 / 2
            int r4 = r4 - r2
            int r8 = r8 + r4
            if (r4 >= r5) goto L30b
            goto L312
        L30b:
            if (r8 <= r10) goto L311
            int r8 = r8 - r10
            int r5 = r4 - r8
            goto L312
        L311:
            r5 = r4
        L312:
            int r2 = r1.size()
        L316:
            if (r9 >= r2) goto L325
            java.lang.Object r3 = r1.get(r9)
            android.view.View r3 = (android.view.View) r3
            int r5 = r0.p(r3, r5, r12, r11)
            r14 = 1
            int r9 = r9 + r14
            goto L316
        L325:
            r1.clear()
            return
    }

    @Override // android.view.View
    public void onMeasure(int r15, int r16) {
            r14 = this;
            int r1 = r14.getLayoutDirection()
            r2 = 1
            r7 = 0
            if (r1 != r2) goto Lb
            r6 = r2
            r8 = r7
            goto Ld
        Lb:
            r8 = r2
            r6 = r7
        Ld:
            a.c1 r1 = r14.d
            boolean r1 = r14.t(r1)
            r3 = 0
            if (r1 == 0) goto L4c
            a.c1 r1 = r14.d
            int r5 = r14.o
            r0 = r14
            r2 = r15
            r4 = r16
            r0.s(r1, r2, r3, r4, r5)
            a.c1 r1 = r14.d
            int r1 = r1.getMeasuredWidth()
            a.c1 r2 = r14.d
            int r2 = k(r2)
            int r2 = r2 + r1
            a.c1 r1 = r14.d
            int r1 = r1.getMeasuredHeight()
            a.c1 r4 = r14.d
            int r4 = l(r4)
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r7, r4)
            a.c1 r4 = r14.d
            int r4 = r4.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r7, r4)
            r9 = r1
            r10 = r4
            goto L4f
        L4c:
            r2 = r7
            r9 = r2
            r10 = r9
        L4f:
            a.c1 r1 = r14.h
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L8a
            a.c1 r1 = r14.h
            int r5 = r14.o
            r0 = r14
            r2 = r15
            r4 = r16
            r0.s(r1, r2, r3, r4, r5)
            a.c1 r1 = r14.h
            int r1 = r1.getMeasuredWidth()
            a.c1 r2 = r14.h
            int r2 = k(r2)
            int r2 = r2 + r1
            a.c1 r1 = r14.h
            int r1 = r1.getMeasuredHeight()
            a.c1 r3 = r14.h
            int r3 = l(r3)
            int r3 = r3 + r1
            int r9 = java.lang.Math.max(r9, r3)
            a.c1 r1 = r14.h
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L8a:
            int r1 = r14.getCurrentContentInsetStart()
            int r3 = java.lang.Math.max(r1, r2)
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r7, r1)
            r2 = r6
            int[] r6 = r14.F
            r6[r2] = r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.f845a
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto Ld8
            androidx.appcompat.widget.ActionMenuView r1 = r14.f845a
            int r5 = r14.o
            r0 = r14
            r2 = r15
            r4 = r16
            r0.s(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionMenuView r1 = r14.f845a
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r2 = r14.f845a
            int r2 = k(r2)
            int r2 = r2 + r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.f845a
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r4 = r14.f845a
            int r4 = l(r4)
            int r4 = r4 + r1
            int r9 = java.lang.Math.max(r9, r4)
            androidx.appcompat.widget.ActionMenuView r1 = r14.f845a
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            goto Ld9
        Ld8:
            r2 = r7
        Ld9:
            int r1 = r14.getCurrentContentInsetEnd()
            int r4 = java.lang.Math.max(r1, r2)
            int r3 = r3 + r4
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r7, r1)
            r6[r8] = r1
            android.view.View r1 = r14.i
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L118
            android.view.View r1 = r14.i
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.r(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            android.view.View r1 = r14.i
            int r1 = r1.getMeasuredHeight()
            android.view.View r2 = r14.i
            int r2 = l(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            android.view.View r1 = r14.i
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L118:
            a.e1 r1 = r14.e
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L147
            a.e1 r1 = r14.e
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.r(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            a.e1 r1 = r14.e
            int r1 = r1.getMeasuredHeight()
            a.e1 r2 = r14.e
            int r2 = l(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            a.e1 r1 = r14.e
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L147:
            int r8 = r14.getChildCount()
            r11 = r7
        L14c:
            if (r11 >= r8) goto L18c
            android.view.View r1 = r14.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.g) r2
            int r2 = r2.b
            if (r2 != 0) goto L162
            boolean r2 = r14.t(r1)
            if (r2 != 0) goto L164
        L162:
            r12 = r3
            goto L188
        L164:
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r5 = r0.r(r1, r2, r3, r4, r5, r6)
            r12 = r3
            int r3 = r12 + r5
            int r2 = r1.getMeasuredHeight()
            int r4 = l(r1)
            int r4 = r4 + r2
            int r2 = java.lang.Math.max(r9, r4)
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r10, r1)
            r10 = r1
            r9 = r2
            goto L189
        L188:
            r3 = r12
        L189:
            int r11 = r11 + 1
            goto L14c
        L18c:
            r12 = r3
            int r1 = r14.r
            int r2 = r14.s
            int r5 = r1 + r2
            int r1 = r14.p
            int r2 = r14.q
            int r8 = r1 + r2
            a.r1 r1 = r14.b
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L1d4
            a.r1 r1 = r14.b
            int r3 = r12 + r8
            r0 = r14
            r2 = r15
            r4 = r16
            r0.r(r1, r2, r3, r4, r5, r6)
            a.r1 r1 = r14.b
            int r1 = r1.getMeasuredWidth()
            a.r1 r2 = r14.b
            int r2 = k(r2)
            int r2 = r2 + r1
            a.r1 r1 = r14.b
            int r1 = r1.getMeasuredHeight()
            a.r1 r3 = r14.b
            int r3 = l(r3)
            int r3 = r3 + r1
            a.r1 r1 = r14.b
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            r11 = r3
            r13 = r10
            r10 = r2
            goto L1d7
        L1d4:
            r11 = r7
            r13 = r10
            r10 = r11
        L1d7:
            a.r1 r1 = r14.c
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L208
            a.r1 r1 = r14.c
            int r3 = r12 + r8
            int r5 = r5 + r11
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.r(r1, r2, r3, r4, r5, r6)
            int r10 = java.lang.Math.max(r10, r1)
            a.r1 r1 = r14.c
            int r1 = r1.getMeasuredHeight()
            a.r1 r2 = r14.c
            int r2 = l(r2)
            int r2 = r2 + r1
            int r11 = r11 + r2
            a.r1 r1 = r14.c
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
        L208:
            int r3 = r12 + r10
            int r1 = java.lang.Math.max(r9, r11)
            int r2 = r14.getPaddingLeft()
            int r4 = r14.getPaddingRight()
            int r4 = r4 + r2
            int r4 = r4 + r3
            int r2 = r14.getPaddingTop()
            int r3 = r14.getPaddingBottom()
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r1 = r14.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r13
            int r1 = android.view.View.resolveSizeAndState(r1, r15, r2)
            int r2 = r14.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r3, r2)
            int r3 = r13 << 16
            r4 = r16
            int r2 = android.view.View.resolveSizeAndState(r2, r4, r3)
            boolean r3 = r14.P
            if (r3 != 0) goto L246
            goto L263
        L246:
            int r3 = r14.getChildCount()
            r4 = r7
        L24b:
            if (r4 >= r3) goto L268
            android.view.View r5 = r14.getChildAt(r4)
            boolean r6 = r14.t(r5)
            if (r6 == 0) goto L265
            int r6 = r5.getMeasuredWidth()
            if (r6 <= 0) goto L265
            int r5 = r5.getMeasuredHeight()
            if (r5 <= 0) goto L265
        L263:
            r7 = r2
            goto L268
        L265:
            int r4 = r4 + 1
            goto L24b
        L268:
            r14.setMeasuredDimension(r1, r7)
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar.i
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            androidx.appcompat.widget.Toolbar$i r4 = (androidx.appcompat.widget.Toolbar.i) r4
            android.os.Parcelable r0 = r4.f661a
            super.onRestoreInstanceState(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f845a
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.f r0 = r0.p
            goto L17
        L16:
            r0 = 0
        L17:
            int r1 = r4.c
            if (r1 == 0) goto L2a
            androidx.appcompat.widget.Toolbar$f r2 = r3.M
            if (r2 == 0) goto L2a
            if (r0 == 0) goto L2a
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L2a
            r0.expandActionView()
        L2a:
            boolean r4 = r4.d
            if (r4 == 0) goto L36
            androidx.appcompat.widget.Toolbar$b r4 = r3.T
            r3.removeCallbacks(r4)
            r3.post(r4)
        L36:
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            a.Bd r0 = r2.t
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.g
            if (r1 != r3) goto L12
            return
        L12:
            r0.g = r1
            boolean r3 = r0.h
            if (r3 == 0) goto L42
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2f
            int r1 = r0.d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.e
        L23:
            r0.f32a = r1
            int r1 = r0.c
            if (r1 == r3) goto L2a
            goto L2c
        L2a:
            int r1 = r0.f
        L2c:
            r0.b = r1
            return
        L2f:
            int r1 = r0.c
            if (r1 == r3) goto L34
            goto L36
        L34:
            int r1 = r0.e
        L36:
            r0.f32a = r1
            int r1 = r0.d
            if (r1 == r3) goto L3d
            goto L3f
        L3d:
            int r1 = r0.f
        L3f:
            r0.b = r1
            return
        L42:
            int r3 = r0.e
            r0.f32a = r3
            int r3 = r0.f
            r0.b = r3
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$i r0 = new androidx.appcompat.widget.Toolbar$i
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$f r1 = r2.M
            if (r1 == 0) goto L15
            androidx.appcompat.view.menu.h r1 = r1.b
            if (r1 == 0) goto L15
            int r1 = r1.f824a
            r0.c = r1
        L15:
            androidx.appcompat.widget.ActionMenuView r1 = r2.f845a
            if (r1 == 0) goto L25
            androidx.appcompat.widget.a r1 = r1.t
            if (r1 == 0) goto L25
            boolean r1 = r1.k()
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            r0.d = r1
            return r0
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.B = r1
        L9:
            boolean r2 = r4.B
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.B = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.B = r1
            return r3
    }

    public final int p(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r0 = (androidx.appcompat.widget.Toolbar.g) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r8[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r6
            int r6 = -r1
            int r6 = java.lang.Math.max(r2, r6)
            r8[r2] = r6
            int r6 = r4.j(r5, r7)
            int r7 = r5.getMeasuredWidth()
            int r8 = r3 + r7
            int r1 = r5.getMeasuredHeight()
            int r1 = r1 + r6
            r5.layout(r3, r6, r8, r1)
            int r5 = r0.rightMargin
            int r7 = r7 + r5
            int r7 = r7 + r3
            return r7
    }

    public final int q(android.view.View r6, int r7, int r8, int[] r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r0 = (androidx.appcompat.widget.Toolbar.g) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r9[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r7 = r7 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r9[r2] = r1
            int r8 = r5.j(r6, r8)
            int r9 = r6.getMeasuredWidth()
            int r1 = r7 - r9
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r8
            r6.layout(r1, r8, r7, r2)
            int r6 = r0.leftMargin
            int r9 = r9 + r6
            int r7 = r7 - r9
            return r7
    }

    public final int r(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r13[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r6 = r6 + r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r13[r2] = r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r2, r1)
            r13[r4] = r1
            int r13 = r7.getPaddingLeft()
            int r1 = r7.getPaddingRight()
            int r1 = r1 + r13
            int r1 = r1 + r6
            int r1 = r1 + r10
            int r10 = r0.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r1, r10)
            int r10 = r7.getPaddingTop()
            int r13 = r7.getPaddingBottom()
            int r13 = r13 + r10
            int r10 = r0.topMargin
            int r13 = r13 + r10
            int r10 = r0.bottomMargin
            int r13 = r13 + r10
            int r13 = r13 + r12
            int r10 = r0.height
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r11, r13, r10)
            r8.measure(r9, r10)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r6
            return r8
    }

    @Override // a.Xa
    public final void removeMenuProvider(a.InterfaceC0159gb r2) {
            r1 = this;
            a.ab r0 = r1.G
            r0.a(r2)
            return
    }

    public final void s(android.view.View r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r2, r6)
            int r6 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r1 = r1 + r6
            int r6 = r0.topMargin
            int r1 = r1 + r6
            int r6 = r0.bottomMargin
            int r1 = r1 + r6
            int r6 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r1, r6)
            int r7 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L49
            if (r8 < 0) goto L49
            if (r7 == 0) goto L45
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r8 = java.lang.Math.min(r6, r8)
        L45:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
        L49:
            r4.measure(r5, r6)
            return
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.S
            if (r0 == r2) goto L9
            r1.S = r2
            r1.v()
        L9:
            return
    }

    public void setCollapseContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setCollapseContentDescription(r2)
            return
    }

    public void setCollapseContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.c()
        L9:
            a.c1 r0 = r1.h
            if (r0 == 0) goto L10
            r0.setContentDescription(r2)
        L10:
            return
    }

    public void setCollapseIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setCollapseIcon(r2)
            return
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r1.c()
            a.c1 r0 = r1.h
            r0.setImageDrawable(r2)
            return
        Lb:
            a.c1 r2 = r1.h
            if (r2 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.f
            r2.setImageDrawable(r0)
        L14:
            return
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.P = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.v
            if (r2 == r0) goto L13
            r1.v = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetStartWithNavigation(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.u
            if (r2 == r0) goto L13
            r1.u = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r5) {
            r4 = this;
            if (r5 == 0) goto L22
            a.e1 r0 = r4.e
            if (r0 != 0) goto L13
            a.e1 r0 = new a.e1
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 0
            r0.<init>(r1, r3, r2)
            r4.e = r0
        L13:
            a.e1 r0 = r4.e
            boolean r0 = r4.o(r0)
            if (r0 != 0) goto L38
            a.e1 r0 = r4.e
            r1 = 1
            r4.b(r0, r1)
            goto L38
        L22:
            a.e1 r0 = r4.e
            if (r0 == 0) goto L38
            boolean r0 = r4.o(r0)
            if (r0 == 0) goto L38
            a.e1 r0 = r4.e
            r4.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r4.E
            a.e1 r1 = r4.e
            r0.remove(r1)
        L38:
            a.e1 r0 = r4.e
            if (r0 == 0) goto L3f
            r0.setImageDrawable(r5)
        L3f:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L17
            a.e1 r0 = r4.e
            if (r0 != 0) goto L17
            a.e1 r0 = new a.e1
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 0
            r0.<init>(r1, r3, r2)
            r4.e = r0
        L17:
            a.e1 r0 = r4.e
            if (r0 == 0) goto L1e
            r0.setContentDescription(r5)
        L1e:
            return
    }

    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setNavigationContentDescription(r2)
            return
    }

    public void setNavigationContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.g()
        L9:
            a.c1 r0 = r1.d
            if (r0 == 0) goto L15
            r0.setContentDescription(r2)
            a.c1 r0 = r1.d
            a.C0467xf.a(r0, r2)
        L15:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.g()
            a.c1 r0 = r2.d
            boolean r0 = r2.o(r0)
            if (r0 != 0) goto L2a
            a.c1 r0 = r2.d
            r1 = 1
            r2.b(r0, r1)
            goto L2a
        L14:
            a.c1 r0 = r2.d
            if (r0 == 0) goto L2a
            boolean r0 = r2.o(r0)
            if (r0 == 0) goto L2a
            a.c1 r0 = r2.d
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.E
            a.c1 r1 = r2.d
            r0.remove(r1)
        L2a:
            a.c1 r0 = r2.d
            if (r0 == 0) goto L31
            r0.setImageDrawable(r3)
        L31:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            r1.g()
            a.c1 r0 = r1.d
            r0.setOnClickListener(r2)
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.h r1) {
            r0 = this;
            r0.I = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f845a
            r0.setOverflowIcon(r2)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.k
            if (r0 == r3) goto L1a
            r2.k = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.j = r3
            return
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.j = r0
        L1a:
            return
    }

    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setSubtitle(r2)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L41
            a.r1 r0 = r3.c
            if (r0 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            a.r1 r1 = new a.r1
            r2 = 0
            r1.<init>(r0, r2)
            r3.c = r1
            r1.setSingleLine()
            a.r1 r1 = r3.c
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.m
            if (r1 == 0) goto L29
            a.r1 r2 = r3.c
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.A
            if (r0 == 0) goto L32
            a.r1 r1 = r3.c
            r1.setTextColor(r0)
        L32:
            a.r1 r0 = r3.c
            boolean r0 = r3.o(r0)
            if (r0 != 0) goto L57
            a.r1 r0 = r3.c
            r1 = 1
            r3.b(r0, r1)
            goto L57
        L41:
            a.r1 r0 = r3.c
            if (r0 == 0) goto L57
            boolean r0 = r3.o(r0)
            if (r0 == 0) goto L57
            a.r1 r0 = r3.c
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.E
            a.r1 r1 = r3.c
            r0.remove(r1)
        L57:
            a.r1 r0 = r3.c
            if (r0 == 0) goto L5e
            r0.setText(r4)
        L5e:
            r3.y = r4
            return
    }

    public void setSubtitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setSubtitleTextColor(r1)
            return
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.A = r2
            a.r1 r0 = r1.c
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L41
            a.r1 r0 = r3.b
            if (r0 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            a.r1 r1 = new a.r1
            r2 = 0
            r1.<init>(r0, r2)
            r3.b = r1
            r1.setSingleLine()
            a.r1 r1 = r3.b
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.l
            if (r1 == 0) goto L29
            a.r1 r2 = r3.b
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.z
            if (r0 == 0) goto L32
            a.r1 r1 = r3.b
            r1.setTextColor(r0)
        L32:
            a.r1 r0 = r3.b
            boolean r0 = r3.o(r0)
            if (r0 != 0) goto L57
            a.r1 r0 = r3.b
            r1 = 1
            r3.b(r0, r1)
            goto L57
        L41:
            a.r1 r0 = r3.b
            if (r0 == 0) goto L57
            boolean r0 = r3.o(r0)
            if (r0 == 0) goto L57
            a.r1 r0 = r3.b
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.E
            a.r1 r1 = r3.b
            r0.remove(r1)
        L57:
            a.r1 r0 = r3.b
            if (r0 == 0) goto L5e
            r0.setText(r4)
        L5e:
            r3.x = r4
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.s = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.q = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.p = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.r = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTitleTextColor(r1)
            return
    }

    public void setTitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.z = r2
            a.r1 r0 = r1.b
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    public final boolean t(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L12
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L12
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final boolean u() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.f845a
            if (r0 == 0) goto L10
            androidx.appcompat.widget.a r0 = r0.t
            if (r0 == 0) goto L10
            boolean r0 = r0.l()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final void v() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4d
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.widget.Toolbar.e.a(r3)
            androidx.appcompat.widget.Toolbar$f r1 = r3.M
            if (r1 == 0) goto L20
            androidx.appcompat.view.menu.h r1 = r1.b
            if (r1 == 0) goto L20
            if (r0 == 0) goto L20
            boolean r1 = r3.isAttachedToWindow()
            if (r1 == 0) goto L20
            boolean r1 = r3.S
            if (r1 == 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L3f
            android.window.OnBackInvokedDispatcher r2 = r3.R
            if (r2 != 0) goto L3f
            android.window.OnBackInvokedCallback r1 = r3.Q
            if (r1 != 0) goto L37
            a.tf r1 = new a.tf
            r2 = 0
            r1.<init>(r3, r2)
            android.window.OnBackInvokedCallback r1 = androidx.appcompat.widget.Toolbar.e.b(r1)
            r3.Q = r1
        L37:
            android.window.OnBackInvokedCallback r1 = r3.Q
            androidx.appcompat.widget.Toolbar.e.c(r0, r1)
            r3.R = r0
            return
        L3f:
            if (r1 != 0) goto L4d
            android.window.OnBackInvokedDispatcher r0 = r3.R
            if (r0 == 0) goto L4d
            android.window.OnBackInvokedCallback r1 = r3.Q
            androidx.appcompat.widget.Toolbar.e.d(r0, r1)
            r0 = 0
            r3.R = r0
        L4d:
            return
    }
}
