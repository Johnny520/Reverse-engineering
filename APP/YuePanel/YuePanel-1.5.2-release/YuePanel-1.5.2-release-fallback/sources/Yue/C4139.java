package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C4139 extends Yue.C3631 implements Yue.InterfaceC4129 {

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final java.lang.String f12705 = "MenuPopupWindow";

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static java.lang.reflect.Method f12706;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public Yue.InterfaceC4129 f12707;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C4140 {
        public C4140() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m16241(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setEnterTransition(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m16242(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setExitTransition(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C4141 {
        public C4141() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m16243(android.widget.PopupWindow r0, boolean r1) {
                r0.setTouchModal(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public static class C4142 extends Yue.C2032 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final int f12708;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final int f12709;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public Yue.InterfaceC4129 f12710;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public android.view.MenuItem f12711;

        public C4142(android.content.Context r3, boolean r4) {
                r2 = this;
                r2.<init>(r3, r4)
                android.content.res.Resources r3 = r3.getResources()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r4 = 1
                int r3 = r3.getLayoutDirection()
                r0 = 22
                r1 = 21
                if (r4 != r3) goto L1b
                r2.f12708 = r1
                r2.f12709 = r0
                goto L1f
            L1b:
                r2.f12708 = r0
                r2.f12709 = r1
            L1f:
                return
        }

        @Override // Yue.C2032, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
                r1 = this;
                boolean r0 = super.hasFocus()
                return r0
        }

        @Override // Yue.C2032, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
                r1 = this;
                boolean r0 = super.hasWindowFocus()
                return r0
        }

        @Override // Yue.C2032, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
                r1 = this;
                boolean r0 = super.isFocused()
                return r0
        }

        @Override // Yue.C2032, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
                r1 = this;
                boolean r0 = super.isInTouchMode()
                return r0
        }

        @Override // Yue.C2032, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent r5) {
                r4 = this;
                Yue.ۥۡ۠ۦۤ r0 = r4.f12710
                if (r0 == 0) goto L5c
                android.widget.ListAdapter r0 = r4.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L19
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                androidx.appcompat.view.menu.ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.C7342) r0
                goto L1c
            L19:
                androidx.appcompat.view.menu.ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.C7342) r0
                r1 = 0
            L1c:
                int r2 = r5.getAction()
                r3 = 10
                if (r2 == r3) goto L43
                float r2 = r5.getX()
                int r2 = (int) r2
                float r3 = r5.getY()
                int r3 = (int) r3
                int r2 = r4.pointToPosition(r2, r3)
                r3 = -1
                if (r2 == r3) goto L43
                int r2 = r2 - r1
                if (r2 < 0) goto L43
                int r1 = r0.getCount()
                if (r2 >= r1) goto L43
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r1 = r0.m28200(r2)
                goto L44
            L43:
                r1 = 0
            L44:
                android.view.MenuItem r2 = r4.f12711
                if (r2 == r1) goto L5c
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.m28198()
                if (r2 == 0) goto L53
                Yue.ۥۡ۠ۦۤ r3 = r4.f12710
                r3.mo16207(r0, r2)
            L53:
                r4.f12711 = r1
                if (r1 == 0) goto L5c
                Yue.ۥۡ۠ۦۤ r2 = r4.f12710
                r2.mo16206(r0, r1)
            L5c:
                boolean r5 = super.onHoverEvent(r5)
                return r5
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
                r4 = this;
                android.view.View r0 = r4.getSelectedView()
                androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
                r1 = 1
                if (r0 == 0) goto L29
                int r2 = r4.f12708
                if (r5 != r2) goto L29
                boolean r5 = r0.isEnabled()
                if (r5 == 0) goto L28
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r5 = r0.getItemData()
                boolean r5 = r5.hasSubMenu()
                if (r5 == 0) goto L28
                int r5 = r4.getSelectedItemPosition()
                long r2 = r4.getSelectedItemId()
                r4.performItemClick(r0, r5, r2)
            L28:
                return r1
            L29:
                if (r0 == 0) goto L4f
                int r0 = r4.f12709
                if (r5 != r0) goto L4f
                r5 = -1
                r4.setSelection(r5)
                android.widget.ListAdapter r5 = r4.getAdapter()
                boolean r6 = r5 instanceof android.widget.HeaderViewListAdapter
                if (r6 == 0) goto L44
                android.widget.HeaderViewListAdapter r5 = (android.widget.HeaderViewListAdapter) r5
                android.widget.ListAdapter r5 = r5.getWrappedAdapter()
                androidx.appcompat.view.menu.ۥ۟۟۟ r5 = (androidx.appcompat.view.menu.C7342) r5
                goto L46
            L44:
                androidx.appcompat.view.menu.ۥ۟۟۟ r5 = (androidx.appcompat.view.menu.C7342) r5
            L46:
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r5 = r5.m28198()
                r6 = 0
                r5.close(r6)
                return r1
            L4f:
                boolean r5 = super.onKeyDown(r5, r6)
                return r5
        }

        @Override // Yue.C2032, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
                r0 = this;
                boolean r1 = super.onTouchEvent(r1)
                return r1
        }

        public void setHoverListener(Yue.InterfaceC4129 r1) {
                r0 = this;
                r0.f12710 = r1
                return
        }

        @Override // Yue.C2032, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setSelector(r1)
                return
        }

        @Override // Yue.C2032
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ int mo9398(int r1, boolean r2) {
                r0 = this;
                int r1 = super.mo9398(r1, r2)
                return r1
        }

        @Override // Yue.C2032
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public /* bridge */ /* synthetic */ int mo9399(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                int r1 = super.mo9399(r1, r2, r3, r4, r5)
                return r1
        }

        @Override // Yue.C2032
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public /* bridge */ /* synthetic */ boolean mo9400(android.view.MotionEvent r1, int r2) {
                r0 = this;
                boolean r1 = super.mo9400(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void m16244() {
                r1 = this;
                r0 = -1
                r1.setSelection(r0)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L17
            r1 = 28
            if (r0 > r1) goto L1e
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L17
            Yue.C4139.f12706 = r0     // Catch: java.lang.NoSuchMethodException -> L17
            goto L1e
        L17:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L1e:
            return
    }

    public C4139(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // Yue.InterfaceC4129
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo16206(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2, @Yue.InterfaceC4410 android.view.MenuItem r3) {
            r1 = this;
            Yue.ۥۡ۠ۦۤ r0 = r1.f12707
            if (r0 == 0) goto L7
            r0.mo16206(r2, r3)
        L7:
            return
    }

    @Override // Yue.InterfaceC4129
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo16207(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2, @Yue.InterfaceC4410 android.view.MenuItem r3) {
            r1 = this;
            Yue.ۥۡ۠ۦۤ r0 = r1.f12707
            if (r0 == 0) goto L7
            r0.mo16207(r2, r3)
        L7:
            return
    }

    @Override // Yue.C3631
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public Yue.C2032 mo14701(android.content.Context r2, boolean r3) {
            r1 = this;
            Yue.ۥۡ۠ۦۨ$ۥ۟۟ r0 = new Yue.ۥۡ۠ۦۨ$ۥ۟۟
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m16237(java.lang.Object r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f11608
            android.transition.Transition r2 = (android.transition.Transition) r2
            Yue.C4139.C4140.m16241(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m16238(java.lang.Object r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f11608
            android.transition.Transition r2 = (android.transition.Transition) r2
            Yue.C4139.C4140.m16242(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m16239(Yue.InterfaceC4129 r1) {
            r0 = this;
            r0.f12707 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public void m16240(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L20
            java.lang.reflect.Method r0 = Yue.C4139.f12706
            if (r0 == 0) goto L25
            android.widget.PopupWindow r1 = r2.f11608     // Catch: java.lang.Exception -> L18
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L18
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L18
            r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L18
            goto L25
        L18:
            java.lang.String r3 = "MenuPopupWindow"
            java.lang.String r0 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r3, r0)
            goto L25
        L20:
            android.widget.PopupWindow r0 = r2.f11608
            Yue.C4139.C4141.m16243(r0, r3)
        L25:
            return
    }
}
