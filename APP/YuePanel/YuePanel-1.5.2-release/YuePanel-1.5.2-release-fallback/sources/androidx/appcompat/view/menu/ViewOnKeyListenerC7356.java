package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC7356 extends Yue.AbstractC4138 implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, androidx.appcompat.view.menu.InterfaceC7352, android.view.View.OnKeyListener {

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f25498 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.content.Context f25499;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final androidx.appcompat.view.menu.C7343 f25500;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final androidx.appcompat.view.menu.C7342 f25501;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f25502;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int f25503;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int f25504;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final int f25505;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Yue.C4139 f25506;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f25507;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final android.view.View.OnAttachStateChangeListener f25508;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public android.widget.PopupWindow.OnDismissListener f25509;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public android.view.View f25510;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public android.view.View f25511;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 f25512;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public android.view.ViewTreeObserver f25513;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f25514;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f25515;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f25516;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f25517;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public boolean f25518;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC7357 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC7356 f25519;

        public ViewTreeObserverOnGlobalLayoutListenerC7357(androidx.appcompat.view.menu.ViewOnKeyListenerC7356 r1) {
                r0 = this;
                r0.f25519 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r1 = this;
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r1.f25519
                boolean r0 = r0.mo14691()
                if (r0 == 0) goto L2c
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r1.f25519
                Yue.ۥۡ۠ۦۨ r0 = r0.f25506
                boolean r0 = r0.m14717()
                if (r0 != 0) goto L2c
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r1.f25519
                android.view.View r0 = r0.f25511
                if (r0 == 0) goto L27
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L1f
                goto L27
            L1f:
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r1.f25519
                Yue.ۥۡ۠ۦۨ r0 = r0.f25506
                r0.show()
                goto L2c
            L27:
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r1.f25519
                r0.dismiss()
            L2c:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ۟, reason: contains not printable characters */
    public class ViewOnAttachStateChangeListenerC7358 implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC7356 f25520;

        public ViewOnAttachStateChangeListenerC7358(androidx.appcompat.view.menu.ViewOnKeyListenerC7356 r1) {
                r0 = this;
                r0.f25520 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r2.f25520
                android.view.ViewTreeObserver r0 = r0.f25513
                if (r0 == 0) goto L1d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L14
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r2.f25520
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.f25513 = r1
            L14:
                androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = r2.f25520
                android.view.ViewTreeObserver r1 = r0.f25513
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.f25507
                r1.removeGlobalOnLayoutListener(r0)
            L1d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    static {
            int r0 = Yue.C5058.C5068.f17205
            androidx.appcompat.view.menu.ViewOnKeyListenerC7356.f25498 = r0
            return
    }

    public ViewOnKeyListenerC7356(android.content.Context r4, androidx.appcompat.view.menu.C7343 r5, android.view.View r6, int r7, int r8, boolean r9) {
            r3 = this;
            r3.<init>()
            androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ r0 = new androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ
            r0.<init>(r3)
            r3.f25507 = r0
            androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ۟ r0 = new androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ۟
            r0.<init>(r3)
            r3.f25508 = r0
            r0 = 0
            r3.f25517 = r0
            r3.f25499 = r4
            r3.f25500 = r5
            r3.f25502 = r9
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            androidx.appcompat.view.menu.ۥ۟۟۟ r1 = new androidx.appcompat.view.menu.ۥ۟۟۟
            int r2 = androidx.appcompat.view.menu.ViewOnKeyListenerC7356.f25498
            r1.<init>(r5, r0, r9, r2)
            r3.f25501 = r1
            r3.f25504 = r7
            r3.f25505 = r8
            android.content.res.Resources r9 = r4.getResources()
            android.util.DisplayMetrics r0 = r9.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            int r1 = Yue.C5058.C5063.f16933
            int r9 = r9.getDimensionPixelSize(r1)
            int r9 = java.lang.Math.max(r0, r9)
            r3.f25503 = r9
            r3.f25510 = r6
            Yue.ۥۡ۠ۦۨ r6 = new Yue.ۥۡ۠ۦۨ
            r9 = 0
            r6.<init>(r4, r9, r7, r8)
            r3.f25506 = r6
            r5.addMenuPresenter(r3, r4)
            return
    }

    @Override // Yue.InterfaceC5782
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.mo14691()
            if (r0 == 0) goto Lb
            Yue.ۥۡ۠ۦۨ r0 = r1.f25506
            r0.dismiss()
        Lb:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onCloseMenu(androidx.appcompat.view.menu.C7343 r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.f25500
            if (r2 == r0) goto L5
            return
        L5:
            r1.dismiss()
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r1.f25512
            if (r0 == 0) goto Lf
            r0.onCloseMenu(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r2 = this;
            r0 = 1
            r2.f25514 = r0
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r2.f25500
            r0.close()
            android.view.ViewTreeObserver r0 = r2.f25513
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.f25511
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.f25513 = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.f25513
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f25507
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.f25513 = r0
        L24:
            android.view.View r0 = r2.f25511
            android.view.View$OnAttachStateChangeListener r1 = r2.f25508
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r0 = r2.f25509
            if (r0 == 0) goto L32
            r0.onDismiss()
        L32:
            return
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuC7359 r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L64
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = new androidx.appcompat.view.menu.ۥۣ۟۟۟
            android.content.Context r3 = r9.f25499
            android.view.View r5 = r9.f25511
            boolean r6 = r9.f25502
            int r7 = r9.f25504
            int r8 = r9.f25505
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r2 = r9.f25512
            r0.mo28215(r2)
            boolean r2 = Yue.AbstractC4138.m16224(r10)
            r0.m28250(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.f25509
            r0.m28252(r2)
            r2 = 0
            r9.f25509 = r2
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = r9.f25500
            r2.close(r1)
            Yue.ۥۡ۠ۦۨ r2 = r9.f25506
            int r2 = r2.m14692()
            Yue.ۥۡ۠ۦۨ r3 = r9.f25506
            int r3 = r3.m14697()
            int r4 = r9.f25517
            android.view.View r5 = r9.f25510
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L55
            android.view.View r4 = r9.f25510
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L55:
            boolean r0 = r0.m28257(r2, r3)
            if (r0 == 0) goto L64
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r9.f25512
            if (r0 == 0) goto L62
            r0.mo28095(r10)
        L62:
            r10 = 1
            return r10
        L64:
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void setCallback(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1) {
            r0 = this;
            r0.f25512 = r1
            return
    }

    @Override // Yue.InterfaceC5782
    public void show() {
            r2 = this;
            boolean r0 = r2.m28258()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void updateMenuView(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f25515 = r1
            androidx.appcompat.view.menu.ۥ۟۟۟ r1 = r0.f25501
            if (r1 == 0) goto La
            r1.notifyDataSetChanged()
        La:
            return
    }

    @Override // Yue.InterfaceC5782
    /* JADX INFO: renamed from: ۥ */
    public boolean mo14691() {
            r1 = this;
            boolean r0 = r1.f25514
            if (r0 != 0) goto Le
            Yue.ۥۡ۠ۦۨ r0 = r1.f25506
            boolean r0 = r0.mo14691()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo16226(androidx.appcompat.view.menu.C7343 r1) {
            r0 = this;
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo16229(android.view.View r1) {
            r0 = this;
            r0.f25510 = r1
            return
    }

    @Override // Yue.InterfaceC5782
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public android.widget.ListView mo14695() {
            r1 = this;
            Yue.ۥۡ۠ۦۨ r0 = r1.f25506
            android.widget.ListView r0 = r0.mo14695()
            return r0
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo16231(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ r0 = r1.f25501
            r0.m28201(r2)
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo16232(int r1) {
            r0 = this;
            r0.f25517 = r1
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo16233(int r2) {
            r1 = this;
            Yue.ۥۡ۠ۦۨ r0 = r1.f25506
            r0.m14693(r2)
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo16234(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f25509 = r1
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo16235(boolean r1) {
            r0 = this;
            r0.f25518 = r1
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo16236(int r2) {
            r1 = this;
            Yue.ۥۡ۠ۦۨ r0 = r1.f25506
            r0.m14696(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m28258() {
            r7 = this;
            boolean r0 = r7.mo14691()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.f25514
            r2 = 0
            if (r0 != 0) goto Lc3
            android.view.View r0 = r7.f25510
            if (r0 != 0) goto L13
            goto Lc3
        L13:
            r7.f25511 = r0
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            r0.m14736(r7)
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            r0.m14737(r7)
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            r0.m14735(r1)
            android.view.View r0 = r7.f25511
            android.view.ViewTreeObserver r3 = r7.f25513
            if (r3 != 0) goto L2c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f25513 = r4
            if (r3 == 0) goto L3a
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f25507
            r4.addOnGlobalLayoutListener(r3)
        L3a:
            android.view.View$OnAttachStateChangeListener r3 = r7.f25508
            r0.addOnAttachStateChangeListener(r3)
            Yue.ۥۡ۠ۦۨ r3 = r7.f25506
            r3.m14724(r0)
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            int r3 = r7.f25517
            r0.m14728(r3)
            boolean r0 = r7.f25515
            r3 = 0
            if (r0 != 0) goto L5e
            androidx.appcompat.view.menu.ۥ۟۟۟ r0 = r7.f25501
            android.content.Context r4 = r7.f25499
            int r5 = r7.f25503
            int r0 = Yue.AbstractC4138.m16223(r0, r3, r4, r5)
            r7.f25516 = r0
            r7.f25515 = r1
        L5e:
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            int r4 = r7.f25516
            r0.m14726(r4)
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            r4 = 2
            r0.m14732(r4)
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            android.graphics.Rect r4 = r7.m16228()
            r0.m14729(r4)
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            r0.show()
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            android.widget.ListView r0 = r0.mo14695()
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f25518
            if (r4 == 0) goto Lb6
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r4 = r7.f25500
            java.lang.CharSequence r4 = r4.getHeaderTitle()
            if (r4 == 0) goto Lb6
            android.content.Context r4 = r7.f25499
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = Yue.C5058.C5068.f17204
            android.view.View r4 = r4.inflate(r5, r0, r2)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb0
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r6 = r7.f25500
            java.lang.CharSequence r6 = r6.getHeaderTitle()
            r5.setText(r6)
        Lb0:
            r4.setEnabled(r2)
            r0.addHeaderView(r4, r3, r2)
        Lb6:
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            androidx.appcompat.view.menu.ۥ۟۟۟ r2 = r7.f25501
            r0.mo1764(r2)
            Yue.ۥۡ۠ۦۨ r0 = r7.f25506
            r0.show()
            return r1
        Lc3:
            return r2
    }
}
