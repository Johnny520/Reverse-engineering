package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class SearchView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SearchView$SavedState> CREATOR = new C3169(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10546;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f10547;

    public SearchView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10547 = parcel.readString();
        this.f10546 = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f10547);
        parcel.writeInt(this.f10546);
    }
}
