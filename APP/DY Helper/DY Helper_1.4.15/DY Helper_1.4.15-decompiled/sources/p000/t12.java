package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface t12 extends android.view.MenuItem {
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
    p000.t12 setContentDescription(java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    p000.t12 setTooltipText(java.lang.CharSequence r1);

    /* JADX INFO: renamed from: α */
    p000.AbstractC1154 mo3666();

    /* JADX INFO: renamed from: β */
    p000.t12 mo3667(p000.AbstractC1154 r1);
}
