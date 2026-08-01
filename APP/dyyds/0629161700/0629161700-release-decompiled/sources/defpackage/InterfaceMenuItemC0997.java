package defpackage;

/* JADX INFO: renamed from: ᛵᲈᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC0997 extends android.view.MenuItem {
    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    android.view.MenuItem setAlphabeticShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    defpackage.InterfaceMenuItemC0997 setContentDescription(java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    defpackage.InterfaceMenuItemC0997 setTooltipText(java.lang.CharSequence r1);

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    defpackage.InterfaceMenuItemC0997 mo881(defpackage.ActionProviderVisibilityListenerC0803 r1);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    defpackage.ActionProviderVisibilityListenerC0803 mo882();
}
