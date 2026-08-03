package androidx.appcompat.view.menu;

import Yue.AbstractC3087;
import Yue.C4187;
import Yue.C8299;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import Yue.InterfaceMenuC7682;
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
import android.view.ContextMenu;
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

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8694 implements InterfaceMenuC7682 {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private InterfaceC1603 mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private C8697 mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<C8697> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<InterfaceC8699>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<C8697> mItems = new ArrayList<>();
    private ArrayList<C8697> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<C8697> mActionItems = new ArrayList<>();
    private ArrayList<C8697> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟۟$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC1603 {
        boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem);

        void onMenuModeChange(@InterfaceC6391 C8694 c8694);
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟۟$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC1604 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo4638(C8697 c8697);
    }

    public C8694(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        m29023(true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m29016(ArrayList<C8697> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m29030() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m29017(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.mContext.getPackageManager();
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
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int iM29017 = m29017(i3);
        C8697 c8697M4649 = m4649(i, i2, i3, iM29017, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            c8697M4649.m29046(contextMenuInfo);
        }
        ArrayList<C8697> arrayList = this.mItems;
        arrayList.add(m29016(arrayList, iM29017), c8697M4649);
        onItemsChanged(true);
        return c8697M4649;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addMenuPresenter(InterfaceC8699 interfaceC8699) {
        addMenuPresenter(interfaceC8699, this.mContext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        InterfaceC1603 interfaceC1603 = this.mCallback;
        if (interfaceC1603 != null) {
            interfaceC1603.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C8697 c8697 = this.mExpandedItem;
        if (c8697 != null) {
            collapseItemActionView(c8697);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
            InterfaceC8699 interfaceC8699 = weakReference.get();
            if (interfaceC8699 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC8699.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(C8697 c8697) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == c8697) {
            stopDispatchingItemsChanged();
            for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
                InterfaceC8699 interfaceC8699 = weakReference.get();
                if (interfaceC8699 != null) {
                    zCollapseItemActionView = interfaceC8699.collapseItemActionView(this, c8697);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean dispatchMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
        InterfaceC1603 interfaceC1603 = this.mCallback;
        return interfaceC1603 != null && interfaceC1603.onMenuItemSelected(c8694, menuItem);
    }

    public boolean expandItemActionView(C8697 c8697) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
            InterfaceC8699 interfaceC8699 = weakReference.get();
            if (interfaceC8699 != null) {
                zExpandItemActionView = interfaceC8699.expandItemActionView(this, c8697);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = c8697;
        }
        return zExpandItemActionView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C8697 c8697 = this.mItems.get(i2);
            if (c8697.getItemId() == i) {
                return c8697;
            }
            if (c8697.hasSubMenu() && (menuItemFindItem = c8697.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public C8697 findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        ArrayList<C8697> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
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
        boolean zIsQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            C8697 c8697 = arrayList.get(i2);
            char alphabeticShortcut = zIsQwertyMode ? c8697.getAlphabeticShortcut() : c8697.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && alphabeticShortcut == '\b' && i == 67))) {
                return c8697;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<C8697> list, int i, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8697 c8697 = this.mItems.get(i2);
                if (c8697.hasSubMenu()) {
                    ((C8694) c8697.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? c8697.getAlphabeticShortcut() : c8697.getNumericShortcut();
                if ((modifiers & InterfaceMenuC7682.f23121) == ((zIsQwertyMode ? c8697.getAlphabeticModifiers() : c8697.getNumericModifiers()) & InterfaceMenuC7682.f23121) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i == 67)) && c8697.isEnabled()) {
                        list.add(c8697);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<C8697> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
                InterfaceC8699 interfaceC8699 = weakReference.get();
                if (interfaceC8699 == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= interfaceC8699.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    C8697 c8697 = visibleItems.get(i);
                    if (c8697.m29036()) {
                        this.mActionItems.add(c8697);
                    } else {
                        this.mNonActionItems.add(c8697);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<C8697> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public C8697 getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    public ArrayList<C8697> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public C8694 getRootMenu() {
        return this;
    }

    @InterfaceC6391
    public ArrayList<C8697> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            C8697 c8697 = this.mItems.get(i);
            if (c8697.isVisible()) {
                this.mVisibleItems.add(c8697);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(C8697 c8697) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(C8697 c8697) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        m4650(z);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C8697 c8697FindItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean zPerformItemAction = c8697FindItemWithShortcutForKey != null ? performItemAction(c8697FindItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iFindGroupIndex = findGroupIndex(i);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(iFindGroupIndex).getGroupId() != i) {
                    break;
                }
                m29021(iFindGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m29021(findItemIndex(i), true);
    }

    public void removeItemAt(int i) {
        m29021(i, true);
    }

    public void removeMenuPresenter(InterfaceC8699 interfaceC8699) {
        for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
            InterfaceC8699 interfaceC86992 = weakReference.get();
            if (interfaceC86992 == null || interfaceC86992 == interfaceC8699) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC8702) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        m29018(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
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
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC8702) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        m29019(bundle);
    }

    public void setCallback(InterfaceC1603 interfaceC1603) {
        this.mCallback = interfaceC1603;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public C8694 setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            C8697 c8697 = this.mItems.get(i);
            if (c8697.getGroupId() == groupId && c8697.m29037() && c8697.isCheckable()) {
                c8697.m29043(c8697 == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8697 c8697 = this.mItems.get(i2);
            if (c8697.getGroupId() == i) {
                c8697.m29044(z2);
                c8697.setCheckable(z);
            }
        }
    }

    @Override // Yue.InterfaceMenuC7682, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8697 c8697 = this.mItems.get(i2);
            if (c8697.getGroupId() == i) {
                c8697.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C8697 c8697 = this.mItems.get(i2);
            if (c8697.getGroupId() == i && c8697.m29049(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8694 setHeaderIconInt(Drawable drawable) {
        m29022(0, null, 0, drawable, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8694 setHeaderTitleInt(CharSequence charSequence) {
        m29022(0, charSequence, 0, null, null);
        return this;
    }

    public C8694 setHeaderViewInt(View view) {
        m29022(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        m29023(z);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    /* JADX INFO: renamed from: ۥ */
    public final C8697 m4649(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C8697(this, i, i2, i3, i4, charSequence, i5);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4650(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
            InterfaceC8699 interfaceC8699 = weakReference.get();
            if (interfaceC8699 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC8699.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29018(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
            InterfaceC8699 interfaceC8699 = weakReference.get();
            if (interfaceC8699 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC8699.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC8699.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29019(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
            InterfaceC8699 interfaceC8699 = weakReference.get();
            if (interfaceC8699 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC8699.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = interfaceC8699.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m29020(SubMenuC8702 subMenuC8702, InterfaceC8699 interfaceC8699) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = interfaceC8699 != null ? interfaceC8699.onSubMenuSelected(subMenuC8702) : false;
        for (WeakReference<InterfaceC8699> weakReference : this.mPresenters) {
            InterfaceC8699 interfaceC86992 = weakReference.get();
            if (interfaceC86992 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = interfaceC86992.onSubMenuSelected(subMenuC8702);
            }
        }
        return zOnSubMenuSelected;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m29021(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29022(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = C4187.m12065(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m29023(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.mResources.getConfiguration().keyboard != 1 && C8299.m27603(ViewConfiguration.get(this.mContext), this.mContext);
        }
        this.mShortcutsVisible = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void addMenuPresenter(InterfaceC8699 interfaceC8699, Context context) {
        this.mPresenters.add(new WeakReference<>(interfaceC8699));
        interfaceC8699.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean performItemAction(MenuItem menuItem, InterfaceC8699 interfaceC8699, int i) {
        C8697 c8697 = (C8697) menuItem;
        if (c8697 == null || !c8697.isEnabled()) {
            return false;
        }
        boolean zM29035 = c8697.m29035();
        AbstractC3087 abstractC3087Mo172 = c8697.mo172();
        boolean z = abstractC3087Mo172 != null && abstractC3087Mo172.mo179();
        if (c8697.m29034()) {
            zM29035 |= c8697.expandActionView();
            if (zM29035) {
                close(true);
            }
        } else if (c8697.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                close(false);
            }
            if (!c8697.hasSubMenu()) {
                c8697.m29048(new SubMenuC8702(getContext(), this, c8697));
            }
            SubMenuC8702 subMenuC8702 = (SubMenuC8702) c8697.getSubMenu();
            if (z) {
                abstractC3087Mo172.mo6293(subMenuC8702);
            }
            zM29035 |= m29020(subMenuC8702, interfaceC8699);
            if (!zM29035) {
                close(true);
            }
        } else if ((i & 1) == 0) {
            close(true);
        }
        return zM29035;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8694 setHeaderIconInt(int i) {
        m29022(0, null, i, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8694 setHeaderTitleInt(int i) {
        m29022(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C8697 c8697 = (C8697) addInternal(i, i2, i3, charSequence);
        SubMenuC8702 subMenuC8702 = new SubMenuC8702(this.mContext, this, c8697);
        c8697.m29048(subMenuC8702);
        return subMenuC8702;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}
