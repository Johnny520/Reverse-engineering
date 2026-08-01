package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3909 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
        layoutParams.f10203 = 1;
        layoutParams.f10201 = 0.0f;
        layoutParams.f10202 = 1.0f;
        layoutParams.f10196 = -1;
        layoutParams.f10195 = -1.0f;
        layoutParams.f10199 = -1;
        layoutParams.f10200 = -1;
        layoutParams.f10197 = 16777215;
        layoutParams.f10198 = 16777215;
        layoutParams.f10203 = parcel.readInt();
        layoutParams.f10201 = parcel.readFloat();
        layoutParams.f10202 = parcel.readFloat();
        layoutParams.f10196 = parcel.readInt();
        layoutParams.f10195 = parcel.readFloat();
        layoutParams.f10199 = parcel.readInt();
        layoutParams.f10200 = parcel.readInt();
        layoutParams.f10197 = parcel.readInt();
        layoutParams.f10198 = parcel.readInt();
        layoutParams.f10194 = parcel.readByte() != 0;
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
