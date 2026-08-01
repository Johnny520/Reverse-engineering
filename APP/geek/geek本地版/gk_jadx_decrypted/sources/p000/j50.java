package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class j50 {

    /* JADX INFO: renamed from: A */
    public CharSequence f2554A;

    /* JADX INFO: renamed from: B */
    public CharSequence f2555B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ k50 f2558E;

    /* JADX INFO: renamed from: a */
    public final Menu f2559a;

    /* JADX INFO: renamed from: h */
    public boolean f2566h;

    /* JADX INFO: renamed from: i */
    public int f2567i;

    /* JADX INFO: renamed from: j */
    public int f2568j;

    /* JADX INFO: renamed from: k */
    public CharSequence f2569k;

    /* JADX INFO: renamed from: l */
    public CharSequence f2570l;

    /* JADX INFO: renamed from: m */
    public int f2571m;

    /* JADX INFO: renamed from: n */
    public char f2572n;

    /* JADX INFO: renamed from: o */
    public int f2573o;

    /* JADX INFO: renamed from: p */
    public char f2574p;

    /* JADX INFO: renamed from: q */
    public int f2575q;

    /* JADX INFO: renamed from: r */
    public int f2576r;

    /* JADX INFO: renamed from: s */
    public boolean f2577s;

    /* JADX INFO: renamed from: t */
    public boolean f2578t;

    /* JADX INFO: renamed from: u */
    public boolean f2579u;

    /* JADX INFO: renamed from: v */
    public int f2580v;

    /* JADX INFO: renamed from: w */
    public int f2581w;

    /* JADX INFO: renamed from: x */
    public String f2582x;

    /* JADX INFO: renamed from: y */
    public String f2583y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC0610pu f2584z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f2556C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f2557D = null;

    /* JADX INFO: renamed from: b */
    public int f2560b = 0;

    /* JADX INFO: renamed from: c */
    public int f2561c = 0;

    /* JADX INFO: renamed from: d */
    public int f2562d = 0;

    /* JADX INFO: renamed from: e */
    public int f2563e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f2564f = true;

    /* JADX INFO: renamed from: g */
    public boolean f2565g = true;

    public j50(k50 k50Var, Menu menu) {
        this.f2558E = k50Var;
        this.f2559a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1548a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2558E.f2701c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1549b(MenuItem menuItem) {
        k50 k50Var = this.f2558E;
        Context context = k50Var.f2701c;
        boolean z = false;
        menuItem.setChecked(this.f2577s).setVisible(this.f2578t).setEnabled(this.f2579u).setCheckable(this.f2576r >= 1).setTitleCondensed(this.f2570l).setIcon(this.f2571m);
        int i = this.f2580v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f2583y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (k50Var.f2702d == null) {
                k50Var.f2702d = k50.m1623a(context);
            }
            Object obj = k50Var.f2702d;
            String str = this.f2583y;
            i50 i50Var = new i50();
            i50Var.f2356b = obj;
            Class<?> cls = obj.getClass();
            try {
                i50Var.f2357c = cls.getMethod(str, i50.f2354d);
                menuItem.setOnMenuItemClickListener(i50Var);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f2576r >= 2) {
            if (menuItem instanceof C0572ou) {
                C0572ou c0572ou = (C0572ou) menuItem;
                c0572ou.f3609x = (c0572ou.f3609x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0721su) {
                MenuItemC0721su menuItemC0721su = (MenuItemC0721su) menuItem;
                l50 l50Var = menuItemC0721su.f4458c;
                try {
                    if (menuItemC0721su.f4459d == null) {
                        menuItemC0721su.f4459d = l50Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0721su.f4459d.invoke(l50Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f2582x;
        if (str2 != null) {
            menuItem.setActionView((View) m1548a(str2, k50.f2697e, k50Var.f2699a));
            z = true;
        }
        int i2 = this.f2581w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu = this.f2584z;
        if (actionProviderVisibilityListenerC0610pu != null) {
            if (menuItem instanceof l50) {
                ((l50) menuItem).mo622a(actionProviderVisibilityListenerC0610pu);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2554A;
        boolean z2 = menuItem instanceof l50;
        if (z2) {
            ((l50) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0498mu.m1869h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2555B;
        if (z2) {
            ((l50) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0498mu.m1874m(menuItem, charSequence2);
        }
        char c = this.f2572n;
        int i3 = this.f2573o;
        if (z2) {
            ((l50) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            AbstractC0498mu.m1868g(menuItem, c, i3);
        }
        char c2 = this.f2574p;
        int i4 = this.f2575q;
        if (z2) {
            ((l50) menuItem).setNumericShortcut(c2, i4);
        } else {
            AbstractC0498mu.m1872k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f2557D;
        if (mode != null) {
            if (z2) {
                ((l50) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0498mu.m1871j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2556C;
        if (colorStateList != null) {
            if (z2) {
                ((l50) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0498mu.m1870i(menuItem, colorStateList);
            }
        }
    }
}
