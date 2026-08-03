package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.AbstractC0290Q;
import p000a.C0437Y3;
import p000a.C0923xg;
import p000a.InterfaceMenuC0143He;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
public class C0998f implements InterfaceMenuC0143He {

    /* JADX INFO: renamed from: y */
    public static final int[] f3783y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f3784a;

    /* JADX INFO: renamed from: b */
    public final Resources f3785b;

    /* JADX INFO: renamed from: c */
    public boolean f3786c;

    /* JADX INFO: renamed from: d */
    public final boolean f3787d;

    /* JADX INFO: renamed from: e */
    public a f3788e;

    /* JADX INFO: renamed from: f */
    public final ArrayList<C1000h> f3789f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<C1000h> f3790g;

    /* JADX INFO: renamed from: h */
    public boolean f3791h;

    /* JADX INFO: renamed from: i */
    public final ArrayList<C1000h> f3792i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<C1000h> f3793j;

    /* JADX INFO: renamed from: k */
    public boolean f3794k;

    /* JADX INFO: renamed from: m */
    public CharSequence f3796m;

    /* JADX INFO: renamed from: n */
    public Drawable f3797n;

    /* JADX INFO: renamed from: o */
    public View f3798o;

    /* JADX INFO: renamed from: v */
    public C1000h f3805v;

    /* JADX INFO: renamed from: x */
    public boolean f3807x;

    /* JADX INFO: renamed from: l */
    public int f3795l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f3799p = false;

    /* JADX INFO: renamed from: q */
    public boolean f3800q = false;

    /* JADX INFO: renamed from: r */
    public boolean f3801r = false;

    /* JADX INFO: renamed from: s */
    public boolean f3802s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList<C1000h> f3803t = new ArrayList<>();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> f3804u = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: w */
    public boolean f3806w = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo816a(C0998f c0998f, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        void mo817b(C0998f c0998f);
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.f$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo2304a(C1000h c1000h);
    }

    public C0998f(Context context) {
        boolean z = false;
        this.f3784a = context;
        Resources resources = context.getResources();
        this.f3785b = resources;
        this.f3789f = new ArrayList<>();
        this.f3790g = new ArrayList<>();
        this.f3791h = true;
        this.f3792i = new ArrayList<>();
        this.f3793j = new ArrayList<>();
        this.f3794k = true;
        if (resources.getConfiguration().keyboard != 1 && C0923xg.m2210b(ViewConfiguration.get(context))) {
            z = true;
        }
        this.f3787d = z;
    }

