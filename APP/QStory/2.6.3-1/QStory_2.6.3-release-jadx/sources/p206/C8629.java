package p206;

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
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import p179.InterfaceMenuItemC8490;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8629 implements InterfaceMenuItemC8490 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f21562;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public View f21563;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC8621 f21564;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f21567;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public SubMenuC8604 f21569;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final MenuC8631 f21570;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f21572;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public char f21574;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public CharSequence f21578;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public CharSequence f21579;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f21580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public CharSequence f21581;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f21582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public char f21583;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public CharSequence f21585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Intent f21586;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f21587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f21588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f21589;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f21584 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f21573 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f21571 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public ColorStateList f21577 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public PorterDuff.Mode f21576 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f21575 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f21566 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21565 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f21568 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f21561 = false;

    public C8629(MenuC8631 menuC8631, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f21570 = menuC8631;
        this.f21589 = i2;
        this.f21587 = i;
        this.f21588 = i3;
        this.f21582 = i4;
        this.f21581 = charSequence;
        this.f21567 = i5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13709(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f21567 & 8) == 0) {
            return false;
        }
        if (this.f21563 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21562;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f21570.mo13686(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m13711()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21562;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f21570.mo13684(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f21563;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621 = this.f21564;
        if (actionProviderVisibilityListenerC8621 == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC8621.f21543.onCreateActionView(this);
        this.f21563 = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21573;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f21574;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f21579;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f21587;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f21572;
        if (drawable != null) {
            return m13712(drawable);
        }
        int i = this.f21571;
        if (i == 0) {
            return null;
        }
        Drawable drawableM8871 = AbstractC4765.m8871(this.f21570.f21614, i);
        this.f21571 = 0;
        this.f21572 = drawableM8871;
        return m13712(drawableM8871);
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21577;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21576;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21586;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f21589;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21584;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21583;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f21588;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f21569;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f21581;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21585;
        return charSequence != null ? charSequence : this.f21581;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21578;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f21569 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f21561;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f21568 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f21568 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f21568 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621 = this.f21564;
        return (actionProviderVisibilityListenerC8621 == null || !actionProviderVisibilityListenerC8621.f21543.overridesItemVisibility()) ? (this.f21568 & 8) == 0 : (this.f21568 & 8) == 0 && this.f21564.f21543.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC8631 menuC8631 = this.f21570;
        Context context = menuC8631.f21614;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f21563 = viewInflate;
        this.f21564 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f21589) > 0) {
            viewInflate.setId(i2);
        }
        menuC8631.f21598 = true;
        menuC8631.m13723(true);
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f21574 == c && this.f21573 == i) {
            return this;
        }
        this.f21574 = Character.toLowerCase(c);
        this.f21573 = KeyEvent.normalizeMetaState(i);
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f21568;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f21568 = i2;
        if (i != i2) {
            this.f21570.m13723(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f21568;
        int i2 = i & 4;
        MenuC8631 menuC8631 = this.f21570;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f21568 = i3;
            if (i != i3) {
                menuC8631.m13723(false);
            }
            return this;
        }
        ArrayList arrayList = menuC8631.f21610;
        int size = arrayList.size();
        menuC8631.m13718();
        for (int i4 = 0; i4 < size; i4++) {
            C8629 c8629 = (C8629) arrayList.get(i4);
            if (c8629.f21587 == this.f21587 && (c8629.f21568 & 4) != 0 && c8629.isCheckable()) {
                boolean z2 = c8629 == this;
                int i5 = c8629.f21568;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c8629.f21568 = i6;
                if (i5 != i6) {
                    c8629.f21570.m13723(false);
                }
            }
        }
        menuC8631.m13720();
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final InterfaceMenuItemC8490 setContentDescription(CharSequence charSequence) {
        this.f21579 = charSequence;
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f21568;
        if (z) {
            this.f21568 = i | 16;
        } else {
            this.f21568 = i & (-17);
        }
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f21572 = null;
        this.f21571 = i;
        this.f21565 = true;
        this.f21570.m13723(false);
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21577 = colorStateList;
        this.f21575 = true;
        this.f21565 = true;
        this.f21570.m13723(false);
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21576 = mode;
        this.f21566 = true;
        this.f21565 = true;
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21586 = intent;
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f21583 == c && this.f21584 == i) {
            return this;
        }
        this.f21583 = c;
        this.f21584 = KeyEvent.normalizeMetaState(i);
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21562 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21580 = onMenuItemClickListener;
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f21583 = c;
        this.f21584 = KeyEvent.normalizeMetaState(i);
        this.f21574 = Character.toLowerCase(c2);
        this.f21573 = KeyEvent.normalizeMetaState(i2);
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C6755.m11869("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f21567 = i;
        MenuC8631 menuC8631 = this.f21570;
        menuC8631.f21598 = true;
        menuC8631.m13723(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21581 = charSequence;
        this.f21570.m13723(false);
        SubMenuC8604 subMenuC8604 = this.f21569;
        if (subMenuC8604 != null) {
            subMenuC8604.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21585 = charSequence;
        this.f21570.m13723(false);
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final InterfaceMenuItemC8490 setTooltipText(CharSequence charSequence) {
        this.f21578 = charSequence;
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f21568;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f21568 = i2;
        if (i != i2) {
            MenuC8631 menuC8631 = this.f21570;
            menuC8631.f21608 = true;
            menuC8631.m13723(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f21581;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13710(boolean z) {
        int i = this.f21568;
        if (z) {
            this.f21568 = i | 32;
        } else {
            this.f21568 = i & (-33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13711() {
        ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621;
        if ((this.f21567 & 8) != 0) {
            if (this.f21563 == null && (actionProviderVisibilityListenerC8621 = this.f21564) != null) {
                this.f21563 = actionProviderVisibilityListenerC8621.f21543.onCreateActionView(this);
            }
            if (this.f21563 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Drawable m13712(Drawable drawable) {
        if (drawable != null && this.f21565 && (this.f21575 || this.f21566)) {
            drawable = drawable.mutate();
            if (this.f21575) {
                drawable.setTintList(this.f21577);
            }
            if (this.f21566) {
                drawable.setTintMode(this.f21576);
            }
            this.f21565 = false;
        }
        return drawable;
    }

    @Override // p179.InterfaceMenuItemC8490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ActionProviderVisibilityListenerC8621 mo13482() {
        return this.f21564;
    }

    @Override // p179.InterfaceMenuItemC8490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceMenuItemC8490 mo13483(ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621) {
        this.f21563 = null;
        this.f21564 = actionProviderVisibilityListenerC8621;
        this.f21570.m13723(true);
        ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC86212 = this.f21564;
        if (actionProviderVisibilityListenerC86212 != null) {
            actionProviderVisibilityListenerC86212.f21544 = new C6686(this, 22);
            actionProviderVisibilityListenerC86212.f21543.setVisibilityListener(actionProviderVisibilityListenerC86212);
        }
        return this;
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
        this.f21571 = 0;
        this.f21572 = drawable;
        this.f21565 = true;
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f21570.f21614.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f21583 == c) {
            return this;
        }
        this.f21583 = c;
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f21583 = c;
        this.f21574 = Character.toLowerCase(c2);
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f21574 == c) {
            return this;
        }
        this.f21574 = Character.toLowerCase(c);
        this.f21570.m13723(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f21563 = view;
        this.f21564 = null;
        if (view != null && view.getId() == -1 && (i = this.f21589) > 0) {
            view.setId(i);
        }
        MenuC8631 menuC8631 = this.f21570;
        menuC8631.f21598 = true;
        menuC8631.m13723(true);
        return this;
    }
}
