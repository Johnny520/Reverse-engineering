package com.google.android.material.internal;

import Yue.C3024;
import Yue.C3055;
import Yue.C7759;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC4399;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.view.menu.SubMenuC8702;
import androidx.recyclerview.widget.C8989;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1980R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class NavigationMenuPresenter implements InterfaceC8699 {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private InterfaceC8699.InterfaceC1607 callback;

    @InterfaceC6844
    int dividerInsetEnd;

    @InterfaceC6844
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;

    /* JADX INFO: renamed from: id */
    private int f4117id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;

    @InterfaceC6844
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    C8694 menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;

    @InterfaceC6490
    ColorStateList subheaderColor;

    @InterfaceC6844
    int subheaderInsetEnd;

    @InterfaceC6844
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled = true;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            C8697 itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean zPerformItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public class NavigationMenuAdapter extends RecyclerView.AbstractC8909<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private C8697 checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 2 || NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 3) {
                    i2--;
                }
            }
            return i2;
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
            while (i < i2) {
                ((NavigationMenuTextItem) this.items.get(i)).needsEmptyIcon = true;
                i++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            boolean z = true;
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                C8697 c8697 = NavigationMenuPresenter.this.menu.getVisibleItems().get(i2);
                if (c8697.isChecked()) {
                    setCheckedItem(c8697);
                }
                if (c8697.isCheckable()) {
                    c8697.m29044(false);
                }
                if (c8697.hasSubMenu()) {
                    SubMenu subMenu = c8697.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(c8697));
                        int size3 = this.items.size();
                        int size4 = subMenu.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size4) {
                            C8697 c86972 = (C8697) subMenu.getItem(i3);
                            if (c86972.isVisible()) {
                                if (!z3 && c86972.getIcon() != null) {
                                    z3 = z;
                                }
                                if (c86972.isCheckable()) {
                                    c86972.m29044(false);
                                }
                                if (c8697.isChecked()) {
                                    setCheckedItem(c8697);
                                }
                                this.items.add(new NavigationMenuTextItem(c86972));
                            }
                            i3++;
                            z = true;
                        }
                        if (z3) {
                            appendTransparentIconIfMissing(size3, this.items.size());
                        }
                    }
                } else {
                    int groupId = c8697.getGroupId();
                    if (groupId != i) {
                        size2 = this.items.size();
                        z2 = c8697.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i4 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i4, i4));
                        }
                    } else if (!z2 && c8697.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.items.size());
                        z2 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(c8697);
                    navigationMenuTextItem.needsEmptyIcon = z2;
                    this.items.add(navigationMenuTextItem);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.updateSuspended = false;
        }

        private void setAccessibilityDelegate(View view, final int i, final boolean z) {
            C8273.m27439(view, new C3024() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // Yue.C3024
                public void onInitializeAccessibilityNodeInfo(@InterfaceC6391 View view2, @InterfaceC6391 C3055 c3055) {
                    super.onInitializeAccessibilityNodeInfo(view2, c3055);
                    c3055.m6060(C3055.C3060.m6143(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i), 1, 1, 1, z, view2.isSelected()));
                }
            });
        }

        @InterfaceC6391
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            C8697 c8697 = this.checkedItem;
            if (c8697 != null) {
                bundle.putInt(STATE_CHECKED_ITEM, c8697.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i = 0; i < size; i++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    C8697 menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public C8697 getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
        public int getItemViewType(int i) {
            NavigationMenuItem navigationMenuItem = this.items.get(i);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public int getRowCount() {
            int i = 0;
            for (int i2 = 0; i2 < NavigationMenuPresenter.this.adapter.getItemCount(); i2++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        public void restoreInstanceState(@InterfaceC6391 Bundle bundle) {
            C8697 menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C8697 menuItem2;
            int i = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.items.get(i2);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i2++;
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i3);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@InterfaceC6391 C8697 c8697) {
            if (this.checkedItem == c8697 || !c8697.isCheckable()) {
                return;
            }
            C8697 c86972 = this.checkedItem;
            if (c86972 != null) {
                c86972.setChecked(false);
            }
            this.checkedItem = c8697;
            c8697.setChecked(true);
        }

        public void setUpdateSuspended(boolean z) {
            this.updateSuspended = z;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
        public void onBindViewHolder(@InterfaceC6391 ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i);
                    viewHolder.itemView.setPadding(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i)).getMenuItem().getTitle());
                C7759.m24676(textView, NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPadding(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            C8273.m27447(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i2 = navigationMenuPresenter.itemHorizontalPadding;
            int i3 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i2, i3, i2, i3);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            setAccessibilityDelegate(navigationMenuItemView, i, false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ; */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
        @InterfaceC6490
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.paddingTop = i;
            this.paddingBottom = i2;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final C8697 menuItem;
        boolean needsEmptyIcon;

        public NavigationMenuTextItem(C8697 c8697) {
            this.menuItem = c8697;
        }

        public C8697 getMenuItem() {
            return this.menuItem;
        }
    }

    public class NavigationMenuViewAccessibilityDelegate extends C8989 {
        public NavigationMenuViewAccessibilityDelegate(@InterfaceC6391 RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C8989, Yue.C3024
        public void onInitializeAccessibilityNodeInfo(View view, @InterfaceC6391 C3055 c3055) {
            super.onInitializeAccessibilityNodeInfo(view, c3055);
            c3055.m6059(C3055.C3059.m6138(NavigationMenuPresenter.this.adapter.getRowCount(), 1, false));
        }
    }

    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@InterfaceC6391 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C1980R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@InterfaceC6391 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C1980R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@InterfaceC6391 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C1980R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public static abstract class ViewHolder extends RecyclerView.AbstractC8938 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private boolean hasHeader() {
        return getHeaderCount() > 0;
    }

    private void updateTopPadding() {
        int i = (hasHeader() || !this.isBehindStatusBar) ? 0 : this.paddingTopDefault;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(@InterfaceC6391 View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean collapseItemActionView(C8694 c8694, C8697 c8697) {
        return false;
    }

    public void dispatchApplyWindowInsets(@InterfaceC6391 C8472 c8472) {
        int iM28293 = c8472.m28293();
        if (this.paddingTopDefault != iM28293) {
            this.paddingTopDefault = iM28293;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c8472.m28290());
        C8273.m27317(this.headerLayout, c8472);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean expandItemActionView(C8694 c8694, C8697 c8697) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean flagActionItems() {
        return false;
    }

    @InterfaceC6490
    public C8697 getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    @InterfaceC6844
    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    @InterfaceC6844
    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.headerLayout.getChildAt(i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public int getId() {
        return this.f4117id;
    }

    @InterfaceC6490
    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    @InterfaceC6490
    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    @InterfaceC6490
    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    @InterfaceC6844
    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public InterfaceC8700 getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(C1980R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.adapter = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i = this.overScrollMode;
            if (i != -1) {
                this.menuView.setOverScrollMode(i);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(C1980R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            C8273.m27457(linearLayout, 2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    @InterfaceC6844
    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    @InterfaceC6844
    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(@InterfaceC5683 int i) {
        View viewInflate = this.layoutInflater.inflate(i, (ViewGroup) this.headerLayout, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void initForMenu(@InterfaceC6391 Context context, @InterfaceC6391 C8694 c8694) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = c8694;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(C1980R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onCloseMenu(C8694 c8694, boolean z) {
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.callback;
        if (interfaceC1607 != null) {
            interfaceC1607.onCloseMenu(c8694, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    @InterfaceC6391
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean onSubMenuSelected(SubMenuC8702 subMenuC8702) {
        return false;
    }

    public void removeHeaderView(@InterfaceC6391 View view) {
        this.headerLayout.removeView(view);
        if (hasHeader()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z) {
        if (this.isBehindStatusBar != z) {
            this.isBehindStatusBar = z;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void setCallback(InterfaceC8699.InterfaceC1607 interfaceC1607) {
        this.callback = interfaceC1607;
    }

    public void setCheckedItem(@InterfaceC6391 C8697 c8697) {
        this.adapter.setCheckedItem(c8697);
    }

    public void setDividerInsetEnd(@InterfaceC6844 int i) {
        this.dividerInsetEnd = i;
        updateMenuView(false);
    }

    public void setDividerInsetStart(@InterfaceC6844 int i) {
        this.dividerInsetStart = i;
        updateMenuView(false);
    }

    public void setId(int i) {
        this.f4117id = i;
    }

    public void setItemBackground(@InterfaceC6490 Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(@InterfaceC6490 RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i) {
        this.itemHorizontalPadding = i;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i) {
        this.itemIconPadding = i;
        updateMenuView(false);
    }

    public void setItemIconSize(@InterfaceC4399 int i) {
        if (this.itemIconSize != i) {
            this.itemIconSize = i;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        this.itemMaxLines = i;
        updateMenuView(false);
    }

    public void setItemTextAppearance(@InterfaceC7651 int i) {
        this.textAppearance = i;
        updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.textAppearanceActiveBoldEnabled = z;
        updateMenuView(false);
    }

    public void setItemTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(@InterfaceC6844 int i) {
        this.itemVerticalPadding = i;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i) {
        this.overScrollMode = i;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public void setSubheaderColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(@InterfaceC6844 int i) {
        this.subheaderInsetEnd = i;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(@InterfaceC6844 int i) {
        this.subheaderInsetStart = i;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(@InterfaceC7651 int i) {
        this.subheaderTextAppearance = i;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void updateMenuView(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
