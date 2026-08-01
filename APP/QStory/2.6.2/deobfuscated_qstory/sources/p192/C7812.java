package p192;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p007.AbstractC6136;
import p163.InterfaceMenuItemC7660;
import p190.ActionProviderVisibilityListenerC7791;
import p190.C7799;
import p190.MenuItemC7792;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7812 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f21297;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public CharSequence f21298;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC7791 f21299;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f21300;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7816 f21301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Menu f21307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f21308;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f21310;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f21311;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f21312;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f21313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public char f21314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f21315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f21318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char f21319;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public CharSequence f21322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public CharSequence f21323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21325;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ColorStateList f21296 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f21295 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21306 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21305 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21304 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21303 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f21302 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f21321 = true;

    public C7812(C7816 c7816, Menu menu) {
        this.f21301 = c7816;
        this.f21307 = menu;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13145(MenuItem menuItem) {
        C7816 c7816 = this.f21301;
        Context context = c7816.f21332;
        boolean z = false;
        menuItem.setChecked(this.f21309).setVisible(this.f21308).setEnabled(this.f21312).setCheckable(this.f21317 >= 1).setTitleCondensed(this.f21323).setIcon(this.f21315);
        int i = this.f21313;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f21300 != null) {
            if (context.isRestricted()) {
                C5919.m11250("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (c7816.f21331 == null) {
                c7816.f21331 = C7816.m13150(context);
            }
            Object obj = c7816.f21331;
            String str = this.f21300;
            MenuItemOnMenuItemClickListenerC7813 menuItemOnMenuItemClickListenerC7813 = new MenuItemOnMenuItemClickListenerC7813();
            menuItemOnMenuItemClickListenerC7813.f21328 = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC7813.f21327 = cls.getMethod(str, MenuItemOnMenuItemClickListenerC7813.f21326);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC7813);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(AbstractC6136.m11549(cls, AbstractC6136.m11550("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f21317 >= 2) {
            if (menuItem instanceof C7799) {
                C7799 c7799 = (C7799) menuItem;
                c7799.f21226 = (c7799.f21226 & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC7792) {
                MenuItemC7792 menuItemC7792 = (MenuItemC7792) menuItem;
                InterfaceMenuItemC7660 interfaceMenuItemC7660 = menuItemC7792.f21204;
                try {
                    if (menuItemC7792.f21203 == null) {
                        menuItemC7792.f21203 = interfaceMenuItemC7660.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC7792.f21203.invoke(interfaceMenuItemC7660, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f21311;
        if (str2 != null) {
            menuItem.setActionView((View) m13146(str2, C7816.f21330, c7816.f21334));
            z = true;
        }
        int i2 = this.f21310;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791 = this.f21299;
        if (actionProviderVisibilityListenerC7791 != null) {
            if (menuItem instanceof InterfaceMenuItemC7660) {
                ((InterfaceMenuItemC7660) menuItem).mo12895(actionProviderVisibilityListenerC7791);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f21298;
        boolean z2 = menuItem instanceof InterfaceMenuItemC7660;
        if (z2) {
            ((InterfaceMenuItemC7660) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f21297;
        if (z2) {
            ((InterfaceMenuItemC7660) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f21314;
        int i3 = this.f21318;
        if (z2) {
            ((InterfaceMenuItemC7660) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f21319;
        int i4 = this.f21316;
        if (z2) {
            ((InterfaceMenuItemC7660) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f21295;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC7660) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f21296;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC7660) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13146(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f21301.f21332.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
