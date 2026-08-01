package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.checkbox.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3107 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(parcel);
        materialCheckBox$SavedState.f10180 = ((Integer) parcel.readValue(MaterialCheckBox$SavedState.class.getClassLoader())).intValue();
        return materialCheckBox$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MaterialCheckBox$SavedState[i];
    }
}
