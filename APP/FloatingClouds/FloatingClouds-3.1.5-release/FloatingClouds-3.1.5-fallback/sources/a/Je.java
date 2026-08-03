package a;

/* JADX INFO: loaded from: classes.dex */
public interface Je extends android.view.MenuItem {
    a.Q a();

    a.Je b(a.Q r1);

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
    a.Je setContentDescription(java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    /* bridge */ /* synthetic */ default android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            a.Je r1 = r0.setContentDescription(r1)
            return r1
    }

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    a.Je setTooltipText(java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    /* bridge */ /* synthetic */ default android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            a.Je r1 = r0.setTooltipText(r1)
            return r1
    }
}
