package p068h;

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
import p004C.C0066j;
import p052b1.AbstractC0503h;
import p087s.AbstractC0962a;
import p089t.InterfaceMenuItemC1005a;

/* JADX INFO: renamed from: h.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0596o implements InterfaceMenuItemC1005a {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC0597p f2057A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f2058B;

    /* JADX INFO: renamed from: a */
    public final int f2060a;

    /* JADX INFO: renamed from: b */
    public final int f2061b;

    /* JADX INFO: renamed from: c */
    public final int f2062c;

    /* JADX INFO: renamed from: d */
    public final int f2063d;

    /* JADX INFO: renamed from: e */
    public CharSequence f2064e;

    /* JADX INFO: renamed from: f */
    public CharSequence f2065f;

    /* JADX INFO: renamed from: g */
    public Intent f2066g;

    /* JADX INFO: renamed from: h */
    public char f2067h;

    /* JADX INFO: renamed from: j */
    public char f2069j;

    /* JADX INFO: renamed from: l */
    public Drawable f2071l;

    /* JADX INFO: renamed from: n */
    public final MenuC0594m f2073n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0581F f2074o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f2075p;

    /* JADX INFO: renamed from: q */
    public CharSequence f2076q;

    /* JADX INFO: renamed from: r */
    public CharSequence f2077r;

    /* JADX INFO: renamed from: y */
    public int f2084y;

    /* JADX INFO: renamed from: z */
    public View f2085z;

    /* JADX INFO: renamed from: i */
    public int f2068i = 4096;

    /* JADX INFO: renamed from: k */
    public int f2070k = 4096;

    /* JADX INFO: renamed from: m */
    public int f2072m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f2078s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f2079t = null;

    /* JADX INFO: renamed from: u */
    public boolean f2080u = false;

    /* JADX INFO: renamed from: v */
    public boolean f2081v = false;

    /* JADX INFO: renamed from: w */
    public boolean f2082w = false;

    /* JADX INFO: renamed from: x */
    public int f2083x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f2059C = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0596o(MenuC0594m menuC0594m, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f2073n = menuC0594m;
        this.f2060a = i3;
        this.f2061b = i2;
        this.f2062c = i4;
        this.f2063d = i5;
        this.f2064e = charSequence;
        this.f2084y = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1197c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC1005a mo1168a(ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p) {
        this.f2085z = null;
        this.f2057A = actionProviderVisibilityListenerC0597p;
        this.f2073n.m1189p(true);
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p2 = this.f2057A;
        if (actionProviderVisibilityListenerC0597p2 != null) {
            actionProviderVisibilityListenerC0597p2.f2088c = new C0066j(16, this);
            actionProviderVisibilityListenerC0597p2.f2086a.setVisibilityListener(actionProviderVisibilityListenerC0597p2);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC0597p mo1169b() {
        return this.f2057A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2084y & 8) == 0) {
            return false;
        }
        if (this.f2085z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2058B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2073n.mo1160d(this);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Drawable m1198d(Drawable drawable) {
        if (drawable != null && this.f2082w && (this.f2080u || this.f2081v)) {
            drawable = drawable.mutate();
            if (this.f2080u) {
                AbstractC0962a.m2143h(drawable, this.f2078s);
            }
            if (this.f2081v) {
                AbstractC0962a.m2144i(drawable, this.f2079t);
            }
            this.f2082w = false;
        }
        return drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m1199e() {
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p;
        if ((this.f2084y & 8) == 0) {
            return false;
        }
        if (this.f2085z == null && (actionProviderVisibilityListenerC0597p = this.f2057A) != null) {
            this.f2085z = actionProviderVisibilityListenerC0597p.m1201a(this);
        }
        return this.f2085z != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m1199e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2058B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2073n.mo1162f(this);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1200f(boolean z2) {
        if (z2) {
            this.f2083x |= 32;
        } else {
            this.f2083x &= -33;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2085z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p = this.f2057A;
        if (actionProviderVisibilityListenerC0597p == null) {
            return null;
        }
        View viewM1201a = actionProviderVisibilityListenerC0597p.m1201a(this);
        this.f2085z = viewM1201a;
        return viewM1201a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2070k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2069j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2076q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2061b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2071l;
        if (drawable != null) {
            return m1198d(drawable);
        }
        int i2 = this.f2072m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableM992y = AbstractC0503h.m992y(this.f2073n.f2030a, i2);
        this.f2072m = 0;
        this.f2071l = drawableM992y;
        return m1198d(drawableM992y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2078s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2079t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2066g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2060a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2068i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2067h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2062c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2074o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2064e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2065f;
        return charSequence != null ? charSequence : this.f2064e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2077r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2074o != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2059C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2083x & 1) == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2083x & 2) == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2083x & 16) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p = this.f2057A;
        return (actionProviderVisibilityListenerC0597p == null || !actionProviderVisibilityListenerC0597p.f2086a.overridesItemVisibility()) ? (this.f2083x & 8) == 0 : (this.f2083x & 8) == 0 && this.f2057A.f2086a.isVisible();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2085z = view;
        this.f2057A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f2060a) > 0) {
            view.setId(i2);
        }
        MenuC0594m menuC0594m = this.f2073n;
        menuC0594m.f2040k = true;
        menuC0594m.m1189p(true);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2069j == c2) {
            return this;
        }
        this.f2069j = Character.toLowerCase(c2);
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2083x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2083x = i3;
        if (i2 != i3) {
            this.f2073n.m1189p(false);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2083x;
        if ((i2 & 4) == 0) {
            int i3 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2083x = i3;
            if (i2 != i3) {
                this.f2073n.m1189p(false);
            }
            return this;
        }
        MenuC0594m menuC0594m = this.f2073n;
        menuC0594m.getClass();
        ArrayList arrayList = menuC0594m.f2035f;
        int size = arrayList.size();
        menuC0594m.m1196w();
        for (int i4 = 0; i4 < size; i4++) {
            C0596o c0596o = (C0596o) arrayList.get(i4);
            if (c0596o.f2061b == this.f2061b && (c0596o.f2083x & 4) != 0 && c0596o.isCheckable()) {
                boolean z3 = c0596o == this;
                int i5 = c0596o.f2083x;
                int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                c0596o.f2083x = i6;
                if (i5 != i6) {
                    c0596o.f2073n.m1189p(false);
                }
            }
        }
        menuC0594m.m1195v();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2083x |= 16;
        } else {
            this.f2083x &= -17;
        }
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2072m = 0;
        this.f2071l = drawable;
        this.f2082w = true;
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2078s = colorStateList;
        this.f2080u = true;
        this.f2082w = true;
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2079t = mode;
        this.f2081v = true;
        this.f2082w = true;
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2066g = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f2067h == c2) {
            return this;
        }
        this.f2067h = c2;
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2058B = onActionExpandListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2075p = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2067h = c2;
        this.f2069j = Character.toLowerCase(c3);
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2084y = i2;
        MenuC0594m menuC0594m = this.f2073n;
        menuC0594m.f2040k = true;
        menuC0594m.m1189p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2064e = charSequence;
        this.f2073n.m1189p(false);
        SubMenuC0581F subMenuC0581F = this.f2074o;
        if (subMenuC0581F != null) {
            subMenuC0581F.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2065f = charSequence;
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2083x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2083x = i3;
        if (i2 != i3) {
            MenuC0594m menuC0594m = this.f2073n;
            menuC0594m.f2037h = true;
            menuC0594m.m1189p(true);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        CharSequence charSequence = this.f2064e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final InterfaceMenuItemC1005a setContentDescription(CharSequence charSequence) {
        this.f2076q = charSequence;
        this.f2073n.m1189p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final InterfaceMenuItemC1005a setTooltipText(CharSequence charSequence) {
        this.f2077r = charSequence;
        this.f2073n.m1189p(false);
        return this;
    }

    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2069j == c2 && this.f2070k == i2) {
            return this;
        }
        this.f2069j = Character.toLowerCase(c2);
        this.f2070k = KeyEvent.normalizeMetaState(i2);
        this.f2073n.m1189p(false);
        return this;
    }

    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2067h == c2 && this.f2068i == i2) {
            return this;
        }
        this.f2067h = c2;
        this.f2068i = KeyEvent.normalizeMetaState(i2);
        this.f2073n.m1189p(false);
        return this;
    }

    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2067h = c2;
        this.f2068i = KeyEvent.normalizeMetaState(i2);
        this.f2069j = Character.toLowerCase(c3);
        this.f2070k = KeyEvent.normalizeMetaState(i3);
        this.f2073n.m1189p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2071l = null;
        this.f2072m = i2;
        this.f2082w = true;
        this.f2073n.m1189p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2073n.f2030a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2073n.f2030a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2085z = viewInflate;
        this.f2057A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f2060a) > 0) {
            viewInflate.setId(i3);
        }
        MenuC0594m menuC0594m = this.f2073n;
        menuC0594m.f2040k = true;
        menuC0594m.m1189p(true);
        return this;
    }
}
