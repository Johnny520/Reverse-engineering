package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: Kz */
/* JADX INFO: loaded from: classes.dex */
public final class C0472Kz {

    /* JADX INFO: renamed from: A */
    public CharSequence f1532A;

    /* JADX INFO: renamed from: B */
    public CharSequence f1533B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0515Lz f1536E;

    /* JADX INFO: renamed from: a */
    public final Menu f1537a;

    /* JADX INFO: renamed from: h */
    public boolean f1544h;

    /* JADX INFO: renamed from: i */
    public int f1545i;

    /* JADX INFO: renamed from: j */
    public int f1546j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1547k;

    /* JADX INFO: renamed from: l */
    public CharSequence f1548l;

    /* JADX INFO: renamed from: m */
    public int f1549m;

    /* JADX INFO: renamed from: n */
    public char f1550n;

    /* JADX INFO: renamed from: o */
    public int f1551o;

    /* JADX INFO: renamed from: p */
    public char f1552p;

    /* JADX INFO: renamed from: q */
    public int f1553q;

    /* JADX INFO: renamed from: r */
    public int f1554r;

    /* JADX INFO: renamed from: s */
    public boolean f1555s;

    /* JADX INFO: renamed from: t */
    public boolean f1556t;

    /* JADX INFO: renamed from: u */
    public boolean f1557u;

    /* JADX INFO: renamed from: v */
    public int f1558v;

    /* JADX INFO: renamed from: w */
    public int f1559w;

    /* JADX INFO: renamed from: x */
    public String f1560x;

    /* JADX INFO: renamed from: y */
    public String f1561y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC2470rr f1562z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f1534C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f1535D = null;

    /* JADX INFO: renamed from: b */
    public int f1538b = 0;

    /* JADX INFO: renamed from: c */
    public int f1539c = 0;

    /* JADX INFO: renamed from: d */
    public int f1540d = 0;

    /* JADX INFO: renamed from: e */
    public int f1541e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f1542f = true;

    /* JADX INFO: renamed from: g */
    public boolean f1543g = true;

    public C0472Kz(C0515Lz c0515Lz, Menu menu) {
        this.f1536E = c0515Lz;
        this.f1537a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m921a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1536E.f1681c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m922b(MenuItem menuItem) {
        C0515Lz c0515Lz = this.f1536E;
        Context context = c0515Lz.f1681c;
        boolean z = false;
        menuItem.setChecked(this.f1555s).setVisible(this.f1556t).setEnabled(this.f1557u).setCheckable(this.f1554r >= 1).setTitleCondensed(this.f1548l).setIcon(this.f1549m);
        int i = this.f1558v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f1561y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0515Lz.f1682d == null) {
                c0515Lz.f1682d = C0515Lz.m998a(context);
            }
            Object obj = c0515Lz.f1682d;
            String str = this.f1561y;
            MenuItemOnMenuItemClickListenerC0429Jz menuItemOnMenuItemClickListenerC0429Jz = new MenuItemOnMenuItemClickListenerC0429Jz();
            menuItemOnMenuItemClickListenerC0429Jz.f1413b = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0429Jz.f1414c = cls.getMethod(str, MenuItemOnMenuItemClickListenerC0429Jz.f1411d);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0429Jz);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f1554r >= 2) {
            if (menuItem instanceof C2427qr) {
                C2427qr c2427qr = (C2427qr) menuItem;
                c2427qr.f8515x = (c2427qr.f8515x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC2599ur) {
                MenuItemC2599ur menuItemC2599ur = (MenuItemC2599ur) menuItem;
                InterfaceMenuItemC0558Mz interfaceMenuItemC0558Mz = menuItemC2599ur.f8974c;
                try {
                    if (menuItemC2599ur.f8975d == null) {
                        menuItemC2599ur.f8975d = interfaceMenuItemC0558Mz.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC2599ur.f8975d.invoke(interfaceMenuItemC0558Mz, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.f1560x;
        if (str2 != null) {
            menuItem.setActionView((View) m921a(str2, C0515Lz.f1677e, c0515Lz.f1679a));
            z = true;
        }
        int i2 = this.f1559w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr = this.f1562z;
        if (actionProviderVisibilityListenerC2470rr != null && (menuItem instanceof InterfaceMenuItemC0558Mz)) {
            ((InterfaceMenuItemC0558Mz) menuItem).mo1101a(actionProviderVisibilityListenerC2470rr);
        }
        CharSequence charSequence = this.f1532A;
        boolean z2 = menuItem instanceof InterfaceMenuItemC0558Mz;
        if (z2) {
            ((InterfaceMenuItemC0558Mz) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1533B;
        if (z2) {
            ((InterfaceMenuItemC0558Mz) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f1550n;
        int i3 = this.f1551o;
        if (z2) {
            ((InterfaceMenuItemC0558Mz) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f1552p;
        int i4 = this.f1553q;
        if (z2) {
            ((InterfaceMenuItemC0558Mz) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f1535D;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC0558Mz) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f1534C;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC0558Mz) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
