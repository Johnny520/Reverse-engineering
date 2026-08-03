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

/* JADX INFO: renamed from: qr */
/* JADX INFO: loaded from: classes.dex */
public final class C2427qr implements InterfaceMenuItemC0558Mz {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC2470rr f8489A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f8490B;

    /* JADX INFO: renamed from: a */
    public final int f8492a;

    /* JADX INFO: renamed from: b */
    public final int f8493b;

    /* JADX INFO: renamed from: c */
    public final int f8494c;

    /* JADX INFO: renamed from: d */
    public final int f8495d;

    /* JADX INFO: renamed from: e */
    public CharSequence f8496e;

    /* JADX INFO: renamed from: f */
    public CharSequence f8497f;

    /* JADX INFO: renamed from: g */
    public Intent f8498g;

    /* JADX INFO: renamed from: h */
    public char f8499h;

    /* JADX INFO: renamed from: j */
    public char f8501j;

    /* JADX INFO: renamed from: l */
    public Drawable f8503l;

    /* JADX INFO: renamed from: n */
    public final MenuC2204lr f8505n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0214Ez f8506o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f8507p;

    /* JADX INFO: renamed from: q */
    public CharSequence f8508q;

    /* JADX INFO: renamed from: r */
    public CharSequence f8509r;

    /* JADX INFO: renamed from: y */
    public int f8516y;

    /* JADX INFO: renamed from: z */
    public View f8517z;

    /* JADX INFO: renamed from: i */
    public int f8500i = 4096;

    /* JADX INFO: renamed from: k */
    public int f8502k = 4096;

    /* JADX INFO: renamed from: m */
    public int f8504m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f8510s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f8511t = null;

    /* JADX INFO: renamed from: u */
    public boolean f8512u = false;

    /* JADX INFO: renamed from: v */
    public boolean f8513v = false;

    /* JADX INFO: renamed from: w */
    public boolean f8514w = false;

    /* JADX INFO: renamed from: x */
    public int f8515x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f8491C = false;

