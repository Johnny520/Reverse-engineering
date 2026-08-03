package p053e;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p006D.AbstractC0111l;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0765c {

    /* JADX INFO: renamed from: A */
    public CharSequence f2683A;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C0766d f2686D;

    /* JADX INFO: renamed from: a */
    public final Menu f2687a;

    /* JADX INFO: renamed from: h */
    public boolean f2694h;

    /* JADX INFO: renamed from: i */
    public int f2695i;

    /* JADX INFO: renamed from: j */
    public int f2696j;

    /* JADX INFO: renamed from: k */
    public CharSequence f2697k;

    /* JADX INFO: renamed from: l */
    public CharSequence f2698l;

    /* JADX INFO: renamed from: m */
    public int f2699m;

    /* JADX INFO: renamed from: n */
    public char f2700n;

    /* JADX INFO: renamed from: o */
    public int f2701o;

    /* JADX INFO: renamed from: p */
    public char f2702p;

    /* JADX INFO: renamed from: q */
    public int f2703q;

    /* JADX INFO: renamed from: r */
    public int f2704r;

    /* JADX INFO: renamed from: s */
    public boolean f2705s;

    /* JADX INFO: renamed from: t */
    public boolean f2706t;

    /* JADX INFO: renamed from: u */
    public boolean f2707u;

    /* JADX INFO: renamed from: v */
    public int f2708v;

    /* JADX INFO: renamed from: w */
    public int f2709w;

    /* JADX INFO: renamed from: x */
    public String f2710x;

    /* JADX INFO: renamed from: y */
    public String f2711y;

    /* JADX INFO: renamed from: z */
    public CharSequence f2712z;

    /* JADX INFO: renamed from: B */
    public ColorStateList f2684B = null;

    /* JADX INFO: renamed from: C */
    public PorterDuff.Mode f2685C = null;

    /* JADX INFO: renamed from: b */
    public int f2688b = 0;

    /* JADX INFO: renamed from: c */
    public int f2689c = 0;

    /* JADX INFO: renamed from: d */
    public int f2690d = 0;

    /* JADX INFO: renamed from: e */
    public int f2691e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f2692f = true;

    /* JADX INFO: renamed from: g */
    public boolean f2693g = true;

    public C0765c(C0766d c0766d, Menu menu) {
        this.f2686D = c0766d;
        this.f2687a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1957a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2686D.f2717c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1958b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2705s).setVisible(this.f2706t).setEnabled(this.f2707u).setCheckable(this.f2704r >= 1).setTitleCondensed(this.f2698l).setIcon(this.f2699m);
        int i2 = this.f2708v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f2711y;
        C0766d c0766d = this.f2686D;
        if (str != null) {
            if (c0766d.f2717c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0766d.f2718d == null) {
                c0766d.f2718d = C0766d.m1959a(c0766d.f2717c);
            }
            Object obj = c0766d.f2718d;
            String str2 = this.f2711y;
            MenuItemOnMenuItemClickListenerC0764b menuItemOnMenuItemClickListenerC0764b = new MenuItemOnMenuItemClickListenerC0764b();
            menuItemOnMenuItemClickListenerC0764b.f2681a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0764b.f2682b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0764b.f2680c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0764b);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2704r >= 2 && (menuItem instanceof MenuItemC0780k)) {
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) menuItem;
            menuItemC0780k.f2830x = (menuItemC0780k.f2830x & (-5)) | 4;
        }
        String str3 = this.f2710x;
        if (str3 != null) {
            menuItem.setActionView((View) m1957a(str3, C0766d.f2713e, c0766d.f2715a));
            z2 = true;
        }
        int i3 = this.f2709w;
        if (i3 > 0 && !z2) {
            menuItem.setActionView(i3);
        }
        CharSequence charSequence = this.f2712z;
        boolean z3 = menuItem instanceof MenuItemC0780k;
        if (z3) {
            ((MenuItemC0780k) menuItem).m2018e(charSequence);
        } else {
            AbstractC0111l.m401h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2683A;
        if (z3) {
            ((MenuItemC0780k) menuItem).m2020g(charSequence2);
        } else {
            AbstractC0111l.m406m(menuItem, charSequence2);
        }
        char c = this.f2700n;
        int i4 = this.f2701o;
        if (z3) {
            ((MenuItemC0780k) menuItem).setAlphabeticShortcut(c, i4);
        } else {
            AbstractC0111l.m400g(menuItem, c, i4);
        }
        char c2 = this.f2702p;
        int i5 = this.f2703q;
        if (z3) {
            ((MenuItemC0780k) menuItem).setNumericShortcut(c2, i5);
        } else {
            AbstractC0111l.m404k(menuItem, c2, i5);
        }
        PorterDuff.Mode mode = this.f2685C;
        if (mode != null) {
            if (z3) {
                ((MenuItemC0780k) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0111l.m403j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2684B;
        if (colorStateList != null) {
            if (z3) {
                ((MenuItemC0780k) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0111l.m402i(menuItem, colorStateList);
            }
        }
    }
}
