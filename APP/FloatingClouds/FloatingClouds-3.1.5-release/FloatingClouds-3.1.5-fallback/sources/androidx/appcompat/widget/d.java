package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a.N4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.Toolbar f856a;
    public int b;
    public final android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public final android.graphics.drawable.Drawable f;
    public final boolean g;
    public java.lang.CharSequence h;
    public final java.lang.CharSequence i;
    public final java.lang.CharSequence j;
    public android.view.Window.Callback k;
    public boolean l;
    public androidx.appcompat.widget.a m;
    public final int n;
    public final android.graphics.drawable.Drawable o;

    public class a extends a.C0282n9 {
        public boolean b;
        public final /* synthetic */ int c;
        public final /* synthetic */ androidx.appcompat.widget.d d;

        public a(androidx.appcompat.widget.d r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r0.c = r2
                r1 = 0
                r0.b = r1
                return
        }

        @Override // a.Lg
        public final void a() {
                r2 = this;
                boolean r0 = r2.b
                if (r0 != 0) goto Ld
                androidx.appcompat.widget.d r0 = r2.d
                androidx.appcompat.widget.Toolbar r0 = r0.f856a
                int r1 = r2.c
                r0.setVisibility(r1)
            Ld:
                return
        }

        @Override // a.C0282n9, a.Lg
        public final void b() {
                r1 = this;
                r0 = 1
                r1.b = r0
                return
        }

        @Override // a.C0282n9, a.Lg
        public final void c() {
                r2 = this;
                androidx.appcompat.widget.d r0 = r2.d
                androidx.appcompat.widget.Toolbar r0 = r0.f856a
                r1 = 0
                r0.setVisibility(r1)
                return
        }
    }

    public d(androidx.appcompat.widget.Toolbar r8, boolean r9) {
            r7 = this;
            int r0 = androidx.appcompat.R.string.abc_action_bar_up_description
            r7.<init>()
            r1 = 0
            r7.n = r1
            r7.f856a = r8
            java.lang.CharSequence r2 = r8.getTitle()
            r7.h = r2
            java.lang.CharSequence r2 = r8.getSubtitle()
            r7.i = r2
            java.lang.CharSequence r2 = r7.h
            r3 = 1
            if (r2 == 0) goto L1d
            r2 = r3
            goto L1e
        L1d:
            r2 = r1
        L1e:
            r7.g = r2
            android.graphics.drawable.Drawable r2 = r8.getNavigationIcon()
            r7.f = r2
            android.content.Context r2 = r8.getContext()
            int[] r4 = androidx.appcompat.R.styleable.ActionBar
            int r5 = androidx.appcompat.R.attr.actionBarStyle
            r6 = 0
            a.of r2 = a.C0306of.e(r2, r6, r4, r5)
            int r4 = androidx.appcompat.R.styleable.ActionBar_homeAsUpIndicator
            android.graphics.drawable.Drawable r4 = r2.b(r4)
            r7.o = r4
            if (r9 == 0) goto L153
            int r9 = androidx.appcompat.R.styleable.ActionBar_title
            android.content.res.TypedArray r4 = r2.b
            java.lang.CharSequence r9 = r4.getText(r9)
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L65
            r7.g = r3
            r7.h = r9
            int r3 = r7.b
            r3 = r3 & 8
            if (r3 == 0) goto L65
            androidx.appcompat.widget.Toolbar r3 = r7.f856a
            r3.setTitle(r9)
            boolean r5 = r7.g
            if (r5 == 0) goto L65
            android.view.View r3 = r3.getRootView()
            a.C0414ug.k(r3, r9)
        L65:
            int r9 = androidx.appcompat.R.styleable.ActionBar_subtitle
            java.lang.CharSequence r9 = r4.getText(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L7c
            r7.i = r9
            int r3 = r7.b
            r3 = r3 & 8
            if (r3 == 0) goto L7c
            r8.setSubtitle(r9)
        L7c:
            int r9 = androidx.appcompat.R.styleable.ActionBar_logo
            android.graphics.drawable.Drawable r9 = r2.b(r9)
            if (r9 == 0) goto L89
            r7.e = r9
            r7.u()
        L89:
            int r9 = androidx.appcompat.R.styleable.ActionBar_icon
            android.graphics.drawable.Drawable r9 = r2.b(r9)
            if (r9 == 0) goto L94
            r7.setIcon(r9)
        L94:
            android.graphics.drawable.Drawable r9 = r7.f
            if (r9 != 0) goto Lad
            android.graphics.drawable.Drawable r9 = r7.o
            if (r9 == 0) goto Lad
            r7.f = r9
            int r3 = r7.b
            r3 = r3 & 4
            androidx.appcompat.widget.Toolbar r5 = r7.f856a
            if (r3 == 0) goto Laa
            r5.setNavigationIcon(r9)
            goto Lad
        Laa:
            r5.setNavigationIcon(r6)
        Lad:
            int r9 = androidx.appcompat.R.styleable.ActionBar_displayOptions
            int r9 = r4.getInt(r9, r1)
            r7.s(r9)
            int r9 = androidx.appcompat.R.styleable.ActionBar_customNavigationLayout
            int r9 = r4.getResourceId(r9, r1)
            if (r9 == 0) goto Leb
            android.content.Context r3 = r8.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            android.view.View r9 = r3.inflate(r9, r8, r1)
            android.view.View r3 = r7.c
            if (r3 == 0) goto Ld7
            int r5 = r7.b
            r5 = r5 & 16
            if (r5 == 0) goto Ld7
            r8.removeView(r3)
        Ld7:
            r7.c = r9
            if (r9 == 0) goto Le4
            int r3 = r7.b
            r3 = r3 & 16
            if (r3 == 0) goto Le4
            r8.addView(r9)
        Le4:
            int r9 = r7.b
            r9 = r9 | 16
            r7.s(r9)
        Leb:
            int r9 = androidx.appcompat.R.styleable.ActionBar_height
            int r9 = r4.getLayoutDimension(r9, r1)
            if (r9 <= 0) goto Lfc
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            r3.height = r9
            r8.setLayoutParams(r3)
        Lfc:
            int r9 = androidx.appcompat.R.styleable.ActionBar_contentInsetStart
            r3 = -1
            int r9 = r4.getDimensionPixelOffset(r9, r3)
            int r5 = androidx.appcompat.R.styleable.ActionBar_contentInsetEnd
            int r3 = r4.getDimensionPixelOffset(r5, r3)
            if (r9 >= 0) goto L10d
            if (r3 < 0) goto L11d
        L10d:
            int r9 = java.lang.Math.max(r9, r1)
            int r3 = java.lang.Math.max(r3, r1)
            r8.d()
            a.Bd r5 = r8.t
            r5.a(r9, r3)
        L11d:
            int r9 = androidx.appcompat.R.styleable.ActionBar_titleTextStyle
            int r9 = r4.getResourceId(r9, r1)
            if (r9 == 0) goto L132
            android.content.Context r3 = r8.getContext()
            r8.l = r9
            a.r1 r5 = r8.b
            if (r5 == 0) goto L132
            r5.setTextAppearance(r3, r9)
        L132:
            int r9 = androidx.appcompat.R.styleable.ActionBar_subtitleTextStyle
            int r9 = r4.getResourceId(r9, r1)
            if (r9 == 0) goto L147
            android.content.Context r3 = r8.getContext()
            r8.m = r9
            a.r1 r5 = r8.c
            if (r5 == 0) goto L147
            r5.setTextAppearance(r3, r9)
        L147:
            int r9 = androidx.appcompat.R.styleable.ActionBar_popupTheme
            int r9 = r4.getResourceId(r9, r1)
            if (r9 == 0) goto L166
            r8.setPopupTheme(r9)
            goto L166
        L153:
            android.graphics.drawable.Drawable r9 = r8.getNavigationIcon()
            if (r9 == 0) goto L162
            android.graphics.drawable.Drawable r9 = r8.getNavigationIcon()
            r7.o = r9
            r9 = 15
            goto L164
        L162:
            r9 = 11
        L164:
            r7.b = r9
        L166:
            r2.f()
            int r9 = r7.n
            if (r0 != r9) goto L16e
            goto L18c
        L16e:
            r7.n = r0
            java.lang.CharSequence r9 = r8.getNavigationContentDescription()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L18c
            int r9 = r7.n
            if (r9 != 0) goto L17f
            goto L187
        L17f:
            android.content.Context r0 = r8.getContext()
            java.lang.String r6 = r0.getString(r9)
        L187:
            r7.j = r6
            r7.t()
        L18c:
            java.lang.CharSequence r9 = r8.getNavigationContentDescription()
            r7.j = r9
            a.wf r9 = new a.wf
            r9.<init>(r7)
            r8.setNavigationOnClickListener(r9)
            return
    }

    @Override // a.N4
    public final boolean a() {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f856a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f845a
            if (r0 == 0) goto L16
            androidx.appcompat.widget.a r0 = r0.t
            if (r0 == 0) goto L16
            androidx.appcompat.widget.a$c r1 = r0.u
            if (r1 != 0) goto L14
            boolean r0 = r0.k()
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // a.N4
    public final boolean b() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f845a
            if (r0 == 0) goto L12
            androidx.appcompat.widget.a r0 = r0.t
            if (r0 == 0) goto L12
            boolean r0 = r0.k()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // a.N4
    public final android.content.Context c() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // a.N4
    public final void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            androidx.appcompat.widget.Toolbar$f r0 = r0.M
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            androidx.appcompat.view.menu.h r0 = r0.b
        La:
            if (r0 == 0) goto Lf
            r0.collapseActionView()
        Lf:
            return
    }

    @Override // a.N4
    public final boolean d() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f845a
            if (r0 == 0) goto L12
            androidx.appcompat.widget.a r0 = r0.t
            if (r0 == 0) goto L12
            boolean r0 = r0.f()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // a.N4
    public final void e(androidx.appcompat.view.menu.f r4, androidx.appcompat.view.menu.j.a r5) {
            r3 = this;
            androidx.appcompat.widget.a r0 = r3.m
            androidx.appcompat.widget.Toolbar r1 = r3.f856a
            if (r0 != 0) goto L11
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            android.content.Context r2 = r1.getContext()
            r0.<init>(r2)
            r3.m = r0
        L11:
            androidx.appcompat.widget.a r0 = r3.m
            r0.e = r5
            if (r4 != 0) goto L1c
            androidx.appcompat.widget.ActionMenuView r5 = r1.f845a
            if (r5 != 0) goto L1c
            goto L25
        L1c:
            r1.f()
            androidx.appcompat.widget.ActionMenuView r5 = r1.f845a
            androidx.appcompat.view.menu.f r5 = r5.p
            if (r5 != r4) goto L26
        L25:
            return
        L26:
            if (r5 == 0) goto L32
            androidx.appcompat.widget.a r2 = r1.L
            r5.r(r2)
            androidx.appcompat.widget.Toolbar$f r2 = r1.M
            r5.r(r2)
        L32:
            androidx.appcompat.widget.Toolbar$f r5 = r1.M
            if (r5 != 0) goto L3d
            androidx.appcompat.widget.Toolbar$f r5 = new androidx.appcompat.widget.Toolbar$f
            r5.<init>(r1)
            r1.M = r5
        L3d:
            r5 = 1
            r0.q = r5
            if (r4 == 0) goto L4f
            android.content.Context r5 = r1.j
            r4.b(r0, r5)
            androidx.appcompat.widget.Toolbar$f r5 = r1.M
            android.content.Context r2 = r1.j
            r4.b(r5, r2)
            goto L64
        L4f:
            android.content.Context r4 = r1.j
            r5 = 0
            r0.e(r4, r5)
            androidx.appcompat.widget.Toolbar$f r4 = r1.M
            android.content.Context r2 = r1.j
            r4.e(r2, r5)
            r0.g()
            androidx.appcompat.widget.Toolbar$f r4 = r1.M
            r4.g()
        L64:
            androidx.appcompat.widget.ActionMenuView r4 = r1.f845a
            int r5 = r1.k
            r4.setPopupTheme(r5)
            androidx.appcompat.widget.ActionMenuView r4 = r1.f845a
            r4.setPresenter(r0)
            r1.L = r0
            r1.v()
            return
    }

    @Override // a.N4
    public final boolean f() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            boolean r0 = r0.u()
            return r0
    }

    @Override // a.N4
    public final void g() {
            r1 = this;
            r0 = 1
            r1.l = r0
            return
    }

    @Override // a.N4
    public final java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // a.N4
    public final boolean h() {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f856a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L12
            androidx.appcompat.widget.ActionMenuView r0 = r0.f845a
            if (r0 == 0) goto L12
            boolean r0 = r0.s
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // a.N4
    public final void i() {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f856a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f845a
            if (r0 == 0) goto L1c
            androidx.appcompat.widget.a r0 = r0.t
            if (r0 == 0) goto L1c
            r0.f()
            androidx.appcompat.widget.a$a r0 = r0.t
            if (r0 == 0) goto L1c
            boolean r1 = r0.b()
            if (r1 == 0) goto L1c
            a.eb r0 = r0.i
            r0.dismiss()
        L1c:
            return
    }

    @Override // a.N4
    public final void j() {
            r0 = this;
            return
    }

    @Override // a.N4
    public final a.Jg k(long r3, int r5) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f856a
            a.Jg r0 = a.C0414ug.a(r0)
            if (r5 != 0) goto Lb
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.a(r1)
            r0.c(r3)
            androidx.appcompat.widget.d$a r3 = new androidx.appcompat.widget.d$a
            r3.<init>(r2, r5)
            r0.d(r3)
            return r0
    }

    @Override // a.N4
    public final int l() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // a.N4
    public final void m(int r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            r0.setVisibility(r2)
            return
    }

    @Override // a.N4
    public final void n(int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            r1.e = r2
            r1.u()
            return
    }

    @Override // a.N4
    public final void o() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // a.N4
    public final boolean p() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            androidx.appcompat.widget.Toolbar$f r0 = r0.M
            if (r0 == 0) goto Lc
            androidx.appcompat.view.menu.h r0 = r0.b
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // a.N4
    public final void q() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // a.N4
    public final void r(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            r0.setCollapsible(r2)
            return
    }

    @Override // a.N4
    public final void s(int r5) {
            r4 = this;
            int r0 = r4.b
            r0 = r0 ^ r5
            r4.b = r5
            if (r0 == 0) goto L5e
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L29
            r1 = r5 & 4
            if (r1 == 0) goto L13
            r4.t()
        L13:
            int r1 = r4.b
            r1 = r1 & 4
            androidx.appcompat.widget.Toolbar r3 = r4.f856a
            if (r1 == 0) goto L26
            android.graphics.drawable.Drawable r1 = r4.f
            if (r1 == 0) goto L20
            goto L22
        L20:
            android.graphics.drawable.Drawable r1 = r4.o
        L22:
            r3.setNavigationIcon(r1)
            goto L29
        L26:
            r3.setNavigationIcon(r2)
        L29:
            r1 = r0 & 3
            if (r1 == 0) goto L30
            r4.u()
        L30:
            r1 = r0 & 8
            androidx.appcompat.widget.Toolbar r3 = r4.f856a
            if (r1 == 0) goto L4b
            r1 = r5 & 8
            if (r1 == 0) goto L45
            java.lang.CharSequence r1 = r4.h
            r3.setTitle(r1)
            java.lang.CharSequence r1 = r4.i
            r3.setSubtitle(r1)
            goto L4b
        L45:
            r3.setTitle(r2)
            r3.setSubtitle(r2)
        L4b:
            r0 = r0 & 16
            if (r0 == 0) goto L5e
            android.view.View r0 = r4.c
            if (r0 == 0) goto L5e
            r5 = r5 & 16
            if (r5 == 0) goto L5b
            r3.addView(r0)
            return
        L5b:
            r3.removeView(r0)
        L5e:
            return
    }

    @Override // a.N4
    public final void setIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            r1.setIcon(r2)
            return
    }

    @Override // a.N4
    public final void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.d = r1
            r0.u()
            return
    }

    @Override // a.N4
    public final void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // a.N4
    public final void setWindowTitle(java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r2.g
            if (r0 != 0) goto L1c
            r2.h = r3
            int r0 = r2.b
            r0 = r0 & 8
            if (r0 == 0) goto L1c
            androidx.appcompat.widget.Toolbar r0 = r2.f856a
            r0.setTitle(r3)
            boolean r1 = r2.g
            if (r1 == 0) goto L1c
            android.view.View r0 = r0.getRootView()
            a.C0414ug.k(r0, r3)
        L1c:
            return
    }

    public final void t() {
            r2 = this;
            int r0 = r2.b
            r0 = r0 & 4
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r2.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            androidx.appcompat.widget.Toolbar r1 = r2.f856a
            if (r0 == 0) goto L16
            int r0 = r2.n
            r1.setNavigationContentDescription(r0)
            return
        L16:
            java.lang.CharSequence r0 = r2.j
            r1.setNavigationContentDescription(r0)
        L1b:
            return
    }

    public final void u() {
            r2 = this;
            int r0 = r2.b
            r1 = r0 & 2
            if (r1 == 0) goto L15
            r0 = r0 & 1
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto Lf
            goto L16
        Lf:
            android.graphics.drawable.Drawable r0 = r2.d
            goto L16
        L12:
            android.graphics.drawable.Drawable r0 = r2.d
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.appcompat.widget.Toolbar r1 = r2.f856a
            r1.setLogo(r0)
            return
    }
}
