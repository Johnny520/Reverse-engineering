package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3076 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
        layoutParams.f9853 = 1;
        layoutParams.f9851 = 0.0f;
        layoutParams.f9852 = 1.0f;
        layoutParams.f9846 = -1;
        layoutParams.f9845 = -1.0f;
        layoutParams.f9849 = -1;
        layoutParams.f9850 = -1;
        layoutParams.f9847 = 16777215;
        layoutParams.f9848 = 16777215;
        layoutParams.f9853 = parcel.readInt();
        layoutParams.f9851 = parcel.readFloat();
        layoutParams.f9852 = parcel.readFloat();
        layoutParams.f9846 = parcel.readInt();
        layoutParams.f9845 = parcel.readFloat();
        layoutParams.f9849 = parcel.readInt();
        layoutParams.f9850 = parcel.readInt();
        layoutParams.f9847 = parcel.readInt();
        layoutParams.f9848 = parcel.readInt();
        layoutParams.f9844 = parcel.readByte() != 0;
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
