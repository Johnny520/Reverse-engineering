package yyds;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛵᛷᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1148 implements InterfaceMenuItemC0339 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC2022 f5251;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public Drawable f5252;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public CharSequence f5253;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public int f5255;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Intent f5256;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f5257;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public CharSequence f5259;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f5261;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public SubMenuC1011 f5264;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public CharSequence f5265;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public char f5269;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public View f5270;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public char f5271;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f5272;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public CharSequence f5274;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f5275;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final MenuC0836 f5276;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f5277;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f5278;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f5268 = 4096;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f5254 = 4096;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f5260 = 0;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public ColorStateList f5267 = null;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f5266 = null;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public boolean f5263 = false;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public boolean f5258 = false;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public boolean f5279 = false;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public int f5262 = 16;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public boolean f5273 = false;

    public C1148(MenuC0836 menuC0836, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f5276 = menuC0836;
        this.f5275 = i2;
        this.f5278 = i;
        this.f5257 = i3;
        this.f5277 = i4;
        this.f5265 = charSequence;
        this.f5255 = i5;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m2336(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f5255 & 8) == 0) {
            return false;
        }
        if (this.f5270 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5272;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f5276.mo1917(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2337()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5272;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f5276.mo1916(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f5270;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022 = this.f5251;
        if (actionProviderVisibilityListenerC2022 == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC2022.f10095.onCreateActionView(this);
        this.f5270 = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5254;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5269;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5274;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f5278;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f5252;
        if (drawable != null) {
            return m2339(drawable);
        }
        int i = this.f5260;
        if (i == 0) {
            return null;
        }
        Drawable drawableM2767 = AbstractC1367.m2767(this.f5276.f3841, i);
        this.f5260 = 0;
        this.f5252 = drawableM2767;
        return m2339(drawableM2767);
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5267;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5266;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5256;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f5275;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5268;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5271;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f5257;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f5264;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5265;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5253;
        return charSequence != null ? charSequence : this.f5265;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5259;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f5264 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f5273;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f5262 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f5262 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f5262 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022 = this.f5251;
        return (actionProviderVisibilityListenerC2022 == null || !actionProviderVisibilityListenerC2022.f10095.overridesItemVisibility()) ? (this.f5262 & 8) == 0 : (this.f5262 & 8) == 0 && this.f5251.f10095.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC0836 menuC0836 = this.f5276;
        Context context = menuC0836.f3841;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f5270 = viewInflate;
        this.f5251 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f5275) > 0) {
            viewInflate.setId(i2);
        }
        menuC0836.f3824 = true;
        menuC0836.m1915(true);
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f5269 == c && this.f5254 == i) {
            return this;
        }
        this.f5269 = Character.toLowerCase(c);
        this.f5254 = KeyEvent.normalizeMetaState(i);
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f5262;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f5262 = i2;
        if (i != i2) {
            this.f5276.m1915(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f5262;
        int i2 = i & 4;
        MenuC0836 menuC0836 = this.f5276;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f5262 = i3;
            if (i != i3) {
                menuC0836.m1915(false);
            }
            return this;
        }
        ArrayList arrayList = menuC0836.f3823;
        int size = arrayList.size();
        menuC0836.m1905();
        for (int i4 = 0; i4 < size; i4++) {
            C1148 c1148 = (C1148) arrayList.get(i4);
            if (c1148.f5278 == this.f5278 && (c1148.f5262 & 4) != 0 && c1148.isCheckable()) {
                boolean z2 = c1148 == this;
                int i5 = c1148.f5262;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c1148.f5262 = i6;
                if (i5 != i6) {
                    c1148.f5276.m1915(false);
                }
            }
        }
        menuC0836.m1908();
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final InterfaceMenuItemC0339 setContentDescription(CharSequence charSequence) {
        this.f5274 = charSequence;
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f5262;
        if (z) {
            this.f5262 = i | 16;
        } else {
            this.f5262 = i & (-17);
        }
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f5252 = null;
        this.f5260 = i;
        this.f5279 = true;
        this.f5276.m1915(false);
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5267 = colorStateList;
        this.f5263 = true;
        this.f5279 = true;
        this.f5276.m1915(false);
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5266 = mode;
        this.f5258 = true;
        this.f5279 = true;
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5256 = intent;
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f5271 == c && this.f5268 == i) {
            return this;
        }
        this.f5271 = c;
        this.f5268 = KeyEvent.normalizeMetaState(i);
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5272 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5261 = onMenuItemClickListener;
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5271 = c;
        this.f5268 = KeyEvent.normalizeMetaState(i);
        this.f5269 = Character.toLowerCase(c2);
        this.f5254 = KeyEvent.normalizeMetaState(i2);
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C0188.m798("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f5255 = i;
        MenuC0836 menuC0836 = this.f5276;
        menuC0836.f3824 = true;
        menuC0836.m1915(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5265 = charSequence;
        this.f5276.m1915(false);
        SubMenuC1011 subMenuC1011 = this.f5264;
        if (subMenuC1011 != null) {
            subMenuC1011.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5253 = charSequence;
        this.f5276.m1915(false);
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final InterfaceMenuItemC0339 setTooltipText(CharSequence charSequence) {
        this.f5259 = charSequence;
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f5262;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f5262 = i2;
        if (i != i2) {
            MenuC0836 menuC0836 = this.f5276;
            menuC0836.f3839 = true;
            menuC0836.m1915(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f5265;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m2337() {
        ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022;
        if ((this.f5255 & 8) != 0) {
            View viewOnCreateActionView = this.f5270;
            if (viewOnCreateActionView == null && (actionProviderVisibilityListenerC2022 = this.f5251) != null) {
                viewOnCreateActionView = actionProviderVisibilityListenerC2022.f10095.onCreateActionView(this);
                this.f5270 = viewOnCreateActionView;
            }
            if (viewOnCreateActionView != null) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceMenuItemC0339
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final ActionProviderVisibilityListenerC2022 mo1024() {
        return this.f5251;
    }

    @Override // yyds.InterfaceMenuItemC0339
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceMenuItemC0339 mo1025(ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022) {
        this.f5270 = null;
        this.f5251 = actionProviderVisibilityListenerC2022;
        this.f5276.m1915(true);
        ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC20222 = this.f5251;
        if (actionProviderVisibilityListenerC20222 != null) {
            actionProviderVisibilityListenerC20222.f10096 = new C2014(6, this);
            actionProviderVisibilityListenerC20222.f10095.setVisibilityListener(actionProviderVisibilityListenerC20222);
        }
        return this;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m2338(boolean z) {
        int i = this.f5262;
        if (z) {
            this.f5262 = i | 32;
        } else {
            this.f5262 = i & (-33);
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Drawable m2339(Drawable drawable) {
        if (drawable != null && this.f5279 && (this.f5263 || this.f5258)) {
            drawable = drawable.mutate();
            if (this.f5263) {
                drawable.setTintList(this.f5267);
            }
            if (this.f5258) {
                drawable.setTintMode(this.f5266);
            }
            this.f5279 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5260 = 0;
        this.f5252 = drawable;
        this.f5279 = true;
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f5276.f3841.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f5271 == c) {
            return this;
        }
        this.f5271 = c;
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f5271 = c;
        this.f5269 = Character.toLowerCase(c2);
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f5269 == c) {
            return this;
        }
        this.f5269 = Character.toLowerCase(c);
        this.f5276.m1915(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f5270 = view;
        this.f5251 = null;
        if (view != null && view.getId() == -1 && (i = this.f5275) > 0) {
            view.setId(i);
        }
        MenuC0836 menuC0836 = this.f5276;
        menuC0836.f3824 = true;
        menuC0836.m1915(true);
        return this;
    }
}
