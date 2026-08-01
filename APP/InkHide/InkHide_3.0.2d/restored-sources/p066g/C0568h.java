package p066g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p022L.AbstractC0174d;
import p068h.ActionProviderVisibilityListenerC0597p;
import p068h.C0596o;
import p068h.MenuItemC0601t;
import p089t.InterfaceMenuItemC1005a;
import p099y.AbstractC1079k;

/* JADX INFO: renamed from: g.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0568h {

    /* JADX INFO: renamed from: A */
    public CharSequence f1893A;

    /* JADX INFO: renamed from: B */
    public CharSequence f1894B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0569i f1897E;

    /* JADX INFO: renamed from: a */
    public final Menu f1898a;

    /* JADX INFO: renamed from: h */
    public boolean f1905h;

    /* JADX INFO: renamed from: i */
    public int f1906i;

    /* JADX INFO: renamed from: j */
    public int f1907j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1908k;

    /* JADX INFO: renamed from: l */
    public CharSequence f1909l;

    /* JADX INFO: renamed from: m */
    public int f1910m;

    /* JADX INFO: renamed from: n */
    public char f1911n;

    /* JADX INFO: renamed from: o */
    public int f1912o;

    /* JADX INFO: renamed from: p */
    public char f1913p;

    /* JADX INFO: renamed from: q */
    public int f1914q;

    /* JADX INFO: renamed from: r */
    public int f1915r;

    /* JADX INFO: renamed from: s */
    public boolean f1916s;

    /* JADX INFO: renamed from: t */
    public boolean f1917t;

    /* JADX INFO: renamed from: u */
    public boolean f1918u;

    /* JADX INFO: renamed from: v */
    public int f1919v;

    /* JADX INFO: renamed from: w */
    public int f1920w;

    /* JADX INFO: renamed from: x */
    public String f1921x;

    /* JADX INFO: renamed from: y */
    public String f1922y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC0597p f1923z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f1895C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f1896D = null;

    /* JADX INFO: renamed from: b */
    public int f1899b = 0;

    /* JADX INFO: renamed from: c */
    public int f1900c = 0;

    /* JADX INFO: renamed from: d */
    public int f1901d = 0;

    /* JADX INFO: renamed from: e */
    public int f1902e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f1903f = true;

    /* JADX INFO: renamed from: g */
    public boolean f1904g = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0568h(C0569i c0569i, Menu menu) {
        this.f1897E = c0569i;
        this.f1898a = menu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m1133a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1897E.f1928c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1134b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f1916s).setVisible(this.f1917t).setEnabled(this.f1918u).setCheckable(this.f1915r >= 1).setTitleCondensed(this.f1909l).setIcon(this.f1910m);
        int i2 = this.f1919v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f1922y;
        C0569i c0569i = this.f1897E;
        if (str != null) {
            if (c0569i.f1928c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0569i.f1929d == null) {
                c0569i.f1929d = C0569i.m1135a(c0569i.f1928c);
            }
            Object obj = c0569i.f1929d;
            String str2 = this.f1922y;
            MenuItemOnMenuItemClickListenerC0567g menuItemOnMenuItemClickListenerC0567g = new MenuItemOnMenuItemClickListenerC0567g();
            menuItemOnMenuItemClickListenerC0567g.f1891a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0567g.f1892b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0567g.f1890c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0567g);
            } catch (Exception e2) {
                StringBuilder sbM357m = AbstractC0174d.m357m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbM357m.append(cls.getName());
                InflateException inflateException = new InflateException(sbM357m.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f1915r >= 2) {
            if (menuItem instanceof C0596o) {
                C0596o c0596o = (C0596o) menuItem;
                c0596o.f2083x = (c0596o.f2083x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0601t) {
                MenuItemC0601t menuItemC0601t = (MenuItemC0601t) menuItem;
                try {
                    Method method = menuItemC0601t.f2095d;
                    InterfaceMenuItemC1005a interfaceMenuItemC1005a = menuItemC0601t.f2094c;
                    if (method == null) {
                        menuItemC0601t.f2095d = interfaceMenuItemC1005a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0601t.f2095d.invoke(interfaceMenuItemC1005a, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f1921x;
        if (str3 != null) {
            menuItem.setActionView((View) m1133a(str3, C0569i.f1924e, c0569i.f1926a));
            z2 = true;
        }
        int i3 = this.f1920w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p = this.f1923z;
        if (actionProviderVisibilityListenerC0597p != null) {
            if (menuItem instanceof InterfaceMenuItemC1005a) {
                ((InterfaceMenuItemC1005a) menuItem).mo1168a(actionProviderVisibilityListenerC0597p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f1893A;
        boolean z3 = menuItem instanceof InterfaceMenuItemC1005a;
        if (z3) {
            ((InterfaceMenuItemC1005a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1079k.m2351h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f1894B;
        if (z3) {
            ((InterfaceMenuItemC1005a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1079k.m2356m(menuItem, charSequence2);
        }
        char c2 = this.f1911n;
        int i4 = this.f1912o;
        if (z3) {
            ((InterfaceMenuItemC1005a) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1079k.m2350g(menuItem, c2, i4);
        }
        char c3 = this.f1913p;
        int i5 = this.f1914q;
        if (z3) {
            ((InterfaceMenuItemC1005a) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1079k.m2354k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f1896D;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC1005a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1079k.m2353j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1895C;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC1005a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1079k.m2352i(menuItem, colorStateList);
            }
        }
    }
}
