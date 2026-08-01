package p206;

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
import androidx.core.view.AbstractC3095;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MenuC8631 implements Menu {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f21590 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C8629 f21592;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f21593;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f21594;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Drawable f21595;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f21596;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f21598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ArrayList f21599;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC8626 f21606;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f21607;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f21608;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ArrayList f21609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f21610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f21611;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f21612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f21613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f21614;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f21597 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f21605 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f21604 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21603 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f21602 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final ArrayList f21601 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final CopyOnWriteArrayList f21600 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21591 = false;

    public MenuC8631(Context context) {
        boolean zM4775;
        boolean z = false;
        this.f21614 = context;
        Resources resources = context.getResources();
        this.f21612 = resources;
        this.f21610 = new ArrayList();
        this.f21611 = new ArrayList();
        this.f21608 = true;
        this.f21609 = new ArrayList();
        this.f21599 = new ArrayList();
        this.f21598 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM4775 = AbstractC3095.m4775(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM4775 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM4775) {
                z = true;
            }
        }
        this.f21607 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m13715(0, 0, 0, this.f21612.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f21614.getPackageManager();
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
            C8629 c8629M13715 = m13715(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c8629M13715.setIcon(resolveInfo.loadIcon(packageManager));
            c8629M13715.f21586 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c8629M13715;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C8629 c8629M13715 = m13715(i, i2, i3, charSequence);
        SubMenuC8604 subMenuC8604 = new SubMenuC8604(this.f21614, this, c8629M13715);
        c8629M13715.f21569 = subMenuC8604;
        subMenuC8604.setHeaderTitle(c8629M13715.f21581);
        return subMenuC8604;
    }

    @Override // android.view.Menu
    public final void clear() {
        C8629 c8629 = this.f21592;
        if (c8629 != null) {
            mo13686(c8629);
        }
        this.f21610.clear();
        m13723(true);
    }

    public final void clearHeader() {
        this.f21595 = null;
        this.f21596 = null;
        this.f21594 = null;
        m13723(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m13713(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f21610;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8629 c8629 = (C8629) arrayList.get(i2);
            if (c8629.f21589 == i) {
                return c8629;
            }
            if (c8629.hasSubMenu() && (menuItemFindItem = c8629.f21569.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f21610.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f21593) {
            return true;
        }
        ArrayList arrayList = this.f21610;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C8629) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m13725(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m13721(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C8629 c8629M13725 = m13725(i, keyEvent);
        boolean zM13721 = c8629M13725 != null ? m13721(c8629M13725, null, i2) : false;
        if ((i2 & 2) != 0) {
            m13713(true);
        }
        return zM13721;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f21610;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C8629) arrayList.get(i3)).f21587 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C8629) arrayList.get(i3)).f21587 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m13723(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f21610;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C8629) arrayList.get(i2)).f21589 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m13723(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f21610;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8629 c8629 = (C8629) arrayList.get(i2);
            if (c8629.f21587 == i) {
                c8629.f21568 = (c8629.f21568 & (-5)) | (z2 ? 4 : 0);
                c8629.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f21591 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f21610;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8629 c8629 = (C8629) arrayList.get(i2);
            if (c8629.f21587 == i) {
                c8629.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f21610;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C8629 c8629 = (C8629) arrayList.get(i2);
            if (c8629.f21587 == i) {
                int i3 = c8629.f21568;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c8629.f21568 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m13723(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f21613 = z;
        m13723(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f21610.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo13684(C8629 c8629) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21600;
        boolean zMo1175 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m13718();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC8619 interfaceC8619 = (InterfaceC8619) weakReference.get();
            if (interfaceC8619 != null) {
                zMo1175 = interfaceC8619.mo1175(c8629);
                if (zMo1175) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m13720();
        if (zMo1175) {
            this.f21592 = c8629;
        }
        return zMo1175;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo13685(MenuC8631 menuC8631, MenuItem menuItem) {
        InterfaceC8626 interfaceC8626 = this.f21606;
        return interfaceC8626 != null && interfaceC8626.mo765(menuC8631, menuItem);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo13686(C8629 c8629) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21600;
        boolean zMo1170 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f21592 == c8629) {
            m13718();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC8619 interfaceC8619 = (InterfaceC8619) weakReference.get();
                if (interfaceC8619 != null) {
                    zMo1170 = interfaceC8619.mo1170(c8629);
                    if (zMo1170) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m13720();
            if (zMo1170) {
                this.f21592 = null;
            }
        }
        return zMo1170;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13713(boolean z) {
        if (this.f21602) {
            return;
        }
        this.f21602 = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21600;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC8619 interfaceC8619 = (InterfaceC8619) weakReference.get();
            if (interfaceC8619 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC8619.mo1173(this, z);
            }
        }
        this.f21602 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13714(InterfaceC8619 interfaceC8619, Context context) {
        this.f21600.add(new WeakReference(interfaceC8619));
        interfaceC8619.mo1171(context, this);
        this.f21598 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8629 m13715(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C6755.m11869("order does not contain a valid category.");
            return null;
        }
        int i6 = (f21590[i5] << 16) | (65535 & i3);
        C8629 c8629 = new C8629(this, i, i2, i3, i6, charSequence, this.f21597);
        ArrayList arrayList = this.f21610;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C8629) arrayList.get(size)).f21582 <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c8629);
        m13723(true);
        return c8629;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13716(Bundle bundle) {
        int size = this.f21610.size();
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
                ((SubMenuC8604) item.getSubMenu()).m13716(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo13691(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13717(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo13691());
        int size = this.f21610.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC8604) item.getSubMenu()).m13717(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m13718() {
        if (this.f21605) {
            return;
        }
        this.f21605 = true;
        this.f21604 = false;
        this.f21603 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m13719(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f21594 = view;
            this.f21596 = null;
            this.f21595 = null;
        } else {
            if (i > 0) {
                this.f21596 = this.f21612.getText(i);
            } else if (charSequence != null) {
                this.f21596 = charSequence;
            }
            if (i2 > 0) {
                this.f21595 = this.f21614.getDrawable(i2);
            } else if (drawable != null) {
                this.f21595 = drawable;
            }
            this.f21594 = null;
        }
        m13723(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m13720() {
        this.f21605 = false;
        if (this.f21604) {
            this.f21604 = false;
            m13723(this.f21603);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo13687() {
        return this.f21613;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo13688() {
        return this.f21591;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m13721(MenuItem menuItem, InterfaceC8619 interfaceC8619, int i) {
        boolean zExpandActionView;
        C8629 c8629 = (C8629) menuItem;
        if (c8629 == null || !c8629.isEnabled()) {
            return false;
        }
        MenuC8631 menuC8631 = c8629.f21570;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c8629.f21580;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c8629)) && !menuC8631.mo13685(menuC8631, c8629)) {
            Intent intent = c8629.f21586;
            if (intent != null) {
                try {
                    menuC8631.f21614.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621 = c8629.f21564;
                    if (actionProviderVisibilityListenerC8621 == null) {
                    }
                    ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC86212 = c8629.f21564;
                    if (actionProviderVisibilityListenerC86212 == null) {
                    }
                    if (!c8629.m13711()) {
                    }
                    return zExpandActionView;
                }
            } else {
                ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC86213 = c8629.f21564;
                zExpandActionView = actionProviderVisibilityListenerC86213 == null && actionProviderVisibilityListenerC86213.f21543.onPerformDefaultAction();
            }
        }
        ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC862122 = c8629.f21564;
        boolean z = actionProviderVisibilityListenerC862122 == null && actionProviderVisibilityListenerC862122.f21543.hasSubMenu();
        if (!c8629.m13711()) {
            zExpandActionView |= c8629.expandActionView();
            if (zExpandActionView) {
                m13713(true);
            }
        } else if (c8629.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m13713(false);
            }
            if (!c8629.hasSubMenu()) {
                SubMenuC8604 subMenuC8604 = new SubMenuC8604(this.f21614, this, c8629);
                c8629.f21569 = subMenuC8604;
                subMenuC8604.setHeaderTitle(c8629.f21581);
            }
            SubMenuC8604 subMenuC86042 = c8629.f21569;
            if (z) {
                actionProviderVisibilityListenerC862122.f21543.onPrepareSubMenu(subMenuC86042);
            }
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21600;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo1172 = interfaceC8619 != null ? interfaceC8619.mo1172(subMenuC86042) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC8619 interfaceC86192 = (InterfaceC8619) weakReference.get();
                    if (interfaceC86192 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1172) {
                        zMo1172 = interfaceC86192.mo1172(subMenuC86042);
                    }
                }
            }
            zExpandActionView |= zMo1172;
            if (!zExpandActionView) {
                m13713(true);
            }
        } else if ((i & 1) == 0) {
            m13713(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13722(InterfaceC8619 interfaceC8619) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21600;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC8619 interfaceC86192 = (InterfaceC8619) weakReference.get();
            if (interfaceC86192 == null || interfaceC86192 == interfaceC8619) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo13689() {
        return this.f21607;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13723(boolean z) {
        if (this.f21605) {
            this.f21604 = true;
            if (z) {
                this.f21603 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f21608 = true;
            this.f21598 = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21600;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m13718();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC8619 interfaceC8619 = (InterfaceC8619) weakReference.get();
            if (interfaceC8619 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC8619.mo1174();
            }
        }
        m13720();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13724(List list, int i, KeyEvent keyEvent) {
        boolean zMo13687 = mo13687();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f21610;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8629 c8629 = (C8629) arrayList.get(i2);
                if (c8629.hasSubMenu()) {
                    c8629.f21569.m13724(list, i, keyEvent);
                }
                char c = zMo13687 ? c8629.f21574 : c8629.f21583;
                if ((modifiers & 69647) == ((zMo13687 ? c8629.f21573 : c8629.f21584) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo13687 && c == '\b' && i == 67)) && c8629.isEnabled()) {
                        list.add(c8629);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8629 m13725(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f21601;
        arrayList.clear();
        m13724(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C8629) arrayList.get(0);
        }
        boolean zMo13687 = mo13687();
        for (int i2 = 0; i2 < size; i2++) {
            C8629 c8629 = (C8629) arrayList.get(i2);
            char c = zMo13687 ? c8629.f21574 : c8629.f21583;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo13687 && c == '\b' && i == 67))) {
                return c8629;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList m13726() {
        boolean z = this.f21608;
        ArrayList arrayList = this.f21611;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f21610;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C8629 c8629 = (C8629) arrayList2.get(i);
            if (c8629.isVisible()) {
                arrayList.add(c8629);
            }
        }
        this.f21608 = false;
        this.f21598 = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13727() {
        ArrayList arrayListM13726 = m13726();
        if (this.f21598) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21600;
            boolean zMo1169 = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC8619 interfaceC8619 = (InterfaceC8619) weakReference.get();
                if (interfaceC8619 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1169 |= interfaceC8619.mo1169();
                }
            }
            ArrayList arrayList = this.f21609;
            ArrayList arrayList2 = this.f21599;
            if (zMo1169) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM13726.size();
                for (int i = 0; i < size; i++) {
                    C8629 c8629 = (C8629) arrayListM13726.get(i);
                    if ((c8629.f21568 & 32) == 32) {
                        arrayList.add(c8629);
                    } else {
                        arrayList2.add(c8629);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m13726());
            }
            this.f21598 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public String mo13691() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m13715(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m13715(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m13715(i, i2, i3, this.f21612.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f21612.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public MenuC8631 mo13690() {
        return this;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f21612.getString(i4));
    }
}
