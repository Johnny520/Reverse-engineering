package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: Mz */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC0558Mz extends MenuItem {
    /* JADX INFO: renamed from: a */
    InterfaceMenuItemC0558Mz mo1101a(ActionProviderVisibilityListenerC2470rr r1);

    /* JADX INFO: renamed from: b */
    ActionProviderVisibilityListenerC2470rr mo1102b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0558Mz setContentDescription(CharSequence r1);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList r1);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0558Mz setTooltipText(CharSequence r1);
}