    public C2427qr(MenuC2204lr menuC2204lr, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f8505n = menuC2204lr;
        this.f8492a = i2;
        this.f8493b = i;
        this.f8494c = i3;
        this.f8495d = i4;
        this.f8496e = charSequence;
        this.f8516y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m4858c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC0558Mz mo1101a(ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr) {
        this.f8517z = null;
        this.f8489A = actionProviderVisibilityListenerC2470rr;
        this.f8505n.m4435p(true);
        ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr2 = this.f8489A;
        if (actionProviderVisibilityListenerC2470rr2 != null) {
            actionProviderVisibilityListenerC2470rr2.f8694a = new C1017Xm(6, this);
            actionProviderVisibilityListenerC2470rr2.f8695b.setVisibilityListener(actionProviderVisibilityListenerC2470rr2);
        }
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC2470rr mo1102b() {
        return this.f8489A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f8516y & 8) == 0) {
            return false;
        }
        if (this.f8517z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8490B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8505n.mo426d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m4859d(Drawable drawable) {
        if (drawable != null && this.f8514w && (this.f8512u || this.f8513v)) {
            drawable = drawable.mutate();
            if (this.f8512u) {
                drawable.setTintList(this.f8510s);
            }
            if (this.f8513v) {
                drawable.setTintMode(this.f8511t);
            }
            this.f8514w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4860e() {
        ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr;
        if ((this.f8516y & 8) != 0) {
            if (this.f8517z == null && (actionProviderVisibilityListenerC2470rr = this.f8489A) != null) {
                this.f8517z = actionProviderVisibilityListenerC2470rr.f8695b.onCreateActionView(this);
            }
            if (this.f8517z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m4860e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8490B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8505n.mo428f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m4861f(boolean z) {
        if (z) {
            this.f8515x |= 32;
        } else {
            this.f8515x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f8517z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr = this.f8489A;
        if (actionProviderVisibilityListenerC2470rr == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC2470rr.f8695b.onCreateActionView(this);
        this.f8517z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8502k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8501j;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8508q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8493b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f8503l;
        if (drawable != null) {
            return m4859d(drawable);
        }
        int i = this.f8504m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM2695U = AbstractC1406fG.m2695U(this.f8505n.f7660a, i);
        this.f8504m = 0;
        this.f8503l = drawableM2695U;
        return m4859d(drawableM2695U);
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8510s;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8511t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8498g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f8492a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8500i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8499h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8494c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8506o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8496e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8497f;
        return charSequence != null ? charSequence : this.f8496e;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8509r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f8506o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f8491C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8515x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8515x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8515x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr = this.f8489A;
        return (actionProviderVisibilityListenerC2470rr == null || !actionProviderVisibilityListenerC2470rr.f8695b.overridesItemVisibility()) ? (this.f8515x & 8) == 0 : (this.f8515x & 8) == 0 && this.f8489A.f8695b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f8517z = view;
        this.f8489A = null;
        if (view != null && view.getId() == -1 && (i = this.f8492a) > 0) {
            view.setId(i);
        }
        MenuC2204lr menuC2204lr = this.f8505n;
        menuC2204lr.f7670k = true;
        menuC2204lr.m4435p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f8501j == c) {
            return this;
        }
        this.f8501j = Character.toLowerCase(c);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f8515x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f8515x = i2;
        if (i != i2) {
            this.f8505n.m4435p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f8515x;
        int i2 = i & 4;
        MenuC2204lr menuC2204lr = this.f8505n;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f8515x = i3;
            if (i != i3) {
                menuC2204lr.m4435p(false);
            }
            return this;
        }
        ArrayList arrayList = menuC2204lr.f7665f;
        int size = arrayList.size();
        menuC2204lr.m4442w();
        for (int i4 = 0; i4 < size; i4++) {
            C2427qr c2427qr = (C2427qr) arrayList.get(i4);
            if (c2427qr.f8493b == this.f8493b && (c2427qr.f8515x & 4) != 0 && c2427qr.isCheckable()) {
                boolean z2 = c2427qr == this;
                int i5 = c2427qr.f8515x;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c2427qr.f8515x = i6;
                if (i5 != i6) {
                    c2427qr.f8505n.m4435p(false);
                }
            }
        }
        menuC2204lr.m4441v();
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
            this.f8515x |= 16;
        } else {
            this.f8515x &= -17;
        }
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8504m = 0;
        this.f8503l = drawable;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8510s = colorStateList;
        this.f8512u = true;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8511t = mode;
        this.f8513v = true;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8498g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f8499h == c) {
            return this;
        }
        this.f8499h = c;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8490B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8507p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f8499h = c;
        this.f8501j = Character.toLowerCase(c2);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8516y = i;
        MenuC2204lr menuC2204lr = this.f8505n;
        menuC2204lr.f7670k = true;
        menuC2204lr.m4435p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8496e = charSequence;
        this.f8505n.m4435p(false);
        SubMenuC0214Ez subMenuC0214Ez = this.f8506o;
        if (subMenuC0214Ez != null) {
            subMenuC0214Ez.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8497f = charSequence;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f8515x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f8515x = i2;
        if (i != i2) {
            MenuC2204lr menuC2204lr = this.f8505n;
            menuC2204lr.f7667h = true;
            menuC2204lr.m4435p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f8496e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setContentDescription(CharSequence charSequence) {
        this.f8508q = charSequence;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setTooltipText(CharSequence charSequence) {
        this.f8509r = charSequence;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f8501j == c && this.f8502k == i) {
            return this;
        }
        this.f8501j = Character.toLowerCase(c);
        this.f8502k = KeyEvent.normalizeMetaState(i);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f8499h == c && this.f8500i == i) {
            return this;
        }
        this.f8499h = c;
        this.f8500i = KeyEvent.normalizeMetaState(i);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f8499h = c;
        this.f8500i = KeyEvent.normalizeMetaState(i);
        this.f8501j = Character.toLowerCase(c2);
        this.f8502k = KeyEvent.normalizeMetaState(i2);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f8503l = null;
        this.f8504m = i;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f8505n.f7660a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC2204lr menuC2204lr = this.f8505n;
        Context context = menuC2204lr.f7660a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f8517z = viewInflate;
        this.f8489A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f8492a) > 0) {
            viewInflate.setId(i2);
        }
        menuC2204lr.f7670k = true;
        menuC2204lr.m4435p(true);
        return this;
    }
}
