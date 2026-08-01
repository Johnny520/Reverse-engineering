package p190;

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
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import p163.InterfaceMenuItemC7661;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7800 implements InterfaceMenuItemC7661 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f21217;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public View f21218;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC7792 f21219;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f21222;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public SubMenuC7775 f21224;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final MenuC7802 f21225;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f21227;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public char f21229;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public CharSequence f21233;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public CharSequence f21234;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f21235;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public CharSequence f21236;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f21237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public char f21238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public CharSequence f21240;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Intent f21241;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f21242;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f21243;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f21244;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f21239 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f21228 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f21226 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public ColorStateList f21232 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public PorterDuff.Mode f21231 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f21230 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f21221 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21220 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f21223 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f21216 = false;

    public C7800(MenuC7802 menuC7802, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f21225 = menuC7802;
        this.f21244 = i2;
        this.f21242 = i;
        this.f21243 = i3;
        this.f21237 = i4;
        this.f21236 = charSequence;
        this.f21222 = i5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13150(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f21222 & 8) == 0) {
            return false;
        }
        if (this.f21218 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21217;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f21225.mo13127(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m13152()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21217;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f21225.mo13125(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f21218;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC7792 = this.f21219;
        if (actionProviderVisibilityListenerC7792 == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC7792.f21198.onCreateActionView(this);
        this.f21218 = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21228;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f21229;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f21234;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f21242;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f21227;
        if (drawable != null) {
            return m13153(drawable);
        }
        int i = this.f21226;
        if (i == 0) {
            return null;
        }
        Drawable drawableM8312 = AbstractC3933.m8312(this.f21225.f21269, i);
        this.f21226 = 0;
        this.f21227 = drawableM8312;
        return m13153(drawableM8312);
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21232;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21231;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21241;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f21244;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21239;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21238;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f21243;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f21224;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f21236;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21240;
        return charSequence != null ? charSequence : this.f21236;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21233;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f21224 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f21216;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f21223 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f21223 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f21223 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC7792 = this.f21219;
        return (actionProviderVisibilityListenerC7792 == null || !actionProviderVisibilityListenerC7792.f21198.overridesItemVisibility()) ? (this.f21223 & 8) == 0 : (this.f21223 & 8) == 0 && this.f21219.f21198.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC7802 menuC7802 = this.f21225;
        Context context = menuC7802.f21269;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f21218 = viewInflate;
        this.f21219 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f21244) > 0) {
            viewInflate.setId(i2);
        }
        menuC7802.f21253 = true;
        menuC7802.m13164(true);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f21229 == c && this.f21228 == i) {
            return this;
        }
        this.f21229 = Character.toLowerCase(c);
        this.f21228 = KeyEvent.normalizeMetaState(i);
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f21223;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f21223 = i2;
        if (i != i2) {
            this.f21225.m13164(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f21223;
        int i2 = i & 4;
        MenuC7802 menuC7802 = this.f21225;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f21223 = i3;
            if (i != i3) {
                menuC7802.m13164(false);
            }
            return this;
        }
        ArrayList arrayList = menuC7802.f21265;
        int size = arrayList.size();
        menuC7802.m13159();
        for (int i4 = 0; i4 < size; i4++) {
            C7800 c7800 = (C7800) arrayList.get(i4);
            if (c7800.f21242 == this.f21242 && (c7800.f21223 & 4) != 0 && c7800.isCheckable()) {
                boolean z2 = c7800 == this;
                int i5 = c7800.f21223;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c7800.f21223 = i6;
                if (i5 != i6) {
                    c7800.f21225.m13164(false);
                }
            }
        }
        menuC7802.m13161();
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final InterfaceMenuItemC7661 setContentDescription(CharSequence charSequence) {
        this.f21234 = charSequence;
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f21223;
        if (z) {
            this.f21223 = i | 16;
        } else {
            this.f21223 = i & (-17);
        }
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f21227 = null;
        this.f21226 = i;
        this.f21220 = true;
        this.f21225.m13164(false);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21232 = colorStateList;
        this.f21230 = true;
        this.f21220 = true;
        this.f21225.m13164(false);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21231 = mode;
        this.f21221 = true;
        this.f21220 = true;
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21241 = intent;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f21238 == c && this.f21239 == i) {
            return this;
        }
        this.f21238 = c;
        this.f21239 = KeyEvent.normalizeMetaState(i);
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21217 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21235 = onMenuItemClickListener;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f21238 = c;
        this.f21239 = KeyEvent.normalizeMetaState(i);
        this.f21229 = Character.toLowerCase(c2);
        this.f21228 = KeyEvent.normalizeMetaState(i2);
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C5925.m11310("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f21222 = i;
        MenuC7802 menuC7802 = this.f21225;
        menuC7802.f21253 = true;
        menuC7802.m13164(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21236 = charSequence;
        this.f21225.m13164(false);
        SubMenuC7775 subMenuC7775 = this.f21224;
        if (subMenuC7775 != null) {
            subMenuC7775.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21240 = charSequence;
        this.f21225.m13164(false);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final InterfaceMenuItemC7661 setTooltipText(CharSequence charSequence) {
        this.f21233 = charSequence;
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f21223;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f21223 = i2;
        if (i != i2) {
            MenuC7802 menuC7802 = this.f21225;
            menuC7802.f21263 = true;
            menuC7802.m13164(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f21236;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13151(boolean z) {
        int i = this.f21223;
        if (z) {
            this.f21223 = i | 32;
        } else {
            this.f21223 = i & (-33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13152() {
        ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC7792;
        if ((this.f21222 & 8) != 0) {
            if (this.f21218 == null && (actionProviderVisibilityListenerC7792 = this.f21219) != null) {
                this.f21218 = actionProviderVisibilityListenerC7792.f21198.onCreateActionView(this);
            }
            if (this.f21218 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Drawable m13153(Drawable drawable) {
        if (drawable != null && this.f21220 && (this.f21230 || this.f21221)) {
            drawable = drawable.mutate();
            if (this.f21230) {
                drawable.setTintList(this.f21232);
            }
            if (this.f21221) {
                drawable.setTintMode(this.f21231);
            }
            this.f21220 = false;
        }
        return drawable;
    }

    @Override // p163.InterfaceMenuItemC7661
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ActionProviderVisibilityListenerC7792 mo12923() {
        return this.f21219;
    }

    @Override // p163.InterfaceMenuItemC7661
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceMenuItemC7661 mo12924(ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC7792) {
        this.f21218 = null;
        this.f21219 = actionProviderVisibilityListenerC7792;
        this.f21225.m13164(true);
        ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC77922 = this.f21219;
        if (actionProviderVisibilityListenerC77922 != null) {
            actionProviderVisibilityListenerC77922.f21199 = new C5856(this, 22);
            actionProviderVisibilityListenerC77922.f21198.setVisibilityListener(actionProviderVisibilityListenerC77922);
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
        this.f21226 = 0;
        this.f21227 = drawable;
        this.f21220 = true;
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f21225.f21269.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f21238 == c) {
            return this;
        }
        this.f21238 = c;
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f21238 = c;
        this.f21229 = Character.toLowerCase(c2);
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f21229 == c) {
            return this;
        }
        this.f21229 = Character.toLowerCase(c);
        this.f21225.m13164(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f21218 = view;
        this.f21219 = null;
        if (view != null && view.getId() == -1 && (i = this.f21244) > 0) {
            view.setId(i);
        }
        MenuC7802 menuC7802 = this.f21225;
        menuC7802.f21253 = true;
        menuC7802.m13164(true);
        return this;
    }
}
