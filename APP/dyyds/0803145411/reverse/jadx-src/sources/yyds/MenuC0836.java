package yyds;

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
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: yyds.ᛴᛴᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0836 implements Menu {

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static final int[] f3821 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final ArrayList f3823;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f3824;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ArrayList f3825;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f3826;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public C1148 f3827;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public CharSequence f3829;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public boolean f3831;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public View f3833;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC1643 f3834;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ArrayList f3837;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final ArrayList f3838;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f3839;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f3841;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public Drawable f3842;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f3843;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Resources f3844;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f3822 = 0;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean f3830 = false;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f3840 = false;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean f3828 = false;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f3836 = false;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final ArrayList f3835 = new ArrayList();

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f3832 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public boolean f3845 = false;

    public MenuC0836(Context context) {
        boolean z = false;
        this.f3841 = context;
        Resources resources = context.getResources();
        this.f3844 = resources;
        this.f3823 = new ArrayList();
        this.f3825 = new ArrayList();
        this.f3839 = true;
        this.f3837 = new ArrayList();
        this.f3838 = new ArrayList();
        this.f3824 = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.f3843 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1900(0, 0, 0, this.f3844.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3841.getPackageManager();
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
            C1148 c1148M1900 = m1900(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c1148M1900.setIcon(resolveInfo.loadIcon(packageManager));
            c1148M1900.f5256 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c1148M1900;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1148 c1148M1900 = m1900(i, i2, i3, charSequence);
        SubMenuC1011 subMenuC1011 = new SubMenuC1011(this.f3841, this, c1148M1900);
        c1148M1900.f5264 = subMenuC1011;
        subMenuC1011.setHeaderTitle(c1148M1900.f5265);
        return subMenuC1011;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1148 c1148 = this.f3827;
        if (c1148 != null) {
            mo1917(c1148);
        }
        this.f3823.clear();
        m1915(true);
    }

    public final void clearHeader() {
        this.f3842 = null;
        this.f3829 = null;
        this.f3833 = null;
        m1915(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m1914(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f3823;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1148 c1148 = (C1148) arrayList.get(i2);
            if (c1148.f5275 == i) {
                return c1148;
            }
            if (c1148.hasSubMenu() && (menuItemFindItem = c1148.f5264.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3823.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3831) {
            return true;
        }
        ArrayList arrayList = this.f3823;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1148) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m1907(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m1906(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1148 c1148M1907 = m1907(i, keyEvent);
        boolean zM1906 = c1148M1907 != null ? m1906(c1148M1907, null, i2) : false;
        if ((i2 & 2) != 0) {
            m1914(true);
        }
        return zM1906;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3823;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1148) arrayList.get(i3)).f5278 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C1148) arrayList.get(i3)).f5278 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m1915(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f3823;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1148) arrayList.get(i2)).f5275 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m1915(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f3823;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1148 c1148 = (C1148) arrayList.get(i2);
            if (c1148.f5278 == i) {
                c1148.f5262 = (c1148.f5262 & (-5)) | (z2 ? 4 : 0);
                c1148.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f3845 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f3823;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1148 c1148 = (C1148) arrayList.get(i2);
            if (c1148.f5278 == i) {
                c1148.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f3823;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1148 c1148 = (C1148) arrayList.get(i2);
            if (c1148.f5278 == i) {
                int i3 = c1148.f5262;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c1148.f5262 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m1915(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f3826 = z;
        m1915(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3823.size();
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean mo1895() {
        return this.f3826;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m1896(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zMo1895 = mo1895();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f3823;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1148 c1148 = (C1148) arrayList2.get(i2);
                if (c1148.hasSubMenu()) {
                    c1148.f5264.m1896(arrayList, i, keyEvent);
                }
                char c = zMo1895 ? c1148.f5269 : c1148.f5271;
                if ((modifiers & 69647) == ((zMo1895 ? c1148.f5254 : c1148.f5268) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo1895 && c == '\b' && i == 67)) && c1148.isEnabled()) {
                        arrayList.add(c1148);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean mo1897() {
        return this.f3845;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m1898() {
        ArrayList arrayListM1911 = m1911();
        if (this.f3824) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3832;
            boolean zMo1501 = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0613 interfaceC0613 = (InterfaceC0613) weakReference.get();
                if (interfaceC0613 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1501 |= interfaceC0613.mo1501();
                }
            }
            ArrayList arrayList = this.f3837;
            ArrayList arrayList2 = this.f3838;
            if (zMo1501) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM1911.size();
                for (int i = 0; i < size; i++) {
                    C1148 c1148 = (C1148) arrayListM1911.get(i);
                    if ((c1148.f5262 & 32) == 32) {
                        arrayList.add(c1148);
                    } else {
                        arrayList2.add(c1148);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m1911());
            }
            this.f3824 = false;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean mo1899(MenuC0836 menuC0836, MenuItem menuItem) {
        InterfaceC1643 interfaceC1643 = this.f3834;
        return interfaceC1643 != null && interfaceC1643.mo381(menuC0836, menuItem);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1148 m1900(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C0188.m798("order does not contain a valid category.");
            return null;
        }
        int i6 = (f3821[i5] << 16) | (65535 & i3);
        C1148 c1148 = new C1148(this, i, i2, i3, i6, charSequence, this.f3822);
        ArrayList arrayList = this.f3823;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C1148) arrayList.get(size)).f5277 <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c1148);
        m1915(true);
        return c1148;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m1901(Bundle bundle) {
        int size = this.f3823.size();
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
                ((SubMenuC1011) item.getSubMenu()).m1901(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1912(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean mo1902() {
        return this.f3843;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m1903(InterfaceC0613 interfaceC0613) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3832;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0613 interfaceC06132 = (InterfaceC0613) weakReference.get();
            if (interfaceC06132 == null || interfaceC06132 == interfaceC0613) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1904(InterfaceC0613 interfaceC0613, Context context) {
        this.f3832.add(new WeakReference(interfaceC0613));
        interfaceC0613.mo1507(context, this);
        this.f3824 = true;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m1905() {
        if (this.f3830) {
            return;
        }
        this.f3830 = true;
        this.f3840 = false;
        this.f3828 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1906(MenuItem menuItem, InterfaceC0613 interfaceC0613, int i) {
        boolean zExpandActionView;
        C1148 c1148 = (C1148) menuItem;
        if (c1148 == null || !c1148.isEnabled()) {
            return false;
        }
        MenuC0836 menuC0836 = c1148.f5276;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1148.f5261;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1148)) && !menuC0836.mo1899(menuC0836, c1148)) {
            Intent intent = c1148.f5256;
            if (intent != null) {
                try {
                    menuC0836.f3841.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022 = c1148.f5251;
                    if (actionProviderVisibilityListenerC2022 == null) {
                    }
                    ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC20222 = c1148.f5251;
                    if (actionProviderVisibilityListenerC20222 == null) {
                    }
                    if (!c1148.m2337()) {
                    }
                    return zExpandActionView;
                }
            } else {
                ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC20223 = c1148.f5251;
                zExpandActionView = actionProviderVisibilityListenerC20223 == null && actionProviderVisibilityListenerC20223.f10095.onPerformDefaultAction();
            }
        }
        ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC202222 = c1148.f5251;
        boolean z = actionProviderVisibilityListenerC202222 == null && actionProviderVisibilityListenerC202222.f10095.hasSubMenu();
        if (!c1148.m2337()) {
            zExpandActionView |= c1148.expandActionView();
            if (zExpandActionView) {
                m1914(true);
            }
        } else if (c1148.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m1914(false);
            }
            if (!c1148.hasSubMenu()) {
                SubMenuC1011 subMenuC1011 = new SubMenuC1011(this.f3841, this, c1148);
                c1148.f5264 = subMenuC1011;
                subMenuC1011.setHeaderTitle(c1148.f5265);
            }
            SubMenuC1011 subMenuC10112 = c1148.f5264;
            if (z) {
                actionProviderVisibilityListenerC202222.f10095.onPrepareSubMenu(subMenuC10112);
            }
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3832;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo1505 = interfaceC0613 != null ? interfaceC0613.mo1505(subMenuC10112) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC0613 interfaceC06132 = (InterfaceC0613) weakReference.get();
                    if (interfaceC06132 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1505) {
                        zMo1505 = interfaceC06132.mo1505(subMenuC10112);
                    }
                }
            }
            zExpandActionView |= zMo1505;
            if (!zExpandActionView) {
                m1914(true);
            }
        } else if ((i & 1) == 0) {
            m1914(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1148 m1907(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3835;
        arrayList.clear();
        m1896(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1148) arrayList.get(0);
        }
        boolean zMo1895 = mo1895();
        for (int i2 = 0; i2 < size; i2++) {
            C1148 c1148 = (C1148) arrayList.get(i2);
            char c = zMo1895 ? c1148.f5269 : c1148.f5271;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo1895 && c == '\b' && i == 67))) {
                return c1148;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final void m1908() {
        this.f3830 = false;
        if (this.f3840) {
            this.f3840 = false;
            m1915(this.f3828);
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final void m1909(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3833 = view;
            this.f3829 = null;
            this.f3842 = null;
        } else {
            if (i > 0) {
                this.f3829 = this.f3844.getText(i);
            } else if (charSequence != null) {
                this.f3829 = charSequence;
            }
            if (i2 > 0) {
                this.f3842 = this.f3841.getDrawable(i2);
            } else if (drawable != null) {
                this.f3842 = drawable;
            }
            this.f3833 = null;
        }
        m1915(false);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public MenuC0836 mo1910() {
        return this;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final ArrayList m1911() {
        boolean z = this.f3839;
        ArrayList arrayList = this.f3825;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3823;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1148 c1148 = (C1148) arrayList2.get(i);
            if (c1148.isVisible()) {
                arrayList.add(c1148);
            }
        }
        this.f3839 = false;
        this.f3824 = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public String mo1912() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void m1913(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1912());
        int size = this.f3823.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1011) item.getSubMenu()).m1913(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m1914(boolean z) {
        if (this.f3836) {
            return;
        }
        this.f3836 = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3832;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0613 interfaceC0613 = (InterfaceC0613) weakReference.get();
            if (interfaceC0613 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0613.mo1504(this, z);
            }
        }
        this.f3836 = false;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m1915(boolean z) {
        if (this.f3830) {
            this.f3840 = true;
            if (z) {
                this.f3828 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f3839 = true;
            this.f3824 = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3832;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m1905();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0613 interfaceC0613 = (InterfaceC0613) weakReference.get();
            if (interfaceC0613 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0613.mo1503();
            }
        }
        m1908();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean mo1916(C1148 c1148) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3832;
        boolean zMo1506 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m1905();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0613 interfaceC0613 = (InterfaceC0613) weakReference.get();
            if (interfaceC0613 != null) {
                zMo1506 = interfaceC0613.mo1506(c1148);
                if (zMo1506) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m1908();
        if (zMo1506) {
            this.f3827 = c1148;
        }
        return zMo1506;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean mo1917(C1148 c1148) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3832;
        boolean zMo1502 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3827 == c1148) {
            m1905();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0613 interfaceC0613 = (InterfaceC0613) weakReference.get();
                if (interfaceC0613 != null) {
                    zMo1502 = interfaceC0613.mo1502(c1148);
                    if (zMo1502) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m1908();
            if (zMo1502) {
                this.f3827 = null;
            }
        }
        return zMo1502;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1900(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1900(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1900(i, i2, i3, this.f3844.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3844.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3844.getString(i4));
    }
}
