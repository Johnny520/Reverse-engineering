package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4138 implements Yue.InterfaceC5782, androidx.appcompat.view.menu.InterfaceC7352, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public android.graphics.Rect f12704;

    public AbstractC4138() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m16223(android.widget.ListAdapter r9, android.view.ViewGroup r10, android.content.Context r11, int r12) {
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r3 = r9.getCount()
            r4 = 0
            r5 = r0
            r6 = r5
            r7 = r4
        L11:
            if (r0 >= r3) goto L36
            int r8 = r9.getItemViewType(r0)
            if (r8 == r6) goto L1b
            r7 = r4
            r6 = r8
        L1b:
            if (r10 != 0) goto L22
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r11)
        L22:
            android.view.View r7 = r9.getView(r0, r7, r10)
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            if (r8 < r12) goto L30
            return r12
        L30:
            if (r8 <= r5) goto L33
            r5 = r8
        L33:
            int r0 = r0 + 1
            goto L11
        L36:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m16224(androidx.appcompat.view.menu.C7343 r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L1d
            android.view.MenuItem r3 = r5.getItem(r2)
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r3 = r3.getIcon()
            if (r3 == 0) goto L1a
            r1 = 1
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto L6
        L1d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static androidx.appcompat.view.menu.C7342 m16225(android.widget.ListAdapter r1) {
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto Ld
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            androidx.appcompat.view.menu.ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.C7342) r1
            return r1
        Ld:
            androidx.appcompat.view.menu.ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.C7342) r1
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean collapseItemActionView(androidx.appcompat.view.menu.C7343 r1, androidx.appcompat.view.menu.C7348 r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean expandItemActionView(androidx.appcompat.view.menu.C7343 r1, androidx.appcompat.view.menu.C7348 r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public int getId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public androidx.appcompat.view.menu.InterfaceC7354 getMenuView(android.view.ViewGroup r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "MenuPopups manage their own views"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void initForMenu(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 androidx.appcompat.view.menu.C7343 r2) {
            r0 = this;
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            androidx.appcompat.view.menu.ۥ۟۟۟ r2 = m16225(r1)
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = r2.f25433
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0.mo16227()
            if (r3 == 0) goto L1a
            r3 = 0
            goto L1b
        L1a:
            r3 = 4
        L1b:
            r2.performItemAction(r1, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract void mo16226(androidx.appcompat.view.menu.C7343 r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo16227() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.graphics.Rect m16228() {
            r1 = this;
            android.graphics.Rect r0 = r1.f12704
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract void mo16229(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m16230(android.graphics.Rect r1) {
            r0 = this;
            r0.f12704 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract void mo16231(boolean r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract void mo16232(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public abstract void mo16233(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract void mo16234(android.widget.PopupWindow.OnDismissListener r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract void mo16235(boolean r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract void mo16236(int r1);
}
