package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: renamed from: com.google.android.material.navigation.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3168 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.f10541 = parcel.readInt();
        navigationBarPresenter$SavedState.f10540 = (ParcelableSparseArray) parcel.readParcelable(NavigationBarPresenter$SavedState.class.getClassLoader());
        return navigationBarPresenter$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NavigationBarPresenter$SavedState[i];
    }
}
