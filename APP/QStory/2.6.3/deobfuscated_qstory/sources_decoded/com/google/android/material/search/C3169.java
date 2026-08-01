package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.search.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3169 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10548;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f10548) {
            case 0:
                return new SearchBar$SavedState(parcel, classLoader);
            default:
                return new SearchView$SavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10548) {
            case 0:
                return new SearchBar$SavedState[i];
            default:
                return new SearchView$SavedState[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10548) {
            case 0:
                return new SearchBar$SavedState(parcel, null);
            default:
                return new SearchView$SavedState(parcel, null);
        }
    }
}
