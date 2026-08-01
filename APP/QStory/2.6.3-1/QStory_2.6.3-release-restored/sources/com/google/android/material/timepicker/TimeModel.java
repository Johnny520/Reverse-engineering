package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C4049();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f11180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f11182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11183;

    public TimeModel(Parcel parcel) {
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        int i4 = parcel.readInt();
        this.f11181 = i;
        this.f11182 = i2;
        this.f11180 = i3;
        this.f11183 = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f11181 == timeModel.f11181 && this.f11182 == timeModel.f11182 && this.f11183 == timeModel.f11183 && this.f11180 == timeModel.f11180;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11183), Integer.valueOf(this.f11181), Integer.valueOf(this.f11182), Integer.valueOf(this.f11180)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11181);
        parcel.writeInt(this.f11182);
        parcel.writeInt(this.f11180);
        parcel.writeInt(this.f11183);
    }
}
