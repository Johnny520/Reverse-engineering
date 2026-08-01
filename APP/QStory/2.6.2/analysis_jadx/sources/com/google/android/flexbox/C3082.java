package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3082 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
        layoutParams.f9883 = 0.0f;
        layoutParams.f9886 = 1.0f;
        layoutParams.f9887 = -1;
        layoutParams.f9884 = -1.0f;
        layoutParams.f9881 = 16777215;
        layoutParams.f9880 = 16777215;
        layoutParams.f9883 = parcel.readFloat();
        layoutParams.f9886 = parcel.readFloat();
        layoutParams.f9887 = parcel.readInt();
        layoutParams.f9884 = parcel.readFloat();
        layoutParams.f9885 = parcel.readInt();
        layoutParams.f9882 = parcel.readInt();
        layoutParams.f9881 = parcel.readInt();
        layoutParams.f9880 = parcel.readInt();
        layoutParams.f9879 = parcel.readByte() != 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
        return layoutParams;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FlexboxLayoutManager.LayoutParams[i];
    }
}
