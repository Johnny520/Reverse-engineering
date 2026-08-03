package p055f;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p006D.AbstractC0082T;
import p082t.AbstractC1080a;

/* JADX INFO: renamed from: f.j */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0779j implements Menu {

    /* JADX INFO: renamed from: u */
    public static final int[] f2784u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f2785a;

    /* JADX INFO: renamed from: b */
    public final Resources f2786b;

    /* JADX INFO: renamed from: c */
    public boolean f2787c;

    /* JADX INFO: renamed from: d */
    public final boolean f2788d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0777h f2789e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2790f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2791g;

    /* JADX INFO: renamed from: h */
    public boolean f2792h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2793i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2794j;

    /* JADX INFO: renamed from: k */
    public boolean f2795k;

    /* JADX INFO: renamed from: l */
    public CharSequence f2796l;

    /* JADX INFO: renamed from: s */
    public MenuItemC0780k f2803s;

    /* JADX INFO: renamed from: m */
    public boolean f2797m = false;

    /* JADX INFO: renamed from: n */
    public boolean f2798n = false;

    /* JADX INFO: renamed from: o */
    public boolean f2799o = false;

    /* JADX INFO: renamed from: p */
    public boolean f2800p = false;

    /* JADX INFO: renamed from: q */
    public final ArrayList f2801q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f2802r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t */
    public boolean f2804t = false;

    public MenuC0779j(Context context) {
        boolean zM296b;
        boolean z2 = false;
        this.f2785a = context;
        Resources resources = context.getResources();
        this.f2786b = resources;
        this.f2790f = new ArrayList();
        this.f2791g = new ArrayList();
        this.f2792h = true;
        this.f2793i = new ArrayList();
        this.f2794j = new ArrayList();
        this.f2795k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM296b = AbstractC0082T.m296b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM296b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM296b) {
                z2 = true;
            }
        }
        this.f2788d = z2;
    }

    /* JADX INFO: renamed from: a */
    public final MenuItemC0780k m1995a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2784u[i6] << 16) | (65535 & i4);
        MenuItemC0780k menuItemC0780k = new MenuItemC0780k(this, i2, i3, i4, i7, charSequence);
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((MenuItemC0780k) arrayList.get(size)).f2810d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, menuItemC0780k);
        m2009o(true);
        return menuItemC0780k;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1995a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2785a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC0780k menuItemC0780kM1995a = m1995a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            menuItemC0780kM1995a.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemC0780kM1995a.f2813g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = menuItemC0780kM1995a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m1996b(InterfaceC0785p interfaceC0785p, Context context) {
        this.f2802r.add(new WeakReference(interfaceC0785p));
        interfaceC0785p.mo2024h(context, this);
        this.f2795k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1997c(boolean z2) {
        if (this.f2800p) {
            return;
        }
        this.f2800p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2802r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0785p interfaceC0785p = (InterfaceC0785p) weakReference.get();
            if (interfaceC0785p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0785p.mo1976a(this, z2);
            }
        }
        this.f2800p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0780k menuItemC0780k = this.f2803s;
        if (menuItemC0780k != null) {
            mo1998d(menuItemC0780k);
        }
        this.f2790f.clear();
        m2009o(true);
    }

    public final void clearHeader() {
        this.f2796l = null;
        m2009o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m1997c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1998d(MenuItemC0780k menuItemC0780k) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2802r;
        boolean zMo2023c = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2803s == menuItemC0780k) {
            m2013s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0785p interfaceC0785p = (InterfaceC0785p) weakReference.get();
                if (interfaceC0785p != null) {
                    zMo2023c = interfaceC0785p.mo2023c(menuItemC0780k);
                    if (zMo2023c) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m2012r();
            if (zMo2023c) {
                this.f2803s = null;
            }
        }
        return zMo2023c;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1999e(MenuC0779j menuC0779j, MenuItem menuItem) {
        InterfaceC0777h interfaceC0777h = this.f2789e;
        return interfaceC0777h != null && interfaceC0777h.mo355u(menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2000f(MenuItemC0780k menuItemC0780k) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2802r;
        boolean zMo2025i = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2013s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0785p interfaceC0785p = (InterfaceC0785p) weakReference.get();
            if (interfaceC0785p != null) {
                zMo2025i = interfaceC0785p.mo2025i(menuItemC0780k);
                if (zMo2025i) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m2012r();
        if (zMo2025i) {
            this.f2803s = menuItemC0780k;
        }
        return zMo2025i;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList.get(i3);
            if (menuItemC0780k.f2807a == i2) {
                return menuItemC0780k;
            }
            if (menuItemC0780k.hasSubMenu() && (menuItemFindItem = menuItemC0780k.f2821o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final MenuItemC0780k m2001g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2801q;
        arrayList.clear();
        m2002h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC0780k) arrayList.get(0);
        }
        boolean zMo2007m = mo2007m();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList.get(i3);
            char c = zMo2007m ? menuItemC0780k.f2816j : menuItemC0780k.f2814h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo2007m && c == '\b' && i2 == 67))) {
                return menuItemC0780k;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f2790f.get(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2002h(List list, int i2, KeyEvent keyEvent) {
        boolean zMo2007m = mo2007m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.f2790f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList.get(i3);
                if (menuItemC0780k.hasSubMenu()) {
                    menuItemC0780k.f2821o.m2002h(list, i2, keyEvent);
                }
                char c = zMo2007m ? menuItemC0780k.f2816j : menuItemC0780k.f2814h;
                if ((modifiers & 69647) == ((zMo2007m ? menuItemC0780k.f2817k : menuItemC0780k.f2815i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (zMo2007m && c == '\b') {
                            if (i2 == 67) {
                            }
                        }
                    }
                    if (menuItemC0780k.isEnabled()) {
                        list.add(menuItemC0780k);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemC0780k) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2003i() {
        ArrayList arrayListM2005k = m2005k();
        if (this.f2795k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2802r;
            boolean zMo1981g = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0785p interfaceC0785p = (InterfaceC0785p) weakReference.get();
                if (interfaceC0785p == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1981g |= interfaceC0785p.mo1981g();
                }
            }
            ArrayList arrayList = this.f2793i;
            ArrayList arrayList2 = this.f2794j;
            if (zMo1981g) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM2005k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayListM2005k.get(i2);
                    if (menuItemC0780k.m2017d()) {
                        arrayList.add(menuItemC0780k);
                    } else {
                        arrayList2.add(menuItemC0780k);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2005k());
            }
            this.f2795k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return m2001g(i2, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public MenuC0779j mo2004j() {
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m2005k() {
        boolean z2 = this.f2792h;
        ArrayList arrayList = this.f2791g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2790f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList2.get(i2);
            if (menuItemC0780k.isVisible()) {
                arrayList.add(menuItemC0780k);
            }
        }
        this.f2792h = false;
        this.f2795k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo2006l() {
        return this.f2804t;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2007m() {
        return this.f2787c;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo2008n() {
        return this.f2788d;
    }

    /* JADX INFO: renamed from: o */
    public final void m2009o(boolean z2) {
        if (this.f2797m) {
            this.f2798n = true;
            if (z2) {
                this.f2799o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2792h = true;
            this.f2795k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2802r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2013s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0785p interfaceC0785p = (InterfaceC0785p) weakReference.get();
            if (interfaceC0785p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0785p.mo1977b();
            }
        }
        m2012r();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2010p(MenuItem menuItem, InterfaceC0785p interfaceC0785p, int i2) {
        boolean zExpandActionView;
        MenuItemC0780k menuItemC0780k = (MenuItemC0780k) menuItem;
        if (menuItemC0780k == null || !menuItemC0780k.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC0780k.f2822p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC0780k)) {
            MenuC0779j menuC0779j = menuItemC0780k.f2820n;
            if (menuC0779j.mo1999e(menuC0779j, menuItemC0780k)) {
                zExpandActionView = true;
            } else {
                Intent intent = menuItemC0780k.f2813g;
                if (intent != null) {
                    try {
                        menuC0779j.f2785a.startActivity(intent);
                        zExpandActionView = true;
                    } catch (ActivityNotFoundException unused) {
                        zExpandActionView = false;
                    }
                }
                zExpandActionView = false;
            }
        }
        if (menuItemC0780k.m2016c()) {
            zExpandActionView |= menuItemC0780k.expandActionView();
            if (zExpandActionView) {
                m1997c(true);
            }
        } else if (menuItemC0780k.hasSubMenu()) {
            if ((i2 & 4) == 0) {
                m1997c(false);
            }
            if (!menuItemC0780k.hasSubMenu()) {
                SubMenuC0789t subMenuC0789t = new SubMenuC0789t(this.f2785a, this, menuItemC0780k);
                menuItemC0780k.f2821o = subMenuC0789t;
                subMenuC0789t.setHeaderTitle(menuItemC0780k.f2811e);
            }
            SubMenuC0789t subMenuC0789t2 = menuItemC0780k.f2821o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2802r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo1983k = interfaceC0785p != null ? interfaceC0785p.mo1983k(subMenuC0789t2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC0785p interfaceC0785p2 = (InterfaceC0785p) weakReference.get();
                    if (interfaceC0785p2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1983k) {
                        zMo1983k = interfaceC0785p2.mo1983k(subMenuC0789t2);
                    }
                }
            }
            zExpandActionView |= zMo1983k;
            if (!zExpandActionView) {
                m1997c(true);
            }
        } else if ((i2 & 1) == 0) {
            m1997c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return m2010p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        MenuItemC0780k menuItemC0780kM2001g = m2001g(i2, keyEvent);
        boolean zM2010p = menuItemC0780kM2001g != null ? m2010p(menuItemC0780kM2001g, null, i3) : false;
        if ((i3 & 2) != 0) {
            m1997c(true);
        }
        return zM2010p;
    }

    /* JADX INFO: renamed from: q */
    public final void m2011q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f2796l = null;
        } else {
            if (i2 > 0) {
                this.f2796l = this.f2786b.getText(i2);
            } else if (charSequence != null) {
                this.f2796l = charSequence;
            }
            if (i3 > 0) {
                AbstractC1080a.m2560b(this.f2785a, i3);
            }
        }
        m2009o(false);
    }

    /* JADX INFO: renamed from: r */
    public final void m2012r() {
        this.f2797m = false;
        if (this.f2798n) {
            this.f2798n = false;
            m2009o(this.f2799o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((MenuItemC0780k) arrayList.get(i4)).f2808b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((MenuItemC0780k) arrayList.get(i4)).f2808b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f2790f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            m2009o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemC0780k) arrayList.get(i3)).f2807a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f2790f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            m2009o(true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2013s() {
        if (this.f2797m) {
            return;
        }
        this.f2797m = true;
        this.f2798n = false;
        this.f2799o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList.get(i3);
            if (menuItemC0780k.f2808b == i2) {
                menuItemC0780k.f2830x = (menuItemC0780k.f2830x & (-5)) | (z3 ? 4 : 0);
                menuItemC0780k.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2804t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList.get(i3);
            if (menuItemC0780k.f2808b == i2) {
                menuItemC0780k.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f2790f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0780k menuItemC0780k = (MenuItemC0780k) arrayList.get(i3);
            if (menuItemC0780k.f2808b == i2) {
                int i4 = menuItemC0780k.f2830x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                menuItemC0780k.f2830x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m2009o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2787c = z2;
        m2009o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2790f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m1995a(0, 0, 0, this.f2786b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2786b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m1995a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemC0780k menuItemC0780kM1995a = m1995a(i2, i3, i4, charSequence);
        SubMenuC0789t subMenuC0789t = new SubMenuC0789t(this.f2785a, this, menuItemC0780kM1995a);
        menuItemC0780kM1995a.f2821o = subMenuC0789t;
        subMenuC0789t.setHeaderTitle(menuItemC0780kM1995a.f2811e);
        return subMenuC0789t;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m1995a(i2, i3, i4, this.f2786b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2786b.getString(i5));
    }
}
