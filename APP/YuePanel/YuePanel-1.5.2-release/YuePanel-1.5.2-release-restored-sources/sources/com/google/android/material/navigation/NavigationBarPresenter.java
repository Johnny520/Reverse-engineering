package com.google.android.material.navigation;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.view.menu.SubMenuC8702;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class NavigationBarPresenter implements InterfaceC8699 {

    /* JADX INFO: renamed from: id */
    private int f4118id;
    private C8694 menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6391
            public SavedState createFromParcel(@InterfaceC6391 Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6391
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        @InterfaceC6490
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@InterfaceC6391 Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean collapseItemActionView(@InterfaceC6490 C8694 c8694, @InterfaceC6490 C8697 c8697) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean expandItemActionView(@InterfaceC6490 C8694 c8694, @InterfaceC6490 C8697 c8697) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public int getId() {
        return this.f4118id;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    @InterfaceC6490
    public InterfaceC8700 getMenuView(@InterfaceC6490 ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void initForMenu(@InterfaceC6391 Context context, @InterfaceC6391 C8694 c8694) {
        this.menu = c8694;
        this.menuView.initialize(c8694);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onCloseMenu(@InterfaceC6490 C8694 c8694, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onRestoreInstanceState(@InterfaceC6391 Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    @InterfaceC6391
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean onSubMenuSelected(@InterfaceC6490 SubMenuC8702 subMenuC8702) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void setCallback(@InterfaceC6490 InterfaceC8699.InterfaceC1607 interfaceC1607) {
    }

    public void setId(int i) {
        this.f4118id = i;
    }

    public void setMenuView(@InterfaceC6391 NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        if (z) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }
}
