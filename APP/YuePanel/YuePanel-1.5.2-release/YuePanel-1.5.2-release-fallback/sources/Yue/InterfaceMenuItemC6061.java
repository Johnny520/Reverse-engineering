package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public interface InterfaceMenuItemC6061 extends android.view.MenuItem {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f21954 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f21955 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f21956 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f21957 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f21958 = 8;

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @Yue.InterfaceC4544
    android.view.View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @Yue.InterfaceC4544
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @Yue.InterfaceC4544
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @Yue.InterfaceC4544
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @Yue.InterfaceC4544
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setActionView(int r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setActionView(@Yue.InterfaceC4544 android.view.View r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setAlphabeticShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    Yue.InterfaceMenuItemC6061 setContentDescription(@Yue.InterfaceC4544 java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    /* bridge */ /* synthetic */ default android.view.MenuItem setContentDescription(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            Yue.ۥۢ۠ۥۣ r1 = r0.setContentDescription(r1)
            return r1
    }

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setIconTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setIconTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    void setShowAsAction(int r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    android.view.MenuItem setShowAsActionFlags(int r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    Yue.InterfaceMenuItemC6061 setTooltipText(@Yue.InterfaceC4544 java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    @Yue.InterfaceC4410
    /* bridge */ /* synthetic */ default android.view.MenuItem setTooltipText(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            Yue.ۥۢ۠ۥۣ r1 = r0.setTooltipText(r1)
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ */
    Yue.AbstractC0183 mo991();

    /* JADX INFO: renamed from: ۥ۟ */
    boolean mo992();

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ */
    Yue.InterfaceMenuItemC6061 mo993(@Yue.InterfaceC4544 Yue.AbstractC0183 r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    boolean mo994();
}
