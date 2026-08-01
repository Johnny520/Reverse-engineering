package p208;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p025.AbstractC7012;
import p179.InterfaceMenuItemC8490;
import p206.ActionProviderVisibilityListenerC8621;
import p206.C8629;
import p206.MenuItemC8622;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8642 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f21639;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public CharSequence f21640;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC8621 f21641;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f21642;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8646 f21643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Menu f21649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f21650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21651;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f21652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f21653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f21654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f21655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public char f21656;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f21657;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f21660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char f21661;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21662;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public CharSequence f21664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public CharSequence f21665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21667;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ColorStateList f21638 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f21637 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21648 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21647 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21646 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21645 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f21644 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f21663 = true;

    public C8642(C8646 c8646, Menu menu) {
        this.f21643 = c8646;
        this.f21649 = menu;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13732(MenuItem menuItem) {
        C8646 c8646 = this.f21643;
        Context context = c8646.f21674;
        boolean z = false;
        menuItem.setChecked(this.f21651).setVisible(this.f21650).setEnabled(this.f21654).setCheckable(this.f21659 >= 1).setTitleCondensed(this.f21665).setIcon(this.f21657);
        int i = this.f21655;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f21642 != null) {
            if (context.isRestricted()) {
                C6755.m11870("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (c8646.f21673 == null) {
                c8646.f21673 = C8646.m13737(context);
            }
            Object obj = c8646.f21673;
            String str = this.f21642;
            MenuItemOnMenuItemClickListenerC8643 menuItemOnMenuItemClickListenerC8643 = new MenuItemOnMenuItemClickListenerC8643();
            menuItemOnMenuItemClickListenerC8643.f21670 = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC8643.f21669 = cls.getMethod(str, MenuItemOnMenuItemClickListenerC8643.f21668);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC8643);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(AbstractC7012.m12148(cls, AbstractC7012.m12144("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f21659 >= 2) {
            if (menuItem instanceof C8629) {
                C8629 c8629 = (C8629) menuItem;
                c8629.f21568 = (c8629.f21568 & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC8622) {
                MenuItemC8622 menuItemC8622 = (MenuItemC8622) menuItem;
                InterfaceMenuItemC8490 interfaceMenuItemC8490 = menuItemC8622.f21546;
                try {
                    if (menuItemC8622.f21545 == null) {
                        menuItemC8622.f21545 = interfaceMenuItemC8490.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC8622.f21545.invoke(interfaceMenuItemC8490, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f21653;
        if (str2 != null) {
            menuItem.setActionView((View) m13733(str2, C8646.f21672, c8646.f21676));
            z = true;
        }
        int i2 = this.f21652;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621 = this.f21641;
        if (actionProviderVisibilityListenerC8621 != null) {
            if (menuItem instanceof InterfaceMenuItemC8490) {
                ((InterfaceMenuItemC8490) menuItem).mo13483(actionProviderVisibilityListenerC8621);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f21640;
        boolean z2 = menuItem instanceof InterfaceMenuItemC8490;
        if (z2) {
            ((InterfaceMenuItemC8490) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f21639;
        if (z2) {
            ((InterfaceMenuItemC8490) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f21656;
        int i3 = this.f21660;
        if (z2) {
            ((InterfaceMenuItemC8490) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f21661;
        int i4 = this.f21658;
        if (z2) {
            ((InterfaceMenuItemC8490) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f21637;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC8490) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f21638;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC8490) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13733(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f21643.f21674.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
