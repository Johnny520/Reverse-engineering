package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3077 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
        layoutParams.f9858 = 1;
        layoutParams.f9856 = 0.0f;
        layoutParams.f9857 = 1.0f;
        layoutParams.f9851 = -1;
        layoutParams.f9850 = -1.0f;
        layoutParams.f9854 = -1;
        layoutParams.f9855 = -1;
        layoutParams.f9852 = 16777215;
        layoutParams.f9853 = 16777215;
        layoutParams.f9858 = parcel.readInt();
        layoutParams.f9856 = parcel.readFloat();
        layoutParams.f9857 = parcel.readFloat();
        layoutParams.f9851 = parcel.readInt();
        layoutParams.f9850 = parcel.readFloat();
        layoutParams.f9854 = parcel.readInt();
        layoutParams.f9855 = parcel.readInt();
        layoutParams.f9852 = parcel.readInt();
        layoutParams.f9853 = parcel.readInt();
        layoutParams.f9849 = parcel.readByte() != 0;
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
        return new FlexboxLayout.LayoutParams[i];
    }
}
