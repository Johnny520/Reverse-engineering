package Yue;

import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public interface InterfaceMenuItemC7684 extends MenuItem {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f23171 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f23172 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f23173 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f23174 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f23175 = 8;

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @InterfaceC6490
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @InterfaceC6490
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @InterfaceC6490
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @InterfaceC6490
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @InterfaceC6490
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setActionView(@InterfaceC6490 View view);

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setAlphabeticShortcut(char c, int i);

    /* JADX DEBUG: Method merged with bridge method: setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // android.view.MenuItem
    @InterfaceC6391
    InterfaceMenuItemC7684 setContentDescription(@InterfaceC6490 CharSequence charSequence);

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setIconTintList(@InterfaceC6490 ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setIconTintMode(@InterfaceC6490 PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    @InterfaceC6391
    MenuItem setShowAsActionFlags(int i);

    /* JADX DEBUG: Method merged with bridge method: setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // android.view.MenuItem
    @InterfaceC6391
    InterfaceMenuItemC7684 setTooltipText(@InterfaceC6490 CharSequence charSequence);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    AbstractC3087 mo172();

    /* JADX INFO: renamed from: ۥ۟ */
    boolean mo173();

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ */
    InterfaceMenuItemC7684 mo6263(@InterfaceC6490 AbstractC3087 abstractC3087);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    boolean mo6264();
}
