package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.slider.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3171 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10579;

    public /* synthetic */ C3171(int i) {
        this.f10579 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f10579) {
            case 0:
                BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(parcel);
                baseSlider$SliderState.f10576 = parcel.readFloat();
                baseSlider$SliderState.f10574 = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSlider$SliderState.f10575 = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSlider$SliderState.f10573 = parcel.readFloat();
                baseSlider$SliderState.f10572 = parcel.createBooleanArray()[0];
                return baseSlider$SliderState;
            default:
                return new AbsSavedState(parcel) { // from class: com.google.android.material.slider.RangeSlider$RangeSliderState
                    public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new C3171(1);

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final int f10577;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final float f10578;

                    {
                        super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
                        this.f10578 = parcel.readFloat();
                        this.f10577 = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        super.writeToParcel(parcel2, i);
                        parcel2.writeFloat(this.f10578);
                        parcel2.writeInt(this.f10577);
                    }
                };
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10579) {
            case 0:
                return new BaseSlider$SliderState[i];
            default:
                return new RangeSlider$RangeSliderState[i];
        }
    }
}
