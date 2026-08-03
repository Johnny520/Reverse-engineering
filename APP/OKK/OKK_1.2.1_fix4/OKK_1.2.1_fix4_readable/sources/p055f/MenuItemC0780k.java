package p055f;

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
import p037U.AbstractC0358S;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: f.k */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0780k implements MenuItem {

    /* JADX INFO: renamed from: A */
    public MenuItem.OnActionExpandListener f2805A;

    /* JADX INFO: renamed from: a */
    public final int f2807a;

    /* JADX INFO: renamed from: b */
    public final int f2808b;

    /* JADX INFO: renamed from: c */
    public final int f2809c;

    /* JADX INFO: renamed from: d */
    public final int f2810d;

    /* JADX INFO: renamed from: e */
    public CharSequence f2811e;

    /* JADX INFO: renamed from: f */
    public CharSequence f2812f;

    /* JADX INFO: renamed from: g */
    public Intent f2813g;

    /* JADX INFO: renamed from: h */
    public char f2814h;

    /* JADX INFO: renamed from: j */
    public char f2816j;

    /* JADX INFO: renamed from: l */
    public Drawable f2818l;

    /* JADX INFO: renamed from: n */
    public final MenuC0779j f2820n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0789t f2821o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f2822p;

    /* JADX INFO: renamed from: q */
    public CharSequence f2823q;

    /* JADX INFO: renamed from: r */
    public CharSequence f2824r;

    /* JADX INFO: renamed from: z */
    public View f2832z;

    /* JADX INFO: renamed from: i */
    public int f2815i = 4096;

    /* JADX INFO: renamed from: k */
    public int f2817k = 4096;

    /* JADX INFO: renamed from: m */
    public int f2819m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f2825s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f2826t = null;

    /* JADX INFO: renamed from: u */
    public boolean f2827u = false;

    /* JADX INFO: renamed from: v */
    public boolean f2828v = false;

    /* JADX INFO: renamed from: w */
    public boolean f2829w = false;

    /* JADX INFO: renamed from: x */
    public int f2830x = 16;

    /* JADX INFO: renamed from: B */
    public boolean f2806B = false;

    /* JADX INFO: renamed from: y */
    public int f2831y = 0;

    public MenuItemC0780k(MenuC0779j menuC0779j, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f2820n = menuC0779j;
        this.f2807a = i3;
        this.f2808b = i2;
        this.f2809c = i4;
        this.f2810d = i5;
        this.f2811e = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public static void m2014a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m2015b(Drawable drawable) {
        if (drawable != null && this.f2829w && (this.f2827u || this.f2828v)) {
            drawable = drawable.mutate();
            if (this.f2827u) {
                AbstractC1111a.m2626h(drawable, this.f2825s);
            }
            if (this.f2828v) {
                AbstractC1111a.m2627i(drawable, this.f2826t);
            }
            this.f2829w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2016c() {
        return ((this.f2831y & 8) == 0 || this.f2832z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2831y & 8) == 0) {
            return false;
        }
        if (this.f2832z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2805A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2820n.mo1998d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2017d() {
        return (this.f2830x & 32) == 32;
    }

    /* JADX INFO: renamed from: e */
    public final MenuItemC0780k m2018e(CharSequence charSequence) {
        this.f2823q = charSequence;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2016c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2805A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2820n.mo2000f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2019f(boolean z2) {
        if (z2) {
            this.f2830x |= 32;
        } else {
            this.f2830x &= -33;
        }
    }

    /* JADX INFO: renamed from: g */
    public final MenuItemC0780k m2020g(CharSequence charSequence) {
        this.f2824r = charSequence;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2832z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2817k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2816j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2823q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2808b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2818l;
        if (drawable != null) {
            return m2015b(drawable);
        }
        int i2 = this.f2819m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableM916w = AbstractC0358S.m916w(this.f2820n.f2785a, i2);
        this.f2819m = 0;
        this.f2818l = drawableM916w;
        return m2015b(drawableM916w);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2825s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2826t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2813g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2807a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2815i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2814h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2809c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2821o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2811e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2812f;
        return charSequence != null ? charSequence : this.f2811e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2824r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2821o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2806B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2830x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2830x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2830x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2830x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2832z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f2807a) > 0) {
            view.setId(i2);
        }
        MenuC0779j menuC0779j = this.f2820n;
        menuC0779j.f2795k = true;
        menuC0779j.m2009o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f2816j == c) {
            return this;
        }
        this.f2816j = Character.toLowerCase(c);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2830x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2830x = i3;
        if (i2 != i3) {
            this.f2820n.m2009o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2830x;
        if ((i2 & 4) != 0) {
            MenuC0779j menuC0779j = this.f2820n;
            menuC0779j.getClass();
            ArrayList arrayList = menuC0779j.f2790f;
            int size = arrayList.size();
            menuC0779j.m2013s();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList.get(i3);
                if (menuItemC0780k.f2808b == this.f2808b && (menuItemC0780k.f2830x & 4) != 0 && menuItemC0780k.isCheckable()) {
                    boolean z3 = menuItemC0780k == this;
                    int i4 = menuItemC0780k.f2830x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    menuItemC0780k.f2830x = i5;
                    if (i4 != i5) {
                        menuItemC0780k.f2820n.m2009o(false);
                    }
                }
            }
            menuC0779j.m2012r();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2830x = i6;
            if (i2 != i6) {
                this.f2820n.m2009o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        m2018e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2830x |= 16;
        } else {
            this.f2830x &= -17;
        }
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2819m = 0;
        this.f2818l = drawable;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2825s = colorStateList;
        this.f2827u = true;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2826t = mode;
        this.f2828v = true;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2813g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f2814h == c) {
            return this;
        }
        this.f2814h = c;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2805A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2822p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f2814h = c;
        this.f2816j = Character.toLowerCase(c2);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2831y = i2;
        MenuC0779j menuC0779j = this.f2820n;
        menuC0779j.f2795k = true;
        menuC0779j.m2009o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2811e = charSequence;
        this.f2820n.m2009o(false);
        SubMenuC0789t subMenuC0789t = this.f2821o;
        if (subMenuC0789t != null) {
            subMenuC0789t.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2812f = charSequence;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        m2020g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2830x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2830x = i3;
        if (i2 != i3) {
            MenuC0779j menuC0779j = this.f2820n;
            menuC0779j.f2792h = true;
            menuC0779j.m2009o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2811e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i2) {
        if (this.f2816j == c && this.f2817k == i2) {
            return this;
        }
        this.f2816j = Character.toLowerCase(c);
        this.f2817k = KeyEvent.normalizeMetaState(i2);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i2) {
        if (this.f2814h == c && this.f2815i == i2) {
            return this;
        }
        this.f2814h = c;
        this.f2815i = KeyEvent.normalizeMetaState(i2);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i2, int i3) {
        this.f2814h = c;
        this.f2815i = KeyEvent.normalizeMetaState(i2);
        this.f2816j = Character.toLowerCase(c2);
        this.f2817k = KeyEvent.normalizeMetaState(i3);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2818l = null;
        this.f2819m = i2;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2820n.f2785a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2820n.f2785a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2832z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f2807a) > 0) {
            viewInflate.setId(i3);
        }
        MenuC0779j menuC0779j = this.f2820n;
        menuC0779j.f2795k = true;
        menuC0779j.m2009o(true);
        return this;
    }
}
