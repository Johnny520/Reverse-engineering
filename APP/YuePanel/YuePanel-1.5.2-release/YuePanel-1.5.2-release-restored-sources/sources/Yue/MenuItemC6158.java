package Yue;

import Yue.AbstractC3087;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class MenuItemC6158 extends AbstractC3519 implements MenuItem {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String f15062 = "MenuItemWrapper";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final InterfaceMenuItemC7684 f15063;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Method f15064;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ */
    public class ActionProviderVisibilityListenerC0921 extends AbstractC3087 implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public AbstractC3087.InterfaceC0046 f15065;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final ActionProvider f15066;

        public ActionProviderVisibilityListenerC0921(Context context, ActionProvider actionProvider) {
            super(context);
            this.f15066 = actionProvider;
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC3087.InterfaceC0046 interfaceC0046 = this.f15065;
            if (interfaceC0046 != null) {
                interfaceC0046.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo179() {
            return this.f15066.hasSubMenu();
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo6289() {
            return this.f15066.isVisible();
        }

        @Override // Yue.AbstractC3087
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public View mo6290() {
            return this.f15066.onCreateActionView();
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public View mo6291(MenuItem menuItem) {
            return this.f15066.onCreateActionView(menuItem);
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo6292() {
            return this.f15066.onPerformDefaultAction();
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo6293(SubMenu subMenu) {
            this.f15066.onPrepareSubMenu(MenuItemC6158.this.m9434(subMenu));
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public boolean mo6294() {
            return this.f15066.overridesItemVisibility();
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo6295() {
            this.f15066.refreshVisibility();
        }

        @Override // Yue.AbstractC3087
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo6298(AbstractC3087.InterfaceC0046 interfaceC0046) {
            this.f15065 = interfaceC0046;
            this.f15066.setVisibilityListener(interfaceC0046 != null ? this : null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ۟ */
    public static class C0922 extends FrameLayout implements InterfaceC3875 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final CollapsibleActionView f15068;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
        /* JADX WARN: Multi-variable type inference failed */
        public C0922(View view) {
            super(view.getContext());
            this.f15068 = (CollapsibleActionView) view;
            addView(view);
        }

        /* JADX INFO: renamed from: ۥ */
        public View m2661() {
            return (View) this.f15068;
        }

        @Override // Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo912() {
            this.f15068.onActionViewExpanded();
        }

        @Override // Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo10705() {
            this.f15068.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ۟۟, reason: contains not printable characters */
    public class MenuItemOnActionExpandListenerC6159 implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: ۥ */
        public final MenuItem.OnActionExpandListener f1866;

        public MenuItemOnActionExpandListenerC6159(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1866 = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1866.onMenuItemActionCollapse(MenuItemC6158.this.m9433(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1866.onMenuItemActionExpand(MenuItemC6158.this.m9433(menuItem));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ۟۟۟, reason: contains not printable characters */
    public class MenuItemOnMenuItemClickListenerC6160 implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: ۥ */
        public final MenuItem.OnMenuItemClickListener f1868;

        public MenuItemOnMenuItemClickListenerC6160(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1868 = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1868.onMenuItemClick(MenuItemC6158.this.m9433(menuItem));
        }
    }

    public MenuItemC6158(Context context, InterfaceMenuItemC7684 interfaceMenuItemC7684) {
        super(context);
        if (interfaceMenuItemC7684 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f15063 = interfaceMenuItemC7684;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f15063.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f15063.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC3087 abstractC3087Mo172 = this.f15063.mo172();
        if (abstractC3087Mo172 instanceof ActionProviderVisibilityListenerC0921) {
            return ((ActionProviderVisibilityListenerC0921) abstractC3087Mo172).f15066;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f15063.getActionView();
        return actionView instanceof C0922 ? ((C0922) actionView).m2661() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f15063.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f15063.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f15063.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f15063.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f15063.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f15063.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f15063.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f15063.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f15063.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15063.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f15063.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f15063.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f15063.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m9434(this.f15063.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f15063.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f15063.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f15063.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f15063.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f15063.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f15063.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f15063.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f15063.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f15063.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC0921 actionProviderVisibilityListenerC0921 = new ActionProviderVisibilityListenerC0921(this.f5945, actionProvider);
        InterfaceMenuItemC7684 interfaceMenuItemC7684 = this.f15063;
        if (actionProvider == null) {
            actionProviderVisibilityListenerC0921 = null;
        }
        interfaceMenuItemC7684.mo6263(actionProviderVisibilityListenerC0921);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0922(view);
        }
        this.f15063.setActionView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f15063.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f15063.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f15063.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f15063.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f15063.setEnabled(z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f15063.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15063.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15063.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f15063.setIntent(intent);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f15063.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15063.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC6159(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15063.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC6160(onMenuItemClickListener) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f15063.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f15063.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f15063.setShowAsActionFlags(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15063.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15063.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f15063.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f15063.setVisible(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m19001(boolean z) {
        try {
            if (this.f15064 == null) {
                this.f15064 = this.f15063.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f15064.invoke(this.f15063, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w(f15062, "Error while calling setExclusiveCheckable", e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f15063.setAlphabeticShortcut(c, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f15063.setIcon(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f15063.setNumericShortcut(c, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f15063.setShortcut(c, c2, i, i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f15063.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f15063.setActionView(i);
        View actionView = this.f15063.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f15063.setActionView(new C0922(actionView));
        }
        return this;
    }
}
