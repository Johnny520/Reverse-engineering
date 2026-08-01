package p068h;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
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
import p082p.AbstractC0783a;
import p099y.AbstractC1049M;
import p099y.AbstractC1051O;

/* JADX INFO: renamed from: h.m */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0594m implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f2029y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f2030a;

    /* JADX INFO: renamed from: b */
    public final Resources f2031b;

    /* JADX INFO: renamed from: c */
    public boolean f2032c;

    /* JADX INFO: renamed from: d */
    public final boolean f2033d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0592k f2034e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2035f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2036g;

    /* JADX INFO: renamed from: h */
    public boolean f2037h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2038i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2039j;

    /* JADX INFO: renamed from: k */
    public boolean f2040k;

    /* JADX INFO: renamed from: m */
    public CharSequence f2042m;

    /* JADX INFO: renamed from: n */
    public Drawable f2043n;

    /* JADX INFO: renamed from: o */
    public View f2044o;

    /* JADX INFO: renamed from: v */
    public C0596o f2051v;

    /* JADX INFO: renamed from: x */
    public boolean f2053x;

    /* JADX INFO: renamed from: l */
    public int f2041l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f2045p = false;

    /* JADX INFO: renamed from: q */
    public boolean f2046q = false;

    /* JADX INFO: renamed from: r */
    public boolean f2047r = false;

    /* JADX INFO: renamed from: s */
    public boolean f2048s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f2049t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f2050u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f2052w = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuC0594m(Context context) {
        boolean zM2293b;
        boolean z2 = false;
        this.f2030a = context;
        Resources resources = context.getResources();
        this.f2031b = resources;
        this.f2035f = new ArrayList();
        this.f2036g = new ArrayList();
        this.f2037h = true;
        this.f2038i = new ArrayList();
        this.f2039j = new ArrayList();
        this.f2040k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = AbstractC1051O.f3667a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM2293b = AbstractC1049M.m2293b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM2293b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM2293b) {
                z2 = true;
            }
        }
        this.f2033d = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0596o m1182a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2029y[i6] << 16) | (65535 & i4);
        C0596o c0596o = new C0596o(this, i2, i3, i4, i7, charSequence, this.f2041l);
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((C0596o) arrayList.get(size)).f2063d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, c0596o);
        m1189p(true);
        return c0596o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1182a(0, 0, 0, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2030a.getPackageManager();
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
            C0596o c0596oM1182a = m1182a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            c0596oM1182a.setIcon(resolveInfo.loadIcon(packageManager));
            c0596oM1182a.f2066g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = c0596oM1182a;
            }
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1183b(InterfaceC0607z interfaceC0607z, Context context) {
        this.f2050u.add(new WeakReference(interfaceC0607z));
        interfaceC0607z.mo1178g(context, this);
        this.f2040k = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1184c(boolean z2) {
        if (this.f2048s) {
            return;
        }
        this.f2048s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2050u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0607z interfaceC0607z = (InterfaceC0607z) weakReference.get();
            if (interfaceC0607z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0607z.mo1147b(this, z2);
            }
        }
        this.f2048s = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void clear() {
        C0596o c0596o = this.f2051v;
        if (c0596o != null) {
            mo1160d(c0596o);
        }
        this.f2035f.clear();
        m1189p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clearHeader() {
        this.f2043n = null;
        this.f2042m = null;
        this.f2044o = null;
        m1189p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void close() {
        m1184c(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public boolean mo1160d(C0596o c0596o) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2050u;
        boolean zMo1177d = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2051v == c0596o) {
            m1196w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0607z interfaceC0607z = (InterfaceC0607z) weakReference.get();
                if (interfaceC0607z != null) {
                    zMo1177d = interfaceC0607z.mo1177d(c0596o);
                    if (zMo1177d) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m1195v();
            if (zMo1177d) {
                this.f2051v = null;
            }
        }
        return zMo1177d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public boolean mo1161e(MenuC0594m menuC0594m, MenuItem menuItem) {
        InterfaceC0592k interfaceC0592k = this.f2034e;
        return interfaceC0592k != null && interfaceC0592k.mo136g(menuC0594m, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean mo1162f(C0596o c0596o) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2050u;
        boolean zMo1179k = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m1196w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0607z interfaceC0607z = (InterfaceC0607z) weakReference.get();
            if (interfaceC0607z != null) {
                zMo1179k = interfaceC0607z.mo1179k(c0596o);
                if (zMo1179k) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m1195v();
        if (zMo1179k) {
            this.f2051v = c0596o;
        }
        return zMo1179k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0596o c0596o = (C0596o) arrayList.get(i3);
            if (c0596o.f2060a == i2) {
                return c0596o;
            }
            if (c0596o.hasSubMenu() && (menuItemFindItem = c0596o.f2074o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C0596o m1185g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2049t;
        arrayList.clear();
        m1186h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0596o) arrayList.get(0);
        }
        boolean zMo1166n = mo1166n();
        for (int i3 = 0; i3 < size; i3++) {
            C0596o c0596o = (C0596o) arrayList.get(i3);
            char c2 = zMo1166n ? c0596o.f2069j : c0596o.f2067h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zMo1166n && c2 == '\b' && i2 == 67))) {
                return c0596o;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f2035f.get(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1186h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean zMo1166n = mo1166n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f2035f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0596o c0596o = (C0596o) arrayList2.get(i3);
                if (c0596o.hasSubMenu()) {
                    c0596o.f2074o.m1186h(arrayList, i2, keyEvent);
                }
                char c2 = zMo1166n ? c0596o.f2069j : c0596o.f2067h;
                if ((modifiers & 69647) == ((zMo1166n ? c0596o.f2070k : c0596o.f2068i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zMo1166n && c2 == '\b' && i2 == 67)) && c0596o.isEnabled()) {
                        arrayList.add(c0596o);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2053x) {
            return true;
        }
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0596o) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1187i() {
        ArrayList arrayListM1188l = m1188l();
        if (this.f2040k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2050u;
            boolean zMo1150i = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0607z interfaceC0607z = (InterfaceC0607z) weakReference.get();
                if (interfaceC0607z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1150i |= interfaceC0607z.mo1150i();
                }
            }
            ArrayList arrayList = this.f2038i;
            ArrayList arrayList2 = this.f2039j;
            if (zMo1150i) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM1188l.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0596o c0596o = (C0596o) arrayListM1188l.get(i2);
                    if ((c0596o.f2083x & 32) == 32) {
                        arrayList.add(c0596o);
                    } else {
                        arrayList2.add(c0596o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m1188l());
            }
            this.f2040k = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return m1185g(i2, keyEvent) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public String mo1163j() {
        return "android:menu:actionviewstates";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final ArrayList m1188l() {
        boolean z2 = this.f2037h;
        ArrayList arrayList = this.f2036g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2035f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0596o c0596o = (C0596o) arrayList2.get(i2);
            if (c0596o.isVisible()) {
                arrayList.add(c0596o);
            }
        }
        this.f2037h = false;
        this.f2040k = true;
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public boolean mo1165m() {
        return this.f2052w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public boolean mo1166n() {
        return this.f2032c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public boolean mo1167o() {
        return this.f2033d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m1189p(boolean z2) {
        if (this.f2045p) {
            this.f2046q = true;
            if (z2) {
                this.f2047r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2037h = true;
            this.f2040k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2050u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m1196w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0607z interfaceC0607z = (InterfaceC0607z) weakReference.get();
            if (interfaceC0607z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0607z.mo1148c();
            }
        }
        m1195v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return m1190q(findItem(i2), null, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        C0596o c0596oM1185g = m1185g(i2, keyEvent);
        boolean zM1190q = c0596oM1185g != null ? m1190q(c0596oM1185g, null, i3) : false;
        if ((i3 & 2) != 0) {
            m1184c(true);
        }
        return zM1190q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1190q(MenuItem menuItem, InterfaceC0607z interfaceC0607z, int i2) {
        boolean zExpandActionView;
        C0596o c0596o = (C0596o) menuItem;
        if (c0596o == null || !c0596o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0596o.f2075p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0596o)) {
            MenuC0594m menuC0594m = c0596o.f2073n;
            if (!menuC0594m.mo1161e(menuC0594m, c0596o)) {
                Intent intent = c0596o.f2066g;
                if (intent != null) {
                    try {
                        menuC0594m.f2030a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p = c0596o.f2057A;
                        if (actionProviderVisibilityListenerC0597p == null) {
                        }
                        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p2 = c0596o.f2057A;
                        if (actionProviderVisibilityListenerC0597p2 == null) {
                        }
                        if (!c0596o.m1199e()) {
                        }
                        return zExpandActionView;
                    }
                } else {
                    ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p3 = c0596o.f2057A;
                    zExpandActionView = actionProviderVisibilityListenerC0597p3 == null && actionProviderVisibilityListenerC0597p3.f2086a.onPerformDefaultAction();
                }
            }
        }
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p22 = c0596o.f2057A;
        boolean z2 = actionProviderVisibilityListenerC0597p22 == null && actionProviderVisibilityListenerC0597p22.f2086a.hasSubMenu();
        if (!c0596o.m1199e()) {
            zExpandActionView |= c0596o.expandActionView();
            if (zExpandActionView) {
                m1184c(true);
            }
        } else if (c0596o.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                m1184c(false);
            }
            if (!c0596o.hasSubMenu()) {
                SubMenuC0581F subMenuC0581F = new SubMenuC0581F(this.f2030a, this, c0596o);
                c0596o.f2074o = subMenuC0581F;
                subMenuC0581F.setHeaderTitle(c0596o.f2064e);
            }
            SubMenuC0581F subMenuC0581F2 = c0596o.f2074o;
            if (z2) {
                MenuItemC0601t menuItemC0601t = actionProviderVisibilityListenerC0597p22.f2087b;
                actionProviderVisibilityListenerC0597p22.f2086a.onPrepareSubMenu(subMenuC0581F2);
            }
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2050u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo1151j = interfaceC0607z != null ? interfaceC0607z.mo1151j(subMenuC0581F2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC0607z interfaceC0607z2 = (InterfaceC0607z) weakReference.get();
                    if (interfaceC0607z2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1151j) {
                        zMo1151j = interfaceC0607z2.mo1151j(subMenuC0581F2);
                    }
                }
            }
            zExpandActionView |= zMo1151j;
            if (!zExpandActionView) {
                m1184c(true);
            }
        } else if ((i2 & 1) == 0) {
            m1184c(true);
        }
        return zExpandActionView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m1191r(InterfaceC0607z interfaceC0607z) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2050u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0607z interfaceC0607z2 = (InterfaceC0607z) weakReference.get();
            if (interfaceC0607z2 == null || interfaceC0607z2 == interfaceC0607z) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C0596o) arrayList.get(i4)).f2061b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((C0596o) arrayList.get(i4)).f2061b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f2035f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            m1189p(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0596o) arrayList.get(i3)).f2060a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f2035f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            m1189p(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m1192s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1163j());
        int size = this.f2035f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0581F) item.getSubMenu()).m1192s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0596o c0596o = (C0596o) arrayList.get(i3);
            if (c0596o.f2061b == i2) {
                c0596o.f2083x = (c0596o.f2083x & (-5)) | (z3 ? 4 : 0);
                c0596o.setCheckable(z2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2052w = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0596o c0596o = (C0596o) arrayList.get(i3);
            if (c0596o.f2061b == i2) {
                c0596o.setEnabled(z2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f2035f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0596o c0596o = (C0596o) arrayList.get(i3);
            if (c0596o.f2061b == i2) {
                int i4 = c0596o.f2083x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                c0596o.f2083x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m1189p(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2032c = z2;
        m1189p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int size() {
        return this.f2035f.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m1193t(Bundle bundle) {
        int size = this.f2035f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0581F) item.getSubMenu()).m1193t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1163j(), sparseArray);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m1194u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f2044o = view;
            this.f2042m = null;
            this.f2043n = null;
        } else {
            if (i2 > 0) {
                this.f2042m = this.f2031b.getText(i2);
            } else if (charSequence != null) {
                this.f2042m = charSequence;
            }
            if (i3 > 0) {
                this.f2043n = AbstractC0783a.m1446b(this.f2030a, i3);
            } else if (drawable != null) {
                this.f2043n = drawable;
            }
            this.f2044o = null;
        }
        m1189p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m1195v() {
        this.f2045p = false;
        if (this.f2046q) {
            this.f2046q = false;
            m1189p(this.f2047r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m1196w() {
        if (this.f2045p) {
            return;
        }
        this.f2045p = true;
        this.f2046q = false;
        this.f2047r = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m1182a(0, 0, 0, this.f2031b.getString(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2031b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m1182a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0596o c0596oM1182a = m1182a(i2, i3, i4, charSequence);
        SubMenuC0581F subMenuC0581F = new SubMenuC0581F(this.f2030a, this, c0596oM1182a);
        c0596oM1182a.f2074o = subMenuC0581F;
        subMenuC0581F.setHeaderTitle(c0596oM1182a.f2064e);
        return subMenuC0581F;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m1182a(i2, i3, i4, this.f2031b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2031b.getString(i5));
    }

    /* JADX INFO: renamed from: k */
    public MenuC0594m mo1164k() {
        return this;
    }
}
