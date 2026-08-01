package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.slider.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4003 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10924;

    public /* synthetic */ C4003(int i) {
        this.f10924 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f10924) {
            case 0:
                BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(parcel);
                baseSlider$SliderState.f10921 = parcel.readFloat();
                baseSlider$SliderState.f10919 = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSlider$SliderState.f10920 = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSlider$SliderState.f10918 = parcel.readFloat();
                baseSlider$SliderState.f10917 = parcel.createBooleanArray()[0];
                return baseSlider$SliderState;
            default:
                return new AbsSavedState(parcel) { // from class: com.google.android.material.slider.RangeSlider$RangeSliderState
                    public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new C4003(1);

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final int f10922;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final float f10923;

                    {
                        super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
                        this.f10923 = parcel.readFloat();
                        this.f10922 = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        super.writeToParcel(parcel2, i);
                        parcel2.writeFloat(this.f10923);
                        parcel2.writeInt(this.f10922);
                    }
                };
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10924) {
            case 0:
                return new BaseSlider$SliderState[i];
            default:
                return new RangeSlider$RangeSliderState[i];
        }
    }
}
