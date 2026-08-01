package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3133 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10320;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10320) {
            case 0:
                return Month.m7128(parcel.readInt(), parcel.readInt());
            case 1:
                return new DateValidatorPointBackward(parcel.readLong());
            case 2:
                return new DateValidatorPointForward(parcel.readLong());
            case 3:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.f10271 = null;
                rangeDateSelector.f10272 = null;
                rangeDateSelector.f10270 = null;
                rangeDateSelector.f10269 = null;
                rangeDateSelector.f10271 = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.f10272 = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            default:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.f10274 = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10320) {
            case 0:
                return new Month[i];
            case 1:
                return new DateValidatorPointBackward[i];
            case 2:
                return new DateValidatorPointForward[i];
            case 3:
                return new RangeDateSelector[i];
            default:
                return new SingleDateSelector[i];
        }
    }
}
