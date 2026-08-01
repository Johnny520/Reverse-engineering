// Decompiled by JEB v5.42.0.202606242140

package c.ˈᴵ;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public abstract class CLS56 implements Parcelable {
    public static final class CLS414 extends CLS56 {
        public CLS414() {
            super(null);
        }
    }

    public static final class CLS55 implements Parcelable.ClassLoaderCreator {
        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.MTH960(parcel0);
        }

        @Override  // android.os.Parcelable$ClassLoaderCreator
        public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
            return this.MTH961(parcel0, classLoader0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.MTH959(v);
        }

        public CLS56[] MTH959(int v) {
            return new CLS56[v];
        }

        public CLS56 MTH960(Parcel parcel0) {
            return this.MTH961(parcel0, null);
        }

        public CLS56 MTH961(Parcel parcel0, ClassLoader classLoader0) {
            if(parcel0.readParcelable(classLoader0) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return CLS56.FLD179;
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final Parcelable FLD178;
    public static final CLS56 FLD179;

    static {
        CLS56.FLD179 = new CLS414();
        CLS56.CREATOR = new CLS55();
    }

    public CLS56() {
        this.FLD178 = null;
    }

    public CLS56(Parcel parcel0, ClassLoader classLoader0) {
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 == null) {
            parcelable0 = CLS56.FLD179;
        }
        this.FLD178 = parcelable0;
    }

    public CLS56(Parcelable parcelable0) {
        if(parcelable0 == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if(parcelable0 == CLS56.FLD179) {
            parcelable0 = null;
        }
        this.FLD178 = parcelable0;
    }

    public CLS56(CLS414 ⁱˋ$ⁱˋ0) {
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.FLD178, v);
    }

    public final Parcelable MTH969() {
        return this.FLD178;
    }
}

