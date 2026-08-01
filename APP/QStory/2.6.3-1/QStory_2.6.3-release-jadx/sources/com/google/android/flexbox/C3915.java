package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3915 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
        layoutParams.f10233 = 0.0f;
        layoutParams.f10236 = 1.0f;
        layoutParams.f10237 = -1;
        layoutParams.f10234 = -1.0f;
        layoutParams.f10231 = 16777215;
        layoutParams.f10230 = 16777215;
        layoutParams.f10233 = parcel.readFloat();
        layoutParams.f10236 = parcel.readFloat();
        layoutParams.f10237 = parcel.readInt();
        layoutParams.f10234 = parcel.readFloat();
        layoutParams.f10235 = parcel.readInt();
        layoutParams.f10232 = parcel.readInt();
        layoutParams.f10231 = parcel.readInt();
        layoutParams.f10230 = parcel.readInt();
        layoutParams.f10229 = parcel.readByte() != 0;
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