    /* JADX INFO: renamed from: a */
    public final C1000h m2316a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f3783y[i5] << 16) | (65535 & i3);
        C1000h c1000h = new C1000h(this, i, i2, i3, i6, charSequence, this.f3795l);
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (arrayList.get(size).f3817d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c1000h);
        m2331p(true);
        return c1000h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2316a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3784a.getPackageManager();
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
            C1000h c1000hM2316a = m2316a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c1000hM2316a.setIcon(resolveInfo.loadIcon(packageManager));
            c1000hM2316a.f3820g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c1000hM2316a;
            }
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m2317b(InterfaceC1002j interfaceC1002j, Context context) {
        this.f3804u.add(new WeakReference<>(interfaceC1002j));
        interfaceC1002j.mo1397e(context, this);
        this.f3794k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2318c(boolean z) {
        if (this.f3802s) {
            return;
        }
        this.f3802s = true;
        CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> copyOnWriteArrayList = this.f3804u;
        for (WeakReference<InterfaceC1002j> weakReference : copyOnWriteArrayList) {
            InterfaceC1002j interfaceC1002j = weakReference.get();
            if (interfaceC1002j == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1002j.mo2306a(this, z);
            }
        }
        this.f3802s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1000h c1000h = this.f3805v;
        if (c1000h != null) {
            mo2319d(c1000h);
        }
        this.f3789f.clear();
        m2331p(true);
    }

    public final void clearHeader() {
        this.f3797n = null;
        this.f3796m = null;
        this.f3798o = null;
        m2331p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m2318c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo2319d(C1000h c1000h) {
        CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> copyOnWriteArrayList = this.f3804u;
        boolean zMo1396c = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3805v == c1000h) {
            m2338w();
            for (WeakReference<InterfaceC1002j> weakReference : copyOnWriteArrayList) {
                InterfaceC1002j interfaceC1002j = weakReference.get();
                if (interfaceC1002j != null) {
                    zMo1396c = interfaceC1002j.mo1396c(c1000h);
                    if (zMo1396c) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m2337v();
            if (zMo1396c) {
                this.f3805v = null;
            }
        }
        return zMo1396c;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2320e(C0998f c0998f, MenuItem menuItem) {
        a aVar = this.f3788e;
        return aVar != null && aVar.mo816a(c0998f, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2321f(C1000h c1000h) {
        CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> copyOnWriteArrayList = this.f3804u;
        boolean zMo1398i = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2338w();
        for (WeakReference<InterfaceC1002j> weakReference : copyOnWriteArrayList) {
            InterfaceC1002j interfaceC1002j = weakReference.get();
            if (interfaceC1002j != null) {
                zMo1398i = interfaceC1002j.mo1398i(c1000h);
                if (zMo1398i) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m2337v();
        if (zMo1398i) {
            this.f3805v = c1000h;
        }
        return zMo1398i;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1000h c1000h = arrayList.get(i2);
            if (c1000h.f3814a == i) {
                return c1000h;
            }
            if (c1000h.hasSubMenu() && (menuItemFindItem = c1000h.f3828o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C1000h m2322g(int i, KeyEvent keyEvent) {
        ArrayList<C1000h> arrayList = this.f3803t;
        arrayList.clear();
        m2323h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMo2329n = mo2329n();
        for (int i2 = 0; i2 < size; i2++) {
            C1000h c1000h = arrayList.get(i2);
            char c = zMo2329n ? c1000h.f3823j : c1000h.f3821h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo2329n && c == '\b' && i == 67))) {
                return c1000h;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f3789f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m2323h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zMo2329n = mo2329n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList<C1000h> arrayList2 = this.f3789f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1000h c1000h = arrayList2.get(i2);
                if (c1000h.hasSubMenu()) {
                    c1000h.f3828o.m2323h(arrayList, i, keyEvent);
                }
                char c = zMo2329n ? c1000h.f3823j : c1000h.f3821h;
                if ((modifiers & 69647) == ((zMo2329n ? c1000h.f3824k : c1000h.f3822i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo2329n && c == '\b' && i == 67)) && c1000h.isEnabled()) {
                        arrayList.add(c1000h);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3807x) {
            return true;
        }
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2324i() {
        ArrayList<C1000h> arrayListM2327l = m2327l();
        if (this.f3794k) {
            CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> copyOnWriteArrayList = this.f3804u;
            boolean zMo2307d = false;
            for (WeakReference<InterfaceC1002j> weakReference : copyOnWriteArrayList) {
                InterfaceC1002j interfaceC1002j = weakReference.get();
                if (interfaceC1002j == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo2307d |= interfaceC1002j.mo2307d();
                }
            }
            ArrayList<C1000h> arrayList = this.f3792i;
            ArrayList<C1000h> arrayList2 = this.f3793j;
            if (zMo2307d) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM2327l.size();
                for (int i = 0; i < size; i++) {
                    C1000h c1000h = arrayListM2327l.get(i);
                    if ((c1000h.f3837x & 32) == 32) {
                        arrayList.add(c1000h);
                    } else {
                        arrayList2.add(c1000h);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2327l());
            }
            this.f3794k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2322g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo2325j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: k */
    public C0998f mo2326k() {
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList<C1000h> m2327l() {
        boolean z = this.f3791h;
        ArrayList<C1000h> arrayList = this.f3790g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<C1000h> arrayList2 = this.f3789f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1000h c1000h = arrayList2.get(i);
            if (c1000h.isVisible()) {
                arrayList.add(c1000h);
            }
        }
        this.f3791h = false;
        this.f3794k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2328m() {
        return this.f3806w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo2329n() {
        return this.f3786c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo2330o() {
        return this.f3787d;
    }

    /* JADX INFO: renamed from: p */
    public final void m2331p(boolean z) {
        if (this.f3799p) {
            this.f3800q = true;
            if (z) {
                this.f3801r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f3791h = true;
            this.f3794k = true;
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> copyOnWriteArrayList = this.f3804u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2338w();
        for (WeakReference<InterfaceC1002j> weakReference : copyOnWriteArrayList) {
            InterfaceC1002j interfaceC1002j = weakReference.get();
            if (interfaceC1002j == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1002j.mo2308g();
            }
        }
        m2337v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m2332q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1000h c1000hM2322g = m2322g(i, keyEvent);
        boolean zM2332q = c1000hM2322g != null ? m2332q(c1000hM2322g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m2318c(true);
        }
        return zM2332q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2332q(MenuItem menuItem, InterfaceC1002j interfaceC1002j, int i) {
        boolean zExpandActionView;
        C1000h c1000h = (C1000h) menuItem;
        if (c1000h == null || !c1000h.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1000h.f3829p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1000h)) {
            C0998f c0998f = c1000h.f3827n;
            if (!c0998f.mo2320e(c0998f, c1000h)) {
                Intent intent = c1000h.f3820g;
                if (intent != null) {
                    try {
                        c0998f.f3784a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        AbstractC0290Q abstractC0290Q = c1000h.f3811A;
                        if (abstractC0290Q == null) {
                        }
                        AbstractC0290Q abstractC0290Q2 = c1000h.f3811A;
                        if (abstractC0290Q2 == null) {
                        }
                        if (!c1000h.m2341e()) {
                        }
                        return zExpandActionView;
                    }
                } else {
                    AbstractC0290Q abstractC0290Q3 = c1000h.f3811A;
                    zExpandActionView = abstractC0290Q3 == null && abstractC0290Q3.mo790e();
                }
            }
        }
        AbstractC0290Q abstractC0290Q22 = c1000h.f3811A;
        boolean z = abstractC0290Q22 == null && abstractC0290Q22.mo786a();
        if (!c1000h.m2341e()) {
            zExpandActionView |= c1000h.expandActionView();
            if (zExpandActionView) {
                m2318c(true);
            }
        } else if (c1000h.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m2318c(false);
            }
            if (!c1000h.hasSubMenu()) {
                SubMenuC1005m subMenuC1005m = new SubMenuC1005m(this.f3784a, this, c1000h);
                c1000h.f3828o = subMenuC1005m;
                subMenuC1005m.setHeaderTitle(c1000h.f3818e);
            }
            SubMenuC1005m subMenuC1005m2 = c1000h.f3828o;
            if (z) {
                abstractC0290Q22.mo791f(subMenuC1005m2);
            }
            CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> copyOnWriteArrayList = this.f3804u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo2310j = interfaceC1002j != null ? interfaceC1002j.mo2310j(subMenuC1005m2) : false;
                for (WeakReference<InterfaceC1002j> weakReference : copyOnWriteArrayList) {
                    InterfaceC1002j interfaceC1002j2 = weakReference.get();
                    if (interfaceC1002j2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo2310j) {
                        zMo2310j = interfaceC1002j2.mo2310j(subMenuC1005m2);
                    }
                }
            }
            zExpandActionView |= zMo2310j;
            if (!zExpandActionView) {
                m2318c(true);
            }
        } else if ((i & 1) == 0) {
            m2318c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m2333r(InterfaceC1002j interfaceC1002j) {
        CopyOnWriteArrayList<WeakReference<InterfaceC1002j>> copyOnWriteArrayList = this.f3804u;
        for (WeakReference<InterfaceC1002j> weakReference : copyOnWriteArrayList) {
            InterfaceC1002j interfaceC1002j2 = weakReference.get();
            if (interfaceC1002j2 == null || interfaceC1002j2 == interfaceC1002j) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (arrayList.get(i3).f3815b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || arrayList.get(i3).f3815b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList<C1000h> arrayList2 = this.f3789f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            m2331p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (arrayList.get(i2).f3814a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList<C1000h> arrayList2 = this.f3789f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            m2331p(true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2334s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2325j());
        int size = this.f3789f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1005m) item.getSubMenu()).m2334s(bundle);
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
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1000h c1000h = arrayList.get(i2);
            if (c1000h.f3815b == i) {
                c1000h.f3837x = (c1000h.f3837x & (-5)) | (z2 ? 4 : 0);
                c1000h.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f3806w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1000h c1000h = arrayList.get(i2);
            if (c1000h.f3815b == i) {
                c1000h.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList<C1000h> arrayList = this.f3789f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1000h c1000h = arrayList.get(i2);
            if (c1000h.f3815b == i) {
                int i3 = c1000h.f3837x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c1000h.f3837x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m2331p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f3786c = z;
        m2331p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3789f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m2335t(Bundle bundle) {
        int size = this.f3789f.size();
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
                ((SubMenuC1005m) item.getSubMenu()).m2335t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2325j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2336u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3798o = view;
            this.f3796m = null;
            this.f3797n = null;
        } else {
            if (i > 0) {
                this.f3796m = this.f3785b.getText(i);
            } else if (charSequence != null) {
                this.f3796m = charSequence;
            }
            if (i2 > 0) {
                this.f3797n = C0437Y3.a.m1093b(this.f3784a, i2);
            } else if (drawable != null) {
                this.f3797n = drawable;
            }
            this.f3798o = null;
        }
        m2331p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m2337v() {
        this.f3799p = false;
        if (this.f3800q) {
            this.f3800q = false;
            m2331p(this.f3801r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2338w() {
        if (this.f3799p) {
            return;
        }
        this.f3799p = true;
        this.f3800q = false;
        this.f3801r = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m2316a(0, 0, 0, this.f3785b.getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3785b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2316a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1000h c1000hM2316a = m2316a(i, i2, i3, charSequence);
        SubMenuC1005m subMenuC1005m = new SubMenuC1005m(this.f3784a, this, c1000hM2316a);
        c1000hM2316a.f3828o = subMenuC1005m;
        subMenuC1005m.setHeaderTitle(c1000hM2316a.f3818e);
        return subMenuC1005m;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m2316a(i, i2, i3, this.f3785b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3785b.getString(i4));
    }
}
