package androidx.appcompat.view.menu;

import Yue.AbstractC3087;
import Yue.C3323;
import Yue.C4520;
import Yue.C6898;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceMenuItemC7684;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC8700;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C8697 implements InterfaceMenuItemC7684 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String f26033 = "MenuItemImpl";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f26034 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f26035 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int f26036 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f26037 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int f26038 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f26039 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f26040 = 32;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f26041 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int f26042;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int f26043;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int f26044;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int f26045;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public CharSequence f26046;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public CharSequence f26047;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Intent f26048;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public char f26049;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public char f26051;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Drawable f26053;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C8694 f26055;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public SubMenuC8702 f26056;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Runnable f26057;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f26058;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public CharSequence f26059;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public CharSequence f26060;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int f26067;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public View f26068;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public AbstractC3087 f26069;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f26070;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public ContextMenu.ContextMenuInfo f26072;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f26050 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f26052 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f26054 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public ColorStateList f26061 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public PorterDuff.Mode f26062 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f26063 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f26064 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f26065 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f26066 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f26071 = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۢ$ۥ */
    public class C1605 implements AbstractC3087.InterfaceC0046 {
        public C1605() {
        }

        @Override // Yue.AbstractC3087.InterfaceC0046
        public void onActionProviderVisibilityChanged(boolean z) {
            C8697 c8697 = C8697.this;
            c8697.f26055.onItemVisibleChanged(c8697);
        }
    }

    public C8697(C8694 c8694, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f26055 = c8694;
        this.f26042 = i2;
        this.f26043 = i;
        this.f26044 = i3;
        this.f26045 = i4;
        this.f26046 = charSequence;
        this.f26067 = i5;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m29026(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f26067 & 8) == 0) {
            return false;
        }
        if (this.f26068 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f26070;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f26055.collapseItemActionView(this);
        }
        return false;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public boolean expandActionView() {
        if (!m29034()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f26070;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f26055.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public View getActionView() {
        View view = this.f26068;
        if (view != null) {
            return view;
        }
        AbstractC3087 abstractC3087 = this.f26069;
        if (abstractC3087 == null) {
            return null;
        }
        View viewMo6291 = abstractC3087.mo6291(this);
        this.f26068 = viewMo6291;
        return viewMo6291;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f26052;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f26051;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f26059;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f26043;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f26053;
        if (drawable != null) {
            return m29028(drawable);
        }
        if (this.f26054 == 0) {
            return null;
        }
        Drawable drawableM396 = C3323.m396(this.f26055.getContext(), this.f26054);
        this.f26054 = 0;
        this.f26053 = drawableM396;
        return m29028(drawableM396);
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f26061;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f26062;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f26048;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f26042;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f26072;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f26050;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f26049;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f26044;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f26056;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f26046;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f26047;
        return charSequence != null ? charSequence : this.f26046;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f26060;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f26056 != null;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f26071;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f26066 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f26066 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f26066 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC3087 abstractC3087 = this.f26069;
        return (abstractC3087 == null || !abstractC3087.mo6294()) ? (this.f26066 & 8) == 0 : (this.f26066 & 8) == 0 && this.f26069.mo6289();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f26051 == c) {
            return this;
        }
        this.f26051 = Character.toLowerCase(c);
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f26066;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f26066 = i2;
        if (i != i2) {
            this.f26055.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f26066 & 4) != 0) {
            this.f26055.setExclusiveItemChecked(this);
        } else {
            m29043(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f26066 |= 16;
        } else {
            this.f26066 &= -17;
        }
        this.f26055.onItemsChanged(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f26054 = 0;
        this.f26053 = drawable;
        this.f26065 = true;
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.f26061 = colorStateList;
        this.f26063 = true;
        this.f26065 = true;
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f26062 = mode;
        this.f26064 = true;
        this.f26065 = true;
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f26048 = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f26049 == c) {
            return this;
        }
        this.f26049 = c;
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f26070 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f26058 = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f26049 = c;
        this.f26051 = Character.toLowerCase(c2);
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f26067 = i;
        this.f26055.onItemActionRequestChanged(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f26046 = charSequence;
        this.f26055.onItemsChanged(false);
        SubMenuC8702 subMenuC8702 = this.f26056;
        if (subMenuC8702 != null) {
            subMenuC8702.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f26047 = charSequence;
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m29049(z)) {
            this.f26055.onItemVisibleChanged(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f26046;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // Yue.InterfaceMenuItemC7684
    /* JADX INFO: renamed from: ۥ */
    public AbstractC3087 mo172() {
        return this.f26069;
    }

    @Override // Yue.InterfaceMenuItemC7684
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo173() {
        return (mo6264() || m29038()) ? false : true;
    }

    @Override // Yue.InterfaceMenuItemC7684
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceMenuItemC7684 mo6263(AbstractC3087 abstractC3087) {
        AbstractC3087 abstractC30872 = this.f26069;
        if (abstractC30872 != null) {
            abstractC30872.m6296();
        }
        this.f26068 = null;
        this.f26069 = abstractC3087;
        this.f26055.onItemsChanged(true);
        AbstractC3087 abstractC30873 = this.f26069;
        if (abstractC30873 != null) {
            abstractC30873.mo6298(new C1605());
        }
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo6264() {
        return (this.f26067 & 2) == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29027() {
        this.f26055.onItemActionRequestChanged(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Drawable m29028(Drawable drawable) {
        if (drawable != null && this.f26065 && (this.f26063 || this.f26064)) {
            drawable = C4520.m13239(drawable).mutate();
            if (this.f26063) {
                C4520.m13236(drawable, this.f26061);
            }
            if (this.f26064) {
                C4520.m13237(drawable, this.f26062);
            }
            this.f26065 = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Runnable m29029() {
        return this.f26057;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m29030() {
        return this.f26045;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public char m29031() {
        return this.f26055.isQwertyMode() ? this.f26051 : this.f26049;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String m29032() {
        char cM29031 = m29031();
        if (cM29031 == 0) {
            return "";
        }
        Resources resources = this.f26055.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f26055.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C6898.C6907.f19015));
        }
        int i = this.f26055.isQwertyMode() ? this.f26052 : this.f26050;
        m29026(sb, i, 65536, resources.getString(C6898.C6907.f19011));
        m29026(sb, i, 4096, resources.getString(C6898.C6907.f19007));
        m29026(sb, i, 2, resources.getString(C6898.C6907.f19006));
        m29026(sb, i, 1, resources.getString(C6898.C6907.f19012));
        m29026(sb, i, 4, resources.getString(C6898.C6907.f19014));
        m29026(sb, i, 8, resources.getString(C6898.C6907.f19010));
        if (cM29031 == '\b') {
            sb.append(resources.getString(C6898.C6907.f19008));
        } else if (cM29031 == '\n') {
            sb.append(resources.getString(C6898.C6907.f19009));
        } else if (cM29031 != ' ') {
            sb.append(cM29031);
        } else {
            sb.append(resources.getString(C6898.C6907.f19013));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public CharSequence m29033(InterfaceC8700.InterfaceC1608 interfaceC1608) {
        return (interfaceC1608 == null || !interfaceC1608.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m29034() {
        AbstractC3087 abstractC3087;
        if ((this.f26067 & 8) == 0) {
            return false;
        }
        if (this.f26068 == null && (abstractC3087 = this.f26069) != null) {
            this.f26068 = abstractC3087.mo6291(this);
        }
        return this.f26068 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m29035() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f26058;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C8694 c8694 = this.f26055;
        if (c8694.dispatchMenuItemSelected(c8694, this)) {
            return true;
        }
        Runnable runnable = this.f26057;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f26048 != null) {
            try {
                this.f26055.getContext().startActivity(this.f26048);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e(f26033, "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC3087 abstractC3087 = this.f26069;
        return abstractC3087 != null && abstractC3087.mo6292();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m29036() {
        return (this.f26066 & 32) == 32;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m29037() {
        return (this.f26066 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m29038() {
        return (this.f26067 & 1) == 1;
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(I)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceMenuItemC7684 setActionView(int i) {
        Context context = this.f26055.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(Landroid/view/View;)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceMenuItemC7684 setActionView(View view) {
        int i;
        this.f26068 = view;
        this.f26069 = null;
        if (view != null && view.getId() == -1 && (i = this.f26042) > 0) {
            view.setId(i);
        }
        this.f26055.onItemActionRequestChanged(this);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29041(boolean z) {
        this.f26071 = z;
        this.f26055.onItemsChanged(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public MenuItem m29042(Runnable runnable) {
        this.f26057 = runnable;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m29043(boolean z) {
        int i = this.f26066;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f26066 = i2;
        if (i != i2) {
            this.f26055.onItemsChanged(false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m29044(boolean z) {
        this.f26066 = (z ? 4 : 0) | (this.f26066 & (-5));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m29045(boolean z) {
        if (z) {
            this.f26066 |= 32;
        } else {
            this.f26066 &= -33;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m29046(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f26072 = contextMenuInfo;
    }

    /* JADX DEBUG: Method merged with bridge method: setShowAsActionFlags(I)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceMenuItemC7684 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m29048(SubMenuC8702 subMenuC8702) {
        this.f26056 = subMenuC8702;
        subMenuC8702.setHeaderTitle(getTitle());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m29049(boolean z) {
        int i = this.f26066;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f26066 = i2;
        return i != i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m29050() {
        return this.f26055.getOptionalIconsVisible();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m29051() {
        return this.f26055.isShortcutsVisible() && m29031() != 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m29052() {
        return (this.f26067 & 4) == 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public InterfaceMenuItemC7684 setContentDescription(CharSequence charSequence) {
        this.f26059 = charSequence;
        this.f26055.onItemsChanged(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public InterfaceMenuItemC7684 setTooltipText(CharSequence charSequence) {
        this.f26060 = charSequence;
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f26051 == c && this.f26052 == i) {
            return this;
        }
        this.f26051 = Character.toLowerCase(c);
        this.f26052 = KeyEvent.normalizeMetaState(i);
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f26049 == c && this.f26050 == i) {
            return this;
        }
        this.f26049 = c;
        this.f26050 = KeyEvent.normalizeMetaState(i);
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f26049 = c;
        this.f26050 = KeyEvent.normalizeMetaState(i);
        this.f26051 = Character.toLowerCase(c2);
        this.f26052 = KeyEvent.normalizeMetaState(i2);
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f26053 = null;
        this.f26054 = i;
        this.f26065 = true;
        this.f26055.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f26055.getContext().getString(i));
    }
}
