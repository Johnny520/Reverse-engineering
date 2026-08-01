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
import p009.AbstractC6183;
import p163.InterfaceMenuItemC7661;
import p190.ActionProviderVisibilityListenerC7792;
import p190.C7800;
import p190.MenuItemC7793;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7813 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f21294;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public CharSequence f21295;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC7792 f21296;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f21297;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7817 f21298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Menu f21304;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f21305;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21306;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f21307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f21308;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f21309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f21310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public char f21311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f21312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f21315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char f21316;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21317;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public CharSequence f21319;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public CharSequence f21320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21322;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ColorStateList f21293 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f21292 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21303 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21302 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21301 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21300 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f21299 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f21318 = true;

    public C7813(C7817 c7817, Menu menu) {
        this.f21298 = c7817;
        this.f21304 = menu;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13173(MenuItem menuItem) {
        C7817 c7817 = this.f21298;
        Context context = c7817.f21329;
        boolean z = false;
        menuItem.setChecked(this.f21306).setVisible(this.f21305).setEnabled(this.f21309).setCheckable(this.f21314 >= 1).setTitleCondensed(this.f21320).setIcon(this.f21312);
        int i = this.f21310;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f21297 != null) {
            if (context.isRestricted()) {
                C5925.m11311("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (c7817.f21328 == null) {
                c7817.f21328 = C7817.m13178(context);
            }
            Object obj = c7817.f21328;
            String str = this.f21297;
            MenuItemOnMenuItemClickListenerC7814 menuItemOnMenuItemClickListenerC7814 = new MenuItemOnMenuItemClickListenerC7814();
            menuItemOnMenuItemClickListenerC7814.f21325 = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC7814.f21324 = cls.getMethod(str, MenuItemOnMenuItemClickListenerC7814.f21323);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC7814);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(AbstractC6183.m11589(cls, AbstractC6183.m11585("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f21314 >= 2) {
            if (menuItem instanceof C7800) {
                C7800 c7800 = (C7800) menuItem;
                c7800.f21223 = (c7800.f21223 & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC7793) {
                MenuItemC7793 menuItemC7793 = (MenuItemC7793) menuItem;
                InterfaceMenuItemC7661 interfaceMenuItemC7661 = menuItemC7793.f21201;
                try {
                    if (menuItemC7793.f21200 == null) {
                        menuItemC7793.f21200 = interfaceMenuItemC7661.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC7793.f21200.invoke(interfaceMenuItemC7661, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f21308;
        if (str2 != null) {
            menuItem.setActionView((View) m13174(str2, C7817.f21327, c7817.f21331));
            z = true;
        }
        int i2 = this.f21307;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC7792 = this.f21296;
        if (actionProviderVisibilityListenerC7792 != null) {
            if (menuItem instanceof InterfaceMenuItemC7661) {
                ((InterfaceMenuItemC7661) menuItem).mo12924(actionProviderVisibilityListenerC7792);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f21295;
        boolean z2 = menuItem instanceof InterfaceMenuItemC7661;
        if (z2) {
            ((InterfaceMenuItemC7661) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f21294;
        if (z2) {
            ((InterfaceMenuItemC7661) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f21311;
        int i3 = this.f21315;
        if (z2) {
            ((InterfaceMenuItemC7661) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f21316;
        int i4 = this.f21313;
        if (z2) {
            ((InterfaceMenuItemC7661) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f21292;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC7661) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f21293;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC7661) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13174(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f21298.f21329.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
