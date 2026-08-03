package Yue;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6155 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1863 = "MenuItemCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    @Deprecated
    public static final int f1864 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f15058 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f15059 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f15060 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Deprecated
    public static final int f15061 = 8;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۣ$ۥ */
    public class MenuItemOnActionExpandListenerC0919 implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC6156 f1865;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public MenuItemOnActionExpandListenerC0919(InterfaceC6156 interfaceC6156) {
            this.f1865 = interfaceC6156;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1865.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1865.onMenuItemActionExpand(menuItem);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۣ$ۥ۟ */
    @InterfaceC7113(26)
    public static class C0920 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m2659(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static CharSequence m2660(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static ColorStateList m18988(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static PorterDuff.Mode m18989(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m18990(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static CharSequence m18991(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static MenuItem m18992(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static MenuItem m18993(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static MenuItem m18994(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static MenuItem m18995(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static MenuItem m18996(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static MenuItem m18997(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static MenuItem m18998(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۣ$ۥ۟۟, reason: contains not printable characters */
    @Deprecated
    public interface InterfaceC6156 {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static boolean m2657(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m2658(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static AbstractC3087 m18967(@InterfaceC6391 MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            return ((InterfaceMenuItemC7684) menuItem).mo172();
        }
        Log.w(f1863, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static View m18968(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m18969(@InterfaceC6391 MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC7684 ? ((InterfaceMenuItemC7684) menuItem).getAlphabeticModifiers() : C0920.m2659(menuItem);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static CharSequence m18970(@InterfaceC6391 MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC7684 ? ((InterfaceMenuItemC7684) menuItem).getContentDescription() : C0920.m2660(menuItem);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static ColorStateList m18971(@InterfaceC6391 MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC7684 ? ((InterfaceMenuItemC7684) menuItem).getIconTintList() : C0920.m18988(menuItem);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static PorterDuff.Mode m18972(@InterfaceC6391 MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC7684 ? ((InterfaceMenuItemC7684) menuItem).getIconTintMode() : C0920.m18989(menuItem);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m18973(@InterfaceC6391 MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC7684 ? ((InterfaceMenuItemC7684) menuItem).getNumericModifiers() : C0920.m18990(menuItem);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static CharSequence m18974(@InterfaceC6391 MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC7684 ? ((InterfaceMenuItemC7684) menuItem).getTooltipText() : C0920.m18991(menuItem);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m18975(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static MenuItem m18976(@InterfaceC6391 MenuItem menuItem, @InterfaceC6490 AbstractC3087 abstractC3087) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            return ((InterfaceMenuItemC7684) menuItem).mo6263(abstractC3087);
        }
        Log.w(f1863, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static MenuItem m18977(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static MenuItem m18978(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m18979(@InterfaceC6391 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            ((InterfaceMenuItemC7684) menuItem).setAlphabeticShortcut(c, i);
        } else {
            C0920.m18992(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m18980(@InterfaceC6391 MenuItem menuItem, @InterfaceC6490 CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            ((InterfaceMenuItemC7684) menuItem).setContentDescription(charSequence);
        } else {
            C0920.m18993(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m18981(@InterfaceC6391 MenuItem menuItem, @InterfaceC6490 ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            ((InterfaceMenuItemC7684) menuItem).setIconTintList(colorStateList);
        } else {
            C0920.m18994(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m18982(@InterfaceC6391 MenuItem menuItem, @InterfaceC6490 PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            ((InterfaceMenuItemC7684) menuItem).setIconTintMode(mode);
        } else {
            C0920.m18995(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m18983(@InterfaceC6391 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            ((InterfaceMenuItemC7684) menuItem).setNumericShortcut(c, i);
        } else {
            C0920.m18996(menuItem, c, i);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static MenuItem m18984(MenuItem menuItem, InterfaceC6156 interfaceC6156) {
        return menuItem.setOnActionExpandListener(new MenuItemOnActionExpandListenerC0919(interfaceC6156));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m18985(@InterfaceC6391 MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            ((InterfaceMenuItemC7684) menuItem).setShortcut(c, c2, i, i2);
        } else {
            C0920.m18997(menuItem, c, c2, i, i2);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m18986(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m18987(@InterfaceC6391 MenuItem menuItem, @InterfaceC6490 CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC7684) {
            ((InterfaceMenuItemC7684) menuItem).setTooltipText(charSequence);
        } else {
            C0920.m18998(menuItem, charSequence);
        }
    }
}
