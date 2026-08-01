package p000;

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

/* JADX INFO: renamed from: ou */
/* JADX INFO: loaded from: classes.dex */
public final class C0572ou implements l50 {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC0610pu f3583A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f3584B;

    /* JADX INFO: renamed from: a */
    public final int f3586a;

    /* JADX INFO: renamed from: b */
    public final int f3587b;

    /* JADX INFO: renamed from: c */
    public final int f3588c;

    /* JADX INFO: renamed from: d */
    public final int f3589d;

    /* JADX INFO: renamed from: e */
    public CharSequence f3590e;

    /* JADX INFO: renamed from: f */
    public CharSequence f3591f;

    /* JADX INFO: renamed from: g */
    public Intent f3592g;

    /* JADX INFO: renamed from: h */
    public char f3593h;

    /* JADX INFO: renamed from: j */
    public char f3595j;

    /* JADX INFO: renamed from: l */
    public Drawable f3597l;

    /* JADX INFO: renamed from: n */
    public final MenuC0424ku f3599n;

    /* JADX INFO: renamed from: o */
    public c50 f3600o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f3601p;

    /* JADX INFO: renamed from: q */
    public CharSequence f3602q;

    /* JADX INFO: renamed from: r */
    public CharSequence f3603r;

    /* JADX INFO: renamed from: y */
    public int f3610y;

    /* JADX INFO: renamed from: z */
    public View f3611z;

    /* JADX INFO: renamed from: i */
    public int f3594i = 4096;

    /* JADX INFO: renamed from: k */
    public int f3596k = 4096;

    /* JADX INFO: renamed from: m */
    public int f3598m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f3604s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f3605t = null;

    /* JADX INFO: renamed from: u */
    public boolean f3606u = false;

    /* JADX INFO: renamed from: v */
    public boolean f3607v = false;

    /* JADX INFO: renamed from: w */
    public boolean f3608w = false;

    /* JADX INFO: renamed from: x */
    public int f3609x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f3585C = false;

