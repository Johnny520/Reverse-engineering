package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3966 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10670;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10670) {
            case 0:
                return Month.m7674(parcel.readInt(), parcel.readInt());
            case 1:
                return new DateValidatorPointBackward(parcel.readLong());
            case 2:
                return new DateValidatorPointForward(parcel.readLong());
            case 3:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.f10621 = null;
                rangeDateSelector.f10622 = null;
                rangeDateSelector.f10620 = null;
                rangeDateSelector.f10619 = null;
                rangeDateSelector.f10621 = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.f10622 = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            default:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.f10624 = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10670) {
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
