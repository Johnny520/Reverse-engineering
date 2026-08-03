package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LifecycleOwner;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback;
import com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnIconChangeCallBack;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.kongzue.dialogx.interfaces.OnMenuItemSelectListener;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import com.kongzue.dialogx.util.BottomMenuArrayAdapter;
import com.kongzue.dialogx.util.ItemDivider;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BottomMenu extends BottomDialog {
    public static final int ITEM_CLICK_DELAY = 100;
    protected List<Integer> iconResIds;
    protected ItemDivider itemDivider;
    protected DialogListView listView;
    protected MenuItemTextInfoInterceptor<BottomMenu> menuItemTextInfoInterceptor;
    protected List<CharSequence> menuList;
    protected BaseAdapter menuListAdapter;
    protected MenuItemLayoutRefreshCallback<BottomMenu> menuMenuItemLayoutRefreshCallback;
    protected OnIconChangeCallBack<BottomMenu> onIconChangeCallBack;
    protected OnMenuItemClickListener<BottomMenu> onMenuItemClickListener;
    private int[] resultArray;
    private CharSequence[] selectTextArray;
    protected ArrayList<Integer> selectionItems;
    private float touchDownY;

    /* JADX INFO: renamed from: me */
    protected BottomMenu f4160me = this;
    protected int selectionIndex = -1;
    protected SELECT_MODE selectMode = SELECT_MODE.NONE;
    protected boolean showSelectedBackgroundTips = false;
    protected Map<Integer, Boolean> menuUsability = new HashMap();
    protected boolean autoTintIconInLightOrDarkMode = true;
    private long lastClickTime = 0;

    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.BottomMenu$5 */
    public static /* synthetic */ class C24345 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE;

        static {
            int[] iArr = new int[SELECT_MODE.values().length];
            $SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE = iArr;
            try {
                iArr[SELECT_MODE.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE[SELECT_MODE.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE[SELECT_MODE.MULTIPLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BottomMenu build() {
        return new BottomMenu();
    }

    private String[] getTextArray(int[] iArr) {
        String[] strArr = new String[iArr == null ? 0 : iArr.length];
        int i = 0;
        while (true) {
            if (i >= (iArr == null ? 0 : iArr.length)) {
                return strArr;
            }
            strArr[i] = getString(iArr[i]);
            i++;
        }
    }

    private boolean isSameSize(int i) {
        List<CharSequence> list = this.menuList;
        return list == null || list.size() == 0 || this.menuList.size() == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BottomMenu show(List<CharSequence> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BottomMenu showStringList(List<String> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuStringList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public void callDialogDismissPrivate() {
        dismiss();
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomMenu disableMenu(int... iArr) {
        for (int i : iArr) {
            this.menuUsability.put(Integer.valueOf(i), Boolean.FALSE);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomMenu enableMenu(int... iArr) {
        for (int i : iArr) {
            this.menuUsability.put(Integer.valueOf(i), Boolean.TRUE);
        }
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public float getBottomDialogMaxHeight() {
        return this.bottomDialogMaxHeight;
    }

    public OnMenuButtonClickListener<BottomMenu> getBottomMenuCancelButtonClickListener() {
        return (OnMenuButtonClickListener) this.cancelButtonClickListener;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public CharSequence getCancelButton() {
        return this.cancelText;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public TextInfo getCancelTextInfo() {
        return this.cancelTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public View getCustomView() {
        OnBindView<BottomDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomDialog.DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public DialogXAnimInterface<BottomDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<Integer> getIconResIds() {
        return this.iconResIds;
    }

    public MenuItemTextInfoInterceptor<BottomMenu> getMenuItemTextInfoInterceptor() {
        return this.menuItemTextInfoInterceptor;
    }

    public List<CharSequence> getMenuList() {
        return this.menuList;
    }

    public BaseAdapter getMenuListAdapter() {
        return this.menuListAdapter;
    }

    public MenuItemLayoutRefreshCallback<BottomMenu> getMenuMenuItemLayoutRefreshCallback() {
        return this.menuMenuItemLayoutRefreshCallback;
    }

    public TextInfo getMenuTextInfo() {
        TextInfo textInfo = this.menuTextInfo;
        return textInfo == null ? DialogX.menuTextInfo : textInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public CharSequence getMessage() {
        return this.message;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public TextInfo getMessageTextInfo() {
        return this.messageTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public CharSequence getOkButton() {
        return this.okText;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public TextInfo getOkTextInfo() {
        return this.okTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public OnBackPressedListener<BottomDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public OnBackgroundMaskClickListener<BottomDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public OnIconChangeCallBack<BottomMenu> getOnIconChangeCallBack() {
        return this.onIconChangeCallBack;
    }

    public OnMenuItemClickListener<BottomMenu> getOnMenuItemClickListener() {
        return this.onMenuItemClickListener;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public CharSequence getOtherButton() {
        return this.otherText;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public TextInfo getOtherTextInfo() {
        return this.otherTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public float getRadius() {
        return this.backgroundRadius;
    }

    public SELECT_MODE getSelectMode() {
        return this.selectMode;
    }

    public CharSequence[] getSelectTextArray() {
        return this.selectTextArray;
    }

    public int getSelection() {
        return this.selectionIndex;
    }

    public int getSelectionIndex() {
        return this.selectionIndex;
    }

    public int[] getSelectionIndexArray() {
        return this.resultArray;
    }

    public ArrayList<Integer> getSelectionList() {
        return this.selectionItems;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public CharSequence getTitle() {
        return this.title;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public TextInfo getTitleTextInfo() {
        return this.titleTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public boolean isAllowInterceptTouch() {
        return super.isAllowInterceptTouch();
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
        return this.autoTintIconInLightOrDarkMode;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public boolean isBkgInterceptTouch() {
        return this.bkgInterceptTouch;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
        BaseDialog.BOOLEAN r0 = this.privateCancelable;
        if (r0 != null) {
            return r0 == BaseDialog.BOOLEAN.TRUE;
        }
        BaseDialog.BOOLEAN r02 = BottomDialog.overrideCancelable;
        return r02 != null ? r02 == BaseDialog.BOOLEAN.TRUE : this.cancelable;
    }

    public boolean isMenuItemEnable(int i) {
        Boolean bool = this.menuUsability.get(Integer.valueOf(i));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isShowSelectedBackgroundTips() {
        return this.showSelectedBackgroundTips;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void onDialogShow() {
        int iOverrideMenuDividerDrawableRes;
        int iOverrideMenuDividerHeight;
        if (getDialogImpl() == null || getDialogImpl().boxList == null) {
            return;
        }
        getDialogImpl().boxList.setVisibility(0);
        if (!isAllowInterceptTouch()) {
            getDialogImpl().bkg.setMaxHeight((int) this.bottomDialogMaxHeight);
            if (this.bottomDialogMaxHeight != 0.0f) {
                this.dialogImpl.scrollView.lockScroll(true);
            }
        }
        if (this.style.overrideBottomDialogRes() != null) {
            iOverrideMenuDividerDrawableRes = this.style.overrideBottomDialogRes().overrideMenuDividerDrawableRes(isLightTheme());
            iOverrideMenuDividerHeight = this.style.overrideBottomDialogRes().overrideMenuDividerHeight(isLightTheme());
        } else {
            iOverrideMenuDividerDrawableRes = 0;
            iOverrideMenuDividerHeight = 1;
        }
        if (iOverrideMenuDividerDrawableRes == 0) {
            iOverrideMenuDividerDrawableRes = isLightTheme() ? C2413R.drawable.rect_dialogx_material_menu_split_divider : C2413R.drawable.rect_dialogx_material_menu_split_divider_night;
        }
        if (isLightTheme()) {
            this.listView = new DialogListView(getDialogImpl(), getOwnActivity());
        } else {
            this.listView = new DialogListView(getDialogImpl(), getOwnActivity(), C2413R.style.DialogXCompatThemeDark);
        }
        this.listView.setTag("ScrollController");
        this.listView.setOverScrollMode(2);
        this.listView.setDivider(getResources().getDrawable(iOverrideMenuDividerDrawableRes));
        this.listView.setDividerHeight(iOverrideMenuDividerHeight);
        BottomDialog.DialogImpl dialogImpl = getDialogImpl();
        DialogListView dialogListView = this.listView;
        dialogImpl.scrollView = dialogListView;
        dialogListView.setBottomMenuListViewTouchEvent(new BottomMenuListViewTouchEvent() { // from class: com.kongzue.dialogx.dialogs.BottomMenu.1
            @Override // com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent
            public void down(MotionEvent motionEvent) {
                BottomMenu bottomMenu = BottomMenu.this;
                bottomMenu.touchDownY = bottomMenu.getDialogImpl().boxBkg.getY();
                BaseDialog.log("#TouchDown: " + BottomMenu.this.touchDownY);
            }
        });
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.kongzue.dialogx.dialogs.BottomMenu.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (BottomMenu.this.isMenuItemEnable(i)) {
                    BottomMenu.this.haptic(view);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - BottomMenu.this.lastClickTime > 100) {
                        BottomMenu.this.lastClickTime = jCurrentTimeMillis;
                        float fAbs = Math.abs(BottomMenu.this.touchDownY - BottomMenu.this.getDialogImpl().boxBkg.getY());
                        BaseDialog.log("#Click:deltaY= " + fAbs);
                        if (fAbs > BottomMenu.this.dip2px(15.0f)) {
                            return;
                        }
                        BottomMenu.this.selectionIndex = i;
                        BaseDialog.log("### onMenuItemClickListener=" + BottomMenu.this.onMenuItemClickListener);
                        int i2 = C24345.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE[BottomMenu.this.selectMode.ordinal()];
                        if (i2 == 1) {
                            BottomMenu bottomMenu = BottomMenu.this;
                            OnMenuItemClickListener<BottomMenu> onMenuItemClickListener = bottomMenu.onMenuItemClickListener;
                            if (onMenuItemClickListener == null) {
                                bottomMenu.dismiss();
                                return;
                            } else {
                                if (onMenuItemClickListener.onClick(bottomMenu.f4160me, bottomMenu.menuList.get(i), i)) {
                                    return;
                                }
                                BottomMenu.this.dismiss();
                                return;
                            }
                        }
                        if (i2 == 2) {
                            BottomMenu bottomMenu2 = BottomMenu.this;
                            OnMenuItemClickListener<BottomMenu> onMenuItemClickListener2 = bottomMenu2.onMenuItemClickListener;
                            if (!(onMenuItemClickListener2 instanceof OnMenuItemSelectListener)) {
                                if (onMenuItemClickListener2 == null) {
                                    bottomMenu2.menuListAdapter.notifyDataSetInvalidated();
                                    return;
                                } else {
                                    if (onMenuItemClickListener2.onClick(bottomMenu2.f4160me, bottomMenu2.menuList.get(i), i)) {
                                        return;
                                    }
                                    BottomMenu.this.dismiss();
                                    return;
                                }
                            }
                            OnMenuItemSelectListener onMenuItemSelectListener = (OnMenuItemSelectListener) onMenuItemClickListener2;
                            if (!onMenuItemSelectListener.onClick(bottomMenu2.f4160me, bottomMenu2.menuList.get(i), i)) {
                                BottomMenu.this.dismiss();
                                return;
                            }
                            BottomMenu.this.menuListAdapter.notifyDataSetInvalidated();
                            BottomMenu bottomMenu3 = BottomMenu.this;
                            onMenuItemSelectListener.onOneItemSelect(bottomMenu3.f4160me, bottomMenu3.menuList.get(i), i, true);
                            return;
                        }
                        if (i2 != 3) {
                            return;
                        }
                        BottomMenu bottomMenu4 = BottomMenu.this;
                        OnMenuItemClickListener<BottomMenu> onMenuItemClickListener3 = bottomMenu4.onMenuItemClickListener;
                        int i3 = 0;
                        if (!(onMenuItemClickListener3 instanceof OnMenuItemSelectListener)) {
                            if (onMenuItemClickListener3 != null) {
                                if (onMenuItemClickListener3.onClick(bottomMenu4.f4160me, bottomMenu4.menuList.get(i), i)) {
                                    return;
                                }
                                BottomMenu.this.dismiss();
                                return;
                            }
                            if (bottomMenu4.selectionItems.contains(Integer.valueOf(i))) {
                                BottomMenu.this.selectionItems.remove(new Integer(i));
                            } else {
                                BottomMenu.this.selectionItems.add(Integer.valueOf(i));
                            }
                            BottomMenu.this.menuListAdapter.notifyDataSetInvalidated();
                            BottomMenu bottomMenu5 = BottomMenu.this;
                            bottomMenu5.resultArray = new int[bottomMenu5.selectionItems.size()];
                            BottomMenu bottomMenu6 = BottomMenu.this;
                            bottomMenu6.selectTextArray = new CharSequence[bottomMenu6.selectionItems.size()];
                            while (i3 < BottomMenu.this.selectionItems.size()) {
                                BottomMenu.this.resultArray[i3] = BottomMenu.this.selectionItems.get(i3).intValue();
                                CharSequence[] charSequenceArr = BottomMenu.this.selectTextArray;
                                BottomMenu bottomMenu7 = BottomMenu.this;
                                charSequenceArr[i3] = bottomMenu7.menuList.get(bottomMenu7.resultArray[i3]);
                                i3++;
                            }
                            return;
                        }
                        OnMenuItemSelectListener onMenuItemSelectListener2 = (OnMenuItemSelectListener) onMenuItemClickListener3;
                        if (!onMenuItemSelectListener2.onClick(bottomMenu4.f4160me, bottomMenu4.menuList.get(i), i)) {
                            BottomMenu.this.dismiss();
                            return;
                        }
                        if (BottomMenu.this.selectionItems.contains(Integer.valueOf(i))) {
                            BottomMenu.this.selectionItems.remove(new Integer(i));
                        } else {
                            BottomMenu.this.selectionItems.add(Integer.valueOf(i));
                        }
                        BottomMenu.this.menuListAdapter.notifyDataSetInvalidated();
                        BottomMenu bottomMenu8 = BottomMenu.this;
                        bottomMenu8.resultArray = new int[bottomMenu8.selectionItems.size()];
                        BottomMenu bottomMenu9 = BottomMenu.this;
                        bottomMenu9.selectTextArray = new CharSequence[bottomMenu9.selectionItems.size()];
                        while (i3 < BottomMenu.this.selectionItems.size()) {
                            BottomMenu.this.resultArray[i3] = BottomMenu.this.selectionItems.get(i3).intValue();
                            CharSequence[] charSequenceArr2 = BottomMenu.this.selectTextArray;
                            BottomMenu bottomMenu10 = BottomMenu.this;
                            charSequenceArr2[i3] = bottomMenu10.menuList.get(bottomMenu10.resultArray[i3]);
                            i3++;
                        }
                        BottomMenu bottomMenu11 = BottomMenu.this;
                        onMenuItemSelectListener2.onMultiItemSelect(bottomMenu11.f4160me, bottomMenu11.selectTextArray, BottomMenu.this.resultArray);
                    }
                }
            }
        });
        if (this.style.overrideBottomDialogRes() != null && this.style.overrideBottomDialogRes().overrideMenuItemLayout(true, 0, 0, false) != 0) {
            this.listView.setSelector(C2413R.color.empty);
        }
        getDialogImpl().boxList.addView(this.listView, new ViewGroup.LayoutParams(-1, -2));
        refreshUI();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog onDismiss(DialogXRunnable dialogXRunnable) {
        return onDismiss((DialogXRunnable<BottomDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog onShow(DialogXRunnable dialogXRunnable) {
        return onShow((DialogXRunnable<BottomDialog>) dialogXRunnable);
    }

    public void preRefreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomMenu.4
            @Override // java.lang.Runnable
            public void run() {
                BottomMenu.this.refreshUI();
            }
        });
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        DialogListView dialogListView;
        if (getDialogImpl() == null) {
            return;
        }
        if (this.listView != null) {
            if (this.menuListAdapter == null) {
                this.menuListAdapter = new BottomMenuArrayAdapter(this.f4160me, getOwnActivity(), this.menuList);
            }
            if (this.listView.getAdapter() == null) {
                this.listView.setAdapter((ListAdapter) this.menuListAdapter);
            } else {
                ListAdapter adapter = this.listView.getAdapter();
                BaseAdapter baseAdapter = this.menuListAdapter;
                if (adapter != baseAdapter) {
                    this.listView.setAdapter((ListAdapter) baseAdapter);
                } else {
                    baseAdapter.notifyDataSetChanged();
                }
            }
        }
        if (this.showSelectedBackgroundTips && (dialogListView = this.listView) != null) {
            dialogListView.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomMenu.3
                @Override // java.lang.Runnable
                public void run() {
                    BottomMenu bottomMenu = BottomMenu.this;
                    BaseAdapter baseAdapter2 = bottomMenu.menuListAdapter;
                    if ((baseAdapter2 instanceof BottomMenuArrayAdapter) && bottomMenu.showSelectedBackgroundTips) {
                        final View childAt = bottomMenu.listView.getChildAt(bottomMenu.getSelection());
                        if (childAt != null) {
                            childAt.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomMenu.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    childAt.setPressed(true);
                                }
                            });
                        }
                    }
                }
            });
        }
        ItemDivider itemDivider = this.itemDivider;
        if (itemDivider != null) {
            this.listView.setDivider(itemDivider.createDividerDrawable(getOwnActivity(), isLightTheme()));
            this.listView.setDividerHeight(this.itemDivider.getWidth());
        }
        super.refreshUI();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog setActionRunnable(int i, DialogXRunnable dialogXRunnable) {
        return setActionRunnable(i, (DialogXRunnable<BottomDialog>) dialogXRunnable);
    }

    public BottomMenu setAutoTintIconInLightOrDarkMode(boolean z) {
        this.autoTintIconInLightOrDarkMode = z;
        refreshUI();
        return this;
    }

    public BottomMenu setCancelButtonClickListener(OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.cancelButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog setCustomView(OnBindView onBindView) {
        return setCustomView((OnBindView<BottomDialog>) onBindView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog setDialogLifecycleCallback(DialogLifecycleCallback dialogLifecycleCallback) {
        return setDialogLifecycleCallback((DialogLifecycleCallback<BottomDialog>) dialogLifecycleCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog setDialogXAnimImpl(DialogXAnimInterface dialogXAnimInterface) {
        return setDialogXAnimImpl((DialogXAnimInterface<BottomDialog>) dialogXAnimInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomMenu setIconResIds(List<Integer> list) {
        this.iconResIds = list;
        refreshUI();
        return this;
    }

    public BottomMenu setItemDivider(ItemDivider itemDivider) {
        this.itemDivider = itemDivider;
        refreshUI();
        return this;
    }

    public BottomMenu setMenuItemTextInfoInterceptor(MenuItemTextInfoInterceptor<BottomMenu> menuItemTextInfoInterceptor) {
        this.menuItemTextInfoInterceptor = menuItemTextInfoInterceptor;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomMenu setMenuList(List<CharSequence> list) {
        this.menuList = list;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public BottomMenu setMenuListAdapter(BaseAdapter baseAdapter) {
        this.menuListAdapter = baseAdapter;
        return this;
    }

    public BottomMenu setMenuMenuItemLayoutRefreshCallback(MenuItemLayoutRefreshCallback<BottomMenu> menuItemLayoutRefreshCallback) {
        this.menuMenuItemLayoutRefreshCallback = menuItemLayoutRefreshCallback;
        return this;
    }

    public BottomMenu setMenuStringList(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(list);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public BottomMenu setMenuTextInfo(TextInfo textInfo) {
        this.menuTextInfo = textInfo;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomMenu setMenus(CharSequence... charSequenceArr) {
        this.menuList = Arrays.asList(charSequenceArr);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public BottomMenu setMultiSelection() {
        this.selectMode = SELECT_MODE.MULTIPLE;
        this.selectionIndex = -1;
        this.selectionItems = new ArrayList<>();
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public BottomMenu setNoSelect() {
        this.selectMode = SELECT_MODE.NONE;
        this.selectionIndex = -1;
        this.selectionItems = null;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        return setOnBackPressedListener((OnBackPressedListener<BottomDialog>) onBackPressedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ BottomDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener onBackgroundMaskClickListener) {
        return setOnBackgroundMaskClickListener((OnBackgroundMaskClickListener<BottomDialog>) onBackgroundMaskClickListener);
    }

    public BottomMenu setOnIconChangeCallBack(OnIconChangeCallBack<BottomMenu> onIconChangeCallBack) {
        this.onIconChangeCallBack = onIconChangeCallBack;
        return this;
    }

    public BottomMenu setOnMenuItemClickListener(OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        this.onMenuItemClickListener = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomMenu setSelection(int i) {
        this.selectMode = SELECT_MODE.SINGLE;
        this.selectionIndex = i;
        this.selectionItems = null;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public BottomMenu setShowSelectedBackgroundTips(boolean z) {
        this.showSelectedBackgroundTips = z;
        refreshUI();
        return this;
    }

    public BottomMenu setSingleSelection() {
        this.selectMode = SELECT_MODE.SINGLE;
        this.selectionIndex = -1;
        this.selectionItems = null;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static BottomMenu build(DialogXStyle dialogXStyle) {
        return new BottomMenu().setStyle(dialogXStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: appendMessage(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bindDismissWithLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bringToFront()Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAction(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAllAction()Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public int getIconResIds(int i) {
        List<Integer> list = this.iconResIds;
        if (list == null || i < 0 || i >= list.size()) {
            return 0;
        }
        return this.iconResIds.get(i).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu onDismiss(DialogXRunnable<BottomDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu onShow(DialogXRunnable<BottomDialog> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: removeCustomView()Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu removeCustomView() {
        this.onBindView.clean();
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setActionRunnable(int i, DialogXRunnable<BottomDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAllowInterceptTouch(Z)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setAllowInterceptTouch(boolean z) {
        this.allowInterceptTouch = z;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBackgroundColor(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBackgroundColorRes(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBkgInterceptTouch(Z)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBottomDialogMaxHeight(F)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setBottomDialogMaxHeight(float f) {
        this.bottomDialogMaxHeight = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setCancelButton(int i, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setCancelButton(i, (OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setCancelTextInfo(TextInfo textInfo) {
        this.cancelTextInfo = textInfo;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelable(Z)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setCustomView(OnBindView<BottomDialog> onBindView) {
        this.onBindView = onBindView;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setDialogImplMode(Lcom/kongzue/dialogx/DialogX$IMPL_MODE;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setDialogLifecycleCallback(DialogLifecycleCallback<BottomDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4160me);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setDialogXAnimImpl(DialogXAnimInterface<BottomDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnterAnimDuration(J)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setExitAnimDuration(J)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setHapticFeedbackEnabled(Z)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setHapticFeedbackEnabled(boolean z) {
        this.isHapticFeedbackEnabled = z ? 1 : 0;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaskColor(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxHeight(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxWidth(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMessageTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinHeight(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinWidth(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setOkButton(int i, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOkButton(i, (OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOkTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOkTextInfo(TextInfo textInfo) {
        this.okTextInfo = textInfo;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOnBackPressedListener(OnBackPressedListener<BottomDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<BottomDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setOtherButton(int i, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOtherButton(i, (OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOtherTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOtherTextInfo(TextInfo textInfo) {
        this.otherTextInfo = textInfo;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setRadius(F)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setScrollableWhenContentLargeThanVisibleRange(Z)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setScrollableWhenContentLargeThanVisibleRange(boolean z) {
        this.scrollableWhenContentLargeThanVisibleRange = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setStyle(Lcom/kongzue/dialogx/interfaces/DialogXStyle;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTheme(Lcom/kongzue/dialogx/DialogX$THEME;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTitleTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setTitleTextInfo(TextInfo textInfo) {
        this.titleTextInfo = textInfo;
        preRefreshUI();
        return this;
    }

    public static BottomMenu build(OnBindView<BottomDialog> onBindView) {
        return new BottomMenu().setCustomView(onBindView);
    }

    public BottomMenu disableMenu(CharSequence... charSequenceArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .disableMenu(" + charSequenceArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (CharSequence charSequence : charSequenceArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(charSequence)), Boolean.FALSE);
            }
        }
        return this;
    }

    public BottomMenu enableMenu(CharSequence... charSequenceArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .enableMenu(" + charSequenceArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (CharSequence charSequence : charSequenceArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(charSequence)), Boolean.TRUE);
            }
        }
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setCancelButton(OnDialogButtonClickListener onDialogButtonClickListener) {
        return setCancelButton((OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public BottomMenu setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public BottomMenu setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    public BottomMenu setIconResIds(int... iArr) {
        if (this.iconResIds == null) {
            this.iconResIds = new ArrayList();
        }
        for (int i : iArr) {
            this.iconResIds.add(Integer.valueOf(i));
        }
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMessage(CharSequence charSequence) {
        this.message = charSequence;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setOkButton(OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOkButton((OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setOtherButton(OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOtherButton((OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public BottomMenu setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setTitle(CharSequence charSequence) {
        this.title = charSequence;
        preRefreshUI();
        return this;
    }

    public static BottomMenu show(List<CharSequence> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu showStringList(List<String> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuStringList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public BottomMenu setMenuList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public BottomMenu setMenus(String... strArr) {
        this.menuList = Arrays.asList(strArr);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(Landroid/graphics/Bitmap;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setTitleIcon(Bitmap bitmap) {
        this.titleIcon = new BitmapDrawable(getResources(), bitmap);
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setCancelButton(CharSequence charSequence, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setCancelButton(charSequence, (OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(IZ)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setMessage(int i) {
        this.message = getString(i);
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setOkButton(CharSequence charSequence, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOkButton(charSequence, (OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public /* bridge */ /* synthetic */ BottomDialog setOtherButton(CharSequence charSequence, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOtherButton(charSequence, (OnDialogButtonClickListener<BottomDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(IIII)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setTitle(int i) {
        this.title = getString(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCancelButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setCancelButton(CharSequence charSequence) {
        this.cancelText = charSequence;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOkButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOkButton(CharSequence charSequence) {
        this.okText = charSequence;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOtherButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOtherButton(CharSequence charSequence) {
        this.otherText = charSequence;
        preRefreshUI();
        return this;
    }

    public BottomMenu setSelection(int[] iArr) {
        this.selectMode = SELECT_MODE.MULTIPLE;
        this.selectionIndex = -1;
        this.selectionItems = new ArrayList<>();
        if (iArr != null) {
            for (int i : iArr) {
                this.selectionItems.add(Integer.valueOf(i));
            }
        }
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setTitleIcon(int i) {
        this.titleIcon = getResources().getDrawable(i);
        refreshUI();
        return this;
    }

    public BottomMenu setMenus(int... iArr) {
        this.menuList = Arrays.asList(getTextArray(iArr));
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public static BottomMenu show(String... strArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuList(strArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu showStringList(CharSequence charSequence, CharSequence charSequence2, List<String> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuStringList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public BottomMenu disableMenu(String... strArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .disableMenu(" + strArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (String str : strArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(str)), Boolean.FALSE);
            }
        }
        return this;
    }

    public BottomMenu enableMenu(String... strArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .enableMenu(" + strArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (String str : strArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(str)), Boolean.TRUE);
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCancelButton(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setCancelButton(int i) {
        this.cancelText = getString(i);
        preRefreshUI();
        return this;
    }

    public BottomMenu setMenuList(CharSequence[] charSequenceArr) {
        this.menuList = Arrays.asList(charSequenceArr);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOkButton(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOkButton(int i) {
        this.okText = getString(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOtherButton(I)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setOtherButton(int i) {
        this.otherText = getString(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(Landroid/graphics/drawable/Drawable;)Lcom/kongzue/dialogx/dialogs/BottomDialog; */
    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public BottomMenu setTitleIcon(Drawable drawable) {
        this.titleIcon = drawable;
        refreshUI();
        return this;
    }

    public BottomMenu setCancelButton(OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.cancelButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public BottomMenu setOkButton(OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.okButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public BottomMenu setOtherButton(OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.otherButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public static BottomMenu show(String[] strArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuList(strArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public BottomMenu setCancelButton(CharSequence charSequence, OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.cancelText = charSequence;
        this.cancelButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public BottomMenu setOkButton(CharSequence charSequence, OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.okText = charSequence;
        this.okButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public BottomMenu setOtherButton(CharSequence charSequence, OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.otherText = charSequence;
        this.otherButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public static BottomMenu showStringList(CharSequence charSequence, CharSequence charSequence2, List<String> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuStringList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public BottomMenu setSelection(List<Integer> list) {
        this.selectMode = SELECT_MODE.MULTIPLE;
        this.selectionIndex = -1;
        this.selectionItems = new ArrayList<>(list);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public BottomMenu setCancelButton(int i, OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.cancelText = getString(i);
        this.cancelButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public BottomMenu setOkButton(int i, OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.okText = getString(i);
        this.okButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public BottomMenu setOtherButton(int i, OnMenuButtonClickListener<BottomMenu> onMenuButtonClickListener) {
        this.otherText = getString(i);
        this.otherButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public static BottomMenu show(CharSequence[] charSequenceArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.show();
        return bottomMenu;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setCancelButton(OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.cancelButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setOkButton(OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.okButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setOtherButton(OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.otherButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public static BottomMenu show(CharSequence[] charSequenceArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setCancelButton(CharSequence charSequence, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.cancelText = charSequence;
        this.cancelButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setOkButton(CharSequence charSequence, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.okText = charSequence;
        this.okButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setOtherButton(CharSequence charSequence, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.otherText = charSequence;
        this.otherButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    public static BottomMenu showStringList(String str, String str2, List<String> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuStringList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setCancelButton(int i, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.cancelText = getString(i);
        this.cancelButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setOkButton(int i, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.okText = getString(i);
        this.okButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @Deprecated
    public BottomMenu setOtherButton(int i, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.otherText = getString(i);
        this.otherButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu showStringList(String str, String str2, List<String> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuStringList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu showStringList(int i, int i2, List<String> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setMenuStringList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, List<CharSequence> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu showStringList(int i, int i2, List<String> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setMenuStringList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, List<CharSequence> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.setMenuList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence charSequence2, String[] strArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuList(strArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence charSequence2, String[] strArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuList(strArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence charSequence2, CharSequence[] charSequenceArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence charSequence2, CharSequence[] charSequenceArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.message = charSequence2;
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(String str, String str2, List<CharSequence> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(String str, String str2, List<CharSequence> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuList(list);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(String str, String str2, String[] strArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuList(strArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(String str, String str2, String[] strArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuList(strArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(String str, String str2, CharSequence[] charSequenceArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(String str, String str2, CharSequence[] charSequenceArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = str;
        bottomMenu.message = str2;
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, int i2, List<CharSequence> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, List<CharSequence> list) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, int i2, String[] strArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setMenuList(strArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, int i2, CharSequence[] charSequenceArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, int i2, List<CharSequence> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, List<CharSequence> list, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.setMenuList(list);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, int i2, String[] strArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setMenuList(strArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, int i2, CharSequence[] charSequenceArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.message = bottomMenu.getString(i2);
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence[] charSequenceArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, String[] strArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.setMenuList(strArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, CharSequence[] charSequenceArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(CharSequence charSequence, String[] strArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = charSequence;
        bottomMenu.setMenuList(strArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, CharSequence[] charSequenceArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, String[] strArr) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.setMenuList(strArr);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, CharSequence[] charSequenceArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.setMenuList(charSequenceArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }

    public static BottomMenu show(int i, String[] strArr, OnMenuItemClickListener<BottomMenu> onMenuItemClickListener) {
        BottomMenu bottomMenu = new BottomMenu();
        bottomMenu.title = bottomMenu.getString(i);
        bottomMenu.setMenuList(strArr);
        bottomMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        bottomMenu.show();
        return bottomMenu;
    }
}
