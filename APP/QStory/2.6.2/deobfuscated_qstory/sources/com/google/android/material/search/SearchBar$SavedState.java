package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class SearchBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SearchBar$SavedState> CREATOR = new C3168(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f10540;

    public SearchBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10540 = parcel.readString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f10540);
    }
}
