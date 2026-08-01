// Decompiled by JEB v5.42.0.202606242140

package c.ʿˊ;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public abstract class CLS61 implements Parcelable {
    public static final class CLS60 implements Parcelable.ClassLoaderCreator {
        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.MTH1092(parcel0);
        }

        @Override  // android.os.Parcelable$ClassLoaderCreator
        public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
            return this.MTH1091(parcel0, classLoader0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.MTH1093(v);
        }

        public CLS61 MTH1091(Parcel parcel0, ClassLoader classLoader0) {
            if(parcel0.readParcelable(classLoader0) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return CLS61.FLD220;
        }

        public CLS61 MTH1092(Parcel parcel0) {
            return this.MTH1091(parcel0, null);
        }

        public CLS61[] MTH1093(int v) {
            return new CLS61[v];
        }
    }

    public static final class CLS417 extends CLS61 {
        public CLS417() {
            super(null);
        }
    }

    public static final Parcelable.Creator CREATOR;
    public static final CLS61 FLD220;
    public final Parcelable FLD221;

    static {
        CLS61.FLD220 = new CLS417();
        CLS61.CREATOR = new CLS60();
    }

    public CLS61() {
        this.FLD221 = null;
    }

    public CLS61(Parcel parcel0, ClassLoader classLoader0) {
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 == null) {
            parcelable0 = CLS61.FLD220;
        }
        this.FLD221 = parcelable0;
    }

    public CLS61(Parcelable parcelable0) {
        if(parcelable0 == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if(parcelable0 == CLS61.FLD220) {
            parcelable0 = null;
        }
        this.FLD221 = parcelable0;
    }

    public CLS61(CLS417 ˆٴ$ˆٴ0) {
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.FLD221, v);
    }

    public final Parcelable MTH1102() {
        return this.FLD221;
    }
}

