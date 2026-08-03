package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C5913 extends Yue.AbstractC0181 implements androidx.appcompat.view.menu.C7343.InterfaceC7344 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.content.Context f21576;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionBarContextView f21577;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.AbstractC0181.InterfaceC0182 f21578;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.ref.WeakReference<android.view.View> f21579;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f21580;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f21581;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343 f21582;

    public C5913(android.content.Context r1, androidx.appcompat.widget.ActionBarContextView r2, Yue.AbstractC0181.InterfaceC0182 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f21576 = r1
            r0.f21577 = r2
            r0.f21578 = r3
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = new androidx.appcompat.view.menu.ۥ۟۟۟۟
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r2 = 1
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r1.setDefaultShowAsAction(r2)
            r0.f21582 = r1
            r1.setCallback(r0)
            r0.f21581 = r4
            return
    }

    @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
    public boolean onMenuItemSelected(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1, @Yue.InterfaceC4410 android.view.MenuItem r2) {
            r0 = this;
            Yue.ۥ۟۟ۧ۟$ۥ r1 = r0.f21578
            boolean r1 = r1.mo1022(r0, r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
    public void onMenuModeChange(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1) {
            r0 = this;
            r0.mo1009()
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f21577
            r1.mo298()
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ */
    public void mo1001() {
            r1 = this;
            boolean r0 = r1.f21580
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f21580 = r0
            Yue.ۥ۟۟ۧ۟$ۥ r0 = r1.f21578
            r0.mo1021(r1)
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟ */
    public android.view.View mo1002() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f21579
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟ */
    public android.view.Menu mo1003() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.f21582
            return r0
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public android.view.MenuInflater mo1004() {
            r2 = this;
            Yue.ۥۢ۠ۥۢ r0 = new Yue.ۥۢ۠ۥۢ
            androidx.appcompat.widget.ActionBarContextView r1 = r2.f21577
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public java.lang.CharSequence mo1005() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f21577
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.CharSequence mo1007() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f21577
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo1009() {
            r2 = this;
            Yue.ۥ۟۟ۧ۟$ۥ r0 = r2.f21578
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r2.f21582
            r0.mo1020(r2, r1)
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo1010() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f21577
            boolean r0 = r0.m28265()
            return r0
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo1011() {
            r1 = this;
            boolean r0 = r1.f21581
            return r0
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo1012(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f21577
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.f21579 = r0
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo1013(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f21576
            java.lang.String r2 = r0.getString(r2)
            r1.mo1014(r2)
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo1014(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f21577
            r0.setSubtitle(r2)
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo1016(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f21576
            java.lang.String r2 = r0.getString(r2)
            r1.mo1017(r2)
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo1017(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f21577
            r0.setTitle(r2)
            return
    }

    @Override // Yue.AbstractC0181
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo1018(boolean r2) {
            r1 = this;
            super.mo1018(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f21577
            r0.setTitleOptional(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m21965(androidx.appcompat.view.menu.C7343 r1, boolean r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m21966(androidx.appcompat.view.menu.SubMenuC7359 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m21967(androidx.appcompat.view.menu.SubMenuC7359 r4) {
            r3 = this;
            boolean r0 = r4.hasVisibleItems()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = new androidx.appcompat.view.menu.ۥۣ۟۟۟
            androidx.appcompat.widget.ActionBarContextView r2 = r3.f21577
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2, r4)
            r0.m28253()
            return r1
    }
}
