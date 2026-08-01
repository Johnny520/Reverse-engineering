package p190;

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
import androidx.core.view.AbstractC2262;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MenuC7802 implements Menu {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f21245 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C7800 f21247;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f21248;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f21249;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Drawable f21250;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f21251;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f21253;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ArrayList f21254;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7797 f21261;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f21262;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f21263;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ArrayList f21264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f21265;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f21266;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f21267;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f21268;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f21269;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f21252 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f21260 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f21259 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21258 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f21257 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final ArrayList f21256 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final CopyOnWriteArrayList f21255 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21246 = false;

    public MenuC7802(Context context) {
        boolean zM4215;
        boolean z = false;
        this.f21269 = context;
        Resources resources = context.getResources();
        this.f21267 = resources;
        this.f21265 = new ArrayList();
        this.f21266 = new ArrayList();
        this.f21263 = true;
        this.f21264 = new ArrayList();
        this.f21254 = new ArrayList();
        this.f21253 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM4215 = AbstractC2262.m4215(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM4215 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM4215) {
                z = true;
            }
        }
        this.f21262 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m13156(0, 0, 0, this.f21267.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f21269.getPackageManager();
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
            C7800 c7800M13156 = m13156(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c7800M13156.setIcon(resolveInfo.loadIcon(packageManager));
            c7800M13156.f21241 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c7800M13156;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C7800 c7800M13156 = m13156(i, i2, i3, charSequence);
        SubMenuC7775 subMenuC7775 = new SubMenuC7775(this.f21269, this, c7800M13156);
        c7800M13156.f21224 = subMenuC7775;
        subMenuC7775.setHeaderTitle(c7800M13156.f21236);
        return subMenuC7775;
    }

    @Override // android.view.Menu
    public final void clear() {
        C7800 c7800 = this.f21247;
        if (c7800 != null) {
            mo13127(c7800);
        }
        this.f21265.clear();
        m13164(true);
    }

    public final void clearHeader() {
        this.f21250 = null;
        this.f21251 = null;
        this.f21249 = null;
        m13164(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m13154(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f21265;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7800 c7800 = (C7800) arrayList.get(i2);
            if (c7800.f21244 == i) {
                return c7800;
            }
            if (c7800.hasSubMenu() && (menuItemFindItem = c7800.f21224.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f21265.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f21248) {
            return true;
        }
        ArrayList arrayList = this.f21265;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C7800) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m13166(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m13162(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C7800 c7800M13166 = m13166(i, keyEvent);
        boolean zM13162 = c7800M13166 != null ? m13162(c7800M13166, null, i2) : false;
        if ((i2 & 2) != 0) {
            m13154(true);
        }
        return zM13162;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f21265;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C7800) arrayList.get(i3)).f21242 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C7800) arrayList.get(i3)).f21242 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m13164(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f21265;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C7800) arrayList.get(i2)).f21244 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m13164(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f21265;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7800 c7800 = (C7800) arrayList.get(i2);
            if (c7800.f21242 == i) {
                c7800.f21223 = (c7800.f21223 & (-5)) | (z2 ? 4 : 0);
                c7800.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f21246 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f21265;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7800 c7800 = (C7800) arrayList.get(i2);
            if (c7800.f21242 == i) {
                c7800.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f21265;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C7800 c7800 = (C7800) arrayList.get(i2);
            if (c7800.f21242 == i) {
                int i3 = c7800.f21223;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c7800.f21223 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m13164(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f21268 = z;
        m13164(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f21265.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo13125(C7800 c7800) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21255;
        boolean zMo615 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m13159();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7790 interfaceC7790 = (InterfaceC7790) weakReference.get();
            if (interfaceC7790 != null) {
                zMo615 = interfaceC7790.mo615(c7800);
                if (zMo615) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m13161();
        if (zMo615) {
            this.f21247 = c7800;
        }
        return zMo615;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo13126(MenuC7802 menuC7802, MenuItem menuItem) {
        InterfaceC7797 interfaceC7797 = this.f21261;
        return interfaceC7797 != null && interfaceC7797.mo205(menuC7802, menuItem);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo13127(C7800 c7800) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21255;
        boolean zMo610 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f21247 == c7800) {
            m13159();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC7790 interfaceC7790 = (InterfaceC7790) weakReference.get();
                if (interfaceC7790 != null) {
                    zMo610 = interfaceC7790.mo610(c7800);
                    if (zMo610) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m13161();
            if (zMo610) {
                this.f21247 = null;
            }
        }
        return zMo610;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13154(boolean z) {
        if (this.f21257) {
            return;
        }
        this.f21257 = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21255;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7790 interfaceC7790 = (InterfaceC7790) weakReference.get();
            if (interfaceC7790 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC7790.mo613(this, z);
            }
        }
        this.f21257 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13155(InterfaceC7790 interfaceC7790, Context context) {
        this.f21255.add(new WeakReference(interfaceC7790));
        interfaceC7790.mo611(context, this);
        this.f21253 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7800 m13156(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C5925.m11310("order does not contain a valid category.");
            return null;
        }
        int i6 = (f21245[i5] << 16) | (65535 & i3);
        C7800 c7800 = new C7800(this, i, i2, i3, i6, charSequence, this.f21252);
        ArrayList arrayList = this.f21265;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C7800) arrayList.get(size)).f21237 <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c7800);
        m13164(true);
        return c7800;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13157(Bundle bundle) {
        int size = this.f21265.size();
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
                ((SubMenuC7775) item.getSubMenu()).m13157(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo13132(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13158(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo13132());
        int size = this.f21265.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC7775) item.getSubMenu()).m13158(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m13159() {
        if (this.f21260) {
            return;
        }
        this.f21260 = true;
        this.f21259 = false;
        this.f21258 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m13160(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f21249 = view;
            this.f21251 = null;
            this.f21250 = null;
        } else {
            if (i > 0) {
                this.f21251 = this.f21267.getText(i);
            } else if (charSequence != null) {
                this.f21251 = charSequence;
            }
            if (i2 > 0) {
                this.f21250 = this.f21269.getDrawable(i2);
            } else if (drawable != null) {
                this.f21250 = drawable;
            }
            this.f21249 = null;
        }
        m13164(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m13161() {
        this.f21260 = false;
        if (this.f21259) {
            this.f21259 = false;
            m13164(this.f21258);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo13128() {
        return this.f21268;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo13129() {
        return this.f21246;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13162(android.view.MenuItem r7, p190.InterfaceC7790 r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p190.MenuC7802.m13162(android.view.MenuItem, 飘花落叶言子楪苏兰世哲.飘花落叶言子楪兰苏哲世, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13163(InterfaceC7790 interfaceC7790) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21255;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7790 interfaceC77902 = (InterfaceC7790) weakReference.get();
            if (interfaceC77902 == null || interfaceC77902 == interfaceC7790) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo13130() {
        return this.f21262;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13164(boolean z) {
        if (this.f21260) {
            this.f21259 = true;
            if (z) {
                this.f21258 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f21263 = true;
            this.f21253 = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21255;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m13159();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7790 interfaceC7790 = (InterfaceC7790) weakReference.get();
            if (interfaceC7790 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC7790.mo614();
            }
        }
        m13161();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13165(List list, int i, KeyEvent keyEvent) {
        boolean zMo13128 = mo13128();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f21265;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7800 c7800 = (C7800) arrayList.get(i2);
                if (c7800.hasSubMenu()) {
                    c7800.f21224.m13165(list, i, keyEvent);
                }
                char c = zMo13128 ? c7800.f21229 : c7800.f21238;
                if ((modifiers & 69647) == ((zMo13128 ? c7800.f21228 : c7800.f21239) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo13128 && c == '\b' && i == 67)) && c7800.isEnabled()) {
                        list.add(c7800);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7800 m13166(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f21256;
        arrayList.clear();
        m13165(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C7800) arrayList.get(0);
        }
        boolean zMo13128 = mo13128();
        for (int i2 = 0; i2 < size; i2++) {
            C7800 c7800 = (C7800) arrayList.get(i2);
            char c = zMo13128 ? c7800.f21229 : c7800.f21238;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo13128 && c == '\b' && i == 67))) {
                return c7800;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList m13167() {
        boolean z = this.f21263;
        ArrayList arrayList = this.f21266;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f21265;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C7800 c7800 = (C7800) arrayList2.get(i);
            if (c7800.isVisible()) {
                arrayList.add(c7800);
            }
        }
        this.f21263 = false;
        this.f21253 = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13168() {
        ArrayList arrayListM13167 = m13167();
        if (this.f21253) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21255;
            boolean zMo609 = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC7790 interfaceC7790 = (InterfaceC7790) weakReference.get();
                if (interfaceC7790 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo609 |= interfaceC7790.mo609();
                }
            }
            ArrayList arrayList = this.f21264;
            ArrayList arrayList2 = this.f21254;
            if (zMo609) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM13167.size();
                for (int i = 0; i < size; i++) {
                    C7800 c7800 = (C7800) arrayListM13167.get(i);
                    if ((c7800.f21223 & 32) == 32) {
                        arrayList.add(c7800);
                    } else {
                        arrayList2.add(c7800);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m13167());
            }
            this.f21253 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public String mo13132() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m13156(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m13156(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m13156(i, i2, i3, this.f21267.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f21267.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public MenuC7802 mo13131() {
        return this;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f21267.getString(i4));
    }
}
