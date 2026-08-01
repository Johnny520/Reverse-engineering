package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.navigation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3166 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10539;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f10539) {
            case 0:
                return new NavigationBarView$SavedState(parcel, classLoader);
            default:
                return new NavigationView$SavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10539) {
            case 0:
                return new NavigationBarView$SavedState[i];
            default:
                return new NavigationView$SavedState[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10539) {
            case 0:
                return new NavigationBarView$SavedState(parcel, null);
            default:
                return new NavigationView$SavedState(parcel, null);
        }
    }
}
