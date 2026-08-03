package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public abstract class AbstractC7332 implements androidx.appcompat.view.menu.InterfaceC7352 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public android.content.Context f25369;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.content.Context f25370;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343 f25371;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.view.LayoutInflater f25372;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public android.view.LayoutInflater f25373;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 f25374;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f25375;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f25376;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7354 f25377;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f25378;

    public AbstractC7332(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f25369 = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f25372 = r1
            r0.f25375 = r2
            r0.f25376 = r3
            return
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
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public int getId() {
            r1 = this;
            int r0 = r1.f25378
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public androidx.appcompat.view.menu.InterfaceC7354 getMenuView(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ r0 = r3.f25377
            if (r0 != 0) goto L1a
            android.view.LayoutInflater r0 = r3.f25372
            int r1 = r3.f25375
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ r4 = (androidx.appcompat.view.menu.InterfaceC7354) r4
            r3.f25377 = r4
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r3.f25371
            r4.initialize(r0)
            r4 = 1
            r3.updateMenuView(r4)
        L1a:
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ r4 = r3.f25377
            return r4
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.C7343 r2) {
            r0 = this;
            r0.f25370 = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f25373 = r1
            r0.f25371 = r2
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onCloseMenu(androidx.appcompat.view.menu.C7343 r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r1.f25374
            if (r0 == 0) goto L7
            r0.onCloseMenu(r2, r3)
        L7:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuC7359 r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r1.f25374
            if (r0 == 0) goto Le
            if (r2 == 0) goto L7
            goto L9
        L7:
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = r1.f25371
        L9:
            boolean r2 = r0.mo28095(r2)
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void setCallback(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1) {
            r0 = this;
            r0.f25374 = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void updateMenuView(boolean r10) {
            r9 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ r10 = r9.f25377
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            if (r10 != 0) goto L7
            return
        L7:
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r9.f25371
            r1 = 0
            if (r0 == 0) goto L51
            r0.flagActionItems()
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r9.f25371
            java.util.ArrayList r0 = r0.getVisibleItems()
            int r2 = r0.size()
            r3 = r1
            r4 = r3
        L1b:
            if (r3 >= r2) goto L50
            java.lang.Object r5 = r0.get(r3)
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r5 = (androidx.appcompat.view.menu.C7348) r5
            boolean r6 = r9.mo28180(r4, r5)
            if (r6 == 0) goto L4d
            android.view.View r6 = r10.getChildAt(r4)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
            if (r7 == 0) goto L39
            r7 = r6
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ r7 = (androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355) r7
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r7 = r7.getItemData()
            goto L3a
        L39:
            r7 = 0
        L3a:
            android.view.View r8 = r9.mo28178(r5, r6, r10)
            if (r5 == r7) goto L46
            r8.setPressed(r1)
            r8.jumpDrawablesToCurrentState()
        L46:
            if (r8 == r6) goto L4b
            r9.m28173(r8, r4)
        L4b:
            int r4 = r4 + 1
        L4d:
            int r3 = r3 + 1
            goto L1b
        L50:
            r1 = r4
        L51:
            int r0 = r10.getChildCount()
            if (r1 >= r0) goto L60
            boolean r0 = r9.mo28176(r10, r1)
            if (r0 != 0) goto L51
            int r1 = r1 + 1
            goto L51
        L60:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m28173(android.view.View r2, int r3) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto Lb
            r0.removeView(r2)
        Lb:
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ r0 = r1.f25377
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract void mo28174(androidx.appcompat.view.menu.C7348 r1, androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355 r2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355 m28175(android.view.ViewGroup r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.f25372
            int r1 = r3.f25376
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ r4 = (androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355) r4
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo28176(android.view.ViewGroup r1, int r2) {
            r0 = this;
            r1.removeViewAt(r2)
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 m28177() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r1.f25374
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public android.view.View mo28178(androidx.appcompat.view.menu.C7348 r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r3 instanceof androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
            if (r0 == 0) goto L7
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ r3 = (androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355) r3
            goto Lb
        L7:
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ r3 = r1.m28175(r4)
        Lb:
            r1.mo28174(r2, r3)
            android.view.View r3 = (android.view.View) r3
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m28179(int r1) {
            r0 = this;
            r0.f25378 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo28180(int r1, androidx.appcompat.view.menu.C7348 r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
