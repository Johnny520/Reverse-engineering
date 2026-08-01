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
public final class q50 {

    /* JADX INFO: renamed from: A */
    public CharSequence f3808A;

    /* JADX INFO: renamed from: B */
    public CharSequence f3809B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ r50 f3812E;

    /* JADX INFO: renamed from: a */
    public final Menu f3813a;

    /* JADX INFO: renamed from: h */
    public boolean f3820h;

    /* JADX INFO: renamed from: i */
    public int f3821i;

    /* JADX INFO: renamed from: j */
    public int f3822j;

    /* JADX INFO: renamed from: k */
    public CharSequence f3823k;

    /* JADX INFO: renamed from: l */
    public CharSequence f3824l;

    /* JADX INFO: renamed from: m */
    public int f3825m;

    /* JADX INFO: renamed from: n */
    public char f3826n;

    /* JADX INFO: renamed from: o */
    public int f3827o;

    /* JADX INFO: renamed from: p */
    public char f3828p;

    /* JADX INFO: renamed from: q */
    public int f3829q;

    /* JADX INFO: renamed from: r */
    public int f3830r;

    /* JADX INFO: renamed from: s */
    public boolean f3831s;

    /* JADX INFO: renamed from: t */
    public boolean f3832t;

    /* JADX INFO: renamed from: u */
    public boolean f3833u;

    /* JADX INFO: renamed from: v */
    public int f3834v;

    /* JADX INFO: renamed from: w */
    public int f3835w;

    /* JADX INFO: renamed from: x */
    public String f3836x;

    /* JADX INFO: renamed from: y */
    public String f3837y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC0906xu f3838z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f3810C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f3811D = null;

    /* JADX INFO: renamed from: b */
    public int f3814b = 0;

    /* JADX INFO: renamed from: c */
    public int f3815c = 0;

    /* JADX INFO: renamed from: d */
    public int f3816d = 0;

    /* JADX INFO: renamed from: e */
    public int f3817e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f3818f = true;

    /* JADX INFO: renamed from: g */
    public boolean f3819g = true;

    public q50(r50 r50Var, Menu menu) {
        this.f3812E = r50Var;
        this.f3813a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2114a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3812E.f4071c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2115b(MenuItem menuItem) {
        r50 r50Var = this.f3812E;
        Context context = r50Var.f4071c;
        boolean z = false;
        menuItem.setChecked(this.f3831s).setVisible(this.f3832t).setEnabled(this.f3833u).setCheckable(this.f3830r >= 1).setTitleCondensed(this.f3824l).setIcon(this.f3825m);
        int i = this.f3834v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f3837y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (r50Var.f4072d == null) {
                r50Var.f4072d = r50.m2253a(context);
            }
            Object obj = r50Var.f4072d;
            String str = this.f3837y;
            p50 p50Var = new p50();
            p50Var.f3598b = obj;
            Class<?> cls = obj.getClass();
            try {
                p50Var.f3599c = cls.getMethod(str, p50.f3596d);
                menuItem.setOnMenuItemClickListener(p50Var);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f3830r >= 2) {
            if (menuItem instanceof C0869wu) {
                C0869wu c0869wu = (C0869wu) menuItem;
                c0869wu.f5135x = (c0869wu.f5135x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0045av) {
                MenuItemC0045av menuItemC0045av = (MenuItemC0045av) menuItem;
                s50 s50Var = menuItemC0045av.f636c;
                try {
                    if (menuItemC0045av.f637d == null) {
                        menuItemC0045av.f637d = s50Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0045av.f637d.invoke(s50Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f3836x;
        if (str2 != null) {
            menuItem.setActionView((View) m2114a(str2, r50.f4067e, r50Var.f4069a));
            z = true;
        }
        int i2 = this.f3835w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu = this.f3838z;
        if (actionProviderVisibilityListenerC0906xu != null) {
            if (menuItem instanceof s50) {
                ((s50) menuItem).mo581a(actionProviderVisibilityListenerC0906xu);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3808A;
        boolean z2 = menuItem instanceof s50;
        if (z2) {
            ((s50) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0794uu.m2491h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3809B;
        if (z2) {
            ((s50) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0794uu.m2496m(menuItem, charSequence2);
        }
        char c = this.f3826n;
        int i3 = this.f3827o;
        if (z2) {
            ((s50) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            AbstractC0794uu.m2490g(menuItem, c, i3);
        }
        char c2 = this.f3828p;
        int i4 = this.f3829q;
        if (z2) {
            ((s50) menuItem).setNumericShortcut(c2, i4);
        } else {
            AbstractC0794uu.m2494k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f3811D;
        if (mode != null) {
            if (z2) {
                ((s50) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0794uu.m2493j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3810C;
        if (colorStateList != null) {
            if (z2) {
                ((s50) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0794uu.m2492i(menuItem, colorStateList);
            }
        }
    }
}
