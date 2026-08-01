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

/* JADX INFO: renamed from: qu */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0646qu implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f3950y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f3951a;

    /* JADX INFO: renamed from: b */
    public final Resources f3952b;

    /* JADX INFO: renamed from: c */
    public boolean f3953c;

    /* JADX INFO: renamed from: d */
    public final boolean f3954d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0572ou f3955e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f3956f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3957g;

    /* JADX INFO: renamed from: h */
    public boolean f3958h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f3959i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f3960j;

    /* JADX INFO: renamed from: k */
    public boolean f3961k;

    /* JADX INFO: renamed from: m */
    public CharSequence f3963m;

    /* JADX INFO: renamed from: n */
    public Drawable f3964n;

    /* JADX INFO: renamed from: o */
    public View f3965o;

    /* JADX INFO: renamed from: v */
    public C0869wu f3972v;

    /* JADX INFO: renamed from: x */
    public boolean f3974x;

    /* JADX INFO: renamed from: l */
    public int f3962l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f3966p = false;

    /* JADX INFO: renamed from: q */
    public boolean f3967q = false;

    /* JADX INFO: renamed from: r */
    public boolean f3968r = false;

    /* JADX INFO: renamed from: s */
    public boolean f3969s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f3970t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f3971u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f3973w = false;

    public MenuC0646qu(Context context) {
        boolean zM2140b;
        boolean z = false;
        this.f3951a = context;
        Resources resources = context.getResources();
        this.f3952b = resources;
        this.f3956f = new ArrayList();
        this.f3957g = new ArrayList();
        this.f3958h = true;
        this.f3959i = new ArrayList();
        this.f3960j = new ArrayList();
        this.f3961k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM2140b = qa0.m2140b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM2140b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM2140b) {
                z = true;
            }
        }
        this.f3954d = z;
    }

    /* JADX INFO: renamed from: a */
    public final C0869wu m2165a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f3950y[i5] << 16) | (65535 & i3);
        C0869wu c0869wu = new C0869wu(this, i, i2, i3, i6, charSequence, this.f3962l);
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0869wu) arrayList.get(size)).f5115d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0869wu);
        m2172p(true);
        return c0869wu;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2165a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3951a.getPackageManager();
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
            C0869wu c0869wuM2165a = m2165a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c0869wuM2165a.setIcon(resolveInfo.loadIcon(packageManager));
            c0869wuM2165a.f5118g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c0869wuM2165a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m2166b(InterfaceC0462lv interfaceC0462lv, Context context) {
        this.f3971u.add(new WeakReference(interfaceC0462lv));
        interfaceC0462lv.mo532i(context, this);
        this.f3961k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2167c(boolean z) {
        if (this.f3969s) {
            return;
        }
        this.f3969s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3971u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0462lv interfaceC0462lv = (InterfaceC0462lv) weakReference.get();
            if (interfaceC0462lv == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0462lv.mo972a(this, z);
            }
        }
        this.f3969s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0869wu c0869wu = this.f3972v;
        if (c0869wu != null) {
            mo1566d(c0869wu);
        }
        this.f3956f.clear();
        m2172p(true);
    }

    public final void clearHeader() {
        this.f3964n = null;
        this.f3963m = null;
        this.f3965o = null;
        m2172p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m2167c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1566d(C0869wu c0869wu) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3971u;
        boolean zMo530d = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3972v == c0869wu) {
            m2179w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0462lv interfaceC0462lv = (InterfaceC0462lv) weakReference.get();
                if (interfaceC0462lv != null) {
                    zMo530d = interfaceC0462lv.mo530d(c0869wu);
                    if (zMo530d) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m2178v();
            if (zMo530d) {
                this.f3972v = null;
            }
        }
        return zMo530d;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1567e(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        InterfaceC0572ou interfaceC0572ou = this.f3955e;
        return interfaceC0572ou != null && interfaceC0572ou.mo626n(menuC0646qu, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo1568f(C0869wu c0869wu) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3971u;
        boolean zMo531g = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2179w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0462lv interfaceC0462lv = (InterfaceC0462lv) weakReference.get();
            if (interfaceC0462lv != null) {
                zMo531g = interfaceC0462lv.mo531g(c0869wu);
                if (zMo531g) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m2178v();
        if (zMo531g) {
            this.f3972v = c0869wu;
        }
        return zMo531g;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0869wu c0869wu = (C0869wu) arrayList.get(i2);
            if (c0869wu.f5112a == i) {
                return c0869wu;
            }
            if (c0869wu.hasSubMenu() && (menuItemFindItem = c0869wu.f5126o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C0869wu m2168g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3970t;
        arrayList.clear();
        m2169h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0869wu) arrayList.get(0);
        }
        boolean zMo1572n = mo1572n();
        for (int i2 = 0; i2 < size; i2++) {
            C0869wu c0869wu = (C0869wu) arrayList.get(i2);
            char c = zMo1572n ? c0869wu.f5121j : c0869wu.f5119h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo1572n && c == '\b' && i == 67))) {
                return c0869wu;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3956f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m2169h(List list, int i, KeyEvent keyEvent) {
        boolean zMo1572n = mo1572n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f3956f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0869wu c0869wu = (C0869wu) arrayList.get(i2);
                if (c0869wu.hasSubMenu()) {
                    c0869wu.f5126o.m2169h(list, i, keyEvent);
                }
                char c = zMo1572n ? c0869wu.f5121j : c0869wu.f5119h;
                if ((modifiers & 69647) == ((zMo1572n ? c0869wu.f5122k : c0869wu.f5120i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo1572n && c == '\b' && i == 67)) && c0869wu.isEnabled()) {
                        list.add(c0869wu);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3974x) {
            return true;
        }
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0869wu) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2170i() {
        ArrayList arrayListM2171l = m2171l();
        if (this.f3961k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3971u;
            boolean zMo974c = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0462lv interfaceC0462lv = (InterfaceC0462lv) weakReference.get();
                if (interfaceC0462lv == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo974c |= interfaceC0462lv.mo974c();
                }
            }
            ArrayList arrayList = this.f3959i;
            ArrayList arrayList2 = this.f3960j;
            if (zMo974c) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM2171l.size();
                for (int i = 0; i < size; i++) {
                    C0869wu c0869wu = (C0869wu) arrayListM2171l.get(i);
                    if ((c0869wu.f5135x & 32) == 32) {
                        arrayList.add(c0869wu);
                    } else {
                        arrayList2.add(c0869wu);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2171l());
            }
            this.f3961k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2168g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo1569j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m2171l() {
        boolean z = this.f3958h;
        ArrayList arrayList = this.f3957g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3956f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0869wu c0869wu = (C0869wu) arrayList2.get(i);
            if (c0869wu.isVisible()) {
                arrayList.add(c0869wu);
            }
        }
        this.f3958h = false;
        this.f3961k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo1571m() {
        return this.f3973w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo1572n() {
        return this.f3953c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo1573o() {
        return this.f3954d;
    }

    /* JADX INFO: renamed from: p */
    public final void m2172p(boolean z) {
        if (this.f3966p) {
            this.f3967q = true;
            if (z) {
                this.f3968r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f3958h = true;
            this.f3961k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3971u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2179w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0462lv interfaceC0462lv = (InterfaceC0462lv) weakReference.get();
            if (interfaceC0462lv == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0462lv.mo977h();
            }
        }
        m2178v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m2173q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0869wu c0869wuM2168g = m2168g(i, keyEvent);
        boolean zM2173q = c0869wuM2168g != null ? m2173q(c0869wuM2168g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m2167c(true);
        }
        return zM2173q;
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
    public final boolean m2173q(android.view.MenuItem r7, p000.InterfaceC0462lv r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.MenuC0646qu.m2173q(android.view.MenuItem, lv, int):boolean");
    }

    /* JADX INFO: renamed from: r */
    public final void m2174r(InterfaceC0462lv interfaceC0462lv) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3971u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0462lv interfaceC0462lv2 = (InterfaceC0462lv) weakReference.get();
            if (interfaceC0462lv2 == null || interfaceC0462lv2 == interfaceC0462lv) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0869wu) arrayList.get(i3)).f5113b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0869wu) arrayList.get(i3)).f5113b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m2172p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0869wu) arrayList.get(i2)).f5112a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m2172p(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m2175s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1569j());
        int size = this.f3956f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((j50) item.getSubMenu()).m2175s(bundle);
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
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0869wu c0869wu = (C0869wu) arrayList.get(i2);
            if (c0869wu.f5113b == i) {
                c0869wu.f5135x = (c0869wu.f5135x & (-5)) | (z2 ? 4 : 0);
                c0869wu.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f3973w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0869wu c0869wu = (C0869wu) arrayList.get(i2);
            if (c0869wu.f5113b == i) {
                c0869wu.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f3956f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0869wu c0869wu = (C0869wu) arrayList.get(i2);
            if (c0869wu.f5113b == i) {
                int i3 = c0869wu.f5135x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c0869wu.f5135x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m2172p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f3953c = z;
        m2172p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3956f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m2176t(Bundle bundle) {
        int size = this.f3956f.size();
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
                ((j50) item.getSubMenu()).m2176t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1569j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2177u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3965o = view;
            this.f3963m = null;
            this.f3964n = null;
        } else {
            if (i > 0) {
                this.f3963m = this.f3952b.getText(i);
            } else if (charSequence != null) {
                this.f3963m = charSequence;
            }
            if (i2 > 0) {
                this.f3964n = AbstractC0629qd.m2148b(this.f3951a, i2);
            } else if (drawable != null) {
                this.f3964n = drawable;
            }
            this.f3965o = null;
        }
        m2172p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m2178v() {
        this.f3966p = false;
        if (this.f3967q) {
            this.f3967q = false;
            m2172p(this.f3968r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2179w() {
        if (this.f3966p) {
            return;
        }
        this.f3966p = true;
        this.f3967q = false;
        this.f3968r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m2165a(0, 0, 0, this.f3952b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3952b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2165a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0869wu c0869wuM2165a = m2165a(i, i2, i3, charSequence);
        j50 j50Var = new j50(this.f3951a, this, c0869wuM2165a);
        c0869wuM2165a.f5126o = j50Var;
        j50Var.setHeaderTitle(c0869wuM2165a.f5116e);
        return j50Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m2165a(i, i2, i3, this.f3952b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3952b.getString(i4));
    }

    /* JADX INFO: renamed from: k */
    public MenuC0646qu mo1570k() {
        return this;
    }
}
