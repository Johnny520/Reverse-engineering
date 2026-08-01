package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.slider.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3170 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10574;

    public /* synthetic */ C3170(int i) {
        this.f10574 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f10574) {
            case 0:
                BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(parcel);
                baseSlider$SliderState.f10571 = parcel.readFloat();
                baseSlider$SliderState.f10569 = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSlider$SliderState.f10570 = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSlider$SliderState.f10568 = parcel.readFloat();
                baseSlider$SliderState.f10567 = parcel.createBooleanArray()[0];
                return baseSlider$SliderState;
            default:
                return new AbsSavedState(parcel) { // from class: com.google.android.material.slider.RangeSlider$RangeSliderState
                    public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new C3170(1);

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final int f10572;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final float f10573;

                    {
                        super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
                        this.f10573 = parcel.readFloat();
                        this.f10572 = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        super.writeToParcel(parcel2, i);
                        parcel2.writeFloat(this.f10573);
                        parcel2.writeInt(this.f10572);
                    }
                };
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10574) {
            case 0:
                return new BaseSlider$SliderState[i];
            default:
                return new RangeSlider$RangeSliderState[i];
        }
    }
}
