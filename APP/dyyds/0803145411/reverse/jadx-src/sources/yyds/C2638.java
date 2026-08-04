package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᲈᛳᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2638 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public char f12985;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f12986;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f12987;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public CharSequence f12988;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f12989;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public String f12991;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Menu f12992;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean f12993;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f12994;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f12995;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC2022 f12997;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public int f12998;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public int f12999;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public int f13001;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f13002;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public CharSequence f13003;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public CharSequence f13004;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public CharSequence f13005;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f13006;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final /* synthetic */ C1623 f13008;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f13009;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public char f13011;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public String f13014;

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public ColorStateList f12984 = null;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public PorterDuff.Mode f13007 = null;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f12996 = 0;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f13010 = 0;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f13013 = 0;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f12990 = 0;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f13012 = true;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f13000 = true;

    public C2638(C1623 c1623, Menu menu) {
        this.f13008 = c1623;
        this.f12992 = menu;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m4743(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f13008.f8263.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4744(MenuItem menuItem) {
        C1623 c1623 = this.f13008;
        Context context = c1623.f8263;
        boolean z = false;
        menuItem.setChecked(this.f13009).setVisible(this.f12993).setEnabled(this.f13002).setCheckable(this.f12995 >= 1).setTitleCondensed(this.f13004).setIcon(this.f12987);
        int i = this.f13001;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f13014 != null) {
            if (context.isRestricted()) {
                C0188.m800("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objM3318 = c1623.f8264;
            if (objM3318 == null) {
                objM3318 = C1623.m3318(context);
                c1623.f8264 = objM3318;
            }
            String str = this.f13014;
            MenuItemOnMenuItemClickListenerC0608 menuItemOnMenuItemClickListenerC0608 = new MenuItemOnMenuItemClickListenerC0608();
            menuItemOnMenuItemClickListenerC0608.f2962 = objM3318;
            Class<?> cls = objM3318.getClass();
            try {
                menuItemOnMenuItemClickListenerC0608.f2963 = cls.getMethod(str, MenuItemOnMenuItemClickListenerC0608.f2960);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0608);
            } catch (Exception e) {
                StringBuilder sbM3998 = AbstractC2104.m3998("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM3998.append(cls.getName());
                InflateException inflateException = new InflateException(sbM3998.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f12995 >= 2) {
            if (menuItem instanceof C1148) {
                C1148 c1148 = (C1148) menuItem;
                c1148.f5262 = (c1148.f5262 & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1806) {
                MenuItemC1806 menuItemC1806 = (MenuItemC1806) menuItem;
                InterfaceMenuItemC0339 interfaceMenuItemC0339 = menuItemC1806.f9078;
                try {
                    Method declaredMethod = menuItemC1806.f9079;
                    if (declaredMethod == null) {
                        declaredMethod = interfaceMenuItemC0339.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        menuItemC1806.f9079 = declaredMethod;
                    }
                    declaredMethod.invoke(interfaceMenuItemC0339, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f12991;
        if (str2 != null) {
            menuItem.setActionView((View) m4743(str2, C1623.f8259, c1623.f8261));
            z = true;
        }
        int i2 = this.f12998;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022 = this.f12997;
        if (actionProviderVisibilityListenerC2022 != null) {
            if (menuItem instanceof InterfaceMenuItemC0339) {
                ((InterfaceMenuItemC0339) menuItem).mo1025(actionProviderVisibilityListenerC2022);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f12988;
        boolean z2 = menuItem instanceof InterfaceMenuItemC0339;
        if (z2) {
            ((InterfaceMenuItemC0339) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f13005;
        if (z2) {
            ((InterfaceMenuItemC0339) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f12985;
        int i3 = this.f12994;
        if (z2) {
            ((InterfaceMenuItemC0339) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f13011;
        int i4 = this.f12999;
        if (z2) {
            ((InterfaceMenuItemC0339) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f13007;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC0339) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f12984;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC0339) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
