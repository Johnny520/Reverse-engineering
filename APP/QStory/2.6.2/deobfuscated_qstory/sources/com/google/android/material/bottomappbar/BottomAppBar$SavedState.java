package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BottomAppBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<BottomAppBar$SavedState> CREATOR = new C3088();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f10011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f10012;

    public BottomAppBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10012 = parcel.readInt();
        this.f10011 = parcel.readInt() != 0;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10012);
        parcel.writeInt(this.f10011 ? 1 : 0);
    }
}
