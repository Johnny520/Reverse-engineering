package p000;

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

/* JADX INFO: renamed from: lr */
/* JADX INFO: loaded from: classes.dex */
public class MenuC2204lr implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f7659y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f7660a;

    /* JADX INFO: renamed from: b */
    public final Resources f7661b;

    /* JADX INFO: renamed from: c */
    public boolean f7662c;

    /* JADX INFO: renamed from: d */
    public final boolean f7663d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2113jr f7664e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f7665f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7666g;

    /* JADX INFO: renamed from: h */
    public boolean f7667h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f7668i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f7669j;

    /* JADX INFO: renamed from: k */
    public boolean f7670k;

    /* JADX INFO: renamed from: m */
    public CharSequence f7672m;

    /* JADX INFO: renamed from: n */
    public Drawable f7673n;

    /* JADX INFO: renamed from: o */
    public View f7674o;

    /* JADX INFO: renamed from: v */
    public C2427qr f7681v;

    /* JADX INFO: renamed from: x */
    public boolean f7683x;

    /* JADX INFO: renamed from: l */
    public int f7671l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f7675p = false;

    /* JADX INFO: renamed from: q */
    public boolean f7676q = false;

    /* JADX INFO: renamed from: r */
    public boolean f7677r = false;

    /* JADX INFO: renamed from: s */
    public boolean f7678s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f7679t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f7680u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f7682w = false;

    public MenuC2204lr(Context context) {
        boolean z = false;
        this.f7660a = context;
        Resources resources = context.getResources();
        this.f7661b = resources;
        this.f7665f = new ArrayList();
        this.f7666g = new ArrayList();
        this.f7667h = true;
        this.f7668i = new ArrayList();
        this.f7669j = new ArrayList();
        this.f7670k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.f7663d = z;
    }

    /* JADX INFO: renamed from: a */
    public final C2427qr m4428a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f7659y[i5] << 16) | (65535 & i3);
        C2427qr c2427qr = new C2427qr(this, i, i2, i3, i6, charSequence, this.f7671l);
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C2427qr) arrayList.get(size)).f8495d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c2427qr);
        m4435p(true);
        return c2427qr;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m4428a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f7660a.getPackageManager();
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
            C2427qr c2427qrM4428a = m4428a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c2427qrM4428a.setIcon(resolveInfo.loadIcon(packageManager));
            c2427qrM4428a.f8498g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c2427qrM4428a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m4429b(InterfaceC0163Dr interfaceC0163Dr, Context context) {
        this.f7680u.add(new WeakReference(interfaceC0163Dr));
        interfaceC0163Dr.mo220i(context, this);
        this.f7670k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4430c(boolean z) {
        if (this.f7678s) {
            return;
        }
        this.f7678s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7680u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0163Dr interfaceC0163Dr = (InterfaceC0163Dr) weakReference.get();
            if (interfaceC0163Dr == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0163Dr.mo213b(this, z);
            }
        }
        this.f7678s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C2427qr c2427qr = this.f7681v;
        if (c2427qr != null) {
            mo426d(c2427qr);
        }
        this.f7665f.clear();
        m4435p(true);
    }

    public final void clearHeader() {
        this.f7673n = null;
        this.f7672m = null;
        this.f7674o = null;
        m4435p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m4430c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo426d(C2427qr c2427qr) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7680u;
        boolean zMo215d = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f7681v == c2427qr) {
            m4442w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0163Dr interfaceC0163Dr = (InterfaceC0163Dr) weakReference.get();
                if (interfaceC0163Dr != null) {
                    zMo215d = interfaceC0163Dr.mo215d(c2427qr);
                    if (zMo215d) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m4441v();
            if (zMo215d) {
                this.f7681v = null;
            }
        }
        return zMo215d;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo427e(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        InterfaceC2113jr interfaceC2113jr = this.f7664e;
        return interfaceC2113jr != null && interfaceC2113jr.mo233d(menuC2204lr, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo428f(C2427qr c2427qr) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7680u;
        boolean zMo217f = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m4442w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0163Dr interfaceC0163Dr = (InterfaceC0163Dr) weakReference.get();
            if (interfaceC0163Dr != null) {
                zMo217f = interfaceC0163Dr.mo217f(c2427qr);
                if (zMo217f) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m4441v();
        if (zMo217f) {
            this.f7681v = c2427qr;
        }
        return zMo217f;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2427qr c2427qr = (C2427qr) arrayList.get(i2);
            if (c2427qr.f8492a == i) {
                return c2427qr;
            }
            if (c2427qr.hasSubMenu() && (menuItemFindItem = c2427qr.f8506o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C2427qr m4431g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7679t;
        arrayList.clear();
        m4432h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C2427qr) arrayList.get(0);
        }
        boolean zMo432n = mo432n();
        for (int i2 = 0; i2 < size; i2++) {
            C2427qr c2427qr = (C2427qr) arrayList.get(i2);
            char c = zMo432n ? c2427qr.f8501j : c2427qr.f8499h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo432n && c == '\b' && i == 67))) {
                return c2427qr;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f7665f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m4432h(List list, int i, KeyEvent keyEvent) {
        boolean zMo432n = mo432n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f7665f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2427qr c2427qr = (C2427qr) arrayList.get(i2);
                if (c2427qr.hasSubMenu()) {
                    c2427qr.f8506o.m4432h(list, i, keyEvent);
                }
                char c = zMo432n ? c2427qr.f8501j : c2427qr.f8499h;
                if ((modifiers & 69647) == ((zMo432n ? c2427qr.f8502k : c2427qr.f8500i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo432n && c == '\b' && i == 67)) && c2427qr.isEnabled()) {
                        list.add(c2427qr);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f7683x) {
            return true;
        }
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C2427qr) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m4433i() {
        ArrayList arrayListM4434l = m4434l();
        if (this.f7670k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7680u;
            boolean zMo222k = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0163Dr interfaceC0163Dr = (InterfaceC0163Dr) weakReference.get();
                if (interfaceC0163Dr == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo222k |= interfaceC0163Dr.mo222k();
                }
            }
            ArrayList arrayList = this.f7668i;
            ArrayList arrayList2 = this.f7669j;
            if (zMo222k) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM4434l.size();
                for (int i = 0; i < size; i++) {
                    C2427qr c2427qr = (C2427qr) arrayListM4434l.get(i);
                    if ((c2427qr.f8515x & 32) == 32) {
                        arrayList.add(c2427qr);
                    } else {
                        arrayList2.add(c2427qr);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m4434l());
            }
            this.f7670k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m4431g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo429j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: k */
    public MenuC2204lr mo430k() {
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m4434l() {
        boolean z = this.f7667h;
        ArrayList arrayList = this.f7666g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f7665f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C2427qr c2427qr = (C2427qr) arrayList2.get(i);
            if (c2427qr.isVisible()) {
                arrayList.add(c2427qr);
            }
        }
        this.f7667h = false;
        this.f7670k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo431m() {
        return this.f7682w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo432n() {
        return this.f7662c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo433o() {
        return this.f7663d;
    }

    /* JADX INFO: renamed from: p */
    public final void m4435p(boolean z) {
        if (this.f7675p) {
            this.f7676q = true;
            if (z) {
                this.f7677r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f7667h = true;
            this.f7670k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7680u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m4442w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0163Dr interfaceC0163Dr = (InterfaceC0163Dr) weakReference.get();
            if (interfaceC0163Dr == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0163Dr.mo218g();
            }
        }
        m4441v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m4436q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C2427qr c2427qrM4431g = m4431g(i, keyEvent);
        boolean zM4436q = c2427qrM4431g != null ? m4436q(c2427qrM4431g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m4430c(true);
        }
        return zM4436q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4436q(MenuItem menuItem, InterfaceC0163Dr interfaceC0163Dr, int i) {
        boolean zExpandActionView;
        C2427qr c2427qr = (C2427qr) menuItem;
        if (c2427qr == null || !c2427qr.isEnabled()) {
            return false;
        }
        MenuC2204lr menuC2204lr = c2427qr.f8505n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c2427qr.f8507p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c2427qr)) && !menuC2204lr.mo427e(menuC2204lr, c2427qr)) {
            Intent intent = c2427qr.f8498g;
            if (intent != null) {
                try {
                    menuC2204lr.f7660a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr = c2427qr.f8489A;
                    if (actionProviderVisibilityListenerC2470rr == null) {
                    }
                    ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr2 = c2427qr.f8489A;
                    if (actionProviderVisibilityListenerC2470rr2 == null) {
                    }
                    if (!c2427qr.m4860e()) {
                    }
                    return zExpandActionView;
                }
            } else {
                ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr3 = c2427qr.f8489A;
                zExpandActionView = actionProviderVisibilityListenerC2470rr3 == null && actionProviderVisibilityListenerC2470rr3.f8695b.onPerformDefaultAction();
            }
        }
        ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr22 = c2427qr.f8489A;
        boolean z = actionProviderVisibilityListenerC2470rr22 == null && actionProviderVisibilityListenerC2470rr22.f8695b.hasSubMenu();
        if (!c2427qr.m4860e()) {
            zExpandActionView |= c2427qr.expandActionView();
            if (zExpandActionView) {
                m4430c(true);
            }
        } else if (c2427qr.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m4430c(false);
            }
            if (!c2427qr.hasSubMenu()) {
                SubMenuC0214Ez subMenuC0214Ez = new SubMenuC0214Ez(this.f7660a, this, c2427qr);
                c2427qr.f8506o = subMenuC0214Ez;
                subMenuC0214Ez.setHeaderTitle(c2427qr.f8496e);
            }
            SubMenuC0214Ez subMenuC0214Ez2 = c2427qr.f8506o;
            if (z) {
                actionProviderVisibilityListenerC2470rr22.f8695b.onPrepareSubMenu(subMenuC0214Ez2);
            }
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7680u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo221j = interfaceC0163Dr != null ? interfaceC0163Dr.mo221j(subMenuC0214Ez2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC0163Dr interfaceC0163Dr2 = (InterfaceC0163Dr) weakReference.get();
                    if (interfaceC0163Dr2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo221j) {
                        zMo221j = interfaceC0163Dr2.mo221j(subMenuC0214Ez2);
                    }
                }
            }
            zExpandActionView |= zMo221j;
            if (!zExpandActionView) {
                m4430c(true);
            }
        } else if ((i & 1) == 0) {
            m4430c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m4437r(InterfaceC0163Dr interfaceC0163Dr) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7680u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0163Dr interfaceC0163Dr2 = (InterfaceC0163Dr) weakReference.get();
            if (interfaceC0163Dr2 == null || interfaceC0163Dr2 == interfaceC0163Dr) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C2427qr) arrayList.get(i3)).f8493b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C2427qr) arrayList.get(i3)).f8493b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m4435p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C2427qr) arrayList.get(i2)).f8492a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m4435p(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m4438s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo429j());
        int size = this.f7665f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0214Ez) item.getSubMenu()).m4438s(bundle);
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
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2427qr c2427qr = (C2427qr) arrayList.get(i2);
            if (c2427qr.f8493b == i) {
                c2427qr.f8515x = (c2427qr.f8515x & (-5)) | (z2 ? 4 : 0);
                c2427qr.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f7682w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2427qr c2427qr = (C2427qr) arrayList.get(i2);
            if (c2427qr.f8493b == i) {
                c2427qr.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f7665f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C2427qr c2427qr = (C2427qr) arrayList.get(i2);
            if (c2427qr.f8493b == i) {
                int i3 = c2427qr.f8515x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c2427qr.f8515x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m4435p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f7662c = z;
        m4435p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7665f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m4439t(Bundle bundle) {
        int size = this.f7665f.size();
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
                ((SubMenuC0214Ez) item.getSubMenu()).m4439t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo429j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4440u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f7674o = view;
            this.f7672m = null;
            this.f7673n = null;
        } else {
            if (i > 0) {
                this.f7672m = this.f7661b.getText(i);
            } else if (charSequence != null) {
                this.f7672m = charSequence;
            }
            if (i2 > 0) {
                this.f7673n = this.f7660a.getDrawable(i2);
            } else if (drawable != null) {
                this.f7673n = drawable;
            }
            this.f7674o = null;
        }
        m4435p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m4441v() {
        this.f7675p = false;
        if (this.f7676q) {
            this.f7676q = false;
            m4435p(this.f7677r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m4442w() {
        if (this.f7675p) {
            return;
        }
        this.f7675p = true;
        this.f7676q = false;
        this.f7677r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m4428a(0, 0, 0, this.f7661b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f7661b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m4428a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C2427qr c2427qrM4428a = m4428a(i, i2, i3, charSequence);
        SubMenuC0214Ez subMenuC0214Ez = new SubMenuC0214Ez(this.f7660a, this, c2427qrM4428a);
        c2427qrM4428a.f8506o = subMenuC0214Ez;
        subMenuC0214Ez.setHeaderTitle(c2427qrM4428a.f8496e);
        return subMenuC0214Ez;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m4428a(i, i2, i3, this.f7661b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f7661b.getString(i4));
    }
}
