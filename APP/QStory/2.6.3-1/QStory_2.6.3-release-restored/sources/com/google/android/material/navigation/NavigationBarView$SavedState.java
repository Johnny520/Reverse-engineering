package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class NavigationBarView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<NavigationBarView$SavedState> CREATOR = new C3999(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Bundle f10887;

    public NavigationBarView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10887 = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f10887);
    }
}
