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
import com.kongzue.dialogx.dialogs.MessageDialog;
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
import com.kongzue.dialogx.util.MessageMenuArrayAdapter;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MessageMenu extends MessageDialog {
    public static final int ITEM_CLICK_DELAY = 100;
    protected List<Integer> iconResIds;
    protected ItemDivider itemDivider;
    protected DialogListView listView;
    protected MenuItemTextInfoInterceptor<MessageMenu> menuItemTextInfoInterceptor;
    protected List<CharSequence> menuList;
    protected BaseAdapter menuListAdapter;
    protected MenuItemLayoutRefreshCallback<MessageMenu> menuMenuItemLayoutRefreshCallback;
    protected TextInfo menuTextInfo;
    protected OnIconChangeCallBack<MessageMenu> onIconChangeCallBack;
    protected OnMenuItemClickListener<MessageMenu> onMenuItemClickListener;
    private int[] resultArray;
    private CharSequence[] selectTextArray;
    protected ArrayList<Integer> selectionItems;
    private float touchDownY;

    /* JADX INFO: renamed from: me */
    protected MessageMenu f4165me = this;
    protected boolean allowInterceptTouch = true;
    protected int selectionIndex = -1;
    protected SELECT_MODE selectMode = SELECT_MODE.NONE;
    protected boolean showSelectedBackgroundTips = false;
    protected Map<Integer, Boolean> menuUsability = new HashMap();
    protected boolean autoTintIconInLightOrDarkMode = true;
    private long lastClickTime = 0;

    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.MessageMenu$5 */
    public static /* synthetic */ class C24835 {
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
    public static MessageMenu build() {
        return new MessageMenu();
    }

    private boolean isSameSize(int i) {
        List<CharSequence> list = this.menuList;
        return list == null || list.size() == 0 || this.menuList.size() == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MessageMenu show(List<CharSequence> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MessageMenu showStringList(List<String> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuStringList(list);
        messageMenu.show();
        return messageMenu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncMultiSelectResult() {
        this.resultArray = new int[this.selectionItems.size()];
        this.selectTextArray = new CharSequence[this.selectionItems.size()];
        for (int i = 0; i < this.selectionItems.size(); i++) {
            this.resultArray[i] = this.selectionItems.get(i).intValue();
            this.selectTextArray[i] = this.menuList.get(this.resultArray[i]);
        }
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageMenu disableMenu(int... iArr) {
        for (int i : iArr) {
            this.menuUsability.put(Integer.valueOf(i), Boolean.FALSE);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageMenu enableMenu(int... iArr) {
        for (int i : iArr) {
            this.menuUsability.put(Integer.valueOf(i), Boolean.TRUE);
        }
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getCancelButton() {
        return this.cancelText;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getCancelTextInfo() {
        return this.cancelTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public View getCustomView() {
        OnBindView<MessageDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageDialog.DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public DialogXAnimInterface<MessageDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<Integer> getIconResIds() {
        return this.iconResIds;
    }

    public ItemDivider getItemDivider() {
        return this.itemDivider;
    }

    public MenuItemTextInfoInterceptor<MessageMenu> getMenuItemTextInfoInterceptor() {
        return this.menuItemTextInfoInterceptor;
    }

    public List<CharSequence> getMenuList() {
        return this.menuList;
    }

    public BaseAdapter getMenuListAdapter() {
        return this.menuListAdapter;
    }

    public MenuItemLayoutRefreshCallback<MessageMenu> getMenuMenuItemLayoutRefreshCallback() {
        return this.menuMenuItemLayoutRefreshCallback;
    }

    public TextInfo getMenuTextInfo() {
        TextInfo textInfo = this.menuTextInfo;
        return textInfo == null ? DialogX.menuTextInfo : textInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getMessage() {
        return this.message;
    }

    public float getMessageDialogMaxHeight() {
        return this.maxHeight;
    }

    public OnMenuButtonClickListener<MessageMenu> getMessageMenuCancelButtonClickListener() {
        return (OnMenuButtonClickListener) this.cancelButtonClickListener;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getMessageTextInfo() {
        return this.messageTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getOkButton() {
        return this.okText;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getOkTextInfo() {
        return this.okTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public OnBackPressedListener<MessageDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public OnBackgroundMaskClickListener<MessageDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public OnIconChangeCallBack<MessageMenu> getOnIconChangeCallBack() {
        return this.onIconChangeCallBack;
    }

    public OnMenuItemClickListener<MessageMenu> getOnMenuItemClickListener() {
        return this.onMenuItemClickListener;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getOtherButton() {
        return this.otherText;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getOtherTextInfo() {
        return this.otherTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public float getRadius() {
        return this.backgroundRadius;
    }

    public SELECT_MODE getSelectMode() {
        return this.selectMode;
    }

    public CharSequence[] getSelectTextArray() {
        syncMultiSelectResult();
        return this.selectTextArray;
    }

    public int getSelection() {
        return this.selectionIndex;
    }

    public int getSelectionIndex() {
        return this.selectionIndex;
    }

    public int[] getSelectionIndexArray() {
        syncMultiSelectResult();
        return this.resultArray;
    }

    public ArrayList<Integer> getSelectionList() {
        return this.selectionItems;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getTitle() {
        return this.title;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getTitleTextInfo() {
        return this.titleTextInfo;
    }

    public boolean isAllowInterceptTouch() {
        return this.style.overrideBottomDialogRes() != null && this.allowInterceptTouch && this.style.overrideBottomDialogRes().touchSlide();
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
        return this.autoTintIconInLightOrDarkMode;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public boolean isBkgInterceptTouch() {
        return this.bkgInterceptTouch;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
        BaseDialog.BOOLEAN r0 = this.privateCancelable;
        if (r0 != null) {
            return r0 == BaseDialog.BOOLEAN.TRUE;
        }
        BaseDialog.BOOLEAN r02 = MessageDialog.overrideCancelable;
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
            getDialogImpl().bkg.setMaxHeight(this.maxHeight);
            if (this.maxHeight != 0) {
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
        this.listView.setOverScrollMode(2);
        this.listView.setDivider(getResources().getDrawable(iOverrideMenuDividerDrawableRes));
        this.listView.setDividerHeight(iOverrideMenuDividerHeight);
        this.listView.setBottomMenuListViewTouchEvent(new BottomMenuListViewTouchEvent() { // from class: com.kongzue.dialogx.dialogs.MessageMenu.1
            @Override // com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent
            public void down(MotionEvent motionEvent) {
                MessageMenu messageMenu = MessageMenu.this;
                messageMenu.touchDownY = messageMenu.getDialogImpl().bkg.getY();
            }
        });
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.kongzue.dialogx.dialogs.MessageMenu.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (MessageMenu.this.isMenuItemEnable(i)) {
                    MessageMenu.this.haptic(view);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - MessageMenu.this.lastClickTime > 100) {
                        MessageMenu.this.lastClickTime = jCurrentTimeMillis;
                        if (Math.abs(MessageMenu.this.touchDownY - MessageMenu.this.getDialogImpl().bkg.getY()) > MessageMenu.this.dip2px(15.0f)) {
                            return;
                        }
                        MessageMenu messageMenu = MessageMenu.this;
                        messageMenu.selectionIndex = i;
                        int i2 = C24835.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE[messageMenu.selectMode.ordinal()];
                        if (i2 == 1) {
                            MessageMenu messageMenu2 = MessageMenu.this;
                            OnMenuItemClickListener<MessageMenu> onMenuItemClickListener = messageMenu2.onMenuItemClickListener;
                            if (onMenuItemClickListener == null) {
                                messageMenu2.dismiss();
                                return;
                            } else {
                                if (onMenuItemClickListener.onClick(messageMenu2.f4165me, messageMenu2.menuList.get(i), i)) {
                                    return;
                                }
                                MessageMenu.this.dismiss();
                                return;
                            }
                        }
                        if (i2 == 2) {
                            MessageMenu messageMenu3 = MessageMenu.this;
                            OnMenuItemClickListener<MessageMenu> onMenuItemClickListener2 = messageMenu3.onMenuItemClickListener;
                            if (!(onMenuItemClickListener2 instanceof OnMenuItemSelectListener)) {
                                if (onMenuItemClickListener2 == null) {
                                    messageMenu3.menuListAdapter.notifyDataSetInvalidated();
                                    return;
                                } else {
                                    if (onMenuItemClickListener2.onClick(messageMenu3.f4165me, messageMenu3.menuList.get(i), i)) {
                                        return;
                                    }
                                    MessageMenu.this.dismiss();
                                    return;
                                }
                            }
                            OnMenuItemSelectListener onMenuItemSelectListener = (OnMenuItemSelectListener) onMenuItemClickListener2;
                            if (!onMenuItemSelectListener.onClick(messageMenu3.f4165me, messageMenu3.menuList.get(i), i)) {
                                MessageMenu.this.dismiss();
                                return;
                            }
                            MessageMenu.this.menuListAdapter.notifyDataSetInvalidated();
                            MessageMenu messageMenu4 = MessageMenu.this;
                            onMenuItemSelectListener.onOneItemSelect(messageMenu4.f4165me, messageMenu4.menuList.get(i), i, true);
                            return;
                        }
                        if (i2 != 3) {
                            return;
                        }
                        MessageMenu messageMenu5 = MessageMenu.this;
                        OnMenuItemClickListener<MessageMenu> onMenuItemClickListener3 = messageMenu5.onMenuItemClickListener;
                        if (!(onMenuItemClickListener3 instanceof OnMenuItemSelectListener)) {
                            if (onMenuItemClickListener3 != null) {
                                if (onMenuItemClickListener3.onClick(messageMenu5.f4165me, messageMenu5.menuList.get(i), i)) {
                                    return;
                                }
                                MessageMenu.this.dismiss();
                                return;
                            } else {
                                if (messageMenu5.selectionItems.contains(Integer.valueOf(i))) {
                                    MessageMenu.this.selectionItems.remove(new Integer(i));
                                } else {
                                    MessageMenu.this.selectionItems.add(Integer.valueOf(i));
                                }
                                MessageMenu.this.menuListAdapter.notifyDataSetInvalidated();
                                MessageMenu.this.syncMultiSelectResult();
                                return;
                            }
                        }
                        OnMenuItemSelectListener onMenuItemSelectListener2 = (OnMenuItemSelectListener) onMenuItemClickListener3;
                        if (!onMenuItemSelectListener2.onClick(messageMenu5.f4165me, messageMenu5.menuList.get(i), i)) {
                            MessageMenu.this.dismiss();
                            return;
                        }
                        if (MessageMenu.this.selectionItems.contains(Integer.valueOf(i))) {
                            MessageMenu.this.selectionItems.remove(new Integer(i));
                        } else {
                            MessageMenu.this.selectionItems.add(Integer.valueOf(i));
                        }
                        MessageMenu.this.menuListAdapter.notifyDataSetInvalidated();
                        MessageMenu.this.syncMultiSelectResult();
                        MessageMenu messageMenu6 = MessageMenu.this;
                        onMenuItemSelectListener2.onMultiItemSelect(messageMenu6.f4165me, messageMenu6.selectTextArray, MessageMenu.this.resultArray);
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
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog onDismiss(DialogXRunnable dialogXRunnable) {
        return onDismiss((DialogXRunnable<MessageDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog onShow(DialogXRunnable dialogXRunnable) {
        return onShow((DialogXRunnable<MessageDialog>) dialogXRunnable);
    }

    public void preRefreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageMenu.4
            @Override // java.lang.Runnable
            public void run() {
                MessageMenu.this.refreshUI();
            }
        });
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        DialogListView dialogListView;
        DialogListView dialogListView2;
        if (getDialogImpl() == null) {
            return;
        }
        if (this.listView != null) {
            if (this.menuListAdapter == null) {
                this.menuListAdapter = new MessageMenuArrayAdapter(this.f4165me, getOwnActivity(), this.menuList);
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
        if (this.showSelectedBackgroundTips && (dialogListView2 = this.listView) != null) {
            dialogListView2.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageMenu.3
                @Override // java.lang.Runnable
                public void run() {
                    MessageMenu messageMenu = MessageMenu.this;
                    BaseAdapter baseAdapter2 = messageMenu.menuListAdapter;
                    if ((baseAdapter2 instanceof BottomMenuArrayAdapter) && messageMenu.showSelectedBackgroundTips) {
                        final View childAt = messageMenu.listView.getChildAt(messageMenu.getSelection());
                        if (childAt != null) {
                            childAt.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageMenu.3.1
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
        if (itemDivider != null && (dialogListView = this.listView) != null) {
            dialogListView.setDivider(itemDivider.createDividerDrawable(getOwnActivity(), isLightTheme()));
            this.listView.setDividerHeight(this.itemDivider.getWidth());
        }
        super.refreshUI();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setActionRunnable(int i, DialogXRunnable dialogXRunnable) {
        return setActionRunnable(i, (DialogXRunnable<MessageDialog>) dialogXRunnable);
    }

    public MessageMenu setAllowInterceptTouch(boolean z) {
        this.allowInterceptTouch = z;
        preRefreshUI();
        return this;
    }

    public MessageMenu setAutoTintIconInLightOrDarkMode(boolean z) {
        this.autoTintIconInLightOrDarkMode = z;
        refreshUI();
        return this;
    }

    public MessageMenu setCancelButtonClickListener(OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.cancelButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setCustomView(OnBindView onBindView) {
        return setCustomView((OnBindView<MessageDialog>) onBindView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setDialogLifecycleCallback(DialogLifecycleCallback dialogLifecycleCallback) {
        return setDialogLifecycleCallback((DialogLifecycleCallback<MessageDialog>) dialogLifecycleCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setDialogXAnimImpl(DialogXAnimInterface dialogXAnimInterface) {
        return setDialogXAnimImpl((DialogXAnimInterface<MessageDialog>) dialogXAnimInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageMenu setIconResIds(List<Integer> list) {
        this.iconResIds = list;
        refreshUI();
        return this;
    }

    public MessageMenu setItemDivider(ItemDivider itemDivider) {
        this.itemDivider = itemDivider;
        refreshUI();
        return this;
    }

    public MessageMenu setMenuItemTextInfoInterceptor(MenuItemTextInfoInterceptor<MessageMenu> menuItemTextInfoInterceptor) {
        this.menuItemTextInfoInterceptor = menuItemTextInfoInterceptor;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageMenu setMenuList(List<CharSequence> list) {
        this.menuList = list;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public MessageMenu setMenuListAdapter(BaseAdapter baseAdapter) {
        this.menuListAdapter = baseAdapter;
        return this;
    }

    public MessageMenu setMenuMenuItemLayoutRefreshCallback(MenuItemLayoutRefreshCallback<MessageMenu> menuItemLayoutRefreshCallback) {
        this.menuMenuItemLayoutRefreshCallback = menuItemLayoutRefreshCallback;
        return this;
    }

    public MessageMenu setMenuStringList(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(list);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public MessageMenu setMenuTextInfo(TextInfo textInfo) {
        this.menuTextInfo = textInfo;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageMenu setMenus(CharSequence... charSequenceArr) {
        this.menuList = Arrays.asList(charSequenceArr);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public MessageMenu setMessageDialogMaxHeight(float f) {
        this.maxHeight = (int) f;
        return this;
    }

    public MessageMenu setMultiSelection() {
        this.selectMode = SELECT_MODE.MULTIPLE;
        this.selectionIndex = -1;
        this.selectionItems = new ArrayList<>();
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public MessageMenu setNoSelect() {
        this.selectMode = SELECT_MODE.NONE;
        this.selectionIndex = -1;
        this.selectionItems = null;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        return setOnBackPressedListener((OnBackPressedListener<MessageDialog>) onBackPressedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener onBackgroundMaskClickListener) {
        return setOnBackgroundMaskClickListener((OnBackgroundMaskClickListener<MessageDialog>) onBackgroundMaskClickListener);
    }

    public MessageMenu setOnIconChangeCallBack(OnIconChangeCallBack<MessageMenu> onIconChangeCallBack) {
        this.onIconChangeCallBack = onIconChangeCallBack;
        return this;
    }

    public MessageMenu setOnMenuItemClickListener(OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        this.onMenuItemClickListener = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageMenu setSelection(int i) {
        this.selectMode = SELECT_MODE.SINGLE;
        this.selectionIndex = i;
        this.selectionItems = null;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public MessageMenu setShowSelectedBackgroundTips(boolean z) {
        this.showSelectedBackgroundTips = z;
        refreshUI();
        return this;
    }

    public MessageMenu setSingleSelection() {
        this.selectMode = SELECT_MODE.SINGLE;
        this.selectionIndex = -1;
        this.selectionItems = null;
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static MessageMenu build(DialogXStyle dialogXStyle) {
        return new MessageMenu().setStyle(dialogXStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: appendMessage(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bindDismissWithLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bringToFront()Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAction(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAllAction()Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu cleanAllAction() {
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
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu onDismiss(DialogXRunnable<MessageDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu onShow(DialogXRunnable<MessageDialog> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: removeCustomView()Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu removeCustomView() {
        this.onBindView.clean();
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setActionRunnable(int i, DialogXRunnable<MessageDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBackgroundColor(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBackgroundColorRes(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBkgInterceptTouch(Z)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setCancelButton(int i, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setCancelButton(i, (OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setCancelTextInfo(TextInfo textInfo) {
        this.cancelTextInfo = textInfo;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelable(Z)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setCustomView(OnBindView<MessageDialog> onBindView) {
        this.onBindView = onBindView;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setDialogImplMode(Lcom/kongzue/dialogx/DialogX$IMPL_MODE;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setDialogLifecycleCallback(DialogLifecycleCallback<MessageDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4165me);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setDialogXAnimImpl(DialogXAnimInterface<MessageDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnterAnimDuration(J)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setExitAnimDuration(J)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setHapticFeedbackEnabled(Z)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setHapticFeedbackEnabled(boolean z) {
        this.isHapticFeedbackEnabled = z ? 1 : 0;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaskColor(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxHeight(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxWidth(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMessageTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinHeight(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinWidth(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setOkButton(int i, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOkButton(i, (OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOkTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOkTextInfo(TextInfo textInfo) {
        this.okTextInfo = textInfo;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOnBackPressedListener(OnBackPressedListener<MessageDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<MessageDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setOtherButton(int i, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOtherButton(i, (OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOtherTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOtherTextInfo(TextInfo textInfo) {
        this.otherTextInfo = textInfo;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setRadius(F)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setStyle(Lcom/kongzue/dialogx/interfaces/DialogXStyle;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTheme(Lcom/kongzue/dialogx/DialogX$THEME;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTitleTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setTitleTextInfo(TextInfo textInfo) {
        this.titleTextInfo = textInfo;
        preRefreshUI();
        return this;
    }

    public static MessageMenu build(OnBindView<MessageDialog> onBindView) {
        return new MessageMenu().setCustomView(onBindView);
    }

    public MessageMenu disableMenu(CharSequence... charSequenceArr) {
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

    public MessageMenu enableMenu(CharSequence... charSequenceArr) {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setCancelButton(OnDialogButtonClickListener onDialogButtonClickListener) {
        return setCancelButton((OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public MessageMenu setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public MessageMenu setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    public MessageMenu setIconResIds(int... iArr) {
        if (this.iconResIds == null) {
            this.iconResIds = new ArrayList();
        }
        for (int i : iArr) {
            this.iconResIds.add(Integer.valueOf(i));
        }
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMessage(CharSequence charSequence) {
        this.message = charSequence;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setOkButton(OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOkButton((OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setOtherButton(OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOtherButton((OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public MessageMenu setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setTitle(CharSequence charSequence) {
        this.title = charSequence;
        preRefreshUI();
        return this;
    }

    public static MessageMenu show(List<CharSequence> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu showStringList(List<String> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuStringList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public MessageMenu setMenuList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public MessageMenu setMenus(String... strArr) {
        this.menuList = Arrays.asList(strArr);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(Landroid/graphics/Bitmap;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setTitleIcon(Bitmap bitmap) {
        this.titleIcon = new BitmapDrawable(getResources(), bitmap);
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setCancelButton(CharSequence charSequence, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setCancelButton(charSequence, (OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(IZ)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setMessage(int i) {
        this.message = getString(i);
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setOkButton(CharSequence charSequence, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOkButton(charSequence, (OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public /* bridge */ /* synthetic */ MessageDialog setOtherButton(CharSequence charSequence, OnDialogButtonClickListener onDialogButtonClickListener) {
        return setOtherButton(charSequence, (OnDialogButtonClickListener<MessageDialog>) onDialogButtonClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(IIII)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setTitle(int i) {
        this.title = getString(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCancelButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setCancelButton(CharSequence charSequence) {
        this.cancelText = charSequence;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOkButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOkButton(CharSequence charSequence) {
        this.okText = charSequence;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOtherButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOtherButton(CharSequence charSequence) {
        this.otherText = charSequence;
        preRefreshUI();
        return this;
    }

    public MessageMenu setSelection(int[] iArr) {
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

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setTitleIcon(int i) {
        this.titleIcon = getResources().getDrawable(i);
        refreshUI();
        return this;
    }

    public static MessageMenu show(String... strArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuList(strArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu showStringList(CharSequence charSequence, CharSequence charSequence2, List<String> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuStringList(list);
        messageMenu.show();
        return messageMenu;
    }

    public MessageMenu disableMenu(String... strArr) {
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

    public MessageMenu enableMenu(String... strArr) {
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

    /* JADX DEBUG: Method merged with bridge method: setCancelButton(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setCancelButton(int i) {
        this.cancelText = getString(i);
        preRefreshUI();
        return this;
    }

    public MessageMenu setMenuList(CharSequence[] charSequenceArr) {
        this.menuList = Arrays.asList(charSequenceArr);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOkButton(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOkButton(int i) {
        this.okText = getString(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOtherButton(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setOtherButton(int i) {
        this.otherText = getString(i);
        preRefreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(Landroid/graphics/drawable/Drawable;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public MessageMenu setTitleIcon(Drawable drawable) {
        this.titleIcon = drawable;
        refreshUI();
        return this;
    }

    public MessageMenu setCancelButton(OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.cancelButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public MessageMenu setOkButton(OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.okButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public MessageMenu setOtherButton(OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.otherButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public static MessageMenu show(String[] strArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuList(strArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public MessageMenu setCancelButton(CharSequence charSequence, OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.cancelText = charSequence;
        this.cancelButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public MessageMenu setOkButton(CharSequence charSequence, OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.okText = charSequence;
        this.okButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public MessageMenu setOtherButton(CharSequence charSequence, OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.otherText = charSequence;
        this.otherButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public static MessageMenu showStringList(CharSequence charSequence, CharSequence charSequence2, List<String> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuStringList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public MessageMenu setOkButton(int i, OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.okText = getString(i);
        this.okButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public MessageMenu setOtherButton(int i, OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.otherText = getString(i);
        this.otherButtonClickListener = onMenuButtonClickListener;
        return this;
    }

    public MessageMenu setSelection(List<Integer> list) {
        this.selectMode = SELECT_MODE.MULTIPLE;
        this.selectionIndex = -1;
        this.selectionItems = new ArrayList<>(list);
        this.menuListAdapter = null;
        preRefreshUI();
        return this;
    }

    public MessageMenu setCancelButton(int i, OnMenuButtonClickListener<MessageMenu> onMenuButtonClickListener) {
        this.cancelText = getString(i);
        this.cancelButtonClickListener = onMenuButtonClickListener;
        preRefreshUI();
        return this;
    }

    public static MessageMenu show(CharSequence[] charSequenceArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.show();
        return messageMenu;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setOkButton(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.okButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setOtherButton(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.otherButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setOkButton(CharSequence charSequence, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.okText = charSequence;
        this.okButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setOtherButton(CharSequence charSequence, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.otherText = charSequence;
        this.otherButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setCancelButton(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.cancelButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public static MessageMenu show(CharSequence[] charSequenceArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setCancelButton(CharSequence charSequence, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.cancelText = charSequence;
        this.cancelButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setOkButton(int i, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.okText = getString(i);
        this.okButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setOtherButton(int i, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.otherText = getString(i);
        this.otherButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public static MessageMenu showStringList(String str, String str2, List<String> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuStringList(list);
        messageMenu.show();
        return messageMenu;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @Deprecated
    public MessageMenu setCancelButton(int i, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.cancelText = getString(i);
        this.cancelButtonClickListener = onDialogButtonClickListener;
        preRefreshUI();
        return this;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu showStringList(String str, String str2, List<String> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuStringList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu showStringList(int i, int i2, List<String> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setMenuStringList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, List<CharSequence> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu showStringList(int i, int i2, List<String> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setMenuStringList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, List<CharSequence> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.setMenuList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence charSequence2, String[] strArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuList(strArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence charSequence2, String[] strArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuList(strArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence charSequence2, CharSequence[] charSequenceArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence charSequence2, CharSequence[] charSequenceArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.message = charSequence2;
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(String str, String str2, List<CharSequence> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(String str, String str2, List<CharSequence> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuList(list);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(String str, String str2, String[] strArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuList(strArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(String str, String str2, String[] strArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuList(strArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(String str, String str2, CharSequence[] charSequenceArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(String str, String str2, CharSequence[] charSequenceArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = str;
        messageMenu.message = str2;
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, int i2, List<CharSequence> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, List<CharSequence> list) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, int i2, String[] strArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setMenuList(strArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, int i2, CharSequence[] charSequenceArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, int i2, List<CharSequence> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, List<CharSequence> list, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.setMenuList(list);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, int i2, String[] strArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setMenuList(strArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, int i2, CharSequence[] charSequenceArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.message = messageMenu.getString(i2);
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence[] charSequenceArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, String[] strArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.setMenuList(strArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, CharSequence[] charSequenceArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(CharSequence charSequence, String[] strArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = charSequence;
        messageMenu.setMenuList(strArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, CharSequence[] charSequenceArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, String[] strArr) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.setMenuList(strArr);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, CharSequence[] charSequenceArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.setMenuList(charSequenceArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }

    public static MessageMenu show(int i, String[] strArr, OnMenuItemClickListener<MessageMenu> onMenuItemClickListener) {
        MessageMenu messageMenu = new MessageMenu();
        messageMenu.title = messageMenu.getString(i);
        messageMenu.setMenuList(strArr);
        messageMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        messageMenu.show();
        return messageMenu;
    }
}