    public C0572ou(MenuC0424ku menuC0424ku, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3599n = menuC0424ku;
        this.f3586a = i2;
        this.f3587b = i;
        this.f3588c = i3;
        this.f3589d = i4;
        this.f3590e = charSequence;
        this.f3610y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m2022c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.l50
    /* JADX INFO: renamed from: a */
    public final l50 mo622a(ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu) {
        this.f3611z = null;
        this.f3583A = actionProviderVisibilityListenerC0610pu;
        this.f3599n.m1723p(true);
        ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu2 = this.f3583A;
        if (actionProviderVisibilityListenerC0610pu2 != null) {
            actionProviderVisibilityListenerC0610pu2.f3951b = new C0431l0(21, this);
            actionProviderVisibilityListenerC0610pu2.f3950a.setVisibilityListener(actionProviderVisibilityListenerC0610pu2);
        }
        return this;
    }

    @Override // p000.l50
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC0610pu mo623b() {
        return this.f3583A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3610y & 8) == 0) {
            return false;
        }
        if (this.f3611z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3584B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3599n.mo629d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m2023d(Drawable drawable) {
        if (drawable != null && this.f3608w && (this.f3606u || this.f3607v)) {
            drawable = drawable.mutate();
            if (this.f3606u) {
                AbstractC0104ch.m688h(drawable, this.f3604s);
            }
            if (this.f3607v) {
                AbstractC0104ch.m689i(drawable, this.f3605t);
            }
            this.f3608w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2024e() {
        ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu;
        if ((this.f3610y & 8) == 0) {
            return false;
        }
        if (this.f3611z == null && (actionProviderVisibilityListenerC0610pu = this.f3583A) != null) {
            this.f3611z = actionProviderVisibilityListenerC0610pu.m2130a(this);
        }
        return this.f3611z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2024e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3584B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3599n.mo631f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2025f(boolean z) {
        if (z) {
            this.f3609x |= 32;
        } else {
            this.f3609x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3611z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu = this.f3583A;
        if (actionProviderVisibilityListenerC0610pu == null) {
            return null;
        }
        View viewM2130a = actionProviderVisibilityListenerC0610pu.m2130a(this);
        this.f3611z = viewM2130a;
        return viewM2130a;
    }

    @Override // p000.l50, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3596k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3595j;
    }

    @Override // p000.l50, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3602q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3587b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3597l;
        if (drawable != null) {
            return m2023d(drawable);
        }
        int i = this.f3598m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM1196r = AbstractC0222ff.m1196r(this.f3599n.f2950a, i);
        this.f3598m = 0;
        this.f3597l = drawableM1196r;
        return m2023d(drawableM1196r);
    }

    @Override // p000.l50, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3604s;
    }

    @Override // p000.l50, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3605t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3592g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3586a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.l50, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3594i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3593h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3588c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3600o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3590e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3591f;
        return charSequence != null ? charSequence : this.f3590e;
    }

    @Override // p000.l50, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3603r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3600o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3585C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3609x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3609x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3609x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu = this.f3583A;
        return (actionProviderVisibilityListenerC0610pu == null || !actionProviderVisibilityListenerC0610pu.f3950a.overridesItemVisibility()) ? (this.f3609x & 8) == 0 : (this.f3609x & 8) == 0 && this.f3583A.f3950a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3611z = view;
        this.f3583A = null;
        if (view != null && view.getId() == -1 && (i = this.f3586a) > 0) {
            view.setId(i);
        }
        MenuC0424ku menuC0424ku = this.f3599n;
        menuC0424ku.f2960k = true;
        menuC0424ku.m1723p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f3595j == c) {
            return this;
        }
        this.f3595j = Character.toLowerCase(c);
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f3609x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f3609x = i2;
        if (i != i2) {
            this.f3599n.m1723p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f3609x;
        int i2 = i & 4;
        MenuC0424ku menuC0424ku = this.f3599n;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f3609x = i3;
            if (i != i3) {
                menuC0424ku.m1723p(false);
            }
            return this;
        }
        ArrayList arrayList = menuC0424ku.f2955f;
        int size = arrayList.size();
        menuC0424ku.m1730w();
        for (int i4 = 0; i4 < size; i4++) {
            C0572ou c0572ou = (C0572ou) arrayList.get(i4);
            if (c0572ou.f3587b == this.f3587b && (c0572ou.f3609x & 4) != 0 && c0572ou.isCheckable()) {
                boolean z2 = c0572ou == this;
                int i5 = c0572ou.f3609x;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c0572ou.f3609x = i6;
                if (i5 != i6) {
                    c0572ou.f3599n.m1723p(false);
                }
            }
        }
        menuC0424ku.m1729v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f3609x |= 16;
        } else {
            this.f3609x &= -17;
        }
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3598m = 0;
        this.f3597l = drawable;
        this.f3608w = true;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3604s = colorStateList;
        this.f3606u = true;
        this.f3608w = true;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3605t = mode;
        this.f3607v = true;
        this.f3608w = true;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3592g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f3593h == c) {
            return this;
        }
        this.f3593h = c;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3584B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3601p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f3593h = c;
        this.f3595j = Character.toLowerCase(c2);
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3610y = i;
        MenuC0424ku menuC0424ku = this.f3599n;
        menuC0424ku.f2960k = true;
        menuC0424ku.m1723p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3590e = charSequence;
        this.f3599n.m1723p(false);
        c50 c50Var = this.f3600o;
        if (c50Var != null) {
            c50Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3591f = charSequence;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f3609x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f3609x = i2;
        if (i != i2) {
            MenuC0424ku menuC0424ku = this.f3599n;
            menuC0424ku.f2957h = true;
            menuC0424ku.m1723p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3590e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p000.l50, android.view.MenuItem
    public final l50 setContentDescription(CharSequence charSequence) {
        this.f3602q = charSequence;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final l50 setTooltipText(CharSequence charSequence) {
        this.f3603r = charSequence;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f3595j == c && this.f3596k == i) {
            return this;
        }
        this.f3595j = Character.toLowerCase(c);
        this.f3596k = KeyEvent.normalizeMetaState(i);
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f3593h == c && this.f3594i == i) {
            return this;
        }
        this.f3593h = c;
        this.f3594i = KeyEvent.normalizeMetaState(i);
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3593h = c;
        this.f3594i = KeyEvent.normalizeMetaState(i);
        this.f3595j = Character.toLowerCase(c2);
        this.f3596k = KeyEvent.normalizeMetaState(i2);
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3597l = null;
        this.f3598m = i;
        this.f3608w = true;
        this.f3599n.m1723p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3599n.f2950a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC0424ku menuC0424ku = this.f3599n;
        Context context = menuC0424ku.f2950a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3611z = viewInflate;
        this.f3583A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f3586a) > 0) {
            viewInflate.setId(i2);
        }
        menuC0424ku.f2960k = true;
        menuC0424ku.m1723p(true);
        return this;
    }
}
