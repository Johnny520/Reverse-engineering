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
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MenuC7801 implements Menu {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f21248 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C7799 f21250;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f21251;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f21252;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Drawable f21253;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f21254;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f21256;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ArrayList f21257;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7796 f21264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f21265;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f21266;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ArrayList f21267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f21268;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f21269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f21270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f21271;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f21272;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f21255 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f21263 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f21262 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21261 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f21260 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final ArrayList f21259 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final CopyOnWriteArrayList f21258 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21249 = false;

    public MenuC7801(Context context) {
        boolean zM4205;
        boolean z = false;
        this.f21272 = context;
        Resources resources = context.getResources();
        this.f21270 = resources;
        this.f21268 = new ArrayList();
        this.f21269 = new ArrayList();
        this.f21266 = true;
        this.f21267 = new ArrayList();
        this.f21257 = new ArrayList();
        this.f21256 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM4205 = AbstractC2262.m4205(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM4205 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM4205) {
                z = true;
            }
        }
        this.f21265 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m13128(0, 0, 0, this.f21270.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f21272.getPackageManager();
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
            C7799 c7799M13128 = m13128(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c7799M13128.setIcon(resolveInfo.loadIcon(packageManager));
            c7799M13128.f21244 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c7799M13128;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C7799 c7799M13128 = m13128(i, i2, i3, charSequence);
        SubMenuC7774 subMenuC7774 = new SubMenuC7774(this.f21272, this, c7799M13128);
        c7799M13128.f21227 = subMenuC7774;
        subMenuC7774.setHeaderTitle(c7799M13128.f21239);
        return subMenuC7774;
    }

    @Override // android.view.Menu
    public final void clear() {
        C7799 c7799 = this.f21250;
        if (c7799 != null) {
            mo13099(c7799);
        }
        this.f21268.clear();
        m13136(true);
    }

    public final void clearHeader() {
        this.f21253 = null;
        this.f21254 = null;
        this.f21252 = null;
        m13136(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m13126(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f21268;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7799 c7799 = (C7799) arrayList.get(i2);
            if (c7799.f21247 == i) {
                return c7799;
            }
            if (c7799.hasSubMenu() && (menuItemFindItem = c7799.f21227.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f21268.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f21251) {
            return true;
        }
        ArrayList arrayList = this.f21268;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C7799) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m13138(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m13134(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C7799 c7799M13138 = m13138(i, keyEvent);
        boolean zM13134 = c7799M13138 != null ? m13134(c7799M13138, null, i2) : false;
        if ((i2 & 2) != 0) {
            m13126(true);
        }
        return zM13134;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f21268;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C7799) arrayList.get(i3)).f21245 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C7799) arrayList.get(i3)).f21245 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m13136(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f21268;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C7799) arrayList.get(i2)).f21247 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m13136(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f21268;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7799 c7799 = (C7799) arrayList.get(i2);
            if (c7799.f21245 == i) {
                c7799.f21226 = (c7799.f21226 & (-5)) | (z2 ? 4 : 0);
                c7799.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f21249 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f21268;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7799 c7799 = (C7799) arrayList.get(i2);
            if (c7799.f21245 == i) {
                c7799.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f21268;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C7799 c7799 = (C7799) arrayList.get(i2);
            if (c7799.f21245 == i) {
                int i3 = c7799.f21226;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c7799.f21226 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m13136(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f21271 = z;
        m13136(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f21268.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo13097(C7799 c7799) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21258;
        boolean zMo614 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m13131();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7789 interfaceC7789 = (InterfaceC7789) weakReference.get();
            if (interfaceC7789 != null) {
                zMo614 = interfaceC7789.mo614(c7799);
                if (zMo614) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m13133();
        if (zMo614) {
            this.f21250 = c7799;
        }
        return zMo614;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo13098(MenuC7801 menuC7801, MenuItem menuItem) {
        InterfaceC7796 interfaceC7796 = this.f21264;
        return interfaceC7796 != null && interfaceC7796.mo204(menuC7801, menuItem);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo13099(C7799 c7799) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21258;
        boolean zMo609 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f21250 == c7799) {
            m13131();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC7789 interfaceC7789 = (InterfaceC7789) weakReference.get();
                if (interfaceC7789 != null) {
                    zMo609 = interfaceC7789.mo609(c7799);
                    if (zMo609) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m13133();
            if (zMo609) {
                this.f21250 = null;
            }
        }
        return zMo609;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13126(boolean z) {
        if (this.f21260) {
            return;
        }
        this.f21260 = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21258;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7789 interfaceC7789 = (InterfaceC7789) weakReference.get();
            if (interfaceC7789 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC7789.mo612(this, z);
            }
        }
        this.f21260 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13127(InterfaceC7789 interfaceC7789, Context context) {
        this.f21258.add(new WeakReference(interfaceC7789));
        interfaceC7789.mo610(context, this);
        this.f21256 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7799 m13128(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C5919.m11249("order does not contain a valid category.");
            return null;
        }
        int i6 = (f21248[i5] << 16) | (65535 & i3);
        C7799 c7799 = new C7799(this, i, i2, i3, i6, charSequence, this.f21255);
        ArrayList arrayList = this.f21268;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C7799) arrayList.get(size)).f21240 <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c7799);
        m13136(true);
        return c7799;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13129(Bundle bundle) {
        int size = this.f21268.size();
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
                ((SubMenuC7774) item.getSubMenu()).m13129(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo13104(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13130(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo13104());
        int size = this.f21268.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC7774) item.getSubMenu()).m13130(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m13131() {
        if (this.f21263) {
            return;
        }
        this.f21263 = true;
        this.f21262 = false;
        this.f21261 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m13132(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f21252 = view;
            this.f21254 = null;
            this.f21253 = null;
        } else {
            if (i > 0) {
                this.f21254 = this.f21270.getText(i);
            } else if (charSequence != null) {
                this.f21254 = charSequence;
            }
            if (i2 > 0) {
                this.f21253 = this.f21272.getDrawable(i2);
            } else if (drawable != null) {
                this.f21253 = drawable;
            }
            this.f21252 = null;
        }
        m13136(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m13133() {
        this.f21263 = false;
        if (this.f21262) {
            this.f21262 = false;
            m13136(this.f21261);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo13100() {
        return this.f21271;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo13101() {
        return this.f21249;
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
    public final boolean m13134(android.view.MenuItem r7, p190.InterfaceC7789 r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p190.MenuC7801.m13134(android.view.MenuItem, 飘花落叶言子楪苏兰世哲.飘花落叶言子楪兰苏哲世, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13135(InterfaceC7789 interfaceC7789) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21258;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7789 interfaceC77892 = (InterfaceC7789) weakReference.get();
            if (interfaceC77892 == null || interfaceC77892 == interfaceC7789) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo13102() {
        return this.f21265;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13136(boolean z) {
        if (this.f21263) {
            this.f21262 = true;
            if (z) {
                this.f21261 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f21266 = true;
            this.f21256 = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21258;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m13131();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC7789 interfaceC7789 = (InterfaceC7789) weakReference.get();
            if (interfaceC7789 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC7789.mo613();
            }
        }
        m13133();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13137(List list, int i, KeyEvent keyEvent) {
        boolean zMo13100 = mo13100();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f21268;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7799 c7799 = (C7799) arrayList.get(i2);
                if (c7799.hasSubMenu()) {
                    c7799.f21227.m13137(list, i, keyEvent);
                }
                char c = zMo13100 ? c7799.f21232 : c7799.f21241;
                if ((modifiers & 69647) == ((zMo13100 ? c7799.f21231 : c7799.f21242) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo13100 && c == '\b' && i == 67)) && c7799.isEnabled()) {
                        list.add(c7799);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7799 m13138(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f21259;
        arrayList.clear();
        m13137(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C7799) arrayList.get(0);
        }
        boolean zMo13100 = mo13100();
        for (int i2 = 0; i2 < size; i2++) {
            C7799 c7799 = (C7799) arrayList.get(i2);
            char c = zMo13100 ? c7799.f21232 : c7799.f21241;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo13100 && c == '\b' && i == 67))) {
                return c7799;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList m13139() {
        boolean z = this.f21266;
        ArrayList arrayList = this.f21269;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f21268;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C7799 c7799 = (C7799) arrayList2.get(i);
            if (c7799.isVisible()) {
                arrayList.add(c7799);
            }
        }
        this.f21266 = false;
        this.f21256 = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13140() {
        ArrayList arrayListM13139 = m13139();
        if (this.f21256) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f21258;
            boolean zMo608 = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC7789 interfaceC7789 = (InterfaceC7789) weakReference.get();
                if (interfaceC7789 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo608 |= interfaceC7789.mo608();
                }
            }
            ArrayList arrayList = this.f21267;
            ArrayList arrayList2 = this.f21257;
            if (zMo608) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM13139.size();
                for (int i = 0; i < size; i++) {
                    C7799 c7799 = (C7799) arrayListM13139.get(i);
                    if ((c7799.f21226 & 32) == 32) {
                        arrayList.add(c7799);
                    } else {
                        arrayList2.add(c7799);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m13139());
            }
            this.f21256 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public String mo13104() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m13128(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m13128(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m13128(i, i2, i3, this.f21270.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f21270.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public MenuC7801 mo13103() {
        return this;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f21270.getString(i4));
    }
}
