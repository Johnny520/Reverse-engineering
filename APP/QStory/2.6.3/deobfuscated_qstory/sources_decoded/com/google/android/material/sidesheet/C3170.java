package com.google.android.material.sidesheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3170 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SideSheetBehavior.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SideSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SideSheetBehavior.SavedState(parcel, classLoader);
    }
}
