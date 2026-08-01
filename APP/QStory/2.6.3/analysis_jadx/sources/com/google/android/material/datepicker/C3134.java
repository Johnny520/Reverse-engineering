package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3134 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10325;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10325) {
            case 0:
                return Month.m7115(parcel.readInt(), parcel.readInt());
            case 1:
                return new DateValidatorPointBackward(parcel.readLong());
            case 2:
                return new DateValidatorPointForward(parcel.readLong());
            case 3:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.f10276 = null;
                rangeDateSelector.f10277 = null;
                rangeDateSelector.f10275 = null;
                rangeDateSelector.f10274 = null;
                rangeDateSelector.f10276 = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.f10277 = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            default:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.f10279 = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10325) {
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
