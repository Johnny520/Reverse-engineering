package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class NavigationBarPresenter implements androidx.appcompat.view.menu.InterfaceC7352 {
    private int id;
    private androidx.appcompat.view.menu.C7343 menu;
    private com.google.android.material.navigation.NavigationBarMenuView menuView;
    private boolean updateSuspended;

    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationBarPresenter.SavedState> CREATOR = null;

        @Yue.InterfaceC4544
        com.google.android.material.internal.ParcelableSparseArray badgeSavedStates;
        int selectedItemId;


        static {
                com.google.android.material.navigation.NavigationBarPresenter$SavedState$1 r0 = new com.google.android.material.navigation.NavigationBarPresenter$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationBarPresenter.SavedState.CREATOR = r0
                return
        }

        public SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        public SavedState(@Yue.InterfaceC4410 android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.selectedItemId = r0
                java.lang.Class r0 = r1.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r2 = r2.readParcelable(r0)
                com.google.android.material.internal.ParcelableSparseArray r2 = (com.google.android.material.internal.ParcelableSparseArray) r2
                r1.badgeSavedStates = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Yue.InterfaceC4410 android.os.Parcel r2, int r3) {
                r1 = this;
                int r3 = r1.selectedItemId
                r2.writeInt(r3)
                com.google.android.material.internal.ParcelableSparseArray r3 = r1.badgeSavedStates
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }
    }

    public NavigationBarPresenter() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.updateSuspended = r0
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean collapseItemActionView(@Yue.InterfaceC4544 androidx.appcompat.view.menu.C7343 r1, @Yue.InterfaceC4544 androidx.appcompat.view.menu.C7348 r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean expandItemActionView(@Yue.InterfaceC4544 androidx.appcompat.view.menu.C7343 r1, @Yue.InterfaceC4544 androidx.appcompat.view.menu.C7348 r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    @Yue.InterfaceC4544
    public androidx.appcompat.view.menu.InterfaceC7354 getMenuView(@Yue.InterfaceC4544 android.view.ViewGroup r1) {
            r0 = this;
            com.google.android.material.navigation.NavigationBarMenuView r1 = r0.menuView
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void initForMenu(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2) {
            r0 = this;
            r0.menu = r2
            com.google.android.material.navigation.NavigationBarMenuView r1 = r0.menuView
            r1.initialize(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onCloseMenu(@Yue.InterfaceC4544 androidx.appcompat.view.menu.C7343 r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onRestoreInstanceState(@Yue.InterfaceC4410 android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.navigation.NavigationBarPresenter.SavedState
            if (r0 == 0) goto L1e
            com.google.android.material.navigation.NavigationBarMenuView r0 = r2.menuView
            com.google.android.material.navigation.NavigationBarPresenter$SavedState r3 = (com.google.android.material.navigation.NavigationBarPresenter.SavedState) r3
            int r1 = r3.selectedItemId
            r0.tryRestoreSelectedItemId(r1)
            com.google.android.material.navigation.NavigationBarMenuView r0 = r2.menuView
            android.content.Context r0 = r0.getContext()
            com.google.android.material.internal.ParcelableSparseArray r3 = r3.badgeSavedStates
            android.util.SparseArray r3 = com.google.android.material.badge.BadgeUtils.createBadgeDrawablesFromSavedStates(r0, r3)
            com.google.android.material.navigation.NavigationBarMenuView r0 = r2.menuView
            r0.restoreBadgeDrawables(r3)
        L1e:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    @Yue.InterfaceC4410
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.navigation.NavigationBarPresenter$SavedState r0 = new com.google.android.material.navigation.NavigationBarPresenter$SavedState
            r0.<init>()
            com.google.android.material.navigation.NavigationBarMenuView r1 = r2.menuView
            int r1 = r1.getSelectedItemId()
            r0.selectedItemId = r1
            com.google.android.material.navigation.NavigationBarMenuView r1 = r2.menuView
            android.util.SparseArray r1 = r1.getBadgeDrawables()
            com.google.android.material.internal.ParcelableSparseArray r1 = com.google.android.material.badge.BadgeUtils.createParcelableBadgeStates(r1)
            r0.badgeSavedStates = r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean onSubMenuSelected(@Yue.InterfaceC4544 androidx.appcompat.view.menu.SubMenuC7359 r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void setCallback(@Yue.InterfaceC4544 androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1) {
            r0 = this;
            return
    }

    public void setId(int r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setMenuView(@Yue.InterfaceC4410 com.google.android.material.navigation.NavigationBarMenuView r1) {
            r0 = this;
            r0.menuView = r1
            return
    }

    public void setUpdateSuspended(boolean r1) {
            r0 = this;
            r0.updateSuspended = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void updateMenuView(boolean r2) {
            r1 = this;
            boolean r0 = r1.updateSuspended
            if (r0 == 0) goto L5
            return
        L5:
            if (r2 == 0) goto Ld
            com.google.android.material.navigation.NavigationBarMenuView r2 = r1.menuView
            r2.buildMenuView()
            goto L12
        Ld:
            com.google.android.material.navigation.NavigationBarMenuView r2 = r1.menuView
            r2.updateMenuView()
        L12:
            return
    }
}
