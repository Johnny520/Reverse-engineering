// Decompiled by JEB v5.42.0.202606242140

package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import c.ᵢʼ.CLS320;
import c.ᵢʼ.CLS805;

public class ParcelImpl implements Parcelable {
    public static final class CLS13 implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.MTH700(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.MTH701(v);
        }

        public ParcelImpl MTH700(Parcel parcel0) {
            return new ParcelImpl(parcel0);
        }

        public ParcelImpl[] MTH701(int v) {
            return new ParcelImpl[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final CLS320 FLD91;

    static {
        ParcelImpl.CREATOR = new CLS13();
    }

    public ParcelImpl(Parcel parcel0) {
        this.FLD91 = new CLS805(parcel0).MTH733();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        new CLS805(parcel0).MTH720(this.FLD91);
    }
}

