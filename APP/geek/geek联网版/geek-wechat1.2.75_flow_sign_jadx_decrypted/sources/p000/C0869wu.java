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

/* JADX INFO: renamed from: wu */
/* JADX INFO: loaded from: classes.dex */
public final class C0869wu implements s50 {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC0906xu f5109A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f5110B;

    /* JADX INFO: renamed from: a */
    public final int f5112a;

    /* JADX INFO: renamed from: b */
    public final int f5113b;

    /* JADX INFO: renamed from: c */
    public final int f5114c;

    /* JADX INFO: renamed from: d */
    public final int f5115d;

    /* JADX INFO: renamed from: e */
    public CharSequence f5116e;

    /* JADX INFO: renamed from: f */
    public CharSequence f5117f;

    /* JADX INFO: renamed from: g */
    public Intent f5118g;

    /* JADX INFO: renamed from: h */
    public char f5119h;

    /* JADX INFO: renamed from: j */
    public char f5121j;

    /* JADX INFO: renamed from: l */
    public Drawable f5123l;

    /* JADX INFO: renamed from: n */
    public final MenuC0646qu f5125n;

    /* JADX INFO: renamed from: o */
    public j50 f5126o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f5127p;

    /* JADX INFO: renamed from: q */
    public CharSequence f5128q;

    /* JADX INFO: renamed from: r */
    public CharSequence f5129r;

    /* JADX INFO: renamed from: y */
    public int f5136y;

    /* JADX INFO: renamed from: z */
    public View f5137z;

    /* JADX INFO: renamed from: i */
    public int f5120i = 4096;

    /* JADX INFO: renamed from: k */
    public int f5122k = 4096;

    /* JADX INFO: renamed from: m */
    public int f5124m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f5130s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f5131t = null;

    /* JADX INFO: renamed from: u */
    public boolean f5132u = false;

    /* JADX INFO: renamed from: v */
    public boolean f5133v = false;

    /* JADX INFO: renamed from: w */
    public boolean f5134w = false;

    /* JADX INFO: renamed from: x */
    public int f5135x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f5111C = false;

