package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3083 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
        layoutParams.f9888 = 0.0f;
        layoutParams.f9891 = 1.0f;
        layoutParams.f9892 = -1;
        layoutParams.f9889 = -1.0f;
        layoutParams.f9886 = 16777215;
        layoutParams.f9885 = 16777215;
        layoutParams.f9888 = parcel.readFloat();
        layoutParams.f9891 = parcel.readFloat();
        layoutParams.f9892 = parcel.readInt();
        layoutParams.f9889 = parcel.readFloat();
        layoutParams.f9890 = parcel.readInt();
        layoutParams.f9887 = parcel.readInt();
        layoutParams.f9886 = parcel.readInt();
        layoutParams.f9885 = parcel.readInt();
        layoutParams.f9884 = parcel.readByte() != 0;
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
