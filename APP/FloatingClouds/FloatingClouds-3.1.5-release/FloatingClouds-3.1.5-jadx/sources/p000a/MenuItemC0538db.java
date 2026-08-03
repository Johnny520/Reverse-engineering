package p000a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.SubMenuC1005m;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.db */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0538db extends AbstractC0491b2 implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuItemC0179Je f1934d;

    /* JADX INFO: renamed from: e */
    public Method f1935e;

    /* JADX INFO: renamed from: a.db$a */
    public class a extends AbstractC0290Q implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: b */
        public C1000h.a f1936b;

        /* JADX INFO: renamed from: c */
        public final ActionProvider f1937c;

        public a(ActionProvider actionProvider) {
            this.f1937c = actionProvider;
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: a */
        public final boolean mo786a() {
            return this.f1937c.hasSubMenu();
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: b */
        public final boolean mo787b() {
            return this.f1937c.isVisible();
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: c */
        public final View mo788c() {
            return this.f1937c.onCreateActionView();
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: d */
        public final View mo789d(C1000h c1000h) {
            return this.f1937c.onCreateActionView(c1000h);
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: e */
        public final boolean mo790e() {
            return this.f1937c.onPerformDefaultAction();
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: f */
        public final void mo791f(SubMenuC1005m subMenuC1005m) {
            this.f1937c.onPrepareSubMenu(MenuItemC0538db.this.m1194d(subMenuC1005m));
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: g */
        public final boolean mo792g() {
            return this.f1937c.overridesItemVisibility();
        }

        @Override // p000a.AbstractC0290Q
        /* JADX INFO: renamed from: h */
        public final void mo793h(C1000h.a aVar) {
            this.f1936b = aVar;
            this.f1937c.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z) {
            C1000h.a aVar = this.f1936b;
            if (aVar != null) {
                C0998f c0998f = C1000h.this.f3827n;
                c0998f.f3791h = true;
                c0998f.m2331p(true);
            }
        }
    }

    /* JADX INFO: renamed from: a.db$b */
    public static class b extends FrameLayout implements InterfaceC0701m3 {

        /* JADX INFO: renamed from: a */
        public final CollapsibleActionView f1939a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f1939a = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p000a.InterfaceC0701m3
        /* JADX INFO: renamed from: d */
        public final void mo1309d() {
            this.f1939a.onActionViewExpanded();
        }

        @Override // p000a.InterfaceC0701m3
        /* JADX INFO: renamed from: e */
        public final void mo1310e() {
            this.f1939a.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: a.db$c */
    public class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f1940a;

        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1940a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1940a.onMenuItemActionCollapse(MenuItemC0538db.this.m1193c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1940a.onMenuItemActionExpand(MenuItemC0538db.this.m1193c(menuItem));
        }
    }

    /* JADX INFO: renamed from: a.db$d */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnMenuItemClickListener f1942a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1942a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1942a.onMenuItemClick(MenuItemC0538db.this.m1193c(menuItem));
        }
    }

    public MenuItemC0538db(Context context, InterfaceMenuItemC0179Je interfaceMenuItemC0179Je) {
        super(context);
        if (interfaceMenuItemC0179Je == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1934d = interfaceMenuItemC0179Je;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f1934d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f1934d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC0290Q abstractC0290QMo486a = this.f1934d.mo486a();
        if (abstractC0290QMo486a instanceof a) {
            return ((a) abstractC0290QMo486a).f1937c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f1934d.getActionView();
        return actionView instanceof b ? (View) ((b) actionView).f1939a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1934d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1934d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1934d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f1934d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f1934d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1934d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1934d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1934d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f1934d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1934d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1934d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f1934d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f1934d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m1194d(this.f1934d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1934d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f1934d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f1934d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f1934d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f1934d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f1934d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f1934d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f1934d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f1934d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(actionProvider);
        if (actionProvider == null) {
            aVar = null;
        }
        this.f1934d.mo487b(aVar);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f1934d.setActionView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f1934d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f1934d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f1934d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f1934d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f1934d.setEnabled(z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1934d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1934d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1934d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1934d.setIntent(intent);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f1934d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1934d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1934d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f1934d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f1934d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f1934d.setShowAsActionFlags(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1934d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1934d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f1934d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f1934d.setVisible(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f1934d.setAlphabeticShortcut(c2, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f1934d.setIcon(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f1934d.setNumericShortcut(c2, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1934d.setShortcut(c2, c3, i, i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f1934d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        InterfaceMenuItemC0179Je interfaceMenuItemC0179Je = this.f1934d;
        interfaceMenuItemC0179Je.setActionView(i);
        View actionView = interfaceMenuItemC0179Je.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC0179Je.setActionView(new b(actionView));
        }
        return this;
    }
}