    public C0869wu(MenuC0646qu menuC0646qu, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f5125n = menuC0646qu;
        this.f5112a = i2;
        this.f5113b = i;
        this.f5114c = i3;
        this.f5115d = i4;
        this.f5116e = charSequence;
        this.f5136y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m2620c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: a */
    public final s50 mo581a(ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu) {
        this.f5137z = null;
        this.f5109A = actionProviderVisibilityListenerC0906xu;
        this.f5125n.m2172p(true);
        ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu2 = this.f5109A;
        if (actionProviderVisibilityListenerC0906xu2 != null) {
            actionProviderVisibilityListenerC0906xu2.f5310b = new C0431l0(21, this);
            actionProviderVisibilityListenerC0906xu2.f5309a.setVisibilityListener(actionProviderVisibilityListenerC0906xu2);
        }
        return this;
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC0906xu mo582b() {
        return this.f5109A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f5136y & 8) == 0) {
            return false;
        }
        if (this.f5137z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5110B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f5125n.mo1566d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m2621d(Drawable drawable) {
        if (drawable != null && this.f5134w && (this.f5132u || this.f5133v)) {
            drawable = drawable.mutate();
            if (this.f5132u) {
                AbstractC0187eh.m995h(drawable, this.f5130s);
            }
            if (this.f5133v) {
                AbstractC0187eh.m996i(drawable, this.f5131t);
            }
            this.f5134w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2622e() {
        ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu;
        if ((this.f5136y & 8) == 0) {
            return false;
        }
        if (this.f5137z == null && (actionProviderVisibilityListenerC0906xu = this.f5109A) != null) {
            this.f5137z = actionProviderVisibilityListenerC0906xu.m2708a(this);
        }
        return this.f5137z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2622e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5110B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f5125n.mo1568f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2623f(boolean z) {
        if (z) {
            this.f5135x |= 32;
        } else {
            this.f5135x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f5137z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu = this.f5109A;
        if (actionProviderVisibilityListenerC0906xu == null) {
            return null;
        }
        View viewM2708a = actionProviderVisibilityListenerC0906xu.m2708a(this);
        this.f5137z = viewM2708a;
        return viewM2708a;
    }

    @Override // p000.s50, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5122k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5121j;
    }

    @Override // p000.s50, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5128q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f5113b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f5123l;
        if (drawable != null) {
            return m2621d(drawable);
        }
        int i = this.f5124m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM1261w = AbstractC0259gf.m1261w(this.f5125n.f3951a, i);
        this.f5124m = 0;
        this.f5123l = drawableM1261w;
        return m2621d(drawableM1261w);
    }

    @Override // p000.s50, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5130s;
    }

    @Override // p000.s50, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5131t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5118g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f5112a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.s50, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5120i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5119h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f5114c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f5126o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5116e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5117f;
        return charSequence != null ? charSequence : this.f5116e;
    }

    @Override // p000.s50, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5129r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f5126o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f5111C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f5135x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f5135x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f5135x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu = this.f5109A;
        return (actionProviderVisibilityListenerC0906xu == null || !actionProviderVisibilityListenerC0906xu.f5309a.overridesItemVisibility()) ? (this.f5135x & 8) == 0 : (this.f5135x & 8) == 0 && this.f5109A.f5309a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f5137z = view;
        this.f5109A = null;
        if (view != null && view.getId() == -1 && (i = this.f5112a) > 0) {
            view.setId(i);
        }
        MenuC0646qu menuC0646qu = this.f5125n;
        menuC0646qu.f3961k = true;
        menuC0646qu.m2172p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f5121j == c) {
            return this;
        }
        this.f5121j = Character.toLowerCase(c);
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f5135x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f5135x = i2;
        if (i != i2) {
            this.f5125n.m2172p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f5135x;
        int i2 = i & 4;
        MenuC0646qu menuC0646qu = this.f5125n;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f5135x = i3;
            if (i != i3) {
                menuC0646qu.m2172p(false);
            }
            return this;
        }
        ArrayList arrayList = menuC0646qu.f3956f;
        int size = arrayList.size();
        menuC0646qu.m2179w();
        for (int i4 = 0; i4 < size; i4++) {
            C0869wu c0869wu = (C0869wu) arrayList.get(i4);
            if (c0869wu.f5113b == this.f5113b && (c0869wu.f5135x & 4) != 0 && c0869wu.isCheckable()) {
                boolean z2 = c0869wu == this;
                int i5 = c0869wu.f5135x;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c0869wu.f5135x = i6;
                if (i5 != i6) {
                    c0869wu.f5125n.m2172p(false);
                }
            }
        }
        menuC0646qu.m2178v();
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
            this.f5135x |= 16;
        } else {
            this.f5135x &= -17;
        }
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5124m = 0;
        this.f5123l = drawable;
        this.f5134w = true;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5130s = colorStateList;
        this.f5132u = true;
        this.f5134w = true;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5131t = mode;
        this.f5133v = true;
        this.f5134w = true;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5118g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f5119h == c) {
            return this;
        }
        this.f5119h = c;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5110B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5127p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f5119h = c;
        this.f5121j = Character.toLowerCase(c2);
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f5136y = i;
        MenuC0646qu menuC0646qu = this.f5125n;
        menuC0646qu.f3961k = true;
        menuC0646qu.m2172p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5116e = charSequence;
        this.f5125n.m2172p(false);
        j50 j50Var = this.f5126o;
        if (j50Var != null) {
            j50Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5117f = charSequence;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f5135x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f5135x = i2;
        if (i != i2) {
            MenuC0646qu menuC0646qu = this.f5125n;
            menuC0646qu.f3958h = true;
            menuC0646qu.m2172p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f5116e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p000.s50, android.view.MenuItem
    public final s50 setContentDescription(CharSequence charSequence) {
        this.f5128q = charSequence;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final s50 setTooltipText(CharSequence charSequence) {
        this.f5129r = charSequence;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f5121j == c && this.f5122k == i) {
            return this;
        }
        this.f5121j = Character.toLowerCase(c);
        this.f5122k = KeyEvent.normalizeMetaState(i);
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f5119h == c && this.f5120i == i) {
            return this;
        }
        this.f5119h = c;
        this.f5120i = KeyEvent.normalizeMetaState(i);
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5119h = c;
        this.f5120i = KeyEvent.normalizeMetaState(i);
        this.f5121j = Character.toLowerCase(c2);
        this.f5122k = KeyEvent.normalizeMetaState(i2);
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f5123l = null;
        this.f5124m = i;
        this.f5134w = true;
        this.f5125n.m2172p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f5125n.f3951a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC0646qu menuC0646qu = this.f5125n;
        Context context = menuC0646qu.f3951a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f5137z = viewInflate;
        this.f5109A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f5112a) > 0) {
            viewInflate.setId(i2);
        }
        menuC0646qu.f3961k = true;
        menuC0646qu.m2172p(true);
        return this;
    }
}
