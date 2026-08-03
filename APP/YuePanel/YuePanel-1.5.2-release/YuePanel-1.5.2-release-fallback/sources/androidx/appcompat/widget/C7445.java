package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C7445 implements Yue.InterfaceC1763 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String f25859 = "ToolbarWidgetWrapper";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f25860 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long f25861 = 200;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public androidx.appcompat.widget.Toolbar f25862;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f25863;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.view.View f25864;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.widget.Spinner f25865;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.View f25866;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25867;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25868;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25869;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f25870;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.lang.CharSequence f25871;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.CharSequence f25872;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.lang.CharSequence f25873;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public android.view.Window.Callback f25874;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f25875;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.widget.C7411 f25876;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f25877;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f25878;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25879;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
    public class ViewOnClickListenerC7446 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Yue.C0180 f25880;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7445 f25881;

        public ViewOnClickListenerC7446(androidx.appcompat.widget.C7445 r9) {
                r8 = this;
                r8.f25881 = r9
                r8.<init>()
                Yue.ۥ۟۟ۧ r7 = new Yue.ۥ۟۟ۧ
                androidx.appcompat.widget.Toolbar r0 = r9.f25862
                android.content.Context r1 = r0.getContext()
                r5 = 0
                java.lang.CharSequence r6 = r9.f25871
                r2 = 0
                r3 = 16908332(0x102002c, float:2.3877352E-38)
                r4 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.f25880 = r7
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.widget.ۥ۟۟۟ۡ r3 = r2.f25881
                android.view.Window$Callback r0 = r3.f25874
                if (r0 == 0) goto L10
                boolean r3 = r3.f25875
                if (r3 == 0) goto L10
                r3 = 0
                Yue.ۥ۟۟ۧ r1 = r2.f25880
                r0.onMenuItemSelected(r3, r1)
            L10:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ۟, reason: contains not printable characters */
    public class C7447 extends Yue.C6910 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f25882;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ int f25883;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7445 f25884;

        public C7447(androidx.appcompat.widget.C7445 r1, int r2) {
                r0 = this;
                r0.f25884 = r1
                r0.f25883 = r2
                r0.<init>()
                r1 = 0
                r0.f25882 = r1
                return
        }

        @Override // Yue.C6910, Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ */
        public void mo299(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f25882 = r1
                return
        }

        @Override // Yue.C6910, Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo300(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f25882
                if (r2 != 0) goto Ld
                androidx.appcompat.widget.ۥ۟۟۟ۡ r2 = r1.f25884
                androidx.appcompat.widget.Toolbar r2 = r2.f25862
                int r0 = r1.f25883
                r2.setVisibility(r0)
            Ld:
                return
        }

        @Override // Yue.C6910, Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo301(android.view.View r2) {
                r1 = this;
                androidx.appcompat.widget.ۥ۟۟۟ۡ r2 = r1.f25884
                androidx.appcompat.widget.Toolbar r2 = r2.f25862
                r0 = 0
                r2.setVisibility(r0)
                return
        }
    }

    public C7445(androidx.appcompat.widget.Toolbar r3, boolean r4) {
            r2 = this;
            int r0 = Yue.C5058.C5069.f17219
            int r1 = Yue.C5058.C5064.f17029
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public C7445(androidx.appcompat.widget.Toolbar r4, boolean r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r7 = 0
            r3.f25877 = r7
            r3.f25878 = r7
            r3.f25862 = r4
            java.lang.CharSequence r0 = r4.getTitle()
            r3.f25871 = r0
            java.lang.CharSequence r0 = r4.getSubtitle()
            r3.f25872 = r0
            java.lang.CharSequence r0 = r3.f25871
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = r7
        L1d:
            r3.f25870 = r0
            android.graphics.drawable.Drawable r0 = r4.getNavigationIcon()
            r3.f25869 = r0
            android.content.Context r4 = r4.getContext()
            int[] r0 = Yue.C5058.C5071.f17589
            int r1 = Yue.C5058.C5060.f16557
            r2 = 0
            Yue.ۥۢۡۥۦ r4 = Yue.C6264.m23339(r4, r2, r0, r1, r7)
            int r0 = Yue.C5058.C5071.f17605
            android.graphics.drawable.Drawable r0 = r4.m23347(r0)
            r3.f25879 = r0
            if (r5 == 0) goto L109
            int r5 = Yue.C5058.C5071.f17617
            java.lang.CharSequence r5 = r4.m23363(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4b
            r3.setTitle(r5)
        L4b:
            int r5 = Yue.C5058.C5071.f17615
            java.lang.CharSequence r5 = r4.m23363(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L5a
            r3.mo8399(r5)
        L5a:
            int r5 = Yue.C5058.C5071.f17610
            android.graphics.drawable.Drawable r5 = r4.m23347(r5)
            if (r5 == 0) goto L65
            r3.mo8394(r5)
        L65:
            int r5 = Yue.C5058.C5071.f17607
            android.graphics.drawable.Drawable r5 = r4.m23347(r5)
            if (r5 == 0) goto L70
            r3.setIcon(r5)
        L70:
            android.graphics.drawable.Drawable r5 = r3.f25869
            if (r5 != 0) goto L7b
            android.graphics.drawable.Drawable r5 = r3.f25879
            if (r5 == 0) goto L7b
            r3.mo8423(r5)
        L7b:
            int r5 = Yue.C5058.C5071.f17600
            int r5 = r4.m23354(r5, r7)
            r3.mo8397(r5)
            int r5 = Yue.C5058.C5071.f17599
            int r5 = r4.m23360(r5, r7)
            if (r5 == 0) goto La6
            androidx.appcompat.widget.Toolbar r0 = r3.f25862
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.widget.Toolbar r1 = r3.f25862
            android.view.View r5 = r0.inflate(r5, r1, r7)
            r3.mo8419(r5)
            int r5 = r3.f25863
            r5 = r5 | 16
            r3.mo8397(r5)
        La6:
            int r5 = Yue.C5058.C5071.f17603
            int r5 = r4.m23356(r5, r7)
            if (r5 <= 0) goto Lbb
            androidx.appcompat.widget.Toolbar r0 = r3.f25862
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r5
            androidx.appcompat.widget.Toolbar r5 = r3.f25862
            r5.setLayoutParams(r0)
        Lbb:
            int r5 = Yue.C5058.C5071.f17597
            r0 = -1
            int r5 = r4.m23345(r5, r0)
            int r1 = Yue.C5058.C5071.f17593
            int r0 = r4.m23345(r1, r0)
            if (r5 >= 0) goto Lcc
            if (r0 < 0) goto Ld9
        Lcc:
            androidx.appcompat.widget.Toolbar r1 = r3.f25862
            int r5 = java.lang.Math.max(r5, r7)
            int r0 = java.lang.Math.max(r0, r7)
            r1.setContentInsetsRelative(r5, r0)
        Ld9:
            int r5 = Yue.C5058.C5071.f17618
            int r5 = r4.m23360(r5, r7)
            if (r5 == 0) goto Lea
            androidx.appcompat.widget.Toolbar r0 = r3.f25862
            android.content.Context r1 = r0.getContext()
            r0.setTitleTextAppearance(r1, r5)
        Lea:
            int r5 = Yue.C5058.C5071.f17616
            int r5 = r4.m23360(r5, r7)
            if (r5 == 0) goto Lfb
            androidx.appcompat.widget.Toolbar r0 = r3.f25862
            android.content.Context r1 = r0.getContext()
            r0.setSubtitleTextAppearance(r1, r5)
        Lfb:
            int r5 = Yue.C5058.C5071.f17612
            int r5 = r4.m23360(r5, r7)
            if (r5 == 0) goto L10f
            androidx.appcompat.widget.Toolbar r7 = r3.f25862
            r7.setPopupTheme(r5)
            goto L10f
        L109:
            int r5 = r3.m28488()
            r3.f25863 = r5
        L10f:
            r4.m23371()
            r3.mo8390(r6)
            androidx.appcompat.widget.Toolbar r4 = r3.f25862
            java.lang.CharSequence r4 = r4.getNavigationContentDescription()
            r3.f25873 = r4
            androidx.appcompat.widget.Toolbar r4 = r3.f25862
            androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ r5 = new androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ
            r5.<init>(r3)
            r4.setNavigationOnClickListener(r5)
            return
    }

    @Override // Yue.InterfaceC1763
    public void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.collapseActionView()
            return
    }

    @Override // Yue.InterfaceC1763
    public android.content.Context getContext() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // Yue.InterfaceC1763
    public int getHeight() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            int r0 = r0.getHeight()
            return r0
    }

    @Override // Yue.InterfaceC1763
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // Yue.InterfaceC1763
    public int getVisibility() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            int r0 = r0.getVisibility()
            return r0
    }

    @Override // Yue.InterfaceC1763
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.setBackground(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    public void setIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f25867 = r1
            r0.m28493()
            return
    }

    @Override // Yue.InterfaceC1763
    public void setLogo(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.mo8394(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 1
            r1.f25870 = r0
            r1.m28490(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    public void setVisibility(int r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.setVisibility(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.f25874 = r1
            return
    }

    @Override // Yue.InterfaceC1763
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.f25870
            if (r0 != 0) goto L7
            r1.m28490(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ */
    public void mo8381(android.view.Menu r3, androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r4) {
            r2 = this;
            androidx.appcompat.widget.ۥ r0 = r2.f25876
            if (r0 != 0) goto L16
            androidx.appcompat.widget.ۥ r0 = new androidx.appcompat.widget.ۥ
            androidx.appcompat.widget.Toolbar r1 = r2.f25862
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r2.f25876 = r0
            int r1 = Yue.C5058.C5065.f17106
            r0.m28179(r1)
        L16:
            androidx.appcompat.widget.ۥ r0 = r2.f25876
            r0.setCallback(r4)
            androidx.appcompat.widget.Toolbar r4 = r2.f25862
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r3 = (androidx.appcompat.view.menu.C7343) r3
            androidx.appcompat.widget.ۥ r0 = r2.f25876
            r4.setMenu(r3, r0)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo8382() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo8383() {
            r1 = this;
            r0 = 1
            r1.f25875 = r0
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo8384() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f25867
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo8385() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            boolean r0 = r0.canShowOverflowMenu()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo8386() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f25868
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo8387() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            boolean r0 = r0.isOverflowMenuShowPending()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo8388() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            boolean r0 = r0.hideOverflowMenu()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo8389() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            boolean r0 = r0.showOverflowMenu()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo8390(int r2) {
            r1 = this;
            int r0 = r1.f25878
            if (r2 != r0) goto L5
            return
        L5:
            r1.f25878 = r2
            androidx.appcompat.widget.Toolbar r2 = r1.f25862
            java.lang.CharSequence r2 = r2.getNavigationContentDescription()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L18
            int r2 = r1.f25878
            r1.mo8418(r2)
        L18:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo8391() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.dismissPopupMenus()
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public android.view.View mo8392() {
            r1 = this;
            android.view.View r0 = r1.f25866
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo8393(androidx.appcompat.widget.C7435 r3) {
            r2 = this;
            android.view.View r0 = r2.f25864
            if (r0 == 0) goto L11
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r1 = r2.f25862
            if (r0 != r1) goto L11
            android.view.View r0 = r2.f25864
            r1.removeView(r0)
        L11:
            r2.f25864 = r3
            if (r3 == 0) goto L36
            int r0 = r2.f25877
            r1 = 2
            if (r0 != r1) goto L36
            androidx.appcompat.widget.Toolbar r0 = r2.f25862
            r1 = 0
            r0.addView(r3, r1)
            android.view.View r0 = r2.f25864
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = (androidx.appcompat.widget.Toolbar.C7406) r0
            r1 = -2
            r0.width = r1
            r0.height = r1
            r1 = 8388691(0x800053, float:1.175506E-38)
            r0.f25109 = r1
            r0 = 1
            r3.setAllowCollapse(r0)
        L36:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo8394(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f25868 = r1
            r0.m28493()
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo8395() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            boolean r0 = r0.hasExpandedActionView()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo8396() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            boolean r0 = r0.isTitleTruncated()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo8397(int r4) {
            r3 = this;
            int r0 = r3.f25863
            r0 = r0 ^ r4
            r3.f25863 = r4
            if (r0 == 0) goto L55
            r1 = r0 & 4
            if (r1 == 0) goto L15
            r1 = r4 & 4
            if (r1 == 0) goto L12
            r3.m28491()
        L12:
            r3.m28492()
        L15:
            r1 = r0 & 3
            if (r1 == 0) goto L1c
            r3.m28493()
        L1c:
            r1 = r0 & 8
            if (r1 == 0) goto L3e
            r1 = r4 & 8
            if (r1 == 0) goto L33
            androidx.appcompat.widget.Toolbar r1 = r3.f25862
            java.lang.CharSequence r2 = r3.f25871
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.f25862
            java.lang.CharSequence r2 = r3.f25872
            r1.setSubtitle(r2)
            goto L3e
        L33:
            androidx.appcompat.widget.Toolbar r1 = r3.f25862
            r2 = 0
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.f25862
            r1.setSubtitle(r2)
        L3e:
            r0 = r0 & 16
            if (r0 == 0) goto L55
            android.view.View r0 = r3.f25866
            if (r0 == 0) goto L55
            r4 = r4 & 16
            if (r4 == 0) goto L50
            androidx.appcompat.widget.Toolbar r4 = r3.f25862
            r4.addView(r0)
            goto L55
        L50:
            androidx.appcompat.widget.Toolbar r4 = r3.f25862
            r4.removeView(r0)
        L55:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo8398(java.lang.CharSequence r1) {
            r0 = this;
            r0.f25873 = r1
            r0.m28491()
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo8399(java.lang.CharSequence r2) {
            r1 = this;
            r1.f25872 = r2
            int r0 = r1.f25863
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.setSubtitle(r2)
        Ld:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo8400(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f25879
            if (r0 == r2) goto L9
            r1.f25879 = r2
            r1.m28492()
        L9:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo8401(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.saveHierarchyState(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo8402(int r2) {
            r1 = this;
            android.widget.Spinner r0 = r1.f25865
            if (r0 == 0) goto L8
            r0.setSelection(r2)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't set dropdown selected position without an adapter"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public android.view.Menu mo8403() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public boolean mo8404() {
            r1 = this;
            android.view.View r0 = r1.f25864
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public int mo8405() {
            r1 = this;
            int r0 = r1.f25877
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo8406(int r3) {
            r2 = this;
            r0 = 200(0xc8, double:9.9E-322)
            Yue.ۥۢۤۦۦ r3 = r2.mo8407(r3, r0)
            if (r3 == 0) goto Lb
            r3.m26739()
        Lb:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public Yue.C6904 mo8407(int r3, long r4) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f25862
            Yue.ۥۢۤۦۦ r0 = Yue.C6794.m26092(r0)
            if (r3 != 0) goto Lb
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            Yue.ۥۢۤۦۦ r0 = r0.m26717(r1)
            Yue.ۥۢۤۦۦ r4 = r0.m26733(r4)
            androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ۟ r5 = new androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ۟
            r5.<init>(r2, r3)
            Yue.ۥۢۤۦۦ r3 = r4.m26735(r5)
            return r3
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public void mo8408(int r5) {
            r4 = this;
            int r0 = r4.f25877
            if (r5 == r0) goto L74
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L1d
            if (r0 == r1) goto Lb
            goto L2e
        Lb:
            android.view.View r0 = r4.f25864
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f25862
            if (r0 != r3) goto L2e
            android.view.View r0 = r4.f25864
            r3.removeView(r0)
            goto L2e
        L1d:
            android.widget.Spinner r0 = r4.f25865
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f25862
            if (r0 != r3) goto L2e
            android.widget.Spinner r0 = r4.f25865
            r3.removeView(r0)
        L2e:
            r4.f25877 = r5
            if (r5 == 0) goto L74
            r0 = 0
            if (r5 == r2) goto L6a
            if (r5 != r1) goto L53
            android.view.View r5 = r4.f25864
            if (r5 == 0) goto L74
            androidx.appcompat.widget.Toolbar r1 = r4.f25862
            r1.addView(r5, r0)
            android.view.View r5 = r4.f25864
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r5 = (androidx.appcompat.widget.Toolbar.C7406) r5
            r0 = -2
            r5.width = r0
            r5.height = r0
            r0 = 8388691(0x800053, float:1.175506E-38)
            r5.f25109 = r0
            goto L74
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid navigation mode "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L6a:
            r4.m28489()
            androidx.appcompat.widget.Toolbar r5 = r4.f25862
            android.widget.Spinner r1 = r4.f25865
            r5.addView(r1, r0)
        L74:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo8409(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.mo8423(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public void mo8410(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r2, androidx.appcompat.view.menu.C7343.InterfaceC7344 r3) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.setMenuCallbacks(r2, r3)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public android.view.ViewGroup mo8411() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public void mo8412(boolean r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public void mo8413(android.widget.SpinnerAdapter r2, android.widget.AdapterView.OnItemSelectedListener r3) {
            r1 = this;
            r1.m28489()
            android.widget.Spinner r0 = r1.f25865
            r0.setAdapter(r2)
            android.widget.Spinner r2 = r1.f25865
            r2.setOnItemSelectedListener(r3)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public void mo8414(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.restoreHierarchyState(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public java.lang.CharSequence mo8415() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public int mo8416() {
            r1 = this;
            int r0 = r1.f25863
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public int mo8417() {
            r1 = this;
            android.widget.Spinner r0 = r1.f25865
            if (r0 == 0) goto L9
            int r0 = r0.getSelectedItemPosition()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public void mo8418(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lc
        L4:
            android.content.Context r0 = r1.getContext()
            java.lang.String r2 = r0.getString(r2)
        Lc:
            r1.mo8398(r2)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo8419(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.f25866
            if (r0 == 0) goto Lf
            int r1 = r2.f25863
            r1 = r1 & 16
            if (r1 == 0) goto Lf
            androidx.appcompat.widget.Toolbar r1 = r2.f25862
            r1.removeView(r0)
        Lf:
            r2.f25866 = r3
            if (r3 == 0) goto L1e
            int r0 = r2.f25863
            r0 = r0 & 16
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.Toolbar r0 = r2.f25862
            r0.addView(r3)
        L1e:
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo8420() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public int mo8421() {
            r1 = this;
            android.widget.Spinner r0 = r1.f25865
            if (r0 == 0) goto L9
            int r0 = r0.getCount()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo8422() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo8423(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f25869 = r1
            r0.m28492()
            return
    }

    @Override // Yue.InterfaceC1763
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public void mo8424(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.setCollapsible(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final int m28488() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            android.graphics.drawable.Drawable r0 = r0.getNavigationIcon()
            if (r0 == 0) goto L13
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            android.graphics.drawable.Drawable r0 = r0.getNavigationIcon()
            r1.f25879 = r0
            r0 = 15
            goto L15
        L13:
            r0 = 11
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m28489() {
            r4 = this;
            android.widget.Spinner r0 = r4.f25865
            if (r0 != 0) goto L20
            Yue.ۥۣ۟ۡۤ r0 = new Yue.ۥۣ۟ۡۤ
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = Yue.C5058.C5060.f16564
            r0.<init>(r1, r2, r3)
            r4.f25865 = r0
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ
            r1 = 8388627(0x800013, float:1.175497E-38)
            r2 = -2
            r0.<init>(r2, r2, r1)
            android.widget.Spinner r1 = r4.f25865
            r1.setLayoutParams(r0)
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m28490(java.lang.CharSequence r2) {
            r1 = this;
            r1.f25871 = r2
            int r0 = r1.f25863
            r0 = r0 & 8
            if (r0 == 0) goto L1a
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            r0.setTitle(r2)
            boolean r0 = r1.f25870
            if (r0 == 0) goto L1a
            androidx.appcompat.widget.Toolbar r0 = r1.f25862
            android.view.View r0 = r0.getRootView()
            Yue.C6794.m26226(r0, r2)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m28491() {
            r2 = this;
            int r0 = r2.f25863
            r0 = r0 & 4
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r2.f25873
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            androidx.appcompat.widget.Toolbar r0 = r2.f25862
            int r1 = r2.f25878
            r0.setNavigationContentDescription(r1)
            goto L1d
        L16:
            androidx.appcompat.widget.Toolbar r0 = r2.f25862
            java.lang.CharSequence r1 = r2.f25873
            r0.setNavigationContentDescription(r1)
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m28492() {
            r2 = this;
            int r0 = r2.f25863
            r0 = r0 & 4
            if (r0 == 0) goto L13
            androidx.appcompat.widget.Toolbar r0 = r2.f25862
            android.graphics.drawable.Drawable r1 = r2.f25869
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            android.graphics.drawable.Drawable r1 = r2.f25879
        Lf:
            r0.setNavigationIcon(r1)
            goto L19
        L13:
            androidx.appcompat.widget.Toolbar r0 = r2.f25862
            r1 = 0
            r0.setNavigationIcon(r1)
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m28493() {
            r2 = this;
            int r0 = r2.f25863
            r1 = r0 & 2
            if (r1 == 0) goto L15
            r0 = r0 & 1
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r2.f25868
            if (r0 == 0) goto Lf
            goto L16
        Lf:
            android.graphics.drawable.Drawable r0 = r2.f25867
            goto L16
        L12:
            android.graphics.drawable.Drawable r0 = r2.f25867
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.appcompat.widget.Toolbar r1 = r2.f25862
            r1.setLogo(r0)
            return
    }
}
