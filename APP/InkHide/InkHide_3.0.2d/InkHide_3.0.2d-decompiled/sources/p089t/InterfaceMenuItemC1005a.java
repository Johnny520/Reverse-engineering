package p089t;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p068h.ActionProviderVisibilityListenerC0597p;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC1005a extends MenuItem {
    /* JADX INFO: renamed from: a */
    InterfaceMenuItemC1005a mo1168a(ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p);

    /* JADX INFO: renamed from: b */
    ActionProviderVisibilityListenerC0597p mo1169b();

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
    MenuItem setAlphabeticShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1005a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i2, int i3);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1005a setTooltipText(CharSequence charSequence);
}
