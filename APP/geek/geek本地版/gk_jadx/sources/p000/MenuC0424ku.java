package p000;

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

/* JADX INFO: renamed from: ku */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0424ku implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f2949y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f2950a;

    /* JADX INFO: renamed from: b */
    public final Resources f2951b;

    /* JADX INFO: renamed from: c */
    public boolean f2952c;

    /* JADX INFO: renamed from: d */
    public final boolean f2953d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0350iu f2954e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2955f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2956g;

    /* JADX INFO: renamed from: h */
    public boolean f2957h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2958i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2959j;

    /* JADX INFO: renamed from: k */
    public boolean f2960k;

    /* JADX INFO: renamed from: m */
    public CharSequence f2962m;

    /* JADX INFO: renamed from: n */
    public Drawable f2963n;

    /* JADX INFO: renamed from: o */
    public View f2964o;

    /* JADX INFO: renamed from: v */
    public C0572ou f2971v;

    /* JADX INFO: renamed from: x */
    public boolean f2973x;

    /* JADX INFO: renamed from: l */
    public int f2961l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f2965p = false;

    /* JADX INFO: renamed from: q */
    public boolean f2966q = false;

    /* JADX INFO: renamed from: r */
    public boolean f2967r = false;

    /* JADX INFO: renamed from: s */
    public boolean f2968s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f2969t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f2970u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f2972w = false;

    public MenuC0424ku(Context context) {
        boolean zM1755b;
        boolean z = false;
        this.f2950a = context;
        Resources resources = context.getResources();
        this.f2951b = resources;
        this.f2955f = new ArrayList();
        this.f2956g = new ArrayList();
        this.f2957h = true;
        this.f2958i = new ArrayList();
        this.f2959j = new ArrayList();
        this.f2960k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM1755b = la0.m1755b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM1755b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM1755b) {
                z = true;
            }
        }
        this.f2953d = z;
    }

    /* JADX INFO: renamed from: a */
    public final C0572ou m1716a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2949y[i5] << 16) | (65535 & i3);
        C0572ou c0572ou = new C0572ou(this, i, i2, i3, i6, charSequence, this.f2961l);
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0572ou) arrayList.get(size)).f3589d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0572ou);
        m1723p(true);
        return c0572ou;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1716a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2950a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0572ou c0572ouM1716a = m1716a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c0572ouM1716a.setIcon(resolveInfo.loadIcon(packageManager));
            c0572ouM1716a.f3592g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c0572ouM1716a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m1717b(InterfaceC0164dv interfaceC0164dv, Context context) {
        this.f2970u.add(new WeakReference(interfaceC0164dv));
        interfaceC0164dv.mo955i(context, this);
        this.f2960k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1718c(boolean z) {
        if (this.f2968s) {
            return;
        }
        this.f2968s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2970u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0164dv interfaceC0164dv = (InterfaceC0164dv) weakReference.get();
            if (interfaceC0164dv == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0164dv.mo949a(this, z);
            }
        }
        this.f2968s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0572ou c0572ou = this.f2971v;
        if (c0572ou != null) {
            mo629d(c0572ou);
        }
        this.f2955f.clear();
        m1723p(true);
    }

    public final void clearHeader() {
        this.f2963n = null;
        this.f2962m = null;
        this.f2964o = null;
        m1723p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m1718c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo629d(C0572ou c0572ou) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2970u;
        boolean zMo951d = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2971v == c0572ou) {
            m1730w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0164dv interfaceC0164dv = (InterfaceC0164dv) weakReference.get();
                if (interfaceC0164dv != null) {
                    zMo951d = interfaceC0164dv.mo951d(c0572ou);
                    if (zMo951d) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m1729v();
            if (zMo951d) {
                this.f2971v = null;
            }
        }
        return zMo951d;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo630e(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        InterfaceC0350iu interfaceC0350iu = this.f2954e;
        return interfaceC0350iu != null && interfaceC0350iu.mo926n(menuC0424ku, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo631f(C0572ou c0572ou) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2970u;
        boolean zMo953g = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m1730w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0164dv interfaceC0164dv = (InterfaceC0164dv) weakReference.get();
            if (interfaceC0164dv != null) {
                zMo953g = interfaceC0164dv.mo953g(c0572ou);
                if (zMo953g) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m1729v();
        if (zMo953g) {
            this.f2971v = c0572ou;
        }
        return zMo953g;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0572ou c0572ou = (C0572ou) arrayList.get(i2);
            if (c0572ou.f3586a == i) {
                return c0572ou;
            }
            if (c0572ou.hasSubMenu() && (menuItemFindItem = c0572ou.f3600o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C0572ou m1719g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2969t;
        arrayList.clear();
        m1720h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0572ou) arrayList.get(0);
        }
        boolean zMo635n = mo635n();
        for (int i2 = 0; i2 < size; i2++) {
            C0572ou c0572ou = (C0572ou) arrayList.get(i2);
            char c = zMo635n ? c0572ou.f3595j : c0572ou.f3593h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo635n && c == '\b' && i == 67))) {
                return c0572ou;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2955f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m1720h(List list, int i, KeyEvent keyEvent) {
        boolean zMo635n = mo635n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f2955f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0572ou c0572ou = (C0572ou) arrayList.get(i2);
                if (c0572ou.hasSubMenu()) {
                    c0572ou.f3600o.m1720h(list, i, keyEvent);
                }
                char c = zMo635n ? c0572ou.f3595j : c0572ou.f3593h;
                if ((modifiers & 69647) == ((zMo635n ? c0572ou.f3596k : c0572ou.f3594i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo635n && c == '\b' && i == 67)) && c0572ou.isEnabled()) {
                        list.add(c0572ou);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2973x) {
            return true;
        }
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0572ou) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m1721i() {
        ArrayList arrayListM1722l = m1722l();
        if (this.f2960k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2970u;
            boolean zMo950c = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0164dv interfaceC0164dv = (InterfaceC0164dv) weakReference.get();
                if (interfaceC0164dv == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo950c |= interfaceC0164dv.mo950c();
                }
            }
            ArrayList arrayList = this.f2958i;
            ArrayList arrayList2 = this.f2959j;
            if (zMo950c) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM1722l.size();
                for (int i = 0; i < size; i++) {
                    C0572ou c0572ou = (C0572ou) arrayListM1722l.get(i);
                    if ((c0572ou.f3609x & 32) == 32) {
                        arrayList.add(c0572ou);
                    } else {
                        arrayList2.add(c0572ou);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m1722l());
            }
            this.f2960k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m1719g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo632j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m1722l() {
        boolean z = this.f2957h;
        ArrayList arrayList = this.f2956g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2955f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0572ou c0572ou = (C0572ou) arrayList2.get(i);
            if (c0572ou.isVisible()) {
                arrayList.add(c0572ou);
            }
        }
        this.f2957h = false;
        this.f2960k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo634m() {
        return this.f2972w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo635n() {
        return this.f2952c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo636o() {
        return this.f2953d;
    }

    /* JADX INFO: renamed from: p */
    public final void m1723p(boolean z) {
        if (this.f2965p) {
            this.f2966q = true;
            if (z) {
                this.f2967r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f2957h = true;
            this.f2960k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2970u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m1730w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0164dv interfaceC0164dv = (InterfaceC0164dv) weakReference.get();
            if (interfaceC0164dv == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0164dv.mo954h();
            }
        }
        m1729v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m1724q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0572ou c0572ouM1719g = m1719g(i, keyEvent);
        boolean zM1724q = c0572ouM1719g != null ? m1724q(c0572ouM1719g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m1718c(true);
        }
        return zM1724q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1724q(android.view.MenuItem r7, p000.InterfaceC0164dv r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.MenuC0424ku.m1724q(android.view.MenuItem, dv, int):boolean");
    }

    /* JADX INFO: renamed from: r */
    public final void m1725r(InterfaceC0164dv interfaceC0164dv) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2970u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0164dv interfaceC0164dv2 = (InterfaceC0164dv) weakReference.get();
            if (interfaceC0164dv2 == null || interfaceC0164dv2 == interfaceC0164dv) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0572ou) arrayList.get(i3)).f3587b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0572ou) arrayList.get(i3)).f3587b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m1723p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0572ou) arrayList.get(i2)).f3586a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m1723p(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m1726s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo632j());
        int size = this.f2955f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((c50) item.getSubMenu()).m1726s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0572ou c0572ou = (C0572ou) arrayList.get(i2);
            if (c0572ou.f3587b == i) {
                c0572ou.f3609x = (c0572ou.f3609x & (-5)) | (z2 ? 4 : 0);
                c0572ou.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f2972w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0572ou c0572ou = (C0572ou) arrayList.get(i2);
            if (c0572ou.f3587b == i) {
                c0572ou.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f2955f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0572ou c0572ou = (C0572ou) arrayList.get(i2);
            if (c0572ou.f3587b == i) {
                int i3 = c0572ou.f3609x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c0572ou.f3609x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m1723p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2952c = z;
        m1723p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2955f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m1727t(Bundle bundle) {
        int size = this.f2955f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
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
                ((c50) item.getSubMenu()).m1727t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo632j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1728u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2964o = view;
            this.f2962m = null;
            this.f2963n = null;
        } else {
            if (i > 0) {
                this.f2962m = this.f2951b.getText(i);
            } else if (charSequence != null) {
                this.f2962m = charSequence;
            }
            if (i2 > 0) {
                this.f2963n = AbstractC0257gd.m1270b(this.f2950a, i2);
            } else if (drawable != null) {
                this.f2963n = drawable;
            }
            this.f2964o = null;
        }
        m1723p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m1729v() {
        this.f2965p = false;
        if (this.f2966q) {
            this.f2966q = false;
            m1723p(this.f2967r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1730w() {
        if (this.f2965p) {
            return;
        }
        this.f2965p = true;
        this.f2966q = false;
        this.f2967r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1716a(0, 0, 0, this.f2951b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2951b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1716a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0572ou c0572ouM1716a = m1716a(i, i2, i3, charSequence);
        c50 c50Var = new c50(this.f2950a, this, c0572ouM1716a);
        c0572ouM1716a.f3600o = c50Var;
        c50Var.setHeaderTitle(c0572ouM1716a.f3590e);
        return c50Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1716a(i, i2, i3, this.f2951b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2951b.getString(i4));
    }

    /* JADX INFO: renamed from: k */
    public MenuC0424ku mo633k() {
        return this;
    }
}
