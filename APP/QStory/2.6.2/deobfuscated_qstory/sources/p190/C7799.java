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
import com.bumptech.glide.AbstractC3054;
import java.util.ArrayList;
import p163.InterfaceMenuItemC7660;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7799 implements InterfaceMenuItemC7660 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f21220;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public View f21221;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC7791 f21222;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f21225;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public SubMenuC7774 f21227;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final MenuC7801 f21228;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f21230;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public char f21232;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public CharSequence f21236;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public CharSequence f21237;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f21238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public CharSequence f21239;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f21240;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public char f21241;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public CharSequence f21243;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Intent f21244;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f21245;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f21246;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f21247;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f21242 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f21231 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f21229 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public ColorStateList f21235 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public PorterDuff.Mode f21234 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f21233 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f21224 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21223 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f21226 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f21219 = false;

    public C7799(MenuC7801 menuC7801, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f21228 = menuC7801;
        this.f21247 = i2;
        this.f21245 = i;
        this.f21246 = i3;
        this.f21240 = i4;
        this.f21239 = charSequence;
        this.f21225 = i5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13122(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f21225 & 8) == 0) {
            return false;
        }
        if (this.f21221 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21220;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f21228.mo13099(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m13124()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21220;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f21228.mo13097(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f21221;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791 = this.f21222;
        if (actionProviderVisibilityListenerC7791 == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC7791.f21201.onCreateActionView(this);
        this.f21221 = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21231;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f21232;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f21237;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f21245;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f21230;
        if (drawable != null) {
            return m13125(drawable);
        }
        int i = this.f21229;
        if (i == 0) {
            return null;
        }
        Drawable drawableM6607 = AbstractC3054.m6607(this.f21228.f21272, i);
        this.f21229 = 0;
        this.f21230 = drawableM6607;
        return m13125(drawableM6607);
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21235;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21234;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21244;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f21247;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21242;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21241;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f21246;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f21227;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f21239;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21243;
        return charSequence != null ? charSequence : this.f21239;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21236;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f21227 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f21219;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f21226 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f21226 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f21226 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791 = this.f21222;
        return (actionProviderVisibilityListenerC7791 == null || !actionProviderVisibilityListenerC7791.f21201.overridesItemVisibility()) ? (this.f21226 & 8) == 0 : (this.f21226 & 8) == 0 && this.f21222.f21201.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC7801 menuC7801 = this.f21228;
        Context context = menuC7801.f21272;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f21221 = viewInflate;
        this.f21222 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f21247) > 0) {
            viewInflate.setId(i2);
        }
        menuC7801.f21256 = true;
        menuC7801.m13136(true);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f21232 == c && this.f21231 == i) {
            return this;
        }
        this.f21232 = Character.toLowerCase(c);
        this.f21231 = KeyEvent.normalizeMetaState(i);
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f21226;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f21226 = i2;
        if (i != i2) {
            this.f21228.m13136(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f21226;
        int i2 = i & 4;
        MenuC7801 menuC7801 = this.f21228;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f21226 = i3;
            if (i != i3) {
                menuC7801.m13136(false);
            }
            return this;
        }
        ArrayList arrayList = menuC7801.f21268;
        int size = arrayList.size();
        menuC7801.m13131();
        for (int i4 = 0; i4 < size; i4++) {
            C7799 c7799 = (C7799) arrayList.get(i4);
            if (c7799.f21245 == this.f21245 && (c7799.f21226 & 4) != 0 && c7799.isCheckable()) {
                boolean z2 = c7799 == this;
                int i5 = c7799.f21226;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c7799.f21226 = i6;
                if (i5 != i6) {
                    c7799.f21228.m13136(false);
                }
            }
        }
        menuC7801.m13133();
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final InterfaceMenuItemC7660 setContentDescription(CharSequence charSequence) {
        this.f21237 = charSequence;
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f21226;
        if (z) {
            this.f21226 = i | 16;
        } else {
            this.f21226 = i & (-17);
        }
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f21230 = null;
        this.f21229 = i;
        this.f21223 = true;
        this.f21228.m13136(false);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21235 = colorStateList;
        this.f21233 = true;
        this.f21223 = true;
        this.f21228.m13136(false);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21234 = mode;
        this.f21224 = true;
        this.f21223 = true;
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21244 = intent;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f21241 == c && this.f21242 == i) {
            return this;
        }
        this.f21241 = c;
        this.f21242 = KeyEvent.normalizeMetaState(i);
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21220 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21238 = onMenuItemClickListener;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f21241 = c;
        this.f21242 = KeyEvent.normalizeMetaState(i);
        this.f21232 = Character.toLowerCase(c2);
        this.f21231 = KeyEvent.normalizeMetaState(i2);
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C5919.m11249("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f21225 = i;
        MenuC7801 menuC7801 = this.f21228;
        menuC7801.f21256 = true;
        menuC7801.m13136(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21239 = charSequence;
        this.f21228.m13136(false);
        SubMenuC7774 subMenuC7774 = this.f21227;
        if (subMenuC7774 != null) {
            subMenuC7774.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21243 = charSequence;
        this.f21228.m13136(false);
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final InterfaceMenuItemC7660 setTooltipText(CharSequence charSequence) {
        this.f21236 = charSequence;
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f21226;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f21226 = i2;
        if (i != i2) {
            MenuC7801 menuC7801 = this.f21228;
            menuC7801.f21266 = true;
            menuC7801.m13136(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f21239;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13123(boolean z) {
        int i = this.f21226;
        if (z) {
            this.f21226 = i | 32;
        } else {
            this.f21226 = i & (-33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13124() {
        ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791;
        if ((this.f21225 & 8) != 0) {
            if (this.f21221 == null && (actionProviderVisibilityListenerC7791 = this.f21222) != null) {
                this.f21221 = actionProviderVisibilityListenerC7791.f21201.onCreateActionView(this);
            }
            if (this.f21221 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Drawable m13125(Drawable drawable) {
        if (drawable != null && this.f21223 && (this.f21233 || this.f21224)) {
            drawable = drawable.mutate();
            if (this.f21233) {
                drawable.setTintList(this.f21235);
            }
            if (this.f21224) {
                drawable.setTintMode(this.f21234);
            }
            this.f21223 = false;
        }
        return drawable;
    }

    @Override // p163.InterfaceMenuItemC7660
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ActionProviderVisibilityListenerC7791 mo12894() {
        return this.f21222;
    }

    @Override // p163.InterfaceMenuItemC7660
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceMenuItemC7660 mo12895(ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791) {
        this.f21221 = null;
        this.f21222 = actionProviderVisibilityListenerC7791;
        this.f21228.m13136(true);
        ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC77912 = this.f21222;
        if (actionProviderVisibilityListenerC77912 != null) {
            actionProviderVisibilityListenerC77912.f21202 = new C5851(this, 22);
            actionProviderVisibilityListenerC77912.f21201.setVisibilityListener(actionProviderVisibilityListenerC77912);
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
        this.f21229 = 0;
        this.f21230 = drawable;
        this.f21223 = true;
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f21228.f21272.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f21241 == c) {
            return this;
        }
        this.f21241 = c;
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f21241 = c;
        this.f21232 = Character.toLowerCase(c2);
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f21232 == c) {
            return this;
        }
        this.f21232 = Character.toLowerCase(c);
        this.f21228.m13136(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f21221 = view;
        this.f21222 = null;
        if (view != null && view.getId() == -1 && (i = this.f21247) > 0) {
            view.setId(i);
        }
        MenuC7801 menuC7801 = this.f21228;
        menuC7801.f21256 = true;
        menuC7801.m13136(true);
        return this;
    }
}
